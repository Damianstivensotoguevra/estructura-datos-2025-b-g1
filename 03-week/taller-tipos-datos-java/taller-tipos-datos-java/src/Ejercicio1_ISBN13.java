/*clase de verificación de los 13 digitos */
public class Ejercicio1_ISBN13 {
public static boolean isValidISBN13(String isbn) {

/*valida que tenga los 13 digitos mediante el condicional  */    
if (isbn == null || isbn.length() != 13 )
 return false;

int suma = 0 ;


/*Recorre la cadena desde  0 hasta  alcanzar la longitud establecida */
for (int i = 0; i < isbn.length(); i++) {

/*obtiene la posicion del caracter i  */
char c = isbn.charAt(i);

/* Verifica que cada carácter sea un número; si encuentra alguno que no lo sea, devuelve false */
if (!Character.isDigit(c))
return false;

/*convierte  los caracteres a numero */
int d = c -'0';

/* Multiplica el dígito por 1 si la posición es par, o por 3 si es impar*/ 
suma += d * (i % 2 == 0?1:3);

}
/* verifica que sea el numero sea un isbn */
return suma % 10 ==0;

}


/* donde se prueba la validación  */
public static void main(String[] args) {

/*valor de prueba isbn */
String prueba = "9780306406157";

/*  se imprime  */
System.out.println("ISBN válido? " + isValidISBN13(prueba));

}

}