package Controlstatements;

import java.util.Scanner;

public class araysss {

	public static void main(String[] args) {
		String arr[] []=new String[3] [2];
		Scanner sc=new Scanner (System.in);
		System.out.println("enter ur names");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr[i] [j]=sc.next();
				
			}
			System.out.println("entered values");
			for(int I=0;i<3;i++)
			{
				for (int j=0;j<2;j++)
				{
					System.out.println(arr[i][j]+ " ");
				}
				System.out.println();
			}
		}

	}

}
