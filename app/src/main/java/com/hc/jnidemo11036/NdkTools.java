package com.hc.jnidemo11036;

/**
 * create at 2024/11/3
 */
public class NdkTools {

    static {
        System.loadLibrary("jnidemo11036");
    }

    public static native String getStrFromNative();

}
