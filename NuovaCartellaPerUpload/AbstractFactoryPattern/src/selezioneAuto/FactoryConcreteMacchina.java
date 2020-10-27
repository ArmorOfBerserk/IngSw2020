package selezioneAuto;

public class FactoryConcreteMacchina implements MacchinaFactory {

	@Override
	public Marca createOpel() {
		return new Opel();
	}

	@Override
	public Marca createNissan() {
		return new Nissan();
	}

	@Override
	public Marca createRenault() {
		return new Renault();
	}

}
