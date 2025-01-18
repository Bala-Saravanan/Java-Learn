package dsa;

import java.util.*;

class Node {
    int value;
    Node next;
    
    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    Node tail;
    int size;
    
    LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public boolean isEmpty() {
        return this.size == 0;
    }
    public int getSize() {
        return this.size;
    }
    public void prepend(int value) {
        Node node = new Node(value);
        if (this.isEmpty()) {
            this.head = node;
            this.tail = node;
            node.next = null;
        } else {
            node.next = this.head;
            this.head = node;
        }
        this.size ++;
    }
    public void append(int value) {
        Node node = new Node(value);
        if (this.isEmpty()) {
            this.head = node;
            this.tail = node;
            node.next = null;
        } else {
            this.tail.next = node;
            this.tail = node;
        }
        this.size ++;
    }
    public void insert(int index, int value) {
    	
        if (index > this.size || index < 0) {
        	throw new IndexOutOfBoundsException("The Given index is Out of Bounds.");
        } 
        else if (index == 0) {
            this.prepend(value);
        } 
        else {
            Node node = new Node(value);
            Node prev = this.head;
            for (int i = 0; i < index - 1; i ++) {
                prev = prev.next;
            }
            node.next = prev.next;
            prev.next = node;
            this.size ++;
        }
    }
    public int removeFromEnd() {
    	
        if (this.isEmpty()) {
            throw new NoSuchElementException("No Such Element Exist.");
        }
        int value = this.tail.value;
        Node prev = this.head;
        while (prev.next != this.tail) {
            prev = prev.next;
        }
        prev.next = null;
        this.tail = prev;
        this.size --;
        return value;
    }
    public int removeFromStart() {
        if (this.isEmpty()) {
            throw new NoSuchElementException("No Such Element Exist.");
        } 
        int value = this.head.value;
        this.head = this.head.next;
        this.size --;
        return value;
    }
    public int removeFromIndex(int index) {
        if (index >= this.size || index < 0) {
            throw new IndexOutOfBoundsException("The Index is Out of Bounds.");
        } 
        if (index == 0) {
            return this.removeFromStart();
        }
        if (index == this.size - 1) {
            return this.removeFromEnd();
        }
        Node prev = this.head;
        for (int i = 0; i < index - 1; i ++) {
            prev = prev.next;
        }
        int value = prev.next.value;
        prev.next = prev.next.next;
        this.size --;
        return value;
    }
    public int removeValue(int value) {
    	if (this.isEmpty()) {
    		throw new NoSuchElementException("No such element exist.");
    	}
        if (value == this.tail.value) {
            return this.removeFromEnd();
        }
        Node prev = this.head;
        if (prev.value == value) {
            return this.removeFromStart();
        }
        while (prev.next != null) {
            if (prev.next.value == value) {
                prev.next = prev.next.next;
                this.size --;
                return value;
            }
            prev = prev.next;
        }
        throw new IndexOutOfBoundsException("The Index is Out of Bounds.");
    }
    public int search(int value) {
    	Node curr = this.head;
    	int index = 0;
    	for (int i = 0; i < this.size; i ++) {
    		if (curr.value == value) {
    			return index;
    		}
    		curr = curr.next;
    		index ++;
    	}
    	throw new NoSuchElementException("No Such Element Exists.");
    }
    public void reverse() {
    	Node prev = null;
    	Node curr = this.head;
    	while (curr != null) {
    		Node next = curr.next;
    		curr.next = prev;
    		prev = curr;
    		curr = next;
    	}
    	this.tail = this.head;
    	this.head = prev;
    }
    public void print() {
        if (this.isEmpty()) {
        	throw new IndexOutOfBoundsException("The Index is Out of Bounds.");
        } else {
            Node curr = this.head;
            List<Integer> listValues = new ArrayList<>();
            while (curr.next != null) {
                listValues.add(curr.value);
                curr = curr.next;
            }
            listValues.add(curr.value);
            System.out.println(listValues);
        }
    }
}

class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        // System.out.println(list.isEmpty());
        list.prepend(30);
        list.prepend(20);
        list.prepend(10);
        list.append(40);
        list.append(50);
        
        try {
        	list.insert(2, 25);
        	list.insert(4, 35);
        	System.out.println(list.removeFromEnd());
        	System.out.println(list.removeFromEnd());
        	System.out.println(list.removeFromStart());
        	System.out.println(list.removeFromIndex(2));
        	System.out.println(list.removeValue(20));
        	int value = 35;
        	System.out.println("Index of " + value + ": " + list.search(35));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
        
        list.print();
        System.out.println("Head: " + list.head.value);
        System.out.println("Tail: " + list.tail.value);
        list.reverse();
        list.print();
        System.out.println("Head: " + list.head.value);
        System.out.println("Tail: " + list.tail.value);
        
        System.out.println("Size: " + list.getSize());
    }
}
