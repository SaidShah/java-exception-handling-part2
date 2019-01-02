package p1;

public class GpaTooBigException extends Exception {
	// all exceptions under runtime are unChecked exceptions and they shouldn't
	// be handled, they should
	// be corrected
	// all of the exceptions under exception but not under runtime are checked
	// exceptions and should be handled
	// because we extended an exception class, this class becomes an exception
	// class

	public GpaTooBigException() {
		super("Gpa is too big");
	}

	public GpaTooBigException(String message) {
		super(message);
	}

}
