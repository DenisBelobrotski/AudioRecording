package audiorecord.pop

import audiorecord.AudioRecordBaseData

class RussianPopAudioRecord(private val baseData: AudioRecordBaseData) extends PopAudioRecord(baseData) {
    override def getGenre: String = {
        "Russian Pop"
    }
}
