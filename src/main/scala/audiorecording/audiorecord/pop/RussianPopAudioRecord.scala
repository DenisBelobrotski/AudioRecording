package audiorecording.audiorecord.pop

import audiorecording.audiorecord.AudioRecordBaseData

class RussianPopAudioRecord(private val baseData: AudioRecordBaseData) extends PopAudioRecord(baseData) {
    override def getGenre: String = {
        "Russian Pop"
    }
}
