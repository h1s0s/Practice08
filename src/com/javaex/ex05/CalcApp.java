package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	int a = 0;
    	int b = 0;
    	while(true) {
        	System.out.print(">>");
        	String num = sc.nextLine();
    			if(num.equals("/q")) {
    				System.out.println("종료합니다");
    				break;
    			} else {
    				String nArray[] = num.split(" ");//공백을 기준으로 한 배열을 입력받음
    				switch(nArray[1]) {
    					case "+":
    						a = Integer.parseInt(nArray[0]);
        					b = Integer.parseInt(nArray[2]);
        					Add c0 = new Add();
        					c0.setValue(a, b);
        					System.out.println(c0.calculate());
    						break;
    					case "-":
    						a = Integer.parseInt(nArray[0]);
        					b = Integer.parseInt(nArray[2]);
        					Div c1 = new Div();
        					c1.setValue(a, b);
        					System.out.println(c1.calculate());
    						break;
    					case "*":
    						a = Integer.parseInt(nArray[0]);
        					b = Integer.parseInt(nArray[2]);
        					Mul c2 = new Mul();
        					c2.setValue(a, b);
        					System.out.println(c2.calculate());
    						break;
    					case "/":
    						a = Integer.parseInt(nArray[0]);
        					b = Integer.parseInt(nArray[2]);
        					Sub c3 = new Sub();
        					c3.setValue(a, b);
        					System.out.println(c3.calculate());
    						break;
    					default :
    						System.out.println("알 수 없는 연산입니다.");
    						break;
    				}
    			}
    	}
    	sc.close();
    }
  }