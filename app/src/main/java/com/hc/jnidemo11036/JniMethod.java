package com.hc.jnidemo11036;

public class JniMethod {
    // Used to load the 'sotest' library on application startup.
    static {
        System.loadLibrary("jnidemo11036");
    }

    public static native String stringFromJNI();

    public static native String stringFromJNI2();
}

