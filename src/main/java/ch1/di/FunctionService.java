package ch1.di;

import org.springframework.stereotype.Service;

/**
 * Created by RenJian on 2017/6/30.
 */
@Service
public class FunctionService {
    public String sayHello(String word) {
        return "Hello " + word;
    }
}
