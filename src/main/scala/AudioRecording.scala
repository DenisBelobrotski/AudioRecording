import audiorecord._
import audiorecord.pop._

import scala.collection.mutable.ListBuffer

object AudioRecording {
    def main(args: Array[String]): Unit = {

        val popRecordBaseData = new AudioRecordBaseData();
        popRecordBaseData.setName("Pop record")
        popRecordBaseData.setAuthorName("Pop man")
        popRecordBaseData.setDuration(130)

        val discoRecordBaseData = new AudioRecordBaseData();
        discoRecordBaseData.setName("Disco record")
        discoRecordBaseData.setAuthorName("Disco man")
        discoRecordBaseData.setDuration(120)

        val popRecordBaseData1 = new AudioRecordBaseData();
        popRecordBaseData1.setName("Pop record 1")
        popRecordBaseData1.setAuthorName("Pop man 1")
        popRecordBaseData1.setDuration(125)

        val popRecord = new PopAudioRecord(popRecordBaseData)
        val discoRecord = new DiscoAudioRecord(discoRecordBaseData)
        val popRecord1 = new PopAudioRecord(popRecordBaseData1)

        println(popRecord.getFullInformation)
        println(discoRecord.getFullInformation)
        println(popRecord1.getFullInformation)

        val records = new ListBuffer[AudioRecord]
        records.addOne(popRecord)
        records.addOne(discoRecord)
        records.addOne(popRecord1)

        val disk = new CompactDisk(records.toList)
        val sortedDisk = disk.sorted()

        println(disk.getTotalDuration)
        println()

        for (track <- disk.getTracks) {
            print(track.getName + " ")
        }
        println()

        for (track <- sortedDisk.getTracks) {
            print(track.getName + " ")
        }
        println()

        disk.sort()

        for (track <- disk.getTracks) {
            print(track.getName + " ")
        }
        println()

        for (track <- disk.filter(115 to 126)) {
            print(track.getName + " ")
        }
        println()

        println(disk.trackWithDuration(115 to 126).getName)
    }
}
