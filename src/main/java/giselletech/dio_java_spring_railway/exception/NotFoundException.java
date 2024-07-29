package giselletech.dio_java_spring_railway.exception;

import java.io.Serial;

public class NotFoundException extends BusinessException{

    @Serial
    private static final long serialVersionUID = 1L;

    public NotFoundException(String message) {
        super("Resource not found.");
    }
}
