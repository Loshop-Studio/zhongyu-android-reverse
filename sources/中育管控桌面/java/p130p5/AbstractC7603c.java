package p130p5;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: p5.c */
/* loaded from: classes4.dex */
public abstract class AbstractC7603c {
    /* renamed from: a */
    public static final int m9013a(String str, int i6) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        char cCharAt = str.charAt(i6);
        return (cCharAt << 7) + str.charAt(i6 + 1);
    }
}
