package be.belfius.start.lambdas;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tersc
 * first appearance on 09/03/2022
 */
@Slf4j
public class Lambdas {
    public static void main(String[] args) {
        Cat myCat = new Cat("Poes",5);
//        myCat.print();  // eerste manier
//        printThing(myCat);// tweede manier
        Printable lambdaPrintable = ()  -> log.debug("\nMeow");
        printThing(  lambdaPrintable         );
    }
    static void printThing(Printable thing){
        thing.print();
    }
}
