package noTeenSum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NoTeenSumTest {


		@Test
		void test1() {
			NoTeenSum a = new NoTeenSum();
			assertEquals(6, a.main(1, 2, 3));
		}
		@Test
		void test2() {
			NoTeenSum b = new NoTeenSum();
			assertEquals(3, b.main(2, 13, 1));
		}
		@Test
		void test3() {
			NoTeenSum c = new NoTeenSum();
			assertEquals(3, c.main(2, 1, 14));
		}
		@Test
		void test4() {
			NoTeenSum d = new NoTeenSum();
			assertEquals(18, d.main(2, 1, 15));
		}
		@Test
		void test5() {
			NoTeenSum e = new NoTeenSum();
			assertEquals(19, e.main(2, 1, 16));
		}
		@Test
		void test6() {
			NoTeenSum f = new NoTeenSum();
			assertEquals(3, f.main(2, 1, 17));
		}
		@Test
		void test7() {
			NoTeenSum g = new NoTeenSum();
			assertEquals(3, g.main(17, 1, 2));
		}
		@Test
		void test8() {
			NoTeenSum h = new NoTeenSum();
			assertEquals(19, h.main(2, 15, 2));
		}
		@Test
		void test9() {
			NoTeenSum i = new NoTeenSum();
			assertEquals(16, i.main(16, 17, 18));
		}
	

}
