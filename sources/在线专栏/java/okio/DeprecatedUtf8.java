package okio;

import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;

/* renamed from: okio.-DeprecatedUtf8, reason: invalid class name */
/* loaded from: classes.dex */
public final class DeprecatedUtf8 {
    public static final DeprecatedUtf8 INSTANCE = new DeprecatedUtf8();

    private DeprecatedUtf8() {
    }

    public final long size(@NotNull String string) {
        C2769l.m9241e(string, "string");
        return Utf8.size$default(string, 0, 0, 3, null);
    }

    public final long size(@NotNull String string, int i4, int i5) {
        C2769l.m9241e(string, "string");
        return Utf8.size(string, i4, i5);
    }
}
