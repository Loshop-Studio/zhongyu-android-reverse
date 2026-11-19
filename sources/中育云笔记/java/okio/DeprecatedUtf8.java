package okio;

import kotlin.jvm.internal.AbstractC9979u;
import p309qc.InterfaceC10770a;

@InterfaceC10770a
/* renamed from: okio.-DeprecatedUtf8, reason: invalid class name */
/* loaded from: classes6.dex */
public final class DeprecatedUtf8 {
    public static final DeprecatedUtf8 INSTANCE = new DeprecatedUtf8();

    private DeprecatedUtf8() {
    }

    @InterfaceC10770a
    public final long size(String string) {
        AbstractC9979u.m20294g(string, "string");
        return Utf8.size$default(string, 0, 0, 3, null);
    }

    @InterfaceC10770a
    public final long size(String string, int i10, int i11) {
        AbstractC9979u.m20294g(string, "string");
        return Utf8.size(string, i10, i11);
    }
}
