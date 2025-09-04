/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.capitulo4.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import java.util.Base64;


/**
 *
 * @author Dennys
 */
@Entity
@Table(name="user")
public class UserEntity {
    
    
    @Id
    private String user;
    private String password;
    @Column(name="fullname")
    private String fullName;
    
    private byte[] foto;
    @Transient
    private String foto64;

    public String getFoto64() {
        
        String respuesta = null;
        if(foto!=null &&foto.length>0)
            respuesta= Base64.getEncoder().encodeToString(foto);
        
        return respuesta;
    }

    public void setFoto64(String foto64) {
        this.foto64 = foto64;
    }
    
    
    
    
    
    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
    
    
    
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    
}
