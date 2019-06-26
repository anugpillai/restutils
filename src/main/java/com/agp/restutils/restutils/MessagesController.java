package com.agp.restutils.restutils;



import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessagesController {

    private static final String template = "Sample Application running on , %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/getinfo")
    public Messages greeting(@RequestParam(value="name", defaultValue="OpenShift Platform") String name) {
         return new Messages(counter.incrementAndGet(),
                            String.format(template, name));

                            //Comment added

                            //Comment two
     }
}
