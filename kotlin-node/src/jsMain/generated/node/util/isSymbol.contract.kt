// Generated by Karakum - do not modify it manually!

package node.util

import kotlin.contracts.contract


@Suppress("NOTHING_TO_INLINE", "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE")
inline fun isSymbol(value: Any?): Boolean /* object is symbol */ {
    contract {
        returns(true) implies (value is js.symbol.Symbol)
    }

    return isSymbolRaw(value)
}