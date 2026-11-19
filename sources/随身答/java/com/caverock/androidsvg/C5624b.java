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
import androidx.camera.video.AudioStats;
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
public class C5624b {

    /* renamed from: i */
    public static HashSet f4472i;

    /* renamed from: a */
    public Canvas f4473a;

    /* renamed from: b */
    public float f4474b;

    /* renamed from: c */
    public SVG f4475c;

    /* renamed from: d */
    public h f4476d;

    /* renamed from: e */
    public Stack f4477e;

    /* renamed from: f */
    public Stack f4478f;

    /* renamed from: g */
    public Stack f4479g;

    /* renamed from: h */
    public CSSParser.C5556m f4480h = null;

    /* renamed from: com.caverock.androidsvg.b$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4481a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f4482b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f4483c;

        static {
            int[] iArr = new int[SVG.Style.LineJoin.values().length];
            f4483c = iArr;
            try {
                iArr[SVG.Style.LineJoin.Miter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4483c[SVG.Style.LineJoin.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4483c[SVG.Style.LineJoin.Bevel.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[SVG.Style.LineCap.values().length];
            f4482b = iArr2;
            try {
                iArr2[SVG.Style.LineCap.Butt.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4482b[SVG.Style.LineCap.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4482b[SVG.Style.LineCap.Square.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[PreserveAspectRatio.Alignment.values().length];
            f4481a = iArr3;
            try {
                iArr3[PreserveAspectRatio.Alignment.xMidYMin.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4481a[PreserveAspectRatio.Alignment.xMidYMid.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4481a[PreserveAspectRatio.Alignment.xMidYMax.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4481a[PreserveAspectRatio.Alignment.xMaxYMin.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4481a[PreserveAspectRatio.Alignment.xMaxYMid.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4481a[PreserveAspectRatio.Alignment.xMaxYMax.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4481a[PreserveAspectRatio.Alignment.xMinYMid.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f4481a[PreserveAspectRatio.Alignment.xMinYMax.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    /* renamed from: com.caverock.androidsvg.b$b */
    public class b implements SVG.InterfaceC5607w {

        /* renamed from: b */
        public float f4485b;

        /* renamed from: c */
        public float f4486c;

        /* renamed from: h */
        public boolean f4491h;

        /* renamed from: a */
        public List f4484a = new ArrayList();

        /* renamed from: d */
        public c f4487d = null;

        /* renamed from: e */
        public boolean f4488e = false;

        /* renamed from: f */
        public boolean f4489f = true;

        /* renamed from: g */
        public int f4490g = -1;

