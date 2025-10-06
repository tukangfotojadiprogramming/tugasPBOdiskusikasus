# tugasPBOdiskusikasus
Inheritance, Polymorphism, Abstract Class atau Interface, dan Array of Object.

# SISTEM PEMBAYARAN
<img width="1908" height="891" alt="SISTEM PEMBAYARAN PBO" src="https://github.com/user-attachments/assets/80a02142-2b39-4206-8f49-692559a13efb" />
**Deskripsi**
Simulasi sistem pembayaran sederhana yang dirancang dengan menerapkan konsep Object-Oriented Programming (OOP). Sistem ini memisahkan tanggung jawab setiap komponen ke dalam kelas-kelas yang spesifik, seperti kelas Product untuk merepresentasikan barang belanjaan dan kelas Payment sebagai kelas induk bagi berbagai metode pembayaran. Program mendukung beberapa jenis transaksi, yaitu pembayaran tunai melalui kelas CashPayment, pembayaran menggunakan kartu kredit melalui kelas CreditCardPayment, serta pembayaran digital melalui kelas EWalletPayment. Selain mampu memproses transaksi dan menampilkan daftar belanja dalam bentuk array of objects, program ini juga dilengkapi dengan fitur refund untuk metode pembayaran tertentu seperti E-Wallet, sehingga memberikan fleksibilitas dan kemiripan dengan sistem pembayaran nyata.
**Konsep yang Diterapkan**
_Inheritance (Pewarisan)_
Inheritance digunakan untuk menurunkan sifat dari kelas induk `Payment` ke berbagai jenis metode pembayaran. Setiap kelas turunan mewarisi atribut `transactionId` dan `amount`, serta mengimplementasikan perilaku spesifik masing-masing. Atribut serta metode umum dari kelas `Payment` kemudian diwariskan ke beberapa kelas turunan, yaitu `CashPayment`, `CreditCardPayment` dan `EWalletPayment`.
_Polymorphism_
Polymorphism muncul ketika objek Payment dapat mengacu pada berbagai bentuk objek turunan (CashPayment, CreditCardPayment, EWalletPayment) dan memanggil metode processPayment() yang sesuai secara dinamis.
_Abstract Class_
Payment didefinisikan sebagai abstract class karena hanya menjadi kerangka dasar untuk berbagai jenis pembayaran, tanpa implementasi langsung dari metode `processPayment()`.
_Interface_
Interface `Refundable` digunakan untuk menetapkan kontrak perilaku tambahan bagi kelas yang ingin mendukung refund (pengembalian dana). Tidak semua metode pembayaran wajib memiliki fitur refund.
_Array of Object_
Program ini menyimpan data daftar belanja menggunakan array of objects dari kelas Product. Setiap objek Product merepresentasikan satu jenis barang yang memiliki atribut seperti nama produk, harga satuan, dan jumlah pembelian. Contohnya, array products berisi tiga objek yaitu Indomie Goreng, Aqua Botol, dan Kopi Kapal Api dengan harga dan jumlah masing-masing. Setelah data produk dimasukkan, program melakukan perhitungan total belanja dengan menjumlahkan nilai subtotal dari setiap produk melalui perulangan for-each. Di dalam perulangan tersebut, metode getSubtotal() digunakan untuk menghitung total harga tiap produk (harga × jumlah), sedangkan metode showProduct() menampilkan rincian produk secara berurutan di layar. Dengan demikian, seluruh daftar belanja dan total pembayaran dapat ditampilkan secara sistematis dan mudah dipahami.
