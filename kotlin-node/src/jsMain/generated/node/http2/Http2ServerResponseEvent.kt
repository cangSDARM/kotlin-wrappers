// Generated by Karakum - do not modify it manually!

package node.http2


@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@seskar.js.JsVirtual
sealed external interface Http2ServerResponseEvent : node.events.EventType {
    sealed interface CLOSE : Http2ServerResponseEvent
    sealed interface DRAIN : Http2ServerResponseEvent
    sealed interface ERROR : Http2ServerResponseEvent
    sealed interface FINISH : Http2ServerResponseEvent
    sealed interface PIPE : Http2ServerResponseEvent
    sealed interface UNPIPE : Http2ServerResponseEvent

    companion object {
        @seskar.js.JsValue("close")
        val CLOSE: CLOSE

        @seskar.js.JsValue("drain")
        val DRAIN: DRAIN

        @seskar.js.JsValue("error")
        val ERROR: ERROR

        @seskar.js.JsValue("finish")
        val FINISH: FINISH

        @seskar.js.JsValue("pipe")
        val PIPE: PIPE

        @seskar.js.JsValue("unpipe")
        val UNPIPE: UNPIPE
    }
}