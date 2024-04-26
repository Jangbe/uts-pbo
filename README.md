Penjelasan singkat:

* Employee: Kelas dasar yang mewakili karyawan dengan atribut nama, usia, dan gaji. Menggunakan encapsulation dengan metode getter untuk mengakses atributnya.
* Manager dan Developer: Subkelas yang mewarisi dari Employee. Setiap kelas memiliki atribut tambahan yang spesifik untuk tipe pekerjaan mereka.
* Printable: Interface yang digunakan untuk polymorphism. Mengharuskan setiap kelas yang mengimplementasikannya untuk memiliki metode displayInfo().
* printEmployeeInfo(): Metode yang menerima objek Printable dan memanggil metode displayInfo() untuk objek tersebut.

Dalam contoh penggunaan, objek Employee, Manager, dan Developer dibuat dan kemudian metode-metode yang relevan dipanggil.