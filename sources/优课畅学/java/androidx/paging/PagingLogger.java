package androidx.paging;

import android.os.Build;
import android.util.Log;
import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.AbstractC9133u;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class PagingLogger {
    public static final PagingLogger INSTANCE = new PagingLogger();

    private PagingLogger() {
    }

    public static /* synthetic */ void log$default(PagingLogger pagingLogger, int i10, String str, Throwable th, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            th = null;
        }
        pagingLogger.log(i10, str, th);
    }

    public final boolean isLoggable(int i10) {
        return Build.ID != null && Log.isLoggable(PagingLoggerKt.LOG_TAG, i10);
    }

    public final void log(int i10, String message, Throwable th) {
        AbstractC9133u.m16133g(message, "message");
        if (i10 == 2 || i10 == 3) {
            return;
        }
        throw new IllegalArgumentException("debug level " + i10 + " is requested but Paging only supports default logging for level 2 (VERBOSE) or level 3 (DEBUG)");
    }
}
