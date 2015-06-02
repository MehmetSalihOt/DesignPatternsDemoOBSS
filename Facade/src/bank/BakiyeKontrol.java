public class BakiyeKontrol {
 
    private double bakiye = 1000.00;
 
    public double getBakiye() {
        return bakiye;
    }
 
    public void hesabiArttir(double miktar) {
        bakiye += miktar;
    }
 
    public void hesabiAzalt(double miktar) {
        bakiye -= miktar;
    }
 
    public boolean isHesaptaParaVar(double miktar) {
        if (miktar > getBakiye()) {
            System.out.println("Hesabınızdan " + miktar + " TL çekmek istiyorsunuz\n fakat hesabınızda yeterli bakiye bulunmamakta!");
            System.out.println("Mevcut bakiye : " + getBakiye());
            return false;
        } else {
            hesabiAzalt(miktar);
            System.out.println("Hesabınızdan " + miktar + " TL çektiniz!");
            System.out.println("Mevcut bakiye : " + getBakiye());
            return true;
        }
    }
 
    public void paraYatir(double miktar) {
        hesabiArttir(miktar);
        System.out.println("Hesabınıza " + miktar + " TL yatırdınız!");
        System.out.println("Mevcut bakiye : " + getBakiye());
    }
}