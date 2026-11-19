package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.functions.Function1;

/* renamed from: androidx.compose.foundation.lazy.layout.a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0744a {
    /* renamed from: a */
    public static /* synthetic */ void m245a(IntervalList intervalList, int i4, int i5, Function1 function1, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forEach");
        }
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = intervalList.getSize() - 1;
        }
        intervalList.forEach(i4, i5, function1);
    }
}
