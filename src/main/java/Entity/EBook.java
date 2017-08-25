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
@DiscriminatorValue("eBook")
public class EBook extends Book
{

    String url;
    double sizeMB;

    public EBook(String url, double sizeMB, Long isbn, String title, String author, double price)
    {
        super(isbn, title, author, price);
        this.url = url;
        this.sizeMB = sizeMB;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public double getSizeMB()
    {
        return sizeMB;
    }

    public void setSizeMB(double sizeMB)
    {
        this.sizeMB = sizeMB;
    }

    
    
}
