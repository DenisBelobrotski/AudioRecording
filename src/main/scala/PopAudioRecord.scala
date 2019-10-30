class PopAudioRecord(private val baseData: AudioRecordBaseData) extends AudioRecord(baseData) {
    override def getGenre(): String = {
        "Pop"
    }
}
