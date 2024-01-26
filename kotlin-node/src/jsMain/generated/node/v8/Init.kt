// Generated by Karakum - do not modify it manually!


package node.v8

import js.promise.Promise

/**
 * Called when a promise is constructed. This does not mean that corresponding before/after events will occur, only that the possibility exists. This will
 * happen if a promise is created without ever getting a continuation.
 * @since v17.1.0, v16.14.0
 * @param promise The promise being created.
 * @param parent The promise continued from, if applicable.
 */

sealed external interface Init {

    @seskar.js.JsNative
    operator fun invoke(promise: Promise<Any?>, parent: Promise<Any?>): Unit

}
