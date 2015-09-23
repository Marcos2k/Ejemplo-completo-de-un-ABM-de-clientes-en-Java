
package Datos;

public class ComboLocalides {
    /*En esta clase se describen los atributos del combobox de localidades*/
    int IDLocalidad;
    String Localidad;

    public int getIDLocalidad() {
        return IDLocalidad;
    }

    public void setIDLocalidad(int IDLocalidad) {
        this.IDLocalidad = IDLocalidad;
    }

    public String getLocalidad() {
        return Localidad;
    }

    public void setLocalidad(String Localidad) {
        this.Localidad = Localidad;
    }

    public ComboLocalides() {
    }

    public ComboLocalides(int IDLocalidad, String Localidad) {
        this.IDLocalidad = IDLocalidad;
        this.Localidad = Localidad;
    }
   
    //utilizamos este metodo para que se muestre el texto en pantalla
    public String toString(){
        return Localidad;
    }
}
