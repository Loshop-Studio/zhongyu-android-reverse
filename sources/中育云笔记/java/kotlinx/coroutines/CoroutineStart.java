package kotlinx.coroutines;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.AbstractC9953a;
import p181hd.InterfaceC9544p;
import p425yc.InterfaceC11943a;
import p426yd.AbstractC11944a;
import p426yd.AbstractC11945b;
import vc.AbstractC11589d;
import vc.InterfaceC11588c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class CoroutineStart {

    /* renamed from: c */
    public static final CoroutineStart f23476c = new CoroutineStart("DEFAULT", 0);

    /* renamed from: d */
    public static final CoroutineStart f23477d = new CoroutineStart("LAZY", 1);

    /* renamed from: e */
    public static final CoroutineStart f23478e = new CoroutineStart("ATOMIC", 2);

    /* renamed from: f */
    public static final CoroutineStart f23479f = new CoroutineStart("UNDISPATCHED", 3);

    /* renamed from: g */
    public static final /* synthetic */ CoroutineStart[] f23480g;

    /* renamed from: h */
    public static final /* synthetic */ InterfaceC11943a f23481h;

    /* renamed from: kotlinx.coroutines.CoroutineStart$a */
    public /* synthetic */ class C9991a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23482a;

        static {
            int[] iArr = new int[CoroutineStart.values().length];
            try {
                iArr[CoroutineStart.f23476c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CoroutineStart.f23478e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CoroutineStart.f23479f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CoroutineStart.f23477d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f23482a = iArr;
        }
    }

    static {
        CoroutineStart[] coroutineStartArrM20372a = m20372a();
        f23480g = coroutineStartArrM20372a;
        f23481h = AbstractC9953a.m20230a(coroutineStartArrM20372a);
    }

    public CoroutineStart(String str, int i10) {
    }

    /* renamed from: a */
    public static final /* synthetic */ CoroutineStart[] m20372a() {
        return new CoroutineStart[]{f23476c, f23477d, f23478e, f23479f};
    }

    public static CoroutineStart valueOf(String str) {
        return (CoroutineStart) Enum.valueOf(CoroutineStart.class, str);
    }

    public static CoroutineStart[] values() {
        return (CoroutineStart[]) f23480g.clone();
    }

    /* renamed from: c */
    public final void m20373c(InterfaceC9544p interfaceC9544p, Object obj, InterfaceC11588c interfaceC11588c) {
        int i10 = C9991a.f23482a[ordinal()];
        if (i10 == 1) {
            AbstractC11944a.m26502b(interfaceC9544p, obj, interfaceC11588c);
            return;
        }
        if (i10 == 2) {
            AbstractC11589d.m25525c(interfaceC9544p, obj, interfaceC11588c);
        } else if (i10 == 3) {
            AbstractC11945b.m26506c(interfaceC9544p, obj, interfaceC11588c);
        } else if (i10 != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: d */
    public final boolean m20374d() {
        return this == f23477d;
    }
}
