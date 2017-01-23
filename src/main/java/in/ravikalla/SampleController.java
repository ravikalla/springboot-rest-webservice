package in.ravikalla;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/sayHello")
    public SampleBean greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new SampleBean(counter.incrementAndGet(),
                            String.format(template, name));
    }

    @RequestMapping("/sayhi")
    public String sayHi(@RequestParam(value="name", defaultValue="World") String name) {
        return "Hi";
    }
}
