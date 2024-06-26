// Automatically generated - do not modify!

package web.codecs

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface HardwareAcceleration {
    companion object {
        @JsValue("no-preference")
        val noPreference: HardwareAcceleration

        @JsValue("prefer-hardware")
        val preferHardware: HardwareAcceleration

        @JsValue("prefer-software")
        val preferSoftware: HardwareAcceleration
    }
}
