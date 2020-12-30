import java.util.ArrayList;

public class NumberProfile {
    //even
    //odd
    //perfectSquare mod
    //prime number
    //multiples-multiply by natural numbers
    //factors-divide without remainder

    private int number;

    public void setNumber(int number) {
        this.number= number;
    }

    public int getNumber() {
        return number;
    }

    public boolean getEvenNumber() {
        if(number%2==0){
            return true;
        }
        return false;
    }


    public boolean getOddNumber() {
        if(number%2>0){
            return true;
        }
        return false;
    }

    public boolean isAPerfectSquare() {
       double numberCheck = Math.sqrt(number);
       if(numberCheck%1==0){
           return true;
       }
       return false;
    }

    public boolean isPrimeNumber() {
        int primeCounter=0;
        for(int counter=1;counter<=number;counter++){
            if(number%counter==0){
               ++primeCounter;
            }
        }
        if(primeCounter==2){return true;
        }
        return false;
    }

    public int[] getMultiples() {
        int []array= new int[5];
        for(int counter=0;counter< array.length;counter++){
            array[counter]=(counter+1)*number;
        }
        return array;
    }

    public ArrayList<Integer> getFactors() {
        ArrayList<Integer> array=new ArrayList<>();
        for(int counter=1;counter<=number;counter++){
            if(number%counter==0){
                array.add(counter);
            }
        }
        return array;
    }

public String getNumberProfile(){
    String profile="The number profile for number "+number+": \n";
    if(getOddNumber()){
         profile+="\nis an odd number";
    }
    if(getEvenNumber()){
         profile+="\nis an even number\n";
    }
    if(isAPerfectSquare()){
         profile+="\nis a perfect square\n";
    }
    if(isPrimeNumber()){
         profile+="\nis a prime number\n";
    }
    profile+="The first five multiples of " +number+ "are \n";
    for(int multiples:getMultiples()){
        profile+= multiples+ " ";
    }
    profile+="\nThe factors of " +number+ " are \n";
    for(int factors:getFactors()){
        profile+= factors+ " ";

    }
    return profile;
    }
}
