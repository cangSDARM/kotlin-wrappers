// Generated by Karakum - do not modify it manually!

@file:JsModule("node:diagnostics_channel")

package node.diagnosticsChannel


/**
 * Check if there are active subscribers to the named channel. This is helpful if
 * the message you want to send might be expensive to prepare.
 *
 * This API is optional but helpful when trying to publish messages from very
 * performance-sensitive code.
 *
 * ```js
 * import diagnostics_channel from 'node:diagnostics_channel';
 *
 * if (diagnostics_channel.hasSubscribers('my-channel')) {
 *   // There are subscribers, prepare and publish message
 * }
 * ```
 * @since v15.1.0, v14.17.0
 * @param name The channel name
 * @return If there are active subscribers
 */
external fun hasSubscribers(name: String): Boolean

/**
 * Check if there are active subscribers to the named channel. This is helpful if
 * the message you want to send might be expensive to prepare.
 *
 * This API is optional but helpful when trying to publish messages from very
 * performance-sensitive code.
 *
 * ```js
 * import diagnostics_channel from 'node:diagnostics_channel';
 *
 * if (diagnostics_channel.hasSubscribers('my-channel')) {
 *   // There are subscribers, prepare and publish message
 * }
 * ```
 * @since v15.1.0, v14.17.0
 * @param name The channel name
 * @return If there are active subscribers
 */
external fun hasSubscribers(name: js.symbol.Symbol): Boolean
