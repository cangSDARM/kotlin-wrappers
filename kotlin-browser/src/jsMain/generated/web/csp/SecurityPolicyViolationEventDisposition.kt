// Automatically generated - do not modify!

package web.csp

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface SecurityPolicyViolationEventDisposition {
    companion object {
        @JsValue("enforce")
        val enforce: SecurityPolicyViolationEventDisposition

        @JsValue("report")
        val report: SecurityPolicyViolationEventDisposition
    }
}
