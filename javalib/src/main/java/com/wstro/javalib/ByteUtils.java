package com.wstro.javalib;

/**
 * ClassName: ByteUtils <br/>
 * Function: TODO ADD FUNCTION. <br/>
 *
 * @author pengl
 * @date 2017/10/30
 */
public class ByteUtils {

    public static byte[] toByteArray(int a){
        return new byte[]{
                (byte) ((a >> 24) & 0xFF),
                (byte) ((a >> 16) & 0xFF),
                (byte) ((a >> 8) & 0xFF),
                (byte) (a  & 0xFF),
        };
    }

    public static int byteArrayToInt(byte[] b){
        return (b[3] & 0xFF) |
                (b[2] & 0xFF) << 8 |
                (b[1] & 0xFF) << 16 |
                (b[0] & 0xFF) << 24;
    }

    public static void printBytes(byte[] b){
        if(b == null || b.length == 0)
            return;

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }

}
