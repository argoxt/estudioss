# numbers = [10, 5, 7, 2, 1]
# print("Contenido de la lista original:", numbers)  # Imprimiendo el contenido de la lista original.

# numbers[0] = 111
# print("\nContenido de la lista con cambio:", numbers)  # Imprimiendo contenido de la lista con 111.

# numbers[1] = numbers[4]  # Copiando el valor del quinto elemento al segundo elemento.
# print("Contenido de la lista con intercambio:", numbers)  # Imprimiendo contenido de la lista con intercambio.

# print("\nLongitud de la lista:", len(numbers))  # Imprimiendo la longitud de la lista.

# ###

# del numbers[1]  # Eliminando el segundo elemento de la lista.
# print("Longitud de la nueva lista:", len(numbers))  # Imprimiendo nueva longitud de la lista.
# print("\nNuevo contenido de la lista:", numbers)  # Imprimiendo el contenido de la lista actual.

# ###

# numbers = [111, 7, 2, 1]
# print(numbers[-2])








hat_list = [1, 2, 3, 4, 5]  # Esta es una lista existente de números ocultos en el sombrero.
print(hat_list)

hat_list[2] = int(input("cambia el numero 3 de la lista por el que quieras: "))

print(hat_list)


del hat_list[4]

print(" longitud de la lista:", len(hat_list))

print(hat_list)

print("\nNuevo contenido de la lista:", hat_list)