package io.objectbox;

import com.google.flatbuffers.C3821a;
import java.util.ArrayList;
import p204y1.AbstractC6768a;

/* renamed from: io.objectbox.c */
/* loaded from: classes3.dex */
public final class C5699c {

    /* renamed from: a */
    public final String f8936a;

    /* renamed from: b */
    public final ArrayList f8937b = new ArrayList();

    /* renamed from: c */
    public final ArrayList f8938c = new ArrayList();

    /* renamed from: d */
    public Integer f8939d;

    /* renamed from: e */
    public Long f8940e;

    /* renamed from: f */
    public Integer f8941f;

    /* renamed from: g */
    public Integer f8942g;

    /* renamed from: h */
    public Long f8943h;

    /* renamed from: i */
    public C5700d f8944i;

    /* renamed from: j */
    public boolean f8945j;

    /* renamed from: k */
    public final /* synthetic */ C5701e f8946k;

    public C5699c(C5701e c5701e, String str) {
        this.f8946k = c5701e;
        this.f8936a = str;
    }

    /* renamed from: a */
    public final void m5047a() {
        C5700d c5700d = this.f8944i;
        if (c5700d != null) {
            c5700d.m5055a();
            c5700d.f8951e = true;
            C3821a c3821a = c5700d.f8957k.f8958a;
            c3821a.m2777l(9);
            c3821a.m2767b(1, c5700d.f8949c);
            int i = c5700d.f8950d;
            if (i != 0) {
                c3821a.m2767b(5, i);
            }
            int i8 = c5700d.f8948b;
            if (i8 != 0) {
                c3821a.m2767b(6, i8);
            }
            int i9 = c5700d.f8953g;
            if (i9 != 0) {
                c3821a.m2769d(0, AbstractC6768a.m6444i(c3821a, i9, c5700d.f8954h));
            }
            int i10 = c5700d.f8955i;
            if (i10 != 0) {
                c3821a.m2769d(4, AbstractC6768a.m6444i(c3821a, i10, c5700d.f8956j));
            }
            short s8 = (short) c5700d.f8947a;
            if (c3821a.f2965l || s8 != 0) {
                c3821a.m2768c(s8);
                c3821a.m2776k(2);
            }
            int i11 = c5700d.f8952f;
            if (i11 != 0) {
                c3821a.m2766a(3, i11);
            }
            this.f8937b.add(Integer.valueOf(c3821a.m2771f()));
            this.f8944i = null;
        }
    }

    /* renamed from: b */
    public final void m5048b() {
        if (this.f8945j) {
            throw new IllegalStateException("Already finished");
        }
    }

    /* renamed from: c */
    public final void m5049c() {
        m5048b();
        m5047a();
        this.f8945j = true;
        C5701e c5701e = this.f8946k;
        C3821a c3821a = c5701e.f8958a;
        int iM2770e = c3821a.m2770e(this.f8936a);
        int iM5059a = c5701e.m5059a(this.f8937b);
        ArrayList arrayList = this.f8938c;
        int iM5059a2 = arrayList.isEmpty() ? 0 : c5701e.m5059a(arrayList);
        c3821a.m2777l(7);
        c3821a.m2767b(1, iM2770e);
        c3821a.m2767b(2, iM5059a);
        if (iM5059a2 != 0) {
            c3821a.m2767b(4, iM5059a2);
        }
        if (this.f8939d != null && this.f8940e != null) {
            c3821a.m2769d(0, AbstractC6768a.m6444i(c3821a, r0.intValue(), this.f8940e.longValue()));
        }
        if (this.f8942g != null) {
            c3821a.m2769d(3, AbstractC6768a.m6444i(c3821a, r0.intValue(), this.f8943h.longValue()));
        }
        if (this.f8941f != null) {
            c3821a.m2766a(5, r0.intValue());
        }
        c5701e.f8959b.add(Integer.valueOf(c3821a.m2771f()));
    }

    /* renamed from: d */
    public final void m5050d() {
        this.f8941f = 1;
    }

    /* renamed from: e */
    public final void m5051e(int i, long j7) {
        m5048b();
        this.f8939d = Integer.valueOf(i);
        this.f8940e = Long.valueOf(j7);
    }

    /* renamed from: f */
    public final void m5052f(int i, long j7) {
        m5048b();
        this.f8942g = Integer.valueOf(i);
        this.f8943h = Long.valueOf(j7);
    }

    /* renamed from: g */
    public final C5700d m5053g(int i, String str, String str2, String str3) {
        m5048b();
        m5047a();
        C5700d c5700d = new C5700d(this.f8946k, str, str2, str3, i);
        this.f8944i = c5700d;
        return c5700d;
    }

    /* renamed from: h */
    public final void m5054h(String str, int i, long j7, int i8, long j8) {
        m5048b();
        m5047a();
        C3821a c3821a = this.f8946k.f8958a;
        int iM2770e = c3821a.m2770e(str);
        c3821a.m2777l(3);
        c3821a.m2767b(1, iM2770e);
        c3821a.m2769d(0, AbstractC6768a.m6444i(c3821a, i, j7));
        c3821a.m2769d(2, AbstractC6768a.m6444i(c3821a, i8, j8));
        this.f8938c.add(Integer.valueOf(c3821a.m2771f()));
    }
}
