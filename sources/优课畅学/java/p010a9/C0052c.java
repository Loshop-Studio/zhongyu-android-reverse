package p010a9;

import java.lang.reflect.Array;
import master.flame.danmaku.danmaku.model.android.DanmakuContext;
import p323z8.AbstractC10730a;
import p323z8.AbstractC10732c;
import p323z8.C10735f;
import p323z8.C10736g;
import p323z8.C10737h;
import p323z8.C10744o;
import p323z8.C10745p;
import p323z8.C10746q;
import p323z8.InterfaceC10740k;
import p323z8.InterfaceC10741l;
import p323z8.InterfaceC10742m;

/* renamed from: a9.c */
/* loaded from: classes5.dex */
public class C0052c {

    /* renamed from: f */
    public C10735f f156f;

    /* renamed from: g */
    public C10735f f157g;

    /* renamed from: h */
    public C10735f f158h;

    /* renamed from: j */
    public InterfaceC10742m f160j;

    /* renamed from: k */
    public DanmakuContext f161k;

    /* renamed from: a */
    public int f151a = 0;

    /* renamed from: b */
    public int f152b = 0;

    /* renamed from: c */
    public float f153c = 1.0f;

    /* renamed from: d */
    public long f154d = 3800;

    /* renamed from: e */
    public long f155e = 4000;

    /* renamed from: i */
    public InterfaceC10741l f159i = new C0053d();

    /* renamed from: a */
    public static C0052c m163a() {
        return new C0052c();
    }

    /* renamed from: f */
    public static void m164f(AbstractC10732c abstractC10732c, float[][] fArr, float f10, float f11) {
        if (abstractC10732c.mo20054m() == 7 && fArr.length != 0 && fArr[0].length == 2) {
            for (float[] fArr2 : fArr) {
                fArr2[0] = fArr2[0] * f10;
                fArr2[1] = fArr2[1] * f11;
            }
            ((C10746q) abstractC10732c).m20080E(fArr);
        }
    }

    /* renamed from: b */
    public AbstractC10732c m165b(int i10) {
        return m168e(i10, this.f161k);
    }

    /* renamed from: c */
    public AbstractC10732c m166c(int i10, float f10, float f11, float f12, float f13) {
        float f14;
        float f15;
        int i11 = this.f151a;
        int i12 = this.f152b;
        boolean zM175m = m175m(f10, f11, f12);
        C10735f c10735f = this.f156f;
        if (c10735f == null) {
            C10735f c10735f2 = new C10735f(this.f154d);
            this.f156f = c10735f2;
            c10735f2.m20070a(f13);
        } else if (zM175m) {
            c10735f.m20071b(this.f154d);
        }
        if (this.f157g == null) {
            this.f157g = new C10735f(3800L);
        }
        if (zM175m && f10 > 0.0f) {
            m172j();
            if (i11 <= 0 || i12 <= 0) {
                f14 = 1.0f;
                f15 = 1.0f;
            } else {
                f14 = f10 / i11;
                f15 = f11 / i12;
            }
            if (f11 > 0.0f) {
                m173k(f14, f15);
            }
        }
        if (i10 == 1) {
            return new C10745p(this.f156f);
        }
        if (i10 == 4) {
            return new C10736g(this.f157g);
        }
        if (i10 == 5) {
            return new C10737h(this.f157g);
        }
        if (i10 == 6) {
            return new C10744o(this.f156f);
        }
        if (i10 != 7) {
            return null;
        }
        C10746q c10746q = new C10746q();
        this.f159i.mo182e(c10746q);
        return c10746q;
    }

    /* renamed from: d */
    public AbstractC10732c m167d(int i10, int i11, int i12, float f10, float f11) {
        return m166c(i10, i11, i12, f10, f11);
    }

