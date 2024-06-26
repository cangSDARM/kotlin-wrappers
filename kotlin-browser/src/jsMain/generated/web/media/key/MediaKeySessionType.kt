// Automatically generated - do not modify!

package web.media.key

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface MediaKeySessionType {
    companion object {
        @JsValue("persistent-license")
        val persistentLicense: MediaKeySessionType

        @JsValue("temporary")
        val temporary: MediaKeySessionType
    }
}
