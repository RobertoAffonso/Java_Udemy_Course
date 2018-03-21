public class ByteShortInt
{
    public static void main(String[] args)
    {
        //Int possui uma largura total de 32 bits
        int integerMinNumber = -2_147_483_648;
        int integerMaxNumber = 2_147_483_647;
        int total = (integerMinNumber/2);
        System.out.println("Novo número do tipo int: " + total);

        //Byte possui uma largura total de 8 bits
        byte byteMinNumber = -128;
        byte byteMaxNumber = 127;

//        Para realizar esta operação, será necessário usar o Casting
//        ou seja, pedir que o java trate o resultado como um Byte
        byte newByteNumber = (byte) (byteMinNumber/2);
        System.out.println("Novo número do tipo byte: " + newByteNumber);

        //Short possui uma largura total de 16 bits
        short shortMinNumber = -32768;
        short shortMaxNumber = -32767;

        //Casting
        short newShortNumber = (short) (shortMinNumber/2);
        System.out.println("Novo número do tipo Short: " + newShortNumber);

        //Long possui uma largura total de 64 bits
        long longMinNumber = -9_223_372_036_854_775_808L;
        long longMaxNumber =  9_223_372_036_854_775_807L;
        long newLongNumber = (longMinNumber/2);
        System.out.println("Novo número do tipo Long: " + newLongNumber);

    }
}
