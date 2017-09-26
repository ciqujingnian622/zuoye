package diz;
import javax.swing.JOptionPane;
public class diyi{
	public static void main(String[] args) {
		
				// TODO Auto-generated method stub
		
				int n = Integer.parseInt(JOptionPane.showInputDialog("请输入一个小于5000的整数："));
				recursion(n);
				}
				public static void recursion(int n){
					
				if(n<=0||n>5000){
				JOptionPane.showMessageDialog(null, "输入错误");
				}else{
					
				chengfa(n,n);
				}
				}
				public static int chengfa(int i,int n)
				{//i作为可变参数，n为参照
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


