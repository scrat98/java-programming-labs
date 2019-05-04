package ru.itmo.exceptions;

public class CatalogLoadException extends Exception {

  public CatalogLoadException(final String message) {
    super(message);
  }

  public CatalogLoadException() {
    super();
  }
}
