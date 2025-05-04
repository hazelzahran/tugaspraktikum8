// Kelas utama (entry point) untuk menjalankan simulasi belanja karyawan
public class Main {
    public static void main(String[] args) {
        // Membuat array invoice untuk belanjaan karyawan
        Invoice[] belanja = {
            new Invoice("Pulpen", 5, 2000),
            new Invoice("Buku", 2, 10000),
            new Invoice("Penggaris", 1, 5000)
        };

        // Membuat objek Employee dengan data dan belanjaannya
        Employee emp = new Employee(12345, "Budi", 3000000, belanja);

        // Menampilkan informasi lengkap karyawan dan belanja
        emp.printEmployeeDetails();
    }
}
