class DiscoAudioRecord(private val baseData: AudioRecordBaseData) extends PopAudioRecord(baseData) {
    override def getGenre(): String = {
        "Disco"
    }
}
