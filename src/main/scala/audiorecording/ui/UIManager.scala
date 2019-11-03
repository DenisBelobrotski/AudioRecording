package audiorecording.ui

import audiorecording._
import audiorecording.audiorecord._

import scala.io.StdIn._

object UIManager {
    private val disk = new CompactDisk()

    @scala.annotation.tailrec
    def startInteraction(): Unit = {
        try {
            findOutCommand() match {
                case "add" =>
                    disk.addTrack(findOutTrack())
                case "len" =>
                    println(disk.getTotalDuration)
                case "sort" =>
                    disk.sort()
                case "filter" =>
                    printTracks(disk.filter(findOutDurationRange()))
                case "print" =>
                    printTracks(disk.getTracks)
                case "exit" => return
                case _ =>
                    println("Unknown command")
            }
            println()
        } catch {
            case exception: Exception =>
                println(exception.getMessage)
        }
        startInteraction()
    }

    private def findOutCommand(): String = {
        println("Choose action with disk:")
        println("Add track (add)")
        println("Total duration (len)")
        println("Sort by genres (sort)")
        println("Print all with target duration (filter)")
        println("Print all tracks (print)")
        println("Exit (exit)")

        readLine()
    }

    private def findOutTrack(): AudioRecord = {
        val category = findOutCategoryName()
        val genreName = findOutGenreName(category)
        val audioRecordClass = GenresMenu.contents(category)(genreName)
        val audioRecordInfo = findOutTrackInfo()

        audioRecordClass.getDeclaredConstructor(classOf[AudioRecordBaseData]).newInstance(audioRecordInfo)
    }

    private def findOutCategoryName(): String = {
        println("Choose category:")
        for (category <- GenresMenu.contents.keys) {
            println(category)
        }
        readLine()
    }

    private def findOutGenreName(category: String): String = {
        val categoryContents = GenresMenu.contents(category)
        println("Choose genre:")
        for (genre <- categoryContents.keys) {
            println(genre)
        }
        readLine()
    }

    private def findOutTrackInfo(): AudioRecordBaseData = {
        println("Enter audio record info:")
        val audioRecordInfo = new AudioRecordBaseData()
        println("Author:")
        audioRecordInfo.setAuthorName(readLine())

        println("Name:")
        audioRecordInfo.setName(readLine())

        println("Duration:")
        audioRecordInfo.setDuration(readInt())

        audioRecordInfo
    }

    private def findOutDurationRange(): Range = {
        println("Enter min duration")
        val start = readInt()
        println("Enter max duration")
        val end = readInt()
        start to end
    }

    private def printTracks(tracks: List[AudioRecord]): Unit = {
        for (track <- tracks) {
            println(track.getFullInformation)
        }
    }
}
