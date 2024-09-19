// Generated by Karakum - do not modify it manually!

@file:JsModule("semver")

package semver

// import SemVer = require("../classes/semver");

// import semver = require("../index");

/**
 * Return the major version number.
 */
external fun major(version: String): Int

/**
 * Return the major version number.
 */
external fun major(
    version: String,
    optionsOrLoose: Boolean = definedExternally,
): Int

/**
 * Return the major version number.
 */
external fun major(
    version: String,
    optionsOrLoose: Options = definedExternally,
): Int

/**
 * Return the major version number.
 */
external fun major(version: SemVer): Int

/**
 * Return the major version number.
 */
external fun major(
    version: SemVer,
    optionsOrLoose: Boolean = definedExternally,
): Int

/**
 * Return the major version number.
 */
external fun major(
    version: SemVer,
    optionsOrLoose: Options = definedExternally,
): Int

// export = major;
