// Generated by Karakum - do not modify it manually!

package node.fs

import web.abort.Abortable


sealed external interface ReadFileStringAsyncOptions : Abortable {
    var encoding: node.buffer.BufferEncoding
    var flag: OpenMode?
}
