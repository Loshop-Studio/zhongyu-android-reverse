package androidx.paging;

import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13412d1 = {"\u0000$\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a0\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0086\bø\u0001\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, m13413d2 = {"DEBUG", "", "LOG_TAG", "", "VERBOSE", "log", "", "level", "tr", "", "block", "Lkotlin/Function0;", "paging-common_release"}, m13414k = 2, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class PagingLoggerKt {
    public static final int DEBUG = 3;
    public static final String LOG_TAG = "Paging";
    public static final int VERBOSE = 2;

    public static final void log(@IntRange(from = 2, m266to = 3) int i9, Throwable th, Function0<String> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        PagingLogger pagingLogger = PagingLogger.INSTANCE;
        if (pagingLogger.isLoggable(i9)) {
            pagingLogger.log(i9, block.invoke(), th);
        }
    }

    public static /* synthetic */ void log$default(int i9, Throwable th, Function0 block, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th = null;
        }
        Intrinsics.checkNotNullParameter(block, "block");
        PagingLogger pagingLogger = PagingLogger.INSTANCE;
        if (pagingLogger.isLoggable(i9)) {
            pagingLogger.log(i9, (String) block.invoke(), th);
        }
    }
}
