package com.example.webcore.application.core;

/**
 * Базовое исключение времени выполнения в приложении.
 * 
 * @author btarelkin
 *
 */
public class AppRuntimeException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  public AppRuntimeException() {
  }

  public AppRuntimeException(String message) {
    super(message);
  }

  public AppRuntimeException(Throwable cause) {
    super(cause);
  }

  public AppRuntimeException(String message, Throwable cause) {
    super(message, cause);
  }

  public AppRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

}
