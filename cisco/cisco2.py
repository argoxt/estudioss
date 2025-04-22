cantTotalIngre = 0
cantValiIngre = 0
totalSalario = 0
salioJunior = 0
salioSenior = 0
salioMaster = 0
IngresoSalario = True

while IngresoSalario:
    try:
        
        salario = float(input("Ingrese el salario, cero para finalizar el ingreso: "))
        
        # Valida que se ingresara el valor cero
        if salario == 0:
            IngresoSalario = False
            break
        
        cantTotalIngre =  cantTotalIngre + 1  
         
        if salario > 0:
            totalSalario = totalSalario + salario
            cantValiIngre = cantValiIngre + 1
            
            if salario <= 850000:
                salioJunior = salioJunior + 1
            elif salario > 850000 and salario <= 2500000:
                salioSenior = salioSenior + 1
            else:
                salioMaster = salioMaster + 1 
                
    except ValueError:
        print('Valor ingresado no es numerico')
        cantTotalIngre = cantTotalIngre + 1  


if cantValiIngre > 0:
        Promedio = totalSalario / cantValiIngre

        
print("___________________________________________________")
print("_____________ Impresion de Totales_________________")
print("___________________________________________________\n")

print(f'Total de salarios ingresados : { cantTotalIngre }'  )
print(f'Total de salairos validos ingresados: { cantValiIngre}'  )
print(f'Total de salarios : { totalSalario }'  )
print(f'Promedio de salarios { Promedio }'  )
print(f'Total de salarios Junior : { salioJunior } \nTotal de salario Senior : { salioSenior } \nTotal Salario Master : { salioMaster }')
