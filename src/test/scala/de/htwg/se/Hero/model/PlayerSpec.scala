package de.htwg.se.model

import de.htwg.se.model.playerComponent.Player
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class PlayerSpec extends AnyWordSpec with Matchers {

    "A Player" when { "new" should {
        val player = Player("Test")
        "have a name"  in {
            player.name should be("Test")
        }
        "have a nice String representation" in {
            player.toString should be("Test")
        }
    }}

    "A instance of a Player" when { "new" should {
        val player = Player
        "have the typ"  in {
            player should be(Player)
        }
    }}

}
