package be.belfius.start.generics;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tersc
 * first appearance on 09/03/2022
 */
@Slf4j
public class Printer <T>{
    T thingToPrint;
    public Printer(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }
    public void print(){
        log.debug(thingToPrint.toString());
    }
}
