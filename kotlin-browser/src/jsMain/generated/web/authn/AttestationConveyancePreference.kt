// Automatically generated - do not modify!

package web.authn

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface AttestationConveyancePreference {
    companion object {
        @JsValue("direct")
        val direct: AttestationConveyancePreference

        @JsValue("enterprise")
        val enterprise: AttestationConveyancePreference

        @JsValue("indirect")
        val indirect: AttestationConveyancePreference

        @JsValue("none")
        val none: AttestationConveyancePreference
    }
}
