public class ComparableExample {

    public static void main(String[] args) {

        Integer valA = Integer.valueOf(45);
        Integer valB = Integer.valueOf(99);

        int comparisonA = valA.compareTo(valB);
        int comparisonB = valB.compareTo(valA);

        System.out.println(comparisonA);
        System.out.println(comparisonB);
    }
}