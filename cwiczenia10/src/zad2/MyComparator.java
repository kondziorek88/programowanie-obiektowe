package zad2;

public interface MyComparator {
    default int compare(int a, int b){
        if(a<b){
            return -1;
        } else if ((a==b)) {
            return 0;
        }

        return 1;
    }


}
