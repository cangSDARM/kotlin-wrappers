@file:JsModule("node:fs/promises")

package node.fs

import js.promise.Promise
import node.url.URL

/**
 * Asynchronously copies the entire directory structure from `src` to `dest`,
 * including subdirectories and files.
 *
 * When copying a directory to another directory, globs are not supported and
 * behavior is similar to `cp dir1/ dir2/`.
 * @since v16.7.0
 * @experimental
 * @param src source path to copy.
 * @param dest destination path to copy to.
 * @return Fulfills with `undefined` upon success.
 */

@JsName("cp")
external fun cpAsync(source: String, destination: String, opts: CopyOptions = definedExternally): Promise<Unit>


@JsName("cp")
external fun cpAsync(source: String, destination: URL, opts: CopyOptions = definedExternally): Promise<Unit>


@JsName("cp")
external fun cpAsync(source: URL, destination: String, opts: CopyOptions = definedExternally): Promise<Unit>


@JsName("cp")
external fun cpAsync(source: URL, destination: URL, opts: CopyOptions = definedExternally): Promise<Unit>