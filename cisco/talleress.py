# Ejercicio: Crea un programa que pida al usuario ingresar 5 números y luego muestre:

# La lista completa

# El número mayor

# El número menor

# La suma total
listaNum= []
sumatotal=0
ingresoNumeros=True
cantidadTotal=0

while ingresoNumeros:
    try:
        numeros= int(input("ingresa 5 numeros, 0 para finalizar: "))
        
        #validamos que sea 0
        if numeros ==0:
            ingresoNumeros = False
            break
        
        cantidadTotal += 1
        
        #creacion de lista
        if numeros > 0 :
            listaNum.append(numeros)
            
            #control de errores
    except ValueError:
        print("ingrese un valor numerico")
        
mayor=max(listaNum)
print(f"el valor maximo es: {mayor}")
menor= min(listaNum )
print("el valor minimo es: ", menor)
suma_total= sum(listaNum)
print("la suma total es: ", suma_total)
        
        
        
        
        
        
        
        
        
        
print(listaNum)

        