✅ Întrebări de bază (Junior):

   1. Care sunt modificatorii de acces în Java?
R: private, default, protected si private

   2. Ce diferență există între public, private, protected și default în Java?
R:
public → Accesibil din orice clasă din orice pachet.
protected → Accesibil în același pachet + prin moștenire într-un alt pachet.
default → Accesibil doar în același pachet (fără moștenire în alt pachet).
private → Accesibil doar în aceeași clasă (nu este vizibil nici măcar în subclasă).

   3. Ce înseamnă când o variabilă sau metodă este declarată cu default?
R: O variabilă sau metodă declarată cu default este accesibilă doar în interiorul aceluiași pachet — nu este accesibilă
în afara pachetului, nici măcar prin moștenire.

   4. Poți folosi protected pentru o clasă? Dacă nu, de ce?
R : Nu, nu poți declara o clasă protected, deoarece clasele nu pot fi protected — doar membrii (variabile, metode)
pot fi protected.

   5. Ce tip de acces oferă protected într-un alt pachet?
R: poate sa fie accesata in pachetul in care se afla sau intr o clasa case mosteneita care se afla in alt pachet

   6. Poate o metodă private să fie moștenită? Explică de ce.
R: nu, deoarece accesul se face doar in clasa in care a fost definita

   7. Dacă o metodă este declarată public în clasa părinte, poți să o faci protected în clasa copil?
R: Nu, nu poți face o metodă protected în clasa copil dacă este public în clasa părinte.
       ➡️ Poți doar să crești vizibilitatea (exemplu: protected → public).
---
🔥 Întrebări intermediare (Mid-Level):

    Care este diferența dintre default și protected în moștenire?
R:
Default: Nu este accesibil din alt pachet, chiar dacă există moștenire.
protected: Este accesibil din alt pachet doar prin moștenire.

    Poți suprascrie o metodă private în clasa copil? De ce?
R: Metodele private NU pot fi moștenite și, prin urmare, NU pot fi suprascrise

    Ce se întâmplă dacă ai o metodă protected în clasa părinte și o suprascrii în clasa copil folosind private?
R: Nu este permis să reduci nivelul de acces al unei metode suprascrise.
Dacă o metodă este protected în clasa părinte, atunci metoda suprascrisă în clasa copil poate fi protected sau public,
dar NU private.

    Poți accesa o metodă private dintr-o clasă părinte în clasa copil?
R: Nu, metodele private nu sunt vizibile în clasa copil și, prin urmare, nu pot fi nici suprascrise, nici accesate direct.

    Dacă o metodă protected din clasa părinte este suprascrisă cu o metodă public în clasa copil, va fi permis?
R: da 

    Ce se întâmplă dacă un câmp protected din clasa părinte este redefinit cu private în clasa copil?
R: Nu va fi considerat o eroare de compilare, dar câmpul protected din clasa părinte va fi ascuns de câmpul private din 
clasa copil. Aceasta nu este o suprascriere — este considerată "hiding" (ascundere).✅ Întrebări de bază (Junior):

   1. Care sunt modificatorii de acces în Java?
R: private, default, protected si private

   2. Ce diferență există între public, private, protected și default în Java?
R:
public → Accesibil din orice clasă din orice pachet.
protected → Accesibil în același pachet + prin moștenire într-un alt pachet.
default → Accesibil doar în același pachet (fără moștenire în alt pachet).
private → Accesibil doar în aceeași clasă (nu este vizibil nici măcar în subclasă).

   3. Ce înseamnă când o variabilă sau metodă este declarată cu default?
R: O variabilă sau metodă declarată cu default este accesibilă doar în interiorul aceluiași pachet — nu este accesibilă
în afara pachetului, nici măcar prin moștenire.

   4. Poți folosi protected pentru o clasă? Dacă nu, de ce?
R : Nu, nu poți declara o clasă protected, deoarece clasele nu pot fi protected — doar membrii (variabile, metode)
pot fi protected.

   5. Ce tip de acces oferă protected într-un alt pachet?
R: poate sa fie accesata in pachetul in care se afla sau intr o clasa case mosteneita care se afla in alt pachet

   6. Poate o metodă private să fie moștenită? Explică de ce.
R: nu, deoarece accesul se face doar in clasa in care a fost definita

   7. Dacă o metodă este declarată public în clasa părinte, poți să o faci protected în clasa copil?
R: Nu, nu poți face o metodă protected în clasa copil dacă este public în clasa părinte.
       ➡️ Poți doar să crești vizibilitatea (exemplu: protected → public).
---
🔥 Întrebări intermediare (Mid-Level):

    Care este diferența dintre default și protected în moștenire?
R:
Default: Nu este accesibil din alt pachet, chiar dacă există moștenire.
protected: Este accesibil din alt pachet doar prin moștenire.

    Poți suprascrie o metodă private în clasa copil? De ce?
R: Metodele private NU pot fi moștenite și, prin urmare, NU pot fi suprascrise

    Ce se întâmplă dacă ai o metodă protected în clasa părinte și o suprascrii în clasa copil folosind private?
R: Nu este permis să reduci nivelul de acces al unei metode suprascrise.
Dacă o metodă este protected în clasa părinte, atunci metoda suprascrisă în clasa copil poate fi protected sau public,
dar NU private.

    Poți accesa o metodă private dintr-o clasă părinte în clasa copil?
R: Nu, metodele private nu sunt vizibile în clasa copil și, prin urmare, nu pot fi nici suprascrise, nici accesate direct.

    Dacă o metodă protected din clasa părinte este suprascrisă cu o metodă public în clasa copil, va fi permis?
R: da 

    Ce se întâmplă dacă un câmp protected din clasa părinte este redefinit cu private în clasa copil?
R: Nu va fi considerat o eroare de compilare, dar câmpul protected din clasa părinte va fi ascuns de câmpul private din 
clasa copil. Aceasta nu este o suprascriere — este considerată "hiding" (ascundere).