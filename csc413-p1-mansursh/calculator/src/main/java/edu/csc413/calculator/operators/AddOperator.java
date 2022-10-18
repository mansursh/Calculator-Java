package edu.csc413.calculator.operators;

import edu.csc413.calculator.evaluator.Operand;

public class AddOperator extends Operator {

    @Override
    public int priority() {
        return 1;
    }
    public Operand execute(Operand operandOne, Operand operandTwo){
        System.out.println(operandOne);
        System.out.println(operandTwo);
        return new Operand(operandOne.getValue()+ operandTwo.getValue());
    }
}
