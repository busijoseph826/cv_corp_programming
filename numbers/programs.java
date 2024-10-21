/* 1. Write a java program to print factors count of a given number*/

import java.util.Scanner;

class Sample {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int c = 0;
	for(int i=1;i<=n;i++){
		if(n%i==0)
			c++;
	}
	System.out.print(c);
    }
}
