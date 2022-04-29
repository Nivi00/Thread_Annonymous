package com.edu;
class A extends Thread{
	public void run() {
		
	}
}

public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob=new A();
		
		System.out.println(ob.isAlive());
	}

}
