// Automatically generated - do not modify!

package web.gpu

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface GPUBufferMapState {
    companion object {
        @JsValue("unmapped")
        val unmapped: GPUBufferMapState

        @JsValue("pending")
        val pending: GPUBufferMapState

        @JsValue("mapped")
        val mapped: GPUBufferMapState
    }
}
