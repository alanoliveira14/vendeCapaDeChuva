package br.com.objs;

public class PrevisaoTempo {
    private String dia;
    private Integer maxima;
    private Integer minima;
    private Double temperaturaMedia;
    private String estado;
    private Integer promocao;

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Integer getMaxima() {
        return maxima;
    }

    public void setMaxima(Integer maxima) {
        this.maxima = maxima;
    }

    public Integer getMinima() {
        return minima;
    }

    public void setMinima(Integer minima) {
        this.minima = minima;
    }

    public Double getTemperaturaMedia() {
        return temperaturaMedia;
    }

    public void setTemperaturaMedia(Double temperaturaMedia) {
        this.temperaturaMedia = temperaturaMedia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getPromocao() {
        return promocao;
    }

    public void setPromocao(Integer promocao) {
        this.promocao = promocao;
    }
}
