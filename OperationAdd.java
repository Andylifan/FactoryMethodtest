package com.andylifan;

/* 3. ����������
�����ԼӼ��˳���������Ϊ������Ҫ�ĸ�ʵ���࣬���̳������ࡣ
*/

public class OperationAdd extends Operation {

   @Override
    public double getResult() {
         double result = 0;
        result = numberA + numberB;
        return result;
    }  
 }