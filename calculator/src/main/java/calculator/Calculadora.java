package calculator;

public class Calculadora {
	
	public int SomaInteiros(int a, int b) {
		return a + b;
	}
	public int subtrairInteiros(int a, int b) {
        return a - b;
    }
	public int multiplicarInteiros(int a, int b) {
        return a * b;
    }
	public int dividirInteiros(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Nao e possivel dividir por zero");
        }
        return a / b;
    }
	

}
