// Generated by Karakum - do not modify it manually!

package node.util.types

import kotlin.contracts.contract


@Suppress("CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isTypedArray(value: Any?): Boolean /* object is NodeJS.TypedArray */ {
    contract {
        returns(true) implies (value is js.typedarrays.TypedArray<*, *, *, *>)
    }

    return isTypedArrayRaw(value)
}
