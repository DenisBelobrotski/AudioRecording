package audiorecording.audiorecord.indie

import audiorecording.audiorecord._

class LocalIndieAudioRecord(private val baseData: AudioRecordBaseData) extends IndieAudioRecord(baseData) {
    override def getGenre: String = {
        "Local Indie"
    }
}
