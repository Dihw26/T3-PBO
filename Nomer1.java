/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika1;

/**
 *
 * @author LENOVO
 */
class Matematika {
    def tambah(self, a, b):
        return a + b

    def kurang(self, a, b):
        return a - b

    def kali(self, a, b):
        return a * b

class Matematika 2(Matematika):
    def modulus(self, a, b):
        return a % b

class Matematika Inheritance:
    def __init__(self):
        self.matematika1 = Matematika()
        self.matematika2 = Matematika2()

    def tambah(self, a, b):
        return self.matematika1.tambah(a, b)

    def kurang(self, a, b):
        return self.matematika1.kurang(a, b)

    def kali(self, a, b):
        return self.matematika1.kali(a, b)

    def modulus(self, a, b):
        return self.matematika2.modulus(a, b)

mat_inherit = MatematikaInheritance()
a = 10
b = 3

hasil_tambah = mat_inherit.tambah(a, b)
hasil_kurang = mat_inherit.kurang(a, b)
hasil_kali = mat_inherit.kali(a, b)
hasil_modulus = mat_inherit.modulus(a, b)

print(f"Hasil Tambah: {hasil_tambah}")
print(f"Hasil Kurang: {hasil_kurang}")
print(f"Hasil Kali: {hasil_kali}")
print(f"Hasil Modulus: {hasil_modulus}")
    
    
}
