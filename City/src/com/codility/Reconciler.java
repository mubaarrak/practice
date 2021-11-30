package com.codility;

import java.util.*;
import java.util.stream.*;

class PendingTransaction {
	long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}

class ProcessedTransaction {
	String id;
	Optional<String> status;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Optional<String> getStatus() {
		return status;
	}

	public void setStatus(Optional<String> status) {
		this.status = status;
	}

}

public class Reconciler {

	Stream<PendingTransaction> reconcile(Stream<PendingTransaction> pending,
			Stream<Stream<ProcessedTransaction>> processed) {

		Stream<PendingTransaction> stream = Stream.empty();
		Stream<PendingTransaction> temp = Stream.empty();

		if (pending != null && processed != null) {
			temp = pending.filter(one -> processed.anyMatch(two -> two.anyMatch(
					three -> !three.getId().equals(Long.toString(one.getId())) && !three.getStatus().equals("DONE"))));

		}

		return temp.count() >= 1 ? temp : stream;
	}

}
