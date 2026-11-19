package p082e3;

import p014b3.C1034c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: e3.b */
/* loaded from: classes.dex */
public class C2476b {
    /* renamed from: a */
    public static int m8260a(int i4) {
        boolean z3 = false;
        if (2 <= i4 && i4 < 37) {
            z3 = true;
        }
        if (z3) {
            return i4;
        }
        throw new IllegalArgumentException("radix " + i4 + " was not in valid range " + new C1034c(2, 36));
    }

    /* renamed from: b */
    public static final int m8261b(char c4, int i4) {
        return Character.digit((int) c4, i4);
    }

    /* renamed from: c */
    public static final boolean m8262c(char c4) {
        return Character.isWhitespace(c4) || Character.isSpaceChar(c4);
    }
}
