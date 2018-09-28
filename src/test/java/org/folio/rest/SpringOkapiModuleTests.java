package org.folio.rest;

import static org.junit.Assert.assertTrue;

import org.folio.rest.SpringOkapiModule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SpringOkapiModuleTests extends DefaultTenantContextHelper {

    @Test
    public void testContextLoads() {
        assertTrue("Structure application context failed to load!", true);
    }

    @Test
    public void testStructureApplicationConfigure() {
        SpringOkapiModule application = new SpringOkapiModule();
        SpringApplicationBuilder builder = new SpringApplicationBuilder();
        application.configure(builder);
    }

    @Test
    public void testStructureApplicationMain() {
        SpringOkapiModule.main(new String[0]);
    }

}
