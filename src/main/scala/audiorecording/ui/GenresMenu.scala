package audiorecording.ui

import audiorecording.audiorecord.indie._
import audiorecording.audiorecord.pop._
import audiorecording.audiorecord.rock._

object GenresMenu {
    val contents = Map(
        "Pop" -> Map(
            "Pop" -> classOf[PopAudioRecord],
            "Disco" -> classOf[DiscoAudioRecord],
            "Russian Pop" -> classOf[RussianPopAudioRecord]
        ),
        "Indie" -> Map(
            "Indie" -> classOf[IndieAudioRecord],
            "Local Indie" -> classOf[LocalIndieAudioRecord]
        ),
        "Rock" -> Map(
            "Rock" -> classOf[RockAudioRecord],
            "Russian Rock" -> classOf[RussianRockAudioRecord],
            "Rock\'n\'Roll" -> classOf[RockNRollAudioRecord],
            "Progressive Rock" -> classOf[ProgressiveRockAudioRecord],
            "Post Rock" -> classOf[PostRockAudioRecord],
            "New Wave" -> classOf[NewWaveRockAudioRecord]
        )
    )
}
