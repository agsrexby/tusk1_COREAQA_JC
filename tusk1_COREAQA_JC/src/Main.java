public class Main {
    public static void main(String[] args) {
        MyStringBuilder myStringBuilder = new MyStringBuilder();
        myStringBuilder.append("Hello").append(" World!");
        System.out.println(myStringBuilder);

        myStringBuilder.undo();
        System.out.println("After undo: " + myStringBuilder);

        myStringBuilder.reverse();
        System.out.println("After reverse: " + myStringBuilder);

        myStringBuilder.undo();
        System.out.println("After second undo: " + myStringBuilder);
    }
}