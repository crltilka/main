public class Main {
    public static void main(String[] args)

    {
        int x2 = 0b1111000;
        int x8 = 0170;
        int x10 = 120;
        int x16 = 0x78;
        int sumInt = x2 + x8 + x10 + x16;

        byte i2 = 0b1010000;
        byte i8 = 0120;
        byte i10 = 80;
        byte i16 = 0x50;
        int sumByte = i2 + i8 + i10 + i16;

        short r10 = 305;
        short r2 = 0b100110001;
        short r8 = 0461;
        short r16 = 0x131;
        int sumShort = r2 + r8 + r10 + r16;

        long  a10 = 200;
        long  a2 = 0b11001000;
        long  a8 = 0310;
        long a16 = 0xC8;
        long sumlong = (int) (a10 + a2 + a8 + a16);

        char b = 'r';
        char t = '\u0072';
        int sumChar = b + t;

        double o10 = 400;
        double o2 = 0b110010000;
        double o8 = 0620;
        double o16 = 0x190;
        int sumDouble = (int) (o10 + o2 + o8 + o16);

        float p10 = 500;
        float p2 = 0b111110100;
        float p8 = 0764;
        float p16 = 0x1F4;
        int sumFloat = (int) (p10 + p2 + p8 + p16);




        long result = sumByte + sumInt + sumlong + sumChar + sumDouble + sumFloat ;
        System.out.println(result);







    }

    }
