package HW13;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;


public class Stream {
    class CalculateAvg {
        public static void main(String[] args) {
            // 1 - Имеется коллекция из Integers, использую стримы посчитать среденее значения всех чисел
            IntSummaryStatistics stats = Arrays.asList(1,2,3,4,5,11,15,22,43,999,100,32,21,1,2)
                    .stream()
                    .mapToInt(Integer::intValue)
                    .summaryStatistics();
            stats.getAverage();
        }
    }

    //       2 - Имеется коллекция из String, привести все стринги в UPPERCASE и вернуть коллекцию List<Pair>
    // in: "one", "two", ...
    //    out: {"one":"ONE"}, {"two", "TWO"}, ...
    class Upper {
        public static void main(String[] args) {
            List<String> list = Arrays.asList("aTc", "def", "gYi","Cbc", "def", "ghi","Gbc", "dTH", "HGi");
            list.replaceAll(String::toUpperCase);
        }
    }
    //    3 - Имеется коллекция из String, отфильтровать и вывести на экран все значения, которые написаны в loverCase and length = 4
    class Filtr {
        public static void main(String[] args) {
            List<String> list = Arrays.asList("aTc", "def", "gYi","Cbc", "def", "ghi","Gbc", "dTH", "HGi");
            // list.replaceAll(String::toUpperCase);
            java.util.stream.Stream <String> allNames = list.stream();
           // java.util.stream.Stream<String> longNames = allNames.filter(str -> str.length() == 4  && allNames -> allNames.isLowerCase==true);
           // longNames.forEach(str->System.out.print(str+" "));
        }
    }
}