// Automatically generated - do not modify!

package typescript

import seskar.js.JsIntValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface OutputFileType {
    companion object {
        @JsIntValue(0)
        val JavaScript: OutputFileType

        @JsIntValue(1)
        val SourceMap: OutputFileType

        @JsIntValue(2)
        val Declaration: OutputFileType
    }
}
