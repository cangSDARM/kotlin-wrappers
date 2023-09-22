@file:JsModule("node:crypto")

package node.crypto


/**
 * ```js
 * const {
 *   getCurves
 * } = await import('crypto');
 *
 * console.log(getCurves()); // ['Oakley-EC2N-3', 'Oakley-EC2N-4', ...]
 * ```
 * @since v2.3.0
 * @return An array with the names of the supported elliptic curves.
 */
external fun getCurves(): js.core.ReadonlyArray<String>