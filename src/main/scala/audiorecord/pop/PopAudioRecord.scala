package audiorecord.pop

import audiorecord.{AudioRecord, AudioRecordBaseData}

class PopAudioRecord(private val baseData: AudioRecordBaseData) extends AudioRecord(baseData) {
    override def getGenre: String = {
        "Pop"
    }
}
