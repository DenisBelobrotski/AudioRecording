package audiorecord

abstract class AudioRecord(private val baseData: AudioRecordBaseData) {
    if (baseData == null) {
        throw new AudioRecordBadInitializationException()
    }

    private val infoSeparator = ":"

    def getName(): String = { baseData.getName() }
    def getAuthorName(): String = { baseData.getAuthorName() }
    def getDuration(): Int = { baseData.getDuration() }

    def getGenre(): String
    def getFullInformation(): String = {
        new StringBuilder()
            .append(getAuthorName())
            .append(infoSeparator)
            .append(getName())
            .append(infoSeparator)
            .append(getGenre())
            .append(infoSeparator)
            .append(getDuration())
            .toString()
    }
}
