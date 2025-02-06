📌 Cerințe detaliate pentru implementare
1. Crearea clasei de bază Publicatie

   Conține atribute comune pentru orice tip de publicație:
   titlu (String)
   autor (String)
   anPublicatie (int)
   Metoda afisareInformatii() (abstractă) care trebuie suprascrisă în subclase.

2. Crearea subclaselor Carte, Revista, Ebook

   🔹 Clasa Carte
   Adaugă atributul numarPagini (int)
   Suprascrie afisareInformatii() pentru a afișa detalii într-un format specific.
   🔹 Clasa Revista
   Adaugă atributul frecventaAparitie (String) (ex: "Lunar", "Săptămânal")
   Suprascrie afisareInformatii().
   🔹 Clasa Ebook
   Adaugă atributele format (ex: "PDF", "EPUB") și dimensiuneMB (double)
   Suprascrie afisareInformatii().

3. Crearea unui vector (listă) de Publicatie și afișarea informațiilor prin polimorfism

   Se creează o listă de publicații List<Publicatie>.
   Se adaugă diferite obiecte de tip Carte, Revista și Ebook.
   Se parcurge lista și se apelează afisareInformatii(), iar datorită polimorfismului, fiecare metodă va fi apelată corect în funcție de tipul obiectului.