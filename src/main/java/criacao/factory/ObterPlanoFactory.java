package criacao.factory;

import criacao.factory.domain.Plano;
import criacao.factory.domain.PlanoDomiciliar;
import criacao.factory.domain.PlanoEmpresarial;
import criacao.factory.domain.PlanoInstitucional;

public class ObterPlanoFactory {

    public Plano getPlano(String tipoPlano) {

        switch (tipoPlano) {
            case "DOMICILIAR":
                return new PlanoDomiciliar();
            case "EMPRESARIAL":
                return new PlanoEmpresarial();
            case "INSTITUCIONAL":
                return new PlanoInstitucional();
            default:
                throw new IllegalStateException("Unexpected value: " + tipoPlano);
        }
    }
}
