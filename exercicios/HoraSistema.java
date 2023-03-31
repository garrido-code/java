/*Programa que lê a hora e data do sistema */
package exercicios;
import java.util.Date;

public class HoraSistema{
    
    public static void main(String[] args) {
         Date relogio = new Date(); /*Aqui está pegando a hora , chamando o objeto Date */

         System.out.println(" A hora do Sistema é: " + relogio.toString()); /*Mostra na tela com a função println */
    }
}