package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.y */
/* loaded from: classes.dex */
class C0239y {

    /* renamed from: a */
    private int f1238a = 0;

    /* renamed from: b */
    private int f1239b = 0;

    /* renamed from: c */
    private int f1240c = Integer.MIN_VALUE;

    /* renamed from: d */
    private int f1241d = Integer.MIN_VALUE;

    /* renamed from: e */
    private int f1242e = 0;

    /* renamed from: f */
    private int f1243f = 0;

    /* renamed from: g */
    private boolean f1244g = false;

    /* renamed from: h */
    private boolean f1245h = false;

    C0239y() {
    }

    /* renamed from: a */
    public int m1038a() {
        return this.f1244g ? this.f1238a : this.f1239b;
    }

    /* renamed from: b */
    public int m1039b() {
        return this.f1238a;
    }

    /* renamed from: c */
    public int m1040c() {
        return this.f1239b;
    }

    /* renamed from: d */
    public int m1041d() {
        return this.f1244g ? this.f1239b : this.f1238a;
    }

    /* renamed from: e */
    public void m1042e(int i4, int i5) {
        this.f1245h = false;
        if (i4 != Integer.MIN_VALUE) {
            this.f1242e = i4;
            this.f1238a = i4;
        }
        if (i5 != Integer.MIN_VALUE) {
            this.f1243f = i5;
            this.f1239b = i5;
        }
    }

    /* renamed from: f */
    public void m1043f(boolean z3) {
        if (z3 == this.f1244g) {
            return;
        }
        this.f1244g = z3;
        if (!this.f1245h) {
            this.f1238a = this.f1242e;
            this.f1239b = this.f1243f;
            return;
        }
        if (z3) {
            int i4 = this.f1241d;
            if (i4 == Integer.MIN_VALUE) {
                i4 = this.f1242e;
            }
            this.f1238a = i4;
            int i5 = this.f1240c;
            if (i5 == Integer.MIN_VALUE) {
                i5 = this.f1243f;
            }
            this.f1239b = i5;
            return;
        }
        int i6 = this.f1240c;
        if (i6 == Integer.MIN_VALUE) {
            i6 = this.f1242e;
        }
        this.f1238a = i6;
        int i7 = this.f1241d;
        if (i7 == Integer.MIN_VALUE) {
            i7 = this.f1243f;
        }
        this.f1239b = i7;
    }

    /* renamed from: g */
    public void m1044g(int i4, int i5) {
        this.f1240c = i4;
        this.f1241d = i5;
        this.f1245h = true;
        if (this.f1244g) {
            if (i5 != Integer.MIN_VALUE) {
                this.f1238a = i5;
            }
            if (i4 != Integer.MIN_VALUE) {
                this.f1239b = i4;
                return;
            }
            return;
        }
        if (i4 != Integer.MIN_VALUE) {
            this.f1238a = i4;
        }
        if (i5 != Integer.MIN_VALUE) {
            this.f1239b = i5;
        }
    }
}
