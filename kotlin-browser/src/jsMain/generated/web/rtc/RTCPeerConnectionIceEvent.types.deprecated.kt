// Automatically generated - do not modify!

package web.rtc

import seskar.js.JsValue
import web.events.EventType

sealed external class RTCPeerConnectionIceEventTypes {

    @JsValue("icecandidate")
    fun iceCandidate(): EventType<RTCPeerConnectionIceEvent>
}