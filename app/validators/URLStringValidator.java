package validators;

import play.data.validation.Constraints;
import play.libs.F;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.net.URL;

public class URLStringValidator  extends Constraints.Validator<String> implements ConstraintValidator<StringIsUrl, String> {

    @Override
    public boolean isValid(String url) {
        return this.isValid(url, null);
    }

    @Override
    public F.Tuple<String, Object[]> getErrorMessageKey() {
        return new F.Tuple<>(
                "El campo no es una URL válida", new Object[]{""});
    }


    @Override
    public void initialize(StringIsUrl constraintAnnotation) {

    }

    @Override
    public boolean isValid(String url, ConstraintValidatorContext context) {
        //intentamos crear un objeto URL
        try {
            new URL(url).toURI();
            return true;
        }

        // si no se ha podido crear es por problemas de validacion
        catch (Exception e) {
            return false;
        }
    }
}
