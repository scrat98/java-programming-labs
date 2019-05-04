package ru.itmo.exceptions;

public class ItemAlreadyExistsException extends Exception {

  public ItemAlreadyExistsException(final String message) {
    super(message);
  }

  public ItemAlreadyExistsException() {
    super();
  }
}
