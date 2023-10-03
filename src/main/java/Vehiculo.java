package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Vehiculo {
    private String placa;
    private int puertas;
    private int velocidadMaxima;
    private String nombre;
    private double precio;
    private double peso;
    private String traccion;
    private Fabricante fabricante;
    private static int CantidadVehiculos = 0;
    private static List<Vehiculo> vehiculosCreados = new ArrayList<>();
    
    public Vehiculo(String placa,int puertas,int velocidadMaxima,String nombre,double precio,double peso,String traccion,Fabricante fabricante) {
    	this.placa = placa;
    	this.puertas = puertas;
    	this.velocidadMaxima = velocidadMaxima;
    	this.nombre = nombre;
    	this.precio = precio;
    	this.peso = peso;
    	this.traccion = traccion;
    	this.fabricante = fabricante;
    	CantidadVehiculos++;
    	vehiculosCreados.add(this);
    }
    public static List<Vehiculo> getCreados() {
        return vehiculosCreados;
    }
    private static List<Automovil> automoviles = new ArrayList<>();
    private static List<Camioneta> camionetas = new ArrayList<>();
    private static List<Camion> camiones = new ArrayList<>();

    public String getPlaca() {
    	return placa;
    }
    public void setPlaca(String placa) {
    	this.placa = placa;
    }
    public int getPuertas() {
    	return puertas;
    }
    public void setPuertas(int puertas) {
    	this.puertas = puertas;
    }
    public int getVelocidadMaxima() {
    	return velocidadMaxima;
    }
    public void setVelocidadMaxima(int velocidadMaxima) {
    	this.velocidadMaxima = velocidadMaxima;
    }
    public String getNombre() {
    	return nombre;
    }
    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }
    public double getPrecio() {
    	return precio;
    }
    public void setPrecio(double precio) {
    	this.precio = precio;
    }
    public double getPeso() {
    	return peso;
    }
    public void setPeso(double peso) {
    	this.peso = peso;
    }
    public String getTraccion() {
    	return traccion;
    }
    public void setTraccion(String traccion) {
    	this.traccion = traccion;
    }
    public Fabricante getFabricante() {
    	return fabricante;
    }
    public void setFabricante(Fabricante fabricante) {
    	this.fabricante = fabricante;
    }
    public static int getCantidadVehiculos() {
    	return CantidadVehiculos;
    }
    public static void setCantidadVehiculos(int cantidadVehiculos) {
    	CantidadVehiculos = cantidadVehiculos;
    }
    public static String vehiculosPorTipo() {
    	return String.format("Automoviles: %d\nCamionetas: %d\nCamiones: %d", Automovil.getCantidadAutomoviles(), Camioneta.getCantidadCamionetas(), Camion.getCantidadCamiones());
    }
}
