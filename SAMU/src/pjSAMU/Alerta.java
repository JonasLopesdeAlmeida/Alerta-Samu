
package pjSAMU;

public class Alerta {
    
    private int id;
    private double latitude;
    private double longitude;
    private String observacao;
    private byte[]foto;

    public Alerta(int id, double latitude, double longitude, String observacao, byte[] foto) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.observacao = observacao;
        this.foto = foto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
    
    
}
