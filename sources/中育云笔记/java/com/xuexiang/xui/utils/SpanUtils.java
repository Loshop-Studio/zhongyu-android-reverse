package com.xuexiang.xui.utils;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.LineHeightSpan;
import android.text.style.MaskFilterSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ReplacementSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.text.style.UpdateAppearance;
import android.util.Log;
import androidx.core.content.ContextCompat;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import p420y7.AbstractC11916b;

/* loaded from: classes5.dex */
public final class SpanUtils {

    /* renamed from: e0 */
    public static final String f15208e0 = System.getProperty("line.separator");

    /* renamed from: A */
    public boolean f15209A;

    /* renamed from: B */
    public boolean f15210B;

    /* renamed from: C */
    public boolean f15211C;

    /* renamed from: D */
    public boolean f15212D;

    /* renamed from: E */
    public boolean f15213E;

    /* renamed from: F */
    public String f15214F;

    /* renamed from: G */
    public Typeface f15215G;

    /* renamed from: H */
    public Layout.Alignment f15216H;

    /* renamed from: I */
    public ClickableSpan f15217I;

    /* renamed from: J */
    public String f15218J;

    /* renamed from: K */
    public float f15219K;

    /* renamed from: L */
    public BlurMaskFilter.Blur f15220L;

    /* renamed from: M */
    public Shader f15221M;

    /* renamed from: N */
    public float f15222N;

    /* renamed from: O */
    public float f15223O;

    /* renamed from: P */
    public float f15224P;

    /* renamed from: Q */
    public int f15225Q;

    /* renamed from: R */
    public Object[] f15226R;

    /* renamed from: S */
    public Bitmap f15227S;

    /* renamed from: T */
    public Drawable f15228T;

    /* renamed from: U */
    public Uri f15229U;

    /* renamed from: V */
    public int f15230V;

    /* renamed from: W */
    public int f15231W;

    /* renamed from: X */
    public int f15232X;

    /* renamed from: Y */
    public int f15233Y;

    /* renamed from: a0 */
    public int f15236a0;

    /* renamed from: b */
    public int f15237b;

    /* renamed from: c */
    public int f15239c;

    /* renamed from: d */
    public int f15241d;

    /* renamed from: e */
    public int f15243e;

    /* renamed from: f */
    public int f15244f;

    /* renamed from: g */
    public int f15245g;

    /* renamed from: h */
    public int f15246h;

    /* renamed from: i */
    public int f15247i;

    /* renamed from: j */
    public int f15248j;

    /* renamed from: k */
    public int f15249k;

    /* renamed from: l */
    public int f15250l;

    /* renamed from: m */
    public int f15251m;

    /* renamed from: n */
    public int f15252n;

    /* renamed from: o */
    public Bitmap f15253o;

    /* renamed from: p */
    public Drawable f15254p;

    /* renamed from: q */
    public Uri f15255q;

    /* renamed from: r */
    public int f15256r;

    /* renamed from: s */
    public int f15257s;

    /* renamed from: t */
    public int f15258t;

    /* renamed from: u */
    public int f15259u;

    /* renamed from: v */
    public boolean f15260v;

    /* renamed from: w */
    public float f15261w;

    /* renamed from: x */
    public float f15262x;

    /* renamed from: y */
    public boolean f15263y;

    /* renamed from: z */
    public boolean f15264z;

    /* renamed from: b0 */
    public final int f15238b0 = 0;

    /* renamed from: c0 */
    public final int f15240c0 = 1;

    /* renamed from: d0 */
    public final int f15242d0 = 2;

    /* renamed from: Z */
    public SpannableStringBuilder f15234Z = new SpannableStringBuilder();

    /* renamed from: a */
    public CharSequence f15235a = "";

    @SuppressLint({"ParcelCreator"})
    public static class CustomTypefaceSpan extends TypefaceSpan {

        /* renamed from: c */
        public final Typeface f15265c;

        /* renamed from: a */
        public final void m12177a(Paint paint, Typeface typeface) {
            Typeface typeface2 = paint.getTypeface();
            int style = (typeface2 == null ? 0 : typeface2.getStyle()) & (~typeface.getStyle());
            if ((style & 1) != 0) {
                paint.setFakeBoldText(true);
            }
            if ((style & 2) != 0) {
                paint.setTextSkewX(-0.25f);
            }
            paint.getShader();
            paint.setTypeface(typeface);
        }

