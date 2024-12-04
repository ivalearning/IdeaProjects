package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"features"},  //specikuje, kde je feature file, pokud je na stejne urovni, tak staci adresar, jinak cela cesta
        glue = {"steps"}, // //specikuje, kde je steps file, pokud je na stejne urovni, tak staci adresar, jinak cela cesta
        //plugin = { "pretty", "html:Report1"} ..........jak otevrit? negenerue index.html
        //plugin = {"pretty", "json:Report3"}
        plugin = {"pretty", "junit:Report3"},  //vystup pouziva Jenkins
        dryRun = false, // true = mel by jen najit scenare, kde nejsou definovane stepy, false = spusti ty, kde jsou vydefinovane stepy
        monochrome = false, // jednobarevne?
        tags = "@P2"  // tagy se pridavaji do feature souboru k jednotlivym scenarum, asociace napr. @P1 ....... muzu pouzit stejny tag k vice scenarum?
        //name = {"Search"} // spusti jen scenare ve vsech feature souborech, jejich jmeno obsahuje slovo Search
        )
public class TestRunner {
}
