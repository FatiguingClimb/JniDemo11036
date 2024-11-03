#include <jni.h>
#include <string>
#include "com_hc_jnidemo11036_NdkTools.h"

extern "C"
JNIEXPORT jstring JNICALL
Java_com_hc_jnidemo11036_JniMethod_stringFromJNI(JNIEnv *env, jclass clazz) {
    std::string hello = " JniMethod Hello from C++";
    return env->NewStringUTF(hello.c_str());
}

extern "C"
JNIEXPORT jstring JNICALL
Java_com_hc_jnidemo11036_JniMethod_stringFromJNI2(JNIEnv *env, jclass clazz) {
    std::string hello = "JniMethod Hello from C++ 2";
    return env->NewStringUTF(hello.c_str());
}

extern "C"
JNIEXPORT jstring JNICALL Java_com_hc_jnidemo11036_NdkTools_getStrFromNative(JNIEnv *env, jclass clazz) {
    std::string hello = "NdkTools Hello from C++ ";
    return env->NewStringUTF(hello.c_str());
}