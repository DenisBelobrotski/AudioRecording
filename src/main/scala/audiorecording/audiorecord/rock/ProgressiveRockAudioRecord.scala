package audiorecording.audiorecord.rock

import audiorecording.audiorecord.AudioRecordBaseData

class ProgressiveRockAudioRecord(private val baseData: AudioRecordBaseData) extends RockAudioRecord(baseData) {
    override def getGenre: String = {
        "Progressive Rock"
    }
}
