package ftc.test.mvc;

import io.sentry.Sentry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.rmi.RemoteException;

/**
 * @author jjaroslavtsev
 * @since 30/09/2020
 */
@Slf4j
@Component
public class Job {

    @Scheduled(fixedRate = 5000)
    public void runTask() {
        Sentry.capture(new RemoteException("In job exception"));
    }
}
