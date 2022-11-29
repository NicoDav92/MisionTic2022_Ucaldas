import os
import time

# Definir variables

# Bloque de funcion 
def menu():
  os.system("clear")
  #os.system("cls")
  print(
        """
    
          Cajero Electronico G61

            1) Consignaciones
            2) Retiros
            3) Consultar Saldo
            4) Salir
    
        """
      )

# Programa Principal

bandera = True
saldo = 100000

while(bandera):
  menu()
  opc = int(input("Digite una opcion valida: "))

  if(opc==1):
    cons = int(input("Ingrese el valor a consignar: "))
    saldo = saldo + cons

  if(opc==2):
    ret = int(input("Valor a retirar: "))
    if(ret>saldo):
      print("Fondos insificientes")
    else:
      saldo = saldo - ret
  
  if(opc==3):
    print(f"Su saldo es: {saldo}")

  if(opc==4):
    print("Gracias por visitarnos")
    bandera = False


  time.sleep(5)

print("Fin Programa")
  
