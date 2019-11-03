package ui

import audiorecord.pop._

object GenresMenu {
    val contents = Map(
        "Pop" -> Map(
            "Pop" -> classOf[PopAudioRecord],
            "Disco" -> classOf[DiscoAudioRecord],
            "Russian Pop" -> classOf[RussianPopAudioRecord]
        )
    )
}
