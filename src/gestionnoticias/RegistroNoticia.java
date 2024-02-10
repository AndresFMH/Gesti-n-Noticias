/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionnoticias;


public class RegistroNoticia {
    
    String fecha, autor, titular,conten;

    public RegistroNoticia(String fecha, String autor, String titular, String conten) {
        this.fecha = fecha;
        this.autor = autor;
        this.titular = titular;
        this.conten = conten;
    }

    public RegistroNoticia() {
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getConten() {
        return conten;
    }

    public void setConten(String contenido) {
        this.conten = conten;
    }
    
       
}
