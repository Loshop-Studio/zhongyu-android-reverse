package p070b.p074b.p075a.p076a.p096r;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.p031h.p041h.C0237d;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p070b.p071a.p072a.p073a.C0561a;
import p070b.p074b.p075a.p076a.p080c.C0570a;
import p070b.p074b.p075a.p076a.p098t.C0662a;

/* renamed from: b.b.a.a.r.c */
/* loaded from: classes.dex */
public final class C0648c {

    /* renamed from: A */
    public float f3878A;

    /* renamed from: B */
    public float f3879B;

    /* renamed from: C */
    public int[] f3880C;

    /* renamed from: D */
    public boolean f3881D;

    /* renamed from: E */
    public final TextPaint f3882E;

    /* renamed from: F */
    public final TextPaint f3883F;

    /* renamed from: G */
    public TimeInterpolator f3884G;

    /* renamed from: H */
    public TimeInterpolator f3885H;

    /* renamed from: I */
    public float f3886I;

    /* renamed from: J */
    public float f3887J;

    /* renamed from: K */
    public float f3888K;

    /* renamed from: L */
    public ColorStateList f3889L;

    /* renamed from: M */
    public StaticLayout f3890M;

    /* renamed from: N */
    public float f3891N;

    /* renamed from: O */
    public float f3892O;

    /* renamed from: P */
    public float f3893P;

    /* renamed from: Q */
    public CharSequence f3894Q;

    /* renamed from: a */
    public final View f3895a;

    /* renamed from: b */
    public boolean f3896b;

    /* renamed from: c */
    public float f3897c;

    /* renamed from: d */
    public final Rect f3898d;

    /* renamed from: e */
    public final Rect f3899e;

    /* renamed from: f */
    public final RectF f3900f;

    /* renamed from: g */
    public int f3901g = 16;

    /* renamed from: h */
    public int f3902h = 16;

    /* renamed from: i */
    public float f3903i = 15.0f;

    /* renamed from: j */
    public float f3904j = 15.0f;

    /* renamed from: k */
    public ColorStateList f3905k;

    /* renamed from: l */
    public ColorStateList f3906l;

    /* renamed from: m */
    public float f3907m;

    /* renamed from: n */
    public float f3908n;

    /* renamed from: o */
    public float f3909o;

    /* renamed from: p */
    public float f3910p;

    /* renamed from: q */
    public float f3911q;

    /* renamed from: r */
    public float f3912r;

    /* renamed from: s */
    public Typeface f3913s;

    /* renamed from: t */
    public Typeface f3914t;

    /* renamed from: u */
    public Typeface f3915u;

    /* renamed from: v */
    public C0662a f3916v;

    /* renamed from: w */
    public CharSequence f3917w;

    /* renamed from: x */
    public CharSequence f3918x;

    /* renamed from: y */
    public boolean f3919y;

    /* renamed from: z */
    public Bitmap f3920z;

    public C0648c(View view) {
        this.f3895a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f3882E = textPaint;
        this.f3883F = new TextPaint(textPaint);
        this.f3899e = new Rect();
        this.f3898d = new Rect();
        this.f3900f = new RectF();
    }

    /* renamed from: a */
    public static int m2242a(int i, int i2, float f2) {
        float f3 = 1.0f - f2;
        return Color.argb((int) ((Color.alpha(i2) * f2) + (Color.alpha(i) * f3)), (int) ((Color.red(i2) * f2) + (Color.red(i) * f3)), (int) ((Color.green(i2) * f2) + (Color.green(i) * f3)), (int) ((Color.blue(i2) * f2) + (Color.blue(i) * f3)));
    }

    /* renamed from: i */
    public static float m2243i(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        TimeInterpolator timeInterpolator2 = C0570a.f3534a;
        return C0561a.m2073a(f3, f2, f4, f2);
    }

