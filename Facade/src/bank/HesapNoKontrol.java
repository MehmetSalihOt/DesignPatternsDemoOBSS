public class HesapNoKontrol {
 
    private int hesapNo = 12345678;
 
    public int getHesapNo() {
        return hesapNo;
    }
 
    public boolean isHesapAktif(int hesapNo) {
        if (hesapNo == getHesapNo()) {
            return true;
        } else {
            return false;
        }
    }
}