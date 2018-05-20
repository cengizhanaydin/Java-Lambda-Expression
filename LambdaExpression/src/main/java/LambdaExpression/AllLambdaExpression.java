package LambdaExpression;

public class AllLambdaExpression {
	
	public void executeAnonim(Anonim anonim) {
		anonim.call();
	}

	public static void main(String[] args) {
		
		AllLambdaExpression expression = new AllLambdaExpression();
		
		Anonim executeLambdaExpresion = () -> System.out.println("Hello World!");
		
		Anonim executeInterface = new Anonim() {
			
			@Override
			public void call() {
				System.out.println("Hello World!");
				
			}
		};
		
		expression.executeAnonim(executeLambdaExpresion);
		expression.executeAnonim(executeInterface);
		
	}
}
	
