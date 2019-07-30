package com.andylifan;

//5. Client¿Í»§¶Ë

public class FactoryClient {

 public static void main(String[] args) {
      IFactory oFactory = new AddFactory();
//        IFactory oFactory = new SubFactory();
//        IFactory oFactory = new MulFactory();
//        IFactory oFactory = new DivFactory();
       
       Operation operation = oFactory.createOperation();
         
       operation.numberA = 5;
       operation.numberB = 7;
         
       double result = operation.getResult();
       System.out.println(result);
     }    
 }
