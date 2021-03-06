package example.app.core.system;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Import({
        SystemClock.class
})
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface IncludeSystem {
}
