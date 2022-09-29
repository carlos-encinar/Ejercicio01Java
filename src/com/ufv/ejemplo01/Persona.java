package com.ufv.ejemplo01;

public class Persona {

    private String nombre;
    private String apellidos;
    private int dni;



    private int edad;

    public Persona(){
    }
    public Persona (String nombre, String apellidos, int dni, int edad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad (int _edad){
        if (_edad <= 0){
            System.out.printf("Necesitas ser mayor de edad.");
        }
        else{
            edad = _edad;
            System.out.printf("");
        }
    }

}
