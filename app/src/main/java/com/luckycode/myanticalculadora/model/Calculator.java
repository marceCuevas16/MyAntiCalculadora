package com.luckycode.myanticalculadora.model;

import com.udojava.evalex.Expression;

/**
 * Created by marcelocuevas on 9/18/17.
 */

public class Calculator {

    public static long calculateExpression(String expression) {
        return new Expression(expression).eval().longValueExact();
    }


}
