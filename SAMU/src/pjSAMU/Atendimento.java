
package pjSAMU;


public interface Atendimento {
    
    public String atendeVerificacao(Alerta alerta, Verificacao verificacao);
	public void setProximo(Atendimento proximo);

    
}
