// Kelas Employee merepresentasikan data karyawan beserta daftar belanjaannya
public class Employee implements Payable {
    private int registrationNumber;     // Nomor registrasi karyawan
    private String name;                // Nama karyawan
    private int salaryPerMonth;         // Gaji bulanan karyawan
    private Invoice[] invoices;         // Daftar belanjaan karyawan dalam bentuk array Invoice

    // Konstruktor untuk inisialisasi data karyawan dan daftar belanjaannya
    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    // Menghitung gaji bersih setelah dipotong total belanja di koperasi
    @Override
    public int getPayableAmount() {
        int totalInvoice = 0;
        for (Invoice inv : invoices) {
            totalInvoice += inv.getPayableAmount();  // Menjumlahkan semua nilai belanjaan
        }
        return salaryPerMonth - totalInvoice;        // Gaji setelah potongan
    }

    // Menampilkan informasi lengkap karyawan dan detail belanjaannya
    public void printEmployeeDetails() {
        System.out.println("Nama: " + name);
        System.out.println("No. Registrasi: " + registrationNumber);
        System.out.println("Gaji Bulanan: " + salaryPerMonth);
        System.out.println("Daftar Belanja:");
        for (Invoice inv : invoices) {
            System.out.println(" - " + inv);         // Menampilkan setiap invoice
        }
        System.out.println("Gaji Setelah Potongan: " + getPayableAmount());
    }
}
