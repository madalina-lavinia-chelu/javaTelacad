1) parametrii diferiti : tip de data diferit

    ```java 
    public double calculeazaSuma(int a, int b)
    ```

    ```java 
    public double calculeazaSuma(int a, double b)
    ```
   
    ```java 
    public double calculeazaSuma(int a, char b)
    ```

    ```java 
    public double calculeazaSuma(int a)
    ```


2) nu conteaza tipul de data returnat
3) nu conteaza modificatorul de acces
4) nu conteaza daca metodele sunt statice
   
   ```java 
   static public int calcul(int a, int b){
       return a + b;
   } 
   ```
   
   ```java 
   static public int calcul(char a, int b){
       return a + b;
   }
   ```
   
5) nu conteaza exceptiile aruncate
6) putem avea sau nu mostenire
7) overloding-ul se aplica inclusiv pe constructor

Concluzie putem supraincarca metode prin schimbarea parametriilor prin: numar, ordine si tip