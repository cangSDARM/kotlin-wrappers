// Generated by Karakum - do not modify it manually!

package node.vm

import node.buffer.Buffer


sealed external interface CompileFunctionResult : js.function.JsFunctionLegacy<Nothing, Any?> {
    var cachedData: Buffer?
    var cachedDataProduced: Boolean?
    var cachedDataRejected: Boolean?
}
