package org.learning.datastructure;

import java.util.HashMap;

public class LRUCache {
	int capacity;
	HashMap<Integer, DataNode> map = new HashMap<Integer, DataNode>();
	DataNode head = null;
	DataNode end = null;

	public LRUCache(int capacity) {
		this.capacity = capacity;
	}

	public int get(int key) {
		if (map.containsKey(key)) {
			DataNode n = map.get(key);
			remove(n);
			setHead(n);
			return n.value;
		}

		return -1;
	}

	public void remove(DataNode n) {
		if (n.pre != null) {
			n.pre.next = n.next;
		} else {
			head = n.next;
		}

		if (n.next != null) {
			n.next.pre = n.pre;
		} else {
			end = n.pre;
		}

	}

	public void setHead(DataNode n) {
		n.next = head;
		n.pre = null;

		if (head != null)
			head.pre = n;

		head = n;

		if (end == null)
			end = head;
	}

	public void set(int key, int value) {
		if (map.containsKey(key)) {
			DataNode old = map.get(key);
			old.value = value;
			remove(old);
			setHead(old);
		} else {
			DataNode created = new DataNode(key, value);
			if (map.size() >= capacity) {
				map.remove(end.key);
				remove(end);
				setHead(created);

			} else {
				setHead(created);
			}

			map.put(key, created);
		}
	}

	public static void main(String[] args){

			LRUCache lr=new LRUCache(5);
			
			lr.set(1, 111);
			lr.set(2,222);
			lr.set(3,333);
			lr.set(4, 444);
			lr.set(5, 555);
			
			int val=lr.get(1);
			System.out.println(val);
			
			lr.set(6, 666);
			lr.set(7, 777);
			
			int val2=lr.get(2);
			System.out.println(val2);

	}

}

class DataNode {
	int key;
	int value;
	DataNode pre;
	DataNode next;

	public DataNode(int key, int value) {
		this.key = key;
		this.value = value;
	}
}