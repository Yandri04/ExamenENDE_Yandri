package Examen;

public class Vehiculo {
	String modelo;
	String marca;
	String matricula;
	double prestado;

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getPrestado() {
		return prestado;
	}
	public void setPrestado(double prestado) {
		this.prestado = prestado;
	}
	@Override
	public String toString() {
		return "Vehiculo [modelo=" + modelo + ", marca=" + marca + ", matricula=" + matricula + ", prestado=" + prestado
				+ ", getModelo()=" + getModelo() + ", getMarca()=" + getMarca() + ", getMatricula()=" + getMatricula()
				+ ", getPrestado()=" + getPrestado() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

	
}
