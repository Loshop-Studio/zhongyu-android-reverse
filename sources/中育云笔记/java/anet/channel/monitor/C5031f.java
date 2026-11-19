package anet.channel.monitor;

/* renamed from: anet.channel.monitor.f */
/* loaded from: classes3.dex */
public class C5031f {

    /* renamed from: b */
    protected long f2498b;

    /* renamed from: c */
    private final double f2499c = 40.0d;

    /* renamed from: a */
    boolean f2497a = false;

    /* renamed from: d */
    private boolean f2500d = true;

    /* renamed from: a */
    public int m2367a() {
        return 0;
    }

    /* renamed from: b */
    public final boolean m2369b() {
        if (!this.f2500d) {
            return false;
        }
        if (System.currentTimeMillis() - this.f2498b <= m2367a() * 1000) {
            return true;
        }
        this.f2500d = false;
        return false;
    }

    /* renamed from: a */
    public boolean m2368a(double d10) {
        return d10 < 40.0d;
    }
}
