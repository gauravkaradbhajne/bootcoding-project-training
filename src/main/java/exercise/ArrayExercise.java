package exercise;

public class ArrayExercise {
    public static void main(String[] args) {
        //ARRAY DECLARE + INITIALIZE
        int[] numbers = {10,20,30,40,50};

        //ARRAY DECLARE
        int[] ages = new int[5];
        //ADD ELEMENT TO ARRAY(INITIALIZATION)
//        ages[0]=10;
//        ages[1]=20;
//        ages[2]=30;
//        ages[3]=40;
//        ages[4]=50;


//        HOW TO TRAVERSE ARRAY ELEMENT


        for(int i=0;i<ages.length;i++){
            ages[i] = (i+1) *10;
        }

        for(int i =0;i<ages.length;i++){
            System.out.println(i + "=" + ages[i]);
        }

       String[] months ={
                "Jan",
               "feb",
               "mar",
               "Apr",
               "may",
               "June",
               "July",
               "aug",
               "sep",
               "oct",
               "nov",
               "dec"};

        for (int i=0; i<months.length;i++){
            System.out.println(months[i]);

       }

    }
}
