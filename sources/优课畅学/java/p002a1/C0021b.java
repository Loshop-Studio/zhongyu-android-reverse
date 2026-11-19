package p002a1;

import android.graphics.Bitmap;
import android.graphics.RectF;

/* renamed from: a1.b */
/* loaded from: classes3.dex */
public class C0021b {

    /* renamed from: a */
    public int f61a;

    /* renamed from: b */
    public Bitmap f62b;

    /* renamed from: c */
    public RectF f63c;

    /* renamed from: d */
    public boolean f64d;

    /* renamed from: e */
    public int f65e;

    public C0021b(int i10, Bitmap bitmap, RectF rectF, boolean z10, int i11) {
        this.f61a = i10;
        this.f62b = bitmap;
        this.f63c = rectF;
        this.f64d = z10;
        this.f65e = i11;
    }

    /* renamed from: a */
    public int m45a() {
        return this.f65e;
    }

    /* renamed from: b */
    public int m46b() {
        return this.f61a;
    }

    /* renamed from: c */
    public RectF m47c() {
        return this.f63c;
    }

    /* renamed from: d */
    public Bitmap m48d() {
        return this.f62b;
    }

    /* renamed from: e */
    public boolean m49e() {
        return this.f64d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0021b)) {
            return false;
        }
        C0021b c0021b = (C0021b) obj;
        return c0021b.m46b() == this.f61a && c0021b.m47c().left == this.f63c.left && c0021b.m47c().right == this.f63c.right && c0021b.m47c().top == this.f63c.top && c0021b.m47c().bottom == this.f63c.bottom;
    }

    /* renamed from: f */
    public void m50f(int i10) {
        this.f65e = i10;
    }
}
