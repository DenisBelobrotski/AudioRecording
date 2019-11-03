package audiorecording.audiorecord.rock

import audiorecording.audiorecord.AudioRecordBaseData

class NewWaveRockAudioRecord(private val baseData: AudioRecordBaseData) extends RockAudioRecord(baseData) {
    override def getGenre: String = {
        "New Wave Rock"
    }
}
