import org.junit.Assert.*
import org.junit.Test

class MainKtTest {

    @Test
    fun sayHelloTest() {

    }

    @Test
    fun sumTest() {
        val sum = sum(5, 6)
        assertEquals(11, sum)
    }
}