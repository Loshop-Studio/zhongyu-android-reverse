package com.caverock.androidsvg;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Base64;
import android.util.Log;
import androidx.core.view.ViewCompat;
import com.caverock.androidsvg.CSSParser;
import com.caverock.androidsvg.PreserveAspectRatio;
import com.caverock.androidsvg.SVG;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;

/* renamed from: com.caverock.androidsvg.b */
/* loaded from: classes3.dex */
public class C4824b {

    /* renamed from: i */
    public static HashSet f3151i;

    /* renamed from: a */
    public Canvas f3152a;

    /* renamed from: b */
    public float f3153b;

    /* renamed from: c */
    public SVG f3154c;

    /* renamed from: d */
    public h f3155d;

    /* renamed from: e */
    public Stack f3156e;

    /* renamed from: f */
    public Stack f3157f;

    /* renamed from: g */
    public Stack f3158g;

    /* renamed from: h */
    public CSSParser.C4756m f3159h = null;

    /* renamed from: com.caverock.androidsvg.b$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3160a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f3161b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f3162c;

        static {
            int[] iArr = new int[SVG.Style.LineJoin.values().length];
            f3162c = iArr;
            try {
                iArr[SVG.Style.LineJoin.Miter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3162c[SVG.Style.LineJoin.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3162c[SVG.Style.LineJoin.Bevel.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[SVG.Style.LineCap.values().length];
            f3161b = iArr2;
            try {
                iArr2[SVG.Style.LineCap.Butt.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3161b[SVG.Style.LineCap.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3161b[SVG.Style.LineCap.Square.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[PreserveAspectRatio.Alignment.values().length];
            f3160a = iArr3;
            try {
                iArr3[PreserveAspectRatio.Alignment.xMidYMin.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3160a[PreserveAspectRatio.Alignment.xMidYMid.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3160a[PreserveAspectRatio.Alignment.xMidYMax.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3160a[PreserveAspectRatio.Alignment.xMaxYMin.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3160a[PreserveAspectRatio.Alignment.xMaxYMid.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f3160a[PreserveAspectRatio.Alignment.xMaxYMax.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f3160a[PreserveAspectRatio.Alignment.xMinYMid.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f3160a[PreserveAspectRatio.Alignment.xMinYMax.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    /* renamed from: com.caverock.androidsvg.b$b */
    public class b implements SVG.InterfaceC4807w {

        /* renamed from: b */
        public float f3164b;

        /* renamed from: c */
        public float f3165c;

        /* renamed from: h */
        public boolean f3170h;

        /* renamed from: a */
        public List f3163a = new ArrayList();

        /* renamed from: d */
        public c f3166d = null;

        /* renamed from: e */
        public boolean f3167e = false;

        /* renamed from: f */
        public boolean f3168f = true;

        /* renamed from: g */
        public int f3169g = -1;

