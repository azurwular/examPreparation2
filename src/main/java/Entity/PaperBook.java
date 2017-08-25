/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Dell
 */
@Entity
@DiscriminatorValue("paperBook")
public class PaperBook extends Book
{

    private double shippingWeight;
    private int inStock;

    public PaperBook(double shippingWeight, int inStock, Long isbn, String title, String author, double price)
    {
        super(isbn, title, author, price);
        this.shippingWeight = shippingWeight;
        this.inStock = inStock;
    }

    public double getShippingWeight()
    {
        return shippingWeight;
    }

    public void setShippingWeight(double shippingWeight)
    {
        this.shippingWeight = shippingWeight;
    }

    public int getInStock()
    {
        return inStock;
    }

    public void setInStock(int inStock)
    {
        this.inStock = inStock;
    }
    
    
         
}
