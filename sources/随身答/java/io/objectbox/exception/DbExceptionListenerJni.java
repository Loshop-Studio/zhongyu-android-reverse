package io.objectbox.exception;

/* loaded from: classes5.dex */
class DbExceptionListenerJni {
    public static native void nativeCancelCurrentException();

    public static native void nativeThrowException(long j9, int i9);
}
