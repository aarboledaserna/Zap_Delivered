package org.example.modelos;

import org.example.helpers.validaciones.MercanciaValidacion;
import org.example.helpers.validaciones.VehiculoValidacion;

public class Mercancia {

    //id (int) //solo enteros positivos
    //volumenOcupado (double)  //solo positivos y maximo 100
    //tipo (string) //solo letras sin espacios
    //peso (double) //solo positivos maximo 1000
    //descripcion (string) //maximo 100
    //avaluo (int) //solo positivos
    //direccionRemitente (string) //maximo 200
    //direccionDestinatario (string) //maximo 200

    private MercanciaValidacion mercanciaValidacion = new MercanciaValidacion();

    private Integer id;
    private Double volumenOcupado;
    private String tipo;
    private Double peso;
    private String descripcion;
    private Integer avaluo;
    private String direccionRemitente;
    private String direccionDestinatario;


    //CONSTRUCTORES DE LA CLASE


    public Mercancia() {
    }

    public Mercancia(MercanciaValidacion mercanciaValidacion, Integer id, Double volumenOcupado, String tipo, Double peso, String descripcion, Integer avaluo, String direccionRemitente, String direccionDestinatario) {

    }

    public MercanciaValidacion getMercanciaValidacion() {
        return mercanciaValidacion;
    }

    public void setMercanciaValidacion(MercanciaValidacion mercanciaValidacion) {
        this.mercanciaValidacion = mercanciaValidacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getVolumenOcupado() {
        return volumenOcupado;
    }

    public void setVolumenOcupado(Double volumenOcupado) {
        this.volumenOcupado = volumenOcupado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getAvaluo() {
        return avaluo;
    }

    public void setAvaluo(Integer avaluo) {
        this.avaluo = avaluo;
    }

    public String getDireccionRemitente() {
        return direccionRemitente;
    }

    public void setDireccionRemitente(String direccionRemitente) {
        this.direccionRemitente = direccionRemitente;
    }

    public String getDireccionDestinatario() {
        return direccionDestinatario;
    }

    public void setDireccionDestinatario(String direccionDestinatario) {
        this.direccionDestinatario = direccionDestinatario;
    }
}
