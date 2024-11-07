package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testMultiply() {
        Solution solution = new Solution();
        String a = solution.multiply("2","3");
        assertEquals("6",a);
        a = solution.multiply("123","456");
        assertEquals("56088",a);

    }

//测试加法，无进位和有进位是否正常
// 例1："2"+"3"="5"
// 例2："9"+"2"="11"

    @Test
    public void addStrings() {
        Solution solution = new Solution();
        String ans = solution.addStrings("2","3");
        assertEquals("7",ans);
        ans = solution.addStrings("9","2");
        assertEquals("11",ans);
    }

}
