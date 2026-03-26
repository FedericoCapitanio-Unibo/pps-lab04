package it.unibo.pps.tasks.adts

/*  Exercise 1: 
 *  Complete the implementation of ComplexADT trait below, so that it passes
 *  the test in ComplexTest.
 */

object Ex1ComplexNumbers:

  trait ComplexADT:
    type Complex
    def complex(re: Double, im: Double): Complex
    extension (complex: Complex)
      def re(): Double
      def im(): Double
      def sum(other: Complex): Complex
      def subtract(other: Complex): Complex
      def asString(): String

  object BasicComplexADT extends ComplexADT:

    // Change assignment below: should probably define a case class and use it?
    case class ComplexNumber(re: Double, im: Double)
    type Complex = ComplexNumber

    def complex(re: Double, im: Double): Complex = ComplexNumber(re, im)

    extension (complex: Complex)
      def re(): Double = complex match
        case ComplexNumber(re, im) => re
      def im(): Double = complex match
        case ComplexNumber(re, im) => im
      def sum(other: Complex): Complex = (complex, other) match
        case (ComplexNumber(re, im), ComplexNumber(re2, im2)) => ComplexNumber(re + re2, im + im2)
      def subtract(other: Complex): Complex = (complex, other) match
        case (ComplexNumber(re, im), ComplexNumber(re2, im2)) => ComplexNumber(re - re2, im - im2)
      def asString(): String = complex match
        case ComplexNumber(0, 0) => "" + 0.0
        case ComplexNumber(re, 0) => "" + re
        case ComplexNumber(0, im) => "" + im + "i"
        case ComplexNumber(re, im) => "" + re + (if im > 0 then " + " else "") + (if im > 0 then im else " - " + (-im)) + "i"
