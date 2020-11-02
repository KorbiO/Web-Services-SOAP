package ws;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import metier.Compte;
@WebService(serviceName = "BanqueWS")
public class BanqueService {
	@WebMethod(operationName = "ConversionEuroToDH")
	public double conversion (@WebParam (name = "montant") double mt ) {
		return mt*100;
	}
	@WebMethod
	public Compte getCompte (@WebParam (name = "code") Long code) {
		return new Compte(code, Math.random()*900,new Date());
	}
	@WebMethod
	public List<Compte> listCompte(){
		List<Compte> comptes = new ArrayList<Compte>();
		comptes.add(new Compte(1L, Math.random()*900,new Date()));
		comptes.add(new Compte(2L, Math.random()*900,new Date()));
		comptes.add(new Compte(3L, Math.random()*900,new Date()));
		comptes.add(new Compte(4L, Math.random()*900,new Date()));
		return comptes;
	}
}
