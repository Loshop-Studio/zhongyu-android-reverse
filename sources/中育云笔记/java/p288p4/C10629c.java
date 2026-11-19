package p288p4;

import com.github.barteksc.pdfviewer.util.FitPolicy;
import com.shockwave.pdfium.util.Size;
import p205j7.C9686a;

/* renamed from: p4.c */
/* loaded from: classes5.dex */
public class C10629c {

    /* renamed from: a */
    public FitPolicy f25610a;

    /* renamed from: b */
    public final Size f25611b;

    /* renamed from: c */
    public final Size f25612c;

    /* renamed from: d */
    public final Size f25613d;

    /* renamed from: e */
    public C9686a f25614e;

    /* renamed from: f */
    public C9686a f25615f;

    /* renamed from: g */
    public float f25616g;

    /* renamed from: h */
    public float f25617h;

    /* renamed from: i */
    public boolean f25618i;

    /* renamed from: p4.c$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25619a;

        static {
            int[] iArr = new int[FitPolicy.values().length];
            f25619a = iArr;
            try {
                iArr[FitPolicy.HEIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25619a[FitPolicy.BOTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C10629c(FitPolicy fitPolicy, Size size, Size size2, Size size3, boolean z10) {
        this.f25610a = fitPolicy;
        this.f25611b = size;
        this.f25612c = size2;
        this.f25613d = size3;
        this.f25618i = z10;
        m22473b();
    }

    /* renamed from: a */
    public C9686a m22472a(Size size) {
        if (size.m9720b() <= 0 || size.m9719a() <= 0) {
            return new C9686a(0.0f, 0.0f);
        }
        float fM9720b = this.f25618i ? this.f25613d.m9720b() : size.m9720b() * this.f25616g;
        float fM9719a = this.f25618i ? this.f25613d.m9719a() : size.m9719a() * this.f25617h;
        int i10 = a.f25619a[this.f25610a.ordinal()];
        return i10 != 1 ? i10 != 2 ? m22476e(size, fM9720b) : m22474c(size, fM9720b, fM9719a) : m22475d(size, fM9719a);
    }

    /* renamed from: b */
    public final void m22473b() {
        int i10 = a.f25619a[this.f25610a.ordinal()];
        if (i10 == 1) {
            C9686a c9686aM22475d = m22475d(this.f25612c, this.f25613d.m9719a());
            this.f25615f = c9686aM22475d;
            this.f25617h = c9686aM22475d.m19173a() / this.f25612c.m9719a();
            this.f25614e = m22475d(this.f25611b, r0.m9719a() * this.f25617h);
            return;
        }
        if (i10 != 2) {
            C9686a c9686aM22476e = m22476e(this.f25611b, this.f25613d.m9720b());
            this.f25614e = c9686aM22476e;
            this.f25616g = c9686aM22476e.m19174b() / this.f25611b.m9720b();
            this.f25615f = m22476e(this.f25612c, r0.m9720b() * this.f25616g);
            return;
        }
        float fM19174b = m22474c(this.f25611b, this.f25613d.m9720b(), this.f25613d.m9719a()).m19174b() / this.f25611b.m9720b();
        C9686a c9686aM22474c = m22474c(this.f25612c, r1.m9720b() * fM19174b, this.f25613d.m9719a());
        this.f25615f = c9686aM22474c;
        this.f25617h = c9686aM22474c.m19173a() / this.f25612c.m9719a();
        C9686a c9686aM22474c2 = m22474c(this.f25611b, this.f25613d.m9720b(), this.f25611b.m9719a() * this.f25617h);
        this.f25614e = c9686aM22474c2;
        this.f25616g = c9686aM22474c2.m19174b() / this.f25611b.m9720b();
    }

    /* renamed from: c */
    public final C9686a m22474c(Size size, float f10, float f11) {
        float fM9720b = size.m9720b() / size.m9719a();
        float fFloor = (float) Math.floor(f10 / fM9720b);
        if (fFloor > f11) {
            f10 = (float) Math.floor(fM9720b * f11);
        } else {
            f11 = fFloor;
        }
        return new C9686a(f10, f11);
    }

    /* renamed from: d */
    public final C9686a m22475d(Size size, float f10) {
        return new C9686a((float) Math.floor(f10 / (size.m9719a() / size.m9720b())), f10);
    }

    /* renamed from: e */
    public final C9686a m22476e(Size size, float f10) {
        return new C9686a(f10, (float) Math.floor(f10 / (size.m9720b() / size.m9719a())));
    }

    /* renamed from: f */
    public C9686a m22477f() {
        return this.f25615f;
    }

    /* renamed from: g */
    public C9686a m22478g() {
        return this.f25614e;
    }
}
