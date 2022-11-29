import os
 
def reto_1():
 print(" Bienvenido al sistema de ubicacion para zonas publicas WIFI \n" )
Usuario=61
contrasena=16

usuario=int(input(" Ingrese el numero del usuario: \n "))
if(usuario!=Usuario):
            print("Error")
else:
    contrasena1=int(input(" Ingrese el numero de contrasena: \n "))
    if(contrasena==contrasena1):
        numero1=1 #Primer numero corresponde segundo numero del grupo usuario
        numero2=6 #Segundo numero corresponde primer numero del grupo usuario
        suma=numero1+numero2
        Catcha=int(input("Ingrese el numero del Catcha que es la suma de la contrasena: \n "))
        if(suma==Catcha):
            print(" La suma de 6+1 es igual a: \n ",suma)
            print("Sesion iniciada")
        else:
            print("Error")
    else:
        print("Error")
#exit()
#reto_1()
os.system ("cls")
