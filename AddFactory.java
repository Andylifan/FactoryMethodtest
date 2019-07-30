package com.andylifan;

/* 4. 运算工厂
有四个运算类，就需要四个运算工厂，都实现了工厂接口。
*/

public class AddFactory implements IFactory {
     @Override
     public Operation createOperation() {
         return new OperationAdd();
     }
 }
