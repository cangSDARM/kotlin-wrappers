// Generated by Karakum - do not modify it manually!

@file:JsModule("node:fs/promises")

package node.fs

import js.promise.Promise

/**
 * Changes the ownership on a symbolic link.
 * @since v10.0.0
 * @return Fulfills with `undefined` upon success.
 */

@JsName("lchown")
external fun lchownAsync(path: PathLike, uid: Number, gid: Number): Promise<Unit>
