// Generated by Karakum - do not modify it manually!

package node.http2


@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@seskar.js.JsVirtual
sealed external interface Http2StreamEvent : node.events.EventType {
    sealed interface ABORTED : Http2StreamEvent
    sealed interface CLOSE : Http2StreamEvent
    sealed interface DATA : Http2StreamEvent
    sealed interface DRAIN : Http2StreamEvent
    sealed interface END : Http2StreamEvent
    sealed interface ERROR : Http2StreamEvent
    sealed interface FINISH : Http2StreamEvent
    sealed interface FRAMEERROR : Http2StreamEvent
    sealed interface PIPE : Http2StreamEvent
    sealed interface UNPIPE : Http2StreamEvent
    sealed interface STREAMCLOSED : Http2StreamEvent
    sealed interface TIMEOUT : Http2StreamEvent
    sealed interface TRAILERS : Http2StreamEvent
    sealed interface WANTTRAILERS : Http2StreamEvent

    companion object {
        @seskar.js.JsValue("aborted")
        val ABORTED: ABORTED

        @seskar.js.JsValue("close")
        val CLOSE: CLOSE

        @seskar.js.JsValue("data")
        val DATA: DATA

        @seskar.js.JsValue("drain")
        val DRAIN: DRAIN

        @seskar.js.JsValue("end")
        val END: END

        @seskar.js.JsValue("error")
        val ERROR: ERROR

        @seskar.js.JsValue("finish")
        val FINISH: FINISH

        @seskar.js.JsValue("frameError")
        val FRAMEERROR: FRAMEERROR

        @seskar.js.JsValue("pipe")
        val PIPE: PIPE

        @seskar.js.JsValue("unpipe")
        val UNPIPE: UNPIPE

        @seskar.js.JsValue("streamClosed")
        val STREAMCLOSED: STREAMCLOSED

        @seskar.js.JsValue("timeout")
        val TIMEOUT: TIMEOUT

        @seskar.js.JsValue("trailers")
        val TRAILERS: TRAILERS

        @seskar.js.JsValue("wantTrailers")
        val WANTTRAILERS: WANTTRAILERS
    }
}