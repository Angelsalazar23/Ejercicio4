import java.sql.ClientInfoStatus;

public class Main {
    public static void main(String[] args) {

        System.out.println("----------------------!");

        Cliente cliente=new Cliente();

        cliente.setNombre("angel salazar");
        cliente.setEdad(25);
        cliente.setTelefono("5827289248");
        cliente.setCredito("Basico");

        System.out.println(cliente.getNombre());
        System.out.println(cliente.getEdad());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getCredito());

        System.out.println("-------------------------------");

        Trabajador trabajador=new Trabajador();

        trabajador.setNombre("America Mendoza");
        trabajador.setEdad(24);
        trabajador.setTelefono("29655984599");
        trabajador.setSalario(15000);

        System.out.println(trabajador.getNombre());
        System.out.println(trabajador.getEdad());
        System.out.println(trabajador.getTelefono());
        System.out.println(trabajador.getSalario());



    }


}



class Persona{

    int edad;
    String nombre;
    String telefono;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
}


class Cliente extends Persona{

    private String credito;

    public String getCredito() {
        return credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }

}

class Trabajador extends Persona{

    private int salario;

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }
}