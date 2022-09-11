public class Main {
    public static void main(String[] args) {
        System.out.println("Переменные.Часть 1");
        System.out.println("Задание 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println("Задание 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        System.out.println("Задание 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        System.out.println("Задание 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);

        System.out.println("Задание 6");
        var boxer1 = 78.2;
        System.out.println("Вес первого боксера " + boxer1);
        var boxer2 = 82.7;
        System.out.println("Вес второго боксера " + boxer2);
        var sumBoxers = boxer1 + boxer2;
        System.out.println("Общий вес двух бойцов " + sumBoxers);

        System.out.println("Задание 7");
        var differenceBoxers = boxer2 - boxer1;
        System.out.println("Разница между весами бойцов " + differenceBoxers);
        var differenceBoxers2 = boxer2 % boxer1;
        System.out.println("Разница между весами бойцов " + differenceBoxers2);

        System.out.println("Задание 8");
        var allTime = 640;
        var individualTime = 8;
        var people = allTime / individualTime;
        System.out.println("Всего работников в компании " + people + " человек");
        people = people + 94;
        var newTime = people * 8;
        System.out.println("Если в компании работает " + people + " человека, то всего " + newTime + " часа работы может быть поделено между сотрудниками");

    }

}