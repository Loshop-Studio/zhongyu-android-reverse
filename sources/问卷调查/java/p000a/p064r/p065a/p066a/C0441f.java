package p000a.p064r.p065a.p066a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p021e.C0129a;
import p000a.p031h.p032b.C0190e;
import p000a.p031h.p033c.p034b.C0193a;
import p000a.p031h.p033c.p034b.C0194b;
import p000a.p031h.p035d.C0204c;

/* renamed from: a.r.a.a.f */
/* loaded from: classes.dex */
public class C0441f extends AbstractC0440e {

    /* renamed from: k */
    public static final PorterDuff.Mode f2503k = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    public h f2504c;

    /* renamed from: d */
    public PorterDuffColorFilter f2505d;

    /* renamed from: e */
    public ColorFilter f2506e;

    /* renamed from: f */
    public boolean f2507f;

    /* renamed from: g */
    public boolean f2508g;

    /* renamed from: h */
    public final float[] f2509h;

    /* renamed from: i */
    public final Matrix f2510i;

    /* renamed from: j */
    public final Rect f2511j;

    /* renamed from: a.r.a.a.f$b */
    public static class b extends f {
        public b() {
        }

        public b(b bVar) {
            super(bVar);
        }

        @Override // p000a.p064r.p065a.p066a.C0441f.f
        /* renamed from: c */
        public boolean mo1494c() {
            return true;
        }
    }

    /* renamed from: a.r.a.a.f$c */
    public static class c extends f {

        /* renamed from: e */
        public int[] f2512e;

        /* renamed from: f */
        public C0194b f2513f;

        /* renamed from: g */
        public float f2514g;

        /* renamed from: h */
        public C0194b f2515h;

        /* renamed from: i */
        public float f2516i;

        /* renamed from: j */
        public float f2517j;

        /* renamed from: k */
        public float f2518k;

        /* renamed from: l */
        public float f2519l;

        /* renamed from: m */
        public float f2520m;

        /* renamed from: n */
        public Paint.Cap f2521n;

        /* renamed from: o */
        public Paint.Join f2522o;

        /* renamed from: p */
        public float f2523p;

        public c() {
            this.f2514g = 0.0f;
            this.f2516i = 1.0f;
            this.f2517j = 1.0f;
            this.f2518k = 0.0f;
            this.f2519l = 1.0f;
            this.f2520m = 0.0f;
            this.f2521n = Paint.Cap.BUTT;
            this.f2522o = Paint.Join.MITER;
            this.f2523p = 4.0f;
        }

        public c(c cVar) {
            super(cVar);
            this.f2514g = 0.0f;
            this.f2516i = 1.0f;
            this.f2517j = 1.0f;
            this.f2518k = 0.0f;
            this.f2519l = 1.0f;
            this.f2520m = 0.0f;
            this.f2521n = Paint.Cap.BUTT;
            this.f2522o = Paint.Join.MITER;
            this.f2523p = 4.0f;
            this.f2512e = cVar.f2512e;
            this.f2513f = cVar.f2513f;
            this.f2514g = cVar.f2514g;
            this.f2516i = cVar.f2516i;
            this.f2515h = cVar.f2515h;
            this.f2539c = cVar.f2539c;
            this.f2517j = cVar.f2517j;
            this.f2518k = cVar.f2518k;
            this.f2519l = cVar.f2519l;
            this.f2520m = cVar.f2520m;
            this.f2521n = cVar.f2521n;
            this.f2522o = cVar.f2522o;
            this.f2523p = cVar.f2523p;
        }

        @Override // p000a.p064r.p065a.p066a.C0441f.e
        /* renamed from: a */
        public boolean mo1495a() {
            return this.f2515h.m749c() || this.f2513f.m749c();
        }

        @Override // p000a.p064r.p065a.p066a.C0441f.e
        /* renamed from: b */
        public boolean mo1496b(int[] iArr) {
            return this.f2513f.m750d(iArr) | this.f2515h.m750d(iArr);
        }

        public float getFillAlpha() {
            return this.f2517j;
        }

        public int getFillColor() {
            return this.f2515h.f1429c;
        }

        public float getStrokeAlpha() {
            return this.f2516i;
        }

        public int getStrokeColor() {
            return this.f2513f.f1429c;
        }

        public float getStrokeWidth() {
            return this.f2514g;
        }

        public float getTrimPathEnd() {
            return this.f2519l;
        }

        public float getTrimPathOffset() {
            return this.f2520m;
        }

        public float getTrimPathStart() {
            return this.f2518k;
        }

        public void setFillAlpha(float f2) {
            this.f2517j = f2;
        }

        public void setFillColor(int i) {
            this.f2515h.f1429c = i;
        }

        public void setStrokeAlpha(float f2) {
            this.f2516i = f2;
        }

        public void setStrokeColor(int i) {
            this.f2513f.f1429c = i;
        }

        public void setStrokeWidth(float f2) {
            this.f2514g = f2;
        }

        public void setTrimPathEnd(float f2) {
            this.f2519l = f2;
        }

