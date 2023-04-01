/*
 * Área do Círculo
Adaptado por Neilor Tonin, URI  Brasil

Timelimit: 1
A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema que π = 3.14159:

- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.

Entrada
A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.

Saída
Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme exemplo abaixo, com 4 casas após o ponto decimal. Utilize variáveis de dupla precisão (double).
Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".
 */
package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class AreaDoCirculo {
    
    public static void main(String[] args) {
        System.out.print("Digite a área: ");
        Scanner Escreva = new Scanner(System.in);
        Double raio = Escreva.nextDouble();
        final Double pi = Math.PI;
        Double ValorDaArea = pi * (Math.pow(raio,raio));
        
        System.out.print("O Valor do Raio é :" + ValorDaArea);

    }

    
    
}
