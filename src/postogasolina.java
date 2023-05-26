import java.util.Scanner;
public class postogasolina {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de litros que foram vendidos: ");
        double litros= entrada.nextDouble();

        System.out.println("Escolha o tipo : ");
        System.out.println("1 A -Alcool");
        System.out.println("2 G -Gasolina");
        int tipo = entrada.nextInt();
        double precogasolina = 2.50; //preco da gasolina
        double precoalcool = 1.90; //preço do alcool
        double descontos = 0;
        double precogeral = 0;
     // Calculos dos descontos da gasolin
        if (tipo== 1 ){
            if (litros<=20) {
                descontos = litros * 0.03;
            } else {
                descontos = litros * 0.05;
            }
            precogeral=(litros*precogasolina)-descontos;
        }
        // desconto do alcool
        if (tipo== 2) {
            if (litros <= 20) {
                descontos = litros * 0.04;
            } else {
                descontos = litros * 0.06;
            }
            precogeral = (litros * precoalcool) - descontos;
        }

        System.out.println(" Valor a pagar : RS"+precogeral);


            }


    }




