/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana10.modelo;

/**
 *
 * @author ulacit
 */
public class Usuario {
    private String nombre;
    private int age;
    
    public Usuario(String nombre, int age){
        this.nombre= nombre;
        this.age = age;
          
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

   
    
}
