package org.gradlebootstrap;

import static org.junit.Assert.*;
import gradlebootstrap.TimeRenderer;

import org.junit.Test;

public class TimeRendererTest {

	@Test
	public void test() {
		TimeRenderer timeRenderer=new TimeRenderer();
		String actual=timeRenderer.render(0);
		assertEquals("1970-01-01", actual);
	}

}
