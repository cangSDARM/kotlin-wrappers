package react.select

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface FormatOptionLabelContext {
    companion object {
        @JsValue("menu")
        val menu: FormatOptionLabelContext

        @JsValue("value")
        val value: FormatOptionLabelContext
    }
}
