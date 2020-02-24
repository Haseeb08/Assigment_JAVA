public class Main {
    public static void main(String[] args) {
        Data d = new Data();
        d.printVar();
      //  d.printLocalVar();
        Singleton singletonObj=Singleton.initialize("Hey");
        singletonObj.printString();
    }
}
