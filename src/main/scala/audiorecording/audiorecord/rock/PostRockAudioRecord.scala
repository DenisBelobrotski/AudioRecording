package audiorecording.audiorecord.rock

import audiorecording.audiorecord.AudioRecordBaseData

class PostRockAudioRecord(private val baseData: AudioRecordBaseData) extends RockAudioRecord(baseData) {
    override def getGenre: String = {
        "Post Rock"
    }
}
