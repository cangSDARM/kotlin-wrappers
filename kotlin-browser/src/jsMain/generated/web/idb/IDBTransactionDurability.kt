// Automatically generated - do not modify!

package web.idb

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface IDBTransactionDurability {
    companion object {
        @JsValue("default")
        val default: IDBTransactionDurability

        @JsValue("relaxed")
        val relaxed: IDBTransactionDurability

        @JsValue("strict")
        val strict: IDBTransactionDurability
    }
}
