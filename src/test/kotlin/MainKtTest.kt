import org.junit.Assert.*
import org.junit.Test

class MainKtTest {

    @Test
    fun sayHelloTest() {
        val result = sayHello()
        assertEquals("Hello", result)
    }
}