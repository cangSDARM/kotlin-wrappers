// Generated by Karakum - do not modify it manually!

package electron.core

sealed external interface ClientRequestConstructorOptionsReferrerPolicy {
    companion object {
        @seskar.js.JsValue("")
        val `_`: ClientRequestConstructorOptionsReferrerPolicy

        @seskar.js.JsValue("no-referrer")
        val noReferrer: ClientRequestConstructorOptionsReferrerPolicy

        @seskar.js.JsValue("no-referrer-when-downgrade")
        val noReferrerWhenDowngrade: ClientRequestConstructorOptionsReferrerPolicy

        @seskar.js.JsValue("origin")
        val origin: ClientRequestConstructorOptionsReferrerPolicy

        @seskar.js.JsValue("origin-when-cross-origin")
        val originWhenCrossOrigin: ClientRequestConstructorOptionsReferrerPolicy

        @seskar.js.JsValue("unsafe-url")
        val unsafeUrl: ClientRequestConstructorOptionsReferrerPolicy

        @seskar.js.JsValue("same-origin")
        val sameOrigin: ClientRequestConstructorOptionsReferrerPolicy

        @seskar.js.JsValue("strict-origin")
        val strictOrigin: ClientRequestConstructorOptionsReferrerPolicy

        @seskar.js.JsValue("strict-origin-when-cross-origin")
        val strictOriginWhenCrossOrigin: ClientRequestConstructorOptionsReferrerPolicy
    }
}