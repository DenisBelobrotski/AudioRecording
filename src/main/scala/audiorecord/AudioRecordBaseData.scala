package audiorecord

class AudioRecordBaseData {
    private var name: String = ""
    private var authorName: String = ""
    private var duration: Int = 0

    def setName(name: String): Unit = { this.name = name }

    def setAuthorName(authorName: String): Unit = { this.authorName = authorName }

    def setDuration(duration: Int): Unit = { this.duration = duration }

    def getName: String = { this.name }

    def getAuthorName: String = { this.authorName }

    def getDuration: Int = { this.duration }

    override def clone(): AudioRecordBaseData = {
        var newInstance = new AudioRecordBaseData()

        newInstance.setName(this.getName)
        newInstance.setAuthorName(this.getAuthorName)
        newInstance.setDuration(this.getDuration)

        newInstance
    }
}
