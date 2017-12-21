
package GroupingByCollectorInStream;

import java.util.Arrays;
import java.util.List;

public class Students {
    private int Age;
    private String Name;
    private String className;
    
    public Students(int age,String Name,String className){
    this.Age=age;
    this.Name=Name;
    this.className=className;
    }
    public String getName(){
        return Name;
    }
    public String toString(){
    return "Student Name:"+this.Name;
    }
    
    public String getClassName(){
        return className;
    }
    public int getAge(){
        return Age;
    }
    public static List<Students> students(){
        Students first=new Students(4,"Ali","Pink");
        Students second=new Students(24,"Alina","Pink");
        Students third=new Students(11,"Alisha","Green");
        Students fourth=new Students(35,"Aliam","Pink");
        Students fivth=new Students(10,"Aliza","Green");
        List<Students> students=Arrays.asList(first,second,third,fourth,fivth);
    return students;
    }
}
