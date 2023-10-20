package node.crypto


sealed external interface PrivateKeyInput {
    var key: Any /* string | Buffer */
    var format: KeyFormat?
    var type: PrivateKeyInputType?
    var passphrase: Any? /* string | Buffer | undefined */
    var encoding: String?
}
