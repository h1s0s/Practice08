package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");
        
        //친구정보 3명 입력 로직 --> 반복문 사용
    	Friend friend01 = new Friend();
    	Friend friend02 = new Friend();
    	Friend friend03 = new Friend();
    	
        friendArray[0] = friend01;
        friendArray[1] = friend02;
        friendArray[2] = friend03;
        
        for(int i=0; i<friendArray.length; i++) {
        	String profile = sc.nextLine();
        	String[] nArray = profile.split(" ");
        	friendArray[i].setName(nArray[0]);
        	friendArray[i].setHp(nArray[1]);
        	friendArray[i].setSchool(nArray[2]);
        }
        
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
            friendArray[i].showInfo();
        }

        sc.close();
    }

}
