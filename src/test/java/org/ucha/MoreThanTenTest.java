package org.ucha;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.Assert.*;

/**
 * Test case when the user types in more than 10 numbers
 */
public class MoreThanTenTest {
    @ParameterizedTest
    @ValueSource(strings = "1")
    public void test1 (String string) {
        Scanner scanner = new Scanner(new ByteArrayInputStream(string.getBytes()));
        int[] myArray = Job.inputRead(scanner);
        assertFalse(myArray.length > 10);
    }

}