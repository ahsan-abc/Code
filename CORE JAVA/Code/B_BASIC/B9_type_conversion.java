/*
  In java , type casting is a method or process that converts a data type into another data
  ways manually & automatically .

  The automatic conversion is done by the compiler & manually conversion performed by the programmmer.


  1. widening conversion (automatic conersion by compiler)
  2. narrowing (coversion by programmer ,mention type )
 */
public class B9_type_conversion
{
  public static void main (String args [])
  {
      int x = 90;
      float y = x; //widening conversion (automatic conersion by compiler)
      System.out.println("y = " + y);
      x = (int) y;  //narrowing (coversion by programmer ,mention type )
      System.out.println("x = " + x);
 }
}