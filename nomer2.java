/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika1;

/**
 *
 * @author LENOVO
 */
 class KonversiSuhu {
     def celciusToFahrenheit(self, celsius):
        return (celsius * 9/5) + 32

    def celciusToReamur(self, celsius):
        return celsius * 4/5

class KonversiSuhu 2(KonversiSuhu):
    def fahrenheitToReamur(self, fahrenheit):
        celsius = (fahrenheit - 32) * 5/9
        return self.celciusToReamur(celsius)

class DemoKonversiSuhu:
    def demo(self):
        konversi = KonversiSuhu()
        konversi2 = KonversiSuhu2()

        celsius_value = 25
        fahrenheit_value = 77

        celsius_to_fahrenheit = konversi.celciusToFahrenheit(celsius_value)
        celsius_to_reamur = konversi.celciusToReamur(celsius_value)
        fahrenheit_to_reamur = konversi2.fahrenheitToReamur(fahrenheit_value)

        print(f"{celsius_value} Celsius to Fahrenheit: {celsius_to_fahrenheit}°F")
        print(f"{celsius_value} Celsius to Reamur: {celsius_to_reamur}°Reamur")
        print(f"{fahrenheit_value} Fahrenheit to Reamur: {fahrenheit_to_reamur}°Reamur")

demo_konversi = DemoKonversiSuhu()
demo_konversi.demo()
    
}
