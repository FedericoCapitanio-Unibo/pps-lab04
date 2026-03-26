package it.unibo.pps.tasks.adts
import it.unibo.pps.u03.extensionmethods.Sequences.Sequence

import org.junit.Assert.assertEquals
import org.junit.Test

class SchoolModelTest:

  import SchoolModel.*
  val school: SchoolModule = BasicSchoolModule

  @Test def testEmptySchool() =
    assertEquals(school.emptySchool, BasicSchoolModule.SchoolObj(Sequence.Nil(), Sequence.Nil(), Sequence.Nil()))