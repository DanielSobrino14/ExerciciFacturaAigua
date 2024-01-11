import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FuncionsPreuKtTest {
    @Test
    fun testConsumLitresAiguaMenorA5O() {
        val expected = listOf(6.0, 0.0)
        assertEquals(expected, consumLitresAigua(40))
    }

    @Test
    fun testConsumLitresAiguaEntreInterval() {
        val expected = listOf(6.0, 15.0)
        assertEquals(expected, consumLitresAigua(100))
    }

    @Test
    fun testConsumLitresAiguaMayorA5O() {
        val expected = listOf(6.0, 75.0)
        assertEquals(expected, consumLitresAigua(250))
    }
    @Test
    fun testDescomopteFamiliaTrue() {
        val expected = 50
        assertEquals(expected, descompteFamilia(true, 5))
    }

    @Test
    fun testDescompteFamiliaFalseI3membres() {
        val expected = 0
        assertEquals(expected, descompteFamilia(false, 3))
    }


}