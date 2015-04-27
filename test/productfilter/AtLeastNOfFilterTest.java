/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productfilter;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * @author Jozef Sumaj, Jakub Senko
 */
public class AtLeastNOfFilterTest {

    @Test(expected=IllegalArgumentException.class)
    public void FilterThatThrowsIllegalArgumentException() {
        AtLeastNOfFilter<Product> filter = new AtLeastNOfFilter<>(0, new ColorFilter(Color.RED));
        fail();
    }
    
    @Test(expected=FilterNeverSucceeds.class)
    public void FilterThatThrowsIFilterNeverSucceeds() {
        AtLeastNOfFilter<Product> filter = new AtLeastNOfFilter<>(2, new ColorFilter(Color.RED));
        fail();
    }
}
