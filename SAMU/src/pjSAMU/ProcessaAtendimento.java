
package pjSAMU;


public class ProcessaAtendimento {
    
     public String atendeVerificacao(Alerta alerta, Verificacao verificacao) {

        Atendimento A1 = new AtendimentoABERTO();
        Atendimento A2 = new AtendimentoFINALIZADO();
     
        A1.setProximo(A2);
       

        return A1.atendeVerificacao(alerta, verificacao);

    }
    
}
