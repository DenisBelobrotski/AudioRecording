package audiorecording.audiorecord.indie

import audiorecording.audiorecord._

class IndieAudioRecord(private val baseData: AudioRecordBaseData) extends AudioRecord(baseData) {
    override def getGenre: String = {
        "Indie"
    }
}
