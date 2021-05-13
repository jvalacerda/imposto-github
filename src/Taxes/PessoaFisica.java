package Taxes;

public class PessoaFisica extends Pessoa {

	private Double healthExp;
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String name, Double anualIncome, Double healthExp) {
		super(name, anualIncome);
		this.healthExp = healthExp;
	}

	public Double getHealthExp() {
		return healthExp;
	}

	public void setHealthExp(Double healthExp) {
		this.healthExp = healthExp;
	}

	@Override
	public Double tax() {
		if(anualIncome <= 20000.00) {
			return (anualIncome * 0.15) - (healthExp * 0.5);
		} else {
			return (anualIncome * 0.25) - (healthExp * 0.5);
		}
	}

}
