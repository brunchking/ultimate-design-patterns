package com.ultimate.patterns.strategy;

import com.ultimate.patterns.strategy.domain.MathOperation;

public class Strategy {

	MathOperation mathOperation;
	
	public void execute() {
		this.mathOperation.operate();
	}
	
	public void setStrategy(MathOperation mathOperation) {
		this.mathOperation = mathOperation;
	}
}
