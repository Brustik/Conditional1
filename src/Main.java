public class Main {
    public static void main(String[] args) {
        //Задание 1
        int age = 17;
        if (age >= 18) {
            System.out.println("Позравляем с совершеннолетием!");
        } else {
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

        //Задаине 3
        int totalVanPlaces = 102;
        int vanSeatPlaces = 60;
        int passangers = 49;
        if (passangers >= totalVanPlaces) {
            System.out.println("Вагон переполнен");
        } else if (passangers >= vanSeatPlaces) {
            System.out.println("В вагоне остались только стоячие места");
        } else {
            System.out.println("В вагоне еще остались сидячие места");
        }

        //Задаине 3.1
        int age3 = 29;
        if (age3 >=2 && age3 <= 6 ) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в детский сад");
        } else if (age3 > 6 && age3 <=18) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в школу");
        } else if (age3 > 18 && age3 <=24) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в ВУЗ");
        } else {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить на работу");
        }

        //Задание 3.2
        int age4 = 9;
        if (age4 <= 5) {
            System.out.println("Ребенку нельзя кататься на атракционе");
        } else if (age4 > 5 && age4 <=14) {
            System.out.println("Ребенку можно кататься на атракционе только в сопровождении взрослого");
        } else {
            System.out.println("Ребенку можно кататься на атракционе одному");
        }




    }
}