// Automatically generated - do not modify!

package typescript

import kotlin.contracts.contract


@Suppress(
    "CANNOT_CHECK_FOR_EXTERNAL_INTERFACE",
    "CANNOT_CHECK_FOR_ERASED",
    "ERROR_IN_CONTRACT_DESCRIPTION"
)
inline fun isReturnStatement(node: Node): Boolean /* node is ReturnStatement */ {
    contract {
        returns(true) implies (node is ReturnStatement)
    }

    return isReturnStatementRaw(node)
}
