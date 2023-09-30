@file:JsModule("node:fs")

package node.fs


/**
 * Returns an integer representing the file descriptor.
 *
 * For detailed information, see the documentation of the asynchronous version of
 * this API: {@link open}.
 * @since v0.1.21
 * @param [flags='r']
 * @param [mode=0o666]
 */
external fun openSync(path: PathLike, flags: OpenMode, mode: Mode? = definedExternally): Double