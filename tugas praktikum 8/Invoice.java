// Kelas Invoice merepresentasikan satu item belanjaan karyawan di koperasi
public class Invoice implements Payable {
    private String productName;     // Nama produk yang dibeli
    private int quantity;           // Jumlah produk yang dibeli
    private int pricePerItem;       // Harga per item produk

    // Konstruktor untuk inisialisasi objek Invoice
    public Invoice(String productName, int quantity, int pricePerItem) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    // Menghitung total harga untuk invoice ini (jumlah x harga per item)
    @Override
    public int getPayableAmount() {
        return quantity * pricePerItem;
    }

    // Mengubah objek Invoice menjadi format string untuk ditampilkan
    @Override
    public String toString() {
        return productName + " x" + quantity + " @ " + pricePerItem + " = " + getPayableAmount();
    }
}
