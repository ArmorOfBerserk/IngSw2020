package selezioneAuto;

public class Nissan implements Marca {

	@Override
	public String stampaSpecifiche(String s) {
		if(s.equals("Monovolume") )
			return "Marca :	Nissan\r\n"
					+ "Modello : MONOvolume\r\n"
					+ "Generazione : GLC SUV (X253, facelift 2019)\r\n"
					+ "Modifica (motore) 	GLC 300de (306 CV) PHEV 4MATIC 9G-TRONIC\r\n"
					+ "Inizio anno di produzione 	2020 anno\r\n"
					+ "Architettura dell'unità di potenza 	PHEV (auto elettrica ibrida plug-in)\r\n"
					+ "Tipo di carrozzeria 	SUV\r\n"
					+ "Posti 	8\r\n"
					+ "Numero Porte 	7 \r\n"
					+ "\r\n"
					+ "";
		
		if(s.equals("Familiare") )
			return "Marca :	Nissan\r\n"
					+ "Modello : FamiliareYOLO\r\n"
					+ "Generazione : GLC SUV (X253, facelift 2019)\r\n"
					+ "Modifica (motore) 	GLC 300de (306 CV) PHEV 4MATIC 9G-TRONIC\r\n"
					+ "Inizio anno di produzione 	2020 anno\r\n"
					+ "Architettura dell'unità di potenza 	PHEV (auto elettrica ibrida plug-in)\r\n"
					+ "Tipo di carrozzeria 	SUV\r\n"
					+ "Posti 	5\r\n"
					+ "Numero Porte 	5 \r\n"
					+ "\r\n"
					+ "";
		
		else
			return "Marca :	Nissan\r\n"
			+ "Modello : Sport\r\n"
			+ "Generazione : GLC SUV (X253, facelift 2019)\r\n"
			+ "Modifica (motore) 	GLC 300de (306 CV) PHEV 4MATIC 9G-TRONIC\r\n"
			+ "Inizio anno di produzione 	2020 anno\r\n"
			+ "Architettura dell'unità di potenza 	PHEV (auto elettrica ibrida plug-in)\r\n"
			+ "Tipo di carrozzeria 	SUV\r\n"
			+ "Posti 	2\r\n"
			+ "Numero Porte 	3\r\n"
			+ "\r\n"
			+ "";

	}

}
