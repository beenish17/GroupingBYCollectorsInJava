
package GroupingByCollectorInStream;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CollectorsInJava {

    public static void main(String[] args) {
        System.out.println("Grouping-By in Java Using Stream API's ----");
        System.out.println("--Example1--Map<Key-Value:Name type, Collection<>/ Second Object used in Collector>");

        Map<String, Long> stdByClassName = Students.students().stream()
                .collect(Collectors.groupingBy(Students::getClassName, Collectors.counting()));
        System.out.println(stdByClassName);

        System.out.println("--Keys with thr specified Names- using Map--");
        Map<String, List<Students>> stdByClassNameAndName = Students.students().stream()
                .collect(Collectors.groupingBy(Students::getClassName));

        stdByClassNameAndName.forEach((k, v) -> System.out.println("Key: " + k + " " + " "
                + "Names: " + v.stream().map(m -> m.getName()).collect(Collectors.joining(","))));
        System.out.println("-----for Using Grouping By twice in Collect method: use multi-map level ..thats not accurate");
        Map<String, Map<String, List<Students>>> stdByClassNameAndNameAge = Students.students().stream()
                .collect(Collectors.groupingBy(Students::getClassName,
                        Collectors.groupingBy(Students::getName)));
        System.out.println(stdByClassNameAndNameAge);

        System.out.println("----------------------------Items Class--------------------------------------------");
        System.out.println("---Map<Key-Value:Name type, Collection<>/ Second Object used in Collector>");
        Map<String, Long> counting = Items.items().stream()
                .collect(Collectors.groupingBy(Items::getName, Collectors.counting()));
        System.out.println(counting);

        System.out.println("---Summing the Quantity in Items Class-----");
        Map<String, Integer> sum = Items.items().stream()
                .collect(Collectors.groupingBy(Items::getName, Collectors.summingInt(Items::getQuantity)));
        System.out.println(sum);

        System.out.println("---Map return type : Integer is Key-Type, and second should be Collection---");
        Map<Integer, List<Items>> Quantity = Items.items().stream()
                .collect(Collectors.groupingBy(Items::getQuantity));
        Quantity.forEach((Integer quanttity, List<Items> name) -> System.out.println(quanttity + " " + "->" + name));
        
        System.out.println("------Function Supplier Collector------");
        //The benefit of using TreeMap::new (Supplier)in grouping BY is,It gives natural sorting order.
        Map<Integer,Set<Items>> FunctionSupplierCollector=Items.items().stream()
                .collect(Collectors.groupingBy(Items::getQuantity,TreeMap::new,Collectors.toSet()));
        FunctionSupplierCollector.forEach((Integer Quantity1,Set<Items> name)->System.out.println(Quantity1+"- "+name ));
     
    }
    
}
