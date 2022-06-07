/*#1 Создать класс для математических вычислений:
Содержит 4 статических метода на сложение, вычитание, умножение, деление.
Обработать ошибку деления на ноль.
Методы должны быть Generic и принимать данные в разных форматах (строка, число)*/

public class Mat{

    //Сложение
    public static <T> void plus(T first, T second){
        System.out.println(Integer.parseInt(String.valueOf(first)) + Integer.parseInt(String.valueOf(second)));
    }
    //Вычитание
    public static <T> void minus(T first, T second){
        System.out.println(Integer.parseInt(String.valueOf(first)) - Integer.parseInt(String.valueOf(second)));
    }
    //Умножение
    public static <T> void multiplication(T first, T second){
        System.out.println(Integer.parseInt(String.valueOf(first)) * Integer.parseInt(String.valueOf(second)));
    }
    //Деление
    public static <T> void Division(T first, T second){
        try {
            System.out.println(Integer.parseInt(String.valueOf(first)) / Integer.parseInt(String.valueOf(second)));
        }catch (Exception e){
            System.out.println(" Делить на 0 нельзя");
        }

    }


    public static void main(String[] args){

        String num1 = "5";
        String num2 = "1";
        int num3 = 5;
        int num4 = 0;

        System.out.println("Сложение строк");
        Mat.<String>plus(num1, num2);
        System.out.println("Сложение чисел");
        Mat.<Integer>plus(num3, num4);

        System.out.println("Вычитание строк");
        Mat.<String>minus(num1, num2);
        System.out.println("Вычитание чисел");
        Mat.<Integer>minus(num3, num4);

        System.out.println("Умножение строк");
        Mat.<String>multiplication(num1, num2);
        System.out.println("Умножение чисел");
        Mat.<Integer>multiplication(num3, num4);

        System.out.println("Деление строк");
        Mat.<String>Division(num1, num2);
        System.out.println("Деление чисел");
        Mat.<Integer>Division(num3, num4);
    }
}

