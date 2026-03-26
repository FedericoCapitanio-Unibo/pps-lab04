package it.unibo.pps.tasks.adts
import it.unibo.pps.u03.extensionmethods.Sequences.Sequence

import org.junit.Assert.assertEquals
import org.junit.Test

class SchoolModelTest:

  import SchoolModel.*
  val school: SchoolModule = BasicSchoolModule
  val basicSchoolModule: BasicSchoolModule.SchoolObj = BasicSchoolModule.SchoolObj(Sequence.Nil(), Sequence.Nil(), Sequence.Nil())

  @Test def testEmptySchool() =
    assertEquals(school.emptySchool, basicSchoolModule)