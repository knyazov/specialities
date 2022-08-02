package akzholedu.kz.specialities.exceptions;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

public class ApiException {

    private final String message;
    //private final Throwable throwable;
    private final int statusCode;
    private final HttpStatus httpStatus;
    private final ZonedDateTime timeStamp;

    public ApiException(String message,
                        //Throwable throwable,
                        int statusCode,
                        HttpStatus httpStatus,
                        ZonedDateTime timeStamp) {
        this.message = message;
        this.statusCode = statusCode;
        this.httpStatus = httpStatus;
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }
//
//    public Throwable getThrowable() {
//        return throwable;
//    }

    public int getStatusCode() {
        return statusCode;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public ZonedDateTime getTimeStamp() {
        return timeStamp;
    }
}
