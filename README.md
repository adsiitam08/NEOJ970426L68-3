# NEOJ970426L68-3

Es una solucin MUCHO más eficiente al problema 2.

Funciona por lo siguiente:

1. Asumamos que tenemos una cadena de longitud n compuesta de caracteres donde : representa la concateación
c_1:c_2:...:c_n

2. La concatenamos:
c_1:...:c_n:c_(n+1):...:c_2n

3. Sacamos el substring de 1 a length-1:
c_2:...:c_(2n-1)

4. Sabemos que al no contemplar c_1 no cubre el caso en el que el substring es el string completo

5. Al concatenar dos veces la cadena, y hacerle substring (NO DEBEN DE CONTEMPLARSE EL PRIMERO NI EL ÚLTIMO char) aseguramos que la misma cadena este contenida ahí si y solo si puede ser construido por algn subtring de la cadena orginal.
