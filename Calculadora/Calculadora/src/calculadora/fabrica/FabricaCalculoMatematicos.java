package calculadora.fabrica;

import calculadora.classes.Adicao;
import calculadora.classes.Divisao;
import calculadora.classes.Multiplicacao;
import calculadora.classes.Potenciacao;
import calculadora.classes.Subtracao;
import calculadora.interfaces.CalculadorMatematico;

public class FabricaCalculoMatematicos {
	
	public CalculadorMatematico criarCalculador (int numero1, int numero2, String calculo) {
	if (calculo.equals("+")) {
		return new Adicao(numero1, numero2);
	} else if (calculo.equals("-")) {
		return new Subtracao(numero1, numero2);
	} else if (calculo.equals("*")) {
		return new Multiplicacao(numero1, numero2);
	} else if (calculo.equals("/")) {
		return new Divisao(numero1, numero2);
	} else if (calculo.equals("^")) {
		return new Potenciacao(numero1, numero2);
	} else {
		return null;
	}
}
}