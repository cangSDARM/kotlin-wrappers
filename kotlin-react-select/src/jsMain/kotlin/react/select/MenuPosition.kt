package react.select

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface MenuPosition {
    companion object {
        @JsValue("absolute")
        val absolute: MenuPosition

        @JsValue("fixed")
        val fixed: MenuPosition
    }
}
