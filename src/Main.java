public class Main {
    public static void main(String[] args) {

        System.out.println("Добрый день!");
        int amountTicket = 1000;
        System.out.println("Стоимость билета " + amountTicket + " руб.");
        System.out.println("У нас работает бонусная программа, за каждые 20 рублей стоимости билета" +
                " вам будет начисляться 1 бесплатная бонусная миля.");
        int amountOneMiles = 20;
        int bonusMiles = amountTicket / amountOneMiles;


        System.out.println("Ваш бонус составляет " + bonusMiles + " миль.");


    }
}
