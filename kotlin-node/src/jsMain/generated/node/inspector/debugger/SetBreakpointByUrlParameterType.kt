// Generated by Karakum - do not modify it manually!


package node.inspector.debugger


sealed external interface SetBreakpointByUrlParameterType {
    /**
     * Line number to set breakpoint at.
     */
    var lineNumber: Double

    /**
     * URL of the resources to set breakpoint on.
     */
    var url: String?

    /**
     * Regex pattern for the URLs of the resources to set breakpoints on. Either <code>url</code> or <code>urlRegex</code> must be specified.
     */
    var urlRegex: String?

    /**
     * Script hash of the resources to set breakpoint on.
     */
    var scriptHash: String?

    /**
     * Offset in the line to set breakpoint at.
     */
    var columnNumber: Double?

    /**
     * Expression to use as a breakpoint condition. When specified, debugger will only stop on the breakpoint if this expression evaluates to true.
     */
    var condition: String?
}