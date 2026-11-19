package p246m4;

import android.graphics.Bitmap;
import android.graphics.RectF;

/* renamed from: m4.b */
/* loaded from: classes5.dex */
public class C10199b {

    /* renamed from: a */
    public int f24286a;

    /* renamed from: b */
    public Bitmap f24287b;

    /* renamed from: c */
    public RectF f24288c;

    /* renamed from: d */
    public boolean f24289d;

    /* renamed from: e */
    public int f24290e;

    public C10199b(int i10, Bitmap bitmap, RectF rectF, boolean z10, int i11) {
        this.f24286a = i10;
        this.f24287b = bitmap;
        this.f24288c = rectF;
        this.f24289d = z10;
        this.f24290e = i11;
    }

    /* renamed from: a */
    public int m21299a() {
        return this.f24290e;
    }

    /* renamed from: b */
    public int m21300b() {
        return this.f24286a;
    }

    /* renamed from: c */
    public RectF m21301c() {
        return this.f24288c;
    }

    /* renamed from: d */
    public Bitmap m21302d() {
        return this.f24287b;
    }

    /* renamed from: e */
    public boolean m21303e() {
        return this.f24289d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10199b)) {
            return false;
        }
        C10199b c10199b = (C10199b) obj;
        return c10199b.m21300b() == this.f24286a && c10199b.m21301c().left == this.f24288c.left && c10199b.m21301c().right == this.f24288c.right && c10199b.m21301c().top == this.f24288c.top && c10199b.m21301c().bottom == this.f24288c.bottom;
    }

    /* renamed from: f */
    public void m21304f(int i10) {
        this.f24290e = i10;
    }
}
