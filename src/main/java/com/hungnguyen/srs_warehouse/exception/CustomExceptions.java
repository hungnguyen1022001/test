package com.hungnguyen.srs_warehouse.exception;

public class CustomExceptions {

    public static class NotFoundException extends BaseException {
        public NotFoundException(String messageCode) {
            super(messageCode);
        }
    }

    public static class InvalidCredentialsException extends BaseException {
        public InvalidCredentialsException(String messageCode) {
            super(messageCode);
        }
    }

    public static class UnauthorizedAccessException extends BaseException {
        public UnauthorizedAccessException(String messageCode) {
            super(messageCode);
        }
    }
}
