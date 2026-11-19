package p097f4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import p073d4.C8289a;
import p120h4.C8712a;

/* renamed from: f4.a */
/* loaded from: classes.dex */
public abstract class AbstractC8436a {

    /* renamed from: c */
    public int f16015c;

    /* renamed from: a */
    public boolean f16013a = true;

    /* renamed from: d */
    public Matrix f16016d = new Matrix();

    /* renamed from: e */
    public Matrix f16017e = new Matrix();

    /* renamed from: f */
    public ArrayList f16018f = new ArrayList();

    /* renamed from: b */
    public C8289a f16014b = mo13780b();

    /* renamed from: a */
    public abstract void mo13779a(C8712a c8712a, Canvas canvas);

    /* renamed from: b */
    public abstract C8289a mo13780b();

    /* renamed from: c */
    public abstract void mo13781c(int i10);

    /* renamed from: d */
    public boolean m13782d() {
        return this.f16013a;
    }

    /* renamed from: e */
    public void m13783e(boolean z10) {
        this.f16013a = z10;
    }
}
