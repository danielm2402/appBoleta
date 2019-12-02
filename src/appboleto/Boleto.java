/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appboleto;

/**
 *
 * @author daniel2402
 */
public class Boleto {
    
    private String atrComprador;
    private int atrId;
    private String atrNombrePelicula;
    private int atrAsiento;
    private int atrSala;
    private String atrLocalidad;
    private double atrTotal;
    private String atrDia;
    public Boleto(){
        
    }
    public Boleto(String atrComprador, int atrId, String atrNombrePelicula, int atrAsiento, int atrSala, String atrLocalidad, double atrTotal, String dia) {
        this.atrComprador = atrComprador;
        this.atrId = atrId;
        this.atrNombrePelicula = atrNombrePelicula;
        this.atrAsiento = atrAsiento;
        this.atrSala = atrSala;
        this.atrLocalidad = atrLocalidad;
        this.atrTotal= atrTotal;
        this.atrDia=dia;
    }

    public void setAtrComprador(String atrComprador) {
        this.atrComprador = atrComprador;
    }

    public void setAtrId(int atrId) {
        this.atrId = atrId;
    }

    public void setAtrNombrePelicula(String atrNombrePelicula) {
        this.atrNombrePelicula = atrNombrePelicula;
    }

    public void setAtrAsiento(int atrAsiento) {
        this.atrAsiento = atrAsiento;
    }

    public void setAtrSala(int atrSala) {
        this.atrSala = atrSala;
    }

    public void setAtrLocalidad(String atrLocalidad) {
        this.atrLocalidad = atrLocalidad;
    }

    public String getAtrComprador() {
        return atrComprador;
    }

    public int getAtrId() {
        return atrId;
    }

    public String getAtrNombrePelicula() {
        return atrNombrePelicula;
    }

    public int getAtrAsiento() {
        return atrAsiento;
    }

    public int getAtrSala() {
        return atrSala;
    }

    public String getAtrLocalidad() {
        return atrLocalidad;
    }
    public double getAtrTotal() {
        return atrTotal;
    }
    
}