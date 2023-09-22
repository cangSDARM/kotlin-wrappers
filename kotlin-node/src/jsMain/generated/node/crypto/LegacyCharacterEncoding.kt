package node.crypto


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{ascii: 'ascii', binary: 'binary', ucs2: 'ucs2', ucs2: 'ucs-2'}/*union*/)""")
sealed external interface LegacyCharacterEncoding {
    companion object {
        val ascii: LegacyCharacterEncoding
        val binary: LegacyCharacterEncoding
        val ucs2: LegacyCharacterEncoding
    }
}