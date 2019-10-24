
package pjSAMU;


public class AtendimentoFINALIZADO implements Atendimento{
    
    private Atendimento proximo;
    
    @Override
    public String atendeVerificacao(Alerta alerta, Verificacao verificacao) {
        if (verificacao.getStatus() == Status.FINALIZADO) {

            return alerta.getId() + ";" + alerta.getLatitude() + ";" + alerta.getLongitude()
                 + ";" + alerta.getObservacao() + ";" + alerta.getFoto();

        } else {
            return proximo.atendeVerificacao(alerta, verificacao);
        }
    }
   
    @Override
    public void setProximo(Atendimento proximo) {

        {
            this.proximo = proximo;
        }
    }
    
    
}
