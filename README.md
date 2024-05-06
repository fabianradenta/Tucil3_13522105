# Word Ladder Game Solution Using UCS, Greedy Best First Search, and A* Algorithms
> *Source Code* ini dibuat untuk memenuhi Tugas Kecil 3 Mata kuliah Strategi Algoritma IF2211 yaitu "MPenyelesaian Permainan Word Ladder Menggunakan Algoritma UCS, *Greedy Best First Search*, dan A*".

## Deskripsi Singkat Program
Program ini bertujuan untuk menyelesaikan permainan Word Ladder menggunakan tiga algoritma berbeda: UCS (Uniform Cost Search), Greedy Best First Search, dan A* (A Star). Permainan Word Ladder melibatkan mengubah satu kata menjadi kata lain dengan mengganti satu huruf pada setiap langkahnya, dan setiap langkah perantara juga harus membentuk kata yang valid. Program ini menerima sebuah kata awal dan sebuah kata akhir sebagai input, kemudian mencari jalur terpendek antara keduanya menggunakan algoritma yang ditentukan. Program menggunakan berbagai struktur data dan algoritma untuk mencari secara efisien melalui ruang kata dan menemukan solusi optimal.

## Requirements
- Java 21
- *Library* Java.util.*
- *Library* Java.io.*

## Cara Menjalankan Program
1. Pastikan Java sudah terpasang di perangkat anda. Status pemasangan dapat diperiksa dengan menjalankan *command* `java --version` pada *command prompt*.
2. *Clone repository* dengan *command* berikut
```
git clone https://github.com/fabianradenta/Tucil3_13522105.git
``` 
3. Masuk ke *directory* src. Pastikan mengganti `/path/to/src` dengan *path* yang benar.
```
cd /path/to/src
```
4. *Compile* program dengan *command* `Javac -d ../bin/ Main.java` 
5. *Run* program dengan *command* `Java -cp ../bin/ Main`
6. Program akan meminta masukan *start word*, *end word*, dan metode algoritma yang akan digunakan. Pastikan masukan yang diterima program benar.
6. Jika masukan yang diterima sudah benar, program akan melakukan pencarian solusi permainan Word Ladder. Jika solusi ditemukan, program akan menampilkan *path* solusi, jumlah *node* yang telah dikunjungi, dan waktu eksekusi program. Namun, jika solusi tidak ditemukan, program akan menampilkan pesan bahwa solusi tidak ditemukan dan menampilkan waktu eksekusi program.

## Author
Nama : Fabian Radenta Bangun<br>
NIM : 13522105<br>
Program Studi : Teknik Informatika<br>
Profile Github : [fabianradenta](github.com/fabianradenta)