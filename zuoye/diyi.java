package diz;
import javax.swing.JOptionPane;
public class diyi{
	public static void main(String[] args) {
		
				// TODO Auto-generated method stub
		
				int n = Integer.parseInt(JOptionPane.showInputDialog("������һ��С��5000��������"));
				recursion(n);
				}
				public static void recursion(int n){
					
				if(n<=0||n>5000){
				JOptionPane.showMessageDialog(null, "�������");
				}else{
					
				chengfa(n,n);
				}
				}
				public static int chengfa(int i,int n)
				{//i��Ϊ�ɱ������nΪ����
				if(i>5000){
				System.out.println(i);
				chufa(i,n);
				}
				else
				{
				System.out.println(i);
				chengfa(i*2,n);
				}
				
				return i*2;
				}
				public static int chufa(int i,int n){
				if(i<n)
				{
				return i;
				}
				else
				{
				System.out.println(i);
				chufa(i/2,n);
				}
				return i/2;
				}
	}


