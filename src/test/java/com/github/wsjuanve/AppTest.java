package com.github.wsjuanve;

import com.github.wsjuanve.util.Base64Util;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {

        System.out.println(Base64Util.getImgBase("./bbb.png"));
        System.out.println(Base64Util.getImgBaseWithHead("./bbb.png"));

    }
}
