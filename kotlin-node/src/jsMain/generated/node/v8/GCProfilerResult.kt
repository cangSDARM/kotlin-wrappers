// Generated by Karakum - do not modify it manually!


package node.v8


sealed external interface GCProfilerResult {
    var version: Double
    var startTime: Double
    var endTime: Double
    var statistics: Array<GCProfilerResultStatisticsItem>
}
