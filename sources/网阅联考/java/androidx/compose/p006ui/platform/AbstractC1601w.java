package androidx.compose.p006ui.platform;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.ui.platform.w */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1601w {
    /* renamed from: a */
    public static boolean m824a(OpenEndRange openEndRange, Comparable value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value.compareTo(openEndRange.getStart()) >= 0 && value.compareTo(openEndRange.getEndExclusive()) < 0;
    }

    /* renamed from: b */
    public static boolean m825b(OpenEndRange openEndRange) {
        return openEndRange.getStart().compareTo(openEndRange.getEndExclusive()) >= 0;
    }
}
