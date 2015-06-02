public class BankaHesabiFacade {
 
    private int hesapNo;
    private int guvenlikKodu;
    HesapNoKontrol hesapNoKontrol;
    GuvenlikKoduKontrol guvenlikKoduKontrol;
    BakiyeKontrol bakiyeKontrol;
    Duyuru duyuru;
 
    public BankaHesabiFacade(int hesapNo, int guvenlikKodu) {
        this.hesapNo = hesapNo;
        this.guvenlikKodu = guvenlikKodu;
 
        duyuru = new Duyuru();
        hesapNoKontrol = new HesapNoKontrol();
        guvenlikKoduKontrol = new GuvenlikKoduKontrol();
        bakiyeKontrol = new BakiyeKontrol();
    }
 
    public int getHesapNo() {
        return hesapNo;
    }
 
    public int getGuvenlikKodu() {
        return guvenlikKodu;
    }
 
    public void paraCek(double miktar) {
        if (hesapNoKontrol.isHesapAktif(getHesapNo()) && guvenlikKoduKontrol.isKodDogru(getGuvenlikKodu())
                && bakiyeKontrol.isHesaptaParaVar(miktar)) {
            System.out.println("İşlem başarılı\n");
        } else {
            System.out.println("İşlem başarısız\n");
        }
    }
 
    public void paraYatir(double miktar) {
        if (hesapNoKontrol.isHesapAktif(getHesapNo()) && guvenlikKoduKontrol.isKodDogru(getGuvenlikKodu())) {
            bakiyeKontrol.paraYatir(miktar);
            System.out.println("İşlem başarılı\n");
        } else {
            System.out.println("İşlem başarısız\n");
        }
    }
}