    /* renamed from: e */
    public AbstractC10732c m168e(int i10, DanmakuContext danmakuContext) {
        if (danmakuContext == null) {
            return null;
        }
        this.f161k = danmakuContext;
        AbstractC10730a abstractC10730aM17216b = danmakuContext.m17216b();
        this.f160j = abstractC10730aM17216b;
        return m167d(i10, abstractC10730aM17216b.getWidth(), this.f160j.getHeight(), this.f153c, danmakuContext.f18439k);
    }

    /* renamed from: g */
    public void m169g(AbstractC10732c abstractC10732c, float f10, float f11, float f12, float f13, long j10, long j11, float f14, float f15) {
        if (abstractC10732c.mo20054m() != 7) {
            return;
        }
        ((C10746q) abstractC10732c).m20081F(f10 * f14, f11 * f15, f12 * f14, f13 * f15, j10, j11);
        m174l(abstractC10732c);
    }

    /* renamed from: h */
    public void m170h(DanmakuContext danmakuContext) {
        this.f161k = danmakuContext;
        this.f160j = danmakuContext.m17216b();
        m168e(1, danmakuContext);
    }

    /* renamed from: i */
    public void m171i() {
        this.f160j = null;
        this.f152b = 0;
        this.f151a = 0;
        this.f159i.clear();
        this.f156f = null;
        this.f157g = null;
        this.f158h = null;
        this.f155e = 4000L;
    }

    /* renamed from: j */
    public void m172j() {
        C10735f c10735f = this.f156f;
        long j10 = c10735f == null ? 0L : c10735f.f21324c;
        C10735f c10735f2 = this.f157g;
        long j11 = c10735f2 == null ? 0L : c10735f2.f21324c;
        C10735f c10735f3 = this.f158h;
        long j12 = c10735f3 != null ? c10735f3.f21324c : 0L;
        long jMax = Math.max(j10, j11);
        this.f155e = jMax;
        long jMax2 = Math.max(jMax, j12);
        this.f155e = jMax2;
        long jMax3 = Math.max(3800L, jMax2);
        this.f155e = jMax3;
        this.f155e = Math.max(this.f154d, jMax3);
    }

    /* renamed from: k */
    public final void m173k(float f10, float f11) {
        InterfaceC10740k it = this.f159i.iterator();
        while (it.hasNext()) {
            C10746q c10746q = (C10746q) it.next();
            m169g(c10746q, c10746q.f21343L, c10746q.f21344M, c10746q.f21345N, c10746q.f21346O, c10746q.f21349R, c10746q.f21350S, f10, f11);
            C10746q.a[] aVarArr = c10746q.f21356Y;
            if (aVarArr != null && aVarArr.length > 0) {
                int length = aVarArr.length;
                int i10 = 0;
                float[][] fArr = (float[][]) Array.newInstance((Class<?>) Float.TYPE, length + 1, 2);
                while (i10 < length) {
                    fArr[i10] = aVarArr[i10].m20082a();
                    int i11 = i10 + 1;
                    fArr[i11] = aVarArr[i10].m20084c();
                    i10 = i11;
                }
                m164f(c10746q, fArr, f10, f11);
            }
        }
    }

    /* renamed from: l */
    public final void m174l(AbstractC10732c abstractC10732c) {
        C10735f c10735f;
        C10735f c10735f2 = this.f158h;
        if (c10735f2 == null || ((c10735f = abstractC10732c.f21310q) != null && c10735f.f21324c > c10735f2.f21324c)) {
            this.f158h = abstractC10732c.f21310q;
            m172j();
        }
    }

    /* renamed from: m */
    public boolean m175m(float f10, float f11, float f12) {
        int i10 = (int) f10;
        if (this.f151a == i10 && this.f152b == ((int) f11) && this.f153c == f12) {
            return false;
        }
        long j10 = (long) (((f10 * f12) / 682.0f) * 3800.0f);
        this.f154d = j10;
        long jMin = Math.min(9000L, j10);
        this.f154d = jMin;
        this.f154d = Math.max(4000L, jMin);
        this.f151a = i10;
        this.f152b = (int) f11;
        this.f153c = f12;
        return true;
    }
}
