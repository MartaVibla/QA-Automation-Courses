public class StringBuilderTypes {
    public static void main(String[] args) {
        int x=2, y=5;
        final int z=5;

        boolean booLT = true;
        boolean booLF = false;

        System.out.println("Colors types:");

        StringBuilder sb = new StringBuilder("Red;");
        sb.append("Yellow");
        System.out.print(sb);

        sb.deleteCharAt(1);
        System.out.println(sb);

        sb.delete(2, 5);
        System.out.println(sb);

        sb.insert(x, "Blue");
        System.out.println(sb);

        sb.delete(1, 2);
        System.out.println(sb);

        sb.replace(0,10, "Marta");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        System.out.println(sb.substring(5));

        System.out.print(sb.substring(0, 5));
}}