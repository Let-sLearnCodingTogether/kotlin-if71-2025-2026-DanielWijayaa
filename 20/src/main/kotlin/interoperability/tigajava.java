package interoperability;

import java.util.SplittableRandom;

public class tigajava {
    public static void main(String[] args)
    {
        System.out.println(("Hello From Java"));
        CounterExampleKotlin test=new CounterExampleKotlin();
        System.out.println((test.getNumber()));
        test.increment();
        System.out.println(test.getNumber());
        System.out.println(EmpatkotlinKt.isEmail("Danielwijaya2332@gmail.com"));

        Logger logger=new Logger();
        logger.log("Aplikasi Dimulai");
        logger.log("Aplikasi Dimulai","dimulai");

        String dbUrl = Database.Companion.getConnectionUrl();
        String dbUrl2 = Database.getConnectionUrl();
        System.out.println(dbUrl);

    }
}
