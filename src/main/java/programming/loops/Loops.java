package programming.loops;

public class Loops {

        private static final int DECIMAL_BASE = 10;
        private static final int BINARY_BASE = 2;
        private static final int SMALLEST_PRIME = 2;
        private static final int TABLE_LIMIT = 10;

        // PARTE A


        // A1. Suma desde 1 hasta limit

        public static int sumTo(int limit) {
            int suma = 0;

            for (int i = 1; i <= limit; i++) {
                suma += i;
            }

            return suma;
        }


        // A2. Factorial

        public static long factorial(int number) {
            long factorial = 1;

            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            return factorial;
        }


        // A3. Contar dígitos

        public static int countDigits(int number) {
            int contador = 0;
            number = Math.abs(number);

            if (number == 0) {
                return 1;
            }

            while (number > 0) {
                number /= DECIMAL_BASE;
                contador++;
            }

            return contador;
        }


        // A4. Cuenta regresiva

        public static String countdown(int start) {
            String resultado = "";

            for (int i = start; i >= 1; i--) {
                resultado += i + " ";
            }

            return resultado + "¡Despegue!";
        }



        // PARTE B


        // B1. Suma de dígitos

        public static int digitSum(int number) {
            int suma = 0;
            number = Math.abs(number);

            while (number > 0) {
                suma += number % DECIMAL_BASE;
                number /= DECIMAL_BASE;
            }

            return suma;
        }


        // B2. Invertir número

        public static int reverse(int number) {
            int invertido = 0;

            while (number > 0) {
                int digito = number % DECIMAL_BASE;
                invertido = invertido * DECIMAL_BASE + digito;
                number /= DECIMAL_BASE;
            }

            return invertido;
        }


        // B3. Determinar si es primo

        public static boolean isPrime(int number) {

            if (number < SMALLEST_PRIME) {
                return false;
            }

            for (int i = SMALLEST_PRIME; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }

            return true;
        }


        // B4. Máximo común divisor

        public static int gcd(int first, int second) {

            while (second != 0) {
                int residuo = first % second;
                first = second;
                second = residuo;
            }

            return first;
        }


        // B5. Tabla de multiplicar

        public static String multiplicationTable(int number) {
            String resultado = "";

            for (int i = 1; i <= TABLE_LIMIT; i++) {
                resultado += number + " x " + i + " = "
                        + (number * i) + "\n";
            }

            return resultado;
        }



        // PARTE C


        // C1. Número perfecto

        public static boolean isPerfect(int number) {
            int suma = 0;

            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    suma += i;
                }
            }

            return number > 0 && suma == number;
        }


        // C2. Convertir a binario

        public static String toBinary(int number) {

            if (number == 0) {
                return "0";
            }

            String binario = "";

            while (number > 0) {
                int residuo = number % BINARY_BASE;
                binario = residuo + binario;
                number /= BINARY_BASE;
            }

            return binario;
        }


        // C3. Conjetura de Collatz

        public static int collatzSteps(int number) {
            int pasos = 0;

            while (number != 1) {

                if (number % 2 == 0) {
                    number /= 2;
                } else {
                    number = 3 * number + 1;
                }

                pasos++;
            }

            return pasos;
        }


        // C4. Triángulo de asteriscos


        public static String triangle(int rows) {
            String resultado = "";

            for (int i = 1; i <= rows; i++) {

                for (int j = 1; j <= i; j++) {
                    resultado += "*";
                }

                resultado += "\n";
            }

            return resultado;
        }
    }
