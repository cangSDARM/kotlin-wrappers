// Generated by Karakum - do not modify it manually!

package node.test

import js.promise.await


suspend fun todo(
    name: String = undefined.unsafeCast<Nothing>(),
    options: TestOptions = undefined.unsafeCast<Nothing>(),
    fn: TestFn = undefined.unsafeCast<Nothing>(),
): Unit =
    todoAsync(
        name, options, fn
    ).await()


suspend fun todo(name: String = undefined.unsafeCast<Nothing>(), fn: TestFn = undefined.unsafeCast<Nothing>()): Unit =
    todoAsync(
        name, fn
    ).await()


suspend fun todo(
    options: TestOptions = undefined.unsafeCast<Nothing>(),
    fn: TestFn = undefined.unsafeCast<Nothing>(),
): Unit =
    todoAsync(
        options, fn
    ).await()


suspend fun todo(fn: TestFn = undefined.unsafeCast<Nothing>()): Unit =
    todoAsync(
        fn
    ).await()