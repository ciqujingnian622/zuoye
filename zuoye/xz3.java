package xuanz;
import java.io.*;
public class xz3 {
	//package xz;
	
	//public class xz2 {
		
			// TODO Auto-generated method stub
			
			public static void main(String[] args) {
			String strIn = "";
			System.out.print("����������������:");
			InputStreamReader input = new InputStreamReader(System.in);
			BufferedReader buff = new BufferedReader(input);
			try {
			strIn = buff.readLine();
			} catch (IOException e) {
			System.out.println(e.toString());
			}
			int int1 = Integer.parseInt(strIn);
			int n = int1;
		
			System.out.println("����������Ϊ" + n + "��������ת����:");
			int intA = 1; // ��ʼ��
			int[][] array = new int[n][n];
			int intB;
			if (n % 2 != 0) {
			intB = n / 2 + 1; // ����ʱiѭ������
			} else
			intB = n / 2; // ż��ʱiѭ������
			
			for (int j = 0; j < intB; j++) { // ���⵽��ѭ��
			// ���ϵ�����
			for (int i = j; i < n - j; i++) {
			array[j][i] = intA;
			intA++;
			}
			// �����Һ�
			for (int k =j+ 1; k < n - j; k++) {
			array[k ][n - j - 1  ] = intA;
			intA++;
			}
			// ���µ�����
			for (int l = n - j - 2; l >=j; l--) {
			array[n - j - 1][l] = intA;
			intA++;
			}
			//���ҵ���� 
			for (int m = n - j - 2; m > j; m--) {
			array[m][j] = intA;
			intA++;
			}
			}
			// �������
			for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
			System.out.print(array[j][i] + " ");
		
			}
			
			System.out.println();
			} }
		


	}


