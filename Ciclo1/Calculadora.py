from tkinter import Tk, Text, Button

class Interfaz:
    def __init__(self, ventana):
        #inicializar la ventana con un título
        self.ventana=ventana
        self.ventana.title("Calculadora")

        #Agregar una caja de texto para que sea la pantalla de la calculadora
        self.pantalla=Text(ventana, state="disabled", width=40, height=3, background="orchid", foreground="white", font=("Helvetica",15))

        #Ubicar la pantalla en la ventana
        self.pantalla.grid(row=0,column=0,columnspan=4,padx=5,pady=5)

        #Inicializar la operación mostrada en pantalla como string vacío
        self.operacion=""

        #Crear los botones de la calculadora
        boton1=self.crearBoton(7)
        boton2=self.crearBoton(8)
        boton3=self.crearBoton(9)
        boton4=self.crearBoton(u"\u232B",escribir=False)
        boton5=self.crearBoton(4)
        boton6=self.crearBoton(5)
        boton7=self.crearBoton(6)
        boton8=self.crearBoton(u"\u00F7")
        boton9=self.crearBoton(1)
        boton10=self.crearBoton(2)
        boton11=self.crearBoton(3)
        boton12=self.crearBoton("*")
        boton13=self.crearBoton(".")
        boton14=self.crearBoton(0)
        boton15=self.crearBoton("+")
        boton16=self.crearBoton("-")
        boton17=self.crearBoton("=",escribir=False,ancho=20,alto=2)

        #Ubicar los botones con el gestor grid
        botones=[boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9, boton10, boton11, boton12, boton13, boton14, boton15, boton16, boton17]
        contador=0
        for fila in range(1,5):
            for columna in range(4):
                botones[contador].grid(row=fila,column=columna)
                contador+=1
        #Ubicar el último botón al final
        botones[16].grid(row=5,column=0,columnspan=4)
        return


    #Método para crear un botón con el valor que debe mostrar
    def crearBoton(self,valor,escribir=True,ancho=9,alto=1):
        return Button(self.ventana, text=valor, width=ancho, height=alto, font=("Helvetica",15), command=lambda:self.click(valor,escribir))


ventana_principal = Tk()
calculadora = Interfaz(ventana_principal)
ventana_principal.mainloop()
