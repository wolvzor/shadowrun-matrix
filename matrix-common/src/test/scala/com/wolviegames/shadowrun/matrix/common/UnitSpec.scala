package com.wolviegames.shadowrun.matrix.common

import org.junit.runner.RunWith
import org.scalatest._
import org.scalatest.junit.JUnitRunner
import org.scalatest.mockito.MockitoSugar


@RunWith(classOf[JUnitRunner])
trait UnitSpec extends WordSpecLike with MockitoSugar with Matchers with OptionValues with Inside  with Inspectors {

}
