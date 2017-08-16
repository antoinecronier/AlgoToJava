/**
 *
 */
package imiepoecjava2017test.entities;

import static org.junit.Assert.*;
import imiepoecjava2017.entities.Armor;
import imiepoecjava2017.entities.ItemType;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.github.javafaker.Faker;

/**
 * @author tactfactory
 *
 */
public class ArmorTest {

	private Armor armorTest;
	private Faker faker = new Faker();

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		armorTest = new Armor(null, 0, null);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		armorTest = null;
	}

	/**
	 * Test method for {@link imiepoecjava2017.entities.Armor#getDefence()}.
	 */
	@Test
	public void testGetDefence() {
		assertEquals(0, armorTest.getDefence());
	}

	/**
	 * Test method for {@link imiepoecjava2017.entities.Armor#setDefence(int)}.
	 */
	@Test
	public void testSetDefence() {
		armorTest.setDefence(0);
		assertEquals(0, armorTest.getDefence());
		armorTest.setDefence(5);
		assertEquals(5, armorTest.getDefence());
		armorTest.setDefence(-10);
		assertEquals(-10, armorTest.getDefence());
		armorTest.setDefence(10000);
		assertEquals(10000, armorTest.getDefence());
	}

	/**
	 * Test method for {@link imiepoecjava2017.entities.Armor#Armor(java.lang.String, int, imiepoecjava2017.entities.ItemType)}.
	 */
	@Test
	public void testArmor() {
		try {
			assertNotNull(new Armor(null, 0, null));
		} catch (Exception e) {
			fail(e.getMessage());
		}
		try {
			assertNotNull(new Armor("", 0, ItemType.MAGIC));
		} catch (Exception e) {
			fail(e.getMessage());
		}
		try {
			assertNotNull(new Armor("", 0, ItemType.PHYSIC));
		} catch (Exception e) {
			fail(e.getMessage());
		}
		try {
			assertNotNull(new Armor("", 0, ItemType.MIXTE));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	/**
	 * Test method for {@link imiepoecjava2017.entities.Armor#toString()}.
	 */
	@Test
	public void testToString() {
		String result = "Armor [defence=" + 0 + ", getName()=" + "null"
				+ ", getType()=" + "null" + "]\n";

		assertEquals(result, armorTest.toString());

		try {
			armorTest = new Armor("armor1", 5, ItemType.PHYSIC);
		} catch (Exception e) {
			fail(e.getMessage());
		}

		result = "Armor [defence=" + 5 + ", getName()=" + "armor1"
		+ ", getType()=" + "PHYSIC" + "]\n";

		assertEquals(result, armorTest.toString());

		try {
			armorTest = new Armor("armor1", 5, ItemType.MAGIC);
		} catch (Exception e) {
			fail(e.getMessage());
		}

		result = "Armor [defence=" + 5 + ", getName()=" + "armor1"
		+ ", getType()=" + "MAGIC" + "]\n";

		assertEquals(result, armorTest.toString());

		try {
			armorTest = new Armor("armor1", 5, ItemType.MIXTE);
		} catch (Exception e) {
			fail(e.getMessage());
		}

		result = "Armor [defence=" + 5 + ", getName()=" + "armor1"
		+ ", getType()=" + "MIXTE" + "]\n";

		assertEquals(result, armorTest.toString());
	}

	/**
	 * Test method for {@link imiepoecjava2017.entities.Item#getName()}.
	 */
	@Test
	public void testGetName() {
		assertNull(armorTest.getName());
	}

	/**
	 * Test method for {@link imiepoecjava2017.entities.Item#setName(java.lang.String)}.
	 */
	@Test
	public void testSetName() {
		armorTest.setName("");
		assertEquals("", armorTest.getName());
	}

	/**
	 * Test method for {@link imiepoecjava2017.entities.Item#getType()}.
	 */
	@Test
	public void testGetType() {
		assertEquals(null, armorTest.getType());
	}

	/**
	 * Test method for {@link imiepoecjava2017.entities.Item#setType(imiepoecjava2017.entities.ItemType)}.
	 */
	@Test
	public void testSetType() {
		assertEquals(null, armorTest.getType());

		try {
			armorTest.setType(ItemType.MAGIC);
		} catch (Exception e) {
			fail(e.getMessage());
		}
		assertEquals(ItemType.MAGIC, armorTest.getType());
		assertEquals(ItemType.class, armorTest.getType().getClass());

		try {
			armorTest.setType(ItemType.PHYSIC);
		} catch (Exception e) {
			fail(e.getMessage());
		}
		assertEquals(ItemType.PHYSIC, armorTest.getType());
		assertEquals(ItemType.class, armorTest.getType().getClass());

		try {
			armorTest.setType(ItemType.MIXTE);
		} catch (Exception e) {
			fail(e.getMessage());
		}
		assertEquals(ItemType.MIXTE, armorTest.getType());
		assertEquals(ItemType.class, armorTest.getType().getClass());
	}

}