        public b(SVG.C5605v c5605v) {
            if (c5605v == null) {
                return;
            }
            c5605v.m3726e(this);
            if (this.f4491h) {
                this.f4487d.m3991b((c) this.f4484a.get(this.f4490g));
                this.f4484a.set(this.f4490g, this.f4487d);
                this.f4491h = false;
            }
            c cVar = this.f4487d;
            if (cVar != null) {
                this.f4484a.add(cVar);
            }
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC5607w
        /* renamed from: a */
        public void mo3722a(float f10, float f11, float f12, float f13) {
            this.f4487d.m3990a(f10, f11);
            this.f4484a.add(this.f4487d);
            this.f4487d = C5624b.this.new c(f12, f13, f12 - f10, f13 - f11);
            this.f4491h = false;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC5607w
        /* renamed from: b */
        public void mo3723b(float f10, float f11, float f12, boolean z9, boolean z10, float f13, float f14) {
            this.f4488e = true;
            this.f4489f = false;
            c cVar = this.f4487d;
            C5624b.m3895h(cVar.f4493a, cVar.f4494b, f10, f11, f12, z9, z10, f13, f14, this);
            this.f4489f = true;
            this.f4491h = false;
        }

        /* renamed from: c */
        public List m3989c() {
            return this.f4484a;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC5607w
        public void close() {
            this.f4484a.add(this.f4487d);
            lineTo(this.f4485b, this.f4486c);
            this.f4491h = true;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC5607w
        public void cubicTo(float f10, float f11, float f12, float f13, float f14, float f15) {
            if (this.f4489f || this.f4488e) {
                this.f4487d.m3990a(f10, f11);
                this.f4484a.add(this.f4487d);
                this.f4488e = false;
            }
            this.f4487d = C5624b.this.new c(f14, f15, f14 - f12, f15 - f13);
            this.f4491h = false;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC5607w
        public void lineTo(float f10, float f11) {
            this.f4487d.m3990a(f10, f11);
            this.f4484a.add(this.f4487d);
            C5624b c5624b = C5624b.this;
            c cVar = this.f4487d;
            this.f4487d = c5624b.new c(f10, f11, f10 - cVar.f4493a, f11 - cVar.f4494b);
            this.f4491h = false;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC5607w
        public void moveTo(float f10, float f11) {
            if (this.f4491h) {
                this.f4487d.m3991b((c) this.f4484a.get(this.f4490g));
                this.f4484a.set(this.f4490g, this.f4487d);
                this.f4491h = false;
            }
            c cVar = this.f4487d;
            if (cVar != null) {
                this.f4484a.add(cVar);
            }
            this.f4485b = f10;
            this.f4486c = f11;
            this.f4487d = C5624b.this.new c(f10, f11, 0.0f, 0.0f);
            this.f4490g = this.f4484a.size();
        }
    }

    /* renamed from: com.caverock.androidsvg.b$c */
    public class c {

        /* renamed from: a */
        public float f4493a;

        /* renamed from: b */
        public float f4494b;

        /* renamed from: c */
        public float f4495c;

        /* renamed from: d */
        public float f4496d;

        /* renamed from: e */
        public boolean f4497e = false;

        public c(float f10, float f11, float f12, float f13) {
            this.f4495c = 0.0f;
            this.f4496d = 0.0f;
            this.f4493a = f10;
            this.f4494b = f11;
            double dSqrt = Math.sqrt((f12 * f12) + (f13 * f13));
            if (dSqrt != AudioStats.AUDIO_AMPLITUDE_NONE) {
                this.f4495c = (float) (f12 / dSqrt);
                this.f4496d = (float) (f13 / dSqrt);
            }
        }

        /* renamed from: a */
        public void m3990a(float f10, float f11) {
            float f12 = f10 - this.f4493a;
            float f13 = f11 - this.f4494b;
            double dSqrt = Math.sqrt((f12 * f12) + (f13 * f13));
            if (dSqrt != AudioStats.AUDIO_AMPLITUDE_NONE) {
                f12 = (float) (f12 / dSqrt);
                f13 = (float) (f13 / dSqrt);
            }
            float f14 = this.f4495c;
            if (f12 != (-f14) || f13 != (-this.f4496d)) {
                this.f4495c = f14 + f12;
                this.f4496d += f13;
            } else {
                this.f4497e = true;
                this.f4495c = -f13;
                this.f4496d = f12;
            }
        }

        /* renamed from: b */
        public void m3991b(c cVar) {
            float f10 = cVar.f4495c;
            float f11 = this.f4495c;
            if (f10 == (-f11)) {
                float f12 = cVar.f4496d;
                if (f12 == (-this.f4496d)) {
                    this.f4497e = true;
                    this.f4495c = -f12;
                    this.f4496d = cVar.f4495c;
                    return;
                }
            }
            this.f4495c = f11 + f10;
            this.f4496d += cVar.f4496d;
        }

        public String toString() {
            return "(" + this.f4493a + "," + this.f4494b + " " + this.f4495c + "," + this.f4496d + ")";
        }
    }

    /* renamed from: com.caverock.androidsvg.b$d */
    public class d implements SVG.InterfaceC5607w {

        /* renamed from: a */
        public Path f4499a = new Path();

        /* renamed from: b */
        public float f4500b;

        /* renamed from: c */
        public float f4501c;

        public d(SVG.C5605v c5605v) {
            if (c5605v == null) {
                return;
            }
            c5605v.m3726e(this);
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC5607w
        /* renamed from: a */
        public void mo3722a(float f10, float f11, float f12, float f13) {
            this.f4499a.quadTo(f10, f11, f12, f13);
            this.f4500b = f12;
            this.f4501c = f13;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC5607w
        /* renamed from: b */
        public void mo3723b(float f10, float f11, float f12, boolean z9, boolean z10, float f13, float f14) {
            C5624b.m3895h(this.f4500b, this.f4501c, f10, f11, f12, z9, z10, f13, f14, this);
            this.f4500b = f13;
            this.f4501c = f14;
        }

        /* renamed from: c */
        public Path m3992c() {
            return this.f4499a;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC5607w
        public void close() {
            this.f4499a.close();
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC5607w
        public void cubicTo(float f10, float f11, float f12, float f13, float f14, float f15) {
            this.f4499a.cubicTo(f10, f11, f12, f13, f14, f15);
            this.f4500b = f14;
            this.f4501c = f15;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC5607w
        public void lineTo(float f10, float f11) {
            this.f4499a.lineTo(f10, f11);
            this.f4500b = f10;
            this.f4501c = f11;
        }

        @Override // com.caverock.androidsvg.SVG.InterfaceC5607w
        public void moveTo(float f10, float f11) {
            this.f4499a.moveTo(f10, f11);
            this.f4500b = f10;
            this.f4501c = f11;
        }
    }

    /* renamed from: com.caverock.androidsvg.b$e */
    public class e extends f {

        /* renamed from: e */
        public Path f4503e;

        public e(Path path, float f10, float f11) {
            super(f10, f11);
            this.f4503e = path;
        }

        @Override // com.caverock.androidsvg.C5624b.f, com.caverock.androidsvg.C5624b.j
        /* renamed from: b */
        public void mo3993b(String str) {
            String str2;
            if (C5624b.this.m3948Y0()) {
                if (C5624b.this.f4476d.f4513b) {
                    str2 = str;
                    C5624b.this.f4473a.drawTextOnPath(str2, this.f4503e, this.f4505b, this.f4506c, C5624b.this.f4476d.f4515d);
                } else {
                    str2 = str;
                }
                if (C5624b.this.f4476d.f4514c) {
                    C5624b.this.f4473a.drawTextOnPath(str2, this.f4503e, this.f4505b, this.f4506c, C5624b.this.f4476d.f4516e);
                }
            } else {
                str2 = str;
            }
            this.f4505b += C5624b.this.f4476d.f4515d.measureText(str2);
        }
    }

    /* renamed from: com.caverock.androidsvg.b$f */
    public class f extends j {

        /* renamed from: b */
        public float f4505b;

        /* renamed from: c */
        public float f4506c;

        public f(float f10, float f11) {
            super(C5624b.this, null);
            this.f4505b = f10;
            this.f4506c = f11;
        }

        @Override // com.caverock.androidsvg.C5624b.j
        /* renamed from: b */
        public void mo3993b(String str) {
            C5624b.m3900y("TextSequence render", new Object[0]);
            if (C5624b.this.m3948Y0()) {
                if (C5624b.this.f4476d.f4513b) {
                    C5624b.this.f4473a.drawText(str, this.f4505b, this.f4506c, C5624b.this.f4476d.f4515d);
                }
                if (C5624b.this.f4476d.f4514c) {
                    C5624b.this.f4473a.drawText(str, this.f4505b, this.f4506c, C5624b.this.f4476d.f4516e);
                }
            }
            this.f4505b += C5624b.this.f4476d.f4515d.measureText(str);
        }
    }

    /* renamed from: com.caverock.androidsvg.b$g */
    public class g extends j {

        /* renamed from: b */
        public float f4508b;

        /* renamed from: c */
        public float f4509c;

        /* renamed from: d */
        public Path f4510d;

        public g(float f10, float f11, Path path) {
            super(C5624b.this, null);
            this.f4508b = f10;
            this.f4509c = f11;
            this.f4510d = path;
        }

        @Override // com.caverock.androidsvg.C5624b.j
        /* renamed from: a */
        public boolean mo3994a(SVG.AbstractC5608w0 abstractC5608w0) {
            if (!(abstractC5608w0 instanceof SVG.C5610x0)) {
                return true;
            }
            C5624b.m3887Z0("Using <textPath> elements in a clip path is not supported.", new Object[0]);
            return false;
        }

        @Override // com.caverock.androidsvg.C5624b.j
        /* renamed from: b */
        public void mo3993b(String str) {
            String str2;
            if (C5624b.this.m3948Y0()) {
                Path path = new Path();
                str2 = str;
                C5624b.this.f4476d.f4515d.getTextPath(str2, 0, str.length(), this.f4508b, this.f4509c, path);
                this.f4510d.addPath(path);
            } else {
                str2 = str;
            }
            this.f4508b += C5624b.this.f4476d.f4515d.measureText(str2);
        }
    }

    /* renamed from: com.caverock.androidsvg.b$i */
    public class i extends j {

        /* renamed from: b */
        public float f4521b;

        /* renamed from: c */
        public float f4522c;

        /* renamed from: d */
        public RectF f4523d;

        public i(float f10, float f11) {
            super(C5624b.this, null);
            this.f4523d = new RectF();
            this.f4521b = f10;
            this.f4522c = f11;
        }

        @Override // com.caverock.androidsvg.C5624b.j
        /* renamed from: a */
        public boolean mo3994a(SVG.AbstractC5608w0 abstractC5608w0) {
            if (!(abstractC5608w0 instanceof SVG.C5610x0)) {
                return true;
            }
            SVG.C5610x0 c5610x0 = (SVG.C5610x0) abstractC5608w0;
            SVG.C5586l0 c5586l0M3683p = abstractC5608w0.f4255a.m3683p(c5610x0.f4308o);
            if (c5586l0M3683p == null) {
                C5624b.m3885F("TextPath path reference '%s' not found", c5610x0.f4308o);
                return false;
            }
            SVG.C5603u c5603u = (SVG.C5603u) c5586l0M3683p;
            Path pathM3992c = C5624b.this.new d(c5603u.f4293o).m3992c();
            Matrix matrix = c5603u.f4249n;
            if (matrix != null) {
                pathM3992c.transform(matrix);
            }
            RectF rectF = new RectF();
            pathM3992c.computeBounds(rectF, true);
            this.f4523d.union(rectF);
            return false;
        }

        @Override // com.caverock.androidsvg.C5624b.j
        /* renamed from: b */
        public void mo3993b(String str) {
            if (C5624b.this.m3948Y0()) {
                Rect rect = new Rect();
                C5624b.this.f4476d.f4515d.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.f4521b, this.f4522c);
                this.f4523d.union(rectF);
            }
            this.f4521b += C5624b.this.f4476d.f4515d.measureText(str);
        }
    }

    /* renamed from: com.caverock.androidsvg.b$j */
    public abstract class j {
        public j() {
        }

        /* renamed from: a */
        public boolean mo3994a(SVG.AbstractC5608w0 abstractC5608w0) {
            return true;
        }

        /* renamed from: b */
        public abstract void mo3993b(String str);

        public /* synthetic */ j(C5624b c5624b, a aVar) {
            this();
        }
    }

    public C5624b(Canvas canvas, float f10) {
        this.f4473a = canvas;
        this.f4474b = f10;
    }

    /* renamed from: F */
    public static void m3885F(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    /* renamed from: V */
    public static synchronized void m3886V() {
        HashSet hashSet = new HashSet();
        f4472i = hashSet;
        hashSet.add("Structure");
        f4472i.add("BasicStructure");
        f4472i.add("ConditionalProcessing");
        f4472i.add("Image");
        f4472i.add("Style");
        f4472i.add("ViewportAttribute");
        f4472i.add("Shape");
        f4472i.add("BasicText");
        f4472i.add("PaintAttribute");
        f4472i.add("BasicPaintAttribute");
        f4472i.add("OpacityAttribute");
        f4472i.add("BasicGraphicsAttribute");
        f4472i.add("Marker");
        f4472i.add("Gradient");
        f4472i.add("Pattern");
        f4472i.add("Clip");
        f4472i.add("BasicClip");
        f4472i.add("Mask");
        f4472i.add("View");
    }

    /* renamed from: Z0 */
    public static void m3887Z0(String str, Object... objArr) {
        Log.w("SVGAndroidRenderer", String.format(str, objArr));
    }

    /* renamed from: h */
    public static void m3895h(float f10, float f11, float f12, float f13, float f14, boolean z9, boolean z10, float f15, float f16, SVG.InterfaceC5607w interfaceC5607w) {
        if (f10 == f15 && f11 == f16) {
            return;
        }
        if (f12 == 0.0f || f13 == 0.0f) {
            interfaceC5607w.lineTo(f15, f16);
            return;
        }
        float fAbs = Math.abs(f12);
        float fAbs2 = Math.abs(f13);
        double radians = Math.toRadians(f14 % 360.0d);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d10 = (f10 - f15) / 2.0d;
        double d11 = (f11 - f16) / 2.0d;
        double d12 = (dCos * d10) + (dSin * d11);
        double d13 = ((-dSin) * d10) + (dCos * d11);
        double d14 = fAbs * fAbs;
        double d15 = fAbs2 * fAbs2;
        double d16 = d12 * d12;
        double d17 = d13 * d13;
        double d18 = (d16 / d14) + (d17 / d15);
        if (d18 > 0.99999d) {
            double dSqrt = Math.sqrt(d18) * 1.00001d;
            fAbs = (float) (fAbs * dSqrt);
            fAbs2 = (float) (dSqrt * fAbs2);
            d14 = fAbs * fAbs;
            d15 = fAbs2 * fAbs2;
        }
        double d19 = z9 == z10 ? -1.0d : 1.0d;
        double d20 = d14 * d15;
        double d21 = d14 * d17;
        double d22 = d15 * d16;
        double d23 = ((d20 - d21) - d22) / (d21 + d22);
        if (d23 < AudioStats.AUDIO_AMPLITUDE_NONE) {
            d23 = 0.0d;
        }
        double dSqrt2 = d19 * Math.sqrt(d23);
        double d24 = fAbs;
        double d25 = fAbs2;
        double d26 = ((d24 * d13) / d25) * dSqrt2;
        double d27 = (-((d25 * d12) / d24)) * dSqrt2;
        double d28 = ((f10 + f15) / 2.0d) + ((dCos * d26) - (dSin * d27));
        double d29 = ((f11 + f16) / 2.0d) + (dSin * d26) + (dCos * d27);
        double d30 = (d12 - d26) / d24;
        double d31 = (d13 - d27) / d25;
        double d32 = ((-d12) - d26) / d24;
        double d33 = ((-d13) - d27) / d25;
        double d34 = (d30 * d30) + (d31 * d31);
        double dAcos = (d31 < AudioStats.AUDIO_AMPLITUDE_NONE ? -1.0d : 1.0d) * Math.acos(d30 / Math.sqrt(d34));
        double dM3897v = ((d30 * d33) - (d31 * d32) < AudioStats.AUDIO_AMPLITUDE_NONE ? -1.0d : 1.0d) * m3897v(((d30 * d32) + (d31 * d33)) / Math.sqrt(d34 * ((d32 * d32) + (d33 * d33))));
        if (!z10 && dM3897v > AudioStats.AUDIO_AMPLITUDE_NONE) {
            dM3897v -= 6.283185307179586d;
        } else if (z10 && dM3897v < AudioStats.AUDIO_AMPLITUDE_NONE) {
            dM3897v += 6.283185307179586d;
        }
        float[] fArrM3896i = m3896i(dAcos % 6.283185307179586d, dM3897v % 6.283185307179586d);
        Matrix matrix = new Matrix();
        matrix.postScale(fAbs, fAbs2);
        matrix.postRotate(f14);
        matrix.postTranslate((float) d28, (float) d29);
        matrix.mapPoints(fArrM3896i);
        fArrM3896i[fArrM3896i.length - 2] = f15;
        fArrM3896i[fArrM3896i.length - 1] = f16;
        for (int i9 = 0; i9 < fArrM3896i.length; i9 += 6) {
            interfaceC5607w.cubicTo(fArrM3896i[i9], fArrM3896i[i9 + 1], fArrM3896i[i9 + 2], fArrM3896i[i9 + 3], fArrM3896i[i9 + 4], fArrM3896i[i9 + 5]);
        }
    }

    /* renamed from: i */
    public static float[] m3896i(double d10, double d11) {
        int iCeil = (int) Math.ceil((Math.abs(d11) * 2.0d) / 3.141592653589793d);
        double d12 = d11 / iCeil;
        double d13 = d12 / 2.0d;
        double dSin = (Math.sin(d13) * 1.3333333333333333d) / (Math.cos(d13) + 1.0d);
        float[] fArr = new float[iCeil * 6];
        int i9 = 0;
        int i10 = 0;
        while (i9 < iCeil) {
            double d14 = d10 + (i9 * d12);
            double dCos = Math.cos(d14);
            double dSin2 = Math.sin(d14);
            float[] fArr2 = fArr;
            fArr2[i10] = (float) (dCos - (dSin * dSin2));
            fArr2[i10 + 1] = (float) (dSin2 + (dCos * dSin));
            double d15 = d14 + d12;
            double dCos2 = Math.cos(d15);
            double dSin3 = Math.sin(d15);
            fArr2[i10 + 2] = (float) ((dSin * dSin3) + dCos2);
            fArr2[i10 + 3] = (float) (dSin3 - (dSin * dCos2));
            int i11 = i10 + 5;
            fArr2[i10 + 4] = (float) dCos2;
            i10 += 6;
            fArr2[i11] = (float) dSin3;
            i9++;
            fArr = fArr2;
            iCeil = iCeil;
        }
        return fArr;
    }

    /* renamed from: v */
    public static double m3897v(double d10) {
        if (d10 < -1.0d) {
            return 3.141592653589793d;
        }
        return d10 > 1.0d ? AudioStats.AUDIO_AMPLITUDE_NONE : Math.acos(d10);
    }

    /* renamed from: w */
    public static int m3898w(float f10) {
        int i9 = (int) (f10 * 256.0f);
        if (i9 < 0) {
            return 0;
        }
        if (i9 > 255) {
            return 255;
        }
        return i9;
    }

    /* renamed from: x */
    public static int m3899x(int i9, float f10) {
        int i10 = 255;
        int iRound = Math.round(((i9 >> 24) & 255) * f10);
        if (iRound < 0) {
            i10 = 0;
        } else if (iRound <= 255) {
            i10 = iRound;
        }
        return (i9 & ViewCompat.MEASURED_SIZE_MASK) | (i10 << 24);
    }

    /* renamed from: y */
    public static void m3900y(String str, Object... objArr) {
    }

    /* renamed from: A */
    public final boolean m3901A() {
        Boolean bool = this.f4476d.f4512a.f4103A;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: A0 */
    public final void m3902A0(SVG.C5586l0 c5586l0) {
        if (c5586l0 instanceof SVG.InterfaceC5599s) {
            return;
        }
        m3937S0();
        m3981u(c5586l0);
        if (c5586l0 instanceof SVG.C5570d0) {
            m3985x0((SVG.C5570d0) c5586l0);
        } else if (c5586l0 instanceof SVG.C5565b1) {
            m3910E0((SVG.C5565b1) c5586l0);
        } else if (c5586l0 instanceof SVG.C5596q0) {
            m3904B0((SVG.C5596q0) c5586l0);
        } else if (c5586l0 instanceof SVG.C5585l) {
            m3974q0((SVG.C5585l) c5586l0);
        } else if (c5586l0 instanceof SVG.C5589n) {
            m3976r0((SVG.C5589n) c5586l0);
        } else if (c5586l0 instanceof SVG.C5603u) {
            m3980t0((SVG.C5603u) c5586l0);
        } else if (c5586l0 instanceof SVG.C5561a0) {
            m3984w0((SVG.C5561a0) c5586l0);
        } else if (c5586l0 instanceof SVG.C5569d) {
            m3970o0((SVG.C5569d) c5586l0);
        } else if (c5586l0 instanceof SVG.C5579i) {
            m3972p0((SVG.C5579i) c5586l0);
        } else if (c5586l0 instanceof SVG.C5593p) {
            m3978s0((SVG.C5593p) c5586l0);
        } else if (c5586l0 instanceof SVG.C5613z) {
            m3983v0((SVG.C5613z) c5586l0);
        } else if (c5586l0 instanceof SVG.C5611y) {
            m3982u0((SVG.C5611y) c5586l0);
        } else if (c5586l0 instanceof SVG.C5604u0) {
            m3908D0((SVG.C5604u0) c5586l0);
        }
        m3935R0();
    }

    /* renamed from: B */
    public final void m3903B(SVG.AbstractC5580i0 abstractC5580i0, Path path) {
        SVG.AbstractC5588m0 abstractC5588m0 = this.f4476d.f4512a.f4117b;
        if (abstractC5588m0 instanceof SVG.C5601t) {
            SVG.C5586l0 c5586l0M3683p = this.f4475c.m3683p(((SVG.C5601t) abstractC5588m0).f4290a);
            if (c5586l0M3683p instanceof SVG.C5609x) {
                m3922L(abstractC5580i0, path, (SVG.C5609x) c5586l0M3683p);
                return;
            }
        }
        this.f4473a.drawPath(path, this.f4476d.f4515d);
    }

    /* renamed from: B0 */
    public final void m3904B0(SVG.C5596q0 c5596q0) {
        m3900y("Switch render", new Object[0]);
        m3944W0(this.f4476d, c5596q0);
        if (m3901A()) {
            Matrix matrix = c5596q0.f4254o;
            if (matrix != null) {
                this.f4473a.concat(matrix);
            }
            m3971p(c5596q0);
            boolean zM3966m0 = m3966m0();
            m3921K0(c5596q0);
            if (zM3966m0) {
                m3960j0(c5596q0);
            }
            m3941U0(c5596q0);
        }
    }

    /* renamed from: C */
    public final void m3905C(Path path) {
        h hVar = this.f4476d;
        if (hVar.f4512a.f4114L != SVG.Style.VectorEffect.NonScalingStroke) {
            this.f4473a.drawPath(path, hVar.f4516e);
            return;
        }
        Matrix matrix = this.f4473a.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        this.f4473a.setMatrix(new Matrix());
        Shader shader = this.f4476d.f4516e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        this.f4473a.drawPath(path2, this.f4476d.f4516e);
        this.f4473a.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    /* renamed from: C0 */
    public final void m3906C0(SVG.C5598r0 c5598r0, SVG.C5563b c5563b) {
        m3900y("Symbol render", new Object[0]);
        if (c5563b.f4198c == 0.0f || c5563b.f4199d == 0.0f) {
            return;
        }
        PreserveAspectRatio preserveAspectRatio = c5598r0.f4263o;
        if (preserveAspectRatio == null) {
            preserveAspectRatio = PreserveAspectRatio.f4069e;
        }
        m3944W0(this.f4476d, c5598r0);
        h hVar = this.f4476d;
        hVar.f4517f = c5563b;
        if (!hVar.f4512a.f4137v.booleanValue()) {
            SVG.C5563b c5563b2 = this.f4476d.f4517f;
            m3929O0(c5563b2.f4196a, c5563b2.f4197b, c5563b2.f4198c, c5563b2.f4199d);
        }
        SVG.C5563b c5563b3 = c5598r0.f4275p;
        if (c5563b3 != null) {
            this.f4473a.concat(m3969o(this.f4476d.f4517f, c5563b3, preserveAspectRatio));
            this.f4476d.f4518g = c5598r0.f4275p;
        } else {
            Canvas canvas = this.f4473a;
            SVG.C5563b c5563b4 = this.f4476d.f4517f;
            canvas.translate(c5563b4.f4196a, c5563b4.f4197b);
        }
        boolean zM3966m0 = m3966m0();
        m3911F0(c5598r0, true);
        if (zM3966m0) {
            m3960j0(c5598r0);
        }
        m3941U0(c5598r0);
    }

    /* renamed from: D */
    public final float m3907D(float f10, float f11, float f12, float f13) {
        return (f10 * f12) + (f11 * f13);
    }

    /* renamed from: D0 */
    public final void m3908D0(SVG.C5604u0 c5604u0) {
        m3900y("Text render", new Object[0]);
        m3944W0(this.f4476d, c5604u0);
        if (m3901A()) {
            Matrix matrix = c5604u0.f4295s;
            if (matrix != null) {
                this.f4473a.concat(matrix);
            }
            List list = c5604u0.f4312o;
            float fM3717h = 0.0f;
            float fM3716g = (list == null || list.size() == 0) ? 0.0f : ((SVG.C5591o) c5604u0.f4312o.get(0)).m3716g(this);
            List list2 = c5604u0.f4313p;
            float fM3717h2 = (list2 == null || list2.size() == 0) ? 0.0f : ((SVG.C5591o) c5604u0.f4313p.get(0)).m3717h(this);
            List list3 = c5604u0.f4314q;
            float fM3716g2 = (list3 == null || list3.size() == 0) ? 0.0f : ((SVG.C5591o) c5604u0.f4314q.get(0)).m3716g(this);
            List list4 = c5604u0.f4315r;
            if (list4 != null && list4.size() != 0) {
                fM3717h = ((SVG.C5591o) c5604u0.f4315r.get(0)).m3717h(this);
            }
            SVG.Style.TextAnchor textAnchorM3928O = m3928O();
            if (textAnchorM3928O != SVG.Style.TextAnchor.Start) {
                float fM3967n = m3967n(c5604u0);
                if (textAnchorM3928O == SVG.Style.TextAnchor.Middle) {
                    fM3967n /= 2.0f;
                }
                fM3716g -= fM3967n;
            }
            if (c5604u0.f4238h == null) {
                i iVar = new i(fM3716g, fM3717h2);
                m3909E(c5604u0, iVar);
                RectF rectF = iVar.f4523d;
                c5604u0.f4238h = new SVG.C5563b(rectF.left, rectF.top, rectF.width(), iVar.f4523d.height());
            }
            m3941U0(c5604u0);
            m3975r(c5604u0);
            m3971p(c5604u0);
            boolean zM3966m0 = m3966m0();
            m3909E(c5604u0, new f(fM3716g + fM3716g2, fM3717h2 + fM3717h));
            if (zM3966m0) {
                m3960j0(c5604u0);
            }
        }
    }

    /* renamed from: E */
    public final void m3909E(SVG.AbstractC5608w0 abstractC5608w0, j jVar) {
        if (m3901A()) {
            Iterator it = abstractC5608w0.f4222i.iterator();
            boolean z9 = true;
            while (it.hasNext()) {
                SVG.C5586l0 c5586l0 = (SVG.C5586l0) it.next();
                if (c5586l0 instanceof SVG.C5562a1) {
                    jVar.mo3993b(m3939T0(((SVG.C5562a1) c5586l0).f4194c, z9, !it.hasNext()));
                } else {
                    m3964l0(c5586l0, jVar);
                }
                z9 = false;
            }
        }
    }

    /* renamed from: E0 */
    public final void m3910E0(SVG.C5565b1 c5565b1) {
        m3900y("Use render", new Object[0]);
        SVG.C5591o c5591o = c5565b1.f4203s;
        if (c5591o == null || !c5591o.m3719j()) {
            SVG.C5591o c5591o2 = c5565b1.f4204t;
            if (c5591o2 == null || !c5591o2.m3719j()) {
                m3944W0(this.f4476d, c5565b1);
                if (m3901A()) {
                    SVG.C5586l0 c5586l0M3683p = c5565b1.f4255a.m3683p(c5565b1.f4200p);
                    if (c5586l0M3683p == null) {
                        m3885F("Use reference '%s' not found", c5565b1.f4200p);
                        return;
                    }
                    Matrix matrix = c5565b1.f4254o;
                    if (matrix != null) {
                        this.f4473a.concat(matrix);
                    }
                    SVG.C5591o c5591o3 = c5565b1.f4201q;
                    float fM3716g = c5591o3 != null ? c5591o3.m3716g(this) : 0.0f;
                    SVG.C5591o c5591o4 = c5565b1.f4202r;
                    this.f4473a.translate(fM3716g, c5591o4 != null ? c5591o4.m3717h(this) : 0.0f);
                    m3971p(c5565b1);
                    boolean zM3966m0 = m3966m0();
                    m3958i0(c5565b1);
                    if (c5586l0M3683p instanceof SVG.C5570d0) {
                        SVG.C5563b c5563bM3955f0 = m3955f0(null, null, c5565b1.f4203s, c5565b1.f4204t);
                        m3937S0();
                        m3986y0((SVG.C5570d0) c5586l0M3683p, c5563bM3955f0);
                        m3935R0();
                    } else if (c5586l0M3683p instanceof SVG.C5598r0) {
                        SVG.C5591o c5591o5 = c5565b1.f4203s;
                        if (c5591o5 == null) {
                            c5591o5 = new SVG.C5591o(100.0f, SVG.Unit.percent);
                        }
                        SVG.C5591o c5591o6 = c5565b1.f4204t;
                        if (c5591o6 == null) {
                            c5591o6 = new SVG.C5591o(100.0f, SVG.Unit.percent);
                        }
                        SVG.C5563b c5563bM3955f02 = m3955f0(null, null, c5591o5, c5591o6);
                        m3937S0();
                        m3906C0((SVG.C5598r0) c5586l0M3683p, c5563bM3955f02);
                        m3935R0();
                    } else {
                        m3902A0(c5586l0M3683p);
                    }
                    m3957h0();
                    if (zM3966m0) {
                        m3960j0(c5565b1);
                    }
                    m3941U0(c5565b1);
                }
            }
        }
    }

    /* renamed from: F0 */
    public final void m3911F0(SVG.InterfaceC5578h0 interfaceC5578h0, boolean z9) {
        if (z9) {
            m3958i0(interfaceC5578h0);
        }
        Iterator it = interfaceC5578h0.getChildren().iterator();
        while (it.hasNext()) {
            m3902A0((SVG.C5586l0) it.next());
        }
        if (z9) {
            m3957h0();
        }
    }

    /* renamed from: G */
    public final void m3912G(SVG.AbstractC5608w0 abstractC5608w0, StringBuilder sb) {
        Iterator it = abstractC5608w0.f4222i.iterator();
        boolean z9 = true;
        while (it.hasNext()) {
            SVG.C5586l0 c5586l0 = (SVG.C5586l0) it.next();
            if (c5586l0 instanceof SVG.AbstractC5608w0) {
                m3912G((SVG.AbstractC5608w0) c5586l0, sb);
            } else if (c5586l0 instanceof SVG.C5562a1) {
                sb.append(m3939T0(((SVG.C5562a1) c5586l0).f4194c, z9, !it.hasNext()));
            }
            z9 = false;
        }
    }

    /* renamed from: G0 */
    public void m3913G0(SVG svg, C5623a c5623a) {
        SVG.C5563b c5563b;
        PreserveAspectRatio preserveAspectRatio;
        if (c5623a == null) {
            throw new NullPointerException("renderOptions shouldn't be null");
        }
        this.f4475c = svg;
        SVG.C5570d0 c5570d0M3680m = svg.m3680m();
        if (c5570d0M3680m == null) {
            m3887Z0("Nothing to render. Document is empty.", new Object[0]);
            return;
        }
        if (c5623a.m3881e()) {
            SVG.AbstractC5582j0 abstractC5582j0M3679j = this.f4475c.m3679j(c5623a.f4470e);
            if (abstractC5582j0M3679j == null || !(abstractC5582j0M3679j instanceof SVG.C5568c1)) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" not found.", c5623a.f4470e));
                return;
            }
            SVG.C5568c1 c5568c1 = (SVG.C5568c1) abstractC5582j0M3679j;
            c5563b = c5568c1.f4275p;
            if (c5563b == null) {
                Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" is missing a viewBox attribute.", c5623a.f4470e));
                return;
            }
            preserveAspectRatio = c5568c1.f4263o;
        } else {
            c5563b = c5623a.m3882f() ? c5623a.f4469d : c5570d0M3680m.f4275p;
            preserveAspectRatio = c5623a.m3879c() ? c5623a.f4467b : c5570d0M3680m.f4263o;
        }
        if (c5623a.m3878b()) {
            svg.m3670a(c5623a.f4466a);
        }
        if (c5623a.m3880d()) {
            CSSParser.C5556m c5556m = new CSSParser.C5556m();
            this.f4480h = c5556m;
            c5556m.f4059a = svg.m3679j(c5623a.f4468c);
        }
        m3927N0();
        m3981u(c5570d0M3680m);
        m3937S0();
        SVG.C5563b c5563b2 = new SVG.C5563b(c5623a.f4471f);
        SVG.C5591o c5591o = c5570d0M3680m.f4215s;
        if (c5591o != null) {
            c5563b2.f4198c = c5591o.m3715f(this, c5563b2.f4198c);
        }
        SVG.C5591o c5591o2 = c5570d0M3680m.f4216t;
        if (c5591o2 != null) {
            c5563b2.f4199d = c5591o2.m3715f(this, c5563b2.f4199d);
        }
        m3988z0(c5570d0M3680m, c5563b2, c5563b, preserveAspectRatio);
        m3935R0();
        if (c5623a.m3878b()) {
            svg.m3671b();
        }
    }

    /* renamed from: H */
    public final void m3914H(SVG.AbstractC5581j abstractC5581j, String str) {
        SVG.C5586l0 c5586l0M3683p = abstractC5581j.f4255a.m3683p(str);
        if (c5586l0M3683p == null) {
            m3887Z0("Gradient reference '%s' not found", str);
            return;
        }
        if (!(c5586l0M3683p instanceof SVG.AbstractC5581j)) {
            m3885F("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (c5586l0M3683p == abstractC5581j) {
            m3885F("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        SVG.AbstractC5581j abstractC5581j2 = (SVG.AbstractC5581j) c5586l0M3683p;
        if (abstractC5581j.f4240i == null) {
            abstractC5581j.f4240i = abstractC5581j2.f4240i;
        }
        if (abstractC5581j.f4241j == null) {
            abstractC5581j.f4241j = abstractC5581j2.f4241j;
        }
        if (abstractC5581j.f4242k == null) {
            abstractC5581j.f4242k = abstractC5581j2.f4242k;
        }
        if (abstractC5581j.f4239h.isEmpty()) {
            abstractC5581j.f4239h = abstractC5581j2.f4239h;
        }
        try {
            if (abstractC5581j instanceof SVG.C5584k0) {
                m3916I((SVG.C5584k0) abstractC5581j, (SVG.C5584k0) c5586l0M3683p);
            } else {
                m3918J((SVG.C5592o0) abstractC5581j, (SVG.C5592o0) c5586l0M3683p);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = abstractC5581j2.f4243l;
        if (str2 != null) {
            m3914H(abstractC5581j, str2);
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
    public final void m3915H0(com.caverock.androidsvg.SVG.C5595q r12, com.caverock.androidsvg.C5624b.c r13) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.C5624b.m3915H0(com.caverock.androidsvg.SVG$q, com.caverock.androidsvg.b$c):void");
    }

    /* renamed from: I */
    public final void m3916I(SVG.C5584k0 c5584k0, SVG.C5584k0 c5584k02) {
        if (c5584k0.f4250m == null) {
            c5584k0.f4250m = c5584k02.f4250m;
        }
        if (c5584k0.f4251n == null) {
            c5584k0.f4251n = c5584k02.f4251n;
        }
        if (c5584k0.f4252o == null) {
            c5584k0.f4252o = c5584k02.f4252o;
        }
        if (c5584k0.f4253p == null) {
            c5584k0.f4253p = c5584k02.f4253p;
        }
    }

    /* renamed from: I0 */
    public final void m3917I0(SVG.AbstractC5583k abstractC5583k) {
        SVG.C5595q c5595q;
        SVG.C5595q c5595q2;
        SVG.C5595q c5595q3;
        int size;
        SVG.Style style = this.f4476d.f4512a;
        String str = style.f4139x;
        if (str == null && style.f4140y == null && style.f4141z == null) {
            return;
        }
        if (str == null) {
            c5595q = null;
        } else {
            SVG.C5586l0 c5586l0M3683p = abstractC5583k.f4255a.m3683p(str);
            if (c5586l0M3683p != null) {
                c5595q = (SVG.C5595q) c5586l0M3683p;
            } else {
                m3885F("Marker reference '%s' not found", this.f4476d.f4512a.f4139x);
                c5595q = null;
            }
        }
        String str2 = this.f4476d.f4512a.f4140y;
        if (str2 == null) {
            c5595q2 = null;
        } else {
            SVG.C5586l0 c5586l0M3683p2 = abstractC5583k.f4255a.m3683p(str2);
            if (c5586l0M3683p2 != null) {
                c5595q2 = (SVG.C5595q) c5586l0M3683p2;
            } else {
                m3885F("Marker reference '%s' not found", this.f4476d.f4512a.f4140y);
                c5595q2 = null;
            }
        }
        String str3 = this.f4476d.f4512a.f4141z;
        if (str3 == null) {
            c5595q3 = null;
        } else {
            SVG.C5586l0 c5586l0M3683p3 = abstractC5583k.f4255a.m3683p(str3);
            if (c5586l0M3683p3 != null) {
                c5595q3 = (SVG.C5595q) c5586l0M3683p3;
            } else {
                m3885F("Marker reference '%s' not found", this.f4476d.f4512a.f4141z);
                c5595q3 = null;
            }
        }
        List listM3989c = abstractC5583k instanceof SVG.C5603u ? new b(((SVG.C5603u) abstractC5583k).f4293o).m3989c() : abstractC5583k instanceof SVG.C5593p ? m3961k((SVG.C5593p) abstractC5583k) : m3963l((SVG.C5611y) abstractC5583k);
        if (listM3989c == null || (size = listM3989c.size()) == 0) {
            return;
        }
        SVG.Style style2 = this.f4476d.f4512a;
        style2.f4141z = null;
        style2.f4140y = null;
        style2.f4139x = null;
        if (c5595q != null) {
            m3915H0(c5595q, (c) listM3989c.get(0));
        }
        if (c5595q2 != null && listM3989c.size() > 2) {
            c cVarM3968n0 = (c) listM3989c.get(0);
            c cVar = (c) listM3989c.get(1);
            int i9 = 1;
            while (i9 < size - 1) {
                i9++;
                c cVar2 = (c) listM3989c.get(i9);
                cVarM3968n0 = cVar.f4497e ? m3968n0(cVarM3968n0, cVar, cVar2) : cVar;
                m3915H0(c5595q2, cVarM3968n0);
                cVar = cVar2;
            }
        }
        if (c5595q3 != null) {
            m3915H0(c5595q3, (c) listM3989c.get(size - 1));
        }
    }

    /* renamed from: J */
    public final void m3918J(SVG.C5592o0 c5592o0, SVG.C5592o0 c5592o02) {
        if (c5592o0.f4266m == null) {
            c5592o0.f4266m = c5592o02.f4266m;
        }
        if (c5592o0.f4267n == null) {
            c5592o0.f4267n = c5592o02.f4267n;
        }
        if (c5592o0.f4268o == null) {
            c5592o0.f4268o = c5592o02.f4268o;
        }
        if (c5592o0.f4269p == null) {
            c5592o0.f4269p = c5592o02.f4269p;
        }
        if (c5592o0.f4270q == null) {
            c5592o0.f4270q = c5592o02.f4270q;
        }
    }

    /* renamed from: J0 */
    public final void m3919J0(SVG.C5597r c5597r, SVG.AbstractC5580i0 abstractC5580i0, SVG.C5563b c5563b) {
        float fM3716g;
        float fM3717h;
        m3900y("Mask render", new Object[0]);
        Boolean bool = c5597r.f4282o;
        if (bool == null || !bool.booleanValue()) {
            SVG.C5591o c5591o = c5597r.f4286s;
            float fM3715f = c5591o != null ? c5591o.m3715f(this, 1.0f) : 1.2f;
            SVG.C5591o c5591o2 = c5597r.f4287t;
            float fM3715f2 = c5591o2 != null ? c5591o2.m3715f(this, 1.0f) : 1.2f;
            fM3716g = fM3715f * c5563b.f4198c;
            fM3717h = fM3715f2 * c5563b.f4199d;
        } else {
            SVG.C5591o c5591o3 = c5597r.f4286s;
            fM3716g = c5591o3 != null ? c5591o3.m3716g(this) : c5563b.f4198c;
            SVG.C5591o c5591o4 = c5597r.f4287t;
            fM3717h = c5591o4 != null ? c5591o4.m3717h(this) : c5563b.f4199d;
        }
        if (fM3716g == 0.0f || fM3717h == 0.0f) {
            return;
        }
        m3937S0();
        h hVarM3924M = m3924M(c5597r);
        this.f4476d = hVarM3924M;
        hVarM3924M.f4512a.f4128m = Float.valueOf(1.0f);
        boolean zM3966m0 = m3966m0();
        this.f4473a.save();
        Boolean bool2 = c5597r.f4283p;
        if (bool2 != null && !bool2.booleanValue()) {
            this.f4473a.translate(c5563b.f4196a, c5563b.f4197b);
            this.f4473a.scale(c5563b.f4198c, c5563b.f4199d);
        }
        m3911F0(c5597r, false);
        this.f4473a.restore();
        if (zM3966m0) {
            m3962k0(abstractC5580i0, c5563b);
        }
        m3935R0();
    }

    /* renamed from: K */
    public final void m3920K(SVG.C5609x c5609x, String str) {
        SVG.C5586l0 c5586l0M3683p = c5609x.f4255a.m3683p(str);
        if (c5586l0M3683p == null) {
            m3887Z0("Pattern reference '%s' not found", str);
            return;
        }
        if (!(c5586l0M3683p instanceof SVG.C5609x)) {
            m3885F("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (c5586l0M3683p == c5609x) {
            m3885F("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        SVG.C5609x c5609x2 = (SVG.C5609x) c5586l0M3683p;
        if (c5609x.f4300q == null) {
            c5609x.f4300q = c5609x2.f4300q;
        }
        if (c5609x.f4301r == null) {
            c5609x.f4301r = c5609x2.f4301r;
        }
        if (c5609x.f4302s == null) {
            c5609x.f4302s = c5609x2.f4302s;
        }
        if (c5609x.f4303t == null) {
            c5609x.f4303t = c5609x2.f4303t;
        }
        if (c5609x.f4304u == null) {
            c5609x.f4304u = c5609x2.f4304u;
        }
        if (c5609x.f4305v == null) {
            c5609x.f4305v = c5609x2.f4305v;
        }
        if (c5609x.f4306w == null) {
            c5609x.f4306w = c5609x2.f4306w;
        }
        if (c5609x.f4222i.isEmpty()) {
            c5609x.f4222i = c5609x2.f4222i;
        }
        if (c5609x.f4275p == null) {
            c5609x.f4275p = c5609x2.f4275p;
        }
        if (c5609x.f4263o == null) {
            c5609x.f4263o = c5609x2.f4263o;
        }
        String str2 = c5609x2.f4307x;
        if (str2 != null) {
            m3920K(c5609x, str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: K0 */
    public final void m3921K0(SVG.C5596q0 c5596q0) {
        Set setMo3700a;
        String language = Locale.getDefault().getLanguage();
        SVG.m3668k();
        for (SVG.C5586l0 c5586l0 : c5596q0.getChildren()) {
            if (c5586l0 instanceof SVG.InterfaceC5572e0) {
                SVG.InterfaceC5572e0 interfaceC5572e0 = (SVG.InterfaceC5572e0) c5586l0;
                if (interfaceC5572e0.mo3701b() == null && ((setMo3700a = interfaceC5572e0.mo3700a()) == null || (!setMo3700a.isEmpty() && setMo3700a.contains(language)))) {
                    Set setMo3704f = interfaceC5572e0.mo3704f();
                    if (setMo3704f != null) {
                        if (f4472i == null) {
                            m3886V();
                        }
                        if (setMo3704f.isEmpty() || !f4472i.containsAll(setMo3704f)) {
                        }
                    }
                    Set setMo3708l = interfaceC5572e0.mo3708l();
                    if (setMo3708l != null) {
                        setMo3708l.isEmpty();
                    } else {
                        Set setMo3709m = interfaceC5572e0.mo3709m();
                        if (setMo3709m == null) {
                            m3902A0(c5586l0);
                            return;
                        }
                        setMo3709m.isEmpty();
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
    public final void m3922L(com.caverock.androidsvg.SVG.AbstractC5580i0 r21, android.graphics.Path r22, com.caverock.androidsvg.SVG.C5609x r23) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.C5624b.m3922L(com.caverock.androidsvg.SVG$i0, android.graphics.Path, com.caverock.androidsvg.SVG$x):void");
    }

    /* renamed from: L0 */
    public final void m3923L0(SVG.C5610x0 c5610x0) {
        m3900y("TextPath render", new Object[0]);
        m3944W0(this.f4476d, c5610x0);
        if (m3901A() && m3948Y0()) {
            SVG.C5586l0 c5586l0M3683p = c5610x0.f4255a.m3683p(c5610x0.f4308o);
            if (c5586l0M3683p == null) {
                m3885F("TextPath reference '%s' not found", c5610x0.f4308o);
                return;
            }
            SVG.C5603u c5603u = (SVG.C5603u) c5586l0M3683p;
            Path pathM3992c = new d(c5603u.f4293o).m3992c();
            Matrix matrix = c5603u.f4249n;
            if (matrix != null) {
                pathM3992c.transform(matrix);
            }
            PathMeasure pathMeasure = new PathMeasure(pathM3992c, false);
            SVG.C5591o c5591o = c5610x0.f4309p;
            float fM3715f = c5591o != null ? c5591o.m3715f(this, pathMeasure.getLength()) : 0.0f;
            SVG.Style.TextAnchor textAnchorM3928O = m3928O();
            if (textAnchorM3928O != SVG.Style.TextAnchor.Start) {
                float fM3967n = m3967n(c5610x0);
                if (textAnchorM3928O == SVG.Style.TextAnchor.Middle) {
                    fM3967n /= 2.0f;
                }
                fM3715f -= fM3967n;
            }
            m3975r((SVG.AbstractC5580i0) c5610x0.mo3693d());
            boolean zM3966m0 = m3966m0();
            m3909E(c5610x0, new e(pathM3992c, fM3715f, 0.0f));
            if (zM3966m0) {
                m3960j0(c5610x0);
            }
        }
    }

    /* renamed from: M */
    public final h m3924M(SVG.C5586l0 c5586l0) {
        h hVar = new h();
        m3942V0(hVar, SVG.Style.m3690b());
        return m3926N(c5586l0, hVar);
    }

    /* renamed from: M0 */
    public final boolean m3925M0() {
        return this.f4476d.f4512a.f4128m.floatValue() < 1.0f || this.f4476d.f4512a.f4109G != null;
    }

    /* renamed from: N */
    public final h m3926N(SVG.C5586l0 c5586l0, h hVar) {
        int i9;
        ArrayList arrayList = new ArrayList();
        while (true) {
            i9 = 0;
            if (c5586l0 instanceof SVG.AbstractC5582j0) {
                arrayList.add(0, (SVG.AbstractC5582j0) c5586l0);
            }
            Object obj = c5586l0.f4256b;
            if (obj == null) {
                break;
            }
            c5586l0 = (SVG.C5586l0) obj;
        }
        int size = arrayList.size();
        while (i9 < size) {
            Object obj2 = arrayList.get(i9);
            i9++;
            m3944W0(hVar, (SVG.AbstractC5582j0) obj2);
        }
        h hVar2 = this.f4476d;
        hVar.f4518g = hVar2.f4518g;
        hVar.f4517f = hVar2.f4517f;
        return hVar;
    }

    /* renamed from: N0 */
    public final void m3927N0() {
        this.f4476d = new h();
        this.f4477e = new Stack();
        m3942V0(this.f4476d, SVG.Style.m3690b());
        h hVar = this.f4476d;
        hVar.f4517f = null;
        hVar.f4519h = false;
        this.f4477e.push(new h(hVar));
        this.f4479g = new Stack();
        this.f4478f = new Stack();
    }

    /* renamed from: O */
    public final SVG.Style.TextAnchor m3928O() {
        SVG.Style.TextAnchor textAnchor;
        SVG.Style style = this.f4476d.f4512a;
        if (style.f4135t == SVG.Style.TextDirection.LTR || (textAnchor = style.f4136u) == SVG.Style.TextAnchor.Middle) {
            return style.f4136u;
        }
        SVG.Style.TextAnchor textAnchor2 = SVG.Style.TextAnchor.Start;
        return textAnchor == textAnchor2 ? SVG.Style.TextAnchor.End : textAnchor2;
    }

    /* renamed from: O0 */
    public final void m3929O0(float f10, float f11, float f12, float f13) {
        float fM3716g = f12 + f10;
        float fM3717h = f13 + f11;
        SVG.C5566c c5566c = this.f4476d.f4512a.f4138w;
        if (c5566c != null) {
            f10 += c5566c.f4208d.m3716g(this);
            f11 += this.f4476d.f4512a.f4138w.f4205a.m3717h(this);
            fM3716g -= this.f4476d.f4512a.f4138w.f4206b.m3716g(this);
            fM3717h -= this.f4476d.f4512a.f4138w.f4207c.m3717h(this);
        }
        this.f4473a.clipRect(f10, f11, fM3716g, fM3717h);
    }

    /* renamed from: P */
    public final Path.FillType m3930P() {
        SVG.Style.FillRule fillRule = this.f4476d.f4512a.f4108F;
        return (fillRule == null || fillRule != SVG.Style.FillRule.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    /* renamed from: P0 */
    public final void m3931P0(h hVar, boolean z9, SVG.AbstractC5588m0 abstractC5588m0) {
        int i9;
        SVG.Style style = hVar.f4512a;
        float fFloatValue = (z9 ? style.f4119d : style.f4121f).floatValue();
        if (abstractC5588m0 instanceof SVG.C5573f) {
            i9 = ((SVG.C5573f) abstractC5588m0).f4221a;
        } else if (!(abstractC5588m0 instanceof SVG.C5575g)) {
            return;
        } else {
            i9 = hVar.f4512a.f4129n.f4221a;
        }
        int iM3899x = m3899x(i9, fFloatValue);
        if (z9) {
            hVar.f4515d.setColor(iM3899x);
        } else {
            hVar.f4516e.setColor(iM3899x);
        }
    }

    /* renamed from: Q */
    public float m3932Q() {
        return this.f4476d.f4515d.getTextSize();
    }

    /* renamed from: Q0 */
    public final void m3933Q0(boolean z9, SVG.C5564b0 c5564b0) {
        if (z9) {
            if (m3943W(c5564b0.f4246e, 2147483648L)) {
                h hVar = this.f4476d;
                SVG.Style style = hVar.f4512a;
                SVG.AbstractC5588m0 abstractC5588m0 = c5564b0.f4246e.f4110H;
                style.f4117b = abstractC5588m0;
                hVar.f4513b = abstractC5588m0 != null;
            }
            if (m3943W(c5564b0.f4246e, 4294967296L)) {
                this.f4476d.f4512a.f4119d = c5564b0.f4246e.f4111I;
            }
            if (m3943W(c5564b0.f4246e, 6442450944L)) {
                h hVar2 = this.f4476d;
                m3931P0(hVar2, z9, hVar2.f4512a.f4117b);
                return;
            }
            return;
        }
        if (m3943W(c5564b0.f4246e, 2147483648L)) {
            h hVar3 = this.f4476d;
            SVG.Style style2 = hVar3.f4512a;
            SVG.AbstractC5588m0 abstractC5588m02 = c5564b0.f4246e.f4110H;
            style2.f4120e = abstractC5588m02;
            hVar3.f4514c = abstractC5588m02 != null;
        }
        if (m3943W(c5564b0.f4246e, 4294967296L)) {
            this.f4476d.f4512a.f4121f = c5564b0.f4246e.f4111I;
        }
        if (m3943W(c5564b0.f4246e, 6442450944L)) {
            h hVar4 = this.f4476d;
            m3931P0(hVar4, z9, hVar4.f4512a.f4120e);
        }
    }

    /* renamed from: R */
    public float m3934R() {
        return this.f4476d.f4515d.getTextSize() / 2.0f;
    }

    /* renamed from: R0 */
    public final void m3935R0() {
        this.f4473a.restore();
        this.f4476d = (h) this.f4477e.pop();
    }

    /* renamed from: S */
    public SVG.C5563b m3936S() {
        h hVar = this.f4476d;
        SVG.C5563b c5563b = hVar.f4518g;
        return c5563b != null ? c5563b : hVar.f4517f;
    }

    /* renamed from: S0 */
    public final void m3937S0() {
        this.f4473a.save();
        this.f4477e.push(this.f4476d);
        this.f4476d = new h(this.f4476d);
    }

    /* renamed from: T */
    public float m3938T() {
        return this.f4474b;
    }

    /* renamed from: T0 */
    public final String m3939T0(String str, boolean z9, boolean z10) {
        if (this.f4476d.f4519h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String strReplaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z9) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", "");
        }
        if (z10) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", "");
        }
        return strReplaceAll.replaceAll("\\s{2,}", " ");
    }

    /* renamed from: U */
    public final Path.FillType m3940U() {
        SVG.Style.FillRule fillRule = this.f4476d.f4512a.f4118c;
        return (fillRule == null || fillRule != SVG.Style.FillRule.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    /* renamed from: U0 */
    public final void m3941U0(SVG.AbstractC5580i0 abstractC5580i0) {
        if (abstractC5580i0.f4256b == null || abstractC5580i0.f4238h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (((Matrix) this.f4479g.peek()).invert(matrix)) {
            SVG.C5563b c5563b = abstractC5580i0.f4238h;
            float f10 = c5563b.f4196a;
            float f11 = c5563b.f4197b;
            float fM3695b = c5563b.m3695b();
            SVG.C5563b c5563b2 = abstractC5580i0.f4238h;
            float f12 = c5563b2.f4197b;
            float fM3695b2 = c5563b2.m3695b();
            float fM3696c = abstractC5580i0.f4238h.m3696c();
            SVG.C5563b c5563b3 = abstractC5580i0.f4238h;
            float[] fArr = {f10, f11, fM3695b, f12, fM3695b2, fM3696c, c5563b3.f4196a, c5563b3.m3696c()};
            matrix.preConcat(this.f4473a.getMatrix());
            matrix.mapPoints(fArr);
            float f13 = fArr[0];
            float f14 = fArr[1];
            RectF rectF = new RectF(f13, f14, f13, f14);
            for (int i9 = 2; i9 <= 6; i9 += 2) {
                float f15 = fArr[i9];
                if (f15 < rectF.left) {
                    rectF.left = f15;
                }
                if (f15 > rectF.right) {
                    rectF.right = f15;
                }
                float f16 = fArr[i9 + 1];
                if (f16 < rectF.top) {
                    rectF.top = f16;
                }
                if (f16 > rectF.bottom) {
                    rectF.bottom = f16;
                }
            }
            SVG.AbstractC5580i0 abstractC5580i02 = (SVG.AbstractC5580i0) this.f4478f.peek();
            SVG.C5563b c5563b4 = abstractC5580i02.f4238h;
            if (c5563b4 == null) {
                abstractC5580i02.f4238h = SVG.C5563b.m3694a(rectF.left, rectF.top, rectF.right, rectF.bottom);
            } else {
                c5563b4.m3698e(SVG.C5563b.m3694a(rectF.left, rectF.top, rectF.right, rectF.bottom));
            }
        }
    }

    /* renamed from: V0 */
    public final void m3942V0(h hVar, SVG.Style style) {
        if (m3943W(style, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM)) {
            hVar.f4512a.f4129n = style.f4129n;
        }
        if (m3943W(style, PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH)) {
            hVar.f4512a.f4128m = style.f4128m;
        }
        if (m3943W(style, 1L)) {
            hVar.f4512a.f4117b = style.f4117b;
            SVG.AbstractC5588m0 abstractC5588m0 = style.f4117b;
            hVar.f4513b = (abstractC5588m0 == null || abstractC5588m0 == SVG.C5573f.f4220c) ? false : true;
        }
        if (m3943W(style, 4L)) {
            hVar.f4512a.f4119d = style.f4119d;
        }
        if (m3943W(style, 6149L)) {
            m3931P0(hVar, true, hVar.f4512a.f4117b);
        }
        if (m3943W(style, 2L)) {
            hVar.f4512a.f4118c = style.f4118c;
        }
        if (m3943W(style, 8L)) {
            hVar.f4512a.f4120e = style.f4120e;
            SVG.AbstractC5588m0 abstractC5588m02 = style.f4120e;
            hVar.f4514c = (abstractC5588m02 == null || abstractC5588m02 == SVG.C5573f.f4220c) ? false : true;
        }
        if (m3943W(style, 16L)) {
            hVar.f4512a.f4121f = style.f4121f;
        }
        if (m3943W(style, 6168L)) {
            m3931P0(hVar, false, hVar.f4512a.f4120e);
        }
        if (m3943W(style, 34359738368L)) {
            hVar.f4512a.f4114L = style.f4114L;
        }
        if (m3943W(style, 32L)) {
            SVG.Style style2 = hVar.f4512a;
            SVG.C5591o c5591o = style.f4122g;
            style2.f4122g = c5591o;
            hVar.f4516e.setStrokeWidth(c5591o.m3714e(this));
        }
        if (m3943W(style, 64L)) {
            hVar.f4512a.f4123h = style.f4123h;
            int i9 = a.f4482b[style.f4123h.ordinal()];
            if (i9 == 1) {
                hVar.f4516e.setStrokeCap(Paint.Cap.BUTT);
            } else if (i9 == 2) {
                hVar.f4516e.setStrokeCap(Paint.Cap.ROUND);
            } else if (i9 == 3) {
                hVar.f4516e.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (m3943W(style, 128L)) {
            hVar.f4512a.f4124i = style.f4124i;
            int i10 = a.f4483c[style.f4124i.ordinal()];
            if (i10 == 1) {
                hVar.f4516e.setStrokeJoin(Paint.Join.MITER);
            } else if (i10 == 2) {
                hVar.f4516e.setStrokeJoin(Paint.Join.ROUND);
            } else if (i10 == 3) {
                hVar.f4516e.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (m3943W(style, 256L)) {
            hVar.f4512a.f4125j = style.f4125j;
            hVar.f4516e.setStrokeMiter(style.f4125j.floatValue());
        }
        if (m3943W(style, 512L)) {
            hVar.f4512a.f4126k = style.f4126k;
        }
        if (m3943W(style, PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID)) {
            hVar.f4512a.f4127l = style.f4127l;
        }
        Typeface typefaceM3979t = null;
        if (m3943W(style, 1536L)) {
            SVG.C5591o[] c5591oArr = hVar.f4512a.f4126k;
            if (c5591oArr == null) {
                hVar.f4516e.setPathEffect(null);
            } else {
                int length = c5591oArr.length;
                int i11 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i11];
                float f10 = 0.0f;
                for (int i12 = 0; i12 < i11; i12++) {
                    float fM3714e = hVar.f4512a.f4126k[i12 % length].m3714e(this);
                    fArr[i12] = fM3714e;
                    f10 += fM3714e;
                }
                if (f10 == 0.0f) {
                    hVar.f4516e.setPathEffect(null);
                } else {
                    float fM3714e2 = hVar.f4512a.f4127l.m3714e(this);
                    if (fM3714e2 < 0.0f) {
                        fM3714e2 = (fM3714e2 % f10) + f10;
                    }
                    hVar.f4516e.setPathEffect(new DashPathEffect(fArr, fM3714e2));
                }
            }
        }
        if (m3943W(style, PlaybackStateCompat.ACTION_PREPARE)) {
            float fM3932Q = m3932Q();
            hVar.f4512a.f4131p = style.f4131p;
            hVar.f4515d.setTextSize(style.f4131p.m3715f(this, fM3932Q));
            hVar.f4516e.setTextSize(style.f4131p.m3715f(this, fM3932Q));
        }
        if (m3943W(style, PlaybackStateCompat.ACTION_PLAY_FROM_URI)) {
            hVar.f4512a.f4130o = style.f4130o;
        }
        if (m3943W(style, PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID)) {
            if (style.f4132q.intValue() == -1 && hVar.f4512a.f4132q.intValue() > 100) {
                SVG.Style style3 = hVar.f4512a;
                style3.f4132q = Integer.valueOf(style3.f4132q.intValue() - 100);
            } else if (style.f4132q.intValue() != 1 || hVar.f4512a.f4132q.intValue() >= 900) {
                hVar.f4512a.f4132q = style.f4132q;
            } else {
                SVG.Style style4 = hVar.f4512a;
                style4.f4132q = Integer.valueOf(style4.f4132q.intValue() + 100);
            }
        }
        if (m3943W(style, PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH)) {
            hVar.f4512a.f4133r = style.f4133r;
        }
        if (m3943W(style, 106496L)) {
            if (hVar.f4512a.f4130o != null && this.f4475c != null) {
                SVG.m3668k();
                for (String str : hVar.f4512a.f4130o) {
                    SVG.Style style5 = hVar.f4512a;
                    typefaceM3979t = m3979t(str, style5.f4132q, style5.f4133r);
                    if (typefaceM3979t != null) {
                        break;
                    }
                }
            }
            if (typefaceM3979t == null) {
                SVG.Style style6 = hVar.f4512a;
                typefaceM3979t = m3979t("serif", style6.f4132q, style6.f4133r);
            }
            hVar.f4515d.setTypeface(typefaceM3979t);
            hVar.f4516e.setTypeface(typefaceM3979t);
        }
        if (m3943W(style, PlaybackStateCompat.ACTION_PREPARE_FROM_URI)) {
            hVar.f4512a.f4134s = style.f4134s;
            Paint paint = hVar.f4515d;
            SVG.Style.TextDecoration textDecoration = style.f4134s;
            SVG.Style.TextDecoration textDecoration2 = SVG.Style.TextDecoration.LineThrough;
            paint.setStrikeThruText(textDecoration == textDecoration2);
            Paint paint2 = hVar.f4515d;
            SVG.Style.TextDecoration textDecoration3 = style.f4134s;
            SVG.Style.TextDecoration textDecoration4 = SVG.Style.TextDecoration.Underline;
            paint2.setUnderlineText(textDecoration3 == textDecoration4);
            hVar.f4516e.setStrikeThruText(style.f4134s == textDecoration2);
            hVar.f4516e.setUnderlineText(style.f4134s == textDecoration4);
        }
        if (m3943W(style, 68719476736L)) {
            hVar.f4512a.f4135t = style.f4135t;
        }
        if (m3943W(style, PlaybackStateCompat.ACTION_SET_REPEAT_MODE)) {
            hVar.f4512a.f4136u = style.f4136u;
        }
        if (m3943W(style, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED)) {
            hVar.f4512a.f4137v = style.f4137v;
        }
        if (m3943W(style, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE)) {
            hVar.f4512a.f4139x = style.f4139x;
        }
        if (m3943W(style, 4194304L)) {
            hVar.f4512a.f4140y = style.f4140y;
        }
        if (m3943W(style, 8388608L)) {
            hVar.f4512a.f4141z = style.f4141z;
        }
        if (m3943W(style, 16777216L)) {
            hVar.f4512a.f4103A = style.f4103A;
        }
        if (m3943W(style, 33554432L)) {
            hVar.f4512a.f4104B = style.f4104B;
        }
        if (m3943W(style, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
            hVar.f4512a.f4138w = style.f4138w;
        }
        if (m3943W(style, 268435456L)) {
            hVar.f4512a.f4107E = style.f4107E;
        }
        if (m3943W(style, 536870912L)) {
            hVar.f4512a.f4108F = style.f4108F;
        }
        if (m3943W(style, 1073741824L)) {
            hVar.f4512a.f4109G = style.f4109G;
        }
        if (m3943W(style, 67108864L)) {
            hVar.f4512a.f4105C = style.f4105C;
        }
        if (m3943W(style, 134217728L)) {
            hVar.f4512a.f4106D = style.f4106D;
        }
        if (m3943W(style, 8589934592L)) {
            hVar.f4512a.f4112J = style.f4112J;
        }
        if (m3943W(style, 17179869184L)) {
            hVar.f4512a.f4113K = style.f4113K;
        }
        if (m3943W(style, 137438953472L)) {
            hVar.f4512a.f4115M = style.f4115M;
        }
    }

    /* renamed from: W */
    public final boolean m3943W(SVG.Style style, long j9) {
        return (style.f4116a & j9) != 0;
    }

    /* renamed from: W0 */
    public final void m3944W0(h hVar, SVG.AbstractC5582j0 abstractC5582j0) {
        hVar.f4512a.m3691d(abstractC5582j0.f4256b == null);
        SVG.Style style = abstractC5582j0.f4246e;
        if (style != null) {
            m3942V0(hVar, style);
        }
        if (this.f4475c.m3681n()) {
            for (CSSParser.C5555l c5555l : this.f4475c.m3673d()) {
                if (CSSParser.m3623l(this.f4480h, c5555l.f4056a, abstractC5582j0)) {
                    m3942V0(hVar, c5555l.f4057b);
                }
            }
        }
        SVG.Style style2 = abstractC5582j0.f4247f;
        if (style2 != null) {
            m3942V0(hVar, style2);
        }
    }

    /* renamed from: X */
    public final void m3945X(boolean z9, SVG.C5563b c5563b, SVG.C5584k0 c5584k0) {
        float fM3715f;
        float f10;
        float fM3715f2;
        float f11;
        String str = c5584k0.f4243l;
        if (str != null) {
            m3914H(c5584k0, str);
        }
        Boolean bool = c5584k0.f4240i;
        int i9 = 0;
        boolean z10 = bool != null && bool.booleanValue();
        h hVar = this.f4476d;
        Paint paint = z9 ? hVar.f4515d : hVar.f4516e;
        if (z10) {
            SVG.C5563b c5563bM3936S = m3936S();
            SVG.C5591o c5591o = c5584k0.f4250m;
            float fM3716g = c5591o != null ? c5591o.m3716g(this) : 0.0f;
            SVG.C5591o c5591o2 = c5584k0.f4251n;
            fM3715f = c5591o2 != null ? c5591o2.m3717h(this) : 0.0f;
            SVG.C5591o c5591o3 = c5584k0.f4252o;
            float fM3716g2 = c5591o3 != null ? c5591o3.m3716g(this) : c5563bM3936S.f4198c;
            SVG.C5591o c5591o4 = c5584k0.f4253p;
            f11 = fM3716g2;
            f10 = fM3716g;
            fM3715f2 = c5591o4 != null ? c5591o4.m3717h(this) : 0.0f;
        } else {
            SVG.C5591o c5591o5 = c5584k0.f4250m;
            float fM3715f3 = c5591o5 != null ? c5591o5.m3715f(this, 1.0f) : 0.0f;
            SVG.C5591o c5591o6 = c5584k0.f4251n;
            fM3715f = c5591o6 != null ? c5591o6.m3715f(this, 1.0f) : 0.0f;
            SVG.C5591o c5591o7 = c5584k0.f4252o;
            float fM3715f4 = c5591o7 != null ? c5591o7.m3715f(this, 1.0f) : 1.0f;
            SVG.C5591o c5591o8 = c5584k0.f4253p;
            f10 = fM3715f3;
            fM3715f2 = c5591o8 != null ? c5591o8.m3715f(this, 1.0f) : 0.0f;
            f11 = fM3715f4;
        }
        float f12 = fM3715f;
        m3937S0();
        this.f4476d = m3924M(c5584k0);
        Matrix matrix = new Matrix();
        if (!z10) {
            matrix.preTranslate(c5563b.f4196a, c5563b.f4197b);
            matrix.preScale(c5563b.f4198c, c5563b.f4199d);
        }
        Matrix matrix2 = c5584k0.f4241j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = c5584k0.f4239h.size();
        if (size == 0) {
            m3935R0();
            if (z9) {
                this.f4476d.f4513b = false;
                return;
            } else {
                this.f4476d.f4514c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator it = c5584k0.f4239h.iterator();
        float f13 = -1.0f;
        while (it.hasNext()) {
            SVG.C5567c0 c5567c0 = (SVG.C5567c0) ((SVG.C5586l0) it.next());
            Float f14 = c5567c0.f4209h;
            float fFloatValue = f14 != null ? f14.floatValue() : 0.0f;
            if (i9 == 0 || fFloatValue >= f13) {
                fArr[i9] = fFloatValue;
                f13 = fFloatValue;
            } else {
                fArr[i9] = f13;
            }
            m3937S0();
            m3944W0(this.f4476d, c5567c0);
            SVG.Style style = this.f4476d.f4512a;
            SVG.C5573f c5573f = (SVG.C5573f) style.f4105C;
            if (c5573f == null) {
                c5573f = SVG.C5573f.f4219b;
            }
            iArr[i9] = m3899x(c5573f.f4221a, style.f4106D.floatValue());
            i9++;
            m3935R0();
        }
        if ((f10 == f11 && f12 == fM3715f2) || size == 1) {
            m3935R0();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        SVG.GradientSpread gradientSpread = c5584k0.f4242k;
        if (gradientSpread != null) {
            if (gradientSpread == SVG.GradientSpread.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (gradientSpread == SVG.GradientSpread.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        m3935R0();
        LinearGradient linearGradient = new LinearGradient(f10, f12, f11, fM3715f2, iArr, fArr, tileMode2);
        linearGradient.setLocalMatrix(matrix);
        paint.setShader(linearGradient);
        paint.setAlpha(m3898w(this.f4476d.f4512a.f4119d.floatValue()));
    }

    /* renamed from: X0 */
    public final void m3946X0() {
        int iM3899x;
        SVG.Style style = this.f4476d.f4512a;
        SVG.AbstractC5588m0 abstractC5588m0 = style.f4112J;
        if (abstractC5588m0 instanceof SVG.C5573f) {
            iM3899x = ((SVG.C5573f) abstractC5588m0).f4221a;
        } else if (!(abstractC5588m0 instanceof SVG.C5575g)) {
            return;
        } else {
            iM3899x = style.f4129n.f4221a;
        }
        Float f10 = style.f4113K;
        if (f10 != null) {
            iM3899x = m3899x(iM3899x, f10.floatValue());
        }
        this.f4473a.drawColor(iM3899x);
    }

    /* renamed from: Y */
    public final Path m3947Y(SVG.C5569d c5569d) {
        SVG.C5591o c5591o = c5569d.f4210o;
        float fM3716g = c5591o != null ? c5591o.m3716g(this) : 0.0f;
        SVG.C5591o c5591o2 = c5569d.f4211p;
        float fM3717h = c5591o2 != null ? c5591o2.m3717h(this) : 0.0f;
        float fM3714e = c5569d.f4212q.m3714e(this);
        float f10 = fM3716g - fM3714e;
        float f11 = fM3717h - fM3714e;
        float f12 = fM3716g + fM3714e;
        float f13 = fM3717h + fM3714e;
        if (c5569d.f4238h == null) {
            float f14 = 2.0f * fM3714e;
            c5569d.f4238h = new SVG.C5563b(f10, f11, f14, f14);
        }
        float f15 = fM3714e * 0.5522848f;
        Path path = new Path();
        path.moveTo(fM3716g, f11);
        float f16 = fM3716g + f15;
        float f17 = fM3717h - f15;
        path.cubicTo(f16, f11, f12, f17, f12, fM3717h);
        float f18 = fM3717h + f15;
        path.cubicTo(f12, f18, f16, f13, fM3716g, f13);
        float f19 = fM3716g - f15;
        path.cubicTo(f19, f13, f10, f18, f10, fM3717h);
        path.cubicTo(f10, f17, f19, f11, fM3716g, f11);
        path.close();
        return path;
    }

    /* renamed from: Y0 */
    public final boolean m3948Y0() {
        Boolean bool = this.f4476d.f4512a.f4104B;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: Z */
    public final Path m3949Z(SVG.C5579i c5579i) {
        SVG.C5591o c5591o = c5579i.f4234o;
        float fM3716g = c5591o != null ? c5591o.m3716g(this) : 0.0f;
        SVG.C5591o c5591o2 = c5579i.f4235p;
        float fM3717h = c5591o2 != null ? c5591o2.m3717h(this) : 0.0f;
        float fM3716g2 = c5579i.f4236q.m3716g(this);
        float fM3717h2 = c5579i.f4237r.m3717h(this);
        float f10 = fM3716g - fM3716g2;
        float f11 = fM3717h - fM3717h2;
        float f12 = fM3716g + fM3716g2;
        float f13 = fM3717h + fM3717h2;
        if (c5579i.f4238h == null) {
            c5579i.f4238h = new SVG.C5563b(f10, f11, fM3716g2 * 2.0f, 2.0f * fM3717h2);
        }
        float f14 = fM3716g2 * 0.5522848f;
        float f15 = fM3717h2 * 0.5522848f;
        Path path = new Path();
        path.moveTo(fM3716g, f11);
        float f16 = fM3716g + f14;
        float f17 = fM3717h - f15;
        path.cubicTo(f16, f11, f12, f17, f12, fM3717h);
        float f18 = fM3717h + f15;
        path.cubicTo(f12, f18, f16, f13, fM3716g, f13);
        float f19 = fM3716g - f14;
        path.cubicTo(f19, f13, f10, f18, f10, fM3717h);
        path.cubicTo(f10, f17, f19, f11, fM3716g, f11);
        path.close();
        return path;
    }

    /* renamed from: a0 */
    public final Path m3950a0(SVG.C5593p c5593p) {
        SVG.C5591o c5591o = c5593p.f4271o;
        float fM3716g = c5591o == null ? 0.0f : c5591o.m3716g(this);
        SVG.C5591o c5591o2 = c5593p.f4272p;
        float fM3717h = c5591o2 == null ? 0.0f : c5591o2.m3717h(this);
        SVG.C5591o c5591o3 = c5593p.f4273q;
        float fM3716g2 = c5591o3 == null ? 0.0f : c5591o3.m3716g(this);
        SVG.C5591o c5591o4 = c5593p.f4274r;
        float fM3717h2 = c5591o4 != null ? c5591o4.m3717h(this) : 0.0f;
        if (c5593p.f4238h == null) {
            c5593p.f4238h = new SVG.C5563b(Math.min(fM3716g, fM3716g2), Math.min(fM3717h, fM3717h2), Math.abs(fM3716g2 - fM3716g), Math.abs(fM3717h2 - fM3717h));
        }
        Path path = new Path();
        path.moveTo(fM3716g, fM3717h);
        path.lineTo(fM3716g2, fM3717h2);
        return path;
    }

    /* renamed from: b0 */
    public final Path m3951b0(SVG.C5611y c5611y) {
        Path path = new Path();
        float[] fArr = c5611y.f4311o;
        path.moveTo(fArr[0], fArr[1]);
        int i9 = 2;
        while (true) {
            float[] fArr2 = c5611y.f4311o;
            if (i9 >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i9], fArr2[i9 + 1]);
            i9 += 2;
        }
        if (c5611y instanceof SVG.C5613z) {
            path.close();
        }
        if (c5611y.f4238h == null) {
            c5611y.f4238h = m3965m(path);
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
    public final android.graphics.Path m3952c0(com.caverock.androidsvg.SVG.C5561a0 r20) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.C5624b.m3952c0(com.caverock.androidsvg.SVG$a0):android.graphics.Path");
    }

    /* renamed from: d0 */
    public final Path m3953d0(SVG.C5604u0 c5604u0) {
        List list = c5604u0.f4312o;
        float fM3717h = 0.0f;
        float fM3716g = (list == null || list.size() == 0) ? 0.0f : ((SVG.C5591o) c5604u0.f4312o.get(0)).m3716g(this);
        List list2 = c5604u0.f4313p;
        float fM3717h2 = (list2 == null || list2.size() == 0) ? 0.0f : ((SVG.C5591o) c5604u0.f4313p.get(0)).m3717h(this);
        List list3 = c5604u0.f4314q;
        float fM3716g2 = (list3 == null || list3.size() == 0) ? 0.0f : ((SVG.C5591o) c5604u0.f4314q.get(0)).m3716g(this);
        List list4 = c5604u0.f4315r;
        if (list4 != null && list4.size() != 0) {
            fM3717h = ((SVG.C5591o) c5604u0.f4315r.get(0)).m3717h(this);
        }
        if (this.f4476d.f4512a.f4136u != SVG.Style.TextAnchor.Start) {
            float fM3967n = m3967n(c5604u0);
            if (this.f4476d.f4512a.f4136u == SVG.Style.TextAnchor.Middle) {
                fM3967n /= 2.0f;
            }
            fM3716g -= fM3967n;
        }
        if (c5604u0.f4238h == null) {
            i iVar = new i(fM3716g, fM3717h2);
            m3909E(c5604u0, iVar);
            RectF rectF = iVar.f4523d;
            c5604u0.f4238h = new SVG.C5563b(rectF.left, rectF.top, rectF.width(), iVar.f4523d.height());
        }
        Path path = new Path();
        m3909E(c5604u0, new g(fM3716g + fM3716g2, fM3717h2 + fM3717h, path));
        return path;
    }

    /* renamed from: e0 */
    public final void m3954e0(boolean z9, SVG.C5563b c5563b, SVG.C5592o0 c5592o0) {
        float f10;
        float fM3715f;
        float f11;
        String str = c5592o0.f4243l;
        if (str != null) {
            m3914H(c5592o0, str);
        }
        Boolean bool = c5592o0.f4240i;
        int i9 = 0;
        boolean z10 = bool != null && bool.booleanValue();
        h hVar = this.f4476d;
        Paint paint = z9 ? hVar.f4515d : hVar.f4516e;
        if (z10) {
            SVG.C5591o c5591o = new SVG.C5591o(50.0f, SVG.Unit.percent);
            SVG.C5591o c5591o2 = c5592o0.f4266m;
            float fM3716g = c5591o2 != null ? c5591o2.m3716g(this) : c5591o.m3716g(this);
            SVG.C5591o c5591o3 = c5592o0.f4267n;
            float fM3717h = c5591o3 != null ? c5591o3.m3717h(this) : c5591o.m3717h(this);
            SVG.C5591o c5591o4 = c5592o0.f4268o;
            fM3715f = c5591o4 != null ? c5591o4.m3714e(this) : c5591o.m3714e(this);
            f10 = fM3716g;
            f11 = fM3717h;
        } else {
            SVG.C5591o c5591o5 = c5592o0.f4266m;
            float fM3715f2 = c5591o5 != null ? c5591o5.m3715f(this, 1.0f) : 0.5f;
            SVG.C5591o c5591o6 = c5592o0.f4267n;
            float fM3715f3 = c5591o6 != null ? c5591o6.m3715f(this, 1.0f) : 0.5f;
            SVG.C5591o c5591o7 = c5592o0.f4268o;
            f10 = fM3715f2;
            fM3715f = c5591o7 != null ? c5591o7.m3715f(this, 1.0f) : 0.5f;
            f11 = fM3715f3;
        }
        m3937S0();
        this.f4476d = m3924M(c5592o0);
        Matrix matrix = new Matrix();
        if (!z10) {
            matrix.preTranslate(c5563b.f4196a, c5563b.f4197b);
            matrix.preScale(c5563b.f4198c, c5563b.f4199d);
        }
        Matrix matrix2 = c5592o0.f4241j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        int size = c5592o0.f4239h.size();
        if (size == 0) {
            m3935R0();
            if (z9) {
                this.f4476d.f4513b = false;
                return;
            } else {
                this.f4476d.f4514c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator it = c5592o0.f4239h.iterator();
        float f12 = -1.0f;
        while (it.hasNext()) {
            SVG.C5567c0 c5567c0 = (SVG.C5567c0) ((SVG.C5586l0) it.next());
            Float f13 = c5567c0.f4209h;
            float fFloatValue = f13 != null ? f13.floatValue() : 0.0f;
            if (i9 == 0 || fFloatValue >= f12) {
                fArr[i9] = fFloatValue;
                f12 = fFloatValue;
            } else {
                fArr[i9] = f12;
            }
            m3937S0();
            m3944W0(this.f4476d, c5567c0);
            SVG.Style style = this.f4476d.f4512a;
            SVG.C5573f c5573f = (SVG.C5573f) style.f4105C;
            if (c5573f == null) {
                c5573f = SVG.C5573f.f4219b;
            }
            iArr[i9] = m3899x(c5573f.f4221a, style.f4106D.floatValue());
            i9++;
            m3935R0();
        }
        if (fM3715f == 0.0f || size == 1) {
            m3935R0();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        SVG.GradientSpread gradientSpread = c5592o0.f4242k;
        if (gradientSpread != null) {
            if (gradientSpread == SVG.GradientSpread.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (gradientSpread == SVG.GradientSpread.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode2 = tileMode;
        m3935R0();
        RadialGradient radialGradient = new RadialGradient(f10, f11, fM3715f, iArr, fArr, tileMode2);
        radialGradient.setLocalMatrix(matrix);
        paint.setShader(radialGradient);
        paint.setAlpha(m3898w(this.f4476d.f4512a.f4119d.floatValue()));
    }

    /* renamed from: f0 */
    public final SVG.C5563b m3955f0(SVG.C5591o c5591o, SVG.C5591o c5591o2, SVG.C5591o c5591o3, SVG.C5591o c5591o4) {
        float fM3716g = c5591o != null ? c5591o.m3716g(this) : 0.0f;
        float fM3717h = c5591o2 != null ? c5591o2.m3717h(this) : 0.0f;
        SVG.C5563b c5563bM3936S = m3936S();
        return new SVG.C5563b(fM3716g, fM3717h, c5591o3 != null ? c5591o3.m3716g(this) : c5563bM3936S.f4198c, c5591o4 != null ? c5591o4.m3717h(this) : c5563bM3936S.f4199d);
    }

    /* renamed from: g0 */
    public final Path m3956g0(SVG.AbstractC5580i0 abstractC5580i0, boolean z9) {
        Path pathM3953d0;
        Path pathM3959j;
        this.f4477e.push(this.f4476d);
        h hVar = new h(this.f4476d);
        this.f4476d = hVar;
        m3944W0(hVar, abstractC5580i0);
        if (!m3901A() || !m3948Y0()) {
            this.f4476d = (h) this.f4477e.pop();
            return null;
        }
        if (abstractC5580i0 instanceof SVG.C5565b1) {
            if (!z9) {
                m3885F("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            SVG.C5565b1 c5565b1 = (SVG.C5565b1) abstractC5580i0;
            SVG.C5586l0 c5586l0M3683p = abstractC5580i0.f4255a.m3683p(c5565b1.f4200p);
            if (c5586l0M3683p == null) {
                m3885F("Use reference '%s' not found", c5565b1.f4200p);
                this.f4476d = (h) this.f4477e.pop();
                return null;
            }
            if (!(c5586l0M3683p instanceof SVG.AbstractC5580i0)) {
                this.f4476d = (h) this.f4477e.pop();
                return null;
            }
            pathM3953d0 = m3956g0((SVG.AbstractC5580i0) c5586l0M3683p, false);
            if (pathM3953d0 == null) {
                return null;
            }
            if (c5565b1.f4238h == null) {
                c5565b1.f4238h = m3965m(pathM3953d0);
            }
            Matrix matrix = c5565b1.f4254o;
            if (matrix != null) {
                pathM3953d0.transform(matrix);
            }
        } else if (abstractC5580i0 instanceof SVG.AbstractC5583k) {
            SVG.AbstractC5583k abstractC5583k = (SVG.AbstractC5583k) abstractC5580i0;
            if (abstractC5580i0 instanceof SVG.C5603u) {
                pathM3953d0 = new d(((SVG.C5603u) abstractC5580i0).f4293o).m3992c();
                if (abstractC5580i0.f4238h == null) {
                    abstractC5580i0.f4238h = m3965m(pathM3953d0);
                }
            } else {
                pathM3953d0 = abstractC5580i0 instanceof SVG.C5561a0 ? m3952c0((SVG.C5561a0) abstractC5580i0) : abstractC5580i0 instanceof SVG.C5569d ? m3947Y((SVG.C5569d) abstractC5580i0) : abstractC5580i0 instanceof SVG.C5579i ? m3949Z((SVG.C5579i) abstractC5580i0) : abstractC5580i0 instanceof SVG.C5611y ? m3951b0((SVG.C5611y) abstractC5580i0) : null;
            }
            if (pathM3953d0 == null) {
                return null;
            }
            if (abstractC5583k.f4238h == null) {
                abstractC5583k.f4238h = m3965m(pathM3953d0);
            }
            Matrix matrix2 = abstractC5583k.f4249n;
            if (matrix2 != null) {
                pathM3953d0.transform(matrix2);
            }
            pathM3953d0.setFillType(m3930P());
        } else {
            if (!(abstractC5580i0 instanceof SVG.C5604u0)) {
                m3885F("Invalid %s element found in clipPath definition", abstractC5580i0.mo3692n());
                return null;
            }
            SVG.C5604u0 c5604u0 = (SVG.C5604u0) abstractC5580i0;
            pathM3953d0 = m3953d0(c5604u0);
            if (pathM3953d0 == null) {
                return null;
            }
            Matrix matrix3 = c5604u0.f4295s;
            if (matrix3 != null) {
                pathM3953d0.transform(matrix3);
            }
            pathM3953d0.setFillType(m3930P());
        }
        if (this.f4476d.f4512a.f4107E != null && (pathM3959j = m3959j(abstractC5580i0, abstractC5580i0.f4238h)) != null) {
            pathM3953d0.op(pathM3959j, Path.Op.INTERSECT);
        }
        this.f4476d = (h) this.f4477e.pop();
        return pathM3953d0;
    }

    /* renamed from: h0 */
    public final void m3957h0() {
        this.f4478f.pop();
        this.f4479g.pop();
    }

    /* renamed from: i0 */
    public final void m3958i0(SVG.InterfaceC5578h0 interfaceC5578h0) {
        this.f4478f.push(interfaceC5578h0);
        this.f4479g.push(this.f4473a.getMatrix());
    }

    /* renamed from: j */
    public final Path m3959j(SVG.AbstractC5580i0 abstractC5580i0, SVG.C5563b c5563b) {
        Path pathM3956g0;
        SVG.C5586l0 c5586l0M3683p = abstractC5580i0.f4255a.m3683p(this.f4476d.f4512a.f4107E);
        if (c5586l0M3683p == null) {
            m3885F("ClipPath reference '%s' not found", this.f4476d.f4512a.f4107E);
            return null;
        }
        SVG.C5571e c5571e = (SVG.C5571e) c5586l0M3683p;
        this.f4477e.push(this.f4476d);
        this.f4476d = m3924M(c5571e);
        Boolean bool = c5571e.f4218p;
        boolean z9 = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z9) {
            matrix.preTranslate(c5563b.f4196a, c5563b.f4197b);
            matrix.preScale(c5563b.f4198c, c5563b.f4199d);
        }
        Matrix matrix2 = c5571e.f4254o;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (SVG.C5586l0 c5586l0 : c5571e.f4222i) {
            if ((c5586l0 instanceof SVG.AbstractC5580i0) && (pathM3956g0 = m3956g0((SVG.AbstractC5580i0) c5586l0, true)) != null) {
                path.op(pathM3956g0, Path.Op.UNION);
            }
        }
        if (this.f4476d.f4512a.f4107E != null) {
            if (c5571e.f4238h == null) {
                c5571e.f4238h = m3965m(path);
            }
            Path pathM3959j = m3959j(c5571e, c5571e.f4238h);
            if (pathM3959j != null) {
                path.op(pathM3959j, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f4476d = (h) this.f4477e.pop();
        return path;
    }

    /* renamed from: j0 */
    public final void m3960j0(SVG.AbstractC5580i0 abstractC5580i0) {
        m3962k0(abstractC5580i0, abstractC5580i0.f4238h);
    }

    /* renamed from: k */
    public final List m3961k(SVG.C5593p c5593p) {
        SVG.C5591o c5591o = c5593p.f4271o;
        float fM3716g = c5591o != null ? c5591o.m3716g(this) : 0.0f;
        SVG.C5591o c5591o2 = c5593p.f4272p;
        float fM3717h = c5591o2 != null ? c5591o2.m3717h(this) : 0.0f;
        SVG.C5591o c5591o3 = c5593p.f4273q;
        float fM3716g2 = c5591o3 != null ? c5591o3.m3716g(this) : 0.0f;
        SVG.C5591o c5591o4 = c5593p.f4274r;
        float fM3717h2 = c5591o4 != null ? c5591o4.m3717h(this) : 0.0f;
        ArrayList arrayList = new ArrayList(2);
        float f10 = fM3716g2 - fM3716g;
        float f11 = fM3717h2 - fM3717h;
        arrayList.add(new c(fM3716g, fM3717h, f10, f11));
        arrayList.add(new c(fM3716g2, fM3717h2, f10, f11));
        return arrayList;
    }

    /* renamed from: k0 */
    public final void m3962k0(SVG.AbstractC5580i0 abstractC5580i0, SVG.C5563b c5563b) {
        if (this.f4476d.f4512a.f4109G != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            this.f4473a.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            this.f4473a.saveLayer(null, paint2, 31);
            SVG.C5597r c5597r = (SVG.C5597r) this.f4475c.m3683p(this.f4476d.f4512a.f4109G);
            m3919J0(c5597r, abstractC5580i0, c5563b);
            this.f4473a.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            this.f4473a.saveLayer(null, paint3, 31);
            m3919J0(c5597r, abstractC5580i0, c5563b);
            this.f4473a.restore();
            this.f4473a.restore();
        }
        m3935R0();
    }

    /* renamed from: l */
    public final List m3963l(SVG.C5611y c5611y) {
        int length = c5611y.f4311o.length;
        int i9 = 2;
        if (length < 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        float[] fArr = c5611y.f4311o;
        c cVar = new c(fArr[0], fArr[1], 0.0f, 0.0f);
        float f10 = 0.0f;
        float f11 = 0.0f;
        while (i9 < length) {
            float[] fArr2 = c5611y.f4311o;
            float f12 = fArr2[i9];
            float f13 = fArr2[i9 + 1];
            cVar.m3990a(f12, f13);
            arrayList.add(cVar);
            i9 += 2;
            cVar = new c(f12, f13, f12 - cVar.f4493a, f13 - cVar.f4494b);
            f10 = f12;
            f11 = f13;
        }
        if (!(c5611y instanceof SVG.C5613z)) {
            arrayList.add(cVar);
            return arrayList;
        }
        float[] fArr3 = c5611y.f4311o;
        float f14 = fArr3[0];
        if (f10 != f14) {
            float f15 = fArr3[1];
            if (f11 != f15) {
                cVar.m3990a(f14, f15);
                arrayList.add(cVar);
                c cVar2 = new c(f14, f15, f14 - cVar.f4493a, f15 - cVar.f4494b);
                cVar2.m3991b((c) arrayList.get(0));
                arrayList.add(cVar2);
                arrayList.set(0, cVar2);
            }
        }
        return arrayList;
    }

    /* renamed from: l0 */
    public final void m3964l0(SVG.C5586l0 c5586l0, j jVar) {
        float f10;
        float fM3717h;
        float fM3716g;
        SVG.Style.TextAnchor textAnchorM3928O;
        if (jVar.mo3994a((SVG.AbstractC5608w0) c5586l0)) {
            if (c5586l0 instanceof SVG.C5610x0) {
                m3937S0();
                m3923L0((SVG.C5610x0) c5586l0);
                m3935R0();
                return;
            }
            if (!(c5586l0 instanceof SVG.C5602t0)) {
                if (c5586l0 instanceof SVG.C5600s0) {
                    m3937S0();
                    SVG.C5600s0 c5600s0 = (SVG.C5600s0) c5586l0;
                    m3944W0(this.f4476d, c5600s0);
                    if (m3901A()) {
                        m3975r((SVG.AbstractC5580i0) c5600s0.mo3693d());
                        SVG.C5586l0 c5586l0M3683p = c5586l0.f4255a.m3683p(c5600s0.f4288o);
                        if (c5586l0M3683p == null || !(c5586l0M3683p instanceof SVG.AbstractC5608w0)) {
                            m3885F("Tref reference '%s' not found", c5600s0.f4288o);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            m3912G((SVG.AbstractC5608w0) c5586l0M3683p, sb);
                            if (sb.length() > 0) {
                                jVar.mo3993b(sb.toString());
                            }
                        }
                    }
                    m3935R0();
                    return;
                }
                return;
            }
            m3900y("TSpan render", new Object[0]);
            m3937S0();
            SVG.C5602t0 c5602t0 = (SVG.C5602t0) c5586l0;
            m3944W0(this.f4476d, c5602t0);
            if (m3901A()) {
                List list = c5602t0.f4312o;
                boolean z9 = list != null && list.size() > 0;
                boolean z10 = jVar instanceof f;
                float fM3717h2 = 0.0f;
                if (z10) {
                    float fM3716g2 = !z9 ? ((f) jVar).f4505b : ((SVG.C5591o) c5602t0.f4312o.get(0)).m3716g(this);
                    List list2 = c5602t0.f4313p;
                    fM3717h = (list2 == null || list2.size() == 0) ? ((f) jVar).f4506c : ((SVG.C5591o) c5602t0.f4313p.get(0)).m3717h(this);
                    List list3 = c5602t0.f4314q;
                    fM3716g = (list3 == null || list3.size() == 0) ? 0.0f : ((SVG.C5591o) c5602t0.f4314q.get(0)).m3716g(this);
                    List list4 = c5602t0.f4315r;
                    if (list4 != null && list4.size() != 0) {
                        fM3717h2 = ((SVG.C5591o) c5602t0.f4315r.get(0)).m3717h(this);
                    }
                    f10 = fM3717h2;
                    fM3717h2 = fM3716g2;
                } else {
                    f10 = 0.0f;
                    fM3717h = 0.0f;
                    fM3716g = 0.0f;
                }
                if (z9 && (textAnchorM3928O = m3928O()) != SVG.Style.TextAnchor.Start) {
                    float fM3967n = m3967n(c5602t0);
                    if (textAnchorM3928O == SVG.Style.TextAnchor.Middle) {
                        fM3967n /= 2.0f;
                    }
                    fM3717h2 -= fM3967n;
                }
                m3975r((SVG.AbstractC5580i0) c5602t0.mo3693d());
                if (z10) {
                    f fVar = (f) jVar;
                    fVar.f4505b = fM3717h2 + fM3716g;
                    fVar.f4506c = fM3717h + f10;
                }
                boolean zM3966m0 = m3966m0();
                m3909E(c5602t0, jVar);
                if (zM3966m0) {
                    m3960j0(c5602t0);
                }
            }
            m3935R0();
        }
    }

    /* renamed from: m */
    public final SVG.C5563b m3965m(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new SVG.C5563b(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* renamed from: m0 */
    public final boolean m3966m0() {
        SVG.C5586l0 c5586l0M3683p;
        if (!m3925M0()) {
            return false;
        }
        this.f4473a.saveLayerAlpha(null, m3898w(this.f4476d.f4512a.f4128m.floatValue()), 31);
        this.f4477e.push(this.f4476d);
        h hVar = new h(this.f4476d);
        this.f4476d = hVar;
        String str = hVar.f4512a.f4109G;
        if (str != null && ((c5586l0M3683p = this.f4475c.m3683p(str)) == null || !(c5586l0M3683p instanceof SVG.C5597r))) {
            m3885F("Mask reference '%s' not found", this.f4476d.f4512a.f4109G);
            this.f4476d.f4512a.f4109G = null;
        }
        return true;
    }

    /* renamed from: n */
    public final float m3967n(SVG.AbstractC5608w0 abstractC5608w0) {
        k kVar = new k(this, null);
        m3909E(abstractC5608w0, kVar);
        return kVar.f4526b;
    }

    /* renamed from: n0 */
    public final c m3968n0(c cVar, c cVar2, c cVar3) {
        float fM3907D = m3907D(cVar2.f4495c, cVar2.f4496d, cVar2.f4493a - cVar.f4493a, cVar2.f4494b - cVar.f4494b);
        if (fM3907D == 0.0f) {
            fM3907D = m3907D(cVar2.f4495c, cVar2.f4496d, cVar3.f4493a - cVar2.f4493a, cVar3.f4494b - cVar2.f4494b);
        }
        if (fM3907D > 0.0f || (fM3907D == 0.0f && (cVar2.f4495c > 0.0f || cVar2.f4496d >= 0.0f))) {
            return cVar2;
        }
        cVar2.f4495c = -cVar2.f4495c;
        cVar2.f4496d = -cVar2.f4496d;
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
    public final android.graphics.Matrix m3969o(com.caverock.androidsvg.SVG.C5563b r10, com.caverock.androidsvg.SVG.C5563b r11, com.caverock.androidsvg.PreserveAspectRatio r12) {
        /*
            r9 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r12 == 0) goto L9d
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r1 = r12.m3666a()
            if (r1 != 0) goto Lf
            goto L9d
        Lf:
            float r1 = r10.f4198c
            float r2 = r11.f4198c
            float r1 = r1 / r2
            float r2 = r10.f4199d
            float r3 = r11.f4199d
            float r2 = r2 / r3
            float r3 = r11.f4196a
            float r3 = -r3
            float r4 = r11.f4197b
            float r4 = -r4
            com.caverock.androidsvg.PreserveAspectRatio r5 = com.caverock.androidsvg.PreserveAspectRatio.f4068d
            boolean r5 = r12.equals(r5)
            if (r5 == 0) goto L35
            float r11 = r10.f4196a
            float r10 = r10.f4197b
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r2)
            r0.preTranslate(r3, r4)
            return r0
        L35:
            com.caverock.androidsvg.PreserveAspectRatio$Scale r5 = r12.m3667b()
            com.caverock.androidsvg.PreserveAspectRatio$Scale r6 = com.caverock.androidsvg.PreserveAspectRatio.Scale.slice
            if (r5 != r6) goto L42
            float r1 = java.lang.Math.max(r1, r2)
            goto L46
        L42:
            float r1 = java.lang.Math.min(r1, r2)
        L46:
            float r2 = r10.f4198c
            float r2 = r2 / r1
            float r5 = r10.f4199d
            float r5 = r5 / r1
            int[] r6 = com.caverock.androidsvg.C5624b.a.f4481a
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r7 = r12.m3666a()
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
            float r7 = r11.f4198c
            float r7 = r7 - r2
        L61:
            float r3 = r3 - r7
            goto L68
        L63:
            float r7 = r11.f4198c
            float r7 = r7 - r2
            float r7 = r7 / r8
            goto L61
        L68:
            com.caverock.androidsvg.PreserveAspectRatio$Alignment r12 = r12.m3666a()
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
            float r11 = r11.f4199d
            float r11 = r11 - r5
        L89:
            float r4 = r4 - r11
            goto L90
        L8b:
            float r11 = r11.f4199d
            float r11 = r11 - r5
            float r11 = r11 / r8
            goto L89
        L90:
            float r11 = r10.f4196a
            float r10 = r10.f4197b
            r0.preTranslate(r11, r10)
            r0.preScale(r1, r1)
            r0.preTranslate(r3, r4)
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.C5624b.m3969o(com.caverock.androidsvg.SVG$b, com.caverock.androidsvg.SVG$b, com.caverock.androidsvg.PreserveAspectRatio):android.graphics.Matrix");
    }

    /* renamed from: o0 */
    public final void m3970o0(SVG.C5569d c5569d) {
        m3900y("Circle render", new Object[0]);
        SVG.C5591o c5591o = c5569d.f4212q;
        if (c5591o == null || c5591o.m3719j()) {
            return;
        }
        m3944W0(this.f4476d, c5569d);
        if (m3901A() && m3948Y0()) {
            Matrix matrix = c5569d.f4249n;
            if (matrix != null) {
                this.f4473a.concat(matrix);
            }
            Path pathM3947Y = m3947Y(c5569d);
            m3941U0(c5569d);
            m3975r(c5569d);
            m3971p(c5569d);
            boolean zM3966m0 = m3966m0();
            if (this.f4476d.f4513b) {
                m3903B(c5569d, pathM3947Y);
            }
            if (this.f4476d.f4514c) {
                m3905C(pathM3947Y);
            }
            if (zM3966m0) {
                m3960j0(c5569d);
            }
        }
    }

    /* renamed from: p */
    public final void m3971p(SVG.AbstractC5580i0 abstractC5580i0) {
        m3973q(abstractC5580i0, abstractC5580i0.f4238h);
    }

    /* renamed from: p0 */
    public final void m3972p0(SVG.C5579i c5579i) {
        m3900y("Ellipse render", new Object[0]);
        SVG.C5591o c5591o = c5579i.f4236q;
        if (c5591o == null || c5579i.f4237r == null || c5591o.m3719j() || c5579i.f4237r.m3719j()) {
            return;
        }
        m3944W0(this.f4476d, c5579i);
        if (m3901A() && m3948Y0()) {
            Matrix matrix = c5579i.f4249n;
            if (matrix != null) {
                this.f4473a.concat(matrix);
            }
            Path pathM3949Z = m3949Z(c5579i);
            m3941U0(c5579i);
            m3975r(c5579i);
            m3971p(c5579i);
            boolean zM3966m0 = m3966m0();
            if (this.f4476d.f4513b) {
                m3903B(c5579i, pathM3949Z);
            }
            if (this.f4476d.f4514c) {
                m3905C(pathM3949Z);
            }
            if (zM3966m0) {
                m3960j0(c5579i);
            }
        }
    }

    /* renamed from: q */
    public final void m3973q(SVG.AbstractC5580i0 abstractC5580i0, SVG.C5563b c5563b) {
        Path pathM3959j;
        if (this.f4476d.f4512a.f4107E == null || (pathM3959j = m3959j(abstractC5580i0, c5563b)) == null) {
            return;
        }
        this.f4473a.clipPath(pathM3959j);
    }

    /* renamed from: q0 */
    public final void m3974q0(SVG.C5585l c5585l) {
        m3900y("Group render", new Object[0]);
        m3944W0(this.f4476d, c5585l);
        if (m3901A()) {
            Matrix matrix = c5585l.f4254o;
            if (matrix != null) {
                this.f4473a.concat(matrix);
            }
            m3971p(c5585l);
            boolean zM3966m0 = m3966m0();
            m3911F0(c5585l, true);
            if (zM3966m0) {
                m3960j0(c5585l);
            }
            m3941U0(c5585l);
        }
    }

    /* renamed from: r */
    public final void m3975r(SVG.AbstractC5580i0 abstractC5580i0) {
        SVG.AbstractC5588m0 abstractC5588m0 = this.f4476d.f4512a.f4117b;
        if (abstractC5588m0 instanceof SVG.C5601t) {
            m3987z(true, abstractC5580i0.f4238h, (SVG.C5601t) abstractC5588m0);
        }
        SVG.AbstractC5588m0 abstractC5588m02 = this.f4476d.f4512a.f4120e;
        if (abstractC5588m02 instanceof SVG.C5601t) {
            m3987z(false, abstractC5580i0.f4238h, (SVG.C5601t) abstractC5588m02);
        }
    }

    /* renamed from: r0 */
    public final void m3976r0(SVG.C5589n c5589n) {
        SVG.C5591o c5591o;
        String str;
        m3900y("Image render", new Object[0]);
        SVG.C5591o c5591o2 = c5589n.f4260s;
        if (c5591o2 == null || c5591o2.m3719j() || (c5591o = c5589n.f4261t) == null || c5591o.m3719j() || (str = c5589n.f4257p) == null) {
            return;
        }
        PreserveAspectRatio preserveAspectRatio = c5589n.f4263o;
        if (preserveAspectRatio == null) {
            preserveAspectRatio = PreserveAspectRatio.f4069e;
        }
        Bitmap bitmapM3977s = m3977s(str);
        if (bitmapM3977s == null) {
            SVG.m3668k();
            return;
        }
        SVG.C5563b c5563b = new SVG.C5563b(0.0f, 0.0f, bitmapM3977s.getWidth(), bitmapM3977s.getHeight());
        m3944W0(this.f4476d, c5589n);
        if (m3901A() && m3948Y0()) {
            Matrix matrix = c5589n.f4262u;
            if (matrix != null) {
                this.f4473a.concat(matrix);
            }
            SVG.C5591o c5591o3 = c5589n.f4258q;
            float fM3716g = c5591o3 != null ? c5591o3.m3716g(this) : 0.0f;
            SVG.C5591o c5591o4 = c5589n.f4259r;
            this.f4476d.f4517f = new SVG.C5563b(fM3716g, c5591o4 != null ? c5591o4.m3717h(this) : 0.0f, c5589n.f4260s.m3716g(this), c5589n.f4261t.m3716g(this));
            if (!this.f4476d.f4512a.f4137v.booleanValue()) {
                SVG.C5563b c5563b2 = this.f4476d.f4517f;
                m3929O0(c5563b2.f4196a, c5563b2.f4197b, c5563b2.f4198c, c5563b2.f4199d);
            }
            c5589n.f4238h = this.f4476d.f4517f;
            m3941U0(c5589n);
            m3971p(c5589n);
            boolean zM3966m0 = m3966m0();
            m3946X0();
            this.f4473a.save();
            this.f4473a.concat(m3969o(this.f4476d.f4517f, c5563b, preserveAspectRatio));
            this.f4473a.drawBitmap(bitmapM3977s, 0.0f, 0.0f, new Paint(this.f4476d.f4512a.f4115M != SVG.Style.RenderQuality.optimizeSpeed ? 2 : 0));
            this.f4473a.restore();
            if (zM3966m0) {
                m3960j0(c5589n);
            }
        }
    }

    /* renamed from: s */
    public final Bitmap m3977s(String str) {
        int iIndexOf;
        if (!str.startsWith("data:") || str.length() < 14 || (iIndexOf = str.indexOf(44)) < 12 || !";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Exception e10) {
            Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e10);
            return null;
        }
    }

    /* renamed from: s0 */
    public final void m3978s0(SVG.C5593p c5593p) {
        m3900y("Line render", new Object[0]);
        m3944W0(this.f4476d, c5593p);
        if (m3901A() && m3948Y0() && this.f4476d.f4514c) {
            Matrix matrix = c5593p.f4249n;
            if (matrix != null) {
                this.f4473a.concat(matrix);
            }
            Path pathM3950a0 = m3950a0(c5593p);
            m3941U0(c5593p);
            m3975r(c5593p);
            m3971p(c5593p);
            boolean zM3966m0 = m3966m0();
            m3905C(pathM3950a0);
            m3917I0(c5593p);
            if (zM3966m0) {
                m3960j0(c5593p);
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
    public final android.graphics.Typeface m3979t(java.lang.String r6, java.lang.Integer r7, com.caverock.androidsvg.SVG.Style.FontStyle r8) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.C5624b.m3979t(java.lang.String, java.lang.Integer, com.caverock.androidsvg.SVG$Style$FontStyle):android.graphics.Typeface");
    }

    /* renamed from: t0 */
    public final void m3980t0(SVG.C5603u c5603u) {
        m3900y("Path render", new Object[0]);
        if (c5603u.f4293o == null) {
            return;
        }
        m3944W0(this.f4476d, c5603u);
        if (m3901A() && m3948Y0()) {
            h hVar = this.f4476d;
            if (hVar.f4514c || hVar.f4513b) {
                Matrix matrix = c5603u.f4249n;
                if (matrix != null) {
                    this.f4473a.concat(matrix);
                }
                Path pathM3992c = new d(c5603u.f4293o).m3992c();
                if (c5603u.f4238h == null) {
                    c5603u.f4238h = m3965m(pathM3992c);
                }
                m3941U0(c5603u);
                m3975r(c5603u);
                m3971p(c5603u);
                boolean zM3966m0 = m3966m0();
                if (this.f4476d.f4513b) {
                    pathM3992c.setFillType(m3940U());
                    m3903B(c5603u, pathM3992c);
                }
                if (this.f4476d.f4514c) {
                    m3905C(pathM3992c);
                }
                m3917I0(c5603u);
                if (zM3966m0) {
                    m3960j0(c5603u);
                }
            }
        }
    }

    /* renamed from: u */
    public final void m3981u(SVG.C5586l0 c5586l0) {
        Boolean bool;
        if ((c5586l0 instanceof SVG.AbstractC5582j0) && (bool = ((SVG.AbstractC5582j0) c5586l0).f4245d) != null) {
            this.f4476d.f4519h = bool.booleanValue();
        }
    }

    /* renamed from: u0 */
    public final void m3982u0(SVG.C5611y c5611y) {
        m3900y("PolyLine render", new Object[0]);
        m3944W0(this.f4476d, c5611y);
        if (m3901A() && m3948Y0()) {
            h hVar = this.f4476d;
            if (hVar.f4514c || hVar.f4513b) {
                Matrix matrix = c5611y.f4249n;
                if (matrix != null) {
                    this.f4473a.concat(matrix);
                }
                if (c5611y.f4311o.length < 2) {
                    return;
                }
                Path pathM3951b0 = m3951b0(c5611y);
                m3941U0(c5611y);
                pathM3951b0.setFillType(m3940U());
                m3975r(c5611y);
                m3971p(c5611y);
                boolean zM3966m0 = m3966m0();
                if (this.f4476d.f4513b) {
                    m3903B(c5611y, pathM3951b0);
                }
                if (this.f4476d.f4514c) {
                    m3905C(pathM3951b0);
                }
                m3917I0(c5611y);
                if (zM3966m0) {
                    m3960j0(c5611y);
                }
            }
        }
    }

    /* renamed from: v0 */
    public final void m3983v0(SVG.C5613z c5613z) {
        m3900y("Polygon render", new Object[0]);
        m3944W0(this.f4476d, c5613z);
        if (m3901A() && m3948Y0()) {
            h hVar = this.f4476d;
            if (hVar.f4514c || hVar.f4513b) {
                Matrix matrix = c5613z.f4249n;
                if (matrix != null) {
                    this.f4473a.concat(matrix);
                }
                if (c5613z.f4311o.length < 2) {
                    return;
                }
                Path pathM3951b0 = m3951b0(c5613z);
                m3941U0(c5613z);
                m3975r(c5613z);
                m3971p(c5613z);
                boolean zM3966m0 = m3966m0();
                if (this.f4476d.f4513b) {
                    m3903B(c5613z, pathM3951b0);
                }
                if (this.f4476d.f4514c) {
                    m3905C(pathM3951b0);
                }
                m3917I0(c5613z);
                if (zM3966m0) {
                    m3960j0(c5613z);
                }
            }
        }
    }

    /* renamed from: w0 */
    public final void m3984w0(SVG.C5561a0 c5561a0) {
        m3900y("Rect render", new Object[0]);
        SVG.C5591o c5591o = c5561a0.f4190q;
        if (c5591o == null || c5561a0.f4191r == null || c5591o.m3719j() || c5561a0.f4191r.m3719j()) {
            return;
        }
        m3944W0(this.f4476d, c5561a0);
        if (m3901A() && m3948Y0()) {
            Matrix matrix = c5561a0.f4249n;
            if (matrix != null) {
                this.f4473a.concat(matrix);
            }
            Path pathM3952c0 = m3952c0(c5561a0);
            m3941U0(c5561a0);
            m3975r(c5561a0);
            m3971p(c5561a0);
            boolean zM3966m0 = m3966m0();
            if (this.f4476d.f4513b) {
                m3903B(c5561a0, pathM3952c0);
            }
            if (this.f4476d.f4514c) {
                m3905C(pathM3952c0);
            }
            if (zM3966m0) {
                m3960j0(c5561a0);
            }
        }
    }

    /* renamed from: x0 */
    public final void m3985x0(SVG.C5570d0 c5570d0) {
        m3988z0(c5570d0, m3955f0(c5570d0.f4213q, c5570d0.f4214r, c5570d0.f4215s, c5570d0.f4216t), c5570d0.f4275p, c5570d0.f4263o);
    }

    /* renamed from: y0 */
    public final void m3986y0(SVG.C5570d0 c5570d0, SVG.C5563b c5563b) {
        m3988z0(c5570d0, c5563b, c5570d0.f4275p, c5570d0.f4263o);
    }

    /* renamed from: z */
    public final void m3987z(boolean z9, SVG.C5563b c5563b, SVG.C5601t c5601t) {
        SVG.C5586l0 c5586l0M3683p = this.f4475c.m3683p(c5601t.f4290a);
        if (c5586l0M3683p == null) {
            m3885F("%s reference '%s' not found", z9 ? "Fill" : "Stroke", c5601t.f4290a);
            SVG.AbstractC5588m0 abstractC5588m0 = c5601t.f4291b;
            if (abstractC5588m0 != null) {
                m3931P0(this.f4476d, z9, abstractC5588m0);
                return;
            } else if (z9) {
                this.f4476d.f4513b = false;
                return;
            } else {
                this.f4476d.f4514c = false;
                return;
            }
        }
        if (c5586l0M3683p instanceof SVG.C5584k0) {
            m3945X(z9, c5563b, (SVG.C5584k0) c5586l0M3683p);
        } else if (c5586l0M3683p instanceof SVG.C5592o0) {
            m3954e0(z9, c5563b, (SVG.C5592o0) c5586l0M3683p);
        } else if (c5586l0M3683p instanceof SVG.C5564b0) {
            m3933Q0(z9, (SVG.C5564b0) c5586l0M3683p);
        }
    }

    /* renamed from: z0 */
    public final void m3988z0(SVG.C5570d0 c5570d0, SVG.C5563b c5563b, SVG.C5563b c5563b2, PreserveAspectRatio preserveAspectRatio) {
        m3900y("Svg render", new Object[0]);
        if (c5563b.f4198c == 0.0f || c5563b.f4199d == 0.0f) {
            return;
        }
        if (preserveAspectRatio == null && (preserveAspectRatio = c5570d0.f4263o) == null) {
            preserveAspectRatio = PreserveAspectRatio.f4069e;
        }
        m3944W0(this.f4476d, c5570d0);
        if (m3901A()) {
            h hVar = this.f4476d;
            hVar.f4517f = c5563b;
            if (!hVar.f4512a.f4137v.booleanValue()) {
                SVG.C5563b c5563b3 = this.f4476d.f4517f;
                m3929O0(c5563b3.f4196a, c5563b3.f4197b, c5563b3.f4198c, c5563b3.f4199d);
            }
            m3973q(c5570d0, this.f4476d.f4517f);
            if (c5563b2 != null) {
                this.f4473a.concat(m3969o(this.f4476d.f4517f, c5563b2, preserveAspectRatio));
                this.f4476d.f4518g = c5570d0.f4275p;
            } else {
                Canvas canvas = this.f4473a;
                SVG.C5563b c5563b4 = this.f4476d.f4517f;
                canvas.translate(c5563b4.f4196a, c5563b4.f4197b);
            }
            boolean zM3966m0 = m3966m0();
            m3946X0();
            m3911F0(c5570d0, true);
            if (zM3966m0) {
                m3960j0(c5570d0);
            }
            m3941U0(c5570d0);
        }
    }

    /* renamed from: com.caverock.androidsvg.b$k */
    public class k extends j {

        /* renamed from: b */
        public float f4526b;

        public k() {
            super(C5624b.this, null);
            this.f4526b = 0.0f;
        }

        @Override // com.caverock.androidsvg.C5624b.j
        /* renamed from: b */
        public void mo3993b(String str) {
            this.f4526b += C5624b.this.f4476d.f4515d.measureText(str);
        }

        public /* synthetic */ k(C5624b c5624b, a aVar) {
            this();
        }
    }

    /* renamed from: com.caverock.androidsvg.b$h */
    public class h {

        /* renamed from: a */
        public SVG.Style f4512a;

        /* renamed from: b */
        public boolean f4513b;

        /* renamed from: c */
        public boolean f4514c;

        /* renamed from: d */
        public Paint f4515d;

        /* renamed from: e */
        public Paint f4516e;

        /* renamed from: f */
        public SVG.C5563b f4517f;

        /* renamed from: g */
        public SVG.C5563b f4518g;

        /* renamed from: h */
        public boolean f4519h;

        public h() {
            Paint paint = new Paint();
            this.f4515d = paint;
            paint.setFlags(193);
            this.f4515d.setHinting(0);
            this.f4515d.setStyle(Paint.Style.FILL);
            Paint paint2 = this.f4515d;
            Typeface typeface = Typeface.DEFAULT;
            paint2.setTypeface(typeface);
            Paint paint3 = new Paint();
            this.f4516e = paint3;
            paint3.setFlags(193);
            this.f4516e.setHinting(0);
            this.f4516e.setStyle(Paint.Style.STROKE);
            this.f4516e.setTypeface(typeface);
            this.f4512a = SVG.Style.m3690b();
        }

        public h(h hVar) {
            this.f4513b = hVar.f4513b;
            this.f4514c = hVar.f4514c;
            this.f4515d = new Paint(hVar.f4515d);
            this.f4516e = new Paint(hVar.f4516e);
            SVG.C5563b c5563b = hVar.f4517f;
            if (c5563b != null) {
                this.f4517f = new SVG.C5563b(c5563b);
            }
            SVG.C5563b c5563b2 = hVar.f4518g;
            if (c5563b2 != null) {
                this.f4518g = new SVG.C5563b(c5563b2);
            }
            this.f4519h = hVar.f4519h;
            try {
                this.f4512a = (SVG.Style) hVar.f4512a.clone();
            } catch (CloneNotSupportedException e10) {
                Log.e("SVGAndroidRenderer", "Unexpected clone error", e10);
                this.f4512a = SVG.Style.m3690b();
            }
        }
    }
}
