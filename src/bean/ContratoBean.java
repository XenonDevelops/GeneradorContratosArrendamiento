/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author toshiba
 */
public class ContratoBean {

    String arrendatario = "";
    String fiadorSolitario = "";
    String arrendador = "";
    String direccion = "";
    String letraLocal = "";
    String fechaInicio = "";
    String fechaFin = "";
    String precioLetra = "";
    String diaPago = "";
    int precio = 0;
    int duracionMeses = 0;

    public String getArrendatario() {
        return arrendatario;
    }

    public void setArrendatario(String arrendatario) {
        this.arrendatario = arrendatario;
    }

    public String getFiadorSolitario() {
        return fiadorSolitario;
    }

    public void setFiadorSolitario(String fiadorSolitario) {
        this.fiadorSolitario = fiadorSolitario;
    }

    public String getArrendador() {
        return arrendador;
    }

    public void setArrendador(String arrendador) {
        this.arrendador = arrendador;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLetraLocal() {
        return letraLocal;
    }

    public void setLetraLocal(String letraLocal) {
        this.letraLocal = letraLocal;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getPrecioLetra() {
        return precioLetra;
    }

    public void setPrecioLetra(String precioLetra) {
        this.precioLetra = precioLetra;
    }

    public String getDiaPago() {
        return diaPago;
    }

    public void setDiaPago(String diaPago) {
        this.diaPago = diaPago;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getDuracionMeses() {
        return duracionMeses;
    }

    public void setDuracionMeses(int duracionMeses) {
        this.duracionMeses = duracionMeses;
    }

    @Override
    public String toString() {
        return "ContratoBean{" + "arrendatario=" + arrendatario + ", fiadorSolitario=" + fiadorSolitario + ", arrendador=" + arrendador + ", direccion=" + direccion + ", letraLocal=" + letraLocal + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", precioLetra=" + precioLetra + ", diaPago=" + diaPago + ", precio=" + precio + ", duracionMeses=" + duracionMeses + '}';
    }

}
