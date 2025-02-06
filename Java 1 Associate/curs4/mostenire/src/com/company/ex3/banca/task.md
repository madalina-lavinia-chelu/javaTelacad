# 🏦 Sistem de Gestionare a Conturilor Bancare

Banca XYZ dorește să implementeze un sistem avansat de gestionare a conturilor bancare, care să respecte principiile Programării Orientate pe Obiecte (OOP). Sistemul trebuie să includă mai multe tipuri de conturi bancare, reguli stricte pentru operațiuni și să asigure securitatea datelor prin încapsulare și imutabilitate.

---

## 🔹 1. Specificații Generale
Se va crea un sistem care gestionează conturi bancare pentru clienți. Fiecare client poate avea mai multe conturi, iar fiecare cont trebuie să aibă un număr unic, un sold și reguli specifice de retragere/depunere.

---

## 🏗️ 2. Clase și Relații

### 👤 2.1 Clasa `Person` (Imutabilitate, Încapsulare)
- Reprezintă un client al băncii.
- Câmpuri **private și finale** pentru `name`, `CNP` (unic) și `address`.
- Constructor care inițializează toate datele.
- Metode `getName()`, `getCNP()`, `getAddress()`, dar **fără `set`** (immutabilitate).

### 💰 2.2 Clasa Abstractă `BankAccount` (Moștenire, Încapsulare)
- Are câmpuri **protejate** pentru `accountNumber`, `balance` și `owner` (de tip `Person`).
- Constructor care asociază contul cu o persoană și setează soldul inițial.
- Metodă `deposit(double amount)` pentru depunere de bani.
- Metodă `withdraw(double amount)` (**abstractă**) ce trebuie implementată de subclase.
- Metodă `getBalance()` pentru verificarea soldului.

### 🏦 2.3 Clasa `SavingsAccount` (Moștenire, Suprascriere)
- Extinde `BankAccount` și adaugă o regulă de retragere:
    - Retragerile sunt permise doar dacă soldul rămas este **peste 500 RON**.
- **Suprascrie** metoda `withdraw(double amount)` pentru a aplica regula de mai sus.

### 💳 2.4 Clasa `CurrentAccount` (Moștenire, Suprascriere, `super()`)
- Extinde `BankAccount` și permite descoperit de cont de **maxim 1000 RON**.
- **Suprascrie** metoda `withdraw(double amount)` pentru a permite retrageri și în descoperit de cont.

### 🏢 2.5 Clasa `Bank` (Gestionarea Conturilor)
- Conține o **listă de conturi bancare** (`List<BankAccount>`).
- Metodă `addAccount(BankAccount account)` pentru a adăuga un cont.
- Metodă `getAccountsForPerson(String CNP)` pentru a returna toate conturile unei persoane.
- Metodă `transfer(String fromAccount, String toAccount, double amount)` pentru a transfera bani între două conturi.
- Metodă `displayAllAccounts()` pentru a afișa toate conturile din bancă.

---

## 🔥 3. Cerințe Funcționale

### 📌 1. Gestionarea Conturilor Clienților
✅ O persoană poate avea **mai multe conturi** (de economii și curente).  
✅ Numărul de cont este **generat unic** pentru fiecare cont nou.

### 📌 2. Operațiuni Bancare
✅ Permite **depuneri și retrageri**, respectând regulile fiecărui tip de cont.  
✅ Permite **transfer de bani** între conturi.  
✅ Oferă posibilitatea de a consulta **soldul unui cont**.

### 📌 3. Moștenire și Polimorfism
✅ Clasa `BankAccount` trebuie să fie **abstractă**.  
✅ `SavingsAccount` și `CurrentAccount` trebuie să **suprascrie metoda `withdraw()`**.

### 📌 4. Utilizarea `super` și `super()`
✅ Constructorii subclaselor trebuie să apeleze **`super()`** din `BankAccount`.  
✅ La suprascrierea metodelor, trebuie folosit **`super.withdraw(amount)`** dacă este cazul.

### 📌 5. Încapsulare și Imutabilitate
✅ Datele din `Person` trebuie să fie **private și accesibile doar prin `get`** (fără `set`).  
✅ `BankAccount` trebuie să protejeze **`balance`**, permițând modificarea doar prin metode dedicate.

---

## 🎯 4. Exemplu de Utilizare
1️⃣ Se creează **doi clienți** (`Person`).  
2️⃣ Se creează **două conturi** pentru fiecare client (un `SavingsAccount` și un `CurrentAccount`).  
3️⃣ Se efectuează diverse **operațiuni: depuneri, retrageri, transferuri**.  
4️⃣ Se afișează **toate conturile și soldurile lor**.

---

🔹 **Acest sistem implementează toate principiile OOP** menționate: încapsulare, imutabilitate, moștenire, polimorfism și utilizarea `super`.  
🚀 **Extensibilitate:** Poate fi ușor extins pentru noi tipuri de conturi sau funcționalități suplimentare! 🎉
````

                +-------------------+
                |      Person       |
                |-------------------|
                | - name: String    |
                | - CNP: String     |
                | - address: String |
                |-------------------|
                | + getName()       |
                | + getCNP()        |
                | + getAddress()    |
                +-------------------+
                         ▲
                         |
      -----------------------------------
      |                                 |
------------------+         +-------------------+
|   BankAccount   |         |      Bank         |
|-----------------|         |-------------------|
| - accountNumber |         | - accounts: List  |
| - balance       |         |-------------------|
| - owner: Person |         | + addAccount()    |
|-----------------|         | + getAccounts()   |
| + deposit()     |         | + transfer()      |
| + withdraw()    |         | + displayAll()    |
+-----------------+         +-------------------+
             ▲
             |
       --------------------------
       |                        |
+-----------------+    +-----------------+
| SavingsAccount  |    | CurrentAccount  |
|-----------------|    |-----------------|
| + withdraw()    |    | + withdraw()    |
+-----------------+    +-----------------+