        public void setTrimPathOffset(float f2) {
            this.f2520m = f2;
        }

        public void setTrimPathStart(float f2) {
            this.f2518k = f2;
        }
    }

    /* renamed from: a.r.a.a.f$d */
    public static class d extends e {

        /* renamed from: a */
        public final Matrix f2524a;

        /* renamed from: b */
        public final ArrayList<e> f2525b;

        /* renamed from: c */
        public float f2526c;

        /* renamed from: d */
        public float f2527d;

        /* renamed from: e */
        public float f2528e;

        /* renamed from: f */
        public float f2529f;

        /* renamed from: g */
        public float f2530g;

        /* renamed from: h */
        public float f2531h;

        /* renamed from: i */
        public float f2532i;

        /* renamed from: j */
        public final Matrix f2533j;

        /* renamed from: k */
        public int f2534k;

        /* renamed from: l */
        public int[] f2535l;

        /* renamed from: m */
        public String f2536m;

        public d() {
            super(null);
            this.f2524a = new Matrix();
            this.f2525b = new ArrayList<>();
            this.f2526c = 0.0f;
            this.f2527d = 0.0f;
            this.f2528e = 0.0f;
            this.f2529f = 1.0f;
            this.f2530g = 1.0f;
            this.f2531h = 0.0f;
            this.f2532i = 0.0f;
            this.f2533j = new Matrix();
            this.f2536m = null;
        }

        public d(d dVar, C0129a<String, Object> c0129a) {
            f bVar;
            super(null);
            this.f2524a = new Matrix();
            this.f2525b = new ArrayList<>();
            this.f2526c = 0.0f;
            this.f2527d = 0.0f;
            this.f2528e = 0.0f;
            this.f2529f = 1.0f;
            this.f2530g = 1.0f;
            this.f2531h = 0.0f;
            this.f2532i = 0.0f;
            Matrix matrix = new Matrix();
            this.f2533j = matrix;
            this.f2536m = null;
            this.f2526c = dVar.f2526c;
            this.f2527d = dVar.f2527d;
            this.f2528e = dVar.f2528e;
            this.f2529f = dVar.f2529f;
            this.f2530g = dVar.f2530g;
            this.f2531h = dVar.f2531h;
            this.f2532i = dVar.f2532i;
            this.f2535l = dVar.f2535l;
            String str = dVar.f2536m;
            this.f2536m = str;
            this.f2534k = dVar.f2534k;
            if (str != null) {
                c0129a.put(str, this);
            }
            matrix.set(dVar.f2533j);
            ArrayList<e> arrayList = dVar.f2525b;
            for (int i = 0; i < arrayList.size(); i++) {
                e eVar = arrayList.get(i);
                if (eVar instanceof d) {
                    this.f2525b.add(new d((d) eVar, c0129a));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else {
                        if (!(eVar instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) eVar);
                    }
                    this.f2525b.add(bVar);
                    String str2 = bVar.f2538b;
                    if (str2 != null) {
                        c0129a.put(str2, bVar);
                    }
                }
            }
        }

