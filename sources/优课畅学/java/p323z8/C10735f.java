package p323z8;

/* renamed from: z8.f */
/* loaded from: classes5.dex */
public class C10735f {

    /* renamed from: a */
    public long f21322a;

    /* renamed from: b */
    public float f21323b = 1.0f;

    /* renamed from: c */
    public long f21324c;

    public C10735f(long j10) {
        this.f21322a = j10;
        this.f21324c = j10;
    }

    /* renamed from: a */
    public void m20070a(float f10) {
        if (this.f21323b != f10) {
            this.f21323b = f10;
            this.f21324c = (long) (this.f21322a * f10);
        }
    }

    /* renamed from: b */
    public void m20071b(long j10) {
        this.f21322a = j10;
        this.f21324c = (long) (j10 * this.f21323b);
    }
}
