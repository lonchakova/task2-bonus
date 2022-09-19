public class Main {
    public static void main(String[] args) {
        int account = 200;
        int replenishmentAmount = 1001;
        int result;

        result = replenishmentAmount > 1000 ? account + replenishmentAmount + (replenishmentAmount / 100) :
                account + replenishmentAmount;

        System.out.println("Сумма на счете равна " + result + " рублей");
    }
}