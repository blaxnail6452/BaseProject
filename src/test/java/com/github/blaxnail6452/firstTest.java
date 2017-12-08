package com.github.blaxnail6452;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class firstTest {
    @Test
    public void getType() throws Exception {
    //arr
    first first = new first(5, 10, 5) ;

    //act
    String result = first.getType();

    //Assert
    Assert.assertEquals(  "不是三角形", result);
    }

}
