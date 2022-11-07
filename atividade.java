"# atividade" 

1. package atividade1;
import java.util.Scanner;
public class atividade1 {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
    int n = 10;
    int[] A = new int[n], B = new int[n], C = new int[n];
    int i=0;
    

        for (i = 0; i < n; i++) {
        System.out.print("Digite qual valor para A: ");
        A[i] = entrada.nextInt();
       
        System.out.print("Digite qual valor para B: ");
        B[i] = entrada.nextInt();
        }for (i = 0; i < n; i++) {
            C[i] = A[i] - B[i];
        }
        for (i = 0; i < n; i++) {
            System.out.println("Os números de c é: " + C[i]);
        }
    }
 }

2. package atividade2;
   import java.util.Scanner;
   public class atividade2 {
	  public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = 0;
        System.out.print("Quantas pessoas vão ser cadastradas?");
        n = entrada.nextInt();
        int [] telefone = new int [n];
        String [] nome = new String [n];
        String busca;
        boolean naoExiste=true;
        
        for(int i = 0; i < n; i++) {
        	System.out.print("Digite o número de telefone: ");
        	telefone[i] = entrada.nextInt();
        	System.out.print("Digite o nome:");
        	nome[i] = entrada.next();
        } System.out.print("Qual o nome da pessoa que você deseja, o número?");
           busca = entrada.next();
           for(int i = 0; i < n; i++) {
        	   if(busca.equals( nome[i])) {
        		   System.out.println(nome[i]);
                   System.out.println(telefone [i]);
                   naoExiste = false;
        	   }if(naoExiste) {
        		   System.out.print("\nO nome é inexistente");
        	   }
           }
	}
}



4.package atividade4;
  import java.util.Scanner;
  public class atividade4 {
   public static void main(String[]args) {
	 Scanner entrada = new Scanner(System.in);
	 int [] valor = new int[10];
	 int i, referencia, menor=0, conta=0, igual=0;
	 
	 for( i = 0; i < 10; i++) {
		 System.out.print("Qual é o valor? ");
		 valor[i] = entrada.nextInt();
	 } 
	     System.out.print("Qual é o valor de referência? ");
	     referencia = entrada.nextInt();
	   
	 for(i = 0; i < 10; i++) {
		 if(valor[i]>referencia) {
			 conta++;
		 }else if(valor[i]<referencia) {
			 menor++;
		 }else {
			 igual++;
		 } 
	 } if(referencia>0) {
		 System.out.println("\nOs valores maiores que a referência são:\n");
	 } for(i = 0; i < 10; i++) {
		 if(valor[i]>referencia) {
			 System.out.print(valor[i]);
		 }
		 
	     }if(menor > 0) {
			 System.out.print("\nOs valores menores que a referência são: "+menor);
		 }else {
			 System.out.print("\nNão existem valores menores que a referência.");
		 }if(igual > 0) {
			 System.out.print("\nOs valores iguais a referência são: "+igual);
		 }else {
			 System.out.print("\nNão existem valores iguais a referência.");
		 }
	 
	    
 }
}
