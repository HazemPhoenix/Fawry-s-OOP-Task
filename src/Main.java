import java.time.LocalDate;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BiscuitFlavor bf = BiscuitFlavor.Chocolate;
        BiscuitFlavor bf2 = BiscuitFlavor.Vanilla;
        BiscuitFlavor bf3 = BiscuitFlavor.Butter;
        System.out.println(bf);
        System.out.println(bf2);
        System.out.println(bf3);

        System.out.println("---------------");

        Manufacturer m = new Manufacturer("Samsung", "Suwon-si, South Korea", Sector.Technology);
        System.out.println(m.getAddress());
        System.out.println(m.getName());
        System.out.println(m.getSector());
        m.setAddress("Cairo, Egypt");
        System.out.println(m.getAddress());

        System.out.println("---------------");

        Manufacturer m2 = new Manufacturer("Mondelez", "10th of Ramadan", Sector.Food);
        LocalDate futureDate = LocalDate.now().plusMonths(1);
        Biscuit b = new Biscuit("Oreo Biscuit 12 pieces", 85, 3, m2, futureDate, false, BiscuitFlavor.Vanilla);
        System.out.println(b.getName());
        System.out.println(b.getPrice());
        System.out.println(b.getQuantity());
        System.out.println(b.getExpiryDate());
        System.out.println(b.getIsExpired());
        System.out.println(b.getFlavor());

        System.out.println("---------------");

        Manufacturer dinaFarms = new Manufacturer("Dina Farms", "Cairo-Alexandia desert road", Sector.Food);
        Cheese creamCheese = new CreamCheese("Dina Farms Cream Cheese Spread", 93, 2, dinaFarms, futureDate, false, 0.275f);
        System.out.println(creamCheese.getName());
        System.out.println(creamCheese.getPrice());
        System.out.println(creamCheese.getQuantity());
        System.out.println(creamCheese.getManufacturer().getName());
        System.out.println(creamCheese.getExpiryDate());
        System.out.println(creamCheese.getIsExpired());

        System.out.println("---------------");

        Cheese cheddarCheese = new CheddarCheese("Dina Farms Cheddar Cheese Spread", 84, 5, dinaFarms, futureDate, false, 0.275f);
        System.out.println(cheddarCheese.getName());
        System.out.println(cheddarCheese.getPrice());
        System.out.println(cheddarCheese.getQuantity());
        System.out.println(cheddarCheese.getManufacturer().getName());
        System.out.println(cheddarCheese.getExpiryDate());
        System.out.println(cheddarCheese.getIsExpired());

        System.out.println("---------------");

    }
}