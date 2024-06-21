package springs;

public class Fibo {

	
	public static int fibo(int data) {
		if(data<=1) {
			return data;
		}
		int a=0,b=1,temp;
		
		for(int i=1;i<data;i++) {
			temp=a+b;
			
			a=b;
			b=temp;
		}
		return b;
	}
	
	public static void main(String[] args) {
		System.out.println(fibo(4));
	}
}
