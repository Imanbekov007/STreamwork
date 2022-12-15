import java.math.BigDecimal;
import java.sql.Array;
import java.time.Instant;
import java.time.Year;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student>students=new ArrayList<>(Arrays.asList(
                new Student("Erbol",18,Gender.MALE,new BigDecimal(3000),"Zholborsov"),
                new Student("Osmon",17,Gender.MALE,new BigDecimal(10000),"Imanbekov"),
                new Student("Adil",20,Gender.MALE,new BigDecimal(300),"Aytbaev"),
                new Student("Azima",16,Gender.FEMALE,new BigDecimal(3600),"Talantova"),
                new Student("Erbolot",18,Gender.MALE,new BigDecimal(8000),"Arstanov"),
                new Student("Aiday",27,Gender.FEMALE,new BigDecimal(50),"Zholborsov")
        ));
        System.err.println("A dan bashtalgan");  students.stream().filter(x->x.getName().startsWith("+996")).forEach(System.out::println);
        System.err.println("akchasy 2000den kop jana jashy 15ten chon");  students.stream().
                filter(x->x.getAge()>15 && x.getMoney().intValue()>2000).forEach(System.out::println);
        System.err.println("rich ");        Optional<Student> max = students.stream().max(Comparator.
                comparing(Student::getMoney));
       System.out.println(max);
        System.out.println("rich girl");        Optional<Student> max2 = students.stream().filter(x->x.getGender().equals(Gender.FEMALE)).max(Comparator.
             comparing(Student::getMoney ));
        System.out.println(max2);
        System.out.println("all names");       students.stream().map(Student::getName).forEach(System.out::println);
        System.out.println("+1000");
        students.stream().map(x->x.getMoney().intValue()+1000).forEach(System.out::println);
        System.out.println("First student");       System.out.println(students.stream().findFirst());
        System.out.println("Amount of students");    System.out.println((long) students.size());
              List<Student> boys=  students.stream().filter(x->x.getGender().equals(Gender.MALE)).toList();
     List<Student> girls=  students.stream().filter(x->x.getGender().equals(Gender.FEMALE)).toList();
       System.out.println("boys\n"+boys);
       System.out.println("girls\n"+girls);




//        List<String>names=new ArrayList<>(Arrays.asList("osmon","rahim","adil","erbol","kayrat"));
//        System.out.println(names.stream().map(x->x.toUpperCase()).collect(Collectors.toSet()));
//      List<Integer>integerList=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
//      integerList.stream().filter(x->x%2==1).forEach(System.out::print);
//     List<Integer> odd= integerList.stream().filter(x->x%2==1).toList();
//     List<Integer> even= integerList.stream().filter(x->x%2==0).toList();
//        System.out.println("\n"+odd);
//        System.out.println(even);
//        List<Car>names=new ArrayList<>(Arrays.asList(
//                new Car("HOnda","0opo", Year.of(2012)),
//                new Car("Fit","0opo", Year.of(2010)),
//                new Car("Accord","0opo", Year.of(2019)),
//                new Car("Tiko","0opo", Year.of(2000))
//        ));
//        System.out.println(names);
//        names.stream().filter(car -> car.getReleaseyear()
//                .isAfter(Year.of(2010)))
//                .map(Car::getName)
//                .filter(s -> s!=null && !s.isEmpty())
//                .forEach(System.out::println);
//

        //2
//        List<Integer>integerList=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,12,10));
//        System.out.println("Without stream");
//        for (Integer a:integerList) {
//            System.out.println(a+"*2"+"="+a*2);
//        }
//        System.out.println("With stream");
//        integerList.stream().map(integer -> integer+"*2="+integer * 2).forEach(System.out::println);
//1
//        Integer[]sandar={1,-9,0,-4,23,4,2304,-8};
//        System.out.println(Arrays.stream(sandar).filter(value -> value > 0).toList());
//        List<Integer> integerList=new ArrayList<>();
//        int counter=0;
//        for (Integer a:sandar) {
//            if(a>0){
//                integerList.add(a);
//                counter++;
//            }
//
//
//        }
//        System.out.println(integerList+" "+counter);
    }
}