
package GroupingByCollectorInStream;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Items {
    private String name;
    private int quantity;
    private BigDecimal price;
    
    public Items(String name,int quantity,BigDecimal price){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    public String getName(){
        return name;
    }
    public int getQuantity(){
        return quantity;
    }
    public BigDecimal getPrice(){
        return price;
    }
    public String toString(){
    return "Employee Name:"+this.name;
  }
    public static List<Items> items(){
        List<Items> item=Arrays.asList(new Items("A",22,new BigDecimal("23.3")),
                                        new Items("B",33,new BigDecimal("19.99")),
                                        new Items("C",31,new BigDecimal("23.3")),
                                        new Items("D",22,new BigDecimal("19.99")),
                                        new Items("B",33,new BigDecimal("23.3")),
                                        new Items("C",31,new BigDecimal("19.99")),
                                        new Items("D",22,new BigDecimal("23.3"))
        );
        
     return item;                                   
    }
}
