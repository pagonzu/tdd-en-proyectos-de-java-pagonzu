package com.tt1.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

class ToDoTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {}

	@AfterAll
	static void tearDownAfterClass() throws Exception {}

	@BeforeEach
	void setUp() throws Exception {}

	@AfterEach
	void tearDown() throws Exception {}

	@Test
	void testGettersSetters() {
		ToDo todo = new ToDo("Test", "Desc", LocalDate.now());
		assertEquals("Test", todo.getNombre());
		assertFalse(todo.isCompletado());
		todo.setCompletado(true);
		assertTrue(todo.isCompletado());
	}
}