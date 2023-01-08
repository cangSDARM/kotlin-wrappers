package js.typedarrays

import js.buffer.ArrayBufferLike
import js.core.JsIterable
import js.core.ReadonlyArray

open external class Uint32Array(
    buffer: ArrayBufferLike,
    byteOffset: Int = definedExternally,
    length: Int = definedExternally
) : TypedArray<Uint32Array, Int> {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<Int>)
    constructor(elements: ReadonlyArray<Int>)

    companion object {
        val BYTES_PER_ELEMENT: Int
    }
}
