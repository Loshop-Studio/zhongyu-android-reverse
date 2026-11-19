package p082j1;

import android.graphics.Bitmap;
import android.graphics.RectF;

/* renamed from: j1.a */
/* loaded from: classes3.dex */
public class C6583a {

    /* renamed from: a */
    public int f8550a;

    /* renamed from: b */
    public int f8551b;

    /* renamed from: c */
    public Bitmap f8552c;

    /* renamed from: d */
    public float f8553d;

    /* renamed from: e */
    public float f8554e;

    /* renamed from: f */
    public RectF f8555f;

    /* renamed from: g */
    public boolean f8556g;

    /* renamed from: h */
    public int f8557h;

    public C6583a(int i6, int i7, Bitmap bitmap, float f6, float f7, RectF rectF, boolean z6, int i8) {
        this.f8550a = i6;
        this.f8551b = i7;
        this.f8552c = bitmap;
        this.f8555f = rectF;
        this.f8556g = z6;
        this.f8557h = i8;
    }

    /* renamed from: a */
    public int m7467a() {
        return this.f8557h;
    }

    /* renamed from: b */
    public float m7468b() {
        return this.f8554e;
    }

    /* renamed from: c */
    public int m7469c() {
        return this.f8551b;
    }

    /* renamed from: d */
    public RectF m7470d() {
        return this.f8555f;
    }

    /* renamed from: e */
    public Bitmap m7471e() {
        return this.f8552c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6583a)) {
            return false;
        }
        C6583a c6583a = (C6583a) obj;
        return c6583a.m7469c() == this.f8551b && c6583a.m7472f() == this.f8550a && c6583a.m7473g() == this.f8553d && c6583a.m7468b() == this.f8554e && c6583a.m7470d().left == this.f8555f.left && c6583a.m7470d().right == this.f8555f.right && c6583a.m7470d().top == this.f8555f.top && c6583a.m7470d().bottom == this.f8555f.bottom;
    }

    /* renamed from: f */
    public int m7472f() {
        return this.f8550a;
    }

    /* renamed from: g */
    public float m7473g() {
        return this.f8553d;
    }

    /* renamed from: h */
    public boolean m7474h() {
        return this.f8556g;
    }

    /* renamed from: i */
    public void m7475i(int i6) {
        this.f8557h = i6;
    }
}
