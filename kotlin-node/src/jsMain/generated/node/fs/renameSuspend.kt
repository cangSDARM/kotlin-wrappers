// Generated by Karakum - do not modify it manually!

package node.fs

import js.promise.await


suspend fun rename(oldPath: PathLike, newPath: PathLike): Unit =
    renameAsync(
        oldPath, newPath
    ).await()
