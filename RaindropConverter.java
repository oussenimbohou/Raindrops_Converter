import java.util.List;
import java.util.ArrayList;
    class RaindropConverter {

    String convert(int number) {
        List<Integer> factorsList = numberToFactors(number);
        StringBuilder rainString = new StringBuilder ();
        for(int num : factorsList){
            if(num == 3)rainString.append("Pling");
            if(num == 5)rainString.append("Plang");
            if(num == 7)rainString.append("Plong");
        }
       if(rainString.isEmpty() || rainString.length()== 0) 
           return String.valueOf(number);
        return rainString.toString();
    }
private List<Integer> numberToFactors(int number){
    int temp = number;
    int count = 2;
    List<Integer> list = new ArrayList<>();
    while(number >= 1 && count <= number){
        if(number%count == 0){
            temp = number/count;
            list.add(count);
        }
number = temp;
        count++;
    }
    return list;
}
}
