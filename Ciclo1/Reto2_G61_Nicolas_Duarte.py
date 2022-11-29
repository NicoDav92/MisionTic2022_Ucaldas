# Bloque Librerias
import random as r
import os
import time

#En esta seccion estoy invocando el reto 1
from Reto1_G61_Nicolas_Duarte import reto_1
reto_1()

time.sleep(2)
# Bloque de Funciones
def menu():   #En esta parte se define el RF1
  os.system("clear")
  #os.system("cls")
  print(
        """
    

            1) Adivinanza
            2) Cerrar Sesion
            
    
        """
      )

def cajero_calc():
  #bandera = True
  cont=0  #Este contador me permite controlar la cantidad de veces que el usuario ingresa una de las opciones.
  intentos=1
  lista=[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10] #La lista me permite saber el numero de intentos.
  
  while(True):
    menu()
    opc = int(input("Digite una opcion valida: "))
  
    if(opc==1):
     numero = r.randint(0,10) #Generacion de numero aleatorios entre 0 y 10
     print(" Cual es el numero secreto [0-10]- ? ")
     num = int(input(f"Digite el numero {numero} - ?"))
     
     while True:
       if (num<numero):
          print("!Estas por debajo!") #num ingresado es inferior al numero random
          
        
       elif (num>numero):
          print("!Te pasaste!") #num ingresado es superior al numero random
          
        
       elif (num in lista):
          print("Estas en el intervalo")
          
       else:
          print("!Estas fuera del intervalo!") #num ingresado esta fuera de la lista [0-10]


       if (num==numero):
          print(" !Adivinaste al primer intento! " ) #Si adivina al primer intento, el programa para 
          break
          
       numero_1=int(input("Digite el numero de nuevo - ? "))
       if(numero_1==numero):
           intentos=intentos+1 #Aca me acumula los intentos
           print(f" Adivinaste el numero en {intentos} intentos ") #Aca me dice el numero de intentos que lleva RF2. 
           break
        
    
  
    elif(opc==2):
      print("Hasta pronto")
      exit() #Si le da la opcion 2 "Cerrar sesion" le da un mensaje hasta pronto y finaliza el programa RF4
      
  
    elif(opc not in (1,2)):
      print("Error")
      cont=cont+1  #Aca me permite acumular en numero de intentos erroneos de ingresar las opciones 1 y 2.


    elif(cont>2): #Si el usuario ingrese 3 veces mal la opcion, el programa se cierra RF3.
        print("Error")
        break
    
  
    #time.sleep(2)
cajero_calc()
os.system ("cls")
  
