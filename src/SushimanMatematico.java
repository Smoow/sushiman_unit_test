import java.util.ArrayList;
import java.util.Scanner;

public class SushimanMatematico {
	
	public static boolean ehPrimo(int n){
		// retorna true se n for primo e false caso contrario.
		if (n<2) return false;
		for (int i=2; i<=(n/2); i++){ //veja se vc entende porque estou usando n/2 aqui...
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
	
	public static ArrayList<Integer> getPrimos(int num){
		// Retorna todos os primos que iniciam com num
		// Por exemplo, se num = 23 retorna todos os primos
		// entre 230 e 239 em um ArrayList de Inteiros.
		ArrayList<Integer> vPrimos = new ArrayList<Integer>();
		for (int i=(num*10);i<=(num*10+9);i++){
			if(ehPrimo(i)){
				vPrimos.add(i);
			}
		}
		return vPrimos;
	}
	
	public static ArrayList<Integer> getSuperPrimos(int nDigitos){
		ArrayList<Integer> superPrimos = new ArrayList<Integer>();
		
		superPrimos = getPrimos(0); // Pega o primeiro conjunto de primos entre 0 e 9.
		for (int i=2; i<=nDigitos; i++){
			// Repete para cada quantidade de digitos
			ArrayList<Integer> temp2 = new ArrayList<Integer>();

			for(Integer primo : superPrimos){
				ArrayList<Integer> temp1 = new ArrayList<Integer>();
				temp1 = getPrimos(primo); // Pega o conjunto de primos que inicia com o primo atual.
				temp2.addAll(temp1); // Adiciona o conjunto de primos na variavel temp2
			}
			superPrimos = new ArrayList<Integer>();
			superPrimos.addAll(temp2); 	// Limpa e adiciona para garantir que o resultado tem apenas 
										// numeros com a mesma quantidade de digitos
		}
		return superPrimos;
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Super Primos de quantos digitos?: ");
		int nDigitos = teclado.nextInt();
		for(Integer i : getSuperPrimos(nDigitos)){
			System.out.println(i);
		}
		System.out.println("end");
	}

}
