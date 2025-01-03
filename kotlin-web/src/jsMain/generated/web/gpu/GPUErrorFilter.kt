// Automatically generated - do not modify!

package web.gpu

import seskar.js.JsValue

sealed external interface GPUErrorFilter {
    companion object {
        @JsValue("internal")
        val internal: GPUErrorFilter

        @JsValue("out-of-memory")
        val outOfMemory: GPUErrorFilter

        @JsValue("validation")
        val validation: GPUErrorFilter
    }
}
