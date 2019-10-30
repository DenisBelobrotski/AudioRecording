class RussianPopAudioRecord(private val baseData: AudioRecordBaseData) extends PopAudioRecord(baseData) {
    override def getGenre(): String = {
        "Russian pop"
    }
}
