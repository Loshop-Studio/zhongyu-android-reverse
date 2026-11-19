package p326rd;

/* renamed from: rd.b */
/* loaded from: classes6.dex */
public abstract class AbstractC10987b {

    /* renamed from: a */
    public static final boolean f26496a = false;

    /* renamed from: b */
    public static final ThreadLocal[] f26497b;

    static {
        ThreadLocal[] threadLocalArr = new ThreadLocal[4];
        for (int i10 = 0; i10 < 4; i10++) {
            threadLocalArr[i10] = new ThreadLocal();
        }
        f26497b = threadLocalArr;
    }

    /* renamed from: a */
    public static final boolean m24209a() {
        return f26496a;
    }
}
