// Generated by Karakum - do not modify it manually!

@file:JsModule("semver")

package semver

// import Range = require("../classes/range");

// import semver = require("../index");

/**
 * Mostly just for testing and legacy API reasons
 */
external fun toComparators(range: String): js.array.ReadonlyArray<js.array.ReadonlyArray<String>>

/**
 * Mostly just for testing and legacy API reasons
 */
external fun toComparators(
    range: String,
    optionsOrLoose: Boolean = definedExternally,
): js.array.ReadonlyArray<js.array.ReadonlyArray<String>>

/**
 * Mostly just for testing and legacy API reasons
 */
external fun toComparators(
    range: String,
    optionsOrLoose: Options = definedExternally,
): js.array.ReadonlyArray<js.array.ReadonlyArray<String>>

/**
 * Mostly just for testing and legacy API reasons
 */
external fun toComparators(range: Range): js.array.ReadonlyArray<js.array.ReadonlyArray<String>>

/**
 * Mostly just for testing and legacy API reasons
 */
external fun toComparators(
    range: Range,
    optionsOrLoose: Boolean = definedExternally,
): js.array.ReadonlyArray<js.array.ReadonlyArray<String>>

/**
 * Mostly just for testing and legacy API reasons
 */
external fun toComparators(
    range: Range,
    optionsOrLoose: Options = definedExternally,
): js.array.ReadonlyArray<js.array.ReadonlyArray<String>>

// export = toComparators;