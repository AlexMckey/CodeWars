import PlayingWithPassphrases.PlayPass
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class  PlayPassTest {

    @Test
    fun basicTests() {
        assertEquals("!!!VpZ FwPm j ", PlayPass.playPass(" I LOVE YOU!!!", 1))
        assertEquals("!!!uOy eVoL I", PlayPass.playPass("I LOVE YOU!!!", 0))
        assertEquals("zDdCcBbB", PlayPass.playPass("AAABBCCY", 1))

    }
}