package selezioneAuto;

public class Opel implements Marca {

	@Override
	public String stampaSpecifiche(String s) {
		if(s.equals("Monovolume") )
			return "Marca :	Opel\r\n"
					+ "Modello : GLC\r\n"
					+ "Generazione : GLC SUV (X253, facelift 2019)\r\n"
					+ "Modifica (motore) 	GLC 300de (306 CV) PHEV 4MATIC 9G-TRONIC\r\n"
					+ "Inizio anno di produzione 	2020 anno\r\n"
					+ "Architettura dell'unit� di potenza 	PHEV (auto elettrica ibrida plug-in)\r\n"
					+ "Tipo di carrozzeria 	SUV\r\n"
					+ "Posti 	5\r\n"
					+ "Numero Porte 	5 \r\n"
					+ "\r\n"
					+ "";
		
		if(s.equals("Familiare") )
			return "Marca :	Opel\r\n"
					+ "Modello : Corsa \r\n"
					+ "Generazione : Corsa (X253, facelift 2019)\r\n"
					+ "Modifica (motore) 	GLC 300de (306 CV) PHEV 4MATIC 9G-TRONIC\r\n"
					+ "Inizio anno di produzione 	2020 anno\r\n"
					+ "Architettura dell'unit� di potenza 	PHEV (auto elettrica ibrida plug-in)\r\n"
					+ "Tipo di carrozzeria 	SUV\r\n"
					+ "Posti 	6\r\n"
					+ "Numero Porte 	6 \r\n"
					+ "\r\n"
					+ "";
		
		else
			return "Marca :	Opel\r\n"
			+ "Modello : Sportiva\r\n"
			+ "Generazione : SUV (X253, facelift 2019)\r\n"
			+ "Modifica (motore) 	GLC 300de (306 CV) PHEV 4MATIC 9G-TRONIC\r\n"
			+ "Inizio anno di produzione 	2020 anno\r\n"
			+ "Architettura dell'unit� di potenza 	PHEV (auto elettrica ibrida plug-in)\r\n"
			+ "Tipo di carrozzeria 	SUV\r\n"
			+ "Posti 	2\r\n"
			+ "Numero Porte 	2 \r\n"
			+ "\r\n"
			+ "";
		 

	}

}
