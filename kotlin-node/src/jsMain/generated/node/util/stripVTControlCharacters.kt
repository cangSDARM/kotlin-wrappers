// Generated by Karakum - do not modify it manually!

@file:JsModule("node:util")

package node.util


/**
 * Returns `str` with any ANSI escape codes removed.
 *
 * ```js
 * console.log(util.stripVTControlCharacters('\u001B[4mvalue\u001B[0m'));
 * // Prints "value"
 * ```
 * @since v16.11.0
 */
external fun stripVTControlCharacters(str: String): String