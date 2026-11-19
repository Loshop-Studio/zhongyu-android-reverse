package p321z6;

import p299x6.InterfaceC10554b;

/* renamed from: z6.b */
/* loaded from: classes5.dex */
public abstract class AbstractC10726b {

    /* renamed from: a */
    public static final InterfaceC10554b f21280a = new a();

    /* renamed from: z6.b$a */
    public static final class a implements InterfaceC10554b {
    }

    /* renamed from: a */
    public static int m20028a(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 > i11 ? 1 : 0;
    }

    /* renamed from: b */
    public static int m20029b(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 > j11 ? 1 : 0;
    }

    /* renamed from: c */
    public static Object m20030c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: d */
    public static int m20031d(int i10, String str) {
        if (i10 > 0) {
            return i10;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i10);
    }
}
