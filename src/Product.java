public abstract class Product {
    public String isim;
    public int id;
    public double fiyat;
    public Product(String isim, int id, double fiyat){
        this.fiyat=fiyat;
        this.id=id;
        this.isim=isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public String getIsim() {
        return isim;
    }

    public int getId() {
        return id;
    }

    public double getFiyat() {
        return fiyat;
    }
}
