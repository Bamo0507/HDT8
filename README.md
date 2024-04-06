# Sistema de Atención de Emergencias Hospitalarias

Este proyecto es una implementación de un sistema de atención de emergencias hospitalarias utilizando estructuras de datos de colas de prioridad.

## Funcionalidades

- Agregar pacientes a la cola de prioridad del hospital.
- Atender pacientes en orden de prioridad.
- Lectura de datos de pacientes desde un archivo de texto.

## Descripción detallada

### Clases

1. **App**: La clase principal del programa que contiene el método `main`. Esta clase se encarga de iniciar la aplicación, cargar los pacientes desde un archivo, agregarlos a la cola de prioridad del hospital y atenderlos en el orden adecuado. También muestra mensajes de bienvenida y despedida al usuario.

2. **Paciente**: Esta clase representa a un paciente en el hospital. Cada paciente tiene un nombre, un síntoma y un código de prioridad. Implementa la interfaz `Comparable` para que los pacientes puedan ser comparados y ordenados según su prioridad.

3. **VectorHeap**: Esta clase es una implementación de una cola de prioridad utilizando un Vector como estructura de datos subyacente. Contiene métodos para agregar elementos, eliminar el elemento de mayor prioridad, y mantener la propiedad de la cola de prioridad.

4. **VectorHeapTest**: Esta clase contiene pruebas unitarias para la clase `VectorHeap`. Utiliza el framework JUnit para verificar el funcionamiento correcto de los métodos de la cola de prioridad.

5. **Hospital**: Representa un hospital con una cola de pacientes para la atención. Permite agregar pacientes a la cola y atenderlos en el orden de prioridad.

6. **HospitalJCF**: Similar a la clase `Hospital`, pero utiliza la implementación estándar de `PriorityQueue` del Java Collections Framework en lugar de un VectorHeap personalizado.

7. **PriorityQueue**: Una interfaz que define los métodos básicos que debe tener una cola de prioridad.

8. **LectorPacientes**: Clase utilitaria para leer la información de los pacientes desde un archivo de texto.

## Cómo Utilizar

1. Clonar el repositorio.
2. Compilar el código utilizando un entorno de desarrollo Java compatible.
3. Ejecutar la clase `App.java` para probar el sistema.

## Archivo de Pacientes

El archivo `pacientes.txt` contiene la información de los pacientes en el siguiente formato:
