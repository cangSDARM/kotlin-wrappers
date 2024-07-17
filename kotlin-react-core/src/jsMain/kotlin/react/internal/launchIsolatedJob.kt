package react.internal

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlin.coroutines.EmptyCoroutineContext

internal fun launchIsolatedJob(
    block: suspend CoroutineScope.() -> Unit,
): Job =
    CoroutineScope(EmptyCoroutineContext)
        .launch(block = block)
