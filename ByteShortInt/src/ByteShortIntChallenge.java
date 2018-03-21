public class ByteShortIntChallenge
{
  public static void main(String[] args)
  {
      byte byteVar = 100;
      short shortVar = 1000;
      int intVar = 10000;
      long longVar = 50000 + 10 * (byteVar + shortVar + intVar);

      System.out.println(longVar);
  }
}
