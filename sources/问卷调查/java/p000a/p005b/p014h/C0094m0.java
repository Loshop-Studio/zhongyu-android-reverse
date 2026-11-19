package p000a.p005b.p014h;

/* renamed from: a.b.h.m0 */
/* loaded from: classes.dex */
public class C0094m0 {

    /* renamed from: a */
    public int f708a = 0;

    /* renamed from: b */
    public int f709b = 0;

    /* renamed from: c */
    public int f710c = Integer.MIN_VALUE;

    /* renamed from: d */
    public int f711d = Integer.MIN_VALUE;

    /* renamed from: e */
    public int f712e = 0;

    /* renamed from: f */
    public int f713f = 0;

    /* renamed from: g */
    public boolean f714g = false;

    /* renamed from: h */
    public boolean f715h = false;

    /* renamed from: a */
    public void m365a(int i, int i2) {
        this.f710c = i;
        this.f711d = i2;
        this.f715h = true;
        if (this.f714g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f708a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f709b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f708a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f709b = i2;
        }
    }
}
