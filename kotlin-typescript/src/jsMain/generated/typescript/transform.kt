// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

import js.array.ReadonlyArray

/**
 * Transform one or more nodes using the supplied transformers.
 * @param source A single `Node` or an array of `Node` objects.
 * @param transformers An array of `TransformerFactory` callbacks used to process the transformation.
 * @param compilerOptions Optional compiler options.
 */
external fun <T : Node> transform(
    source: Any, /* T | T[] */
    transformers: ReadonlyArray<TransformerFactory<T>>,
    compilerOptions: CompilerOptions = definedExternally,
): TransformationResult<T>
