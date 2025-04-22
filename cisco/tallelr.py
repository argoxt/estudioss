# Ejercicio: Crea un programa que pida edades y las clasifique en:
# Niños (0-12)
# Adolescentes (13-19)
# Adultos (20-64)
# Adultos mayores (65+)

Niños = 0
Adolescentes = 0
Adultos = 0
Adultosmayores = 0
edades = True
list_edades = []

while edades:
    try:
        edad = int(input("Ingresa tu edad (0 para terminar): "))
    
        if edad == 0:
            edades = False
            break
        # Creación de lista
        if edad > 0:
            list_edades.append(edad)
        
    except ValueError:
        print("¡Ingrese un valor numérico!")

# Ordenamos la lista de edades de menor a mayor
list_edades.sort()

print("\nEdades ingresadas (ordenadas):", list_edades)

# Clasificación de edades
for i in list_edades:
    if i <= 12:
        Niños += 1  
    elif 13 <= i <= 19:
        Adolescentes += 1
    elif 20 <= i <= 64:
        Adultos += 1
    elif i >= 65:
        Adultosmayores += 1

# Mostramos resultados
print("\nResultados:")
print(f"Niños (0-12 años): {Niños}")
print(f"Adolescentes (13-19 años): {Adolescentes}")
print(f"Adultos (20-64 años): {Adultos}")
print(f"Adultos mayores (65+ años): {Adultosmayores}")