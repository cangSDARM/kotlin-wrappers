// Automatically generated - do not modify!

package web.push

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface PushEncryptionKeyName {
    companion object {
        @JsValue("auth")
        val auth: PushEncryptionKeyName

        @JsValue("p256dh")
        val p256dh: PushEncryptionKeyName
    }
}
