package taxi.service.impl;

import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import taxi.exception.AuthenticationException;
import taxi.lib.Inject;
import taxi.lib.Service;
import taxi.model.Driver;
import taxi.service.AuthenticationService;
import taxi.service.DriverService;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private static final Logger logger = LogManager.getLogger(AuthenticationServiceImpl.class);
    @Inject
    private DriverService driverService;

    @Override
    public Driver login(String login, String password) throws AuthenticationException {
        Optional<Driver> driver = driverService.getDriverByLogin(login);
        if (driver.isPresent() && driver.get().getPassword().equals(password)) {
            logger.info("The driver: " + driver + " successfully logged in.");
            return driver.get();
        }
        logger.error("Invalid login or password entered.");
        throw new AuthenticationException("Login or password was incorrect");
    }
}
