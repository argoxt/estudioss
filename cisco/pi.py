def clasificar_salarios():
    salarios = []
    print("Introduce los salarios (escribe 'fin' para terminar):")
    
    while True:
        entrada = input("Salario: ")
        if entrada.lower() == 'fin':
            break
        try:
            salario = float(entrada)
            salarios.append(salario)
        except ValueError:
            print("Por favor, introduce un número válido.")
    
    if not salarios:
        print("No se introdujeron salarios.")
        return

    salarios.sort(reverse=True)
    clasificacion = {
        "Junior": [],
        "Senior": [],
        "Master": []
    }

    for salario in salarios:
        if salario < 30000:
            clasificacion["Junior"].append(salario)
        elif 30000 <= salario < 60000:
            clasificacion["Senior"].append(salario)
        else:
            clasificacion["Master"].append(salario)

    print("\nClasificación de salarios:")
    for nivel, lista in clasificacion.items():
        print(f"{nivel}: {lista}")

if __name__ == "__main__":
    clasificar_salarios()