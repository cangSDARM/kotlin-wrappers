// Generated by Karakum - do not modify it manually!

@file:JsModule("semver")

package semver

// import SemVer = require("../classes/semver");

// import semver = require("../index");

/**
 * Sorts an array of semver entries in descending order using `compareBuild()`.
 */
external fun <T : Any /* string | SemVer */> rsort(list: js.array.ReadonlyArray<T>): js.array.ReadonlyArray<T>

/**
 * Sorts an array of semver entries in descending order using `compareBuild()`.
 */
external fun <T : Any /* string | SemVer */> rsort(
    list: js.array.ReadonlyArray<T>,
    optionsOrLoose: Boolean = definedExternally,
): js.array.ReadonlyArray<T>

/**
 * Sorts an array of semver entries in descending order using `compareBuild()`.
 */
external fun <T : Any /* string | SemVer */> rsort(
    list: js.array.ReadonlyArray<T>,
    optionsOrLoose: Options = definedExternally,
): js.array.ReadonlyArray<T>

// export = rsort;
