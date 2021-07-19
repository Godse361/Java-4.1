public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int bonusMile = service.calculate(1000, 20);
        System.out.println("Вы получили " + bonusMile + " бонусных миль.");
    }
}
