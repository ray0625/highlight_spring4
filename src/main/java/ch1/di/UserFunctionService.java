package ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by RenJian on 2017/6/30.
 */
@Service
public class UserFunctionService {
    @Autowired
    FunctionService functionService;

    public String SayHello (String word) {
        return functionService.sayHello(word);
    }

}
