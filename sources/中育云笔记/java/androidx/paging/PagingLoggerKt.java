package androidx.paging;

import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class PagingLoggerKt {
    public static final int DEBUG = 3;
    public static final String LOG_TAG = "Paging";
    public static final int VERBOSE = 2;

    public static final void log(@IntRange(from = 2, m338to = 3) int i10, Throwable th, InterfaceC9529a block) {
        AbstractC9979u.m20294g(block, "block");
        PagingLogger pagingLogger = PagingLogger.INSTANCE;
        if (pagingLogger.isLoggable(i10)) {
            pagingLogger.log(i10, (String) block.invoke(), th);
        }
    }

    public static /* synthetic */ void log$default(int i10, Throwable th, InterfaceC9529a block, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            th = null;
        }
        AbstractC9979u.m20294g(block, "block");
        PagingLogger pagingLogger = PagingLogger.INSTANCE;
        if (pagingLogger.isLoggable(i10)) {
            pagingLogger.log(i10, (String) block.invoke(), th);
        }
    }
}
