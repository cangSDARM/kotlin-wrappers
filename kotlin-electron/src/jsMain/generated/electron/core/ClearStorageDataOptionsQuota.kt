// Generated by Karakum - do not modify it manually!

package electron.core


@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@seskar.js.JsVirtual
sealed external interface ClearStorageDataOptionsQuota {
    companion object {
        @seskar.js.JsValue("temporary")
        val temporary: ClearStorageDataOptionsQuota

        @seskar.js.JsValue("syncable")
        val syncable: ClearStorageDataOptionsQuota
    }
}