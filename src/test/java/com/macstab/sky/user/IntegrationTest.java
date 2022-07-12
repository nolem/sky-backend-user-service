package com.macstab.sky.user;

import com.macstab.sky.user.UserserviceApp;
import com.macstab.sky.user.config.EmbeddedMongo;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = UserserviceApp.class)
@EmbeddedMongo
public @interface IntegrationTest {
}
