package p127o1;

import android.graphics.Bitmap;
import android.graphics.RectF;

/* renamed from: o1.a */
/* loaded from: classes.dex */
public class C2907a {

    /* renamed from: a */
    private int f11399a;

    /* renamed from: b */
    private int f11400b;

    /* renamed from: c */
    private Bitmap f11401c;

    /* renamed from: d */
    private float f11402d;

    /* renamed from: e */
    private float f11403e;

    /* renamed from: f */
    private RectF f11404f;

    /* renamed from: g */
    private boolean f11405g;

    /* renamed from: h */
    private int f11406h;

    public C2907a(int i4, int i5, Bitmap bitmap, float f4, float f5, RectF rectF, boolean z3, int i6) {
        this.f11399a = i4;
        this.f11400b = i5;
        this.f11401c = bitmap;
        this.f11404f = rectF;
        this.f11405g = z3;
        this.f11406h = i6;
    }

    /* renamed from: a */
    public int m9972a() {
        return this.f11406h;
    }

    /* renamed from: b */
    public float m9973b() {
        return this.f11403e;
    }

    /* renamed from: c */
    public int m9974c() {
        return this.f11400b;
    }

    /* renamed from: d */
    public RectF m9975d() {
        return this.f11404f;
    }

    /* renamed from: e */
    public Bitmap m9976e() {
        return this.f11401c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2907a)) {
            return false;
        }
        C2907a c2907a = (C2907a) obj;
        return c2907a.m9974c() == this.f11400b && c2907a.m9977f() == this.f11399a && c2907a.m9978g() == this.f11402d && c2907a.m9973b() == this.f11403e && c2907a.m9975d().left == this.f11404f.left && c2907a.m9975d().right == this.f11404f.right && c2907a.m9975d().top == this.f11404f.top && c2907a.m9975d().bottom == this.f11404f.bottom;
    }

    /* renamed from: f */
    public int m9977f() {
        return this.f11399a;
    }

    /* renamed from: g */
    public float m9978g() {
        return this.f11402d;
    }

    /* renamed from: h */
    public boolean m9979h() {
        return this.f11405g;
    }

    /* renamed from: i */
    public void m9980i(int i4) {
        this.f11406h = i4;
    }
}
