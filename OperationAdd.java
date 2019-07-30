package com.andylifan;

/* 3. 具体运算类
这里以加减乘除四种运算为例，需要四个实现类，都继承运算类。
*/

public class OperationAdd extends Operation {

   @Override
    public double getResult() {
         double result = 0;
        result = numberA + numberB;
        return result;
    }  
 }