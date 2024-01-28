// Generated by Karakum - do not modify it manually!

@file:JsModule("node:http2")

package node.http2

import js.typedarrays.Uint8Array

/**
 * Returns a `HTTP/2 Settings Object` containing the deserialized settings from
 * the given `Buffer` as generated by `http2.getPackedSettings()`.
 * @since v8.4.0
 * @param buf The packed settings.
 */
external fun getUnpackedSettings(buf: Uint8Array): Settings