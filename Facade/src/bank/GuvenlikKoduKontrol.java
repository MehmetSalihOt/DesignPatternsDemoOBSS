public class GuvenlikKoduKontrol {
 
    private int güvenlikKodu = 9999;
 
    public int getGüvenlikKodu() {
        return güvenlikKodu;
    }
 
    public boolean isKodDogru(int güvenlikKodu) {
        if (güvenlikKodu == getGüvenlikKodu()) {
            return true;
        } else {
            return false;
        }
    }
}