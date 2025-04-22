

IngresoSalario = True

litaSalario = [] 

cantTotalIngre = 0
totalSalario = 0
salioJunior = 0
salioSenior = 0
salioMaster = 0

while IngresoSalario:
    try:
        
        salario = float(input("Ingrese el salario, cero para finalizar el ingreso: "))
        
        # Valida que se ingresara el valor cero
        if salario == 0:
            IngresoSalario = False
            break
        
        cantTotalIngre =  cantTotalIngre + 1  
        #Creamos la lista 
        if salario > 0:
            litaSalario.append(salario)
            
        
    except ValueError:
        print('Valor ingresado no es numerico')
        cantTotalIngre = cantTotalIngre + 1  

for i in litaSalario:
    totalSalario = totalSalario + i
    
    if i <= 850000:
        salioJunior = salioJunior + 1
    elif i > 850000 and i <= 2500000:
        salioSenior = salioSenior + 1
    else:
        salioMaster = salioMaster + 1 
    
    if len(litaSalario) > 0:
        Promedio = totalSalario / len(litaSalario)
        
print("___________________________________________________")
print("_____________ Impresion de Totales_________________")
print("___________________________________________________\n")

print(f'Total de salarios ingresados : { cantTotalIngre }'  )
print(f'Total de salairos validos ingresados: { len(litaSalario) }'  )
print(f'Total de salarios : { totalSalario }'  )
print(f'Promedio de salarios { Promedio }'  )
print(f'Total de salarios Junior : { salioJunior } \nTotal de salario Senior : { salioSenior } \nTotal Salario Master : { salioMaster }')

