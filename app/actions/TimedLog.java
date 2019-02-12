package actions;

import java.lang.annotation.*;

import play.mvc.With;

@With(TimerLogAction.class)
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface TimedLog {
    // atributos de la anotación aquí
}
