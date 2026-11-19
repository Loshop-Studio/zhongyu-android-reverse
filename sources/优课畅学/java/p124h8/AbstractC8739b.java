package p124h8;

/* renamed from: h8.b */
/* loaded from: classes5.dex */
public abstract class AbstractC8739b {

    /* renamed from: a */
    public static final boolean f16374a = false;

    /* renamed from: b */
    public static final ThreadLocal[] f16375b;

    static {
        ThreadLocal[] threadLocalArr = new ThreadLocal[4];
        for (int i10 = 0; i10 < 4; i10++) {
            threadLocalArr[i10] = new ThreadLocal();
        }
        f16375b = threadLocalArr;
    }

    /* renamed from: a */
    public static final boolean m14368a() {
        return f16374a;
    }
}
