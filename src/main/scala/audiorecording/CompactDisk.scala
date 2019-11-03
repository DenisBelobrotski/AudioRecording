package audiorecording

import audiorecording.audiorecord.AudioRecord

import scala.collection.mutable.ListBuffer

class CompactDisk {
    protected var audioRecords = new ListBuffer[AudioRecord]

    def this(tracks: List[AudioRecord]) {
        this()
        if (tracks != null) {
            audioRecords.addAll(tracks)
        }
    }

    def addTrack(track: AudioRecord): Unit = {
        audioRecords.addOne(track)
    }

    def getTotalDuration: Int = {
        var result = 0

        for (audioRecord <- audioRecords) {
            result += audioRecord.getDuration
        }

        result
    }

    def getTracks: List[AudioRecord] = {
        audioRecords.toList
    }

    def sort(): Unit = {
        audioRecords = audioRecords.sortBy(_.getGenre)
    }

    def sorted(): CompactDisk = {
        new CompactDisk(audioRecords.sortBy(_.getGenre).toList)
    }

    def filter(durationRange: Range): List[AudioRecord] = {
        audioRecords.toList.filter(record =>
            durationRange.start <= record.getDuration && record.getDuration <= durationRange.end)
    }

    def trackWithDuration(durationRange: Range): AudioRecord = {
        filter(durationRange).head
    }
}
