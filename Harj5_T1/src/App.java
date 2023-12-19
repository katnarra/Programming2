public class App {

    public static void main(String[] args) throws Exception {
        BaseClass base = new BaseClass();
        printInfo(base);
        SubClassOne one = new SubClassOne();
        printInfo(one);
        SubClassTwo two = new SubClassTwo();
        printInfo(two);
    }

    static void printInfo(BaseClass baseClassObject) {
        baseClassObject.whoAmI();
    }
}
