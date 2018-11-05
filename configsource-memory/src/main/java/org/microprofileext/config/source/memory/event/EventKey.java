package org.microprofileext.config.source.memory.event;

import java.lang.annotation.Documented;
import java.lang.annotation.Target;
import javax.inject.Qualifier;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.enterprise.util.AnnotationLiteral;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Qualifier
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EventKey {
    String value();
    
    @AllArgsConstructor @NoArgsConstructor
    class EventKeyLiteral extends AnnotationLiteral<EventKey> implements EventKey {
        private String key;
        
        public String value(){
            return this.key;         
        }
    }
}