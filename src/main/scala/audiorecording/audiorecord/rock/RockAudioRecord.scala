package audiorecording.audiorecord.rock

import audiorecording.audiorecord._

class RockAudioRecord(private val baseData: AudioRecordBaseData) extends AudioRecord(baseData) {
    override def getGenre: String = {
        "Rock"
    }
}
