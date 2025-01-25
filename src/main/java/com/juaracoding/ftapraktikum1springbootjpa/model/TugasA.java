package com.juaracoding.ftapraktikum1springbootjpa.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

/*
Created By IntelliJ IDEA 2024.3 (Community Edition)
Build #IC-243.21565.193, built on November 13, 2024
@Author USER Febby Tri Andika
Java Developer
Created on 25/01/2025 16:07
@Last Modified 25/01/2025 16:07
Version 1.0
*/
@Entity
@Table(name = "MstTugasA")
public class TugasA {

    @Id
    @Column(name = "IDTugasA", length = 255, nullable = false)
    private String idTugasA;

    @Column(name = "Nama" , length = 40, nullable = false)
    private String nama;
    @Column(name = "Alamat",length = 500,nullable = false)
    private String alamat;
    @Column(name = "TanggalLahir", nullable = false)
    private LocalDate tanggalLahir;
    @Column(name = "JenisKelamin", length = 1, nullable = false)
    private Character jenisKelamin;
    @Column(name = "MasihHidup", nullable = false)
    private Boolean masihHidup;
    @Column(name = "CreatedDate",updatable = false,nullable = false, length = 7)
    private Date createdDate;
    @Column(name = "CreatedBy",updatable = false,nullable = false)
    private Integer createdBy;
    @Column(name = "ModifiedDate", insertable = false,length = 7)
    private Date modifiedDate;
    @Column(name = "ModifiedBy", insertable = false)
    private Integer modifiedBy;
    @Column(name = "IsDelete", nullable = false)
    private Short isDelete;

    public String getIdTugasA() {
        return idTugasA;
    }

    public void setIdTugasA(String idTugasA) {
        this.idTugasA = idTugasA;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public Character getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(Character jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public Boolean getMasihHidup() {
        return masihHidup;
    }

    public void setMasihHidup(Boolean masihHidup) {
        this.masihHidup = masihHidup;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Integer getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Integer modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Short getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Short isDelete) {
        this.isDelete = isDelete;
    }
}


