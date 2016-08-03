package com.spitter.app.web;

import java.util.HashMap;
import java.util.List;
import org.junit.Test;
import com.spitter.app.entity.Spittle;
import com.spitter.app.services.SpitterService;
import static java.util.Arrays.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class HomeControllerTest {
	@Test
	public void shouldDisplayRecentSpittles(){
		List<Spittle> expectedSpittles = asList(new Spittle(), new Spittle(), new Spittle());
		SpitterService spitterService = mock(SpitterService.class);
		
		when(spitterService.getRecentSpittles(25)).thenReturn(expectedSpittles);
		
		HomeController controller = new HomeController(spitterService);
		
		HashMap<String, Object> model = new HashMap<String, Object>();
		
		String viewName = controller.shoeHomePage(model);
		
		assertEquals("home", viewName);
		
		assertSame(expectedSpittles, model.get("spittles"));
		verify(spitterService).getRecentSpittles(25);
	}
}
