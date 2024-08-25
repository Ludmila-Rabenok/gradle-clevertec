package ru.clevertec;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UtilsTest {
    Utils utils = new Utils();
    StringUtils stringUtils = mock(StringUtils.class);

    @Test
    void isAllPositiveNumbersTest() {
        when(stringUtils.isPositiveNumber(anyString())).thenReturn(true);

        boolean actual = utils.isAllPositiveNumbers("5");

        assertTrue(actual);
    }
}
