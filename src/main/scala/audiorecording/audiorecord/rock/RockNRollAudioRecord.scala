package audiorecording.audiorecord.rock

import audiorecording.audiorecord.AudioRecordBaseData

class RockNRollAudioRecord(private val baseData: AudioRecordBaseData) extends RockAudioRecord(baseData) {
    override def getGenre: String = {
        "Rock\'n\'Roll"
    }
}
