package BeforeJava8LambdaExpression;

public class BeforeJava8LambdaExpression {
	
		public int fonk(int a,int b,Anonim anonim) {
			return anonim.call(a,b) * 2;
		}

	
	public static void main(String[] args) {
		
		BeforeJava8LambdaExpression app = new BeforeJava8LambdaExpression();
		
		app.fonk(2, 3,new Anonim(){
			public int call(int a,int b) {
				return a+b;
			}
		});
		
		
	
	}

}
