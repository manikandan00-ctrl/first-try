public class BufferPROG {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println("After append: " + sb);
        sb.insert(6, "Java ");
        System.out.println("After insert: " + sb);
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb);
        sb.delete(3, 8);
        System.out.println("After delete: " + sb);
        sb.reverse();
        System.out.println("After reverse: " + sb);
        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Length: " + sb.length());
        sb.ensureCapacity(50);
        System.out.println("New Capacity after ensureCapacity: " + sb.capacity());
    }
}