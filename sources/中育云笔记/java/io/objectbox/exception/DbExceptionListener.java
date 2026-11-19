package io.objectbox.exception;

/* loaded from: classes6.dex */
public interface DbExceptionListener {
    static void cancelCurrentException() {
        DbExceptionListenerJni.nativeCancelCurrentException();
    }

    void onDbException(Exception exc);
}
