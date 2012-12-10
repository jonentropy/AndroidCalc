package com.tal.calculator;

public class Calculator {
	private double resultsBuffer;
	private double inputBuffer;
	private Operation selectedOp;
	
	public Calculator(){
		//initialise buffers and op to identity (in=out)
		clearAllBuffers();
	}
	
	//Clear methods...
	public void clearInputBuffer(){
		inputBuffer = 0.0d;
	}
	
	public void clearAllBuffers(){
		inputBuffer = 0.0d;
		resultsBuffer = 0.0d;
		selectedOp = Operation.OP_IDENTITY;	
	}
	
	public void setInputBuffer(double val){
		inputBuffer = val;
	}
	
	public void setOperation(Operation o){
		selectedOp = o;
	}
	
	public void reInitResults(){
		inputBuffer = resultsBuffer;	
		resultsBuffer = 0.0d;
		selectedOp = Operation.OP_IDENTITY;	
	}
		
	public double getResult(){
	
		double answer = resultsBuffer;
		
		switch(selectedOp){
		case OP_IDENTITY: answer = inputBuffer;
						  break;
		
		case OP_ADD: answer = resultsBuffer + inputBuffer; 
					 break;
		
		case OP_SUBTRACT: answer = resultsBuffer - inputBuffer; 
						  break;
						  
		case OP_MULTIPLY: answer = resultsBuffer * inputBuffer; 
						  break;
						  
		case OP_DIVIDE: answer = resultsBuffer / inputBuffer; 
						break;
				
		}

		resultsBuffer = answer;
		return resultsBuffer;
	}
}
