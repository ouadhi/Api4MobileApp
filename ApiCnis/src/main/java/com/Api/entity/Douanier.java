package com.Api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="douanier")
public class Douanier {
	
	@Id
	@Column(name = "mat_agt")
	private short matagt;
    @Column(name = "nom_agt")
	private String nomagt;
	public short getMatagt() {
		return matagt;
	}
	public void setMatagt(short matagt) {
		this.matagt = matagt;
	}
	public String getNomagt() {
		return nomagt;
	}
	public void setNomagt(String nomagt) {
		this.nomagt = nomagt;
	}
	public String getPrenomagt() {
		return prenomagt;
	}
	public void setPrenomagt(String prenomagt) {
		this.prenomagt = prenomagt;
	}
	public String getGradeagt() {
		return gradeagt;
	}
	public void setGradeagt(String gradeagt) {
		this.gradeagt = gradeagt;
	}
	public short getCodebur() {
		return codebur;
	}
	public void setCodebur(short codebur) {
		this.codebur = codebur;
	}
	public short getCodeagt() {
		return codeagt;
	}
	public void setCodeagt(short codeagt) {
		this.codeagt = codeagt;
	}
	public String getEtatagt() {
		return etatagt;
	}
	public void setEtatagt(String etatagt) {
		this.etatagt = etatagt;
	}
	@Column(name = "prenom_agt")
	private String prenomagt;                             
	@Column(name = "grade_agt")
	private String gradeagt;                              
	@Column(name = "code_bur")
	private short codebur;
	@Column(name = "code_agt")
	private short codeagt;
	@Column(name = "etat_agt")
	private String etatagt;

}
