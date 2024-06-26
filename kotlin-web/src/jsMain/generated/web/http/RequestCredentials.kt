// Automatically generated - do not modify!

package web.http

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface RequestCredentials {
    companion object {
        @JsValue("include")
        val include: RequestCredentials

        @JsValue("omit")
        val omit: RequestCredentials

        @JsValue("same-origin")
        val sameOrigin: RequestCredentials
    }
}
