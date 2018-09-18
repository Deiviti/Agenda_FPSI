

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String op = "";
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		ArrayList<Pessoa> listaPessoa = new ArrayList<>();
		
		
		while(!op.equals("0")) {
			
				System.out.println("  - Escolha uma opção -\n");
				System.out.println("\n\n");
				int cont = listaPessoa.size();
			    for (int x=0; x<cont; x++) {
			      System.out.printf("Cadastros realizados até o momento: %d\n",x+1, listaPessoa.get(x));
			      System.out.println("\n\n");
			    }				
			    System.out.println("1 - Incluir");  
			    System.out.println("2 - Alterar");  
			    System.out.println("3 - Excluir");  
			    System.out.println("4 - Listar");
			    System.out.println("5 - Pesquisar");
			    System.out.println("0. Sair\n");  
			    System.out.println("Digite sua opção:\n");  
			    op = teclado.nextLine();
			    
			    switch (op) {
					case "1":
						
						Pessoa umaPessoa = new Pessoa();
						System.out.println("Digite seu nome: \n");
						umaPessoa.setNome(teclado.nextLine());
						System.out.println("Digite sua idade: \n");
						String idadeSTR = teclado.nextLine();
						umaPessoa.setIdade(Integer.valueOf(idadeSTR));
						System.out.println("Digite seu telefone: \n");
						umaPessoa.setTelefone(teclado.nextLine());
						listaPessoa.add(umaPessoa);
						System.out.println("\n\n");
						System.out.println("Digite Enter para continuar \n");
						System.out.println("\n\n");
						teclado.nextLine();
						break;
	
					case "2":
						
						int contador = listaPessoa.size();
					    for (int x=0; x<contador; x++) {
					      System.out.printf("Posição %d - %s\n", x+1, listaPessoa.get(x));
					    }					    
						System.out.println("\n\n");
						System.out.println("Digite a posição da pessoa a ser Alterada:");
						int del = teclado.nextInt()-1;
						Pessoa umaPessoaAlterar = listaPessoa.get(del);
						System.out.println("Digite novo nome ("+ umaPessoaAlterar.getNome() +"):");
						umaPessoaAlterar.setNome(teclado.nextLine());
						System.out.println("Digite nova idade ("+ umaPessoaAlterar.getIdade() +"):");
						String idadenovaSTR = teclado.nextLine();
						umaPessoaAlterar.setIdade(Integer.valueOf(idadenovaSTR));
						System.out.println("Digite novo telefone ("+ umaPessoaAlterar.getTelefone() +"):");
						umaPessoaAlterar.setTelefone(teclado.nextLine());	
						System.out.println("\n\n");
						System.out.println("Digite Enter para continuar \n");
						System.out.println("\n\n");
						teclado.nextLine();
						break;
						
					case "3": 
						
						int ct = listaPessoa.size();
					    for (int x=0; x<ct; x++) {
					      System.out.printf("Posição %d - %s\n", x+1, listaPessoa.get(x));
					    }
					    System.out.println("Deseja realmente excluir um cadastro?");
					    System.out.println("Se SIM digite - 1\n\nSe NÃO digite - 2");
					    op = teclado.nextLine();
					    
					    switch(op) {
					    case "1":
					    	System.out.println("\n\n");
							System.out.println("Digite a posição da pessoa a ser excluída:");
							int delete = teclado.nextInt();												
							listaPessoa.remove(delete-1);
					    	break;
					    case "2":
					    	
					    	break;
					    }    						
						break;
						
					case "4": 
						
						for (int x=0; x< listaPessoa.size(); x++) {
					      System.out.printf("Posição %d - %s\n", x+1, listaPessoa.get(x));
					    }
						System.out.println("\n\n");
						System.out.println("Digite Enter para continuar \n");
						System.out.println("\n\n");
						teclado.nextLine();
						break;				    
					
					case "0":
						
						System.out.println("Sair");
						System.out.println("\n\n");
						System.out.println("Digite Enter para continuar \n");
						System.out.println("\n\n");
						teclado.nextLine();
						break;				
			    }		
			    
		}
		
	}
}
