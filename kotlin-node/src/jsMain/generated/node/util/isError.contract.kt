// Generated by Karakum - do not modify it manually!

package node.util

import kotlin.contracts.contract


@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isError(value: Any?): Boolean /* object is Error */ {
    contract {
        returns(true) implies (value is js.errors.JsError)
    }

    return isErrorRaw(value)
}
