package xuanz;
import java.io.*;
public class xz3 {
	//package xz;
	
	//public class xz2 {
		
			// TODO Auto-generated method stub
			
			public static void main(String[] args) {
			String strIn = "";
			System.out.print("请输入矩阵的行列数:");
			InputStreamReader input = new InputStreamReader(System.in);
			BufferedReader buff = new BufferedReader(input);
			try {
			strIn = buff.readLine();
			} catch (IOException e) {
			System.out.println(e.toString());
			}
			int int1 = Integer.parseInt(strIn);
			int n = int1;
		
			System.out.println("这是行列数为" + n + "的数字旋转方阵:");
			int intA = 1; // 初始化
			int[][] array = new int[n][n];
			int intB;
			if (n % 2 != 0) {
			intB = n / 2 + 1; // 奇数时i循环次数
			} else
			intB = n / 2; // 偶数时i循环次数
			
			for (int j = 0; j < intB; j++) { // 从外到里循环
			// 从上到下纵
			for (int i = j; i < n - j; i++) {
			array[j][i] = intA;
			intA++;
			}
			// 从左到右横
			for (int k =j+ 1; k < n - j; k++) {
			array[k ][n - j - 1  ] = intA;
			intA++;
			}
			// 从下到上纵
			for (int l = n - j - 2; l >=j; l--) {
			array[n - j - 1][l] = intA;
			intA++;
			}
			//从右到左横 
			for (int m = n - j - 2; m > j; m--) {
			array[m][j] = intA;
			intA++;
			}
			}
			// 输出数组
			for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
			System.out.print(array[j][i] + " ");
		
			}
			
			System.out.println();
			} }
		


	}


