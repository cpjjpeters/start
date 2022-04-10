package be.belfius.start.config;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author tersc
 * first appearance on 07/03/2022
 */

public class LambdaTest {
    @Test
    void lambdaExpressions(){
        assertTrue(Stream.of(1,2,3)
//                .stream()
                .mapToInt(i -> i)
                .sum() > 5, () -> "Sum should be greater than 5"
        );
    }
}
