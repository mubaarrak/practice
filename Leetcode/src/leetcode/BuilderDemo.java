package leetcode;

class LunchOrder {

	String starter;

	String mainCourse;

	public static class Builder {
		String starter;
		String mainCourse;

		public LunchOrder build() {
			return new LunchOrder(this);
		}

		public Builder starter(String starter) {
			this.starter = starter;
			return this;

		}

		public Builder mainCourse(String mainCourse) {
			this.mainCourse = mainCourse;
			return this;
		}

	}

	public LunchOrder(Builder builder) {
		this.mainCourse = builder.mainCourse;
		this.starter = builder.starter;
	}

	public String getStarter() {
		return starter;
	}

	public String getMainCourse() {
		return mainCourse;
	}
	
	@Override
	public String toString() {
		return "LunchOrder [starter=" + starter + ", mainCourse=" + mainCourse + "]";
	}

}

public class BuilderDemo {

	public static void main(String[] args) {
		LunchOrder.Builder builder = new LunchOrder.Builder();

		builder.starter("Chicken tikka").mainCourse("Paneer Handi");

		LunchOrder lunchOrder = builder.build();

		System.out.println(lunchOrder.toString());

	}

}
