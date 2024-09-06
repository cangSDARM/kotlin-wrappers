package wrappers.example.content

import js.import.importAsync
import wrappers.example.lazy.lazyComponent

// TODO: must be generated by plugin
internal val LazyContent = lazyComponent("Content") {
    importAsync("./content.export.mjs")
}