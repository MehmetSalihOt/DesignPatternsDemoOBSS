public class BankaIslemleri {
 
    public static void main(String[] args) {
        BankaHesabiFacade facade = new BankaHesabiFacade(12345678, 9999);
        facade.paraCek(50.00);
        facade.paraCek(900.00);
        facade.paraCek(100.00);
        facade.paraYatir(250.00);
    }
}