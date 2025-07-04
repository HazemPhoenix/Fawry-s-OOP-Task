import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class EcommerceTester {
    public static void main(String[] args) {

        Manufacturer mondelez = new Manufacturer("Mondelez", "10th of Ramadan", Sector.Food);
        Manufacturer samsung = new Manufacturer("Samsung", "Suwon-si, South Korea", Sector.Technology);
        Manufacturer dinaFarms = new Manufacturer("Dina Farms", "Cairo-Alexandia desert road", Sector.Food);
        Manufacturer vodafone = new Manufacturer("Vodafone", "Smart Village, Giza", Sector.Technology);

        LocalDate futureDate = LocalDate.now().plusMonths(1);
        Biscuit b = new Biscuit("Oreo Biscuit 12 pieces", 85, 43, mondelez, futureDate, false, BiscuitFlavor.Vanilla);

        Cheese cheddarCheese = new CheddarCheese("Dina Farms Cheddar Cheese Spread", 84, 56, dinaFarms, futureDate, false, 0.275f);
        Cheese blueCheese = new BlueCheese("Dina Farms Blue Cheese", 100, 39, dinaFarms, futureDate, false, 0.275f);
        Cheese creamCheese = new CreamCheese("Dina Farms Cream Cheese Spread", 93, 32, dinaFarms, futureDate, false, 0.275f);
        Cheese mozzarellaCheese = new MozzarellaCheese("Dina Farms Mozzarella Cheese", 120, 45, dinaFarms, futureDate, false, 0.275f);

        MobileScratchCard sc = new MobileScratchCard("Fakka Card", 26, 53, vodafone, false, 0.75f);

        TV tv = new TV("Samsung 43 Inch TV Crystal Processor 4K LED", 14000d, 26, samsung, 43f, 8.1f);

        MobilePhone mobilePhone = new MobilePhone("Samsung Galaxy S25 Ultra AI Phone, 256GB Storage, 12GB RAM", 59700d, 21, samsung, 6.9f, 12, 256, 12f, 200f);

        Cart cart = new Cart();
        cart.addItem(sc, 5);
        cart.addItem(tv, 1);
        cart.addItem(mobilePhone, 1); // this throws an IllegalArgumentException because the quantity is more than what's available
        cart.addItem(mozzarellaCheese, 3);
        cart.printReceipt();

        System.out.println("---------------");

        cart.removeItem(tv);
        cart.printReceipt();


//        BiscuitFlavor bf = BiscuitFlavor.Chocolate;
//        BiscuitFlavor bf2 = BiscuitFlavor.Vanilla;
//        BiscuitFlavor bf3 = BiscuitFlavor.Butter;
//        System.out.println(bf);
//        System.out.println(bf2);
//        System.out.println(bf3);

//        System.out.println("---------------");

//        System.out.println(samsung.getAddress());
//        System.out.println(samsung.getName());
//        System.out.println(samsung.getSector());
//        samsung.setAddress("Cairo, Egypt");
//        System.out.println(samsung.getAddress());
//        samsung.setAddress("Suwon-si, South Korea");

//        System.out.println("---------------");

//        System.out.println(b.getName());
//        System.out.println(b.getPrice());
//        System.out.println(b.getQuantity());
//        System.out.println(b.getExpiryDate());
//        System.out.println(b.getIsExpired());
//        System.out.println(b.getFlavor());

//        System.out.println("---------------");

//        System.out.println(creamCheese.getName());
//        System.out.println(creamCheese.getPrice());
//        System.out.println(creamCheese.getQuantity());
//        System.out.println(creamCheese.getType());
//        System.out.println(creamCheese.getManufacturer().getName());
//        System.out.println(creamCheese.getExpiryDate());
//        System.out.println(creamCheese.getIsExpired());

//        System.out.println("---------------");

//        System.out.println(cheddarCheese.getName());
//        System.out.println(cheddarCheese.getPrice());
//        System.out.println(cheddarCheese.getQuantity());
//        System.out.println(cheddarCheese.getType());
//        System.out.println(cheddarCheese.getManufacturer().getName());
//        System.out.println(cheddarCheese.getExpiryDate());
//        System.out.println(cheddarCheese.getIsExpired());

//        System.out.println("---------------");

//        System.out.println(blueCheese.getName());
//        System.out.println(blueCheese.getPrice());
//        System.out.println(blueCheese.getQuantity());
//        System.out.println(blueCheese.getType());
//        System.out.println(blueCheese.getManufacturer().getName());
//        System.out.println(blueCheese.getExpiryDate());
//        System.out.println(blueCheese.getIsExpired());

//        System.out.println("---------------");

//        System.out.println(mozzarellaCheese.getName());
//        System.out.println(mozzarellaCheese.getPrice());
//        System.out.println(mozzarellaCheese.getQuantity());
//        System.out.println(mozzarellaCheese.getType());
//        System.out.println(mozzarellaCheese.getManufacturer().getName());
//        System.out.println(mozzarellaCheese.getExpiryDate());
//        System.out.println(mozzarellaCheese.getIsExpired());

//        System.out.println("---------------");

//        System.out.println(sc.getName());
//        System.out.println(sc.getPrice());
//        System.out.println(sc.getQuantity());
//        System.out.println(sc.getManufacturer().getName());
//        System.out.println(sc.getCapacityInGB() + "GB");
//        System.out.println(sc.getIsUsed());
//        sc.use();
//        System.out.println(sc.getIsUsed());


//        System.out.println("---------------");

//        System.out.println(tv.getName());
//        System.out.println(tv.getPrice());
//        System.out.println(tv.getQuantity());
//        System.out.println(tv.getManufacturer().getName());
//        System.out.println(tv.getScreenSizeInInches());
//        System.out.println(tv.getWeight());

//        System.out.println("---------------");

//        System.out.println(mobilePhone.getName());
//        System.out.println(mobilePhone.getPrice());
//        System.out.println(mobilePhone.getQuantity());
//        System.out.println(mobilePhone.getManufacturer().getName());
//        System.out.println(mobilePhone.getScreenSizeInInches());
//        System.out.println(mobilePhone.getRAM() + "GB");
//        System.out.println(mobilePhone.getStorageInGB() + "GB");
//        System.out.println(mobilePhone.getFrontCameraQualityInMegaPixels() + " Megapixels");
//        System.out.println(mobilePhone.getBackCameraQualityInMegaPixels() + " Megapixels");

//        System.out.println("---------------");

    }
}