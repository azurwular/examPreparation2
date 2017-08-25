/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 *
 * @author Dell
 */
@Entity
@Table(name = "book")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "book_type")
public class Book {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long isbn;
	private String title;
        private String author;
        private double price;

    public Book(Long isbn, String title, String author, double price)
    {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
             
    public Long getIsbn()
    {
        return isbn;
    }

    public void setIsbn(Long isbn)
    {
        this.isbn = isbn;
    }


    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

}
