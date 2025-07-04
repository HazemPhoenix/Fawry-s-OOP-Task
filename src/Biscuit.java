import java.time.LocalDate;

public class Biscuit extends ExpirableProduct  {
      private BiscuitFlavor flavor;

      public Biscuit(String name, double price, int quantity, Manufacturer manufacturer, LocalDate expiryDate, Boolean isExpired, BiscuitFlavor flavor) {
        super(name, price, quantity, manufacturer, expiryDate, isExpired);
        this.flavor = flavor;
      }

      public BiscuitFlavor getFlavor() {
          return this.flavor;
      }

      public void setFlavor(BiscuitFlavor flavor) {
          this.flavor = flavor;
      }
}
