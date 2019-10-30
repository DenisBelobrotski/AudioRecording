abstract class AudioRecord {
    private var baseData: AudioRecordBaseData = _

    protected def initializeBaseData(baseData: AudioRecordBaseData): Unit = {
        if (baseData != null) {
            this.baseData = baseData.clone()
        } else {
            throw new AudioRecordBadInitializationException()
        }
    }

    def getName(): String = { baseData.getName() }
    def getAuthorName(): String = { baseData.getAuthorName() }
    def getDuration(): Int = { baseData.getDuration() }

    def getGenre(): String
    def getFullInformation(): String
}
