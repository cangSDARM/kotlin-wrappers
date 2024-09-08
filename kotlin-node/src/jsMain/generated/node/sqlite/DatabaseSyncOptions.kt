// Generated by Karakum - do not modify it manually!

package node.sqlite

sealed external interface DatabaseSyncOptions {
    /**
     * If `true`, the database is opened by the constructor.
     * When this value is `false`, the database must be opened via the `open()` method.
     */
    var open: Boolean?
}