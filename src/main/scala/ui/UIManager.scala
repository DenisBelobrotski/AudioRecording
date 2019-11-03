package ui

import audiorecord.AudioRecordBaseData

import scala.io.StdIn._

object UIManager {
    def startInteraction(): Unit = {
        println("Choose category:")
        for (category <- GenresMenu.contents.keys) {
            println(category)
        }
        val category = readLine()

        val categoryContents = GenresMenu.contents(category)
        println("Choose genre:")
        for (genre <- categoryContents.keys) {
            println(genre)
        }
        val genre = readLine()
        val audioRecordClass = categoryContents(genre)

        println("Enter audio record info:")
        val audioRecordInfo = new AudioRecordBaseData()
        println("Author:")
        audioRecordInfo.setAuthorName(readLine())

        println("Name:")
        audioRecordInfo.setName(readLine())

        println("Duration:")
        audioRecordInfo.setDuration(readInt())

        val audioRecord = audioRecordClass.getDeclaredConstructor(classOf[AudioRecordBaseData]).newInstance(audioRecordInfo)
        println("Your audio record full info:")
        println(audioRecord.getFullInformation)
    }
}
