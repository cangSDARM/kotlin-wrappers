package wrappers.example

import web.events.Event
import web.messaging.MessageEvent
import kotlin.test.Test
import kotlin.test.assertIs

class WasmJsEventTest {
    @Test
    fun testEvent() {
        val event = MessageEvent("data")

        assertIs<Event>(event)
    }
}