package node.crypto


sealed external interface SigningOptions {
    /**
     * @See crypto.constants.RSA_PKCS1_PADDING
     */
    var padding: Double?
    var saltLength: Double?
    var dsaEncoding: DSAEncoding?
}