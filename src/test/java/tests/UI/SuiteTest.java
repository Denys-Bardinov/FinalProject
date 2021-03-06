package tests.UI;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.UI.authentication.Authentication;
import tests.UI.events.Events;
import tests.UI.search.SearchPhones;
import tests.UI.search.SearchResultFacets;


@RunWith(Suite.class)
@Suite.SuiteClasses({SearchPhones.class, SearchResultFacets.class, Authentication.class, Events.class})
public class SuiteTest {

}
