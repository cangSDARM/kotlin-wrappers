// Generated by Karakum - do not modify it manually!

@file:JsModule("node:https")

package node.https


/**
 * An `Agent` object for HTTPS similar to `http.Agent`. See {@link request} for more information.
 * @since v0.4.5
 */

external class Agent : node.http.Agent {
    constructor (options: AgentOptions = definedExternally)

    var options: AgentOptions
}