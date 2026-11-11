public class CafeApp {

    public static void main(String[] args) {
        Customer Ryan = new Customer("Ryan Pasquin", true);
        Customer Jerson = new Customer("Jerson Cataylo", false);

        Beverage icedCoke = new Beverage(" Iced Coke", 95.0, "B-01", "L");
        Pastry ensaymada = new Pastry(" Ensaymada", 45.0, "P-01", true);
        Meal porksabaw = new Meal(" Nilat-ang Baboy w/ rice", 110.0, "M-01", true, 1);
        Pastry extraCookie = new Pastry(" Cookie", 25.0, "P-02", false);

        Order order1 = new Order("1001", Ryan);
        order1.addItem(icedCoke);
        order1.addItem(ensaymada);
        order1.addItem(porksabaw);

        order1.printReceipt();

        Beverage testBeverage = new Beverage();
        testBeverage.setBaseprice(-5);
        testBeverage.setBaseprice(80.0);

        Beverage IcedCoffee = new Beverage();
        IcedCoffee.setName(" Iced Coffee");
        IcedCoffee.setItemCode("B-02");
        IcedCoffee.setBaseprice(80.0);
        IcedCoffee.setSize("M");

        Meal Munggos = new Meal(" Munggos", 130.0, "M-02", false, 0);

        Order order2 = new Order("1002", Jerson);
        order2.addItem(IcedCoffee);
        order2.addItem(Munggos);

        order2.printReceipt(20.0);
    }
}