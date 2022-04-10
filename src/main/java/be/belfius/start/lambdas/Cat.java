package be.belfius.start.lambdas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author tersc
 * first appearance on 09/03/2022
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class Cat { //implements Printable{  //removed voor derde oplossing
    public String name;
    public int age;

//    @Override
//    public void print() {
//      log.debug("\nMeow");
//    }
}
