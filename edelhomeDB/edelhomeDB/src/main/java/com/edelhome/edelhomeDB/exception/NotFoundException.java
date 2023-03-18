package com.edelhome.edelhomeDB.exception;


public class NotFoundException extends RuntimeException{
    
    // public NotFoundException(String message) {
    //    super(message);
    // }

    // public NotFoundException(String message, Object... args) {
    //   super(MessageFormat.format(message, args));
    // }   

    // public static Supplier<NotFoundException> notFoundException(String message, Object... args) {
    //   return () -> new NotFoundException(message, args);
    // }

    // public static Supplier<NotFoundException> notFoundException(String message) {
    //   return () -> new NotFoundException(message);
    // }

    public NotFoundException(String message) {
      super(message);
  }

  public NotFoundException(String message, Throwable cause) {
      super(message, cause);
  }
}
