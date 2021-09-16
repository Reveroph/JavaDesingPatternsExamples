package criacao.factory;

import criacao.factory.domain.Plano;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GerarContaEletrica {

    ObterPlanoFactory planoFactory = new ObterPlanoFactory();

    public void GerarContaEletrica() throws IOException {

        System.out.print("Entre com o nome do plano (Domiciliar, Empresarial ou Institucional) da conta a ser gerada: ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String nomePlano = br.readLine();

        System.out.print("Entre com a quantidade consumida: ");
        int qtd = Integer.parseInt(br.readLine());

        Plano p = planoFactory.getPlano(nomePlano.toUpperCase());

        System.out.print("Total da conta para o plano: " + nomePlano + " é: R$ ");
        p.getTaxa();
        p.calcularConta(qtd);
    }
}