        @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            m12177a(textPaint, this.f15265c);
        }

        @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
        public void updateMeasureState(TextPaint textPaint) {
            m12177a(textPaint, this.f15265c);
        }

        public CustomTypefaceSpan(Typeface typeface) {
            super("");
            this.f15265c = typeface;
        }
    }

    /* renamed from: com.xuexiang.xui.utils.SpanUtils$b */
    public static class C8026b implements LeadingMarginSpan {

        /* renamed from: c */
        public final int f15266c;

        /* renamed from: d */
        public final int f15267d;

        /* renamed from: e */
        public final int f15268e;

        /* renamed from: f */
        public Path f15269f;

        @Override // android.text.style.LeadingMarginSpan
        public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
            if (((Spanned) charSequence).getSpanStart(this) == i15) {
                Paint.Style style = paint.getStyle();
                int color = paint.getColor();
                paint.setColor(this.f15266c);
                paint.setStyle(Paint.Style.FILL);
                if (canvas.isHardwareAccelerated()) {
                    if (this.f15269f == null) {
                        Path path = new Path();
                        this.f15269f = path;
                        path.addCircle(0.0f, 0.0f, this.f15267d, Path.Direction.CW);
                    }
                    canvas.save();
                    canvas.translate(i10 + (i11 * this.f15267d), (i12 + i14) / 2.0f);
                    canvas.drawPath(this.f15269f, paint);
                    canvas.restore();
                } else {
                    canvas.drawCircle(i10 + (i11 * r10), (i12 + i14) / 2.0f, this.f15267d, paint);
                }
                paint.setColor(color);
                paint.setStyle(style);
            }
        }

        @Override // android.text.style.LeadingMarginSpan
        public int getLeadingMargin(boolean z10) {
            return (this.f15267d * 2) + this.f15268e;
        }

        public C8026b(int i10, int i11, int i12) {
            this.f15269f = null;
            this.f15266c = i10;
            this.f15267d = i11;
            this.f15268e = i12;
        }
    }

    /* renamed from: com.xuexiang.xui.utils.SpanUtils$c */
    public static abstract class AbstractC8027c extends ReplacementSpan {

        /* renamed from: c */
        public final int f15270c;

        /* renamed from: d */
        public WeakReference f15271d;

        /* renamed from: a */
        public final Drawable m12178a() {
            WeakReference weakReference = this.f15271d;
            if ((weakReference != null ? (Drawable) weakReference.get() : null) == null) {
                this.f15271d = new WeakReference(mo12179b());
            }
            return mo12179b();
        }

        /* renamed from: b */
        public abstract Drawable mo12179b();

        @Override // android.text.style.ReplacementSpan
        public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
            float f11;
            float fHeight;
            Drawable drawableM12178a = m12178a();
            Rect bounds = drawableM12178a.getBounds();
            canvas.save();
            float f12 = paint.getFontMetrics().descent - paint.getFontMetrics().ascent;
            int i15 = i14 - bounds.bottom;
            if (bounds.height() < f12) {
                int i16 = this.f15270c;
                if (i16 == 1) {
                    i15 -= paint.getFontMetricsInt().descent;
                } else {
                    if (i16 == 2) {
                        f11 = i15;
                        fHeight = (f12 - bounds.height()) / 2.0f;
                    } else if (i16 == 3) {
                        f11 = i15;
                        fHeight = f12 - bounds.height();
                    }
                    i15 = (int) (f11 - fHeight);
                }
            }
            canvas.translate(f10, i15);
            drawableM12178a.draw(canvas);
            canvas.restore();
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
            Rect bounds = m12178a().getBounds();
            int i12 = (int) (paint.getFontMetrics().descent - paint.getFontMetrics().ascent);
            if (fontMetricsInt != null && bounds.height() > i12) {
                int i13 = this.f15270c;
                if (i13 == 3) {
                    fontMetricsInt.descent += bounds.height() - i12;
                } else if (i13 == 2) {
                    fontMetricsInt.ascent -= (bounds.height() - i12) / 2;
                    fontMetricsInt.descent += (bounds.height() - i12) / 2;
                } else {
                    fontMetricsInt.ascent -= bounds.height() - i12;
                }
            }
            return bounds.right;
        }

        public AbstractC8027c(int i10) {
            this.f15270c = i10;
        }
    }

    /* renamed from: com.xuexiang.xui.utils.SpanUtils$f */
    public static class C8030f extends CharacterStyle implements LineHeightSpan {

        /* renamed from: c */
        public final int f15284c;

        /* renamed from: d */
        public final int f15285d;

        public C8030f(int i10, int i11) {
            this.f15284c = i10;
            this.f15285d = i11;
        }

        @Override // android.text.style.LineHeightSpan
        public void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
            int i14 = this.f15284c;
            int i15 = fontMetricsInt.descent;
            int i16 = fontMetricsInt.ascent;
            int i17 = i14 - (((i13 + i15) - i16) - i12);
            if (i17 > 0) {
                int i18 = this.f15285d;
                if (i18 == 3) {
                    fontMetricsInt.descent = i15 + i17;
                } else if (i18 == 2) {
                    int i19 = i17 / 2;
                    fontMetricsInt.descent = i15 + i19;
                    fontMetricsInt.ascent = i16 - i19;
                } else {
                    fontMetricsInt.ascent = i16 - i17;
                }
            }
            int i20 = fontMetricsInt.bottom;
            int i21 = fontMetricsInt.top;
            int i22 = i14 - (((i13 + i20) - i21) - i12);
            if (i22 > 0) {
                int i23 = this.f15285d;
                if (i23 == 3) {
                    fontMetricsInt.top = i21 + i22;
                } else {
                    if (i23 != 2) {
                        fontMetricsInt.top = i21 - i22;
                        return;
                    }
                    int i24 = i22 / 2;
                    fontMetricsInt.bottom = i20 + i24;
                    fontMetricsInt.top = i21 - i24;
                }
            }
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
        }
    }

    /* renamed from: com.xuexiang.xui.utils.SpanUtils$g */
    public static class C8031g implements LeadingMarginSpan {

        /* renamed from: c */
        public final int f15286c;

        /* renamed from: d */
        public final int f15287d;

        /* renamed from: e */
        public final int f15288e;

        @Override // android.text.style.LeadingMarginSpan
        public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
            Paint.Style style = paint.getStyle();
            int color = paint.getColor();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(this.f15286c);
            canvas.drawRect(i10, i12, i10 + (i11 * this.f15287d), i14, paint);
            paint.setStyle(style);
            paint.setColor(color);
        }

        @Override // android.text.style.LeadingMarginSpan
        public int getLeadingMargin(boolean z10) {
            return this.f15287d + this.f15288e;
        }

        public C8031g(int i10, int i11, int i12) {
            this.f15286c = i10;
            this.f15287d = i11;
            this.f15288e = i12;
        }
    }

    /* renamed from: com.xuexiang.xui.utils.SpanUtils$h */
    public static class C8032h extends CharacterStyle implements UpdateAppearance {

        /* renamed from: c */
        public Shader f15289c;

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setShader(this.f15289c);
        }

        public C8032h(Shader shader) {
            this.f15289c = shader;
        }
    }

    /* renamed from: com.xuexiang.xui.utils.SpanUtils$i */
    public static class C8033i extends CharacterStyle implements UpdateAppearance {

        /* renamed from: c */
        public float f15290c;

        /* renamed from: d */
        public float f15291d;

        /* renamed from: e */
        public float f15292e;

        /* renamed from: f */
        public int f15293f;

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setShadowLayer(this.f15290c, this.f15291d, this.f15292e, this.f15293f);
        }

        public C8033i(float f10, float f11, float f12, int i10) {
            this.f15290c = f10;
            this.f15291d = f11;
            this.f15292e = f12;
            this.f15293f = i10;
        }
    }

    /* renamed from: com.xuexiang.xui.utils.SpanUtils$j */
    public static class C8034j extends ReplacementSpan {

        /* renamed from: c */
        public final int f15294c;

        /* renamed from: d */
        public final int f15295d;

        @Override // android.text.style.ReplacementSpan
        public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
            Paint.Style style = paint.getStyle();
            int color = paint.getColor();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(this.f15295d);
            canvas.drawRect(f10, i12, f10 + this.f15294c, i14, paint);
            paint.setStyle(style);
            paint.setColor(color);
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
            return this.f15294c;
        }

        public C8034j(int i10, int i11) {
            this.f15294c = i10;
            this.f15295d = i11;
        }
    }

    public SpanUtils() {
        m12173h();
    }

    /* renamed from: a */
    public SpanUtils m12166a(CharSequence charSequence) {
        m12169d(0);
        this.f15235a = charSequence;
        return this;
    }

    /* renamed from: b */
    public SpanUtils m12167b(Drawable drawable, int i10) {
        m12169d(1);
        this.f15228T = drawable;
        this.f15231W = i10;
        return this;
    }

    /* renamed from: c */
    public SpanUtils m12168c(int i10, int i11) {
        m12169d(2);
        this.f15232X = i10;
        this.f15233Y = i11;
        return this;
    }

    /* renamed from: d */
    public final void m12169d(int i10) {
        m12170e();
        this.f15236a0 = i10;
    }

    /* renamed from: e */
    public final void m12170e() {
        int i10 = this.f15236a0;
        if (i10 == 0) {
            m12174i();
        } else if (i10 == 1) {
            m12175j();
        } else if (i10 == 2) {
            m12176k();
        }
        m12173h();
    }

    /* renamed from: f */
    public SpannableStringBuilder m12171f() {
        m12170e();
        return this.f15234Z;
    }

    /* renamed from: g */
    public SpanUtils m12172g(int i10) {
        this.f15241d = i10;
        return this;
    }

    /* renamed from: h */
    public final void m12173h() {
        this.f15237b = 33;
        this.f15239c = -16777217;
        this.f15241d = -16777217;
        this.f15243e = -1;
        this.f15245g = -16777217;
        this.f15248j = -1;
        this.f15250l = -16777217;
        this.f15253o = null;
        this.f15254p = null;
        this.f15255q = null;
        this.f15256r = -1;
        this.f15257s = -1;
        this.f15259u = -1;
        this.f15261w = -1.0f;
        this.f15262x = -1.0f;
        this.f15263y = false;
        this.f15264z = false;
        this.f15209A = false;
        this.f15210B = false;
        this.f15211C = false;
        this.f15212D = false;
        this.f15213E = false;
        this.f15214F = null;
        this.f15215G = null;
        this.f15216H = null;
        this.f15217I = null;
        this.f15218J = null;
        this.f15219K = -1.0f;
        this.f15221M = null;
        this.f15222N = -1.0f;
        this.f15226R = null;
        this.f15227S = null;
        this.f15228T = null;
        this.f15229U = null;
        this.f15230V = -1;
        this.f15232X = -1;
    }

    /* renamed from: i */
    public final void m12174i() {
        if (this.f15235a.length() == 0) {
            return;
        }
        int length = this.f15234Z.length();
        this.f15234Z.append(this.f15235a);
        int length2 = this.f15234Z.length();
        if (this.f15239c != -16777217) {
            this.f15234Z.setSpan(new ForegroundColorSpan(this.f15239c), length, length2, this.f15237b);
        }
        if (this.f15241d != -16777217) {
            this.f15234Z.setSpan(new BackgroundColorSpan(this.f15241d), length, length2, this.f15237b);
        }
        if (this.f15248j != -1) {
            this.f15234Z.setSpan(new LeadingMarginSpan.Standard(this.f15248j, this.f15249k), length, length2, this.f15237b);
        }
        int i10 = this.f15245g;
        if (i10 != -16777217) {
            this.f15234Z.setSpan(new C8031g(i10, this.f15246h, this.f15247i), length, length2, this.f15237b);
        }
        int i11 = this.f15250l;
        if (i11 != -16777217) {
            this.f15234Z.setSpan(new C8026b(i11, this.f15251m, this.f15252n), length, length2, this.f15237b);
        }
        int i12 = this.f15257s;
        if (i12 != -1) {
            Bitmap bitmap = this.f15253o;
            if (bitmap != null) {
                this.f15234Z.setSpan(new C8028d(bitmap, i12, this.f15258t), length, length2, this.f15237b);
            } else {
                Drawable drawable = this.f15254p;
                if (drawable != null) {
                    this.f15234Z.setSpan(new C8028d(drawable, i12, this.f15258t), length, length2, this.f15237b);
                } else {
                    Uri uri = this.f15255q;
                    if (uri != null) {
                        this.f15234Z.setSpan(new C8028d(uri, i12, this.f15258t), length, length2, this.f15237b);
                    } else {
                        int i13 = this.f15256r;
                        if (i13 != -1) {
                            this.f15234Z.setSpan(new C8028d(i13, i12, this.f15258t), length, length2, this.f15237b);
                        }
                    }
                }
            }
        }
        if (this.f15259u != -1) {
            this.f15234Z.setSpan(new AbsoluteSizeSpan(this.f15259u, this.f15260v), length, length2, this.f15237b);
        }
        if (this.f15261w != -1.0f) {
            this.f15234Z.setSpan(new RelativeSizeSpan(this.f15261w), length, length2, this.f15237b);
        }
        if (this.f15262x != -1.0f) {
            this.f15234Z.setSpan(new ScaleXSpan(this.f15262x), length, length2, this.f15237b);
        }
        if (this.f15243e != -1) {
            this.f15234Z.setSpan(new C8030f(this.f15243e, this.f15244f), length, length2, this.f15237b);
        }
        if (this.f15263y) {
            this.f15234Z.setSpan(new StrikethroughSpan(), length, length2, this.f15237b);
        }
        if (this.f15264z) {
            this.f15234Z.setSpan(new UnderlineSpan(), length, length2, this.f15237b);
        }
        if (this.f15209A) {
            this.f15234Z.setSpan(new SuperscriptSpan(), length, length2, this.f15237b);
        }
        if (this.f15210B) {
            this.f15234Z.setSpan(new SubscriptSpan(), length, length2, this.f15237b);
        }
        if (this.f15211C) {
            this.f15234Z.setSpan(new StyleSpan(1), length, length2, this.f15237b);
        }
        if (this.f15212D) {
            this.f15234Z.setSpan(new StyleSpan(2), length, length2, this.f15237b);
        }
        if (this.f15213E) {
            this.f15234Z.setSpan(new StyleSpan(3), length, length2, this.f15237b);
        }
        if (this.f15214F != null) {
            this.f15234Z.setSpan(new TypefaceSpan(this.f15214F), length, length2, this.f15237b);
        }
        if (this.f15215G != null) {
            this.f15234Z.setSpan(new CustomTypefaceSpan(this.f15215G), length, length2, this.f15237b);
        }
        if (this.f15216H != null) {
            this.f15234Z.setSpan(new AlignmentSpan.Standard(this.f15216H), length, length2, this.f15237b);
        }
        ClickableSpan clickableSpan = this.f15217I;
        if (clickableSpan != null) {
            this.f15234Z.setSpan(clickableSpan, length, length2, this.f15237b);
        }
        if (this.f15218J != null) {
            this.f15234Z.setSpan(new URLSpan(this.f15218J), length, length2, this.f15237b);
        }
        if (this.f15219K != -1.0f) {
            this.f15234Z.setSpan(new MaskFilterSpan(new BlurMaskFilter(this.f15219K, this.f15220L)), length, length2, this.f15237b);
        }
        if (this.f15221M != null) {
            this.f15234Z.setSpan(new C8032h(this.f15221M), length, length2, this.f15237b);
        }
        if (this.f15222N != -1.0f) {
            this.f15234Z.setSpan(new C8033i(this.f15222N, this.f15223O, this.f15224P, this.f15225Q), length, length2, this.f15237b);
        }
        Object[] objArr = this.f15226R;
        if (objArr != null) {
            for (Object obj : objArr) {
                this.f15234Z.setSpan(obj, length, length2, this.f15237b);
            }
        }
    }

    /* renamed from: j */
    public final void m12175j() {
        int length = this.f15234Z.length();
        this.f15234Z.append((CharSequence) "<img>");
        int i10 = length + 5;
        if (this.f15227S != null) {
            this.f15234Z.setSpan(new C8029e(this.f15227S, this.f15231W), length, i10, this.f15237b);
            return;
        }
        if (this.f15228T != null) {
            this.f15234Z.setSpan(new C8029e(this.f15228T, this.f15231W), length, i10, this.f15237b);
        } else if (this.f15229U != null) {
            this.f15234Z.setSpan(new C8029e(this.f15229U, this.f15231W), length, i10, this.f15237b);
        } else if (this.f15230V != -1) {
            this.f15234Z.setSpan(new C8029e(this.f15230V, this.f15231W), length, i10, this.f15237b);
        }
    }

    /* renamed from: k */
    public final void m12176k() {
        int length = this.f15234Z.length();
        this.f15234Z.append((CharSequence) "< >");
        this.f15234Z.setSpan(new C8034j(this.f15232X, this.f15233Y), length, length + 3, this.f15237b);
    }

    /* renamed from: com.xuexiang.xui.utils.SpanUtils$d */
    public static class C8028d implements LeadingMarginSpan, LineHeightSpan {

        /* renamed from: c */
        public Bitmap f15272c;

        /* renamed from: d */
        public final int f15273d;

        /* renamed from: e */
        public int f15274e;

        /* renamed from: f */
        public int f15275f;

        /* renamed from: g */
        public int f15276g;

        /* renamed from: h */
        public int f15277h;

        /* renamed from: i */
        public int f15278i;

        /* renamed from: j */
        public boolean f15279j;

        /* renamed from: a */
        public final Bitmap m12180a(Drawable drawable) {
            Bitmap bitmapCreateBitmap;
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                if (bitmapDrawable.getBitmap() != null) {
                    return bitmapDrawable.getBitmap();
                }
            }
            if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
                bitmapCreateBitmap = Bitmap.createBitmap(1, 1, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            }
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        }

        /* renamed from: b */
        public final Bitmap m12181b(int i10) {
            Drawable drawable = ContextCompat.getDrawable(AbstractC11916b.m26458b(), i10);
            if (drawable == null) {
                return null;
            }
            Canvas canvas = new Canvas();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            canvas.setBitmap(bitmapCreateBitmap);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        }

        /* renamed from: c */
        public final Bitmap m12182c(Uri uri) {
            try {
                return MediaStore.Images.Media.getBitmap(AbstractC11916b.m26458b().getContentResolver(), uri);
            } catch (IOException e10) {
                e10.printStackTrace();
                return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            }
        }

        @Override // android.text.style.LineHeightSpan
        public void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
            if (this.f15276g == 0) {
                this.f15276g = i13 - i12;
            }
            if (this.f15277h == 0 && i11 == ((Spanned) charSequence).getSpanEnd(this)) {
                int height = this.f15272c.getHeight();
                this.f15277h = height - (((fontMetricsInt.descent + i13) - fontMetricsInt.ascent) - i12);
                this.f15278i = height - (((fontMetricsInt.bottom + i13) - fontMetricsInt.top) - i12);
                this.f15275f = (i13 - i12) + this.f15276g;
                return;
            }
            if (this.f15277h > 0 || this.f15278i > 0) {
                int i14 = this.f15273d;
                if (i14 == 3) {
                    if (i11 == ((Spanned) charSequence).getSpanEnd(this)) {
                        int i15 = this.f15277h;
                        if (i15 > 0) {
                            fontMetricsInt.descent += i15;
                        }
                        int i16 = this.f15278i;
                        if (i16 > 0) {
                            fontMetricsInt.bottom += i16;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i14 != 2) {
                    if (i10 == ((Spanned) charSequence).getSpanStart(this)) {
                        int i17 = this.f15277h;
                        if (i17 > 0) {
                            fontMetricsInt.ascent -= i17;
                        }
                        int i18 = this.f15278i;
                        if (i18 > 0) {
                            fontMetricsInt.top -= i18;
                            return;
                        }
                        return;
                    }
                    if (this.f15279j) {
                        return;
                    }
                    int i19 = this.f15277h;
                    if (i19 > 0) {
                        fontMetricsInt.ascent += i19;
                    }
                    int i20 = this.f15278i;
                    if (i20 > 0) {
                        fontMetricsInt.top += i20;
                    }
                    this.f15279j = true;
                    return;
                }
                Spanned spanned = (Spanned) charSequence;
                if (i10 == spanned.getSpanStart(this)) {
                    int i21 = this.f15277h;
                    if (i21 > 0) {
                        fontMetricsInt.ascent -= i21 / 2;
                    }
                    int i22 = this.f15278i;
                    if (i22 > 0) {
                        fontMetricsInt.top -= i22 / 2;
                    }
                } else if (!this.f15279j) {
                    int i23 = this.f15277h;
                    if (i23 > 0) {
                        fontMetricsInt.ascent += i23 / 2;
                    }
                    int i24 = this.f15278i;
                    if (i24 > 0) {
                        fontMetricsInt.top += i24 / 2;
                    }
                    this.f15279j = true;
                }
                if (i11 == spanned.getSpanEnd(this)) {
                    int i25 = this.f15277h;
                    if (i25 > 0) {
                        fontMetricsInt.descent += i25 / 2;
                    }
                    int i26 = this.f15278i;
                    if (i26 > 0) {
                        fontMetricsInt.bottom += i26 / 2;
                    }
                }
            }
        }

        @Override // android.text.style.LeadingMarginSpan
        public void drawLeadingMargin(Canvas canvas, Paint paint, int i10, int i11, int i12, int i13, int i14, CharSequence charSequence, int i15, int i16, boolean z10, Layout layout) {
            int lineTop = layout.getLineTop(layout.getLineForOffset(((Spanned) charSequence).getSpanStart(this)));
            if (i11 < 0) {
                i10 -= this.f15272c.getWidth();
            }
            int height = this.f15275f - this.f15272c.getHeight();
            if (height <= 0) {
                canvas.drawBitmap(this.f15272c, i10, lineTop, paint);
                return;
            }
            int i17 = this.f15273d;
            if (i17 == 3) {
                canvas.drawBitmap(this.f15272c, i10, lineTop, paint);
            } else if (i17 == 2) {
                canvas.drawBitmap(this.f15272c, i10, lineTop + (height / 2.0f), paint);
            } else {
                canvas.drawBitmap(this.f15272c, i10, lineTop + height, paint);
            }
        }

        @Override // android.text.style.LeadingMarginSpan
        public int getLeadingMargin(boolean z10) {
            return this.f15272c.getWidth() + this.f15274e;
        }

        public C8028d(Bitmap bitmap, int i10, int i11) {
            this.f15272c = bitmap;
            this.f15274e = i10;
            this.f15273d = i11;
        }

        public C8028d(Drawable drawable, int i10, int i11) {
            this.f15272c = m12180a(drawable);
            this.f15274e = i10;
            this.f15273d = i11;
        }

        public C8028d(Uri uri, int i10, int i11) {
            this.f15272c = m12182c(uri);
            this.f15274e = i10;
            this.f15273d = i11;
        }

        public C8028d(int i10, int i11, int i12) {
            this.f15272c = m12181b(i10);
            this.f15274e = i11;
            this.f15273d = i12;
        }
    }

    /* renamed from: com.xuexiang.xui.utils.SpanUtils$e */
    public class C8029e extends AbstractC8027c {

        /* renamed from: e */
        public Drawable f15280e;

        /* renamed from: f */
        public Uri f15281f;

        /* renamed from: g */
        public int f15282g;

        @Override // com.xuexiang.xui.utils.SpanUtils.AbstractC8027c
        /* renamed from: b */
        public Drawable mo12179b() throws IOException {
            Drawable drawable = this.f15280e;
            if (drawable != null) {
                return drawable;
            }
            Drawable drawable2 = null;
            if (this.f15281f != null) {
                try {
                    InputStream inputStreamOpenInputStream = AbstractC11916b.m26458b().getContentResolver().openInputStream(this.f15281f);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(AbstractC11916b.m26458b().getResources(), BitmapFactory.decodeStream(inputStreamOpenInputStream));
                    try {
                        bitmapDrawable.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), bitmapDrawable.getIntrinsicHeight());
                        if (inputStreamOpenInputStream == null) {
                            return bitmapDrawable;
                        }
                        inputStreamOpenInputStream.close();
                        return bitmapDrawable;
                    } catch (Exception e10) {
                        e = e10;
                        drawable2 = bitmapDrawable;
                        Log.e("sms", "Failed to loaded content " + this.f15281f, e);
                        return drawable2;
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } else {
                try {
                    drawable2 = ContextCompat.getDrawable(AbstractC11916b.m26458b(), this.f15282g);
                    drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
                    return drawable2;
                } catch (Exception unused) {
                    Log.e("sms", "Unable to find resource: " + this.f15282g);
                }
            }
            return drawable2;
        }

        public C8029e(Bitmap bitmap, int i10) {
            super(i10);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(AbstractC11916b.m26458b().getResources(), bitmap);
            this.f15280e = bitmapDrawable;
            bitmapDrawable.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), this.f15280e.getIntrinsicHeight());
        }

        public C8029e(Drawable drawable, int i10) {
            super(i10);
            this.f15280e = drawable;
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f15280e.getIntrinsicHeight());
        }

        public C8029e(Uri uri, int i10) {
            super(i10);
            this.f15281f = uri;
        }

        public C8029e(int i10, int i11) {
            super(i11);
            this.f15282g = i10;
        }
    }
}
