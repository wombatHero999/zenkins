package com.kh.guestbook;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;

//가즈아!!
public class PostTest {
	//@Disabled
	@Test
	void testSetName() {
		Post post = new Post("TESTER", "2025-09-08 11:01:48", "Test");
		post.setName("DEVOPS");
		assertEquals("DEVOPS", post.getName());
	}
}