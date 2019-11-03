package audiorecording.audiorecord.rock

import audiorecording.audiorecord.AudioRecordBaseData

class RussianRockAudioRecord(private val baseData: AudioRecordBaseData) extends RockAudioRecord(baseData) {
    override def getGenre: String = {
        "Russian Rock"
    }
}
