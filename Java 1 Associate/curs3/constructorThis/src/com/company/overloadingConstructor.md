# Supraincarcare constructor


În Java, constructorul this() este utilizat pentru a apela un alt constructor din aceeași clasă. Acesta trebuie să fie prima instrucțiune într-un constructor și ajută la evitarea duplicării codului atunci când ai mai mulți constructori cu parametri diferiți.

##### this
1. this → Referință la obiectul curent

    * Se folosește pentru a accesa variabilele de instanță și metodele ale obiectului curent.
    * Este necesar atunci când există confuzie între variabilele de instanță și parametrii metodei (când au același nume).

2.  this în metode

Metoda this este folosită și pentru a returna obiectul curent (return this), ceea ce permite apelarea în lanț a metodelor (method chaining).

### 🔸 Diferențe cheie între `this` și `this()`

| Caracteristică      | `this`                          | `this()`                           |
|---------------------|--------------------------------|-----------------------------------|
| **Ce face?**       | Referință la obiectul curent  | Apelarea unui alt constructor    |
| **Unde se folosește?** | În metode și constructori  | Doar în constructori             |
| **Poziționare?**   | Oriunde în cod                | Trebuie să fie prima linie în constructor |
| **Exemplu**        | `this.numar = numar;`         | `this("Necunoscut", 0);`         |
