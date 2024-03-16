package Tugas6;

import Tugas5.Node;

public class StrukturList {
	public Node HEAD;
	//Menambahkan node baru ke awal
    public void addHead(int data) {
        Node newNode = new Node(data);
        if (HEAD == null) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    //Menambahkan node baru ke akhir
    public void addTail(int data){
        Node posNode = null, curNode, newNode;
        newNode = new Node(data);
        if (HEAD == null) {
            HEAD = newNode;
        } else {
            curNode = HEAD;
            while (curNode != null) {
                    posNode = curNode;
                    curNode = curNode.getNext();
            }
            posNode.setNext(newNode);
        }
    }

    //Menambahkan node baru ke posisi tertentu.
    public void addMid(int data, int position){
        Node newNode, posNode = null, curNode;
        int i;
        newNode = new Node(data);
        if (HEAD == null){
            HEAD = newNode;
        } else {
            curNode = HEAD;
            if (position == 1){
                newNode.setNext(curNode);
                HEAD = newNode;
            } else {
                i = 1;
                while (curNode != null && i < position) {
                    posNode = curNode;
                    curNode = curNode.getNext();
                    i++;
                }
                posNode.setNext(newNode);
                newNode.setNext(curNode);
            }
        }
    }
    //Mencetak ke layar
    public void displayElement(){
        Node curNode = HEAD;
        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
        System.out.println();
    }
    public void removeTail() {
    	Node preNode = null, lastNode;
        if (HEAD != null) {
            if (HEAD.getNext() == null) {
            	HEAD = null;
            } else {
            	lastNode = HEAD;
            	while (lastNode.getNext() != null) {
            		preNode = lastNode;
            		lastNode = lastNode.getNext();
            	}
            	preNode.setNext(null);
            }
        }
    }
    public void removeHead() {
        if (HEAD == null) {
            System.out.println("list kosong");
        }else {
        	Node temp = HEAD;
        	HEAD = HEAD.getNext();
        	temp.setNext(null);
        	if(HEAD == null) {
        	System.out.println("List Kosong");
        }
    }
}

	public void removeMid(int e){
	    Node preNode = new Node(0);
	    Node tempNode;
	    int i;
	    boolean ketemu;
	    if (HEAD == null){
	        System.out.println("Data masih kosong");
	    } else {
	        ketemu = false;
	        i = 1;
	        tempNode = HEAD;
	        while (tempNode.getNext() != null && !ketemu)
	        {
	            if (tempNode.getData() == e){
	                ketemu = true;
	            } else {
	                preNode = tempNode;
	                tempNode = tempNode.getNext();
	                i++;
	            }
	        }
	        if (ketemu)
	        {
	            if (i==1){
	                HEAD = null;
	            } else {
	                preNode.setNext(tempNode.getNext());
	            }
	        }
	    }
	}

	    
	public boolean find(int x) {
		Node curNode = HEAD;
		boolean ketemu = false;
		
		while (curNode != null && !ketemu) {
			if (curNode.getData() == x)
				ketemu = true;
			else 
				curNode = curNode.getNext();
		}
		return ketemu;
	}
	public int size() {
	    Node currNode = HEAD;
	    int jumlah = 0;
	        while (currNode != null) {
	            jumlah++;
	            currNode = currNode.next;
	        }
	        return jumlah;
	}
	public void removeList() {
	    HEAD = null;
	    System.out.println("List Kosong");
	}
}

