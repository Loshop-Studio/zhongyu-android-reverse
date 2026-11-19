package p113l;

import androidx.constraintlayout.motion.widget.AbstractC0271g;
import androidx.constraintlayout.motion.widget.AbstractC0282r;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* renamed from: l.h */
/* loaded from: classes.dex */
public class C2832h {

    /* renamed from: a */
    float f10912a;

    /* renamed from: b */
    float f10913b;

    /* renamed from: c */
    float f10914c;

    /* renamed from: d */
    float f10915d;

    /* renamed from: e */
    float f10916e;

    /* renamed from: f */
    float f10917f;

    /* renamed from: a */
    public void m9472a(float f4, float f5, int i4, int i5, float[] fArr) {
        float f6 = fArr[0];
        float f7 = fArr[1];
        float f8 = (f5 - 0.5f) * 2.0f;
        float f9 = f6 + this.f10914c;
        float f10 = f7 + this.f10915d;
        float f11 = f9 + (this.f10912a * (f4 - 0.5f) * 2.0f);
        float f12 = f10 + (this.f10913b * f8);
        float radians = (float) Math.toRadians(this.f10917f);
        float radians2 = (float) Math.toRadians(this.f10916e);
        double d4 = radians;
        double d5 = i5 * f8;
        float fSin = f11 + (((float) ((((-i4) * r7) * Math.sin(d4)) - (Math.cos(d4) * d5))) * radians2);
        float fCos = f12 + (radians2 * ((float) (((i4 * r7) * Math.cos(d4)) - (d5 * Math.sin(d4)))));
        fArr[0] = fSin;
        fArr[1] = fCos;
    }

    /* renamed from: b */
    public void m9473b() {
        this.f10916e = IGoodView.DEFAULT_TO_ALPHA;
        this.f10915d = IGoodView.DEFAULT_TO_ALPHA;
        this.f10914c = IGoodView.DEFAULT_TO_ALPHA;
        this.f10913b = IGoodView.DEFAULT_TO_ALPHA;
        this.f10912a = IGoodView.DEFAULT_TO_ALPHA;
    }

    /* renamed from: c */
    public void m9474c(AbstractC0271g abstractC0271g, float f4) {
        if (abstractC0271g != null) {
            this.f10916e = abstractC0271g.m1340b(f4);
        }
    }

    /* renamed from: d */
    public void m9475d(AbstractC0282r abstractC0282r, float f4) {
        if (abstractC0282r != null) {
            this.f10916e = abstractC0282r.m1534b(f4);
            this.f10917f = abstractC0282r.m1533a(f4);
        }
    }

    /* renamed from: e */
    public void m9476e(AbstractC0271g abstractC0271g, AbstractC0271g abstractC0271g2, float f4) {
        if (abstractC0271g == null && abstractC0271g2 == null) {
            return;
        }
        if (abstractC0271g == null) {
            this.f10912a = abstractC0271g.m1340b(f4);
        }
        if (abstractC0271g2 == null) {
            this.f10913b = abstractC0271g2.m1340b(f4);
        }
    }

    /* renamed from: f */
    public void m9477f(AbstractC0282r abstractC0282r, AbstractC0282r abstractC0282r2, float f4) {
        if (abstractC0282r != null) {
            this.f10912a = abstractC0282r.m1534b(f4);
        }
        if (abstractC0282r2 != null) {
            this.f10913b = abstractC0282r2.m1534b(f4);
        }
    }

    /* renamed from: g */
    public void m9478g(AbstractC0271g abstractC0271g, AbstractC0271g abstractC0271g2, float f4) {
        if (abstractC0271g != null) {
            this.f10914c = abstractC0271g.m1340b(f4);
        }
        if (abstractC0271g2 != null) {
            this.f10915d = abstractC0271g2.m1340b(f4);
        }
    }

    /* renamed from: h */
    public void m9479h(AbstractC0282r abstractC0282r, AbstractC0282r abstractC0282r2, float f4) {
        if (abstractC0282r != null) {
            this.f10914c = abstractC0282r.m1534b(f4);
        }
        if (abstractC0282r2 != null) {
            this.f10915d = abstractC0282r2.m1534b(f4);
        }
    }
}
