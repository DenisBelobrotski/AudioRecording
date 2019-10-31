import scala.collection.mutable.ListBuffer

import audiorecord.AudioRecord

class CompactDisk(private var records: List[AudioRecord]) {
    protected val audioRecords = new ListBuffer[AudioRecord]

    if (records != null) {
        audioRecords.addAll(records)
    }

    def getTotalDuration: Int = {
        var result = 0

        for (audioRecord <- audioRecords) {
            result += audioRecord.getDuration
        }

        result
    }
}
