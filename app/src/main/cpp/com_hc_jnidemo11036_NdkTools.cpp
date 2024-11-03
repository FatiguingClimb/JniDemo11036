
#include <jni.h>
#include <string>
#include "com_hc_jnidemo11036_NdkTools.h"

extern "C"
JNIEXPORT jstring JNICALL Java_com_hc_jnidemo11036_NdkTools_getStrFromNative(JNIEnv *env, jclass clazz) {
    std::string hello = "NdkTools Hello from C++ ";
    return env->NewStringUTF(hello.c_str());
}