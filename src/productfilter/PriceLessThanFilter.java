/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productfilter;

import java.math.BigDecimal;

/**
 * This filter passes if the price of the item is lower or equal to the maxPrice.
 */
public class PriceLessThanFilter implements Filter<Product> {

    private BigDecimal maxPrice;

    /**
     * @throws FilterNeverSucceeds if maxPrice is lower than 0
     */
    public PriceLessThanFilter(BigDecimal maxPrice) {
        this.maxPrice = maxPrice;
        if (this.maxPrice.compareTo(BigDecimal.ZERO) < 0) {
            throw new FilterNeverSucceeds();
        }
    }

    @Override
    public boolean passes(Product item) {
        return maxPrice.compareTo(item.getPrice()) >= 0;
    }

}
