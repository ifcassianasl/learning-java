class Data {
	private int dia, mes, ano;
	private int ultimodia[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public Data() {
		this.dia = 1;
		this.mes = 1;
		this.ano = 2000;
	}

	public Data(int dia, int mes, int ano) {
		if (this.bissexto(ano)) {
			this.ultimodia[1] = 29;
		}
		this.ano = (ano >= 0) ? ano : 2000;
		this.mes = ((mes >= 1) && (mes <= 12)) ? mes : 1;
		this.dia = ((dia >= 1) && (dia <= this.ultimodia[this.mes-1])) ? dia : 1;
	}

	public boolean igual(Data data) { //this == data?
		return((this.dia == data.dia) && (this.mes == data.mes) && (this.ano == data.ano));
	}

	public boolean bissexto(int ano) {
		return ((ano % 400 == 0) || ((ano % 100 != 0 ) && (ano % 4 == 0)));
	}

	public boolean menor(Data data) { //this < data?
		return((this.ano < data.ano) || ((this.ano == data.ano) && (this.mes < data.mes)) || ((this.ano == data.ano) && (this.mes == data.mes) && (this.dia < data.dia)));
	}

	public int diferenca(Data data) {
		int dias = 0;
		Data inicio, fim;
		if (this.menor(data)) {
			inicio = new Data(this.dia, this.mes, this.ano);
			fim = new Data(data.dia, data.mes, data.ano);
		}
		else {
			inicio = new Data(data.dia, data.mes, data.ano);
			fim = new Data(this.dia, this.mes, this.ano);
		}
		while (!inicio.igual(fim))
		{	dias++;
			if (++inicio.dia > this.ultimodia[inicio.mes-1]) {
				inicio.dia = 1;
				if (++inicio.mes > 12) {
					inicio.mes = 1;
					inicio.ano++;
				}
			}
		}
		return(dias);
	}

	public int diasemana() { //0 = dom, ..., 6 = sab
		return(((new Data(1, 1, 1900).diferenca(this)%7)+1)%7);
	}

	public String toString() {
		return(String.valueOf(this.dia)+"/"+String.valueOf(this.mes)+"/"+String.valueOf(this.ano));
	}
}
