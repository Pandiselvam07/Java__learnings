public class StringBuilderandStringFormatting {
    public static void main(String[] args){

        String info=("");
        info+="Pandiselvam";
        info+=" R";
        System.out.println(info);

        StringBuilder sb = new StringBuilder("");
        sb.append("Dineshkumar R");
        System.out.println(sb.toString());

        StringBuilder sb1 =new StringBuilder("");
        sb1.append("Hello")
                .append("\n")
                .append("Welcome");
        System.out.println(sb1.toString());

        ////FORMATTING

        System.out.println("Good morning");
        System.out.println("Format");

        System.out.printf("Sno : %d \nYour ID number : %.2f\n",101,85.28);

        for(int i=0;i<=2;i++){
            System.out.printf("\nYour ID number : %d\n",i);
        }

    }
}
