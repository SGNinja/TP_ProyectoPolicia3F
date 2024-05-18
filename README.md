# Trabajo Practico Final - Java Inicial Tecno3F

## Requerimientos

### Policía
- Nombre
- Apellido
- Legajo

### Arma
- Cantidad de municiones
- Alcance aproximado en metros
- Marca
- Calibre
- Estado ("NUEVA", "EN MANTENIMIENTO", "EN USO")
- Asociada a un policía

### Tipos de Armas
- Armas Cortas
 - Automática (booleano)
- Armas Largas
 - Sello del RENAR (booleano)
 - Descripción justificando su uso
 - Nivel del arma (1 al 5)

## Funcionalidades

### Arma en Condiciones
Un arma está en condiciones para ser usada por un policía en un enfrentamiento si:
- Estado: "EN USO"
- Calibre >= 9

### Comparación de Armas Largas
Un arma larga es mayor a otra si tiene mayor nivel.

### Disparar Arma Corta a más de 200m
Funcionalidad para saber si un arma corta se puede disparar a más de 200m.
