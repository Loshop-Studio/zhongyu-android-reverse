package p014b3;

import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;

/* renamed from: b3.e */
/* loaded from: classes.dex */
class C1036e {
    /* renamed from: a */
    public static final void m4820a(boolean z3, @NotNull Number step) {
        C2769l.m9241e(step, "step");
        if (z3) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + step + '.');
    }
}
