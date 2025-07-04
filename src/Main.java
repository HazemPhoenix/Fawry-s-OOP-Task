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

        Manufacturer m = new Manufacturer("Samsung", "Suwon-si, South Korea", Sector.Technology);
        System.out.println(m.getAddress());
        System.out.println(m.getName());
        System.out.println(m.getSector());
        m.setAddress("Cairo, Egypt");
        System.out.println(m.getAddress());

    }
}