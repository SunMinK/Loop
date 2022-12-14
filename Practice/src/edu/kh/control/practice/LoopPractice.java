package edu.kh.control.practice;

import java.util.Scanner;



public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.println("1이상의 숫자를 입력하세요 :");
		
		int input = sc.nextInt();
		
		if(input > 0) {
			for(int i = 1; i <= input; i++) {
				System.out.print(i);
			}
			}else {
				System.out.print("1이상 입력");
				
			}
		}
	public void practice2() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		
	if(input > 0) {
		for(int i = 1; input >= 1; input-- ) {
			System.out.print(input);
		}
	    }else { 
			System.out.print("1이상의 숫자를 입력해주세요.");
	 }
			
   }
	public void practice3() {
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		
		int sum = 0;
		for(int num = 1; num <= input; num++) {
			sum += num;
			
		}System.out.println(sum);
		
		
	}
	
	
	public void practice4() { 
		System.out.print("첫번째 숫자: ");
		int a = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int b = sc.nextInt();
		
	if(a > 0) {
		if(b > 0) {
			if(a > b) {
				for(int i = b; i <= a; i++) {
					System.out.print(" " + i + " ");
				}
			}else if(b > a) {
				for(int i = a; i<= b; i++) {
					System.out.print(i);
				}
			}else {
				
				
			}
			
		    }else {
			System.out.print("1이상의 숫자를 입력해주세요.");
		}
	        }else {
		    System.out.print("1이상의 숫자를 입력해주세요.");
	  }
   } 
	
	
	public void practice5() {
		System.out.print("숫자 : " );
		int n = sc.nextInt();
		
	    int i = 1;
		
	if(9 >= n) {
		System.out.println("==== " + n +"단 ====");
		
		if(1 < n) {
			
		   for(i = 1; 9 >= i  ; i++) {		     
			   System.out.println(n + " * " + i + " = " + n * i);
		}
		   
	    }
			
	    }else {
	    	
	    }
		   
	
		} 
	

	public void practice6() {
		System.out.print(" 숫자 : ");
		int dan = sc.nextInt();
		
		if(dan <= 1 || dan >= 10) {
			System.out.print("2~9까지 입력해주세요.");
		}
		else {
			for(; 10 > dan; dan++) {
				System.out.println();
				System.out.println("=====" + dan + "단 =====" );				
			for(int e = 1; 10 > e; e++ ){
				System.out.println();
				System.out.printf("%d  * %d  =  %d", dan, e, dan*e);
				
			}
			
		}
		}
				 
	}
	
	
	
	public void practice7() {

		System.out.print(" 정수 입력 : ");
		int n = sc.nextInt();
		
		
		for(int i = 1; i >= n; i++ ) {
			for(int j = 0; i > j; j++) { // 별이 어떻게 늘어나는가? 				
			System.out.print("*");       // 예를들어 * 2개라 치면 * 2번 출력되고 끝남(false) 
			}
			System.out.println("");      // 2번째 for문이 false가 되기전까진 반복함
		}     						     // 그러다 flase가 되면 끝나고 1번째 for문 작동
		                                 // 위에 설명대로 작동하다 1번째 포문 false되면 식 종료
	}
	
	
	
	
	public void practice8() {
		System.out.print("정수 입력 :");
		int n = sc.nextInt();
	  
		
	
		for(int i = 1; i <= n; n--) {
			for(int j = 1; j<=n; j++ ) {
				System.out.print("*");
			} 
			System.out.println();
		}
		
	}
	
	
	
	
	public void practice9() {
		System.out.print("정수입력 :");
		int n = sc.nextInt();
			
		
		for(int i = 1; i<=n; i++) {
			for(int e = 1; e<=n-i; e++) {//줄개수
				System.out.print(" ");
			}
			for(int s = 1; s<=i; s++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
	
	
	public void practice10 () {
		
		System.out.print("정수 입력: ");
		int n = sc.nextInt();
		
		
		
		for(int i = 1; i <= n; i++) {
			for(int star = 1; star <= i; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i <=n; i++) { // 줄 수
			for(int s = i; s <= n-1; s++) { // 별 수
				System.out.print("*");
			}
			
			System.out.println();
		}
			
	
		
		
	}	
	
	
	
	public void practice11() {		
		System.out.print("정수 입력: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			for(int space = 1; space <= n-i; space++) {
				System.out.print(" ");
			}
			for(int star = 1; star <= (i*2)-1; star++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		
		
		
			
		
	}	
	public void practice12() {
		System.out.print("정수 입력:");
		int n = sc.nextInt();
		
		
		for(int i = 1; i<=n; i++) {
			if(i == 1 || i == n) {
				for(int star = 1; star <=n; star++) {
					System.out.print("*");
				}
			}
			else {
				System.out.print("*");
				for(int space = 1; space <= (n-2); space++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
	
	public void practice13() {
		System.out.print("정수 입력 :");
		int input = sc.nextInt();
		
		int a = 0;
		
		for(int i = 1; i<=input; i++) {
			if((i % 2 ==0)||(i % 3 ==0)){
				System.out.print(i + " ");
				
			}
			if(i % 6 == 0) {
				a++;	
			}
			else {
				
			}
		}
		System.out.println("count :" + a);
	}
}
	
	
	
	

	 
	
	
	
		
		
	
			    	

					

			    
		    	
				
				
			    
					
			
		
	 


		
	




	
	
