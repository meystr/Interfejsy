public class Main {

    public static void main(String[] args) {
        System.out.println("nazwaInterfejsu");
    }
    interface nazwaInterfejsu
    {
        double PI=3.14;
        void cos();

        interface cosik
        {

        }
        class Pracownik implements nazwaInterfejsu
        {
            @Override
            public void cos() {

            }
        }
    }
}
