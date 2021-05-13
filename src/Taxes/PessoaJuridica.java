package Taxes;

public class PessoaJuridica extends Pessoa {

	private Integer numberEmp;
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String name, Double anualIncome, Integer numberEmp) {
		super(name, anualIncome);
		this.numberEmp = numberEmp;
	}

	

	public Integer getNumberEmp() {
		return numberEmp;
	}

	public void setNumberEmp(Integer numberEmp) {
		this.numberEmp = numberEmp;
	}

	@Override
	public Double tax() {
		if(numberEmp <= 10) {
			return (anualIncome * 0.16);
		} else {
			return (anualIncome * 0.14);
		}
	}

}
