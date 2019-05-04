package ru.itmo.exceptions;

public class NegativeQuantityException extends Exception {

  public NegativeQuantityException(final String message) {
    super(message);
  }

  public NegativeQuantityException() {
    super();
  }
}
