package guru.springframework.didemo;

import guru.springframework.didemo.controllers.ConstructionInjectedController;
import guru.springframework.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructionInjectedControllerTest {

    private ConstructionInjectedController constructionInjectedController;

    @Before
    public void setUp() throws Exception{
        this.constructionInjectedController = new ConstructionInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_GURUS, constructionInjectedController.sayHello());
    }
}
