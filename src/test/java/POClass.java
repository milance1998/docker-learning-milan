import io.qameta.allure.Step;

public class POClass {


    @Step("This is first allure step.")
    public void justTestMethod() {
        System.out.println("just do nothing.");
    }

    @Step("This is second allure step.")
    public void justTestMethod2() {
        System.out.println("just do nothing 2.");
    }

}
