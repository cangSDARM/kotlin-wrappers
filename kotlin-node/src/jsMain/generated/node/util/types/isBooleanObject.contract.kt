// Generated by Karakum - do not modify it manually!

package node.util.types

import kotlin.contracts.contract


@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isBooleanObject(value: Any?): Boolean /* object is Boolean */ {
    contract {
        returns(true) implies (value is Boolean)
    }

    return isBooleanObjectRaw(value)
}
