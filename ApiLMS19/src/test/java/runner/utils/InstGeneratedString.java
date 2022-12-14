package runner.utils;

import java.util.Random;

public class InstGeneratedString {
    //implemen generated value yang beda beda secara random
    public String randomEmailInstructor(){
        Random random = new Random();
        String email = "testingQE" + random.nextInt() + "@mail.co";
        return email;
    }

    public String randomName(){
        Random random = new Random();
        String name = "java no " + random.nextInt(1000);
        return name;
    }


}
