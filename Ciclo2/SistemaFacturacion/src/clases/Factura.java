/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

public class Factura {
    // Atributos
    private String idFactura;
    private String fechaFactura;
    private double totalPagar;
    // Relaciones entre clases
    // 1) 1 Factura tiene 1 Cliente 
    private Cliente cliente;
    // 2) 1 Factura tiene 1..* Productos
    private Producto productos[];
    
    // Constructor
    public Factura(String idFactura, String fechaFactura, Cliente cliente, Producto[] productos) {
        this.idFactura = idFactura;
        this.fechaFactura = fechaFactura;
        this.cliente = cliente;
        this.productos = productos;
    }
    
    // set y get

    public String getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(String idFactura) {
        this.idFactura = idFactura;
    }

    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }
    
    // Metodo logica del negocio
    
    public void detalleFactura(Producto prod, double total){
        System.out.println("Codigo: " + prod.getIdProducto() + 
                           " Nombre: " + prod.getNombreProducto() +
                           " Valor: " + prod.getValorUnitario() +
                           " Cantidad: " + prod.getCantidad()+
                           " Subtotal: " + total);    
    }
    
    
    public void totalFactura(Producto[] productos){
        double totalPagar = 0; 
        System.out.println("Factura numero: " + this.idFactura + 
                           "\nFecha Factura: " + getFechaFactura()+
                           "\n--------------------------------------------------------------------------"+
                           "\nId Cliente: "+ cliente.getIdCliente() +
                           "\nNombre - Apellidos: " + cliente.getNombresCliente() + " - " + cliente.getApellidosCliente() +
                           "\nTelefono: " + cliente.getTelefonoCliente()+
                           "\n--------------------------------------------------------------------------");
        // Ciclo Forloop  -- Ideales para recorer estructuras de datos
        for (Producto prod : productos) {
            double valor = prod.getValorUnitario();
            double cantidad = prod.getCantidad();
            double total = valor * cantidad;
            detalleFactura(prod, total);
            totalPagar += total;
        }
        
        setTotalPagar(totalPagar);
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Total Factura " + getTotalPagar());
        
    }
    
    
}
