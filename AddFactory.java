package com.andylifan;

/* 4. ���㹤��
���ĸ������࣬����Ҫ�ĸ����㹤������ʵ���˹����ӿڡ�
*/

public class AddFactory implements IFactory {
     @Override
     public Operation createOperation() {
         return new OperationAdd();
     }
 }
