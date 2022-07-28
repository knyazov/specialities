package akzholedu.kz.specialities.exceptions;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class NoSuchPageException  extends  RuntimeException{
    private String message;
}
