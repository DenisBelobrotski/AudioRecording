object AudioRecording {
    def main(args: Array[String]): Unit = {

        val popRecordBaseData = new AudioRecordBaseData();
        popRecordBaseData.setName("Pop record")
        popRecordBaseData.setAuthorName("Pop man")
        popRecordBaseData.setDuration(130)

        val discoRecordBaseData = new AudioRecordBaseData();
        discoRecordBaseData.setName("Disco record")
        discoRecordBaseData.setAuthorName("Disco man")
        discoRecordBaseData.setDuration(120)

        val popRecord = new PopAudioRecord(popRecordBaseData)
        val discoRecord = new PopAudioRecord(discoRecordBaseData)

        println(popRecord.getFullInformation())
        println(discoRecord.getFullInformation())
    }
}
