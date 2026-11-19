package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import org.xmlpull.v1.XmlPullParser;
import p148s.C3369g;

/* loaded from: classes.dex */
public class ArcMotion extends PathMotion {

    /* renamed from: g */
    private static final float f4257g = (float) Math.tan(Math.toRadians(35.0d));

    /* renamed from: a */
    private float f4258a;

    /* renamed from: b */
    private float f4259b;

    /* renamed from: c */
    private float f4260c;

    /* renamed from: d */
    private float f4261d;

    /* renamed from: e */
    private float f4262e;

    /* renamed from: f */
    private float f4263f;

    public ArcMotion() {
        this.f4258a = IGoodView.DEFAULT_TO_ALPHA;
        this.f4259b = IGoodView.DEFAULT_TO_ALPHA;
        this.f4260c = 70.0f;
        this.f4261d = IGoodView.DEFAULT_TO_ALPHA;
        this.f4262e = IGoodView.DEFAULT_TO_ALPHA;
        this.f4263f = f4257g;
    }

    /* renamed from: d */
    private static float m3760d(float f4) {
        if (f4 < IGoodView.DEFAULT_TO_ALPHA || f4 > 90.0f) {
            throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
        }
        return (float) Math.tan(Math.toRadians(f4 / 2.0f));
    }

    /* renamed from: a */
    public void m3761a(float f4) {
        this.f4260c = f4;
        this.f4263f = m3760d(f4);
    }

    /* renamed from: b */
    public void m3762b(float f4) {
        this.f4258a = f4;
        this.f4261d = m3760d(f4);
    }

    /* renamed from: c */
    public void m3763c(float f4) {
        this.f4259b = f4;
        this.f4262e = m3760d(f4);
    }

    @Override // androidx.transition.PathMotion
    public Path getPath(float f4, float f5, float f6, float f7) {
        float f8;
        float f9;
        float f10;
        Path path = new Path();
        path.moveTo(f4, f5);
        float f11 = f6 - f4;
        float f12 = f7 - f5;
        float f13 = (f11 * f11) + (f12 * f12);
        float f14 = (f4 + f6) / 2.0f;
        float f15 = (f5 + f7) / 2.0f;
        float f16 = 0.25f * f13;
        boolean z3 = f5 > f7;
        if (Math.abs(f11) < Math.abs(f12)) {
            float fAbs = Math.abs(f13 / (f12 * 2.0f));
            if (z3) {
                f9 = fAbs + f7;
                f8 = f6;
            } else {
                f9 = fAbs + f5;
                f8 = f4;
            }
            f10 = this.f4262e;
        } else {
            float f17 = f13 / (f11 * 2.0f);
            if (z3) {
                f9 = f5;
                f8 = f17 + f4;
            } else {
                f8 = f6 - f17;
                f9 = f7;
            }
            f10 = this.f4261d;
        }
        float f18 = f16 * f10 * f10;
        float f19 = f14 - f8;
        float f20 = f15 - f9;
        float f21 = (f19 * f19) + (f20 * f20);
        float f22 = this.f4263f;
        float f23 = f16 * f22 * f22;
        if (f21 >= f18) {
            f18 = f21 > f23 ? f23 : IGoodView.DEFAULT_TO_ALPHA;
        }
        if (f18 != IGoodView.DEFAULT_TO_ALPHA) {
            float fSqrt = (float) Math.sqrt(f18 / f21);
            f8 = ((f8 - f14) * fSqrt) + f14;
            f9 = f15 + (fSqrt * (f9 - f15));
        }
        path.cubicTo((f4 + f8) / 2.0f, (f5 + f9) / 2.0f, (f8 + f6) / 2.0f, (f9 + f7) / 2.0f, f6, f7);
        return path;
    }

    @SuppressLint({"RestrictedApi"})
    public ArcMotion(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4258a = IGoodView.DEFAULT_TO_ALPHA;
        this.f4259b = IGoodView.DEFAULT_TO_ALPHA;
        this.f4260c = 70.0f;
        this.f4261d = IGoodView.DEFAULT_TO_ALPHA;
        this.f4262e = IGoodView.DEFAULT_TO_ALPHA;
        this.f4263f = f4257g;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0747s.f4467j);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        m3763c(C3369g.m10250f(typedArrayObtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, IGoodView.DEFAULT_TO_ALPHA));
        m3762b(C3369g.m10250f(typedArrayObtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, IGoodView.DEFAULT_TO_ALPHA));
        m3761a(C3369g.m10250f(typedArrayObtainStyledAttributes, xmlPullParser, "maximumAngle", 2, 70.0f));
        typedArrayObtainStyledAttributes.recycle();
    }
}