        @Override // p000a.p064r.p065a.p066a.C0441f.e
        /* renamed from: a */
        public boolean mo1495a() {
            for (int i = 0; i < this.f2525b.size(); i++) {
                if (this.f2525b.get(i).mo1495a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // p000a.p064r.p065a.p066a.C0441f.e
        /* renamed from: b */
        public boolean mo1496b(int[] iArr) {
            boolean zMo1496b = false;
            for (int i = 0; i < this.f2525b.size(); i++) {
                zMo1496b |= this.f2525b.get(i).mo1496b(iArr);
            }
            return zMo1496b;
        }

        /* renamed from: c */
        public final void m1497c() {
            this.f2533j.reset();
            this.f2533j.postTranslate(-this.f2527d, -this.f2528e);
            this.f2533j.postScale(this.f2529f, this.f2530g);
            this.f2533j.postRotate(this.f2526c, 0.0f, 0.0f);
            this.f2533j.postTranslate(this.f2531h + this.f2527d, this.f2532i + this.f2528e);
        }

        public String getGroupName() {
            return this.f2536m;
        }

        public Matrix getLocalMatrix() {
            return this.f2533j;
        }

        public float getPivotX() {
            return this.f2527d;
        }

        public float getPivotY() {
            return this.f2528e;
        }

        public float getRotation() {
            return this.f2526c;
        }

        public float getScaleX() {
            return this.f2529f;
        }

        public float getScaleY() {
            return this.f2530g;
        }

        public float getTranslateX() {
            return this.f2531h;
        }

        public float getTranslateY() {
            return this.f2532i;
        }

        public void setPivotX(float f2) {
            if (f2 != this.f2527d) {
                this.f2527d = f2;
                m1497c();
            }
        }

        public void setPivotY(float f2) {
            if (f2 != this.f2528e) {
                this.f2528e = f2;
                m1497c();
            }
        }

        public void setRotation(float f2) {
            if (f2 != this.f2526c) {
                this.f2526c = f2;
                m1497c();
            }
        }

        public void setScaleX(float f2) {
            if (f2 != this.f2529f) {
                this.f2529f = f2;
                m1497c();
            }
        }

        public void setScaleY(float f2) {
            if (f2 != this.f2530g) {
                this.f2530g = f2;
                m1497c();
            }
        }

        public void setTranslateX(float f2) {
            if (f2 != this.f2531h) {
                this.f2531h = f2;
                m1497c();
            }
        }

        public void setTranslateY(float f2) {
            if (f2 != this.f2532i) {
                this.f2532i = f2;
                m1497c();
            }
        }
    }

    /* renamed from: a.r.a.a.f$e */
    public static abstract class e {
        public e() {
        }

        public e(a aVar) {
        }

        /* renamed from: a */
        public boolean mo1495a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo1496b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: a.r.a.a.f$f */
    public static abstract class f extends e {

        /* renamed from: a */
        public C0204c[] f2537a;

        /* renamed from: b */
        public String f2538b;

        /* renamed from: c */
        public int f2539c;

        /* renamed from: d */
        public int f2540d;

        public f() {
            super(null);
            this.f2537a = null;
            this.f2539c = 0;
        }

        public f(f fVar) {
            super(null);
            this.f2537a = null;
            this.f2539c = 0;
            this.f2538b = fVar.f2538b;
            this.f2540d = fVar.f2540d;
            this.f2537a = C0190e.m722q(fVar.f2537a);
        }

        /* renamed from: c */
        public boolean mo1494c() {
            return false;
        }

        public C0204c[] getPathData() {
            return this.f2537a;
        }

        public String getPathName() {
            return this.f2538b;
        }

        public void setPathData(C0204c[] c0204cArr) {
            if (!C0190e.m709d(this.f2537a, c0204cArr)) {
                this.f2537a = C0190e.m722q(c0204cArr);
                return;
            }
            C0204c[] c0204cArr2 = this.f2537a;
            for (int i = 0; i < c0204cArr.length; i++) {
                c0204cArr2[i].f1458a = c0204cArr[i].f1458a;
                for (int i2 = 0; i2 < c0204cArr[i].f1459b.length; i2++) {
                    c0204cArr2[i].f1459b[i2] = c0204cArr[i].f1459b[i2];
                }
            }
        }
    }

    /* renamed from: a.r.a.a.f$g */
    public static class g {

        /* renamed from: q */
        public static final Matrix f2541q = new Matrix();

        /* renamed from: a */
        public final Path f2542a;

        /* renamed from: b */
        public final Path f2543b;

        /* renamed from: c */
        public final Matrix f2544c;

        /* renamed from: d */
        public Paint f2545d;

        /* renamed from: e */
        public Paint f2546e;

        /* renamed from: f */
        public PathMeasure f2547f;

        /* renamed from: g */
        public int f2548g;

        /* renamed from: h */
        public final d f2549h;

        /* renamed from: i */
        public float f2550i;

        /* renamed from: j */
        public float f2551j;

        /* renamed from: k */
        public float f2552k;

        /* renamed from: l */
        public float f2553l;

        /* renamed from: m */
        public int f2554m;

        /* renamed from: n */
        public String f2555n;

        /* renamed from: o */
        public Boolean f2556o;

        /* renamed from: p */
        public final C0129a<String, Object> f2557p;

        public g() {
            this.f2544c = new Matrix();
            this.f2550i = 0.0f;
            this.f2551j = 0.0f;
            this.f2552k = 0.0f;
            this.f2553l = 0.0f;
            this.f2554m = 255;
            this.f2555n = null;
            this.f2556o = null;
            this.f2557p = new C0129a<>();
            this.f2549h = new d();
            this.f2542a = new Path();
            this.f2543b = new Path();
        }

        public g(g gVar) {
            this.f2544c = new Matrix();
            this.f2550i = 0.0f;
            this.f2551j = 0.0f;
            this.f2552k = 0.0f;
            this.f2553l = 0.0f;
            this.f2554m = 255;
            this.f2555n = null;
            this.f2556o = null;
            C0129a<String, Object> c0129a = new C0129a<>();
            this.f2557p = c0129a;
            this.f2549h = new d(gVar.f2549h, c0129a);
            this.f2542a = new Path(gVar.f2542a);
            this.f2543b = new Path(gVar.f2543b);
            this.f2550i = gVar.f2550i;
            this.f2551j = gVar.f2551j;
            this.f2552k = gVar.f2552k;
            this.f2553l = gVar.f2553l;
            this.f2548g = gVar.f2548g;
            this.f2554m = gVar.f2554m;
            this.f2555n = gVar.f2555n;
            String str = gVar.f2555n;
            if (str != null) {
                c0129a.put(str, this);
            }
            this.f2556o = gVar.f2556o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0 */
        /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r11v18 */
        /* renamed from: a */
        public final void m1498a(d dVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            g gVar;
            g gVar2 = this;
            dVar.f2524a.set(matrix);
            dVar.f2524a.preConcat(dVar.f2533j);
            canvas.save();
            ?? r11 = 0;
            int i3 = 0;
            while (i3 < dVar.f2525b.size()) {
                e eVar = dVar.f2525b.get(i3);
                if (eVar instanceof d) {
                    m1498a((d) eVar, dVar.f2524a, canvas, i, i2, colorFilter);
                } else {
                    if (eVar instanceof f) {
                        f fVar = (f) eVar;
                        float f2 = i / gVar2.f2552k;
                        float f3 = i2 / gVar2.f2553l;
                        float fMin = Math.min(f2, f3);
                        Matrix matrix2 = dVar.f2524a;
                        gVar2.f2544c.set(matrix2);
                        gVar2.f2544c.postScale(f2, f3);
                        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                        matrix2.mapVectors(fArr);
                        float fHypot = (float) Math.hypot(fArr[r11], fArr[1]);
                        float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                        float f4 = (fArr[r11] * fArr[3]) - (fArr[1] * fArr[2]);
                        float fMax = Math.max(fHypot, fHypot2);
                        float fAbs = fMax > 0.0f ? Math.abs(f4) / fMax : 0.0f;
                        if (fAbs == 0.0f) {
                            gVar = this;
                        } else {
                            gVar = this;
                            Path path = gVar.f2542a;
                            Objects.requireNonNull(fVar);
                            path.reset();
                            C0204c[] c0204cArr = fVar.f2537a;
                            if (c0204cArr != null) {
                                C0204c.m762b(c0204cArr, path);
                            }
                            Path path2 = gVar.f2542a;
                            gVar.f2543b.reset();
                            if (fVar.mo1494c()) {
                                gVar.f2543b.setFillType(fVar.f2539c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                gVar.f2543b.addPath(path2, gVar.f2544c);
                                canvas.clipPath(gVar.f2543b);
                            } else {
                                c cVar = (c) fVar;
                                float f5 = cVar.f2518k;
                                if (f5 != 0.0f || cVar.f2519l != 1.0f) {
                                    float f6 = cVar.f2520m;
                                    float f7 = (f5 + f6) % 1.0f;
                                    float f8 = (cVar.f2519l + f6) % 1.0f;
                                    if (gVar.f2547f == null) {
                                        gVar.f2547f = new PathMeasure();
                                    }
                                    gVar.f2547f.setPath(gVar.f2542a, r11);
                                    float length = gVar.f2547f.getLength();
                                    float f9 = f7 * length;
                                    float f10 = f8 * length;
                                    path2.reset();
                                    if (f9 > f10) {
                                        gVar.f2547f.getSegment(f9, length, path2, true);
                                        gVar.f2547f.getSegment(0.0f, f10, path2, true);
                                    } else {
                                        gVar.f2547f.getSegment(f9, f10, path2, true);
                                    }
                                    path2.rLineTo(0.0f, 0.0f);
                                }
                                gVar.f2543b.addPath(path2, gVar.f2544c);
                                C0194b c0194b = cVar.f2515h;
                                if (c0194b.m748b() || c0194b.f1429c != 0) {
                                    C0194b c0194b2 = cVar.f2515h;
                                    if (gVar.f2546e == null) {
                                        Paint paint = new Paint(1);
                                        gVar.f2546e = paint;
                                        paint.setStyle(Paint.Style.FILL);
                                    }
                                    Paint paint2 = gVar.f2546e;
                                    if (c0194b2.m748b()) {
                                        Shader shader = c0194b2.f1427a;
                                        shader.setLocalMatrix(gVar.f2544c);
                                        paint2.setShader(shader);
                                        paint2.setAlpha(Math.round(cVar.f2517j * 255.0f));
                                    } else {
                                        paint2.setShader(null);
                                        paint2.setAlpha(255);
                                        int i4 = c0194b2.f1429c;
                                        float f11 = cVar.f2517j;
                                        PorterDuff.Mode mode = C0441f.f2503k;
                                        paint2.setColor((i4 & 16777215) | (((int) (Color.alpha(i4) * f11)) << 24));
                                    }
                                    paint2.setColorFilter(colorFilter);
                                    gVar.f2543b.setFillType(cVar.f2539c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                    canvas.drawPath(gVar.f2543b, paint2);
                                }
                                C0194b c0194b3 = cVar.f2513f;
                                if (c0194b3.m748b() || c0194b3.f1429c != 0) {
                                    C0194b c0194b4 = cVar.f2513f;
                                    if (gVar.f2545d == null) {
                                        Paint paint3 = new Paint(1);
                                        gVar.f2545d = paint3;
                                        paint3.setStyle(Paint.Style.STROKE);
                                    }
                                    Paint paint4 = gVar.f2545d;
                                    Paint.Join join = cVar.f2522o;
                                    if (join != null) {
                                        paint4.setStrokeJoin(join);
                                    }
                                    Paint.Cap cap = cVar.f2521n;
                                    if (cap != null) {
                                        paint4.setStrokeCap(cap);
                                    }
                                    paint4.setStrokeMiter(cVar.f2523p);
                                    if (c0194b4.m748b()) {
                                        Shader shader2 = c0194b4.f1427a;
                                        shader2.setLocalMatrix(gVar.f2544c);
                                        paint4.setShader(shader2);
                                        paint4.setAlpha(Math.round(cVar.f2516i * 255.0f));
                                    } else {
                                        paint4.setShader(null);
                                        paint4.setAlpha(255);
                                        int i5 = c0194b4.f1429c;
                                        float f12 = cVar.f2516i;
                                        PorterDuff.Mode mode2 = C0441f.f2503k;
                                        paint4.setColor((i5 & 16777215) | (((int) (Color.alpha(i5) * f12)) << 24));
                                    }
                                    paint4.setColorFilter(colorFilter);
                                    paint4.setStrokeWidth(cVar.f2514g * fAbs * fMin);
                                    canvas.drawPath(gVar.f2543b, paint4);
                                }
                            }
                        }
                    }
                    i3++;
                    gVar2 = gVar;
                    r11 = 0;
                }
                gVar = gVar2;
                i3++;
                gVar2 = gVar;
                r11 = 0;
            }
            canvas.restore();
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f2554m;
        }

        public void setAlpha(float f2) {
            setRootAlpha((int) (f2 * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f2554m = i;
        }
    }

    /* renamed from: a.r.a.a.f$h */
    public static class h extends Drawable.ConstantState {

        /* renamed from: a */
        public int f2558a;

        /* renamed from: b */
        public g f2559b;

        /* renamed from: c */
        public ColorStateList f2560c;

        /* renamed from: d */
        public PorterDuff.Mode f2561d;

        /* renamed from: e */
        public boolean f2562e;

        /* renamed from: f */
        public Bitmap f2563f;

        /* renamed from: g */
        public ColorStateList f2564g;

        /* renamed from: h */
        public PorterDuff.Mode f2565h;

        /* renamed from: i */
        public int f2566i;

        /* renamed from: j */
        public boolean f2567j;

        /* renamed from: k */
        public boolean f2568k;

        /* renamed from: l */
        public Paint f2569l;

        public h() {
            this.f2560c = null;
            this.f2561d = C0441f.f2503k;
            this.f2559b = new g();
        }

        public h(h hVar) {
            this.f2560c = null;
            this.f2561d = C0441f.f2503k;
            if (hVar != null) {
                this.f2558a = hVar.f2558a;
                g gVar = new g(hVar.f2559b);
                this.f2559b = gVar;
                if (hVar.f2559b.f2546e != null) {
                    gVar.f2546e = new Paint(hVar.f2559b.f2546e);
                }
                if (hVar.f2559b.f2545d != null) {
                    this.f2559b.f2545d = new Paint(hVar.f2559b.f2545d);
                }
                this.f2560c = hVar.f2560c;
                this.f2561d = hVar.f2561d;
                this.f2562e = hVar.f2562e;
            }
        }

        /* renamed from: a */
        public boolean m1499a() {
            g gVar = this.f2559b;
            if (gVar.f2556o == null) {
                gVar.f2556o = Boolean.valueOf(gVar.f2549h.mo1495a());
            }
            return gVar.f2556o.booleanValue();
        }

        /* renamed from: b */
        public void m1500b(int i, int i2) {
            this.f2563f.eraseColor(0);
            Canvas canvas = new Canvas(this.f2563f);
            g gVar = this.f2559b;
            gVar.m1498a(gVar.f2549h, g.f2541q, canvas, i, i2, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f2558a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C0441f(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C0441f(this);
        }
    }

    /* renamed from: a.r.a.a.f$i */
    public static class i extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f2570a;

        public i(Drawable.ConstantState constantState) {
            this.f2570a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f2570a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f2570a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C0441f c0441f = new C0441f();
            c0441f.f2502b = (VectorDrawable) this.f2570a.newDrawable();
            return c0441f;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C0441f c0441f = new C0441f();
            c0441f.f2502b = (VectorDrawable) this.f2570a.newDrawable(resources);
            return c0441f;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C0441f c0441f = new C0441f();
            c0441f.f2502b = (VectorDrawable) this.f2570a.newDrawable(resources, theme);
            return c0441f;
        }
    }

    public C0441f() {
        this.f2508g = true;
        this.f2509h = new float[9];
        this.f2510i = new Matrix();
        this.f2511j = new Rect();
        this.f2504c = new h();
    }

    public C0441f(h hVar) {
        this.f2508g = true;
        this.f2509h = new float[9];
        this.f2510i = new Matrix();
        this.f2511j = new Rect();
        this.f2504c = hVar;
        this.f2505d = m1493b(hVar.f2560c, hVar.f2561d);
    }

    /* renamed from: a */
    public static C0441f m1492a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C0441f c0441f = new C0441f();
        c0441f.inflate(resources, xmlPullParser, attributeSet, theme);
        return c0441f;
    }

    /* renamed from: b */
    public PorterDuffColorFilter m1493b(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f2502b;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d1  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r11) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p064r.p065a.p066a.C0441f.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f2502b;
        return drawable != null ? drawable.getAlpha() : this.f2504c.f2559b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f2502b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f2504c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f2502b;
        return drawable != null ? drawable.getColorFilter() : this.f2506e;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f2502b != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f2502b.getConstantState());
        }
        this.f2504c.f2558a = getChangingConfigurations();
        return this.f2504c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f2502b;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f2504c.f2559b.f2551j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f2502b;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f2504c.f2559b.f2550i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f2502b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f2502b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        ColorStateList colorStateListM745a;
        g gVar;
        int i2;
        boolean z;
        int i3;
        char c2;
        char c3;
        int i4;
        boolean z2;
        ArrayDeque arrayDeque;
        g gVar2;
        d dVar;
        c cVar;
        char c4;
        int i5;
        char c5;
        int i6;
        TypedArray typedArray;
        Drawable drawable = this.f2502b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f2504c;
        hVar.f2559b = new g();
        TypedArray typedArrayM693F = C0190e.m693F(resources, theme, attributeSet, C0436a.f2477a);
        h hVar2 = this.f2504c;
        g gVar3 = hVar2.f2559b;
        int i7 = !C0190e.m730y(xmlPullParser, "tintMode") ? -1 : typedArrayM693F.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        char c6 = 5;
        int i8 = 3;
        if (i7 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i7 != 5) {
            if (i7 != 9) {
                switch (i7) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        hVar2.f2561d = mode;
        int i9 = 1;
        boolean z3 = false;
        if (C0190e.m730y(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            typedArrayM693F.getValue(1, typedValue);
            int i10 = typedValue.type;
            if (i10 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i10 < 28 || i10 > 31) {
                Resources resources2 = typedArrayM693F.getResources();
                int resourceId = typedArrayM693F.getResourceId(1, 0);
                ThreadLocal<TypedValue> threadLocal = C0193a.f1426a;
                try {
                    colorStateListM745a = C0193a.m745a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e2) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
                }
            } else {
                colorStateListM745a = ColorStateList.valueOf(typedValue.data);
            }
        } else {
            colorStateListM745a = null;
        }
        if (colorStateListM745a != null) {
            hVar2.f2560c = colorStateListM745a;
        }
        boolean z4 = hVar2.f2562e;
        if (C0190e.m730y(xmlPullParser, "autoMirrored")) {
            z4 = typedArrayM693F.getBoolean(5, z4);
        }
        hVar2.f2562e = z4;
        float f2 = gVar3.f2552k;
        if (C0190e.m730y(xmlPullParser, "viewportWidth")) {
            f2 = typedArrayM693F.getFloat(7, f2);
        }
        gVar3.f2552k = f2;
        float f3 = gVar3.f2553l;
        if (C0190e.m730y(xmlPullParser, "viewportHeight")) {
            f3 = typedArrayM693F.getFloat(8, f3);
        }
        gVar3.f2553l = f3;
        if (gVar3.f2552k <= 0.0f) {
            throw new XmlPullParserException(typedArrayM693F.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f3 <= 0.0f) {
            throw new XmlPullParserException(typedArrayM693F.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar3.f2550i = typedArrayM693F.getDimension(3, gVar3.f2550i);
        float dimension = typedArrayM693F.getDimension(2, gVar3.f2551j);
        gVar3.f2551j = dimension;
        if (gVar3.f2550i <= 0.0f) {
            throw new XmlPullParserException(typedArrayM693F.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArrayM693F.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = gVar3.getAlpha();
        if (C0190e.m730y(xmlPullParser, "alpha")) {
            alpha = typedArrayM693F.getFloat(4, alpha);
        }
        gVar3.setAlpha(alpha);
        String string = typedArrayM693F.getString(0);
        if (string != null) {
            gVar3.f2555n = string;
            gVar3.f2557p.put(string, gVar3);
        }
        typedArrayM693F.recycle();
        hVar.f2558a = getChangingConfigurations();
        hVar.f2568k = true;
        h hVar3 = this.f2504c;
        g gVar4 = hVar3.f2559b;
        ArrayDeque arrayDeque2 = new ArrayDeque();
        arrayDeque2.push(gVar4.f2549h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z5 = true;
        while (eventType != i9 && (xmlPullParser.getDepth() >= depth || eventType != i8)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar2 = (d) arrayDeque2.peek();
                if ("path".equals(name)) {
                    c cVar2 = new c();
                    TypedArray typedArrayM693F2 = C0190e.m693F(resources, theme, attributeSet, C0436a.f2479c);
                    cVar2.f2512e = null;
                    if (C0190e.m730y(xmlPullParser, "pathData")) {
                        String string2 = typedArrayM693F2.getString(0);
                        if (string2 != null) {
                            cVar2.f2538b = string2;
                        }
                        String string3 = typedArrayM693F2.getString(2);
                        if (string3 != null) {
                            cVar2.f2537a = C0190e.m720o(string3);
                        }
                        arrayDeque = arrayDeque2;
                        gVar2 = gVar4;
                        i2 = depth;
                        dVar = dVar2;
                        cVar = cVar2;
                        cVar.f2515h = C0190e.m723r(typedArrayM693F2, xmlPullParser, theme, "fillColor", 1, 0);
                        float f4 = cVar.f2517j;
                        if (C0190e.m730y(xmlPullParser, "fillAlpha")) {
                            f4 = typedArrayM693F2.getFloat(12, f4);
                        }
                        cVar.f2517j = f4;
                        if (C0190e.m730y(xmlPullParser, "strokeLineCap")) {
                            c4 = '\b';
                            i5 = typedArrayM693F2.getInt(8, -1);
                        } else {
                            i5 = -1;
                            c4 = '\b';
                        }
                        Paint.Cap cap = cVar.f2521n;
                        if (i5 == 0) {
                            cap = Paint.Cap.BUTT;
                        } else if (i5 == 1) {
                            cap = Paint.Cap.ROUND;
                        } else if (i5 == 2) {
                            cap = Paint.Cap.SQUARE;
                        }
                        cVar.f2521n = cap;
                        if (C0190e.m730y(xmlPullParser, "strokeLineJoin")) {
                            c5 = '\t';
                            i6 = typedArrayM693F2.getInt(9, -1);
                        } else {
                            i6 = -1;
                            c5 = '\t';
                        }
                        Paint.Join join = cVar.f2522o;
                        if (i6 == 0) {
                            join = Paint.Join.MITER;
                        } else if (i6 == 1) {
                            join = Paint.Join.ROUND;
                        } else if (i6 == 2) {
                            join = Paint.Join.BEVEL;
                        }
                        cVar.f2522o = join;
                        float f5 = cVar.f2523p;
                        if (C0190e.m730y(xmlPullParser, "strokeMiterLimit")) {
                            f5 = typedArrayM693F2.getFloat(10, f5);
                        }
                        cVar.f2523p = f5;
                        c2 = c4;
                        typedArray = typedArrayM693F2;
                        cVar.f2513f = C0190e.m723r(typedArrayM693F2, xmlPullParser, theme, "strokeColor", 3, 0);
                        float f6 = cVar.f2516i;
                        if (C0190e.m730y(xmlPullParser, "strokeAlpha")) {
                            f6 = typedArray.getFloat(11, f6);
                        }
                        cVar.f2516i = f6;
                        float f7 = cVar.f2514g;
                        if (C0190e.m730y(xmlPullParser, "strokeWidth")) {
                            f7 = typedArray.getFloat(4, f7);
                        }
                        cVar.f2514g = f7;
                        float f8 = cVar.f2519l;
                        if (C0190e.m730y(xmlPullParser, "trimPathEnd")) {
                            f8 = typedArray.getFloat(6, f8);
                        }
                        cVar.f2519l = f8;
                        float f9 = cVar.f2520m;
                        if (C0190e.m730y(xmlPullParser, "trimPathOffset")) {
                            f9 = typedArray.getFloat(7, f9);
                        }
                        cVar.f2520m = f9;
                        float f10 = cVar.f2518k;
                        if (C0190e.m730y(xmlPullParser, "trimPathStart")) {
                            f10 = typedArray.getFloat(5, f10);
                        }
                        cVar.f2518k = f10;
                        int i11 = cVar.f2539c;
                        if (C0190e.m730y(xmlPullParser, "fillType")) {
                            i11 = typedArray.getInt(13, i11);
                        }
                        cVar.f2539c = i11;
                    } else {
                        arrayDeque = arrayDeque2;
                        gVar2 = gVar4;
                        typedArray = typedArrayM693F2;
                        cVar = cVar2;
                        i2 = depth;
                        c2 = '\b';
                        dVar = dVar2;
                    }
                    typedArray.recycle();
                    dVar.f2525b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar = gVar2;
                        gVar.f2557p.put(cVar.getPathName(), cVar);
                    } else {
                        gVar = gVar2;
                    }
                    hVar3.f2558a |= cVar.f2540d;
                    arrayDeque2 = arrayDeque;
                    z2 = false;
                    c3 = 5;
                    i4 = 1;
                    z5 = false;
                } else {
                    ArrayDeque arrayDeque3 = arrayDeque2;
                    gVar = gVar4;
                    i2 = depth;
                    c2 = '\b';
                    if ("clip-path".equals(name)) {
                        b bVar = new b();
                        if (C0190e.m730y(xmlPullParser, "pathData")) {
                            TypedArray typedArrayM693F3 = C0190e.m693F(resources, theme, attributeSet, C0436a.f2480d);
                            String string4 = typedArrayM693F3.getString(0);
                            if (string4 != null) {
                                bVar.f2538b = string4;
                            }
                            String string5 = typedArrayM693F3.getString(1);
                            if (string5 != null) {
                                bVar.f2537a = C0190e.m720o(string5);
                            }
                            bVar.f2539c = !C0190e.m730y(xmlPullParser, "fillType") ? 0 : typedArrayM693F3.getInt(2, 0);
                            typedArrayM693F3.recycle();
                        }
                        dVar2.f2525b.add(bVar);
                        if (bVar.getPathName() != null) {
                            gVar.f2557p.put(bVar.getPathName(), bVar);
                        }
                        hVar3.f2558a = bVar.f2540d | hVar3.f2558a;
                    } else if ("group".equals(name)) {
                        d dVar3 = new d();
                        TypedArray typedArrayM693F4 = C0190e.m693F(resources, theme, attributeSet, C0436a.f2478b);
                        dVar3.f2535l = null;
                        float f11 = dVar3.f2526c;
                        if (C0190e.m730y(xmlPullParser, "rotation")) {
                            c3 = 5;
                            f11 = typedArrayM693F4.getFloat(5, f11);
                        } else {
                            c3 = 5;
                        }
                        dVar3.f2526c = f11;
                        i4 = 1;
                        dVar3.f2527d = typedArrayM693F4.getFloat(1, dVar3.f2527d);
                        dVar3.f2528e = typedArrayM693F4.getFloat(2, dVar3.f2528e);
                        float f12 = dVar3.f2529f;
                        if (C0190e.m730y(xmlPullParser, "scaleX")) {
                            f12 = typedArrayM693F4.getFloat(3, f12);
                        }
                        dVar3.f2529f = f12;
                        float f13 = dVar3.f2530g;
                        if (C0190e.m730y(xmlPullParser, "scaleY")) {
                            f13 = typedArrayM693F4.getFloat(4, f13);
                        }
                        dVar3.f2530g = f13;
                        float f14 = dVar3.f2531h;
                        if (C0190e.m730y(xmlPullParser, "translateX")) {
                            f14 = typedArrayM693F4.getFloat(6, f14);
                        }
                        dVar3.f2531h = f14;
                        float f15 = dVar3.f2532i;
                        if (C0190e.m730y(xmlPullParser, "translateY")) {
                            f15 = typedArrayM693F4.getFloat(7, f15);
                        }
                        dVar3.f2532i = f15;
                        z2 = false;
                        String string6 = typedArrayM693F4.getString(0);
                        if (string6 != null) {
                            dVar3.f2536m = string6;
                        }
                        dVar3.m1497c();
                        typedArrayM693F4.recycle();
                        dVar2.f2525b.add(dVar3);
                        arrayDeque2 = arrayDeque3;
                        arrayDeque2.push(dVar3);
                        if (dVar3.getGroupName() != null) {
                            gVar.f2557p.put(dVar3.getGroupName(), dVar3);
                        }
                        hVar3.f2558a = dVar3.f2534k | hVar3.f2558a;
                    }
                    arrayDeque2 = arrayDeque3;
                    z2 = false;
                    c3 = 5;
                    i4 = 1;
                }
                z = z2;
                i3 = 3;
            } else {
                gVar = gVar4;
                i2 = depth;
                z = z3;
                i3 = 3;
                c2 = '\b';
                c3 = c6;
                i4 = i9;
                if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque2.pop();
                }
            }
            eventType = xmlPullParser.next();
            i9 = i4;
            z3 = z;
            depth = i2;
            c6 = c3;
            i8 = i3;
            gVar4 = gVar;
        }
        if (z5) {
            throw new XmlPullParserException("no path defined");
        }
        this.f2505d = m1493b(hVar.f2560c, hVar.f2561d);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f2502b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f2502b;
        return drawable != null ? drawable.isAutoMirrored() : this.f2504c.f2562e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f2502b;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((hVar = this.f2504c) != null && (hVar.m1499a() || ((colorStateList = this.f2504c.f2560c) != null && colorStateList.isStateful())));
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f2502b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f2507f && super.mutate() == this) {
            this.f2504c = new h(this.f2504c);
            this.f2507f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2502b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f2502b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        h hVar = this.f2504c;
        ColorStateList colorStateList = hVar.f2560c;
        if (colorStateList != null && (mode = hVar.f2561d) != null) {
            this.f2505d = m1493b(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (hVar.m1499a()) {
            boolean zMo1496b = hVar.f2559b.f2549h.mo1496b(iArr);
            hVar.f2568k |= zMo1496b;
            if (zMo1496b) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f2502b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        Drawable drawable = this.f2502b;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f2504c.f2559b.getRootAlpha() != i2) {
            this.f2504c.f2559b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f2502b;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f2504c.f2562e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2502b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f2506e = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i2) {
        Drawable drawable = this.f2502b;
        if (drawable != null) {
            C0190e.m700M(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f2502b;
        if (drawable != null) {
            C0190e.m701N(drawable, colorStateList);
            return;
        }
        h hVar = this.f2504c;
        if (hVar.f2560c != colorStateList) {
            hVar.f2560c = colorStateList;
            this.f2505d = m1493b(colorStateList, hVar.f2561d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f2502b;
        if (drawable != null) {
            C0190e.m702O(drawable, mode);
            return;
        }
        h hVar = this.f2504c;
        if (hVar.f2561d != mode) {
            hVar.f2561d = mode;
            this.f2505d = m1493b(hVar.f2560c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f2502b;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f2502b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
