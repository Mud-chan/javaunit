package com.pramudya.javaunit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4; // Anda perlu mengimpor JUnit4

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class) // Menambahkan anotasi @RunWith dengan spesifikasi runner JUnit4
public class akumalastest {
    @Test
    public void testTambah() {
        akumalas kalkulator = new akumalas();

        // Angka-angka yang ingin diuji
        int angka1 = 5;
        int angka2 = 3;

        // Hasil yang diharapkan
        int hasilYangDiHarapkan = 8;

        // Melakukan penjumlahan dan membandingkannya dengan hasil yang diharapkan
        int hasil = kalkulator.tambah(angka1, angka2);
        assertEquals(hasilYangDiHarapkan, hasil);
    }
}
