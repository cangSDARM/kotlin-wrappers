// Generated by Karakum - do not modify it manually!

package node.util.types


@Suppress("NOTHING_TO_INLINE", "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun <T> isSet(`object`: T): Boolean /* object is T extends ReadonlySet<any> ? (unknown extends T ? never : ReadonlySet<any>) : Set<unknown> */ {
    kotlin.contracts.contract {
        returns(true) implies (`object` is js.collections.ReadonlySet<*>)
    }

    return isSetRaw<T>(`object`)
}


@Suppress("NOTHING_TO_INLINE", "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun <T> isSet(`object`: Any): Boolean /* object is T extends ReadonlySet<any> ? (unknown extends T ? never : ReadonlySet<any>) : Set<unknown> */ {
    kotlin.contracts.contract {
        returns(true) implies (`object` is js.collections.ReadonlySet<*>)
    }

    return isSetRaw<T>(`object`)
}