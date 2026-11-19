package io.objectbox.exception;

import io.objectbox.annotation.apihint.Experimental;

/* loaded from: classes3.dex */
public interface DbExceptionListener {
    @Experimental
    static void cancelCurrentException() {
        DbExceptionListenerJni.nativeCancelCurrentException();
    }

    void onDbException(Exception exc);
}
