// Generated by Karakum - do not modify it manually!

@file:JsModule("node:fs")

package node.fs


/**
 * Sets the permissions on the file. No arguments other than a possible exception
 * are given to the completion callback.
 *
 * See the POSIX [`fchmod(2)`](http://man7.org/linux/man-pages/man2/fchmod.2.html) documentation for more detail.
 * @since v0.4.7
 */
external fun fchmod(fd: Number, mode: Mode, callback: NoParamCallback): Unit
