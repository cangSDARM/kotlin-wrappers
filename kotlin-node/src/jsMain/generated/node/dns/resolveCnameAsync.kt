@file:JsModule("node:dns/promises")

package node.dns

import js.promise.Promise

/**
 * Uses the DNS protocol to resolve `CNAME` records for the `hostname`. On success,
 * the `Promise` is resolved with an array of canonical name records available for
 * the `hostname` (e.g. `['bar.example.com']`).
 * @since v10.6.0
 */

@JsName("resolveCname")
external fun resolveCnameAsync(hostname: String): Promise<js.core.ReadonlyArray<String>>