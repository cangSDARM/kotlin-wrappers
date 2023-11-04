// Generated by Karakum - do not modify it manually!


package node.fs


sealed external interface FileReadOptions<T : js.buffer.ArrayBufferView /* default is node.buffer.Buffer */> {
    /**
     * @default `Buffer.alloc(0xffff)`
     */
    var buffer: T?

    /**
     * @default 0
     */
    var offset: Double?

    /**
     * @default `buffer.byteLength`
     */
    var length: Double?
    var position: Double?
}
