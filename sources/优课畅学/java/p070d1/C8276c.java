package p070d1;

import com.github.barteksc.pdfviewer.util.FitPolicy;
import com.shockwave.pdfium.util.Size;
import p117h1.C8708a;

/* renamed from: d1.c */
/* loaded from: classes3.dex */
public class C8276c {

    /* renamed from: a */
    public FitPolicy f15673a;

    /* renamed from: b */
    public final Size f15674b;

    /* renamed from: c */
    public final Size f15675c;

    /* renamed from: d */
    public final Size f15676d;

    /* renamed from: e */
    public C8708a f15677e;

    /* renamed from: f */
    public C8708a f15678f;

    /* renamed from: g */
    public float f15679g;

    /* renamed from: h */
    public float f15680h;

    /* renamed from: i */
    public boolean f15681i;

    /* renamed from: d1.c$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15682a;

        static {
            int[] iArr = new int[FitPolicy.values().length];
            f15682a = iArr;
            try {
                iArr[FitPolicy.HEIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15682a[FitPolicy.BOTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C8276c(FitPolicy fitPolicy, Size size, Size size2, Size size3, boolean z10) {
        this.f15673a = fitPolicy;
        this.f15674b = size;
        this.f15675c = size2;
        this.f15676d = size3;
        this.f15681i = z10;
        m13423b();
    }

    /* renamed from: a */
    public C8708a m13422a(Size size) {
        if (size.m4107b() <= 0 || size.m4106a() <= 0) {
            return new C8708a(0.0f, 0.0f);
        }
        float fM4107b = this.f15681i ? this.f15676d.m4107b() : size.m4107b() * this.f15679g;
        float fM4106a = this.f15681i ? this.f15676d.m4106a() : size.m4106a() * this.f15680h;
        int i10 = a.f15682a[this.f15673a.ordinal()];
        return i10 != 1 ? i10 != 2 ? m13426e(size, fM4107b) : m13424c(size, fM4107b, fM4106a) : m13425d(size, fM4106a);
    }

    /* renamed from: b */
    public final void m13423b() {
        int i10 = a.f15682a[this.f15673a.ordinal()];
        if (i10 == 1) {
            C8708a c8708aM13425d = m13425d(this.f15675c, this.f15676d.m4106a());
            this.f15678f = c8708aM13425d;
            this.f15680h = c8708aM13425d.m14207a() / this.f15675c.m4106a();
            this.f15677e = m13425d(this.f15674b, r0.m4106a() * this.f15680h);
            return;
        }
        if (i10 != 2) {
            C8708a c8708aM13426e = m13426e(this.f15674b, this.f15676d.m4107b());
            this.f15677e = c8708aM13426e;
            this.f15679g = c8708aM13426e.m14208b() / this.f15674b.m4107b();
            this.f15678f = m13426e(this.f15675c, r0.m4107b() * this.f15679g);
            return;
        }
        float fM14208b = m13424c(this.f15674b, this.f15676d.m4107b(), this.f15676d.m4106a()).m14208b() / this.f15674b.m4107b();
        C8708a c8708aM13424c = m13424c(this.f15675c, r1.m4107b() * fM14208b, this.f15676d.m4106a());
        this.f15678f = c8708aM13424c;
        this.f15680h = c8708aM13424c.m14207a() / this.f15675c.m4106a();
        C8708a c8708aM13424c2 = m13424c(this.f15674b, this.f15676d.m4107b(), this.f15674b.m4106a() * this.f15680h);
        this.f15677e = c8708aM13424c2;
        this.f15679g = c8708aM13424c2.m14208b() / this.f15674b.m4107b();
    }

    /* renamed from: c */
    public final C8708a m13424c(Size size, float f10, float f11) {
        float fM4107b = size.m4107b() / size.m4106a();
        float fFloor = (float) Math.floor(f10 / fM4107b);
        if (fFloor > f11) {
            f10 = (float) Math.floor(fM4107b * f11);
        } else {
            f11 = fFloor;
        }
        return new C8708a(f10, f11);
    }

    /* renamed from: d */
    public final C8708a m13425d(Size size, float f10) {
        return new C8708a((float) Math.floor(f10 / (size.m4106a() / size.m4107b())), f10);
    }

    /* renamed from: e */
    public final C8708a m13426e(Size size, float f10) {
        return new C8708a(f10, (float) Math.floor(f10 / (size.m4107b() / size.m4106a())));
    }

    /* renamed from: f */
    public C8708a m13427f() {
        return this.f15678f;
    }

    /* renamed from: g */
    public C8708a m13428g() {
        return this.f15677e;
    }
}
