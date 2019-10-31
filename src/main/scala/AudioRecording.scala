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

        val popRecord = new PopAudioRecord(popRecordBaseData)
        val discoRecord = new DiscoAudioRecord(discoRecordBaseData)

        println(popRecord.getFullInformation)
        println(discoRecord.getFullInformation)

        val records = new ListBuffer[AudioRecord]
        records.addOne(popRecord)
        records.addOne(discoRecord)

        val disk = new CompactDisk(records.toList)
        println(disk.getTotalDuration)
    }
}
