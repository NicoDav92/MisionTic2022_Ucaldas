import json

datos={}
datos['usuarios']=[]

#Esta es la informacion que llevara mi archivo json
datos['usuarios'].append({
         "nombre": "IVAN CASTRO",
         "identificacion": 12345,
         "correo":"ijcastror@ucaldas.edu.co",
         "coordenadas": [
                          {"lat": 12},
                          {"lon":45}
                         ],
          "zona": "NORTE"
        })
                             
datos['usuarios'].append({
         "nombre": "JUAN PEREZ",
         "identificacion": 234645,
         "correo":"jperez@ucaldas.edu.co",
         "coordenadas": [
                          {"lat": 45},
                          {"lon":78}
                         ],
          "zona": "OCCIDENTE"
        })

        
datos['usuarios'].append({
         "nombre": "SHARID CASTRO",
         "identificacion": 45457,
         "correo":"scastros@ucaldas.edu.co",
         "coordenadas": [
                          {"lat": 56},
                          {"lon":89}
                         ],
          "zona": "SUR"
        })

with open('usuarios_icr.json', 'w') as file:
    json.dump(datos, file, indent=4) #Creacion del archivo json