    /* renamed from: l */
    public static boolean m2244l(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    /* renamed from: b */
    public float m2245b() {
        if (this.f3917w == null) {
            return 0.0f;
        }
        TextPaint textPaint = this.f3883F;
        textPaint.setTextSize(this.f3904j);
        textPaint.setTypeface(this.f3913s);
        TextPaint textPaint2 = this.f3883F;
        CharSequence charSequence = this.f3917w;
        return textPaint2.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: c */
    public final boolean m2246c(CharSequence charSequence) {
        View view = this.f3895a;
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        return ((C0237d.c) (view.getLayoutDirection() == 1 ? C0237d.f1547d : C0237d.f1546c)).m804b(charSequence, 0, charSequence.length());
    }

    /* renamed from: d */
    public final void m2247d(float f2) {
        TextPaint textPaint;
        int iM2250g;
        this.f3900f.left = m2243i(this.f3898d.left, this.f3899e.left, f2, this.f3884G);
        this.f3900f.top = m2243i(this.f3907m, this.f3908n, f2, this.f3884G);
        this.f3900f.right = m2243i(this.f3898d.right, this.f3899e.right, f2, this.f3884G);
        this.f3900f.bottom = m2243i(this.f3898d.bottom, this.f3899e.bottom, f2, this.f3884G);
        this.f3911q = m2243i(this.f3909o, this.f3910p, f2, this.f3884G);
        this.f3912r = m2243i(this.f3907m, this.f3908n, f2, this.f3884G);
        m2257p(m2243i(this.f3903i, this.f3904j, f2, this.f3885H));
        TimeInterpolator timeInterpolator = C0570a.f3535b;
        this.f3891N = 1.0f - m2243i(0.0f, 1.0f, 1.0f - f2, timeInterpolator);
        View view = this.f3895a;
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        view.postInvalidateOnAnimation();
        this.f3892O = m2243i(1.0f, 0.0f, f2, timeInterpolator);
        this.f3895a.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f3906l;
        ColorStateList colorStateList2 = this.f3905k;
        if (colorStateList != colorStateList2) {
            textPaint = this.f3882E;
            iM2250g = m2242a(m2251h(colorStateList2), m2250g(), f2);
        } else {
            textPaint = this.f3882E;
            iM2250g = m2250g();
        }
        textPaint.setColor(iM2250g);
        this.f3882E.setShadowLayer(m2243i(0.0f, this.f3886I, f2, null), m2243i(0.0f, this.f3887J, f2, null), m2243i(0.0f, this.f3888K, f2, null), m2242a(m2251h(null), m2251h(this.f3889L), f2));
        this.f3895a.postInvalidateOnAnimation();
    }

    /* renamed from: e */
    public final void m2248e(float f2) {
        boolean z;
        float f3;
        StaticLayout staticLayoutBuild;
        if (this.f3917w == null) {
            return;
        }
        float fWidth = this.f3899e.width();
        float fWidth2 = this.f3898d.width();
        if (Math.abs(f2 - this.f3904j) < 0.001f) {
            f3 = this.f3904j;
            this.f3878A = 1.0f;
            Typeface typeface = this.f3915u;
            Typeface typeface2 = this.f3913s;
            if (typeface != typeface2) {
                this.f3915u = typeface2;
                z = true;
            } else {
                z = false;
            }
        } else {
            float f4 = this.f3903i;
            Typeface typeface3 = this.f3915u;
            Typeface typeface4 = this.f3914t;
            if (typeface3 != typeface4) {
                this.f3915u = typeface4;
                z = true;
            } else {
                z = false;
            }
            if (Math.abs(f2 - f4) < 0.001f) {
                this.f3878A = 1.0f;
            } else {
                this.f3878A = f2 / this.f3903i;
            }
            float f5 = this.f3904j / this.f3903i;
            fWidth = fWidth2 * f5 > fWidth ? Math.min(fWidth / f5, fWidth2) : fWidth2;
            f3 = f4;
        }
        if (fWidth > 0.0f) {
            z = this.f3879B != f3 || this.f3881D || z;
            this.f3879B = f3;
            this.f3881D = false;
        }
        if (this.f3918x == null || z) {
            this.f3882E.setTextSize(this.f3879B);
            this.f3882E.setTypeface(this.f3915u);
            this.f3882E.setLinearText(this.f3878A != 1.0f);
            boolean zM2246c = m2246c(this.f3917w);
            this.f3919y = zM2246c;
            try {
                CharSequence charSequence = this.f3917w;
                TextPaint textPaint = this.f3882E;
                int length = charSequence.length();
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                int iMax = Math.max(0, (int) fWidth);
                CharSequence charSequenceEllipsize = TextUtils.ellipsize(charSequence, textPaint, iMax, truncateAt);
                int iMin = Math.min(charSequenceEllipsize.length(), length);
                if (zM2246c) {
                    alignment2 = Layout.Alignment.ALIGN_OPPOSITE;
                }
                StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
                builderObtain.setAlignment(alignment2);
                builderObtain.setIncludePad(false);
                builderObtain.setTextDirection(zM2246c ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
                if (truncateAt != null) {
                    builderObtain.setEllipsize(truncateAt);
                }
                builderObtain.setMaxLines(1);
                staticLayoutBuild = builderObtain.build();
            } catch (C0653h e2) {
                Log.e("CollapsingTextHelper", e2.getCause().getMessage(), e2);
                staticLayoutBuild = null;
            }
            Objects.requireNonNull(staticLayoutBuild);
            this.f3890M = staticLayoutBuild;
            this.f3918x = staticLayoutBuild.getText();
        }
    }

    /* renamed from: f */
    public float m2249f() {
        TextPaint textPaint = this.f3883F;
        textPaint.setTextSize(this.f3904j);
        textPaint.setTypeface(this.f3913s);
        return -this.f3883F.ascent();
    }

    /* renamed from: g */
    public int m2250g() {
        return m2251h(this.f3906l);
    }

    /* renamed from: h */
    public final int m2251h(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f3880C;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* renamed from: j */
    public void m2252j() {
        this.f3896b = this.f3899e.width() > 0 && this.f3899e.height() > 0 && this.f3898d.width() > 0 && this.f3898d.height() > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011e  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m2253k() {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p070b.p074b.p075a.p076a.p096r.C0648c.m2253k():void");
    }

    /* renamed from: m */
    public void m2254m(ColorStateList colorStateList) {
        if (this.f3906l != colorStateList) {
            this.f3906l = colorStateList;
            m2253k();
        }
    }

    /* renamed from: n */
    public void m2255n(int i) {
        if (this.f3902h != i) {
            this.f3902h = i;
            m2253k();
        }
    }

    /* renamed from: o */
    public void m2256o(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 != this.f3897c) {
            this.f3897c = f2;
            m2247d(f2);
        }
    }

    /* renamed from: p */
    public final void m2257p(float f2) {
        m2248e(f2);
        View view = this.f3895a;
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        view.postInvalidateOnAnimation();
    }

    /* renamed from: q */
    public void m2258q(Typeface typeface) {
        boolean z;
        C0662a c0662a = this.f3916v;
        boolean z2 = true;
        if (c0662a != null) {
            c0662a.f3961c = true;
        }
        if (this.f3913s != typeface) {
            this.f3913s = typeface;
            z = true;
        } else {
            z = false;
        }
        if (this.f3914t != typeface) {
            this.f3914t = typeface;
        } else {
            z2 = false;
        }
        if (z || z2) {
            m2253k();
        }
    }
}
