
package Datos;

public class VClientes {
    int IDCliente;
    String Nombre;
    String Apellido;
    int Edad;
    int Localidad;
    String Telefono;
    String Domicilio;

    public int getIDCliente() {
        return IDCliente;
    }

    public void setIDCliente(int IDCliente) {
        this.IDCliente = IDCliente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getLocalidad() {
        return Localidad;
    }

    public void setLocalidad(int Localidad) {
        this.Localidad = Localidad;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public VClientes() {
    }

    public VClientes(int IDCliente, String Nombre, String Apellido, int Edad, int Localidad, String Telefono, String Domicilio) {
        this.IDCliente = IDCliente;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Localidad = Localidad;
        this.Telefono = Telefono;
        this.Domicilio = Domicilio;
    }
    
    
    
}
