
public class Algo {
    public static void main(String[] args) {
        DLinkedList fList = new DLinkedList("fList");
        fList.append(10);
        fList.append(20);
        fList.append(30);
        System.out.print(fList);
        fList.deleteLast();
        System.out.print(fList);
        fList.deleteLast();
        System.out.print(fList);
        fList.deleteLast();
        System.out.print(fList);
    }
}
