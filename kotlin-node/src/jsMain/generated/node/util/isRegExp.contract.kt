// Generated by Karakum - do not modify it manually!

package node.util

import js.regexp.RegExp
import kotlin.contracts.contract


@Suppress("NOTHING_TO_INLINE", "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isRegExp(value: Any?): Boolean /* object is RegExp */ {
    contract {
        returns(true) implies (value is RegExp)
    }

    return isRegExpRaw(value)
}
