package restapi.loadtest;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import restapi.loadtest.cloudflare.LogEventController;
import restapi.loadtest.cloudflare.zone.ZoneController;
import restapi.loadtest.util.TimeDifference;

import java.text.ParseException;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

//@ContextConfiguration(classes = ZoneController.class)

@RunWith(SpringRunner.class)
public class LogEventControllerTest {
//    @Autowired
//    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup().build();
    }

    @Test
    public void testZoneController() throws Exception {
        try {
            mockMvc.perform(get("/client/v4/zones?page=1"))
                    .andDo(print()).andReturn();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    @Test
    public void testLogEventController() throws Exception {
        try{
            mockMvc.perform(get("/client/v4/zones/{zone-id}/logs/received")).andDo(print()).andReturn();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public void diffSecInstance1() {

        TimeDifference td = new TimeDifference();

        assertEquals(3600, td.diffSecInstance("2019-07-07T15:41:00Z", "2019-07-07T16:41:00Z"));
        assertEquals(7200, td.diffSecInstance("2019-07-07T15:41:00Z", "2019-07-07T17:41:00Z"));
        assertEquals(10800, td.diffSecInstance("2019-07-07T15:41:00Z", "2019-07-07T18:41:00Z"));
        assertEquals(1800, td.diffSecInstance("2019-07-07T15:00:00Z", "2019-07-07T15:30:00Z"));

    }

    @Test
    public void diffTime1() throws ParseException {
TimeDifference ts=new TimeDifference();
assertEquals(3600,ts.diffTime("2019-07-07T15:41:00Z", "2019-07-07T16:41:00Z"));
assertEquals(7200,ts.diffTime("2019-07-07T15:41:00Z", "2019-07-07T17:41:00Z"));
assertEquals(10800,ts.diffTime("2019-07-07T15:41:00Z", "2019-07-07T18:41:00Z"));
assertEquals(1800,ts.diffTime("2019-07-07T15:00:00Z", "2019-07-07T15:30:00Z"));

    }

}
