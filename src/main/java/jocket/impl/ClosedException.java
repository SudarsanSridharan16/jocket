package jocket.impl;

@SuppressWarnings("serial")
public class ClosedException extends RuntimeException {

  public ClosedException(String message) {
    super(message);
  }
}
