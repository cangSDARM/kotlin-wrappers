// Generated by Karakum - do not modify it manually!

package node.util.types

import js.buffer.ArrayBufferLike


@Suppress("NOTHING_TO_INLINE", "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isAnyArrayBuffer(`object`: Any?): Boolean /* object is ArrayBufferLike */ {
    kotlin.contracts.contract {
        returns(true) implies (`object` is ArrayBufferLike)
    }

    return isAnyArrayBufferRaw(`object`)
}