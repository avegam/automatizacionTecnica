package runners;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {},
        features = "src/test/resources/features/registro/",
        glue = {"definitions"}
)

public class SerenityRunnerTest {

}
