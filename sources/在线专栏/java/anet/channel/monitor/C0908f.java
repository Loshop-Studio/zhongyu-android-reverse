package anet.channel.monitor;

/* renamed from: anet.channel.monitor.f */
/* loaded from: classes.dex */
public class C0908f {

    /* renamed from: b */
    protected long f5220b;

    /* renamed from: c */
    private final double f5221c = 40.0d;

    /* renamed from: a */
    boolean f5219a = false;

    /* renamed from: d */
    private boolean f5222d = true;

    /* renamed from: a */
    public int m4476a() {
        return 0;
    }

    /* renamed from: a */
    public boolean m4477a(double d4) {
        return d4 < 40.0d;
    }

    /* renamed from: b */
    protected final boolean m4478b() {
        if (!this.f5222d) {
            return false;
        }
        if (System.currentTimeMillis() - this.f5220b <= m4476a() * 1000) {
            return true;
        }
        this.f5222d = false;
        return false;
    }
}
