// Generated by Karakum - do not modify it manually!

@file:JsModule("node:assert/strict")
@file:JsQualifier("assert")

package node.assert


/**
 * Tests strict inequality between the `actual` and `expected` parameters as
 * determined by [`Object.is()`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/is).
 *
 * ```js
 * import assert from 'node:assert/strict';
 *
 * assert.notStrictEqual(1, 2);
 * // OK
 *
 * assert.notStrictEqual(1, 1);
 * // AssertionError [ERR_ASSERTION]: Expected "actual" to be strictly unequal to:
 * //
 * // 1
 *
 * assert.notStrictEqual(1, '1');
 * // OK
 * ```
 *
 * If the values are strictly equal, an `AssertionError` is thrown with a`message` property set equal to the value of the `message` parameter. If the`message` parameter is undefined, a
 * default error message is assigned. If the`message` parameter is an instance of an `Error` then it will be thrown
 * instead of the `AssertionError`.
 * @since v0.1.21
 */
external fun notEqual(actual: Any?, expected: Any?, message: String = definedExternally): Unit

external fun notEqual(actual: Any?, expected: Any?, message: Throwable /* JsError */ = definedExternally): Unit