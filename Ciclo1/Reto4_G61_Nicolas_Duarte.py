	
import os
import numpy as np
from collections import Counter

print("\n")
data = np.genfromtxt('usuario_conectados_ICR.csv', delimiter=',', dtype=None, names=True, encoding="ISO-8859-1") #En esta parte leo el archivo csv 
print(data)
print("\n")
print("La cantidad de usuarios en la zona OCCIDENTE es: ",sum(data['zona'] == 'OCCIDENTE')) #Cuento las veces que se repite cada palabra 
print("La cantidad de  usuarios en la zona NORTE es: ",sum(data['zona'] == 'NORTE'))
print("La cantidad de  usuarios en la zona  SUR es: ",sum(data['zona'] == 'SUR'))
print("La cantidad de  usuarios en la zona  ORIENTE es: ",sum(data['zona'] == 'ORIENTE'))
print("\n")

contador=Counter(data['zona']) #La palabra que mas se repite en esta columna
print("La zona con mayor cantidad de usuarios es: ",contador.most_common(1)) #Imprimo la palabra que mas se repite y el numero de veces que se repite 

os.system ("cls") 
