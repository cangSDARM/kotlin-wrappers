// Automatically generated - do not modify!

package actions.cache

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface CompressionMethod {
    companion object {
        @JsValue("gzip")
        val Gzip: CompressionMethod

        @JsValue("zstd-without-long")
        val ZstdWithoutLong: CompressionMethod

        @JsValue("zstd")
        val Zstd: CompressionMethod
    }
}
