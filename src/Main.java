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
        Biscuit b = new Biscuit("Oreo Biscuit 12 pieces", 85, 50, m2, futureDate, false, BiscuitFlavor.Vanilla);
        System.out.println(b.getName());
        System.out.println(b.getPrice());
        System.out.println(b.getQuantity());
        System.out.println(b.getExpiryDate());
        System.out.println(b.getIsExpired());
        System.out.println(b.getFlavor());


        System.out.println("---------------");


    }
}