package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {


	public static List<Integer> fibonacci() {

		List<Integer> fibo_array = new ArrayList();
		fibo_array.add(0);
		fibo_array.add(1);

		for (int i= 2;fibo_array.get(fibo_array.size() - 1) <350;i++ ){
			fibo_array.add(fibo_array.get(i-1)+fibo_array.get(i-2));
			System.out.println(fibo_array.get(fibo_array.size() - 1) );
		}

		return fibo_array;
	}

	public static Boolean isFibonacci(Integer a) {
		return fibonacci().contains(a);
	}

}