// Automatically generated - do not modify!

package media.source

import js.core.ArrayLike
import web.events.Event
import web.events.EventHandler
import web.events.EventTarget

sealed external class SourceBufferList :
    EventTarget,
    ArrayLike<SourceBuffer> {
    var onaddsourcebuffer: EventHandler<Event>?
    var onremovesourcebuffer: EventHandler<Event>?
}
