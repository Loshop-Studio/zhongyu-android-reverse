package p102i3;

import kotlin.jvm.internal.C2769l;
import kotlinx.coroutines.internal.C2805t;
import org.jetbrains.annotations.NotNull;
import p097h3.EnumC2659a;

/* renamed from: i3.j */
/* loaded from: classes.dex */
public final class C2677j {

    /* renamed from: a */
    @NotNull
    public static final C2805t f10627a = new C2805t("NO_VALUE");

    @NotNull
    /* renamed from: a */
    public static final <T> InterfaceC2672e<T> m8989a(int i4, int i5, @NotNull EnumC2659a enumC2659a) {
        boolean z3 = true;
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(C2769l.m9248l("replay cannot be negative, but was ", Integer.valueOf(i4)).toString());
        }
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException(C2769l.m9248l("extraBufferCapacity cannot be negative, but was ", Integer.valueOf(i5)).toString());
        }
        if (i4 <= 0 && i5 <= 0 && enumC2659a != EnumC2659a.SUSPEND) {
            z3 = false;
        }
        if (!z3) {
            throw new IllegalArgumentException(C2769l.m9248l("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ", enumC2659a).toString());
        }
        int i6 = i5 + i4;
        if (i6 < 0) {
            i6 = Integer.MAX_VALUE;
        }
        return new C2676i(i4, i6, enumC2659a);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC2672e m8990b(int i4, int i5, EnumC2659a enumC2659a, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        if ((i6 & 4) != 0) {
            enumC2659a = EnumC2659a.SUSPEND;
        }
        return m8989a(i4, i5, enumC2659a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final Object m8993e(Object[] objArr, long j4) {
        return objArr[(objArr.length - 1) & ((int) j4)];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m8994f(Object[] objArr, long j4, Object obj) {
        objArr[(objArr.length - 1) & ((int) j4)] = obj;
    }
}
