package androidx.paging;

import p309qc.InterfaceC10770a;

@InterfaceC10770a
/* loaded from: classes3.dex */
public interface Logger {
    static /* synthetic */ void log$default(Logger logger, int i10, String str, Throwable th, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i11 & 4) != 0) {
            th = null;
        }
        logger.log(i10, str, th);
    }

    boolean isLoggable(int i10);

    void log(int i10, String str, Throwable th);
}
