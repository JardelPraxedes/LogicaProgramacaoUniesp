
 //Imprima os inteiros de 1 a 20, utilizando um loop while e a variável contadora i. Assuma que a
////variável i foi declarada, mas não foi inicializada.Imprima apenas cinco inteiros por linha. [Dica:
//utilize o cálculo i % 5. Quando o valor dessa expressão for 0, imprima um caractere de nova
//linha; caso contrário, imprima um caractere de tabulação. Assuma que esse código é um
//aplicativo. Utilize o método System.out.println () para imprimir o caractere de nova linha, e utilize
//o método System.out.print ('\t') para imprimir o caractere de tabulação.]
public class questao {
    public static void main(String[] args) {
        int i=1;
        while(i<=20) {
           if (i%5==0) { //se o contador tiver resto zero, vai ser exibido a variavel e após uma tabulação
                System.out.print(i + " ,");
                System.out.println('\t');
                }
           else { // caindo no else, vai ser printado os valores das variaveis em inline
                System.out.print(i + " ,");
            }

            i++;
        }
    }
}
