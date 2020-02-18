public class myVisitor extends HelloBaseVisitor<Integer> {


	int line_counter = 0;
	boolean error_found = false;
	
	public Integer visitDeclaration(HelloParser.DeclarationContext poc){
		line_counter++;
		
		String gate = poc.children.get(0).getText();
		
		if(!gate.equals("NOT") || !gate.equals("AND") || !gate.equals("OR") || !gate.equals("XOR")){
			System.err.println("ERROR in line "+line_counter+": gate with given name '"+gate+"' does not exist");
			error_found = true;
		}
		
		return null;
	}
	
	//XOR, OR, AND OPERATIONS
	public Integer visitOperation(HelloParser.OperationContext poc) {
		line_counter++;

		if(error_found)
			return null;
		
		boolean singleOperation = true;
		boolean doubleOperation = false;
		boolean tripleOperation = false;
		
		boolean leftGateDetected = false;
		boolean rightGateDetected = false;
		
		String[] splitGate;
		String secondGate = "";
		String thirdGate = "";
		
		
		
		String gateName = poc.children.get(0).getText();
		String leftInput = poc.children.get(2).getText();
		String rightInput = "";
		
		System.out.println("gateName: "+ poc);
		
		switch(leftInput){
			case "true":
				leftInput = "1";
				break;
			case "false":
				leftInput = "0";
			default:
				break;
		}
		switch(rightInput){
		case "true":
			rightInput = "1";
			break;
		case "false":
			rightInput = "0";
		default:
			break;
	}
		
		if(!gateName.equals("NOT"))
			rightInput = poc.children.get(4).getText();
		
		System.out.println("\n\n-line executed: "+line_counter+"----------------------------------------------\n");
		
		System.out.println("first gate: -"+ gateName+"-");
		
		if(!gateName.equals("NOT")){
			System.out.println("\nleft: "+leftInput);
			System.out.println("right: "+ rightInput);
		}
		else
			System.out.println("\ninput: "+leftInput);
		
		//ERROR OUTPUTS
		if(!gateName.equals("NOT") && (leftInput.length() != rightInput.length())){
			System.err.println("ERROR in line "+line_counter+": the input lengths do not match - left input given: '"+leftInput+"' , right input given: '"+rightInput+"'");
			error_found = true;
			return null;
		}
		
		
		//This will be used to check how many gates exist in the user's given operation
		String[] gates = new String[4];
		gates[0] = "AND";
		gates[1] = "XOR";
		gates[2] = "OR";
		gates[3] = "NOT";
		

		//Check whether the input contains a parenthesis - That means that the input is a Gate
		if(leftInput.contains("(") || rightInput.contains("(")){
			if(leftInput.contains("(")){
				splitGate = leftInput.split("\\(");
				secondGate = splitGate[0];
				System.out.println("\nsecond gate: -"+ secondGate+"-");
			}
			if(rightInput.contains("(")){
				splitGate = rightInput.split("\\(");
				thirdGate = splitGate[0];
				
				System.out.println("third gate: -"+ thirdGate+"-");
			}
		}
			
		//Check how complex is the operation
		for(int i = 0; i < gates.length; i++){
			if(secondGate.equals(gates[i]) || thirdGate.equals(gates[i])){
				singleOperation = false;
				
				//inner left input is a logical gate
				if(secondGate.equals(gates[i]) && !thirdGate.equals(gates[i])){
					doubleOperation = true;
					singleOperation = false;
					leftGateDetected = true;
					
					//System.out.println("\n=>DOUBLE OPERATION DETECTED - left input = Gate: "+secondGate);
				}
				//inner right input is a logical gate
				else if(!secondGate.equals(gates[i]) && thirdGate.equals(gates[i])){
					doubleOperation = true;
					singleOperation = false;
					rightGateDetected = true;
					//System.out.println("\n=>DOUBLE OPERATION DETECTED - right input = Gate: "+thirdGate);
				}
				//both inner left and inner right gates are the same
				else if(secondGate.equals(gates[i]) && thirdGate.equals(gates[i])){
					doubleOperation = false;
					singleOperation = false;
					leftGateDetected = true;
					rightGateDetected = true;
					//System.out.println("\n=>DOUBLE OPERATION DETECTED - right input = Gate: "+thirdGate);
				}
			}
			else
				singleOperation = true;
			//Both left and right inputs are gates
			if(leftGateDetected == true && rightGateDetected == true){
				tripleOperation = true;
				doubleOperation = false;
				singleOperation = false;
				//System.out.println("\n=>TRIPLE OPERATION DETECTED - left input = "+secondGate + " | right input: "+thirdGate);
				break;
			}
				
		}
		
/*		System.out.println("\n\nsingle op: "+singleOperation);
		System.out.println("double op: "+doubleOperation);
		System.out.println("triple op: "+tripleOperation);
	*/	
		

		//SINGLE OPERATION: eg. XOR(110,011)
		if(singleOperation == true){
			String re="";
			//Applies to XOR, AND, OR
			if(!gateName.equals("NOT"))
				re = process_single_op(gateName, leftInput, rightInput);
			//Applies to NOT
			else if (gateName.equals("NOT") && (leftInput.length() == 1 || leftInput.equals("true") || leftInput.equals("false"))){
				rightInput = "0";
				re = process_single_op(gateName, leftInput, rightInput);
			}
			else
				System.err.println("The input length must not exceed 1 binary number OR must be writen as 'true' or 'false'");
			System.out.println("\nResult: "+re);
		}
		
		
		
		//results of all gates
		String result_inner_left = ""; //left inner gate in the operation
		String result_inner_right = "";//right inner gate in the operation
		String final_result = "";
		String temp_inner_left = "";
		String temp_inner_right = "";
		
		//all the gate names and inputs (left & right of each one)
		String gateName_1 = gateName;
		String leftInput_1 = leftInput;
		String rightInput_1 = rightInput;
		
		String gateName_2 = "";
		String leftInput_2 = "";
		String rightInput_2 = "";
		
		String gateName_3 = "";
		String leftInput_3 = "";
		String rightInput_3 = "";
		
		//DOBULE OPERATION: eg. XOR(AND(111,001),011)
		if(tripleOperation || doubleOperation){
			
			//inner left gate: eg. XOR( XOR(), ...)
			if(leftGateDetected){
				//System.out.println("\ninner left gate DETECTED");
				//get left inner gate
				gateName_2 = poc.children.get(2).getText();
				String[] splitGate_2 = gateName_2.split("\\(");
				String gate2 = splitGate_2[0];
				
	/*			//get left inner input
				leftInput_2 = poc.children.get(2).getText();
				String[] splitLeft2 = splitGate_2[1].split("\\,");
				String left2 = splitLeft2[0];
				
				//get right inner input
				rightInput_2 = poc.children.get(4).getText();
				String[] splitRight = splitLeft2[1].split("\\)");
				String right = splitRight[0];
	*/			
				
				String left2 = "";
				String right2 = "";
				
				if(!gate2.equals("NOT")){
					//get left inner input
					leftInput_2 = poc.children.get(2).getText();
					String[] splitLeft2 = splitGate_2[1].split("\\,");
					left2 = splitLeft2[0];
					
					//get right inner input
					rightInput_2 = poc.children.get(4).getText();
					String[] splitRight2 = splitLeft2[1].split("\\)");
					right2 = splitRight2[0];
				}
				else{
					//get (NOT gate) input
					String[] temp_not_input = splitGate_2[1].split("\\)");
					leftInput_2 = temp_not_input[0];
					left2 = leftInput_2;
					right2 = "0";
					
				}
				result_inner_left = process_single_op(gate2, left2, right2);
				temp_inner_left = String.valueOf(result_inner_left);
				System.out.println("\ninner left gate result =  " + result_inner_left);
			}
			else{
				
				temp_inner_left = poc.children.get(2).getText();
				System.out.println("\ninner left input =  " + temp_inner_left);
			}
			
			//inner right gate: eg. XOR( ..., XOR())
			if(rightGateDetected){
				//get left inner gate
				gateName_3 = poc.children.get(4).getText();
				String[] splitGate_3 = gateName_3.split("\\(");
				String gate3 = splitGate_3[0];				
				
				String left3 = "";
				String right3 = "";
				
				if(!gate3.equals("NOT")){
					//get left inner input
					leftInput_3 = poc.children.get(2).getText();
					String[] splitLeft3 = splitGate_3[1].split("\\,");
					left3 = splitLeft3[0];
					
					//get right inner input
					rightInput_3 = poc.children.get(4).getText();
					String[] splitRight3 = splitLeft3[1].split("\\)");
					right3 = splitRight3[0];
				}
				else{
					//get (NOT gate) input
					String[] temp_not_input = splitGate_3[1].split("\\)");
					leftInput_3 = temp_not_input[0];
					left3 = leftInput_3;
					right3 = "0";
				}
				
				result_inner_right = process_single_op(gate3, left3, right3);
				
				temp_inner_right = String.valueOf(result_inner_right);
				System.out.println("inner right gate result =  " + result_inner_right);
				
			}
			//right inner input is not a gate
			else if (!rightGateDetected){
				temp_inner_right = poc.children.get(4).getText();
				System.out.println("inner right input =  " + temp_inner_right);
			}
			
			//CALCULATE THE FINAL RESULT
			final_result = process_single_op(gateName, temp_inner_left, temp_inner_right);
			singleOperation = false;
			doubleOperation = false;
			tripleOperation = false;
			leftGateDetected = false;
			rightGateDetected = false;
			
			System.out.println("\n\nfinal result =  " + final_result+"\n\n");
		
		}
	
		return null;
	}
	
	
	
	
	
	
	
	public String process_single_op(String gateName, String leftInput, String rightInput){
		int left = Integer.parseInt(leftInput);
		int right = Integer.parseInt(rightInput);
		int result = 0;
		//System.out.println(rightInput);
//		System.out.println("\ngate: " + gateName + "\nleft input: " + leftInput + "\nright input: " + rightInput);
		
		if(!gateName.equals("NOT")){
			//The inputs have identical lengths
			if(leftInput.length() == rightInput.length()){
				switch(gateName){
				case "XOR":
					result = left ^ right;
	//				System.out.println("\n"+gateName +" operation (" + leftInput + ", " + rightInput + ") => result: " + result);
					break;
				case "OR":
					result = left | right;
	//				System.out.println("\n"+gateName +" operation (" + leftInput + ", " + rightInput + ") => result: " + result);
					break;
				case "AND":
	//				System.out.println("\n"+gateName);
					result = left & right;
	//				System.out.println("\n"+gateName +" operation ("  + leftInput + ", " + rightInput + ") => result: " + result);
					break;
				default:
					break;
				
				}
			}
			//The inputs have different lengths
			else{
				System.err.println("Values error: The input lengths do not match - The two input values must have identical lengths");
			}
		}
		else if(gateName.equals("NOT")){
			switch (leftInput){
			case "1":
				result = 0;
				break;
			case "0":
				result = 1;
				break;
			default:
				break;
			}
		}
		
		String res = leftPadding(leftInput.length(), result);
		return res;
		
	}
	
	//Adding 0's to the result, as integers ignore the first 0's in the number
	//eg. transforming "10" into "010", as intended 
	public static String leftPadding(int padding, int number){
		return String.format("%0" + padding + "d", number);
		
	}
	/*
	//NOT OPERATION
	public Integer visitNot_operation(HelloParser.Not_operationContext poc) {
		String gateName = poc.children.get(0).getText();
		String input = poc.children.get(2).getText();
		int result = 0;
		
		switch (input){
			case "1":
				result = 0;
				break;
			case "0":
				result = 1;
				break;
			default:
				break;
		}
		
		System.out.println("\n"+gateName +" operation ("  + input + ") => result: " + result);
		return null;
	}*/
	
}
