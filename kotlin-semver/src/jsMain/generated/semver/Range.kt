// Generated by Karakum - do not modify it manually!

@file:JsModule("semver")

package semver

import js.array.ReadonlyArray

external class Range {
    constructor (range: String)

    constructor (range: String, optionsOrLoose: Boolean = definedExternally)

    constructor (range: String, optionsOrLoose: RangeOptions = definedExternally)

    constructor (range: Range)

    constructor (range: Range, optionsOrLoose: Boolean = definedExternally)

    constructor (range: Range, optionsOrLoose: RangeOptions = definedExternally)

    var range: String
    var raw: String
    var loose: Boolean
    var options: Options
    var includePrerelease: Boolean

    fun format(): String

    fun inspect(): String

    var set: ReadonlyArray<ReadonlyArray<Comparator>>

    fun parseRange(range: String): ReadonlyArray<Comparator>

    fun test(version: String): Boolean

    fun test(version: SemVer): Boolean

    fun intersects(range: Range): Boolean

    fun intersects(
        range: Range,
        optionsOrLoose: Boolean = definedExternally,
    ): Boolean

    fun intersects(
        range: Range,
        optionsOrLoose: Options = definedExternally,
    ): Boolean
}