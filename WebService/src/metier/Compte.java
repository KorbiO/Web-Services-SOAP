package metier;

import java.util.Date;
public class Compte {

	private Long code;
	private double solde ;
	private Date dataCreation;
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Date getDataCreation() {
		return dataCreation;
	}
	public void setDataCreation(Date dataCreation) {
		this.dataCreation = dataCreation;
	}
	public Compte(Long code, double solde, Date dataCreation) {
		super();
		this.code = code;
		this.solde = solde;
		this.dataCreation = dataCreation;
	}
	
}
