# 🔥 Cerință: Utilizare `super` și `super()` în Java 🔥

## 📝 Descriere
Scrie o aplicație Java care să respecte următoarele cerințe:

## 1. **Clasa `Vehicul` (Superclasă)**
- Creează o **clasă de bază** numită `Vehicul` care să conțină:
    - Un câmp `viteza` (de tip `int`) cu modificator de acces `protected`.
    - O metodă `afiseazaDetalii()` care afișează viteza vehiculului.
    - Un constructor cu parametru pentru inițializarea câmpului `viteza`.

---

## 2. **Clasa `Masina` (Subclasă)**
- Creează o **subclasă** numită `Masina` care să moștenească `Vehicul`:
    - Adaugă un câmp `marca` (de tip `String`).
    - Creează un constructor care să inițializeze atât câmpul `viteza` din clasa părinte, cât și câmpul `marca` folosind `super()` și parametri primiți în constructor.
    - Suprascrie metoda `afiseazaDetalii()` pentru a afișa și marca, pe lângă viteza.
    - În metoda suprascrisă, apelează metoda `afiseazaDetalii()` din clasa părinte folosind `super`.

---

## 3. **Clasa `Motocicleta` (Subclasă)**
- Creează o **altă subclasă** numită `Motocicleta` care să moștenească `Vehicul`:
    - Adaugă un câmp `tip` (de tip `String`).
    - Creează un constructor care să inițializeze câmpurile folosind `super()` și parametrii primiți în constructor.
    - Suprascrie metoda `afiseazaDetalii()` pentru a afișa și tipul motocicletei, pe lângă viteza.
    - În metoda suprascrisă, apelează metoda `afiseazaDetalii()` din clasa părinte folosind `super`.

---

## 4. **Clasa `Main`**
- Creează o clasă `Main` în care:
    - Creează un obiect de tip `Masina` și unul de tip `Motocicleta`.
    - Apelează metoda `afiseazaDetalii()` pentru ambele obiecte.

---

## ✅ **Cerințe cheie**
✔️ Folosește `super()` pentru a apela constructorul clasei părinte.  
✔️ Folosește `super` pentru a apela metoda din clasa părinte.  
✔️ Demonstrează **suprascrierea metodelor** și **moștenirea**.

---
