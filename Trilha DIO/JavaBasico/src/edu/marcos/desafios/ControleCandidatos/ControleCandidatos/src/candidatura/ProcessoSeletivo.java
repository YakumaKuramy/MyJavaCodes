package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
		for (String candidato: candidatos) {
			entrandoEmContato(candidato);
		}
	}
	//criação do metodo de numero de tentativas para ligar para o candidato0
	static boolean atender() {
		return new Random().nextInt(3)==1;
	}
	
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		do {
			 atendeu = atender();
			 continuarTentando =  !atendeu;
			 if (continuarTentando) {
				 tentativasRealizadas++;
			 }
			 else {
				 System.out.println("CONTATO REALIZADO COM SUCESSO");
			 }
		} 
		while (continuarTentando && tentativasRealizadas < 3); {
			if (atendeu) {
				System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
			}
			else {
				System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + " NUMERO MAXIMO DE TENTATIVAS " + tentativasRealizadas + " REALIZADAS");
			}
		}
	}
	
	static void impressaoCandidatos () {
		//criação de uma lista de exemplo, futuramente farei a troca para elementos já criados na parte seguinte do codigo 
		String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
		//impressão ilustrativa
		System.out.println("Imprimindo a lista de candidatos informando o indice de cada elemento");
		for (int indice = 0; indice < candidatos.length; indice++) {
			System.out.println("O candidato de nº " + (indice + 1) + " é " + candidatos[indice]);
		}
		//impressão ilustrativa
		System.out.println("Forma abreviada, uso de for 'each' ou seja, sem a uso de um indice");
		//for simplificado e sem uso de indice declarado
		for (String candidato: candidatos) {
			System.out.println("O candidato selecionado foi: " + candidato);
		}
	}
	
	//criação do metodo de escolha dos candidatos
	static void selecaoCandidatos() {
		//futuramente vou implementar as funções de entrada de nomes de candidatos e seus respectivos valores de salario
		//criação da lista contendo os candidatos
		String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
		//candidato selecionado no momento
		int candidatosSelecionados = 0;
		//candidato atual no loop
		int candidatoAtual = 0; //variavel de controle (indice do array)
		//loop para analise de candidatos 
		double salarioBase = 2000.0;
		//metodo para definir limites para o while
		//enquanto a quantidade de candidatos for menor que 5 (proposto pela questão) e não ultrapassar a quantidade de candidatos total
		while (candidatosSelecionados < 5 && candidatoAtual <  candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			//criação do valor do salario pretendido por cada candidato usando como base o valorPretendido (ver metodo a baixo)
			double salarioPretendido = valorPretendido();
			//saida ilustrativa para saber que o candidato pediu um valor acima do valor base proposto
			System.out.println("O candidato " + candidato + " solicitou este valor de salario " + salarioPretendido);
			//comparação entre o valor de salario base e o valor pedido pelo candidato
			if (salarioBase >= salarioPretendido) {
				//saida para aprensetar que o candidato, se entrou nessa condição foi devidamente selecionado 
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
				//adiação para saber se a quantidade de candidatos ultrapassou a quantidade pedida 
				candidatosSelecionados++;
			}
			//adição de um para fazer o loop rodar 
			candidatoAtual++;
		}
	}
	//criação de um valor aleatorio para simular os salarios dos candidatos
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800,2200);
	}
	//metodo para analise de candidatos, contendo como parametro o salario pretendido pelo candidato
	static void analisarCandidato(double salarioPretendido) {
		//criação do valor de salario base para comparação com o salario pedido pelo candidato
		double salarioBase = 2000.0;
		//logica de seleção simples baseada na seleção por comparação entre o valor salarioBase e salarioPretendido
		if(salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA CANDIDATO");
		}
		else if (salarioBase == salarioPretendido) {
			System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
		}
		else {
			System.out.println("AGURADANDO RESULTADO DOS DEMAIS CANDIDATOS");	
		}
	}
}
