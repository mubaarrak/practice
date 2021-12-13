package leetcode.hard;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class ListNode {

	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	@Override
	public String toString() {
		return "ListNode [val=" + val + ", next=" + next + "]";
	}

}

public class MergeKSortedLists {

	public static void main(String[] args) {

		/*
		 * ListNode[] arrayOfListNodes = { new ListNode(1, new ListNode(2, new
		 * ListNode(3))), new ListNode(4, new ListNode(5, new ListNode(6))), new
		 * ListNode(7, new ListNode(8)) };
		 */
		ListNode[] arrayOfListNodes = { null, null };

		ListNode result = mergeKLists(arrayOfListNodes);

		StringBuilder stringBuilder = new StringBuilder();

		while (result.next != null) {
			stringBuilder.append(result.val).append(" -> ");

			result = result.next;

		}

		System.out.println(stringBuilder.toString());

	}

	public static ListNode mergeKLists(ListNode[] lists) {

		if (lists == null || lists.length == 0) {
			return null;
		}

		List<Integer> list = new LinkedList<>();

		for (int i = 0; i < lists.length; i++) {

			ListNode head = lists[i];

			if (head == null) {
				continue;
			}

			list.add(head.val);

			while (head.next != null) {
				list.add(head.next.val);

				head = head.next;

			}

		}

		Collections.sort(list);

		ListNode finalList = null;

		for (Integer integer : list) {
			if (finalList == null) {
				finalList = new ListNode(integer);
			} else {

				ListNode head = finalList;

				while (head.next != null) {
					head = head.next;
				}

				head.next = new ListNode(integer);

			}

		}

		return finalList;

	}

}
