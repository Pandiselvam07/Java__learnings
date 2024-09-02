public class castingNumericalvalues {
    public static void main(String[] args){
        //byte bytevalue = 12;
        short shortvalue = 7;
        int intvalue = 77;
        long longvalue = 77777;
        float floatvalue = 18.77f;
        double doublevalue = 10.77;

        System.out.println(doublevalue);
        doublevalue = intvalue;
        System.out.println(doublevalue);
        floatvalue =(int)longvalue;
        System.out.println(floatvalue);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);

    }
}
