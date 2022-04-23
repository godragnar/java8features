package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamExample3 {

	public static void main(String[] args) {
		
		
		List<String> names=new ArrayList<>();
        names.add("Amit");
        names.add("Shekar");
        names.add("Aman");
        names.add("Rahul");
        names.add("Sonam");
        names.add("Salman");
        names.add("Lokesh");
        names.add("Navin");
       
        names.stream().filter((s)->s.startsWith("A")).map(String::toUpperCase).
        forEach(System.out::println);
       
        System.out.println("*********** Sorted Operation *************");
        names.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
        
        
        Integer[] marks= {45,88,99,45,75,23};
        int sum=Arrays.stream(marks).reduce(0, (a,b) -> a+b);
        System.out.println("Sum of Marks : "+sum);
        
        
        /*display numbers from  1-100
         * 1. Loops
         * 2. Streams
         *
         * */
        for(int i=1;i<=100;i++)
        {
            System.out.print(i+" ");
        }
        System.out.println();
       
        System.out.println(" ********** Display Nos from 1-100 using Intstreams ***********");
        
        IntStream.range(1, 101).forEach(i->System.out.print(i+" "));
        
	}

}
