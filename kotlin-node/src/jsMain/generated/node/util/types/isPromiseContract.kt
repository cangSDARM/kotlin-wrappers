// Generated by Karakum - do not modify it manually!

package node.util.types

import js.promise.Promise


@Suppress("NOTHING_TO_INLINE", "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isPromise(`object`: Any?): Boolean /* object is Promise<unknown> */ {
    kotlin.contracts.contract {
        returns(true) implies (`object` is Promise<Any?>)
    }

    return isPromiseRaw(`object`)
}