package io.objectbox.exception;

/* loaded from: classes6.dex */
class DbExceptionListenerJni {
    public static native void nativeCancelCurrentException();

    public static native void nativeThrowException(long j10, int i10);
}
