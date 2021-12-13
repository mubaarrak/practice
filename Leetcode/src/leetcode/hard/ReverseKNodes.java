package leetcode.hard;

import java.util.Stack;

public class ReverseKNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode tempListNode = new ListNode(1, new ListNode(2));

		// ListNode tempListNode = new ListNode(1);

		ListNode result = reverseKGroup(tempListNode, 2);

		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append(result.val).append(" -> ");

		while (result.next != null) {

			stringBuilder.append(result.next.val).append(" -> ");

			result = result.next;

		}

		System.out.println(stringBuilder.toString());

	}

	private static int getCount(ListNode head) {

		int count = 0;

		if (head == null) {
			return 0;
		} else {
			count++;
		} 
			

		while (head.next != null) {
			count++;
			head = head.next;
		}

		return count;

	}

	public static ListNode reverseKGroup(ListNode head, int k) {

		if (head == null ) {
			return null;
		}
		
		if (k<=1) {
			return head;
		}

		Stack<ListNode> nodesToReverse = new Stack<>();

		ListNode finaList = new ListNode(0);

		while (head.next != null) {

			for (int i = 0; i < k - 1; i++) {

				if (nodesToReverse.isEmpty()) {
					nodesToReverse.push(new ListNode(head.val));
				}
				nodesToReverse.push(new ListNode(head.next.val));
				head = head.next;
			}

			ListNode pointer = finaList;

			while (!nodesToReverse.isEmpty()) {

				while (pointer.next != null) {
					pointer = pointer.next;
				}

				pointer.next = new ListNode(nodesToReverse.pop().val);

			}

			head = head.next;

			if (getCount(head) < k) {
				pointer.next.next = head;
				break;
			}

			if (head == null) {
				break;
			}

		}

		return finaList.next == null ? head : finaList.next ;

	}

}
