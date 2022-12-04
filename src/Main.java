public class Main {
    public static void main(String[] args) {
        //Задание 1
        int age = 17;
        if (age >= 18) {
            System.out.println("Позравляем с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия еще не наступил. Подожди немного!");
        }

        //Задание 2
        int age2 = 5;
        if (age2 >= 24) {
            System.out.println("Окончил ВУЗ и пора искать работу");
        } else
        if (age2 >= 18) {
            System.out.println("Уже закончил школу и можно отправляться в ВУЗ");
        } else
        if (age2 >= 7) {
            System.out.println("Ребенок ходит в школу");
                        } else {
            System.out.println("Еще маленький, ходит в детсад");
        }







           }
}