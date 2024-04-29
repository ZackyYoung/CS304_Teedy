package com.sismics.util;

import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class TestLocale {
    @Test
    public void testGetLocaleWithEmptyCode() {
        // Arrange
        String localeCode = "";

        // Act
        Locale result = LocaleUtil.getLocale(localeCode);

        // Assert
        Assert.assertEquals(Locale.ENGLISH, result);
    }

}