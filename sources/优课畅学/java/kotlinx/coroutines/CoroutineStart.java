package kotlinx.coroutines;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.AbstractC9108a;
import p179m7.AbstractC9325d;
import p179m7.InterfaceC9324c;
import p202o8.AbstractC9544a;
import p202o8.AbstractC9545b;
import p212p7.InterfaceC9760a;
import p300x7.InterfaceC10574p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class CoroutineStart {

    /* renamed from: a */
    public static final CoroutineStart f17552a = new CoroutineStart("DEFAULT", 0);

    /* renamed from: b */
    public static final CoroutineStart f17553b = new CoroutineStart("LAZY", 1);

    /* renamed from: c */
    public static final CoroutineStart f17554c = new CoroutineStart("ATOMIC", 2);

    /* renamed from: d */
    public static final CoroutineStart f17555d = new CoroutineStart("UNDISPATCHED", 3);

    /* renamed from: e */
    public static final /* synthetic */ CoroutineStart[] f17556e;

    /* renamed from: f */
    public static final /* synthetic */ InterfaceC9760a f17557f;

    /* renamed from: kotlinx.coroutines.CoroutineStart$a */
    public /* synthetic */ class C9146a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17558a;

        static {
            int[] iArr = new int[CoroutineStart.values().length];
            try {
                iArr[CoroutineStart.f17552a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CoroutineStart.f17554c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CoroutineStart.f17555d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CoroutineStart.f17553b.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f17558a = iArr;
        }
    }

    static {
        CoroutineStart[] coroutineStartArrM16223a = m16223a();
        f17556e = coroutineStartArrM16223a;
        f17557f = AbstractC9108a.m16085a(coroutineStartArrM16223a);
    }

    public CoroutineStart(String str, int i10) {
    }

    /* renamed from: a */
    public static final /* synthetic */ CoroutineStart[] m16223a() {
        return new CoroutineStart[]{f17552a, f17553b, f17554c, f17555d};
    }

    public static CoroutineStart valueOf(String str) {
        return (CoroutineStart) Enum.valueOf(CoroutineStart.class, str);
    }

    public static CoroutineStart[] values() {
        return (CoroutineStart[]) f17556e.clone();
    }

    /* renamed from: b */
    public final void m16224b(InterfaceC10574p interfaceC10574p, Object obj, InterfaceC9324c interfaceC9324c) throws Throwable {
        int i10 = C9146a.f17558a[ordinal()];
        if (i10 == 1) {
            AbstractC9544a.m17818d(interfaceC10574p, obj, interfaceC9324c, null, 4, null);
            return;
        }
        if (i10 == 2) {
            AbstractC9325d.m17154c(interfaceC10574p, obj, interfaceC9324c);
        } else if (i10 == 3) {
            AbstractC9545b.m17819a(interfaceC10574p, obj, interfaceC9324c);
        } else if (i10 != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: c */
    public final boolean m16225c() {
        return this == f17553b;
    }
}
