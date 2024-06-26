// Automatically generated - do not modify!

package web.audio

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface ChannelCountMode {
    companion object {
        @JsValue("clamped-max")
        val clampedMax: ChannelCountMode

        @JsValue("explicit")
        val explicit: ChannelCountMode

        @JsValue("max")
        val max: ChannelCountMode
    }
}