        public b(SVG.C4805v c4805v) {
            if (c4805v == null) {
                return;
            }
            c4805v.m3033e(this);
            if (this.f3170h) {
                this.f3166d.m3297b((c) this.f3163a.get(this.f3169g));
                this.f3163a.set(this.f3169g, this.f3166d);
                this.f3170h = false;
            }
            c cVar = this.f3166d;
            if (cVar != null) {
                this.f3163a.add(cVar);
            }
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC4807w
        /* renamed from: a */
        public void mo3029a(float f6, float f7, float f8, float f9) {
            this.f3166d.m3296a(f6, f7);
            this.f3163a.add(this.f3166d);
            this.f3166d = C4824b.this.new c(f8, f9, f8 - f6, f9 - f7);
            this.f3170h = false;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC4807w
        /* renamed from: b */
        public void mo3030b(float f6, float f7, float f8, boolean z6, boolean z7, float f9, float f10) {
            this.f3167e = true;
            this.f3168f = false;
            c cVar = this.f3166d;
            C4824b.m3201h(cVar.f3172a, cVar.f3173b, f6, f7, f8, z6, z7, f9, f10, this);
            this.f3168f = true;
            this.f3170h = false;
        }

        /* renamed from: c */
        public List m3295c() {
            return this.f3163a;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC4807w
        public void close() {
            this.f3163a.add(this.f3166d);
            lineTo(this.f3164b, this.f3165c);
            this.f3170h = true;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC4807w
        public void cubicTo(float f6, float f7, float f8, float f9, float f10, float f11) {
            if (this.f3168f || this.f3167e) {
                this.f3166d.m3296a(f6, f7);
                this.f3163a.add(this.f3166d);
                this.f3167e = false;
            }
            this.f3166d = C4824b.this.new c(f10, f11, f10 - f8, f11 - f9);
            this.f3170h = false;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC4807w
        public void lineTo(float f6, float f7) {
            this.f3166d.m3296a(f6, f7);
            this.f3163a.add(this.f3166d);
            C4824b c4824b = C4824b.this;
            c cVar = this.f3166d;
            this.f3166d = c4824b.new c(f6, f7, f6 - cVar.f3172a, f7 - cVar.f3173b);
            this.f3170h = false;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC4807w
        public void moveTo(float f6, float f7) {
            if (this.f3170h) {
                this.f3166d.m3297b((c) this.f3163a.get(this.f3169g));
                this.f3163a.set(this.f3169g, this.f3166d);
                this.f3170h = false;
            }
            c cVar = this.f3166d;
            if (cVar != null) {
                this.f3163a.add(cVar);
            }
            this.f3164b = f6;
            this.f3165c = f7;
            this.f3166d = C4824b.this.new c(f6, f7, 0.0f, 0.0f);
            this.f3169g = this.f3163a.size();
        }
    }

    /* renamed from: com.caverock.androidsvg.b$c */
    public class c {

        /* renamed from: a */
        public float f3172a;

        /* renamed from: b */
        public float f3173b;

        /* renamed from: c */
        public float f3174c;

        /* renamed from: d */
        public float f3175d;

        /* renamed from: e */
        public boolean f3176e = false;

        public c(float f6, float f7, float f8, float f9) {
            this.f3174c = 0.0f;
            this.f3175d = 0.0f;
            this.f3172a = f6;
            this.f3173b = f7;
            double dSqrt = Math.sqrt((f8 * f8) + (f9 * f9));
            if (dSqrt != 0.0d) {
                this.f3174c = (float) (f8 / dSqrt);
                this.f3175d = (float) (f9 / dSqrt);
            }
        }

        /* renamed from: a */
        public void m3296a(float f6, float f7) {
            float f8 = f6 - this.f3172a;
            float f9 = f7 - this.f3173b;
            double dSqrt = Math.sqrt((f8 * f8) + (f9 * f9));
            if (dSqrt != 0.0d) {
                f8 = (float) (f8 / dSqrt);
                f9 = (float) (f9 / dSqrt);
            }
            float f10 = this.f3174c;
            if (f8 != (-f10) || f9 != (-this.f3175d)) {
                this.f3174c = f10 + f8;
                this.f3175d += f9;
            } else {
                this.f3176e = true;
                this.f3174c = -f9;
                this.f3175d = f8;
            }
        }

        /* renamed from: b */
        public void m3297b(c cVar) {
            float f6 = cVar.f3174c;
            float f7 = this.f3174c;
            if (f6 == (-f7)) {
                float f8 = cVar.f3175d;
                if (f8 == (-this.f3175d)) {
                    this.f3176e = true;
                    this.f3174c = -f8;
                    this.f3175d = cVar.f3174c;
                    return;
                }
            }
            this.f3174c = f7 + f6;
            this.f3175d += cVar.f3175d;
        }

        public String toString() {
            return "(" + this.f3172a + "," + this.f3173b + " " + this.f3174c + "," + this.f3175d + ")";
        }
    }

    /* renamed from: com.caverock.androidsvg.b$d */
    public class d implements SVG.InterfaceC4807w {

        /* renamed from: a */
        public Path f3178a = new Path();

        /* renamed from: b */
        public float f3179b;

        /* renamed from: c */
        public float f3180c;

        public d(SVG.C4805v c4805v) {
            if (c4805v == null) {
                return;
            }
            c4805v.m3033e(this);
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC4807w
        /* renamed from: a */
        public void mo3029a(float f6, float f7, float f8, float f9) {
            this.f3178a.quadTo(f6, f7, f8, f9);
            this.f3179b = f8;
            this.f3180c = f9;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC4807w
        /* renamed from: b */
        public void mo3030b(float f6, float f7, float f8, boolean z6, boolean z7, float f9, float f10) {
            C4824b.m3201h(this.f3179b, this.f3180c, f6, f7, f8, z6, z7, f9, f10, this);
            this.f3179b = f9;
            this.f3180c = f10;
        }

        /* renamed from: c */
        public Path m3298c() {
            return this.f3178a;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC4807w
        public void close() {
            this.f3178a.close();
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC4807w
        public void cubicTo(float f6, float f7, float f8, float f9, float f10, float f11) {
            this.f3178a.cubicTo(f6, f7, f8, f9, f10, f11);
            this.f3179b = f10;
            this.f3180c = f11;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC4807w
        public void lineTo(float f6, float f7) {
            this.f3178a.lineTo(f6, f7);
            this.f3179b = f6;
            this.f3180c = f7;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC4807w
        public void moveTo(float f6, float f7) {
            this.f3178a.moveTo(f6, f7);
            this.f3179b = f6;
            this.f3180c = f7;
        }
    }

    /* renamed from: com.caverock.androidsvg.b$e */
    public class e extends f {

        /* renamed from: e */
        public Path f3182e;

        public e(Path path, float f6, float f7) {
            super(f6, f7);
            this.f3182e = path;
        }

        @Override // com.caverock.androidsvg.C4824b.f, com.caverock.androidsvg.C4824b.j
        /* renamed from: b */
        public void mo3299b(String str) {
            String str2;
            if (C4824b.this.m3254Y0()) {
                if (C4824b.this.f3155d.f3192b) {
                    str2 = str;
                    C4824b.this.f3152a.drawTextOnPath(str2, this.f3182e, this.f3184b, this.f3185c, C4824b.this.f3155d.f3194d);
                } else {
                    str2 = str;
                }
                if (C4824b.this.f3155d.f3193c) {
                    C4824b.this.f3152a.drawTextOnPath(str2, this.f3182e, this.f3184b, this.f3185c, C4824b.this.f3155d.f3195e);
                }
            } else {
                str2 = str;
            }
            this.f3184b += C4824b.this.f3155d.f3194d.measureText(str2);
        }
    }

    /* renamed from: com.caverock.androidsvg.b$f */
    public class f extends j {

        /* renamed from: b */
        public float f3184b;

        /* renamed from: c */
        public float f3185c;

        public f(float f6, float f7) {
            super(C4824b.this, null);
            this.f3184b = f6;
            this.f3185c = f7;
        }

        @Override // com.caverock.androidsvg.C4824b.j
        /* renamed from: b */
        public void mo3299b(String str) {
            C4824b.m3206y("TextSequence render", new Object[0]);
            if (C4824b.this.m3254Y0()) {
                if (C4824b.this.f3155d.f3192b) {
                    C4824b.this.f3152a.drawText(str, this.f3184b, this.f3185c, C4824b.this.f3155d.f3194d);
                }
                if (C4824b.this.f3155d.f3193c) {
                    C4824b.this.f3152a.drawText(str, this.f3184b, this.f3185c, C4824b.this.f3155d.f3195e);
                }
            }
            this.f3184b += C4824b.this.f3155d.f3194d.measureText(str);
        }
    }

    /* renamed from: com.caverock.androidsvg.b$g */
    public class g extends j {

        /* renamed from: b */
        public float f3187b;

        /* renamed from: c */
        public float f3188c;

        /* renamed from: d */
        public Path f3189d;

        public g(float f6, float f7, Path path) {
            super(C4824b.this, null);
            this.f3187b = f6;
            this.f3188c = f7;
            this.f3189d = path;
        }

        @Override // com.caverock.androidsvg.C4824b.j
        /* renamed from: a */
        public boolean mo3300a(SVG.AbstractC4808w0 abstractC4808w0) {
            if (!(abstractC4808w0 instanceof SVG.C4810x0)) {
                return true;
            }
            C4824b.m3193Z0("Using <textPath> elements in a clip path is not supported.", new Object[0]);
            return false;
        }

        @Override // com.caverock.androidsvg.C4824b.j
        /* renamed from: b */
        public void mo3299b(String str) {
            String str2;
            if (C4824b.this.m3254Y0()) {
                Path path = new Path();
                str2 = str;
                C4824b.this.f3155d.f3194d.getTextPath(str2, 0, str.length(), this.f3187b, this.f3188c, path);
                this.f3189d.addPath(path);
            } else {
                str2 = str;
            }
            this.f3187b += C4824b.this.f3155d.f3194d.measureText(str2);
        }
    }

    /* renamed from: com.caverock.androidsvg.b$i */
    public class i extends j {

        /* renamed from: b */
        public float f3200b;

        /* renamed from: c */
        public float f3201c;

        /* renamed from: d */
        public RectF f3202d;

        public i(float f6, float f7) {
            super(C4824b.this, null);
            this.f3202d = new RectF();
            this.f3200b = f6;
            this.f3201c = f7;
        }

        @Override // com.caverock.androidsvg.C4824b.j
        /* renamed from: a */
        public boolean mo3300a(SVG.AbstractC4808w0 abstractC4808w0) {
            if (!(abstractC4808w0 instanceof SVG.C4810x0)) {
                return true;
            }
            SVG.C4810x0 c4810x0 = (SVG.C4810x0) abstractC4808w0;
            SVG.C4786l0 c4786l0M2994n = abstractC4808w0.f2934a.m2994n(c4810x0.f2987o);
            if (c4786l0M2994n == null) {
                C4824b.m3191F("TextPath path reference '%s' not found", c4810x0.f2987o);
                return false;
            }
            SVG.C4803u c4803u = (SVG.C4803u) c4786l0M2994n;
            Path pathM3298c = C4824b.this.new d(c4803u.f2972o).m3298c();
            Matrix matrix = c4803u.f2928n;
            if (matrix != null) {
                pathM3298c.transform(matrix);
            }
            RectF rectF = new RectF();
            pathM3298c.computeBounds(rectF, true);
            this.f3202d.union(rectF);
            return false;
        }

        @Override // com.caverock.androidsvg.C4824b.j
        /* renamed from: b */
        public void mo3299b(String str) {
            if (C4824b.this.m3254Y0()) {
                Rect rect = new Rect();
                C4824b.this.f3155d.f3194d.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.f3200b, this.f3201c);
                this.f3202d.union(rectF);
            }
            this.f3200b += C4824b.this.f3155d.f3194d.measureText(str);
        }
    }

    /* renamed from: com.caverock.androidsvg.b$j */
    public abstract class j {
        public j() {
        }

        /* renamed from: a */
        public boolean mo3300a(SVG.AbstractC4808w0 abstractC4808w0) {
            return true;
        }

        /* renamed from: b */
        public abstract void mo3299b(String str);

        public /* synthetic */ j(C4824b c4824b, a aVar) {
            this();
        }
    }

    public C4824b(Canvas canvas, float f6) {
        this.f3152a = canvas;
        this.f3153b = f6;
    }

    /* renamed from: F */
    public static void m3191F(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    /* renamed from: V */
    public static synchronized void m3192V() {
        HashSet hashSet = new HashSet();
        f3151i = hashSet;
        hashSet.add("Structure");
        f3151i.add("BasicStructure");
        f3151i.add("ConditionalProcessing");
        f3151i.add("Image");
        f3151i.add("Style");
        f3151i.add("ViewportAttribute");
        f3151i.add("Shape");
        f3151i.add("BasicText");
        f3151i.add("PaintAttribute");
        f3151i.add("BasicPaintAttribute");
        f3151i.add("OpacityAttribute");
        f3151i.add("BasicGraphicsAttribute");
        f3151i.add("Marker");
        f3151i.add("Gradient");
        f3151i.add("Pattern");
        f3151i.add("Clip");
        f3151i.add("BasicClip");
        f3151i.add("Mask");
        f3151i.add("View");
    }

    /* renamed from: Z0 */
    public static void m3193Z0(String str, Object... objArr) {
        Log.w("SVGAndroidRenderer", String.format(str, objArr));
    }

    /* renamed from: h */
    public static void m3201h(float f6, float f7, float f8, float f9, float f10, boolean z6, boolean z7, float f11, float f12, SVG.InterfaceC4807w interfaceC4807w) {
        if (f6 == f11 && f7 == f12) {
            return;
        }
        if (f8 == 0.0f || f9 == 0.0f) {
            interfaceC4807w.lineTo(f11, f12);
            return;
        }
        float fAbs = Math.abs(f8);
        float fAbs2 = Math.abs(f9);
        double radians = Math.toRadians(f10 % 360.0d);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d6 = (f6 - f11) / 2.0d;
        double d7 = (f7 - f12) / 2.0d;
        double d8 = (dCos * d6) + (dSin * d7);
        double d9 = ((-dSin) * d6) + (dCos * d7);
        double d10 = fAbs * fAbs;
        double d11 = fAbs2 * fAbs2;
        double d12 = d8 * d8;
        double d13 = d9 * d9;
        double d14 = (d12 / d10) + (d13 / d11);
        if (d14 > 0.99999d) {
            double dSqrt = Math.sqrt(d14) * 1.00001d;
            fAbs = (float) (fAbs * dSqrt);
            fAbs2 = (float) (dSqrt * fAbs2);
            d10 = fAbs * fAbs;
            d11 = fAbs2 * fAbs2;
        }
        double d15 = z6 == z7 ? -1.0d : 1.0d;
        double d16 = d10 * d11;
        double d17 = d10 * d13;
        double d18 = d11 * d12;
        double d19 = ((d16 - d17) - d18) / (d17 + d18);
        if (d19 < 0.0d) {
            d19 = 0.0d;
        }
        double dSqrt2 = d15 * Math.sqrt(d19);
        double d20 = fAbs;
        double d21 = fAbs2;
        double d22 = ((d20 * d9) / d21) * dSqrt2;
        double d23 = (-((d21 * d8) / d20)) * dSqrt2;
        double d24 = ((f6 + f11) / 2.0d) + ((dCos * d22) - (dSin * d23));
        double d25 = ((f7 + f12) / 2.0d) + (dSin * d22) + (dCos * d23);
        double d26 = (d8 - d22) / d20;
        double d27 = (d9 - d23) / d21;
        double d28 = ((-d8) - d22) / d20;
        double d29 = ((-d9) - d23) / d21;
        double d30 = (d26 * d26) + (d27 * d27);
        double dAcos = (d27 < 0.0d ? -1.0d : 1.0d) * Math.acos(d26 / Math.sqrt(d30));
        double dM3203v = ((d26 * d29) - (d27 * d28) < 0.0d ? -1.0d : 1.0d) * m3203v(((d26 * d28) + (d27 * d29)) / Math.sqrt(d30 * ((d28 * d28) + (d29 * d29))));
        if (!z7 && dM3203v > 0.0d) {
            dM3203v -= 6.283185307179586d;
        } else if (z7 && dM3203v < 0.0d) {
            dM3203v += 6.283185307179586d;
        }
        float[] fArrM3202i = m3202i(dAcos % 6.283185307179586d, dM3203v % 6.283185307179586d);
        Matrix matrix = new Matrix();
        matrix.postScale(fAbs, fAbs2);
        matrix.postRotate(f10);
        matrix.postTranslate((float) d24, (float) d25);
        matrix.mapPoints(fArrM3202i);
        fArrM3202i[fArrM3202i.length - 2] = f11;
        fArrM3202i[fArrM3202i.length - 1] = f12;
        for (int i6 = 0; i6 < fArrM3202i.length; i6 += 6) {
            interfaceC4807w.cubicTo(fArrM3202i[i6], fArrM3202i[i6 + 1], fArrM3202i[i6 + 2], fArrM3202i[i6 + 3], fArrM3202i[i6 + 4], fArrM3202i[i6 + 5]);
        }
    }

    /* renamed from: i */
    public static float[] m3202i(double d6, double d7) {
        int iCeil = (int) Math.ceil((Math.abs(d7) * 2.0d) / 3.141592653589793d);
        double d8 = d7 / iCeil;
        double d9 = d8 / 2.0d;
        double dSin = (Math.sin(d9) * 1.3333333333333333d) / (Math.cos(d9) + 1.0d);
        float[] fArr = new float[iCeil * 6];
        int i6 = 0;
        int i7 = 0;
        while (i6 < iCeil) {
            double d10 = d6 + (i6 * d8);
            double dCos = Math.cos(d10);
            double dSin2 = Math.sin(d10);
            float[] fArr2 = fArr;
            fArr2[i7] = (float) (dCos - (dSin * dSin2));
            fArr2[i7 + 1] = (float) (dSin2 + (dCos * dSin));
            double d11 = d10 + d8;
            double dCos2 = Math.cos(d11);
            double dSin3 = Math.sin(d11);
            fArr2[i7 + 2] = (float) ((dSin * dSin3) + dCos2);
            fArr2[i7 + 3] = (float) (dSin3 - (dSin * dCos2));
            int i8 = i7 + 5;
            fArr2[i7 + 4] = (float) dCos2;
            i7 += 6;
            fArr2[i8] = (float) dSin3;
            i6++;
            fArr = fArr2;
            iCeil = iCeil;
        }
        return fArr;
    }

    /* renamed from: v */
    public static double m3203v(double d6) {
        if (d6 < -1.0d) {
            return 3.141592653589793d;
        }
        if (d6 > 1.0d) {
            return 0.0d;
        }
        return Math.acos(d6);
    }

    /* renamed from: w */
    public static int m3204w(float f6) {
        int i6 = (int) (f6 * 256.0f);
        if (i6 < 0) {
            return 0;
        }
        if (i6 > 255) {
            return 255;
        }
        return i6;
    }

    /* renamed from: x */
    public static int m3205x(int i6, float f6) {
        int i7 = 255;
        int iRound = Math.round(((i6 >> 24) & 255) * f6);
        if (iRound < 0) {
            i7 = 0;
        } else if (iRound <= 255) {
            i7 = iRound;
        }
        return (i6 & ViewCompat.MEASURED_SIZE_MASK) | (i7 << 24);
    }

    /* renamed from: y */
    public static void m3206y(String str, Object... objArr) {
    }

    /* renamed from: A */
    public final boolean m3207A() {
        Boolean bool = this.f3155d.f3191a.f2782A;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: A0 */
    public final void m3208A0(SVG.C4786l0 c4786l0) {
        if (c4786l0 instanceof SVG.InterfaceC4799s) {
            return;
        }
        m3243S0();
        m3287u(c4786l0);
        if (c4786l0 instanceof SVG.C4770d0) {
            m3291x0((SVG.C4770d0) c4786l0);
        } else if (c4786l0 instanceof SVG.C4765b1) {
            m3216E0((SVG.C4765b1) c4786l0);
        } else if (c4786l0 instanceof SVG.C4796q0) {
            m3210B0((SVG.C4796q0) c4786l0);
        } else if (c4786l0 instanceof SVG.C4785l) {
            m3280q0((SVG.C4785l) c4786l0);
        } else if (c4786l0 instanceof SVG.C4789n) {
            m3282r0((SVG.C4789n) c4786l0);
        } else if (c4786l0 instanceof SVG.C4803u) {
            m3286t0((SVG.C4803u) c4786l0);
        } else if (c4786l0 instanceof SVG.C4761a0) {
            m3290w0((SVG.C4761a0) c4786l0);
        } else if (c4786l0 instanceof SVG.C4769d) {
            m3276o0((SVG.C4769d) c4786l0);
        } else if (c4786l0 instanceof SVG.C4779i) {
            m3278p0((SVG.C4779i) c4786l0);
        } else if (c4786l0 instanceof SVG.C4793p) {
            m3284s0((SVG.C4793p) c4786l0);
        } else if (c4786l0 instanceof SVG.C4813z) {
            m3289v0((SVG.C4813z) c4786l0);
        } else if (c4786l0 instanceof SVG.C4811y) {
            m3288u0((SVG.C4811y) c4786l0);
        } else if (c4786l0 instanceof SVG.C4804u0) {
            m3214D0((SVG.C4804u0) c4786l0);
        }
        m3241R0();
    }

    /* renamed from: B */
    public final void m3209B(SVG.AbstractC4780i0 abstractC4780i0, Path path) {
        SVG.AbstractC4788m0 abstractC4788m0 = this.f3155d.f3191a.f2796b;
        if (abstractC4788m0 instanceof SVG.C4801t) {
            SVG.C4786l0 c4786l0M2994n = this.f3154c.m2994n(((SVG.C4801t) abstractC4788m0).f2969a);
            if (c4786l0M2994n instanceof SVG.C4809x) {
                m3228L(abstractC4780i0, path, (SVG.C4809x) c4786l0M2994n);
                return;
            }
        }
        this.f3152a.drawPath(path, this.f3155d.f3194d);
    }

    /* renamed from: B0 */
    public final void m3210B0(SVG.C4796q0 c4796q0) {
        m3206y("Switch render", new Object[0]);
        m3250W0(this.f3155d, c4796q0);
        if (m3207A()) {
            Matrix matrix = c4796q0.f2933o;
            if (matrix != null) {
                this.f3152a.concat(matrix);
            }
            m3277p(c4796q0);
            boolean zM3272m0 = m3272m0();
            m3227K0(c4796q0);
            if (zM3272m0) {
                m3266j0(c4796q0);
            }
            m3247U0(c4796q0);
        }
    }

    /* renamed from: C */
    public final void m3211C(Path path) {
        h hVar = this.f3155d;
        if (hVar.f3191a.f2793L != SVG.Style.VectorEffect.NonScalingStroke) {
            this.f3152a.drawPath(path, hVar.f3195e);
            return;
        }
        Matrix matrix = this.f3152a.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        this.f3152a.setMatrix(new Matrix());
        Shader shader = this.f3155d.f3195e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        this.f3152a.drawPath(path2, this.f3155d.f3195e);
        this.f3152a.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    /* renamed from: C0 */
    public final void m3212C0(SVG.C4798r0 c4798r0, SVG.C4763b c4763b) {
        m3206y("Symbol render", new Object[0]);
        if (c4763b.f2877c == 0.0f || c4763b.f2878d == 0.0f) {
            return;
        }
        PreserveAspectRatio preserveAspectRatio = c4798r0.f2942o;
        if (preserveAspectRatio == null) {
            preserveAspectRatio = PreserveAspectRatio.f2748e;
        }
        m3250W0(this.f3155d, c4798r0);
        h hVar = this.f3155d;
        hVar.f3196f = c4763b;
        if (!hVar.f3191a.f2816v.booleanValue()) {
            SVG.C4763b c4763b2 = this.f3155d.f3196f;
            m3235O0(c4763b2.f2875a, c4763b2.f2876b, c4763b2.f2877c, c4763b2.f2878d);
        }
        SVG.C4763b c4763b3 = c4798r0.f2954p;
        if (c4763b3 != null) {
            this.f3152a.concat(m3275o(this.f3155d.f3196f, c4763b3, preserveAspectRatio));
            this.f3155d.f3197g = c4798r0.f2954p;
        } else {
            Canvas canvas = this.f3152a;
            SVG.C4763b c4763b4 = this.f3155d.f3196f;
            canvas.translate(c4763b4.f2875a, c4763b4.f2876b);
        }
        boolean zM3272m0 = m3272m0();
        m3217F0(c4798r0, true);
        if (zM3272m0) {
            m3266j0(c4798r0);
        }
        m3247U0(c4798r0);
    }

    /* renamed from: D */
    public final float m3213D(float f6, float f7, float f8, float f9) {
        return (f6 * f8) + (f7 * f9);
    }

    /* renamed from: D0 */
    public final void m3214D0(SVG.C4804u0 c4804u0) {
        m3206y("Text render", new Object[0]);
        m3250W0(this.f3155d, c4804u0);
        if (m3207A()) {
            Matrix matrix = c4804u0.f2974s;
            if (matrix != null) {
                this.f3152a.concat(matrix);
            }
            List list = c4804u0.f2991o;
            float fM3024i = 0.0f;
            float fM3023h = (list == null || list.size() == 0) ? 0.0f : ((SVG.C4791o) c4804u0.f2991o.get(0)).m3023h(this);
            List list2 = c4804u0.f2992p;
            float fM3024i2 = (list2 == null || list2.size() == 0) ? 0.0f : ((SVG.C4791o) c4804u0.f2992p.get(0)).m3024i(this);
            List list3 = c4804u0.f2993q;
            float fM3023h2 = (list3 == null || list3.size() == 0) ? 0.0f : ((SVG.C4791o) c4804u0.f2993q.get(0)).m3023h(this);
            List list4 = c4804u0.f2994r;
            if (list4 != null && list4.size() != 0) {
                fM3024i = ((SVG.C4791o) c4804u0.f2994r.get(0)).m3024i(this);
            }
            SVG.Style.TextAnchor textAnchorM3234O = m3234O();
            if (textAnchorM3234O != SVG.Style.TextAnchor.Start) {
                float fM3273n = m3273n(c4804u0);
                if (textAnchorM3234O == SVG.Style.TextAnchor.Middle) {
                    fM3273n /= 2.0f;
                }
                fM3023h -= fM3273n;
            }
            if (c4804u0.f2917h == null) {
                i iVar = new i(fM3023h, fM3024i2);
                m3215E(c4804u0, iVar);
                RectF rectF = iVar.f3202d;
                c4804u0.f2917h = new SVG.C4763b(rectF.left, rectF.top, rectF.width(), iVar.f3202d.height());
            }
            m3247U0(c4804u0);
            m3281r(c4804u0);
            m3277p(c4804u0);
            boolean zM3272m0 = m3272m0();
            m3215E(c4804u0, new f(fM3023h + fM3023h2, fM3024i2 + fM3024i));
            if (zM3272m0) {
                m3266j0(c4804u0);
            }
        }
    }

    /* renamed from: E */
    public final void m3215E(SVG.AbstractC4808w0 abstractC4808w0, j jVar) {
        if (m3207A()) {
            Iterator it = abstractC4808w0.f2901i.iterator();
            boolean z6 = true;
            while (it.hasNext()) {
                SVG.C4786l0 c4786l0 = (SVG.C4786l0) it.next();
                if (c4786l0 instanceof SVG.C4762a1) {
                    jVar.mo3299b(m3245T0(((SVG.C4762a1) c4786l0).f2873c, z6, !it.hasNext()));
                } else {
                    m3270l0(c4786l0, jVar);
                }
                z6 = false;
            }
        }
    }

    /* renamed from: E0 */
    public final void m3216E0(SVG.C4765b1 c4765b1) {
        m3206y("Use render", new Object[0]);
        SVG.C4791o c4791o = c4765b1.f2882s;
        if (c4791o == null || !c4791o.m3026k()) {
            SVG.C4791o c4791o2 = c4765b1.f2883t;
            if (c4791o2 == null || !c4791o2.m3026k()) {
                m3250W0(this.f3155d, c4765b1);
                if (m3207A()) {
                    SVG.C4786l0 c4786l0M2994n = c4765b1.f2934a.m2994n(c4765b1.f2879p);
                    if (c4786l0M2994n == null) {
                        m3191F("Use reference '%s' not found", c4765b1.f2879p);
                        return;
                    }
                    Matrix matrix = c4765b1.f2933o;
                    if (matrix != null) {
                        this.f3152a.concat(matrix);
                    }
                    SVG.C4791o c4791o3 = c4765b1.f2880q;
                    float fM3023h = c4791o3 != null ? c4791o3.m3023h(this) : 0.0f;
                    SVG.C4791o c4791o4 = c4765b1.f2881r;
                    this.f3152a.translate(fM3023h, c4791o4 != null ? c4791o4.m3024i(this) : 0.0f);
                    m3277p(c4765b1);
                    boolean zM3272m0 = m3272m0();
                    m3264i0(c4765b1);
                    if (c4786l0M2994n instanceof SVG.C4770d0) {
                        SVG.C4763b c4763bM3261f0 = m3261f0(null, null, c4765b1.f2882s, c4765b1.f2883t);
                        m3243S0();
                        m3292y0((SVG.C4770d0) c4786l0M2994n, c4763bM3261f0);
                        m3241R0();
                    } else if (c4786l0M2994n instanceof SVG.C4798r0) {
                        SVG.C4791o c4791o5 = c4765b1.f2882s;
                        if (c4791o5 == null) {
                            c4791o5 = new SVG.C4791o(100.0f, SVG.Unit.percent);
                        }
                        SVG.C4791o c4791o6 = c4765b1.f2883t;
                        if (c4791o6 == null) {
                            c4791o6 = new SVG.C4791o(100.0f, SVG.Unit.percent);
                        }
                        SVG.C4763b c4763bM3261f02 = m3261f0(null, null, c4791o5, c4791o6);
                        m3243S0();
                        m3212C0((SVG.C4798r0) c4786l0M2994n, c4763bM3261f02);
                        m3241R0();
                    } else {
                        m3208A0(c4786l0M2994n);
                    }
                    m3263h0();
                    if (zM3272m0) {
                        m3266j0(c4765b1);
                    }
                    m3247U0(c4765b1);
                }
            }
        }
    }

    /* renamed from: F0 */
    public final void m3217F0(SVG.InterfaceC4778h0 interfaceC4778h0, boolean z6) {
        if (z6) {
            m3264i0(interfaceC4778h0);
        }
        Iterator it = interfaceC4778h0.getChildren().iterator();
        while (it.hasNext()) {
            m3208A0((SVG.C4786l0) it.next());
        }
        if (z6) {
            m3263h0();
        }
    }

    /* renamed from: G */
    public final void m3218G(SVG.AbstractC4808w0 abstractC4808w0, StringBuilder sb) {
        Iterator it = abstractC4808w0.f2901i.iterator();
        boolean z6 = true;
        while (it.hasNext()) {
            SVG.C4786l0 c4786l0 = (SVG.C4786l0) it.next();
            if (c4786l0 instanceof SVG.AbstractC4808w0) {
                m3218G((SVG.AbstractC4808w0) c4786l0, sb);
            } else if (c4786l0 instanceof SVG.C4762a1) {
                sb.append(m3245T0(((SVG.C4762a1) c4786l0).f2873c, z6, !it.hasNext()));
            }
            z6 = false;
        }
    }

    /* renamed from: G0 */
    public void m3219G0(SVG svg, C4823a c4823a) {
        SVG.C4763b c4763b;
        PreserveAspectRatio preserveAspectRatio;
        if (c4823a == null) {
            throw new NullPointerException("renderOptions shouldn't be null");
        }
        this.f3154c = svg;
        SVG.C4770d0 c4770d0M2989i = svg.m2989i();
        if (c4770d0M2989i == null) {
            m3193Z0("Nothing to render. Document is empty.", new Object[0]);
            return;
        }
        if (c4823a.m3187d()) {
            SVG.AbstractC4782j0 abstractC4782j0M2988f = this.f3154c.m2988f(c4823a.f3149e);
            if (abstractC4782j0M2988f == null || !(abstractC4782j0M2988f instanceof SVG.C4768c1)) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" not found.", c4823a.f3149e));
                return;
            }
            SVG.C4768c1 c4768c1 = (SVG.C4768c1) abstractC4782j0M2988f;
            c4763b = c4768c1.f2954p;
            if (c4763b == null) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" is missing a viewBox attribute.", c4823a.f3149e));
                return;
            }
            preserveAspectRatio = c4768c1.f2942o;
        } else {
            c4763b = c4823a.m3188e() ? c4823a.f3148d : c4770d0M2989i.f2954p;
            preserveAspectRatio = c4823a.m3185b() ? c4823a.f3146b : c4770d0M2989i.f2942o;
        }
        if (c4823a.m3184a()) {
            svg.m2983a(c4823a.f3145a);
        }
        if (c4823a.m3186c()) {
            CSSParser.C4756m c4756m = new CSSParser.C4756m();
            this.f3159h = c4756m;
            c4756m.f2738a = svg.m2988f(c4823a.f3147c);
        }
        m3233N0();
        m3287u(c4770d0M2989i);
        m3243S0();
        SVG.C4763b c4763b2 = new SVG.C4763b(c4823a.f3150f);
        SVG.C4791o c4791o = c4770d0M2989i.f2894s;
        if (c4791o != null) {
            c4763b2.f2877c = c4791o.m3022f(this, c4763b2.f2877c);
        }
        SVG.C4791o c4791o2 = c4770d0M2989i.f2895t;
        if (c4791o2 != null) {
            c4763b2.f2878d = c4791o2.m3022f(this, c4763b2.f2878d);
        }
        m3294z0(c4770d0M2989i, c4763b2, c4763b, preserveAspectRatio);
        m3241R0();
        if (c4823a.m3184a()) {
            svg.m2984b();
        }
    }

    /* renamed from: H */
    public final void m3220H(SVG.AbstractC4781j abstractC4781j, String str) {
        SVG.C4786l0 c4786l0M2994n = abstractC4781j.f2934a.m2994n(str);
        if (c4786l0M2994n == null) {
            m3193Z0("Gradient reference '%s' not found", str);
            return;
        }
        if (!(c4786l0M2994n instanceof SVG.AbstractC4781j)) {
            m3191F("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (c4786l0M2994n == abstractC4781j) {
            m3191F("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        SVG.AbstractC4781j abstractC4781j2 = (SVG.AbstractC4781j) c4786l0M2994n;
        if (abstractC4781j.f2919i == null) {
            abstractC4781j.f2919i = abstractC4781j2.f2919i;
        }
        if (abstractC4781j.f2920j == null) {
            abstractC4781j.f2920j = abstractC4781j2.f2920j;
        }
        if (abstractC4781j.f2921k == null) {
            abstractC4781j.f2921k = abstractC4781j2.f2921k;
        }
        if (abstractC4781j.f2918h.isEmpty()) {
            abstractC4781j.f2918h = abstractC4781j2.f2918h;
        }
        try {
            if (abstractC4781j instanceof SVG.C4784k0) {
                m3222I((SVG.C4784k0) abstractC4781j, (SVG.C4784k0) c4786l0M2994n);
            } else {
                m3224J((SVG.C4792o0) abstractC4781j, (SVG.C4792o0) c4786l0M2994n);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = abstractC4781j2.f2922l;
        if (str2 != null) {
            m3220H(abstractC4781j, str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0101, code lost:
    
        if (r7 != 8) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0118  */
    /* renamed from: H0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3221H0(com.caverock.androidsvg.SVG.C4795q r12, com.caverock.androidsvg.C4824b.c r13) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.C4824b.m3221H0(com.caverock.androidsvg.SVG$q, com.caverock.androidsvg.b$c):void");
    }

    /* renamed from: I */
    public final void m3222I(SVG.C4784k0 c4784k0, SVG.C4784k0 c4784k02) {
        if (c4784k0.f2929m == null) {
            c4784k0.f2929m = c4784k02.f2929m;
        }
        if (c4784k0.f2930n == null) {
            c4784k0.f2930n = c4784k02.f2930n;
        }
        if (c4784k0.f2931o == null) {
            c4784k0.f2931o = c4784k02.f2931o;
        }
        if (c4784k0.f2932p == null) {
            c4784k0.f2932p = c4784k02.f2932p;
        }
    }

    /* renamed from: I0 */
    public final void m3223I0(SVG.AbstractC4783k abstractC4783k) {
        SVG.C4795q c4795q;
        SVG.C4795q c4795q2;
        SVG.C4795q c4795q3;
        int size;
        SVG.Style style = this.f3155d.f3191a;
        String str = style.f2818x;
        if (str == null && style.f2819y == null && style.f2820z == null) {
            return;
        }
        if (str == null) {
            c4795q = null;
        } else {
            SVG.C4786l0 c4786l0M2994n = abstractC4783k.f2934a.m2994n(str);
            if (c4786l0M2994n != null) {
                c4795q = (SVG.C4795q) c4786l0M2994n;
            } else {
                m3191F("Marker reference '%s' not found", this.f3155d.f3191a.f2818x);
                c4795q = null;
            }
        }
        String str2 = this.f3155d.f3191a.f2819y;
        if (str2 == null) {
            c4795q2 = null;
        } else {
            SVG.C4786l0 c4786l0M2994n2 = abstractC4783k.f2934a.m2994n(str2);
            if (c4786l0M2994n2 != null) {
                c4795q2 = (SVG.C4795q) c4786l0M2994n2;
            } else {
                m3191F("Marker reference '%s' not found", this.f3155d.f3191a.f2819y);
                c4795q2 = null;
            }
        }
        String str3 = this.f3155d.f3191a.f2820z;
        if (str3 == null) {
            c4795q3 = null;
        } else {
            SVG.C4786l0 c4786l0M2994n3 = abstractC4783k.f2934a.m2994n(str3);
            if (c4786l0M2994n3 != null) {
                c4795q3 = (SVG.C4795q) c4786l0M2994n3;
            } else {
                m3191F("Marker reference '%s' not found", this.f3155d.f3191a.f2820z);
                c4795q3 = null;
            }
        }
        List listM3295c = abstractC4783k instanceof SVG.C4803u ? new b(((SVG.C4803u) abstractC4783k).f2972o).m3295c() : abstractC4783k instanceof SVG.C4793p ? m3267k((SVG.C4793p) abstractC4783k) : m3269l((SVG.C4811y) abstractC4783k);
        if (listM3295c == null || (size = listM3295c.size()) == 0) {
            return;
        }
        SVG.Style style2 = this.f3155d.f3191a;
        style2.f2820z = null;
        style2.f2819y = null;
        style2.f2818x = null;
        if (c4795q != null) {
            m3221H0(c4795q, (c) listM3295c.get(0));
        }
        if (c4795q2 != null && listM3295c.size() > 2) {
            c cVarM3274n0 = (c) listM3295c.get(0);
            c cVar = (c) listM3295c.get(1);
            int i6 = 1;
            while (i6 < size - 1) {
                i6++;
                c cVar2 = (c) listM3295c.get(i6);
                cVarM3274n0 = cVar.f3176e ? m3274n0(cVarM3274n0, cVar, cVar2) : cVar;
                m3221H0(c4795q2, cVarM3274n0);
                cVar = cVar2;
            }
        }
        if (c4795q3 != null) {
            m3221H0(c4795q3, (c) listM3295c.get(size - 1));
        }
    }

    /* renamed from: J */
    public final void m3224J(SVG.C4792o0 c4792o0, SVG.C4792o0 c4792o02) {
        if (c4792o0.f2945m == null) {
            c4792o0.f2945m = c4792o02.f2945m;
        }
        if (c4792o0.f2946n == null) {
            c4792o0.f2946n = c4792o02.f2946n;
        }
        if (c4792o0.f2947o == null) {
            c4792o0.f2947o = c4792o02.f2947o;
        }
        if (c4792o0.f2948p == null) {
            c4792o0.f2948p = c4792o02.f2948p;
        }
        if (c4792o0.f2949q == null) {
            c4792o0.f2949q = c4792o02.f2949q;
        }
    }

    /* renamed from: J0 */
    public final void m3225J0(SVG.C4797r c4797r, SVG.AbstractC4780i0 abstractC4780i0, SVG.C4763b c4763b) {
        float fM3023h;
        float fM3024i;
        m3206y("Mask render", new Object[0]);
        Boolean bool = c4797r.f2961o;
        if (bool == null || !bool.booleanValue()) {
            SVG.C4791o c4791o = c4797r.f2965s;
            float fM3022f = c4791o != null ? c4791o.m3022f(this, 1.0f) : 1.2f;
            SVG.C4791o c4791o2 = c4797r.f2966t;
            float fM3022f2 = c4791o2 != null ? c4791o2.m3022f(this, 1.0f) : 1.2f;
            fM3023h = fM3022f * c4763b.f2877c;
            fM3024i = fM3022f2 * c4763b.f2878d;
        } else {
            SVG.C4791o c4791o3 = c4797r.f2965s;
            fM3023h = c4791o3 != null ? c4791o3.m3023h(this) : c4763b.f2877c;
            SVG.C4791o c4791o4 = c4797r.f2966t;
            fM3024i = c4791o4 != null ? c4791o4.m3024i(this) : c4763b.f2878d;
        }
        if (fM3023h == 0.0f || fM3024i == 0.0f) {
            return;
        }
        m3243S0();
        h hVarM3230M = m3230M(c4797r);
        this.f3155d = hVarM3230M;
        hVarM3230M.f3191a.f2807m = Float.valueOf(1.0f);
        boolean zM3272m0 = m3272m0();
        this.f3152a.save();
        Boolean bool2 = c4797r.f2962p;
        if (bool2 != null && !bool2.booleanValue()) {
            this.f3152a.translate(c4763b.f2875a, c4763b.f2876b);
            this.f3152a.scale(c4763b.f2877c, c4763b.f2878d);
        }
        m3217F0(c4797r, false);
        this.f3152a.restore();
        if (zM3272m0) {
            m3268k0(abstractC4780i0, c4763b);
        }
        m3241R0();
    }

    /* renamed from: K */
    public final void m3226K(SVG.C4809x c4809x, String str) {
        SVG.C4786l0 c4786l0M2994n = c4809x.f2934a.m2994n(str);
        if (c4786l0M2994n == null) {
            m3193Z0("Pattern reference '%s' not found", str);
            return;
        }
        if (!(c4786l0M2994n instanceof SVG.C4809x)) {
            m3191F("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (c4786l0M2994n == c4809x) {
            m3191F("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        SVG.C4809x c4809x2 = (SVG.C4809x) c4786l0M2994n;
        if (c4809x.f2979q == null) {
            c4809x.f2979q = c4809x2.f2979q;
        }
        if (c4809x.f2980r == null) {
            c4809x.f2980r = c4809x2.f2980r;
        }
        if (c4809x.f2981s == null) {
            c4809x.f2981s = c4809x2.f2981s;
        }
        if (c4809x.f2982t == null) {
            c4809x.f2982t = c4809x2.f2982t;
        }
        if (c4809x.f2983u == null) {
            c4809x.f2983u = c4809x2.f2983u;
        }
        if (c4809x.f2984v == null) {
            c4809x.f2984v = c4809x2.f2984v;
        }
        if (c4809x.f2985w == null) {
            c4809x.f2985w = c4809x2.f2985w;
        }
        if (c4809x.f2901i.isEmpty()) {
            c4809x.f2901i = c4809x2.f2901i;
        }
        if (c4809x.f2954p == null) {
            c4809x.f2954p = c4809x2.f2954p;
        }
        if (c4809x.f2942o == null) {
            c4809x.f2942o = c4809x2.f2942o;
        }
        String str2 = c4809x2.f2986x;
        if (str2 != null) {
            m3226K(c4809x, str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: K0 */
    public final void m3227K0(SVG.C4796q0 c4796q0) {
        Set setMo3007a;
        String language = Locale.getDefault().getLanguage();
        SVG.m2981g();
        for (SVG.C4786l0 c4786l0 : c4796q0.getChildren()) {
            if (c4786l0 instanceof SVG.InterfaceC4772e0) {
                SVG.InterfaceC4772e0 interfaceC4772e0 = (SVG.InterfaceC4772e0) c4786l0;
                if (interfaceC4772e0.mo3008b() == null && ((setMo3007a = interfaceC4772e0.mo3007a()) == null || (!setMo3007a.isEmpty() && setMo3007a.contains(language)))) {
                    Set setMo3011f = interfaceC4772e0.mo3011f();
                    if (setMo3011f != null) {
                        if (f3151i == null) {
                            m3192V();
                        }
                        if (setMo3011f.isEmpty() || !f3151i.containsAll(setMo3011f)) {
                        }
                    }
                    Set setMo3015l = interfaceC4772e0.mo3015l();
                    if (setMo3015l != null) {
                        setMo3015l.isEmpty();
                    } else {
                        Set setMo3016m = interfaceC4772e0.mo3016m();
                        if (setMo3016m == null) {
                            m3208A0(c4786l0);
                            return;
                        }
                        setMo3016m.isEmpty();
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x015a  */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3228L(com.caverock.androidsvg.SVG.AbstractC4780i0 r21, android.graphics.Path r22, com.caverock.androidsvg.SVG.C4809x r23) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.C4824b.m3228L(com.caverock.androidsvg.SVG$i0, android.graphics.Path, com.caverock.androidsvg.SVG$x):void");
    }

    /* renamed from: L0 */
    public final void m3229L0(SVG.C4810x0 c4810x0) {
        m3206y("TextPath render", new Object[0]);
        m3250W0(this.f3155d, c4810x0);
        if (m3207A() && m3254Y0()) {
            SVG.C4786l0 c4786l0M2994n = c4810x0.f2934a.m2994n(c4810x0.f2987o);
            if (c4786l0M2994n == null) {
                m3191F("TextPath reference '%s' not found", c4810x0.f2987o);
                return;
            }
            SVG.C4803u c4803u = (SVG.C4803u) c4786l0M2994n;
            Path pathM3298c = new d(c4803u.f2972o).m3298c();
            Matrix matrix = c4803u.f2928n;
            if (matrix != null) {
                pathM3298c.transform(matrix);
            }
            PathMeasure pathMeasure = new PathMeasure(pathM3298c, false);
            SVG.C4791o c4791o = c4810x0.f2988p;
            float fM3022f = c4791o != null ? c4791o.m3022f(this, pathMeasure.getLength()) : 0.0f;
            SVG.Style.TextAnchor textAnchorM3234O = m3234O();
            if (textAnchorM3234O != SVG.Style.TextAnchor.Start) {
                float fM3273n = m3273n(c4810x0);
                if (textAnchorM3234O == SVG.Style.TextAnchor.Middle) {
                    fM3273n /= 2.0f;
                }
                fM3022f -= fM3273n;
            }
            m3281r((SVG.AbstractC4780i0) c4810x0.mo3001d());
            boolean zM3272m0 = m3272m0();
            m3215E(c4810x0, new e(pathM3298c, fM3022f, 0.0f));
            if (zM3272m0) {
                m3266j0(c4810x0);
            }
        }
    }

    /* renamed from: M */
    public final h m3230M(SVG.C4786l0 c4786l0) {
        h hVar = new h();
        m3248V0(hVar, SVG.Style.m2998b());
        return m3232N(c4786l0, hVar);
    }

    /* renamed from: M0 */
    public final boolean m3231M0() {
        return this.f3155d.f3191a.f2807m.floatValue() < 1.0f || this.f3155d.f3191a.f2788G != null;
    }

    /* renamed from: N */
    public final h m3232N(SVG.C4786l0 c4786l0, h hVar) {
        int i6;
        ArrayList arrayList = new ArrayList();
        while (true) {
            i6 = 0;
            if (c4786l0 instanceof SVG.AbstractC4782j0) {
                arrayList.add(0, (SVG.AbstractC4782j0) c4786l0);
            }
            Object obj = c4786l0.f2935b;
            if (obj == null) {
                break;
            }
            c4786l0 = (SVG.C4786l0) obj;
        }
        int size = arrayList.size();
        while (i6 < size) {
            Object obj2 = arrayList.get(i6);
            i6++;
            m3250W0(hVar, (SVG.AbstractC4782j0) obj2);
        }
        h hVar2 = this.f3155d;
        hVar.f3197g = hVar2.f3197g;
        hVar.f3196f = hVar2.f3196f;
        return hVar;
    }

    /* renamed from: N0 */
    public final void m3233N0() {
        this.f3155d = new h();
        this.f3156e = new Stack();
        m3248V0(this.f3155d, SVG.Style.m2998b());
        h hVar = this.f3155d;
        hVar.f3196f = null;
        hVar.f3198h = false;
        this.f3156e.push(new h(hVar));
        this.f3158g = new Stack();
        this.f3157f = new Stack();
    }

    /* renamed from: O */
    public final SVG.Style.TextAnchor m3234O() {
        SVG.Style.TextAnchor textAnchor;
        SVG.Style style = this.f3155d.f3191a;
        if (style.f2814t == SVG.Style.TextDirection.LTR || (textAnchor = style.f2815u) == SVG.Style.TextAnchor.Middle) {
            return style.f2815u;
        }
        SVG.Style.TextAnchor textAnchor2 = SVG.Style.TextAnchor.Start;
        return textAnchor == textAnchor2 ? SVG.Style.TextAnchor.End : textAnchor2;
    }

    /* renamed from: O0 */
    public final void m3235O0(float f6, float f7, float f8, float f9) {
        float fM3023h = f8 + f6;
        float fM3024i = f9 + f7;
        SVG.C4766c c4766c = this.f3155d.f3191a.f2817w;
        if (c4766c != null) {
            f6 += c4766c.f2887d.m3023h(this);
            f7 += this.f3155d.f3191a.f2817w.f2884a.m3024i(this);
            fM3023h -= this.f3155d.f3191a.f2817w.f2885b.m3023h(this);
            fM3024i -= this.f3155d.f3191a.f2817w.f2886c.m3024i(this);
        }
        this.f3152a.clipRect(f6, f7, fM3023h, fM3024i);
    }

    /* renamed from: P */
    public final Path.FillType m3236P() {
        SVG.Style.FillRule fillRule = this.f3155d.f3191a.f2787F;
        return (fillRule == null || fillRule != SVG.Style.FillRule.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    /* renamed from: P0 */
    public final void m3237P0(h hVar, boolean z6, SVG.AbstractC4788m0 abstractC4788m0) {
        int i6;
        SVG.Style style = hVar.f3191a;
        float fFloatValue = (z6 ? style.f2798d : style.f2800f).floatValue();
        if (abstractC4788m0 instanceof SVG.C4773f) {
            i6 = ((SVG.C4773f) abstractC4788m0).f2900a;
        } else if (!(abstractC4788m0 instanceof SVG.C4775g)) {
            return;
        } else {
            i6 = hVar.f3191a.f2808n.f2900a;
        }
        int iM3205x = m3205x(i6, fFloatValue);
        if (z6) {
            hVar.f3194d.setColor(iM3205x);
        } else {
            hVar.f3195e.setColor(iM3205x);
        }
    }

    /* renamed from: Q */
    public float m3238Q() {
        return this.f3155d.f3194d.getTextSize();
    }

    /* renamed from: Q0 */
    public final void m3239Q0(boolean z6, SVG.C4764b0 c4764b0) {
        if (z6) {
            if (m3249W(c4764b0.f2925e, 2147483648L)) {
                h hVar = this.f3155d;
                SVG.Style style = hVar.f3191a;
                SVG.AbstractC4788m0 abstractC4788m0 = c4764b0.f2925e.f2789H;
                style.f2796b = abstractC4788m0;
                hVar.f3192b = abstractC4788m0 != null;
            }
            if (m3249W(c4764b0.f2925e, 4294967296L)) {
                this.f3155d.f3191a.f2798d = c4764b0.f2925e.f2790I;
            }
            if (m3249W(c4764b0.f2925e, 6442450944L)) {
                h hVar2 = this.f3155d;
                m3237P0(hVar2, z6, hVar2.f3191a.f2796b);
                return;
            }
            return;
        }
        if (m3249W(c4764b0.f2925e, 2147483648L)) {
            h hVar3 = this.f3155d;
            SVG.Style style2 = hVar3.f3191a;
            SVG.AbstractC4788m0 abstractC4788m02 = c4764b0.f2925e.f2789H;
            style2.f2799e = abstractC4788m02;
            hVar3.f3193c = abstractC4788m02 != null;
        }
        if (m3249W(c4764b0.f2925e, 4294967296L)) {
            this.f3155d.f3191a.f2800f = c4764b0.f2925e.f2790I;
        }
        if (m3249W(c4764b0.f2925e, 6442450944L)) {
            h hVar4 = this.f3155d;
            m3237P0(hVar4, z6, hVar4.f3191a.f2799e);
        }
    }

    /* renamed from: R */
    public float m3240R() {
        return this.f3155d.f3194d.getTextSize() / 2.0f;
    }

    /* renamed from: R0 */
    public final void m3241R0() {
        this.f3152a.restore();
        this.f3155d = (h) this.f3156e.pop();
    }

    /* renamed from: S */
    public SVG.C4763b m3242S() {
        h hVar = this.f3155d;
        SVG.C4763b c4763b = hVar.f3197g;
        return c4763b != null ? c4763b : hVar.f3196f;
    }

    /* renamed from: S0 */
    public final void m3243S0() {
        this.f3152a.save();
        this.f3156e.push(this.f3155d);
        this.f3155d = new h(this.f3155d);
    }

    /* renamed from: T */
    public float m3244T() {
        return this.f3153b;
    }

    /* renamed from: T0 */
    public final String m3245T0(String str, boolean z6, boolean z7) {
        if (this.f3155d.f3198h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String strReplaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z6) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", "");
        }
        if (z7) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", "");
        }
        return strReplaceAll.replaceAll("\\s{2,}", " ");
    }

    /* renamed from: U */
    public final Path.FillType m3246U() {
        SVG.Style.FillRule fillRule = this.f3155d.f3191a.f2797c;
        return (fillRule == null || fillRule != SVG.Style.FillRule.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    /* renamed from: U0 */
    public final void m3247U0(SVG.AbstractC4780i0 abstractC4780i0) {
        if (abstractC4780i0.f2935b == null || abstractC4780i0.f2917h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (((Matrix) this.f3158g.peek()).invert(matrix)) {
            SVG.C4763b c4763b = abstractC4780i0.f2917h;
            float f6 = c4763b.f2875a;
            float f7 = c4763b.f2876b;
            float fM3003b = c4763b.m3003b();
            SVG.C4763b c4763b2 = abstractC4780i0.f2917h;
            float f8 = c4763b2.f2876b;
            float fM3003b2 = c4763b2.m3003b();
            float fM3004c = abstractC4780i0.f2917h.m3004c();
            SVG.C4763b c4763b3 = abstractC4780i0.f2917h;
            float[] fArr = {f6, f7, fM3003b, f8, fM3003b2, fM3004c, c4763b3.f2875a, c4763b3.m3004c()};
            matrix.preConcat(this.f3152a.getMatrix());
            matrix.mapPoints(fArr);
            float f9 = fArr[0];
            float f10 = fArr[1];
            RectF rectF = new RectF(f9, f10, f9, f10);
            for (int i6 = 2; i6 <= 6; i6 += 2) {
                float f11 = fArr[i6];
                if (f11 < rectF.left) {
                    rectF.left = f11;
                }
                if (f11 > rectF.right) {
                    rectF.right = f11;
                }
                float f12 = fArr[i6 + 1];
                if (f12 < rectF.top) {
                    rectF.top = f12;
                }
                if (f12 > rectF.bottom) {
                    rectF.bottom = f12;
                }
            }
            SVG.AbstractC4780i0 abstractC4780i02 = (SVG.AbstractC4780i0) this.f3157f.peek();
            SVG.C4763b c4763b4 = abstractC4780i02.f2917h;
            if (c4763b4 == null) {
                abstractC4780i02.f2917h = SVG.C4763b.m3002a(rectF.left, rectF.top, rectF.right, rectF.bottom);
            } else {
                c4763b4.m3005d(SVG.C4763b.m3002a(rectF.left, rectF.top, rectF.right, rectF.bottom));
            }
        }
    }

    /* renamed from: V0 */
    public final void m3248V0(h hVar, SVG.Style style) {
        if (m3249W(style, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM)) {
            hVar.f3191a.f2808n = style.f2808n;
        }
        if (m3249W(style, PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH)) {
            hVar.f3191a.f2807m = style.f2807m;
        }
        if (m3249W(style, 1L)) {
            hVar.f3191a.f2796b = style.f2796b;
            SVG.AbstractC4788m0 abstractC4788m0 = style.f2796b;
            hVar.f3192b = (abstractC4788m0 == null || abstractC4788m0 == SVG.C4773f.f2899c) ? false : true;
        }
        if (m3249W(style, 4L)) {
            hVar.f3191a.f2798d = style.f2798d;
        }
        if (m3249W(style, 6149L)) {
            m3237P0(hVar, true, hVar.f3191a.f2796b);
        }
        if (m3249W(style, 2L)) {
            hVar.f3191a.f2797c = style.f2797c;
        }
        if (m3249W(style, 8L)) {
            hVar.f3191a.f2799e = style.f2799e;
            SVG.AbstractC4788m0 abstractC4788m02 = style.f2799e;
            hVar.f3193c = (abstractC4788m02 == null || abstractC4788m02 == SVG.C4773f.f2899c) ? false : true;
        }
        if (m3249W(style, 16L)) {
            hVar.f3191a.f2800f = style.f2800f;
        }
        if (m3249W(style, 6168L)) {
            m3237P0(hVar, false, hVar.f3191a.f2799e);
        }
        if (m3249W(style, 34359738368L)) {
            hVar.f3191a.f2793L = style.f2793L;
        }
        if (m3249W(style, 32L)) {
            SVG.Style style2 = hVar.f3191a;
            SVG.C4791o c4791o = style.f2801g;
            style2.f2801g = c4791o;
            hVar.f3195e.setStrokeWidth(c4791o.m3021e(this));
        }
        if (m3249W(style, 64L)) {
            hVar.f3191a.f2802h = style.f2802h;
            int i6 = a.f3161b[style.f2802h.ordinal()];
            if (i6 == 1) {
                hVar.f3195e.setStrokeCap(Paint.Cap.BUTT);
            } else if (i6 == 2) {
                hVar.f3195e.setStrokeCap(Paint.Cap.ROUND);
            } else if (i6 == 3) {
                hVar.f3195e.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (m3249W(style, 128L)) {
            hVar.f3191a.f2803i = style.f2803i;
            int i7 = a.f3162c[style.f2803i.ordinal()];
            if (i7 == 1) {
                hVar.f3195e.setStrokeJoin(Paint.Join.MITER);
            } else if (i7 == 2) {
                hVar.f3195e.setStrokeJoin(Paint.Join.ROUND);
            } else if (i7 == 3) {
                hVar.f3195e.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (m3249W(style, 256L)) {
            hVar.f3191a.f2804j = style.f2804j;
            hVar.f3195e.setStrokeMiter(style.f2804j.floatValue());
        }
        if (m3249W(style, 512L)) {
            hVar.f3191a.f2805k = style.f2805k;
        }
        if (m3249W(style, PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID)) {
            hVar.f3191a.f2806l = style.f2806l;
        }
        Typeface typefaceM3285t = null;
        if (m3249W(style, 1536L)) {
            SVG.C4791o[] c4791oArr = hVar.f3191a.f2805k;
            if (c4791oArr == null) {
                hVar.f3195e.setPathEffect(null);
            } else {
                int length = c4791oArr.length;
                int i8 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i8];
                float f6 = 0.0f;
                for (int i9 = 0; i9 < i8; i9++) {
                    float fM3021e = hVar.f3191a.f2805k[i9 % length].m3021e(this);
                    fArr[i9] = fM3021e;
                    f6 += fM3021e;
                }
                if (f6 == 0.0f) {
                    hVar.f3195e.setPathEffect(null);
                } else {
                    float fM3021e2 = hVar.f3191a.f2806l.m3021e(this);
                    if (fM3021e2 < 0.0f) {
                        fM3021e2 = (fM3021e2 % f6) + f6;
                    }
                    hVar.f3195e.setPathEffect(new DashPathEffect(fArr, fM3021e2));
                }
            }
        }
        if (m3249W(style, PlaybackStateCompat.ACTION_PREPARE)) {
            float fM3238Q = m3238Q();
            hVar.f3191a.f2810p = style.f2810p;
            hVar.f3194d.setTextSize(style.f2810p.m3022f(this, fM3238Q));
            hVar.f3195e.setTextSize(style.f2810p.m3022f(this, fM3238Q));
        }
        if (m3249W(style, PlaybackStateCompat.ACTION_PLAY_FROM_URI)) {
            hVar.f3191a.f2809o = style.f2809o;
        }
        if (m3249W(style, PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID)) {
            if (style.f2811q.intValue() == -1 && hVar.f3191a.f2811q.intValue() > 100) {
                SVG.Style style3 = hVar.f3191a;
                style3.f2811q = Integer.valueOf(style3.f2811q.intValue() - 100);
            } else if (style.f2811q.intValue() != 1 || hVar.f3191a.f2811q.intValue() >= 900) {
                hVar.f3191a.f2811q = style.f2811q;
            } else {
                SVG.Style style4 = hVar.f3191a;
                style4.f2811q = Integer.valueOf(style4.f2811q.intValue() + 100);
            }
        }
        if (m3249W(style, PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH)) {
            hVar.f3191a.f2812r = style.f2812r;
        }
        if (m3249W(style, 106496L)) {
            if (hVar.f3191a.f2809o != null && this.f3154c != null) {
                SVG.m2981g();
                for (String str : hVar.f3191a.f2809o) {
                    SVG.Style style5 = hVar.f3191a;
                    typefaceM3285t = m3285t(str, style5.f2811q, style5.f2812r);
                    if (typefaceM3285t != null) {
                        break;
                    }
                }
            }
            if (typefaceM3285t == null) {
                SVG.Style style6 = hVar.f3191a;
                typefaceM3285t = m3285t("serif", style6.f2811q, style6.f2812r);
            }
            hVar.f3194d.setTypeface(typefaceM3285t);
            hVar.f3195e.setTypeface(typefaceM3285t);
        }
        if (m3249W(style, PlaybackStateCompat.ACTION_PREPARE_FROM_URI)) {
            hVar.f3191a.f2813s = style.f2813s;
            Paint paint = hVar.f3194d;
            SVG.Style.TextDecoration textDecoration = style.f2813s;
            SVG.Style.TextDecoration textDecoration2 = SVG.Style.TextDecoration.LineThrough;
            paint.setStrikeThruText(textDecoration == textDecoration2);
            Paint paint2 = hVar.f3194d;
            SVG.Style.TextDecoration textDecoration3 = style.f2813s;
            SVG.Style.TextDecoration textDecoration4 = SVG.Style.TextDecoration.Underline;
            paint2.setUnderlineText(textDecoration3 == textDecoration4);
            hVar.f3195e.setStrikeThruText(style.f2813s == textDecoration2);
            hVar.f3195e.setUnderlineText(style.f2813s == textDecoration4);
        }
        if (m3249W(style, 68719476736L)) {
            hVar.f3191a.f2814t = style.f2814t;
        }
        if (m3249W(style, PlaybackStateCompat.ACTION_SET_REPEAT_MODE)) {
            hVar.f3191a.f2815u = style.f2815u;
        }
        if (m3249W(style, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED)) {
            hVar.f3191a.f2816v = style.f2816v;
        }
        if (m3249W(style, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE)) {
            hVar.f3191a.f2818x = style.f2818x;
        }
        if (m3249W(style, 4194304L)) {
            hVar.f3191a.f2819y = style.f2819y;
        }
        if (m3249W(style, 8388608L)) {
            hVar.f3191a.f2820z = style.f2820z;
        }
        if (m3249W(style, 16777216L)) {
            hVar.f3191a.f2782A = style.f2782A;
        }
        if (m3249W(style, 33554432L)) {
            hVar.f3191a.f2783B = style.f2783B;
        }
        if (m3249W(style, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
            hVar.f3191a.f2817w = style.f2817w;
        }
        if (m3249W(style, 268435456L)) {
            hVar.f3191a.f2786E = style.f2786E;
        }
        if (m3249W(style, 536870912L)) {
            hVar.f3191a.f2787F = style.f2787F;
        }
        if (m3249W(style, 1073741824L)) {
            hVar.f3191a.f2788G = style.f2788G;
        }
        if (m3249W(style, 67108864L)) {
            hVar.f3191a.f2784C = style.f2784C;
        }
        if (m3249W(style, 134217728L)) {
            hVar.f3191a.f2785D = style.f2785D;
        }
        if (m3249W(style, 8589934592L)) {
            hVar.f3191a.f2791J = style.f2791J;
        }
        if (m3249W(style, 17179869184L)) {
            hVar.f3191a.f2792K = style.f2792K;
        }
        if (m3249W(style, 137438953472L)) {
            hVar.f3191a.f2794M = style.f2794M;
        }
    }

    /* renamed from: W */
    public final boolean m3249W(SVG.Style style, long j6) {
        return (style.f2795a & j6) != 0;
    }

    /* renamed from: W0 */
    public final void m3250W0(h hVar, SVG.AbstractC4782j0 abstractC4782j0) {
        hVar.f3191a.m2999d(abstractC4782j0.f2935b == null);
        SVG.Style style = abstractC4782j0.f2925e;
        if (style != null) {
            m3248V0(hVar, style);
        }
        if (this.f3154c.m2990j()) {
            for (CSSParser.C4755l c4755l : this.f3154c.m2986d()) {
                if (CSSParser.m2936l(this.f3159h, c4755l.f2735a, abstractC4782j0)) {
                    m3248V0(hVar, c4755l.f2736b);
                }
            }
        }
        SVG.Style style2 = abstractC4782j0.f2926f;
        if (style2 != null) {
            m3248V0(hVar, style2);
        }
    }

    /* renamed from: X */
    public final void m3251X(boolean z6, SVG.C4763b c4763b, SVG.C4784k0 c4784k0) {
        float fM3022f;
        float f6;
        float fM3022f2;
        float f7;
        String str = c4784k0.f2922l;
        if (str != null) {
            m3220H(c4784k0, str);
        }
        Boolean bool = c4784k0.f2919i;
        int i6 = 0;
        boolean z7 = bool != null && bool.booleanValue();
        h hVar = this.f3155d;
        Paint paint = z6 ? hVar.f3194d : hVar.f3195e;
        if (z7) {
            SVG.C4763b c4763bM3242S = m3242S();
            SVG.C4791o c4791o = c4784k0.f2929m;
            float fM3023h = c4791o != null ? c4791o.m3023h(this) : 0.0f;
            SVG.C4791o c4791o2 = c4784k0.f2930n;
            fM3022f = c4791o2 != null ? c4791o2.m3024i(this) : 0.0f;
            SVG.C4791o c4791o3 = c4784k0.f2931o;
            float fM3023h2 = c4791o3 != null ? c4791o3.m3023h(this) : c4763bM3242S.f2877c;
            SVG.C4791o c4791o4 = c4784k0.f2932p;
            f7 = fM3023h2;
            f6 = fM3023h;
            fM3022f2 = c4791o4 != null ? c4791o4.m3024i(this) : 0.0f;
        } else {
            SVG.C4791o c4791o5 = c4784k0.f2929m;
            float fM3022f3 = c4791o5 != null ? c4791o5.m3022f(this, 1.0f) : 0.0f;
            SVG.C4791o c4791o6 = c4784k0.f2930n;
            fM3022f = c4791o6 != null ? c4791o6.m3022f(this, 1.0f) : 0.0f;
            SVG.C4791o c4791o7 = c4784k0.f2931o;
            float fM3022f4 = c4791o7 != null ? c4791o7.m3022f(this, 1.0f) : 1.0f;
            SVG.C4791o c4791o8 = c4784k0.f2932p;
            f6 = fM3022f3;
            fM3022f2 = c4791o8 != null ? c4791o8.m3022f(this, 1.0f) : 0.0f;
            f7 = fM3022f4;
        }
        float f8 = fM3022f;
        m3243S0();
        this.f3155d = m3230M(c4784k0);
        Matrix matrix = new Matrix();
        if (!z7) {
            matrix.preTranslate(c4763b.f2875a, c4763b.f2876b);
            matrix.preScale(c4763b.f2877c, c4763b.f2878d);
        }
        Matrix matrix2 = c4784k0.f2920j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = c4784k0.f2918h.size();
        if (size == 0) {
            m3241R0();
            if (z6) {
                this.f3155d.f3192b = false;
                return;
            } else {
                this.f3155d.f3193c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator it = c4784k0.f2918h.iterator();
        float f9 = -1.0f;
        while (it.hasNext()) {
            SVG.C4767c0 c4767c0 = (SVG.C4767c0) ((SVG.C4786l0) it.next());
            Float f10 = c4767c0.f2888h;
            float fFloatValue = f10 != null ? f10.floatValue() : 0.0f;
            if (i6 == 0 || fFloatValue >= f9) {
                fArr[i6] = fFloatValue;
                f9 = fFloatValue;
            } else {
                fArr[i6] = f9;
            }
            m3243S0();
            m3250W0(this.f3155d, c4767c0);
            SVG.Style style = this.f3155d.f3191a;
            SVG.C4773f c4773f = (SVG.C4773f) style.f2784C;
            if (c4773f == null) {
                c4773f = SVG.C4773f.f2898b;
            }
            iArr[i6] = m3205x(c4773f.f2900a, style.f2785D.floatValue());
            i6++;
            m3241R0();
        }
        if ((f6 == f7 && f8 == fM3022f2) || size == 1) {
            m3241R0();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        SVG.GradientSpread gradientSpread = c4784k0.f2921k;
        if (gradientSpread != null) {
            if (gradientSpread == SVG.GradientSpread.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (gradientSpread == SVG.GradientSpread.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        m3241R0();
        LinearGradient linearGradient = new LinearGradient(f6, f8, f7, fM3022f2, iArr, fArr, tileMode2);
        linearGradient.setLocalMatrix(matrix);
        paint.setShader(linearGradient);
        paint.setAlpha(m3204w(this.f3155d.f3191a.f2798d.floatValue()));
    }

    /* renamed from: X0 */
    public final void m3252X0() {
        int iM3205x;
        SVG.Style style = this.f3155d.f3191a;
        SVG.AbstractC4788m0 abstractC4788m0 = style.f2791J;
        if (abstractC4788m0 instanceof SVG.C4773f) {
            iM3205x = ((SVG.C4773f) abstractC4788m0).f2900a;
        } else if (!(abstractC4788m0 instanceof SVG.C4775g)) {
            return;
        } else {
            iM3205x = style.f2808n.f2900a;
        }
        Float f6 = style.f2792K;
        if (f6 != null) {
            iM3205x = m3205x(iM3205x, f6.floatValue());
        }
        this.f3152a.drawColor(iM3205x);
    }

    /* renamed from: Y */
    public final Path m3253Y(SVG.C4769d c4769d) {
        SVG.C4791o c4791o = c4769d.f2889o;
        float fM3023h = c4791o != null ? c4791o.m3023h(this) : 0.0f;
        SVG.C4791o c4791o2 = c4769d.f2890p;
        float fM3024i = c4791o2 != null ? c4791o2.m3024i(this) : 0.0f;
        float fM3021e = c4769d.f2891q.m3021e(this);
        float f6 = fM3023h - fM3021e;
        float f7 = fM3024i - fM3021e;
        float f8 = fM3023h + fM3021e;
        float f9 = fM3024i + fM3021e;
        if (c4769d.f2917h == null) {
            float f10 = 2.0f * fM3021e;
            c4769d.f2917h = new SVG.C4763b(f6, f7, f10, f10);
        }
        float f11 = fM3021e * 0.5522848f;
        Path path = new Path();
        path.moveTo(fM3023h, f7);
        float f12 = fM3023h + f11;
        float f13 = fM3024i - f11;
        path.cubicTo(f12, f7, f8, f13, f8, fM3024i);
        float f14 = fM3024i + f11;
        path.cubicTo(f8, f14, f12, f9, fM3023h, f9);
        float f15 = fM3023h - f11;
        path.cubicTo(f15, f9, f6, f14, f6, fM3024i);
        path.cubicTo(f6, f13, f15, f7, fM3023h, f7);
        path.close();
        return path;
    }

    /* renamed from: Y0 */
    public final boolean m3254Y0() {
        Boolean bool = this.f3155d.f3191a.f2783B;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: Z */
    public final Path m3255Z(SVG.C4779i c4779i) {
        SVG.C4791o c4791o = c4779i.f2913o;
        float fM3023h = c4791o != null ? c4791o.m3023h(this) : 0.0f;
        SVG.C4791o c4791o2 = c4779i.f2914p;
        float fM3024i = c4791o2 != null ? c4791o2.m3024i(this) : 0.0f;
        float fM3023h2 = c4779i.f2915q.m3023h(this);
        float fM3024i2 = c4779i.f2916r.m3024i(this);
        float f6 = fM3023h - fM3023h2;
        float f7 = fM3024i - fM3024i2;
        float f8 = fM3023h + fM3023h2;
        float f9 = fM3024i + fM3024i2;
        if (c4779i.f2917h == null) {
            c4779i.f2917h = new SVG.C4763b(f6, f7, fM3023h2 * 2.0f, 2.0f * fM3024i2);
        }
        float f10 = fM3023h2 * 0.5522848f;
        float f11 = fM3024i2 * 0.5522848f;
        Path path = new Path();
        path.moveTo(fM3023h, f7);
        float f12 = fM3023h + f10;
        float f13 = fM3024i - f11;
        path.cubicTo(f12, f7, f8, f13, f8, fM3024i);
        float f14 = fM3024i + f11;
        path.cubicTo(f8, f14, f12, f9, fM3023h, f9);
        float f15 = fM3023h - f10;
        path.cubicTo(f15, f9, f6, f14, f6, fM3024i);
        path.cubicTo(f6, f13, f15, f7, fM3023h, f7);
        path.close();
        return path;
    }

    /* renamed from: a0 */
    public final Path m3256a0(SVG.C4793p c4793p) {
        SVG.C4791o c4791o = c4793p.f2950o;
        float fM3023h = c4791o == null ? 0.0f : c4791o.m3023h(this);
        SVG.C4791o c4791o2 = c4793p.f2951p;
        float fM3024i = c4791o2 == null ? 0.0f : c4791o2.m3024i(this);
        SVG.C4791o c4791o3 = c4793p.f2952q;
        float fM3023h2 = c4791o3 == null ? 0.0f : c4791o3.m3023h(this);
        SVG.C4791o c4791o4 = c4793p.f2953r;
        float fM3024i2 = c4791o4 != null ? c4791o4.m3024i(this) : 0.0f;
        if (c4793p.f2917h == null) {
            c4793p.f2917h = new SVG.C4763b(Math.min(fM3023h, fM3023h2), Math.min(fM3024i, fM3024i2), Math.abs(fM3023h2 - fM3023h), Math.abs(fM3024i2 - fM3024i));
        }
        Path path = new Path();
        path.moveTo(fM3023h, fM3024i);
        path.lineTo(fM3023h2, fM3024i2);
        return path;
    }

    /* renamed from: b0 */
    public final Path m3257b0(SVG.C4811y c4811y) {
        Path path = new Path();
        float[] fArr = c4811y.f2990o;
        path.moveTo(fArr[0], fArr[1]);
        int i6 = 2;
        while (true) {
            float[] fArr2 = c4811y.f2990o;
            if (i6 >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i6], fArr2[i6 + 1]);
            i6 += 2;
        }
        if (c4811y instanceof SVG.C4813z) {
            path.close();
        }
        if (c4811y.f2917h == null) {
            c4811y.f2917h = m3271m(path);
        }
        return path;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* renamed from: c0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Path m3258c0(com.caverock.androidsvg.SVG.C4761a0 r20) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.C4824b.m3258c0(com.caverock.androidsvg.SVG$a0):android.graphics.Path");
    }

    /* renamed from: d0 */
    public final Path m3259d0(SVG.C4804u0 c4804u0) {
        List list = c4804u0.f2991o;
        float fM3024i = 0.0f;
        float fM3023h = (list == null || list.size() == 0) ? 0.0f : ((SVG.C4791o) c4804u0.f2991o.get(0)).m3023h(this);
        List list2 = c4804u0.f2992p;
        float fM3024i2 = (list2 == null || list2.size() == 0) ? 0.0f : ((SVG.C4791o) c4804u0.f2992p.get(0)).m3024i(this);
        List list3 = c4804u0.f2993q;
        float fM3023h2 = (list3 == null || list3.size() == 0) ? 0.0f : ((SVG.C4791o) c4804u0.f2993q.get(0)).m3023h(this);
        List list4 = c4804u0.f2994r;
        if (list4 != null && list4.size() != 0) {
            fM3024i = ((SVG.C4791o) c4804u0.f2994r.get(0)).m3024i(this);
        }
        if (this.f3155d.f3191a.f2815u != SVG.Style.TextAnchor.Start) {
            float fM3273n = m3273n(c4804u0);
            if (this.f3155d.f3191a.f2815u == SVG.Style.TextAnchor.Middle) {
                fM3273n /= 2.0f;
            }
            fM3023h -= fM3273n;
        }
        if (c4804u0.f2917h == null) {
            i iVar = new i(fM3023h, fM3024i2);
            m3215E(c4804u0, iVar);
            RectF rectF = iVar.f3202d;
            c4804u0.f2917h = new SVG.C4763b(rectF.left, rectF.top, rectF.width(), iVar.f3202d.height());
        }
        Path path = new Path();
        m3215E(c4804u0, new g(fM3023h + fM3023h2, fM3024i2 + fM3024i, path));
        return path;
    }

    /* renamed from: e0 */
    public final void m3260e0(boolean z6, SVG.C4763b c4763b, SVG.C4792o0 c4792o0) {
        float f6;
        float fM3022f;
        float f7;
        String str = c4792o0.f2922l;
        if (str != null) {
            m3220H(c4792o0, str);
        }
        Boolean bool = c4792o0.f2919i;
        int i6 = 0;
        boolean z7 = bool != null && bool.booleanValue();
        h hVar = this.f3155d;
        Paint paint = z6 ? hVar.f3194d : hVar.f3195e;
        if (z7) {
            SVG.C4791o c4791o = new SVG.C4791o(50.0f, SVG.Unit.percent);
            SVG.C4791o c4791o2 = c4792o0.f2945m;
            float fM3023h = c4791o2 != null ? c4791o2.m3023h(this) : c4791o.m3023h(this);
            SVG.C4791o c4791o3 = c4792o0.f2946n;
            float fM3024i = c4791o3 != null ? c4791o3.m3024i(this) : c4791o.m3024i(this);
            SVG.C4791o c4791o4 = c4792o0.f2947o;
            fM3022f = c4791o4 != null ? c4791o4.m3021e(this) : c4791o.m3021e(this);
            f6 = fM3023h;
            f7 = fM3024i;
        } else {
            SVG.C4791o c4791o5 = c4792o0.f2945m;
            float fM3022f2 = c4791o5 != null ? c4791o5.m3022f(this, 1.0f) : 0.5f;
            SVG.C4791o c4791o6 = c4792o0.f2946n;
            float fM3022f3 = c4791o6 != null ? c4791o6.m3022f(this, 1.0f) : 0.5f;
            SVG.C4791o c4791o7 = c4792o0.f2947o;
            f6 = fM3022f2;
            fM3022f = c4791o7 != null ? c4791o7.m3022f(this, 1.0f) : 0.5f;
            f7 = fM3022f3;
        }
        m3243S0();
        this.f3155d = m3230M(c4792o0);
        Matrix matrix = new Matrix();
        if (!z7) {
            matrix.preTranslate(c4763b.f2875a, c4763b.f2876b);
            matrix.preScale(c4763b.f2877c, c4763b.f2878d);
        }
        Matrix matrix2 = c4792o0.f2920j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = c4792o0.f2918h.size();
        if (size == 0) {
            m3241R0();
            if (z6) {
                this.f3155d.f3192b = false;
                return;
            } else {
                this.f3155d.f3193c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator it = c4792o0.f2918h.iterator();
        float f8 = -1.0f;
        while (it.hasNext()) {
            SVG.C4767c0 c4767c0 = (SVG.C4767c0) ((SVG.C4786l0) it.next());
            Float f9 = c4767c0.f2888h;
            float fFloatValue = f9 != null ? f9.floatValue() : 0.0f;
            if (i6 == 0 || fFloatValue >= f8) {
                fArr[i6] = fFloatValue;
                f8 = fFloatValue;
            } else {
                fArr[i6] = f8;
            }
            m3243S0();
            m3250W0(this.f3155d, c4767c0);
            SVG.Style style = this.f3155d.f3191a;
            SVG.C4773f c4773f = (SVG.C4773f) style.f2784C;
            if (c4773f == null) {
                c4773f = SVG.C4773f.f2898b;
            }
            iArr[i6] = m3205x(c4773f.f2900a, style.f2785D.floatValue());
            i6++;
            m3241R0();
        }
        if (fM3022f == 0.0f || size == 1) {
            m3241R0();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        SVG.GradientSpread gradientSpread = c4792o0.f2921k;
        if (gradientSpread != null) {
            if (gradientSpread == SVG.GradientSpread.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (gradientSpread == SVG.GradientSpread.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        m3241R0();
        RadialGradient radialGradient = new RadialGradient(f6, f7, fM3022f, iArr, fArr, tileMode2);
        radialGradient.setLocalMatrix(matrix);
        paint.setShader(radialGradient);
        paint.setAlpha(m3204w(this.f3155d.f3191a.f2798d.floatValue()));
    }

    /* renamed from: f0 */
    public final SVG.C4763b m3261f0(SVG.C4791o c4791o, SVG.C4791o c4791o2, SVG.C4791o c4791o3, SVG.C4791o c4791o4) {
        float fM3023h = c4791o != null ? c4791o.m3023h(this) : 0.0f;
        float fM3024i = c4791o2 != null ? c4791o2.m3024i(this) : 0.0f;
        SVG.C4763b c4763bM3242S = m3242S();
        return new SVG.C4763b(fM3023h, fM3024i, c4791o3 != null ? c4791o3.m3023h(this) : c4763bM3242S.f2877c, c4791o4 != null ? c4791o4.m3024i(this) : c4763bM3242S.f2878d);
    }

    /* renamed from: g0 */
    public final Path m3262g0(SVG.AbstractC4780i0 abstractC4780i0, boolean z6) {
        Path pathM3259d0;
        Path pathM3265j;
        this.f3156e.push(this.f3155d);
        h hVar = new h(this.f3155d);
        this.f3155d = hVar;
        m3250W0(hVar, abstractC4780i0);
        if (!m3207A() || !m3254Y0()) {
            this.f3155d = (h) this.f3156e.pop();
            return null;
        }
        if (abstractC4780i0 instanceof SVG.C4765b1) {
            if (!z6) {
                m3191F("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            SVG.C4765b1 c4765b1 = (SVG.C4765b1) abstractC4780i0;
            SVG.C4786l0 c4786l0M2994n = abstractC4780i0.f2934a.m2994n(c4765b1.f2879p);
            if (c4786l0M2994n == null) {
                m3191F("Use reference '%s' not found", c4765b1.f2879p);
                this.f3155d = (h) this.f3156e.pop();
                return null;
            }
            if (!(c4786l0M2994n instanceof SVG.AbstractC4780i0)) {
                this.f3155d = (h) this.f3156e.pop();
                return null;
            }
            pathM3259d0 = m3262g0((SVG.AbstractC4780i0) c4786l0M2994n, false);
            if (pathM3259d0 == null) {
                return null;
            }
            if (c4765b1.f2917h == null) {
                c4765b1.f2917h = m3271m(pathM3259d0);
            }
            Matrix matrix = c4765b1.f2933o;
            if (matrix != null) {
                pathM3259d0.transform(matrix);
            }
        } else if (abstractC4780i0 instanceof SVG.AbstractC4783k) {
            SVG.AbstractC4783k abstractC4783k = (SVG.AbstractC4783k) abstractC4780i0;
            if (abstractC4780i0 instanceof SVG.C4803u) {
                pathM3259d0 = new d(((SVG.C4803u) abstractC4780i0).f2972o).m3298c();
                if (abstractC4780i0.f2917h == null) {
                    abstractC4780i0.f2917h = m3271m(pathM3259d0);
                }
            } else {
                pathM3259d0 = abstractC4780i0 instanceof SVG.C4761a0 ? m3258c0((SVG.C4761a0) abstractC4780i0) : abstractC4780i0 instanceof SVG.C4769d ? m3253Y((SVG.C4769d) abstractC4780i0) : abstractC4780i0 instanceof SVG.C4779i ? m3255Z((SVG.C4779i) abstractC4780i0) : abstractC4780i0 instanceof SVG.C4811y ? m3257b0((SVG.C4811y) abstractC4780i0) : null;
            }
            if (pathM3259d0 == null) {
                return null;
            }
            if (abstractC4783k.f2917h == null) {
                abstractC4783k.f2917h = m3271m(pathM3259d0);
            }
            Matrix matrix2 = abstractC4783k.f2928n;
            if (matrix2 != null) {
                pathM3259d0.transform(matrix2);
            }
            pathM3259d0.setFillType(m3236P());
        } else {
            if (!(abstractC4780i0 instanceof SVG.C4804u0)) {
                m3191F("Invalid %s element found in clipPath definition", abstractC4780i0.mo3000n());
                return null;
            }
            SVG.C4804u0 c4804u0 = (SVG.C4804u0) abstractC4780i0;
            pathM3259d0 = m3259d0(c4804u0);
            if (pathM3259d0 == null) {
                return null;
            }
            Matrix matrix3 = c4804u0.f2974s;
            if (matrix3 != null) {
                pathM3259d0.transform(matrix3);
            }
            pathM3259d0.setFillType(m3236P());
        }
        if (this.f3155d.f3191a.f2786E != null && (pathM3265j = m3265j(abstractC4780i0, abstractC4780i0.f2917h)) != null) {
            pathM3259d0.op(pathM3265j, Path.Op.INTERSECT);
        }
        this.f3155d = (h) this.f3156e.pop();
        return pathM3259d0;
    }

    /* renamed from: h0 */
    public final void m3263h0() {
        this.f3157f.pop();
        this.f3158g.pop();
    }

    /* renamed from: i0 */
    public final void m3264i0(SVG.InterfaceC4778h0 interfaceC4778h0) {
        this.f3157f.push(interfaceC4778h0);
        this.f3158g.push(this.f3152a.getMatrix());
    }

    /* renamed from: j */
    public final Path m3265j(SVG.AbstractC4780i0 abstractC4780i0, SVG.C4763b c4763b) {
        Path pathM3262g0;
        SVG.C4786l0 c4786l0M2994n = abstractC4780i0.f2934a.m2994n(this.f3155d.f3191a.f2786E);
        if (c4786l0M2994n == null) {
            m3191F("ClipPath reference '%s' not found", this.f3155d.f3191a.f2786E);
            return null;
        }
        SVG.C4771e c4771e = (SVG.C4771e) c4786l0M2994n;
        this.f3156e.push(this.f3155d);
        this.f3155d = m3230M(c4771e);
        Boolean bool = c4771e.f2897p;
        boolean z6 = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z6) {
            matrix.preTranslate(c4763b.f2875a, c4763b.f2876b);
            matrix.preScale(c4763b.f2877c, c4763b.f2878d);
        }
        Matrix matrix2 = c4771e.f2933o;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (SVG.C4786l0 c4786l0 : c4771e.f2901i) {
            if ((c4786l0 instanceof SVG.AbstractC4780i0) && (pathM3262g0 = m3262g0((SVG.AbstractC4780i0) c4786l0, true)) != null) {
                path.op(pathM3262g0, Path.Op.UNION);
            }
        }
        if (this.f3155d.f3191a.f2786E != null) {
            if (c4771e.f2917h == null) {
                c4771e.f2917h = m3271m(path);
            }
            Path pathM3265j = m3265j(c4771e, c4771e.f2917h);
            if (pathM3265j != null) {
                path.op(pathM3265j, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f3155d = (h) this.f3156e.pop();
        return path;
    }

    /* renamed from: j0 */
    public final void m3266j0(SVG.AbstractC4780i0 abstractC4780i0) {
        m3268k0(abstractC4780i0, abstractC4780i0.f2917h);
    }

    /* renamed from: k */
    public final List m3267k(SVG.C4793p c4793p) {
        SVG.C4791o c4791o = c4793p.f2950o;
        float fM3023h = c4791o != null ? c4791o.m3023h(this) : 0.0f;
        SVG.C4791o c4791o2 = c4793p.f2951p;
        float fM3024i = c4791o2 != null ? c4791o2.m3024i(this) : 0.0f;
        SVG.C4791o c4791o3 = c4793p.f2952q;
        float fM3023h2 = c4791o3 != null ? c4791o3.m3023h(this) : 0.0f;
        SVG.C4791o c4791o4 = c4793p.f2953r;
        float fM3024i2 = c4791o4 != null ? c4791o4.m3024i(this) : 0.0f;
        ArrayList arrayList = new ArrayList(2);
        float f6 = fM3023h2 - fM3023h;
        float f7 = fM3024i2 - fM3024i;
        arrayList.add(new c(fM3023h, fM3024i, f6, f7));
        arrayList.add(new c(fM3023h2, fM3024i2, f6, f7));
        return arrayList;
    }

    /* renamed from: k0 */
    public final void m3268k0(SVG.AbstractC4780i0 abstractC4780i0, SVG.C4763b c4763b) {
        if (this.f3155d.f3191a.f2788G != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            this.f3152a.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            this.f3152a.saveLayer(null, paint2, 31);
            SVG.C4797r c4797r = (SVG.C4797r) this.f3154c.m2994n(this.f3155d.f3191a.f2788G);
            m3225J0(c4797r, abstractC4780i0, c4763b);
            this.f3152a.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            this.f3152a.saveLayer(null, paint3, 31);
            m3225J0(c4797r, abstractC4780i0, c4763b);
            this.f3152a.restore();
            this.f3152a.restore();
        }
        m3241R0();
    }

    /* renamed from: l */
    public final List m3269l(SVG.C4811y c4811y) {
        int length = c4811y.f2990o.length;
        int i6 = 2;
        if (length < 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        float[] fArr = c4811y.f2990o;
        c cVar = new c(fArr[0], fArr[1], 0.0f, 0.0f);
        float f6 = 0.0f;
        float f7 = 0.0f;
        while (i6 < length) {
            float[] fArr2 = c4811y.f2990o;
            float f8 = fArr2[i6];
            float f9 = fArr2[i6 + 1];
            cVar.m3296a(f8, f9);
            arrayList.add(cVar);
            i6 += 2;
            cVar = new c(f8, f9, f8 - cVar.f3172a, f9 - cVar.f3173b);
            f6 = f8;
            f7 = f9;
        }
        if (!(c4811y instanceof SVG.C4813z)) {
            arrayList.add(cVar);
            return arrayList;
        }
        float[] fArr3 = c4811y.f2990o;
        float f10 = fArr3[0];
        if (f6 != f10) {
            float f11 = fArr3[1];
            if (f7 != f11) {
                cVar.m3296a(f10, f11);
                arrayList.add(cVar);
                c cVar2 = new c(f10, f11, f10 - cVar.f3172a, f11 - cVar.f3173b);
                cVar2.m3297b((c) arrayList.get(0));
                arrayList.add(cVar2);
                arrayList.set(0, cVar2);
            }
        }
        return arrayList;
    }

    /* renamed from: l0 */
    public final void m3270l0(SVG.C4786l0 c4786l0, j jVar) {
        float f6;
        float fM3024i;
        float fM3023h;
        SVG.Style.TextAnchor textAnchorM3234O;
        if (jVar.mo3300a((SVG.AbstractC4808w0) c4786l0)) {
            if (c4786l0 instanceof SVG.C4810x0) {
                m3243S0();
                m3229L0((SVG.C4810x0) c4786l0);
                m3241R0();
                return;
            }
            if (!(c4786l0 instanceof SVG.C4802t0)) {
                if (c4786l0 instanceof SVG.C4800s0) {
                    m3243S0();
                    SVG.C4800s0 c4800s0 = (SVG.C4800s0) c4786l0;
                    m3250W0(this.f3155d, c4800s0);
                    if (m3207A()) {
                        m3281r((SVG.AbstractC4780i0) c4800s0.mo3001d());
                        SVG.C4786l0 c4786l0M2994n = c4786l0.f2934a.m2994n(c4800s0.f2967o);
                        if (c4786l0M2994n == null || !(c4786l0M2994n instanceof SVG.AbstractC4808w0)) {
                            m3191F("Tref reference '%s' not found", c4800s0.f2967o);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            m3218G((SVG.AbstractC4808w0) c4786l0M2994n, sb);
                            if (sb.length() > 0) {
                                jVar.mo3299b(sb.toString());
                            }
                        }
                    }
                    m3241R0();
                    return;
                }
                return;
            }
            m3206y("TSpan render", new Object[0]);
            m3243S0();
            SVG.C4802t0 c4802t0 = (SVG.C4802t0) c4786l0;
            m3250W0(this.f3155d, c4802t0);
            if (m3207A()) {
                List list = c4802t0.f2991o;
                boolean z6 = list != null && list.size() > 0;
                boolean z7 = jVar instanceof f;
                float fM3024i2 = 0.0f;
                if (z7) {
                    float fM3023h2 = !z6 ? ((f) jVar).f3184b : ((SVG.C4791o) c4802t0.f2991o.get(0)).m3023h(this);
                    List list2 = c4802t0.f2992p;
                    fM3024i = (list2 == null || list2.size() == 0) ? ((f) jVar).f3185c : ((SVG.C4791o) c4802t0.f2992p.get(0)).m3024i(this);
                    List list3 = c4802t0.f2993q;
                    fM3023h = (list3 == null || list3.size() == 0) ? 0.0f : ((SVG.C4791o) c4802t0.f2993q.get(0)).m3023h(this);
                    List list4 = c4802t0.f2994r;
                    if (list4 != null && list4.size() != 0) {
                        fM3024i2 = ((SVG.C4791o) c4802t0.f2994r.get(0)).m3024i(this);
                    }
                    f6 = fM3024i2;
                    fM3024i2 = fM3023h2;
                } else {
                    f6 = 0.0f;
                    fM3024i = 0.0f;
                    fM3023h = 0.0f;
                }
                if (z6 && (textAnchorM3234O = m3234O()) != SVG.Style.TextAnchor.Start) {
                    float fM3273n = m3273n(c4802t0);
                    if (textAnchorM3234O == SVG.Style.TextAnchor.Middle) {
                        fM3273n /= 2.0f;
                    }
                    fM3024i2 -= fM3273n;
                }
                m3281r((SVG.AbstractC4780i0) c4802t0.mo3001d());
                if (z7) {
                    f fVar = (f) jVar;
                    fVar.f3184b = fM3024i2 + fM3023h;
                    fVar.f3185c = fM3024i + f6;
                }
                boolean zM3272m0 = m3272m0();
                m3215E(c4802t0, jVar);
                if (zM3272m0) {
                    m3266j0(c4802t0);
                }
            }
            m3241R0();
        }
    }

    /* renamed from: m */
    public final SVG.C4763b m3271m(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new SVG.C4763b(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* renamed from: m0 */
    public final boolean m3272m0() {
        SVG.C4786l0 c4786l0M2994n;
        if (!m3231M0()) {
            return false;
        }
        this.f3152a.saveLayerAlpha(null, m3204w(this.f3155d.f3191a.f2807m.floatValue()), 31);
        this.f3156e.push(this.f3155d);
        h hVar = new h(this.f3155d);
        this.f3155d = hVar;
        String str = hVar.f3191a.f2788G;
        if (str != null && ((c4786l0M2994n = this.f3154c.m2994n(str)) == null || !(c4786l0M2994n instanceof SVG.C4797r))) {
            m3191F("Mask reference '%s' not found", this.f3155d.f3191a.f2788G);
            this.f3155d.f3191a.f2788G = null;
        }
        return true;
    }

    /* renamed from: n */
    public final float m3273n(SVG.AbstractC4808w0 abstractC4808w0) {
        k kVar = new k(this, null);
        m3215E(abstractC4808w0, kVar);
        return kVar.f3205b;
    }

    /* renamed from: n0 */
    public final c m3274n0(c cVar, c cVar2, c cVar3) {
        float fM3213D = m3213D(cVar2.f3174c, cVar2.f3175d, cVar2.f3172a - cVar.f3172a, cVar2.f3173b - cVar.f3173b);
        if (fM3213D == 0.0f) {
            fM3213D = m3213D(cVar2.f3174c, cVar2.f3175d, cVar3.f3172a - cVar2.f3172a, cVar3.f3173b - cVar2.f3173b);
        }
        if (fM3213D > 0.0f || (fM3213D == 0.0f && (cVar2.f3174c > 0.0f || cVar2.f3175d >= 0.0f))) {
            return cVar2;
        }
        cVar2.f3174c = -cVar2.f3174c;
        cVar2.f3175d = -cVar2.f3175d;
        return cVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r12 != 8) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Matrix m3275o(com.caverock.androidsvg.SVG.C4763b r10, com.caverock.androidsvg.SVG.C4763b r11, com.caverock.androidsvg.PreserveAspectRatio r12) {
        /*
            r9 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r12 == 0) goto L9d
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r1 = r12.m2979a()
            if (r1 != 0) goto Lf
            goto L9d
        Lf:
            float r1 = r10.f2877c
            float r2 = r11.f2877c
            float r1 = r1 / r2
            float r2 = r10.f2878d
            float r3 = r11.f2878d
            float r2 = r2 / r3
            float r3 = r11.f2875a
            float r3 = -r3
            float r4 = r11.f2876b
            float r4 = -r4
            com.caverock.androidsvg.PreserveAspectRatio r5 = com.caverock.androidsvg.PreserveAspectRatio.f2747d
            boolean r5 = r12.equals(r5)
            if (r5 == 0) goto L35
            float r11 = r10.f2875a
            float r10 = r10.f2876b
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r2)
            r0.preTranslate(r3, r4)
            return r0
        L35:
            com.caverock.androidsvg.PreserveAspectRatio$Scale r5 = r12.m2980b()
            com.caverock.androidsvg.PreserveAspectRatio$Scale r6 = com.caverock.androidsvg.PreserveAspectRatio.Scale.slice
            if (r5 != r6) goto L42
            float r1 = java.lang.Math.max(r1, r2)
            goto L46
        L42:
            float r1 = java.lang.Math.min(r1, r2)
        L46:
            float r2 = r10.f2877c
            float r2 = r2 / r1
            float r5 = r10.f2878d
            float r5 = r5 / r1
            int[] r6 = com.caverock.androidsvg.C4824b.a.f3160a
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r7 = r12.m2979a()
            int r7 = r7.ordinal()
            r7 = r6[r7]
            r8 = 1073741824(0x40000000, float:2.0)
            switch(r7) {
                case 1: goto L63;
                case 2: goto L63;
                case 3: goto L63;
                case 4: goto L5e;
                case 5: goto L5e;
                case 6: goto L5e;
                default: goto L5d;
            }
        L5d:
            goto L68
        L5e:
            float r7 = r11.f2877c
            float r7 = r7 - r2
        L61:
            float r3 = r3 - r7
            goto L68
        L63:
            float r7 = r11.f2877c
            float r7 = r7 - r2
            float r7 = r7 / r8
            goto L61
        L68:
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r12 = r12.m2979a()
            int r12 = r12.ordinal()
            r12 = r6[r12]
            r2 = 2
            if (r12 == r2) goto L8b
            r2 = 3
            if (r12 == r2) goto L86
            r2 = 5
            if (r12 == r2) goto L8b
            r2 = 6
            if (r12 == r2) goto L86
            r2 = 7
            if (r12 == r2) goto L8b
            r2 = 8
            if (r12 == r2) goto L86
            goto L90
        L86:
            float r11 = r11.f2878d
            float r11 = r11 - r5
        L89:
            float r4 = r4 - r11
            goto L90
        L8b:
            float r11 = r11.f2878d
            float r11 = r11 - r5
            float r11 = r11 / r8
            goto L89
        L90:
            float r11 = r10.f2875a
            float r10 = r10.f2876b
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r1)
            r0.preTranslate(r3, r4)
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.C4824b.m3275o(com.caverock.androidsvg.SVG$b, com.caverock.androidsvg.SVG$b, com.caverock.androidsvg.PreserveAspectRatio):android.graphics.Matrix");
    }

    /* renamed from: o0 */
    public final void m3276o0(SVG.C4769d c4769d) {
        m3206y("Circle render", new Object[0]);
        SVG.C4791o c4791o = c4769d.f2891q;
        if (c4791o == null || c4791o.m3026k()) {
            return;
        }
        m3250W0(this.f3155d, c4769d);
        if (m3207A() && m3254Y0()) {
            Matrix matrix = c4769d.f2928n;
            if (matrix != null) {
                this.f3152a.concat(matrix);
            }
            Path pathM3253Y = m3253Y(c4769d);
            m3247U0(c4769d);
            m3281r(c4769d);
            m3277p(c4769d);
            boolean zM3272m0 = m3272m0();
            if (this.f3155d.f3192b) {
                m3209B(c4769d, pathM3253Y);
            }
            if (this.f3155d.f3193c) {
                m3211C(pathM3253Y);
            }
            if (zM3272m0) {
                m3266j0(c4769d);
            }
        }
    }

    /* renamed from: p */
    public final void m3277p(SVG.AbstractC4780i0 abstractC4780i0) {
        m3279q(abstractC4780i0, abstractC4780i0.f2917h);
    }

    /* renamed from: p0 */
    public final void m3278p0(SVG.C4779i c4779i) {
        m3206y("Ellipse render", new Object[0]);
        SVG.C4791o c4791o = c4779i.f2915q;
        if (c4791o == null || c4779i.f2916r == null || c4791o.m3026k() || c4779i.f2916r.m3026k()) {
            return;
        }
        m3250W0(this.f3155d, c4779i);
        if (m3207A() && m3254Y0()) {
            Matrix matrix = c4779i.f2928n;
            if (matrix != null) {
                this.f3152a.concat(matrix);
            }
            Path pathM3255Z = m3255Z(c4779i);
            m3247U0(c4779i);
            m3281r(c4779i);
            m3277p(c4779i);
            boolean zM3272m0 = m3272m0();
            if (this.f3155d.f3192b) {
                m3209B(c4779i, pathM3255Z);
            }
            if (this.f3155d.f3193c) {
                m3211C(pathM3255Z);
            }
            if (zM3272m0) {
                m3266j0(c4779i);
            }
        }
    }

    /* renamed from: q */
    public final void m3279q(SVG.AbstractC4780i0 abstractC4780i0, SVG.C4763b c4763b) {
        Path pathM3265j;
        if (this.f3155d.f3191a.f2786E == null || (pathM3265j = m3265j(abstractC4780i0, c4763b)) == null) {
            return;
        }
        this.f3152a.clipPath(pathM3265j);
    }

    /* renamed from: q0 */
    public final void m3280q0(SVG.C4785l c4785l) {
        m3206y("Group render", new Object[0]);
        m3250W0(this.f3155d, c4785l);
        if (m3207A()) {
            Matrix matrix = c4785l.f2933o;
            if (matrix != null) {
                this.f3152a.concat(matrix);
            }
            m3277p(c4785l);
            boolean zM3272m0 = m3272m0();
            m3217F0(c4785l, true);
            if (zM3272m0) {
                m3266j0(c4785l);
            }
            m3247U0(c4785l);
        }
    }

    /* renamed from: r */
    public final void m3281r(SVG.AbstractC4780i0 abstractC4780i0) {
        SVG.AbstractC4788m0 abstractC4788m0 = this.f3155d.f3191a.f2796b;
        if (abstractC4788m0 instanceof SVG.C4801t) {
            m3293z(true, abstractC4780i0.f2917h, (SVG.C4801t) abstractC4788m0);
        }
        SVG.AbstractC4788m0 abstractC4788m02 = this.f3155d.f3191a.f2799e;
        if (abstractC4788m02 instanceof SVG.C4801t) {
            m3293z(false, abstractC4780i0.f2917h, (SVG.C4801t) abstractC4788m02);
        }
    }

    /* renamed from: r0 */
    public final void m3282r0(SVG.C4789n c4789n) {
        SVG.C4791o c4791o;
        String str;
        m3206y("Image render", new Object[0]);
        SVG.C4791o c4791o2 = c4789n.f2939s;
        if (c4791o2 == null || c4791o2.m3026k() || (c4791o = c4789n.f2940t) == null || c4791o.m3026k() || (str = c4789n.f2936p) == null) {
            return;
        }
        PreserveAspectRatio preserveAspectRatio = c4789n.f2942o;
        if (preserveAspectRatio == null) {
            preserveAspectRatio = PreserveAspectRatio.f2748e;
        }
        Bitmap bitmapM3283s = m3283s(str);
        if (bitmapM3283s == null) {
            SVG.m2981g();
            return;
        }
        SVG.C4763b c4763b = new SVG.C4763b(0.0f, 0.0f, bitmapM3283s.getWidth(), bitmapM3283s.getHeight());
        m3250W0(this.f3155d, c4789n);
        if (m3207A() && m3254Y0()) {
            Matrix matrix = c4789n.f2941u;
            if (matrix != null) {
                this.f3152a.concat(matrix);
            }
            SVG.C4791o c4791o3 = c4789n.f2937q;
            float fM3023h = c4791o3 != null ? c4791o3.m3023h(this) : 0.0f;
            SVG.C4791o c4791o4 = c4789n.f2938r;
            this.f3155d.f3196f = new SVG.C4763b(fM3023h, c4791o4 != null ? c4791o4.m3024i(this) : 0.0f, c4789n.f2939s.m3023h(this), c4789n.f2940t.m3023h(this));
            if (!this.f3155d.f3191a.f2816v.booleanValue()) {
                SVG.C4763b c4763b2 = this.f3155d.f3196f;
                m3235O0(c4763b2.f2875a, c4763b2.f2876b, c4763b2.f2877c, c4763b2.f2878d);
            }
            c4789n.f2917h = this.f3155d.f3196f;
            m3247U0(c4789n);
            m3277p(c4789n);
            boolean zM3272m0 = m3272m0();
            m3252X0();
            this.f3152a.save();
            this.f3152a.concat(m3275o(this.f3155d.f3196f, c4763b, preserveAspectRatio));
            this.f3152a.drawBitmap(bitmapM3283s, 0.0f, 0.0f, new Paint(this.f3155d.f3191a.f2794M != SVG.Style.RenderQuality.optimizeSpeed ? 2 : 0));
            this.f3152a.restore();
            if (zM3272m0) {
                m3266j0(c4789n);
            }
        }
    }

    /* renamed from: s */
    public final Bitmap m3283s(String str) {
        int iIndexOf;
        if (!str.startsWith("data:") || str.length() < 14 || (iIndexOf = str.indexOf(44)) < 12 || !";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Exception e6) {
            Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e6);
            return null;
        }
    }

    /* renamed from: s0 */
    public final void m3284s0(SVG.C4793p c4793p) {
        m3206y("Line render", new Object[0]);
        m3250W0(this.f3155d, c4793p);
        if (m3207A() && m3254Y0() && this.f3155d.f3193c) {
            Matrix matrix = c4793p.f2928n;
            if (matrix != null) {
                this.f3152a.concat(matrix);
            }
            Path pathM3256a0 = m3256a0(c4793p);
            m3247U0(c4793p);
            m3281r(c4793p);
            m3277p(c4793p);
            boolean zM3272m0 = m3272m0();
            m3211C(pathM3256a0);
            m3223I0(c4793p);
            if (zM3272m0) {
                m3266j0(c4793p);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Typeface m3285t(java.lang.String r6, java.lang.Integer r7, com.caverock.androidsvg.SVG.Style.FontStyle r8) {
        /*
            r5 = this;
            com.caverock.androidsvg.SVG$Style$FontStyle r0 = com.caverock.androidsvg.SVG.Style.FontStyle.Italic
            r1 = 0
            r2 = 1
            if (r8 != r0) goto L8
            r8 = r2
            goto L9
        L8:
            r8 = r1
        L9:
            int r7 = r7.intValue()
            r0 = 500(0x1f4, float:7.0E-43)
            r3 = 2
            r4 = 3
            if (r7 <= r0) goto L19
            if (r8 == 0) goto L17
            r7 = r4
            goto L1e
        L17:
            r7 = r2
            goto L1e
        L19:
            if (r8 == 0) goto L1d
            r7 = r3
            goto L1e
        L1d:
            r7 = r1
        L1e:
            r6.getClass()
            int r8 = r6.hashCode()
            r0 = -1
            switch(r8) {
                case -1536685117: goto L57;
                case -1431958525: goto L4c;
                case -1081737434: goto L41;
                case 109326717: goto L36;
                case 1126973893: goto L2b;
                default: goto L29;
            }
        L29:
            r1 = r0
            goto L60
        L2b:
            java.lang.String r8 = "cursive"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L34
            goto L29
        L34:
            r1 = 4
            goto L60
        L36:
            java.lang.String r8 = "serif"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L3f
            goto L29
        L3f:
            r1 = r4
            goto L60
        L41:
            java.lang.String r8 = "fantasy"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L4a
            goto L29
        L4a:
            r1 = r3
            goto L60
        L4c:
            java.lang.String r8 = "monospace"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L55
            goto L29
        L55:
            r1 = r2
            goto L60
        L57:
            java.lang.String r8 = "sans-serif"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L60
            goto L29
        L60:
            switch(r1) {
                case 0: goto L81;
                case 1: goto L7a;
                case 2: goto L73;
                case 3: goto L6c;
                case 4: goto L65;
                default: goto L63;
            }
        L63:
            r6 = 0
            return r6
        L65:
            android.graphics.Typeface r6 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
            return r6
        L6c:
            android.graphics.Typeface r6 = android.graphics.Typeface.SERIF
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
            return r6
        L73:
            android.graphics.Typeface r6 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
            return r6
        L7a:
            android.graphics.Typeface r6 = android.graphics.Typeface.MONOSPACE
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
            return r6
        L81:
            android.graphics.Typeface r6 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.C4824b.m3285t(java.lang.String, java.lang.Integer, com.caverock.androidsvg.SVG$Style$FontStyle):android.graphics.Typeface");
    }

    /* renamed from: t0 */
    public final void m3286t0(SVG.C4803u c4803u) {
        m3206y("Path render", new Object[0]);
        if (c4803u.f2972o == null) {
            return;
        }
        m3250W0(this.f3155d, c4803u);
        if (m3207A() && m3254Y0()) {
            h hVar = this.f3155d;
            if (hVar.f3193c || hVar.f3192b) {
                Matrix matrix = c4803u.f2928n;
                if (matrix != null) {
                    this.f3152a.concat(matrix);
                }
                Path pathM3298c = new d(c4803u.f2972o).m3298c();
                if (c4803u.f2917h == null) {
                    c4803u.f2917h = m3271m(pathM3298c);
                }
                m3247U0(c4803u);
                m3281r(c4803u);
                m3277p(c4803u);
                boolean zM3272m0 = m3272m0();
                if (this.f3155d.f3192b) {
                    pathM3298c.setFillType(m3246U());
                    m3209B(c4803u, pathM3298c);
                }
                if (this.f3155d.f3193c) {
                    m3211C(pathM3298c);
                }
                m3223I0(c4803u);
                if (zM3272m0) {
                    m3266j0(c4803u);
                }
            }
        }
    }

    /* renamed from: u */
    public final void m3287u(SVG.C4786l0 c4786l0) {
        Boolean bool;
        if ((c4786l0 instanceof SVG.AbstractC4782j0) && (bool = ((SVG.AbstractC4782j0) c4786l0).f2924d) != null) {
            this.f3155d.f3198h = bool.booleanValue();
        }
    }

    /* renamed from: u0 */
    public final void m3288u0(SVG.C4811y c4811y) {
        m3206y("PolyLine render", new Object[0]);
        m3250W0(this.f3155d, c4811y);
        if (m3207A() && m3254Y0()) {
            h hVar = this.f3155d;
            if (hVar.f3193c || hVar.f3192b) {
                Matrix matrix = c4811y.f2928n;
                if (matrix != null) {
                    this.f3152a.concat(matrix);
                }
                if (c4811y.f2990o.length < 2) {
                    return;
                }
                Path pathM3257b0 = m3257b0(c4811y);
                m3247U0(c4811y);
                pathM3257b0.setFillType(m3246U());
                m3281r(c4811y);
                m3277p(c4811y);
                boolean zM3272m0 = m3272m0();
                if (this.f3155d.f3192b) {
                    m3209B(c4811y, pathM3257b0);
                }
                if (this.f3155d.f3193c) {
                    m3211C(pathM3257b0);
                }
                m3223I0(c4811y);
                if (zM3272m0) {
                    m3266j0(c4811y);
                }
            }
        }
    }

    /* renamed from: v0 */
    public final void m3289v0(SVG.C4813z c4813z) {
        m3206y("Polygon render", new Object[0]);
        m3250W0(this.f3155d, c4813z);
        if (m3207A() && m3254Y0()) {
            h hVar = this.f3155d;
            if (hVar.f3193c || hVar.f3192b) {
                Matrix matrix = c4813z.f2928n;
                if (matrix != null) {
                    this.f3152a.concat(matrix);
                }
                if (c4813z.f2990o.length < 2) {
                    return;
                }
                Path pathM3257b0 = m3257b0(c4813z);
                m3247U0(c4813z);
                m3281r(c4813z);
                m3277p(c4813z);
                boolean zM3272m0 = m3272m0();
                if (this.f3155d.f3192b) {
                    m3209B(c4813z, pathM3257b0);
                }
                if (this.f3155d.f3193c) {
                    m3211C(pathM3257b0);
                }
                m3223I0(c4813z);
                if (zM3272m0) {
                    m3266j0(c4813z);
                }
            }
        }
    }

    /* renamed from: w0 */
    public final void m3290w0(SVG.C4761a0 c4761a0) {
        m3206y("Rect render", new Object[0]);
        SVG.C4791o c4791o = c4761a0.f2869q;
        if (c4791o == null || c4761a0.f2870r == null || c4791o.m3026k() || c4761a0.f2870r.m3026k()) {
            return;
        }
        m3250W0(this.f3155d, c4761a0);
        if (m3207A() && m3254Y0()) {
            Matrix matrix = c4761a0.f2928n;
            if (matrix != null) {
                this.f3152a.concat(matrix);
            }
            Path pathM3258c0 = m3258c0(c4761a0);
            m3247U0(c4761a0);
            m3281r(c4761a0);
            m3277p(c4761a0);
            boolean zM3272m0 = m3272m0();
            if (this.f3155d.f3192b) {
                m3209B(c4761a0, pathM3258c0);
            }
            if (this.f3155d.f3193c) {
                m3211C(pathM3258c0);
            }
            if (zM3272m0) {
                m3266j0(c4761a0);
            }
        }
    }

    /* renamed from: x0 */
    public final void m3291x0(SVG.C4770d0 c4770d0) {
        m3294z0(c4770d0, m3261f0(c4770d0.f2892q, c4770d0.f2893r, c4770d0.f2894s, c4770d0.f2895t), c4770d0.f2954p, c4770d0.f2942o);
    }

    /* renamed from: y0 */
    public final void m3292y0(SVG.C4770d0 c4770d0, SVG.C4763b c4763b) {
        m3294z0(c4770d0, c4763b, c4770d0.f2954p, c4770d0.f2942o);
    }

    /* renamed from: z */
    public final void m3293z(boolean z6, SVG.C4763b c4763b, SVG.C4801t c4801t) {
        SVG.C4786l0 c4786l0M2994n = this.f3154c.m2994n(c4801t.f2969a);
        if (c4786l0M2994n == null) {
            m3191F("%s reference '%s' not found", z6 ? "Fill" : "Stroke", c4801t.f2969a);
            SVG.AbstractC4788m0 abstractC4788m0 = c4801t.f2970b;
            if (abstractC4788m0 != null) {
                m3237P0(this.f3155d, z6, abstractC4788m0);
                return;
            } else if (z6) {
                this.f3155d.f3192b = false;
                return;
            } else {
                this.f3155d.f3193c = false;
                return;
            }
        }
        if (c4786l0M2994n instanceof SVG.C4784k0) {
            m3251X(z6, c4763b, (SVG.C4784k0) c4786l0M2994n);
        } else if (c4786l0M2994n instanceof SVG.C4792o0) {
            m3260e0(z6, c4763b, (SVG.C4792o0) c4786l0M2994n);
        } else if (c4786l0M2994n instanceof SVG.C4764b0) {
            m3239Q0(z6, (SVG.C4764b0) c4786l0M2994n);
        }
    }

    /* renamed from: z0 */
    public final void m3294z0(SVG.C4770d0 c4770d0, SVG.C4763b c4763b, SVG.C4763b c4763b2, PreserveAspectRatio preserveAspectRatio) {
        m3206y("Svg render", new Object[0]);
        if (c4763b.f2877c == 0.0f || c4763b.f2878d == 0.0f) {
            return;
        }
        if (preserveAspectRatio == null && (preserveAspectRatio = c4770d0.f2942o) == null) {
            preserveAspectRatio = PreserveAspectRatio.f2748e;
        }
        m3250W0(this.f3155d, c4770d0);
        if (m3207A()) {
            h hVar = this.f3155d;
            hVar.f3196f = c4763b;
            if (!hVar.f3191a.f2816v.booleanValue()) {
                SVG.C4763b c4763b3 = this.f3155d.f3196f;
                m3235O0(c4763b3.f2875a, c4763b3.f2876b, c4763b3.f2877c, c4763b3.f2878d);
            }
            m3279q(c4770d0, this.f3155d.f3196f);
            if (c4763b2 != null) {
                this.f3152a.concat(m3275o(this.f3155d.f3196f, c4763b2, preserveAspectRatio));
                this.f3155d.f3197g = c4770d0.f2954p;
            } else {
                Canvas canvas = this.f3152a;
                SVG.C4763b c4763b4 = this.f3155d.f3196f;
                canvas.translate(c4763b4.f2875a, c4763b4.f2876b);
            }
            boolean zM3272m0 = m3272m0();
            m3252X0();
            m3217F0(c4770d0, true);
            if (zM3272m0) {
                m3266j0(c4770d0);
            }
            m3247U0(c4770d0);
        }
    }

    /* renamed from: com.caverock.androidsvg.b$k */
    public class k extends j {

        /* renamed from: b */
        public float f3205b;

        public k() {
            super(C4824b.this, null);
            this.f3205b = 0.0f;
        }

        @Override // com.caverock.androidsvg.C4824b.j
        /* renamed from: b */
        public void mo3299b(String str) {
            this.f3205b += C4824b.this.f3155d.f3194d.measureText(str);
        }

        public /* synthetic */ k(C4824b c4824b, a aVar) {
            this();
        }
    }

    /* renamed from: com.caverock.androidsvg.b$h */
    public class h {

        /* renamed from: a */
        public SVG.Style f3191a;

        /* renamed from: b */
        public boolean f3192b;

        /* renamed from: c */
        public boolean f3193c;

        /* renamed from: d */
        public Paint f3194d;

        /* renamed from: e */
        public Paint f3195e;

        /* renamed from: f */
        public SVG.C4763b f3196f;

        /* renamed from: g */
        public SVG.C4763b f3197g;

        /* renamed from: h */
        public boolean f3198h;

        public h() {
            Paint paint = new Paint();
            this.f3194d = paint;
            paint.setFlags(193);
            this.f3194d.setHinting(0);
            this.f3194d.setStyle(Paint.Style.FILL);
            Paint paint2 = this.f3194d;
            Typeface typeface = Typeface.DEFAULT;
            paint2.setTypeface(typeface);
            Paint paint3 = new Paint();
            this.f3195e = paint3;
            paint3.setFlags(193);
            this.f3195e.setHinting(0);
            this.f3195e.setStyle(Paint.Style.STROKE);
            this.f3195e.setTypeface(typeface);
            this.f3191a = SVG.Style.m2998b();
        }

        public h(h hVar) {
            this.f3192b = hVar.f3192b;
            this.f3193c = hVar.f3193c;
            this.f3194d = new Paint(hVar.f3194d);
            this.f3195e = new Paint(hVar.f3195e);
            SVG.C4763b c4763b = hVar.f3196f;
            if (c4763b != null) {
                this.f3196f = new SVG.C4763b(c4763b);
            }
            SVG.C4763b c4763b2 = hVar.f3197g;
            if (c4763b2 != null) {
                this.f3197g = new SVG.C4763b(c4763b2);
            }
            this.f3198h = hVar.f3198h;
            try {
                this.f3191a = (SVG.Style) hVar.f3191a.clone();
            } catch (CloneNotSupportedException e6) {
                Log.e("SVGAndroidRenderer", "Unexpected clone error", e6);
                this.f3191a = SVG.Style.m2998b();
            }
        }
    }
}
