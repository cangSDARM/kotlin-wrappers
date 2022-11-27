// Automatically generated - do not modify!

package js.intl

import js.core.ReadonlyArray

sealed external interface DateTimeFormat {
    fun formatToParts(date: Any /* Date | number */ = definedExternally): ReadonlyArray<DateTimeFormatPart>
    fun formatRange(
        startDate: Any, /* Date | number | bigint */
        endDate: Any, /* Date | number | bigint */
    ): String

    fun formatRangeToParts(
        startDate: Any, /* Date | number | bigint */
        endDate: Any, /* Date | number | bigint */
    ): ReadonlyArray<DateTimeRangeFormatPart>
}
