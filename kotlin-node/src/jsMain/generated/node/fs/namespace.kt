@file:JsModule("node:fs")

package node.fs


/* import * as stream from 'node:stream'; */

/* import { Abortable, EventEmitter } from 'node:events'; */

/* import { URL } from 'node:url'; */

/* import * as promises from 'node:fs/promises'; */

/* export { promises }; */

/**
 * Synchronous stat(2) - Get file status.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 */
external val statSync: StatSyncFn

/**
 * Synchronous lstat(2) - Get file status. Does not dereference symbolic links.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 */
external val lstatSync: StatSyncFn