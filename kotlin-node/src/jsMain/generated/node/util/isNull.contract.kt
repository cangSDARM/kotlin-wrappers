// Generated by Karakum - do not modify it manually!

package node.util

import kotlin.contracts.contract


@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isNull(value: Any?): Boolean /* object is null */ {
    contract {
        returns(true) implies (value is Nothing?)
    }

    return isNullRaw(value)
}
