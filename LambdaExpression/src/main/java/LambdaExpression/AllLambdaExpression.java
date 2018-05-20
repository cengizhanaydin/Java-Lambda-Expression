package LambdaExpression;

import java.util.function.Function;

public class AllLambdaExpression {
	
	public void executeAnonim(Anonim anonim) {
		anonim.call();
	}
	
	public String executewithoutInterface(String string,Function <String,String> fn) {
		
		return fn.apply(string);
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
		
		// Burda sadece fonksiyon kullanıyoruz.Interface kullanımı yok yukardaki örnekler gibi.
		Function<String,String> fn = parameter -> parameter + " Hello!!";
		
		String result = expression.executewithoutInterface("Adam", fn);
		System.out.println(result);
		expression.executeAnonim(executeLambdaExpresion);
		expression.executeAnonim(executeInterface);
		
	}
}
	
