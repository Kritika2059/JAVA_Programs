public class java_30_stringBuffer {
    public static void main(String[] args) {

        StringBuffer sbempty = new StringBuffer();
        StringBuffer sb = new StringBuffer("kritika");
        System.out.println(sbempty.capacity());
        System.out.println(sb.capacity());

        sb.append(" pandey"); //to change the data
        System.out.println(sb);

        String str = sb.toString(); //convert stringBuffer type to string

        sb.insert(0, "miss ");
        System.out.println(sb);
    }
}
