package com.edu;

class Table{
	synchronized void printTable(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n+"X"+i+"="+n*i);
		}
	}
}

public class MainApp {

	public static void main(String[] args) {
		Table t1=new Table();
		Thread tob=new Thread() {
			public void run() {
				System.out.println("Run method");
				t1.printTable(4);
				
			}
		};
		tob.start();
	
		Thread tob1=new Thread() {
			public void run() {
					System.out.println("Run method");
					t1.printTable(10);
			}
		};
				tob1.start();
		}

}
