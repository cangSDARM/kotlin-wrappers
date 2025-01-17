// Generated by Karakum - do not modify it manually!

package node.process

sealed external interface ProcessFeatures {
    /**
     * A boolean value that is `true` if the current Node.js build is caching builtin modules.
     * @since v12.0.0
     */
    val cached_builtins: Boolean

    /**
     * A boolean value that is `true` if the current Node.js build is a debug build.
     * @since v0.5.5
     */
    val debug: Boolean

    /**
     * A boolean value that is `true` if the current Node.js build includes the inspector.
     * @since v11.10.0
     */
    val inspector: Boolean

    /**
     * A boolean value that is `true` if the current Node.js build includes support for IPv6.
     * @since v0.5.3
     */
    val ipv6: Boolean

    /**
     * A boolean value that is `true` if the current Node.js build supports
     * [loading ECMAScript modules using `require()`](https://nodejs.org/docs/latest-v22.x/api/modules.md#loading-ecmascript-modules-using-require).
     * @since v22.10.0
     */
    val require_module: Boolean

    /**
     * A boolean value that is `true` if the current Node.js build includes support for TLS.
     * @since v0.5.3
     */
    val tls: Boolean

    /**
     * A boolean value that is `true` if the current Node.js build includes support for ALPN in TLS.
     * @since v4.8.0
     */
    val tls_alpn: Boolean

    /**
     * A boolean value that is `true` if the current Node.js build includes support for OCSP in TLS.
     * @since v0.11.13
     */
    val tls_ocsp: Boolean

    /**
     * A boolean value that is `true` if the current Node.js build includes support for SNI in TLS.
     * @since v0.5.3
     */
    val tls_sni: Boolean

    /**
     * A value that is `"strip"` if Node.js is run with `--experimental-strip-types`,
     * `"transform"` if Node.js is run with `--experimental-transform-types`, and `false` otherwise.
     * @since v22.10.0
     */
    val typescript: ProcessFeaturesTypescript

    /**
     * A boolean value that is `true` if the current Node.js build includes support for libuv.
     * Since it's currently not possible to build Node.js without libuv, this value is always `true`.
     * @since v0.5.3
     */
    val uv: Boolean
}
