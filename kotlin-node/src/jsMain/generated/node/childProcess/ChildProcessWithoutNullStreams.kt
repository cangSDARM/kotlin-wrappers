// Generated by Karakum - do not modify it manually!


package node.childProcess

import node.stream.Readable
import node.stream.Writable

// return this object when stdio option is undefined or not specified

@Suppress("INTERFACE_WITH_SUPERCLASS")

sealed external interface ChildProcessWithoutNullStreams : ChildProcess {
    @JsName("stdin")
    var requiredStdin: Writable

    @JsName("stdout")
    var requiredStdout: Readable

    @JsName("stderr")
    var requiredStderr: Readable

    @JsName("stdio")
    val requiredStdio: js.core.JsTuple5<Writable, Readable, Readable, // stderr
            Any? /* Readable | Writable | null | undefined */, // extra, no modification
            Any? /* Readable | Writable | null | undefined */// extra, no modification
            >
}
