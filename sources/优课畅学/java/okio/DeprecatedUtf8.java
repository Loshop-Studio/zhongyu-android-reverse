package okio;

import kotlin.jvm.internal.AbstractC9133u;
import p123h7.InterfaceC8721a;

@InterfaceC8721a
/* renamed from: okio.-DeprecatedUtf8, reason: invalid class name */
/* loaded from: classes5.dex */
public final class DeprecatedUtf8 {
    public static final DeprecatedUtf8 INSTANCE = new DeprecatedUtf8();

    private DeprecatedUtf8() {
    }

    @InterfaceC8721a
    public final long size(String string) {
        AbstractC9133u.m16133g(string, "string");
        return Utf8.size$default(string, 0, 0, 3, null);
    }

    @InterfaceC8721a
    public final long size(String string, int i10, int i11) {
        AbstractC9133u.m16133g(string, "string");
        return Utf8.size(string, i10, i11);
    }
}
