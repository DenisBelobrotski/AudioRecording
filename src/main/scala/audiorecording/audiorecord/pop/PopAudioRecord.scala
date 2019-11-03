package audiorecording.audiorecord.pop

import audiorecording.audiorecord.{AudioRecord, AudioRecordBaseData}

class PopAudioRecord(private val baseData: AudioRecordBaseData) extends AudioRecord(baseData) {
    override def getGenre: String = {
        "Pop"
    }
}
