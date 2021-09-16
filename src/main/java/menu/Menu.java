package menu;

import criacao.factory.GerarContaEletrica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {

    public void menuDesignPatterns() throws IOException {

        int tipoDesign = 0;
        while (tipoDesign == 0) {
            System.out.println("Design Patters do Java? Você encontra por aqui!! :)");
            System.out.println("Selecione o tipo de design pattern desejado, conforme as opções abaixo: ");
            System.out.println("1 - Designs Criacionais");
            System.out.println("2 - Designs Estruturais");
            System.out.println("3 - Designs Comportamentais");
            System.out.println("Insira o número de uma das opções acima que deseja testar: ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            tipoDesign = Integer.parseInt(br.readLine());

            int designEscolha;
            if (tipoDesign == 1) {
                System.out.println("Selecione o design pattern desejado, conforme as opções abaixo: ");
                System.out.println("1 - Método Factory");
                designEscolha = Integer.parseInt(br.readLine());
                switch (designEscolha) {
                    case 1:
                        GerarContaEletrica contaEletrica = new GerarContaEletrica();
                        contaEletrica.GerarContaEletrica();
                        break;
                }
            } else {
                tipoDesign = 0;
            }
        }
    }
}
