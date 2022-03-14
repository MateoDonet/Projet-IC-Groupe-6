package com.IC.ProjetICBackEnd.restServices.model;

public class Client {
	
	private int cli_id;
	private String cli_nom;
	private String cli_prenom;
	private String cli_username;
	private String cli_password;
	private int cli_cc_id;
	
	public int getCli_id() {
		return cli_id;
	}
	public void setCli_id(int cli_id) {
		this.cli_id = cli_id;
	}
	public String getCli_nom() {
		return cli_nom;
	}
	public void setCli_nom(String cli_nom) {
		this.cli_nom = cli_nom;
	}
	public String getCli_prenom() {
		return cli_prenom;
	}
	public void setCli_prenom(String cli_prenom) {
		this.cli_prenom = cli_prenom;
	}
	public String getCli_username() {
		return cli_username;
	}
	public void setCli_username(String cli_username) {
		this.cli_username = cli_username;
	}
	public String getCli_password() {
		return cli_password;
	}
	public void setCli_password(String cli_password) {
		this.cli_password = cli_password;
	}
	public int getCli_cc_id() {
		return cli_cc_id;
	}
	public void setCli_cc_id(int cli_cc_id) {
		this.cli_cc_id = cli_cc_id;
	}
}
