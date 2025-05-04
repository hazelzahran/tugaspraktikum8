// Interface yang mendefinisikan kontrak bahwa setiap kelas yang mengimplementasikannya 
// harus memiliki method getPayableAmount() untuk menghitung jumlah yang harus dibayar
public interface Payable {
    int getPayableAmount();
}
