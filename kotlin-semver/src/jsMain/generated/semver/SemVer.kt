// Generated by Karakum - do not modify it manually!

@file:JsModule("semver")

package semver

import js.array.ReadonlyArray

external class SemVer {
    constructor (version: String)

    constructor (version: String, optionsOrLoose: Boolean = definedExternally)

    constructor (version: String, optionsOrLoose: RangeOptions = definedExternally)

    constructor (version: SemVer)

    constructor (version: SemVer, optionsOrLoose: Boolean = definedExternally)

    constructor (version: SemVer, optionsOrLoose: RangeOptions = definedExternally)

    var raw: String
    var loose: Boolean
    var options: Options

    fun format(): String

    fun inspect(): String

    var major: Int
    var minor: Int
    var patch: Int
    var version: String
    var build: ReadonlyArray<String>
    var prerelease: ReadonlyArray<Any /* string | number */>

    /**
     * Compares two versions excluding build identifiers (the bit after `+` in the semantic version string).
     *
     * @return
     * - `0` if `this` == `other`
     * - `1` if `this` is greater
     * - `-1` if `other` is greater.
     */
    fun compare(other: String): Int

    /**
     * Compares two versions excluding build identifiers (the bit after `+` in the semantic version string).
     *
     * @return
     * - `0` if `this` == `other`
     * - `1` if `this` is greater
     * - `-1` if `other` is greater.
     */
    fun compare(other: SemVer): Int

    /**
     * Compares the release portion of two versions.
     *
     * @return
     * - `0` if `this` == `other`
     * - `1` if `this` is greater
     * - `-1` if `other` is greater.
     */
    fun compareMain(other: String): Int

    /**
     * Compares the release portion of two versions.
     *
     * @return
     * - `0` if `this` == `other`
     * - `1` if `this` is greater
     * - `-1` if `other` is greater.
     */
    fun compareMain(other: SemVer): Int

    /**
     * Compares the prerelease portion of two versions.
     *
     * @return
     * - `0` if `this` == `other`
     * - `1` if `this` is greater
     * - `-1` if `other` is greater.
     */
    fun comparePre(other: String): Int

    /**
     * Compares the prerelease portion of two versions.
     *
     * @return
     * - `0` if `this` == `other`
     * - `1` if `this` is greater
     * - `-1` if `other` is greater.
     */
    fun comparePre(other: SemVer): Int

    /**
     * Compares the build identifier of two versions.
     *
     * @return
     * - `0` if `this` == `other`
     * - `1` if `this` is greater
     * - `-1` if `other` is greater.
     */
    fun compareBuild(other: String): Int

    /**
     * Compares the build identifier of two versions.
     *
     * @return
     * - `0` if `this` == `other`
     * - `1` if `this` is greater
     * - `-1` if `other` is greater.
     */
    fun compareBuild(other: SemVer): Int

    fun inc(
        release: ReleaseType,
        identifier: String = definedExternally,
    ): SemVer

    override fun toString(): String
}