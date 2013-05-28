package ru.lev.t1005;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task {
	
	static int count;
	static int[] a;
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		count = in.nextInt();
		a = new int[count];
		boolean[] b= new boolean[count]; 
		long sum =0;
		for (int index = 0; index < count; index ++){
			a[index]=in.nextInt();
			sum+=a[index];
			b[index] = false;
		}
		long min = sum;
		while (true){
			long p = 0;
			
			//Быстро увеличиваем представление двойки на 1
			int index_b=0;
			while(index_b<count-1 && b[index_b])
				index_b++;
			//Выходим если мы дошли до конца
			if (index_b==count-1)
				break;
			b[index_b]=true;
			while(index_b>0){
				index_b--;
				b[index_b]=false;
			}
			
			//Складываем все вместе
			for(int index=0;index<count-1;index++){
				if (b[index])
					p+=a[index];
			}
			
			//Проверяем на минимум
			long d = Math.abs(sum -(2*p));
			if (d<min)
				min=d;
			
			//Выходим если мы дошли до конца
			if (p == sum)
				break;
		}
		
		out.println(min);

		out.flush();
	}
}