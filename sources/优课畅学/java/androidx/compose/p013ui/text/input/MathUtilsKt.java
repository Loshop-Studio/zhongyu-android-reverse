package androidx.compose.p013ui.text.input;

import p300x7.InterfaceC10559a;

/* loaded from: classes2.dex */
public final class MathUtilsKt {
    public static final int addExactOrElse(int i10, int i11, InterfaceC10559a interfaceC10559a) {
        int i12 = i10 + i11;
        return ((i10 ^ i12) & (i11 ^ i12)) < 0 ? ((Number) interfaceC10559a.invoke()).intValue() : i12;
    }

    public static final int subtractExactOrElse(int i10, int i11, InterfaceC10559a interfaceC10559a) {
        int i12 = i10 - i11;
        return ((i10 ^ i12) & (i11 ^ i10)) < 0 ? ((Number) interfaceC10559a.invoke()).intValue() : i12;
    }
}
