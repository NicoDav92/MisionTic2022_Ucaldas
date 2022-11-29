import pandas as pd
import os

nombre=str(input("Ingrese el nombre: "))
print(" Nombre: ",nombre.upper())
numero_identificacion=int(input("Ingrese numero de identificacion: "))
print(" numero de identificacion es: ",numero_identificacion)

correo = str(input("Ingrese el correo: ")) #Ingresar un correo electronico
print(" find ", correo.find("@ucaldas.edu.co"))
if "@ucaldas.edu.co" in correo:  #Si el correo ingresado tiene dominio correcto
  print(" Correo electronico valido")
else:
  correo1= str(input("Ingrese el correo valido: ")) 
  print(" find ", correo1.find("@ucaldas.edu.co"))
  if "@ucaldas.edu.co" in correo1:  
   print(" Correo electronico valido")
   exit()
  else:
    correo2= str(input("Ingrese el correo valido: "))
    print(" find ", correo2.find("@ucaldas.edu.co"))
    while "@ucaldas.edu.co" in correo2:
      print(" Correo electronico valido")
      break
    exit()

a=int(input(" Ingrese la Latitud: "))
b=int(input(" Ingrese la Longitud: "))
      
coordenadas=[a,b]
print(f" Lat: {coordenadas[0]} \n Lon:{coordenadas[1]} \n" )


#Aca se realizara el registro si el correo ingresado es correcto
print("Informacion registrada")
palabras=[nombre,numero_identificacion,correo,coordenadas]
items_df = pd.DataFrame({
     ' Datos': ['Nombre', 'Identificacion', 'Correo', 'Coordenadas Lat:Lon'],
     'palabras':[nombre.upper(),numero_identificacion,correo,coordenadas]
})

print(items_df)
exit()

#Para DOS/Windows
os.system ("cls") 


