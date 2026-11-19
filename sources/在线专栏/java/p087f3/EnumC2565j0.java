package p087f3;

import org.jetbrains.annotations.NotNull;
import p112k3.C2709a;
import p112k3.C2710b;
import p128o2.C2917j;
import p142q2.C3014f;
import p142q2.InterfaceC3012d;
import p171x2.InterfaceC3474p;

/* renamed from: f3.j0 */
/* loaded from: classes.dex */
public enum EnumC2565j0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* renamed from: f3.j0$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10252a;

        static {
            int[] iArr = new int[EnumC2565j0.values().length];
            iArr[EnumC2565j0.DEFAULT.ordinal()] = 1;
            iArr[EnumC2565j0.ATOMIC.ordinal()] = 2;
            iArr[EnumC2565j0.UNDISPATCHED.ordinal()] = 3;
            iArr[EnumC2565j0.LAZY.ordinal()] = 4;
            f10252a = iArr;
        }
    }

    /* renamed from: b */
    public final <R, T> void m8583b(@NotNull InterfaceC3474p<? super R, ? super InterfaceC3012d<? super T>, ? extends Object> interfaceC3474p, R r3, @NotNull InterfaceC3012d<? super T> interfaceC3012d) {
        int i4 = a.f10252a[ordinal()];
        if (i4 == 1) {
            C2709a.m9039e(interfaceC3474p, r3, interfaceC3012d, null, 4, null);
            return;
        }
        if (i4 == 2) {
            C3014f.m10118a(interfaceC3474p, r3, interfaceC3012d);
        } else if (i4 == 3) {
            C2710b.m9040a(interfaceC3474p, r3, interfaceC3012d);
        } else if (i4 != 4) {
            throw new C2917j();
        }
    }

    /* renamed from: c */
    public final boolean m8584c() {
        return this == LAZY;
    }
}
