package Java8LambdaExpression;

public class Java8LambdaExpression {

	public int func(int a,int b,Anonim anonim) {
		
		return anonim.call(a, b) * 5;
		
	}
	
	public static void main(String[] args) {
		Java8LambdaExpression app = new Java8LambdaExpression();
		
		int sonuc = app.func(2, 4, (a,b) -> a+b); // Tek satır için return yapmaya gerek yok.
		
		System.out.println(sonuc); // func metodunun sonucunu yazdırır.
	}

}
