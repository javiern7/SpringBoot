/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.capitulo4.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;
import lombok.Data;

/**
 *
 * @author Dennys
 */
@Entity
@Table(name="curso")
@Data
public class CursoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idcurso")
    private Integer idCurso;
    @Column(name="nomcurso")
    private String nomCurso;
    @Column(name="fechainicio")
    private Date fechaInicio;
    @Column(name="alumnosmin")
    private Integer alumnosMin;
    @Column(name="alumnosact")
    private Integer alumnosAct;
    private Integer estado;

}
