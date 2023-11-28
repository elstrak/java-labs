import java.util.ArrayList;
import java.util.List;
public class MasterOrder {
    private List<CookieOrder> orders;
    public MasterOrder() {
        orders = new ArrayList<CookieOrder>();
    }
    public void addOrder(CookieOrder theOrder) {
        orders.add(theOrder);
    }
    public int getTotalBoxes() {
        int summa = 0;
        for (int i = 0; i < orders.size(); i++) {
            summa += orders.get(i).getNumBoxes();
        }
        return summa;
    }
    public int removeVariety(String cookieVar) {
        int boxes = 0;
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getVariety() == cookieVar) {
                orders.remove(i);
            i--;
            boxes++;
            }
        }
        return boxes;
    }

    public static void main(String[] args) {
        MasterOrder goodies = new MasterOrder();
        goodies.addOrder(new CookieOrder("Chocolate Chip", 1));
        goodies.addOrder(new CookieOrder("Shortbread", 5));
        goodies.addOrder(new CookieOrder("Macaroon", 2));
        goodies.addOrder(new CookieOrder("Chocolate Chip", 3));
        System.out.println(goodies.orders);
        System.out.println("Всего: " + goodies.getTotalBoxes());
        System.out.println(goodies.removeVariety("Chocolate Chip"));
        System.out.println(goodies.orders);
        System.out.println("Всего: " + goodies.getTotalBoxes());
        System.out.println(goodies.removeVariety("Macaroon"));
        System.out.println(goodies.orders);
        System.out.println("Всего: " + goodies.getTotalBoxes());
    }
}


