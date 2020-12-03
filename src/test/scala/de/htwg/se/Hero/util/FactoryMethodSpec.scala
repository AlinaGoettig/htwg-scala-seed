package de.htwg.se.Hero.util

import de.htwg.se.model.{Cell, Player}
import de.htwg.se.util.CellFactory
import org.scalatest._

class FactoryMethod extends WordSpec with Matchers {

    "An FactoryMethod" when { "new" should {
        val marker = CellFactory("marker")
        val obstacle = CellFactory("obstacle")
        val emptycell = CellFactory("")
        "provide the cell" in {
            marker should be(Cell(" _ ", "0", 0, 0, style = false, 0, Player("none")))
            obstacle should be(Cell("XXX", "0", 0, 0, style = false, 0, Player("none")))
            emptycell should be(Cell("   ", "0", 0, 0, style = false, 0, Player("none")))
        }
    }
    }

}