// Generated by Karakum - do not modify it manually!

@file:JsModule("node:util/types")

package node.util.types


/**
 * Returns `true` if the value is a built-in [`Uint16Array`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Uint16Array) instance.
 *
 * ```js
 * util.types.isUint16Array(new ArrayBuffer());  // Returns false
 * util.types.isUint16Array(new Uint16Array());  // Returns true
 * util.types.isUint16Array(new Float64Array());  // Returns false
 * ```
 * @since v10.0.0
 */

@JsName("isUint16Array")
external fun isUint16ArrayRaw(`object`: Any?): Boolean /* object is Uint16Array */