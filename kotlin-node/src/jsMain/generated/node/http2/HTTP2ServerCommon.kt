// Generated by Karakum - do not modify it manually!


package node.http2


sealed external interface HTTP2ServerCommon {
    fun setTimeout(msec: Number = definedExternally, callback: () -> Unit = definedExternally): Unit /* this */

    /**
     * Throws ERR_HTTP2_INVALID_SETTING_VALUE for invalid settings values.
     * Throws ERR_INVALID_ARG_TYPE for invalid settings argument.
     */
    fun updateSettings(settings: Settings): Unit
}