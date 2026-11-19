package androidx.paging;

import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10559a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class PagingLoggerKt {
    public static final int DEBUG = 3;
    public static final String LOG_TAG = "Paging";
    public static final int VERBOSE = 2;

    public static final void log(@IntRange(from = 2, m244to = 3) int i10, Throwable th, InterfaceC10559a block) {
        AbstractC9133u.m16133g(block, "block");
        PagingLogger pagingLogger = PagingLogger.INSTANCE;
        if (pagingLogger.isLoggable(i10)) {
            pagingLogger.log(i10, (String) block.invoke(), th);
        }
    }

    public static /* synthetic */ void log$default(int i10, Throwable th, InterfaceC10559a block, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            th = null;
        }
        AbstractC9133u.m16133g(block, "block");
        PagingLogger pagingLogger = PagingLogger.INSTANCE;
        if (pagingLogger.isLoggable(i10)) {
            pagingLogger.log(i10, (String) block.invoke(), th);
        }
    }
}
