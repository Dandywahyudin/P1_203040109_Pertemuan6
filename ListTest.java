package Tugas6;

public class ListTest {
	public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.addTail(5);
        list.addTail(4);
        list.addTail(6);
        list.displayElement();
        System.out.println(list.find(6));
	
		StrukturList list2 = new StrukturList();
		list2.addHead(7);
		list2.addMid(6, 2);
		list2.addMid(4, 3);
		list2.addMid(2, 4);
		list2.addTail(3);
		list2.displayElement();
		System.out.println(list2.size());
	
		StrukturList list3 = new StrukturList();
		list3.addHead(4);
		list3.addMid(3, 2);
		list3.addMid(7, 3);
		list3.addMid(8, 4);
		list3.addTail(1);
		list3.addTail(9);
		list3.displayElement();
		list3.removeList();
		list3.displayElement();
	}
}