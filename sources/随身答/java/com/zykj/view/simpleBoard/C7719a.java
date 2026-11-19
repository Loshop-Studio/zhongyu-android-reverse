package com.zykj.view.simpleBoard;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.zykj.sketch.core.graph.GraphExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import p129h7.C8106b;
import p129h7.C8107c;
import p129h7.C8108d;
import p129h7.C8109e;
import p139i7.C8150k;
import p149j7.InterfaceC8223d;
import p233r5.AbstractC9430a;
import p263u5.AbstractC9695n;
import p263u5.C9686e;

/* renamed from: com.zykj.view.simpleBoard.a */
/* loaded from: classes5.dex */
public final class C7719a {

    /* renamed from: D */
    public static final a f12854D = new a(null);

    /* renamed from: A */
    public final Paint f12855A;

    /* renamed from: B */
    public final Paint f12856B;

    /* renamed from: C */
    public final Paint f12857C;

    /* renamed from: a */
    public final C8107c f12858a;

    /* renamed from: b */
    public final Matrix f12859b;

    /* renamed from: c */
    public final InterfaceC8223d f12860c;

    /* renamed from: d */
    public Bitmap f12861d;

    /* renamed from: e */
    public RectF f12862e;

    /* renamed from: f */
    public Matrix f12863f;

    /* renamed from: g */
    public final ArrayList f12864g;

    /* renamed from: h */
    public final ArrayList f12865h;

    /* renamed from: i */
    public final RectF f12866i;

    /* renamed from: j */
    public final PointF f12867j;

    /* renamed from: k */
    public final PointF f12868k;

    /* renamed from: l */
    public final PointF f12869l;

    /* renamed from: m */
    public SelectionTarget f12870m;

    /* renamed from: n */
    public boolean f12871n;

    /* renamed from: o */
    public boolean f12872o;

    /* renamed from: p */
    public boolean f12873p;

    /* renamed from: q */
    public C8108d f12874q;

    /* renamed from: r */
    public Function1 f12875r;

    /* renamed from: s */
    public Path f12876s;

    /* renamed from: t */
    public Function0 f12877t;

    /* renamed from: u */
    public final Path f12878u;

    /* renamed from: v */
    public final Matrix f12879v;

    /* renamed from: w */
    public final float[] f12880w;

    /* renamed from: x */
    public final Paint f12881x;

    /* renamed from: y */
    public final Paint f12882y;

    /* renamed from: z */
    public final Paint f12883z;

    /* renamed from: com.zykj.view.simpleBoard.a$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: com.zykj.view.simpleBoard.a$b */
    public static final /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12884a;

        static {
            int[] iArr = new int[SelectionTarget.values().length];
            try {
                iArr[SelectionTarget.f12823d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelectionTarget.f12824e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SelectionTarget.f12826g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SelectionTarget.f12830k.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SelectionTarget.f12828i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SelectionTarget.f12831l.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SelectionTarget.f12827h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SelectionTarget.f12825f.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SelectionTarget.f12829j.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SelectionTarget.f12832m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f12884a = iArr;
        }
    }

    public C7719a(C8107c mBoardConfig, Matrix mCameraMatrix, InterfaceC8223d mDrawView) {
        Intrinsics.checkNotNullParameter(mBoardConfig, "mBoardConfig");
        Intrinsics.checkNotNullParameter(mCameraMatrix, "mCameraMatrix");
        Intrinsics.checkNotNullParameter(mDrawView, "mDrawView");
        this.f12858a = mBoardConfig;
        this.f12859b = mCameraMatrix;
        this.f12860c = mDrawView;
        this.f12862e = new RectF();
        this.f12863f = new Matrix();
        this.f12864g = new ArrayList();
        this.f12865h = new ArrayList();
        this.f12866i = new RectF();
        this.f12867j = new PointF();
        this.f12868k = new PointF();
        this.f12869l = new PointF();
        this.f12870m = SelectionTarget.f12822c;
        this.f12874q = new C8108d(false, false, false, false, false, false, false, null, null, 511, null);
        this.f12876s = new Path();
        this.f12878u = new Path();
        this.f12879v = new Matrix();
        float[] fArr = new float[9];
        for (int i9 = 0; i9 < 9; i9++) {
            fArr[i9] = 0.0f;
        }
        this.f12880w = fArr;
        Paint paint = new Paint();
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Join join = Paint.Join.ROUND;
        paint.setStrokeJoin(join);
        paint.setDither(true);
        paint.setAntiAlias(true);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_OVER;
        paint.setXfermode(new PorterDuffXfermode(mode));
        this.f12881x = paint;
        Paint paint2 = new Paint();
        paint2.setStrokeCap(cap);
        paint2.setStrokeJoin(join);
        paint2.setDither(true);
        paint2.setAntiAlias(true);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f12882y = paint2;
        Paint paint3 = new Paint();
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint3.setColor(ViewCompat.MEASURED_STATE_MASK);
        paint3.setStrokeWidth(3.0f);
        paint3.setPathEffect(new DashPathEffect(new float[]{30.0f, 15.0f}, 0.0f));
        paint3.setAntiAlias(true);
        this.f12883z = paint3;
        Paint paint4 = new Paint(1);
        paint4.setStyle(style);
        paint4.setColor(-12085261);
        paint4.setStrokeWidth(3.0f);
        this.f12855A = paint4;
        Paint paint5 = new Paint(1);
        paint5.setColor(-1);
        paint5.setTextAlign(Paint.Align.CENTER);
        paint5.setTextSize(12.0f);
        this.f12856B = paint5;
        Paint paint6 = new Paint(1);
        paint6.setColor(-1090519040);
        this.f12857C = paint6;
    }

    /* renamed from: y */
    public static /* synthetic */ RectF m11929y(C7719a c7719a, boolean z9, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            z9 = true;
        }
        return c7719a.m11987x(z9);
    }

    /* renamed from: A */
    public final void m11930A(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Object obj = this.f12860c;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.view.View");
        Log.i("DrawControl", "before -> " + matrix.toShortString());
        matrix.getValues(this.f12880w);
        float[] fArr = this.f12880w;
        float f10 = fArr[0];
        float f11 = fArr[4];
        float f12 = fArr[2];
        float f13 = fArr[5];
        float fM12960e = this.f12858a.m12960e() > 1.0f ? this.f12858a.m12960e() : 1.0f;
        if (f10 < 1.0f) {
            this.f12880w[0] = 1.0f;
        } else if (f10 > fM12960e) {
            this.f12880w[0] = fM12960e;
        }
        if (f11 < 1.0f) {
            this.f12880w[4] = 1.0f;
        } else if (f10 > fM12960e) {
            this.f12880w[4] = fM12960e;
        }
        if (f12 > 0.0f) {
            this.f12880w[2] = 0.0f;
        } else if (f12 < (-((this.f12862e.width() * f10) - ((View) this.f12860c).getWidth()))) {
            this.f12880w[2] = -((this.f12862e.width() * this.f12880w[0]) - ((View) this.f12860c).getWidth());
        } else if (this.f12862e.width() * f10 == ((View) this.f12860c).getWidth()) {
            this.f12880w[2] = 0.0f;
        } else {
            float f14 = 1;
            this.f12880w[2] = (((f12 / ((this.f12862e.width() * f10) - ((View) this.f12860c).getWidth())) + f14) - f14) * ((this.f12862e.width() * this.f12880w[0]) - ((View) this.f12860c).getWidth());
        }
        if (f13 > 0.0f) {
            this.f12880w[5] = 0.0f;
        } else if (f13 < (-((this.f12862e.height() * f11) - ((View) this.f12860c).getHeight()))) {
            this.f12880w[5] = -((this.f12862e.height() * this.f12880w[4]) - ((View) this.f12860c).getHeight());
        } else if (this.f12862e.height() * f11 == ((View) this.f12860c).getHeight()) {
            this.f12880w[5] = 0.0f;
        } else {
            float f15 = 1;
            this.f12880w[5] = (((f13 / ((this.f12862e.height() * f11) - ((View) this.f12860c).getHeight())) + f15) - f15) * ((this.f12862e.height() * this.f12880w[4]) - ((View) this.f12860c).getHeight());
        }
        matrix.setValues(this.f12880w);
        Log.i("DrawControl", "after -> " + matrix.toShortString());
        this.f12859b.set(matrix);
        this.f12860c.mo11925a();
        this.f12860c.mo11927c();
        this.f12860c.mo11926b();
    }

    /* renamed from: B */
    public final void m11931B(PointF currentPointF) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(currentPointF, "currentPointF");
        PointF pointFMapPoint = GraphExtKt.mapPoint(this.f12859b, currentPointF);
        this.f12876s.reset();
        this.f12876s.addCircle(pointFMapPoint.x, pointFMapPoint.y, this.f12858a.m12959d(), Path.Direction.CW);
        m11941L(this.f12882y);
        Iterator it = this.f12864g.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        boolean z9 = false;
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            C8150k c8150k = (C8150k) next;
            if (c8150k.m13079d().contains(currentPointF.x, currentPointF.y) && m11964e(currentPointF, c8150k.m13078c(), AbstractC9695n.m16200b(this.f12859b).mapRadius(this.f12858a.m12959d()))) {
                it.remove();
                z9 = true;
            }
        }
        if (z9 && (function0 = this.f12877t) != null) {
            function0.invoke();
        }
        this.f12860c.mo11927c();
        this.f12860c.mo11926b();
    }

    /* renamed from: C */
    public final void m11932C(PointF currentPointF) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(currentPointF, "currentPointF");
        this.f12876s.reset();
        Iterator it = this.f12864g.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        boolean z9 = false;
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            C8150k c8150k = (C8150k) next;
            if (c8150k.m13079d().contains(currentPointF.x, currentPointF.y) && m11964e(currentPointF, c8150k.m13078c(), AbstractC9695n.m16200b(this.f12859b).mapRadius(this.f12858a.m12959d()))) {
                it.remove();
                z9 = true;
            }
        }
        if (z9 && (function0 = this.f12877t) != null) {
            function0.invoke();
        }
        this.f12860c.mo11927c();
        this.f12860c.mo11926b();
    }

    /* renamed from: D */
    public final void m11933D() {
        Function0 function0;
        if (this.f12871n && (function0 = this.f12877t) != null) {
            function0.invoke();
        }
        this.f12870m = SelectionTarget.f12822c;
        this.f12871n = false;
        this.f12872o = false;
        this.f12866i.setEmpty();
        m11946Q();
        this.f12860c.mo11927c();
        this.f12860c.mo11926b();
    }

    /* renamed from: E */
    public final void m11934E(PointF point, PointF displayPoint) {
        Intrinsics.checkNotNullParameter(point, "point");
        Intrinsics.checkNotNullParameter(displayPoint, "displayPoint");
        this.f12867j.set(point);
        this.f12868k.set(point);
        this.f12871n = false;
        this.f12872o = false;
        SelectionTarget selectionTargetM11985v = m11985v(displayPoint);
        this.f12870m = selectionTargetM11985v;
        if (m11937H(selectionTargetM11985v)) {
            this.f12872o = true;
            return;
        }
        SelectionTarget selectionTarget = this.f12870m;
        SelectionTarget selectionTarget2 = SelectionTarget.f12822c;
        if (selectionTarget != selectionTarget2) {
            m11947R(selectionTarget);
            this.f12873p = false;
            return;
        }
        C8150k c8150kM11984u = m11984u(point);
        if (c8150kM11984u != null) {
            if (!this.f12865h.contains(c8150kM11984u)) {
                this.f12865h.clear();
                this.f12865h.add(c8150kM11984u);
            }
            if (this.f12874q.m12972d()) {
                selectionTarget2 = SelectionTarget.f12823d;
            }
            this.f12870m = selectionTarget2;
            this.f12866i.setEmpty();
            m11946Q();
        } else {
            this.f12865h.clear();
            this.f12873p = false;
            RectF rectF = this.f12866i;
            float f10 = point.x;
            float f11 = point.y;
            rectF.set(f10, f11, f10, f11);
            m11946Q();
        }
        this.f12860c.mo11926b();
    }

    /* renamed from: F */
    public final void m11935F(PointF point) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(point, "point");
        if (this.f12872o) {
            this.f12870m = SelectionTarget.f12822c;
            this.f12872o = false;
            this.f12871n = false;
            this.f12866i.setEmpty();
            this.f12860c.mo11926b();
            return;
        }
        if (this.f12870m.m11919q()) {
            m11936G(point);
            if (this.f12871n && (function0 = this.f12877t) != null) {
                function0.invoke();
            }
        } else {
            m11936G(point);
            this.f12865h.clear();
            if (this.f12866i.width() >= 8.0f || this.f12866i.height() >= 8.0f) {
                ArrayList arrayList = this.f12865h;
                ArrayList arrayList2 = this.f12864g;
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList2.get(i9);
                    i9++;
                    if (this.f12866i.contains(m11960c((C8150k) obj))) {
                        arrayList3.add(obj);
                    }
                }
                arrayList.addAll(arrayList3);
            } else {
                C8150k c8150kM11984u = m11984u(point);
                if (c8150kM11984u != null) {
                    this.f12865h.add(c8150kM11984u);
                }
            }
        }
        this.f12870m = SelectionTarget.f12822c;
        this.f12871n = false;
        this.f12872o = false;
        this.f12866i.setEmpty();
        m11946Q();
        this.f12860c.mo11927c();
        this.f12860c.mo11926b();
    }

    /* renamed from: G */
    public final void m11936G(PointF point) {
        Intrinsics.checkNotNullParameter(point, "point");
        if (this.f12870m.m11919q()) {
            if (!this.f12871n) {
                float fMapRadius = AbstractC9695n.m16200b(this.f12859b).mapRadius(4.0f);
                float f10 = point.x;
                PointF pointF = this.f12867j;
                float f11 = f10 - pointF.x;
                float f12 = point.y - pointF.y;
                if ((f11 * f11) + (f12 * f12) < fMapRadius * fMapRadius) {
                    return;
                }
            }
            m11958b(point);
            this.f12868k.set(point);
        } else if (this.f12870m == SelectionTarget.f12822c && !this.f12872o) {
            this.f12866i.set(Math.min(this.f12867j.x, point.x), Math.min(this.f12867j.y, point.y), Math.max(this.f12867j.x, point.x), Math.max(this.f12867j.y, point.y));
        }
        this.f12860c.mo11927c();
        this.f12860c.mo11926b();
    }

    /* renamed from: H */
    public final boolean m11937H(SelectionTarget selectionTarget) {
        if (selectionTarget == SelectionTarget.f12834o) {
            m11970h();
        } else if (selectionTarget == SelectionTarget.f12833n) {
            this.f12873p = !this.f12873p;
            this.f12860c.mo11926b();
        } else if (selectionTarget != SelectionTarget.f12835p) {
            if (selectionTarget.m11916g() >= 0) {
                m11967f0((Integer) CollectionsKt.getOrNull(this.f12874q.m12976h(), selectionTarget.m11916g()), null);
            } else {
                if (selectionTarget.m11917k() < 0) {
                    return false;
                }
                m11967f0(null, (Float) CollectionsKt.getOrNull(this.f12874q.m12977i(), selectionTarget.m11917k()));
            }
        }
        return true;
    }

    /* renamed from: I */
    public final void m11938I(Path path) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.f12878u.set(path);
        this.f12878u.transform(this.f12859b);
        this.f12876s.set(this.f12878u);
        m11942M(this.f12882y);
        this.f12860c.mo11926b();
    }

    /* renamed from: J */
    public final void m11939J() {
        this.f12876s.reset();
        this.f12860c.mo11926b();
    }

    /* renamed from: K */
    public final void m11940K(Path path, List pointFList) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(pointFList, "pointFList");
        this.f12876s.reset();
        m11942M(this.f12881x);
        this.f12864g.add(m11962d(pointFList, this.f12881x, path));
        Function0 function0 = this.f12877t;
        if (function0 != null) {
            function0.invoke();
        }
        this.f12860c.mo11927c();
        this.f12860c.mo11926b();
    }

    /* renamed from: L */
    public final void m11941L(Paint paint) {
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.f12858a.m12958c());
    }

    /* renamed from: M */
    public final void m11942M(Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(this.f12858a.m12961f());
        paint.setStrokeWidth(this.f12858a.m12962g());
        paint.setPathEffect(this.f12858a.m12963h() ? new DashPathEffect(new float[]{30.0f, 15.0f}, 0.0f) : null);
    }

    /* renamed from: N */
    public final boolean m11943N(int i9) {
        return ((((double) Color.red(i9)) * 0.299d) + (((double) Color.green(i9)) * 0.578d)) + (((double) Color.blue(i9)) * 0.114d) >= 192.0d;
    }

    /* renamed from: O */
    public final boolean m11944O(PointF pointF, PointF pointF2, float f10) {
        float f11 = pointF.x - pointF2.x;
        float f12 = pointF.y - pointF2.y;
        return (f11 * f11) + (f12 * f12) <= f10 * f10;
    }

    /* renamed from: P */
    public final boolean m11945P() {
        return this.f12870m == SelectionTarget.f12832m && this.f12871n;
    }

    /* renamed from: Q */
    public final void m11946Q() {
        C8109e c8109e = this.f12865h.isEmpty() ? null : new C8109e(this.f12865h.size(), m11988z());
        Function1 function1 = this.f12875r;
        if (function1 != null) {
            function1.invoke(c8109e);
        }
    }

    /* renamed from: R */
    public final void m11947R(SelectionTarget selectionTarget) {
        PointF pointFM11921u;
        if (!selectionTarget.m11919q() || this.f12865h.isEmpty()) {
            return;
        }
        RectF rectFM11987x = m11987x(false);
        switch (b.f12884a[selectionTarget.ordinal()]) {
            case 2:
            case 3:
            case 4:
            case 5:
                pointFM11921u = selectionTarget.m11921u(rectFM11987x);
                break;
            case 6:
                pointFM11921u = new PointF(rectFM11987x.right, rectFM11987x.centerY());
                break;
            case 7:
                pointFM11921u = new PointF(rectFM11987x.left, rectFM11987x.centerY());
                break;
            case 8:
                pointFM11921u = new PointF(rectFM11987x.centerX(), rectFM11987x.bottom);
                break;
            case 9:
                pointFM11921u = new PointF(rectFM11987x.centerX(), rectFM11987x.top);
                break;
            default:
                pointFM11921u = new PointF(rectFM11987x.centerX(), rectFM11987x.centerY());
                break;
        }
        this.f12869l.set(pointFM11921u);
    }

    /* renamed from: S */
    public final void m11948S() {
        this.f12855A.setStyle(Paint.Style.STROKE);
        this.f12855A.setStrokeWidth(3.0f);
        this.f12855A.setColor(-12085261);
    }

    /* renamed from: T */
    public final PointF m11949T(RectF rectF) {
        return new PointF(rectF.centerX(), rectF.top - 54.0f);
    }

    /* renamed from: U */
    public final C8106b m11950U(RectF rectF) {
        Object obj = this.f12860c;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.view.View");
        View view = (View) obj;
        this.f12856B.setTextSize(25.0f);
        float fMeasureText = (this.f12874q.m12970b() || this.f12874q.m12971c()) ? this.f12856B.measureText("编辑") + 30.0f : 0.0f;
        float fMeasureText2 = this.f12874q.m12969a() ? this.f12856B.measureText("删除") + 30.0f : 0.0f;
        float f10 = fMeasureText + fMeasureText2 + 16.0f;
        float fCoerceAtLeast = rectF.bottom + 14.0f;
        if (fCoerceAtLeast + 60.0f > view.getHeight()) {
            fCoerceAtLeast = RangesKt.coerceAtLeast((rectF.top - 60.0f) - 14.0f, 0.0f);
        }
        float fCoerceIn = RangesKt.coerceIn(rectF.left, 0.0f, RangesKt.coerceAtLeast(view.getWidth() - f10, 0.0f)) + 8.0f;
        float f11 = fMeasureText + fCoerceIn;
        float f12 = 60.0f + fCoerceAtLeast;
        return new C8106b(new RectF(fCoerceIn, fCoerceAtLeast, f11, f12), new RectF(f11, fCoerceAtLeast, fMeasureText2 + f11, f12));
    }

    /* renamed from: V */
    public final List m11951V(RectF rectF) {
        return CollectionsKt.listOf((Object[]) new PointF[]{new PointF(rectF.left, rectF.top), new PointF(rectF.centerX(), rectF.top), new PointF(rectF.right, rectF.top), new PointF(rectF.right, rectF.centerY()), new PointF(rectF.right, rectF.bottom), new PointF(rectF.centerX(), rectF.bottom), new PointF(rectF.left, rectF.bottom), new PointF(rectF.left, rectF.centerY())});
    }

    /* renamed from: W */
    public final void m11952W(Bitmap bitmap) {
        Object objM24758constructorimpl;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM24758constructorimpl = Result.m24758constructorimpl(Bitmap.createBitmap(bitmap));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM24758constructorimpl = Result.m24758constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m24764isFailureimpl(objM24758constructorimpl)) {
            objM24758constructorimpl = null;
        }
        Bitmap bitmap2 = (Bitmap) objM24758constructorimpl;
        if (bitmap2 != null) {
            this.f12861d = bitmap2;
            Object obj = this.f12860c;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.view.View");
            int width = ((View) obj).getWidth();
            if (width > 0) {
                float f10 = width;
                float width2 = f10 / bitmap2.getWidth();
                this.f12863f.setScale(width2, width2);
                this.f12862e.set(0.0f, 0.0f, f10, bitmap2.getHeight() * width2);
            }
        }
        this.f12860c.mo11925a();
    }

    /* renamed from: X */
    public final void m11953X(Function0 function0) {
        this.f12877t = function0;
    }

    /* renamed from: Y */
    public final void m11954Y(Function1 function1) {
        this.f12875r = function1;
        m11946Q();
    }

    /* renamed from: Z */
    public final void m11955Z(C8108d config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f12874q = config;
        if (!config.m12970b() && !config.m12971c()) {
            this.f12873p = false;
        }
        this.f12860c.mo11926b();
    }

    /* renamed from: a */
    public final void m11956a(Matrix matrix) {
        ArrayList arrayList = this.f12865h;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            C8150k c8150k = (C8150k) obj;
            c8150k.m13077b().transform(matrix);
            for (PointF pointF : c8150k.m13078c()) {
                float[] fArr = {pointF.x, pointF.y};
                matrix.mapPoints(fArr);
                pointF.set(fArr[0], fArr[1]);
            }
            m11971h0(c8150k);
        }
    }

    /* renamed from: a0 */
    public final RectF m11957a0(RectF rectF, RectF rectF2) {
        if ((this.f12874q.m12970b() ? CollectionsKt.take(this.f12874q.m12976h(), 5).size() : 0) == 0) {
            return new RectF();
        }
        return new RectF(rectF2.isEmpty() ? rectF.left : rectF2.right + 13.0f, rectF.top, rectF.right, rectF.bottom);
    }

    /* renamed from: b */
    public final void m11958b(PointF pointF) {
        Matrix matrix = new Matrix();
        switch (b.f12884a[this.f12870m.ordinal()]) {
            case 1:
                float f10 = pointF.x;
                PointF pointF2 = this.f12868k;
                matrix.setTranslate(f10 - pointF2.x, pointF.y - pointF2.y);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                if (this.f12874q.m12974f()) {
                    PointF pointF3 = this.f12869l;
                    float fCoerceIn = RangesKt.coerceIn(m11972i(pointF, pointF3) / RangesKt.coerceAtLeast(m11972i(this.f12868k, pointF3), 1.0f), 0.2f, 5.0f);
                    matrix.setScale(fCoerceIn, fCoerceIn, pointF3.x, pointF3.y);
                    break;
                } else {
                    return;
                }
            case 6:
            case 7:
                if (this.f12874q.m12975g()) {
                    float f11 = this.f12869l.x;
                    matrix.setScale(RangesKt.coerceIn(Math.abs(pointF.x - f11) / RangesKt.coerceAtLeast(Math.abs(this.f12868k.x - f11), 1.0f), 0.2f, 5.0f), 1.0f, f11, this.f12869l.y);
                    break;
                } else {
                    return;
                }
            case 8:
            case 9:
                if (this.f12874q.m12975g()) {
                    float f12 = this.f12869l.y;
                    matrix.setScale(1.0f, RangesKt.coerceIn(Math.abs(pointF.y - f12) / RangesKt.coerceAtLeast(Math.abs(this.f12868k.y - f12), 1.0f), 0.2f, 5.0f), this.f12869l.x, f12);
                    break;
                } else {
                    return;
                }
            case 10:
                if (this.f12874q.m12973e()) {
                    float f13 = this.f12868k.y;
                    PointF pointF4 = this.f12869l;
                    float fAtan2 = (float) Math.atan2(f13 - pointF4.y, r1.x - pointF4.x);
                    float f14 = pointF.y;
                    PointF pointF5 = this.f12869l;
                    float degrees = (float) Math.toDegrees(((float) Math.atan2(f14 - pointF5.y, pointF.x - pointF5.x)) - fAtan2);
                    PointF pointF6 = this.f12869l;
                    matrix.setRotate(degrees, pointF6.x, pointF6.y);
                    break;
                } else {
                    return;
                }
            default:
                return;
        }
        m11956a(matrix);
        this.f12871n = true;
    }

    /* renamed from: b0 */
    public final List m11959b0(RectF rectF) {
        if (!this.f12874q.m12970b() || this.f12874q.m12976h().isEmpty()) {
            return CollectionsKt.emptyList();
        }
        RectF rectFM11957a0 = m11957a0(rectF, m11963d0(rectF));
        List listTake = CollectionsKt.take(this.f12874q.m12976h(), 5);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake, 10));
        int i9 = 0;
        for (Object obj : listTake) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            int iIntValue = ((Number) obj).intValue();
            float f10 = rectFM11957a0.left + 23.0f + (i9 * 61.0f);
            float fCenterY = rectFM11957a0.centerY() - 19.0f;
            arrayList.add(TuplesKt.m13420to(new RectF(f10, fCenterY, f10 + 38.0f, 38.0f + fCenterY), Integer.valueOf(iIntValue)));
            i9 = i10;
        }
        return arrayList;
    }

    /* renamed from: c */
    public final RectF m11960c(C8150k c8150k) {
        RectF rectF = new RectF();
        c8150k.m13077b().computeBounds(rectF, true);
        rectF.inset(-c8150k.m13076a().getStrokeWidth(), -c8150k.m13076a().getStrokeWidth());
        return rectF;
    }

    /* renamed from: c0 */
    public final RectF m11961c0(RectF rectF) {
        Object obj = this.f12860c;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.view.View");
        View view = (View) obj;
        int size = this.f12874q.m12971c() ? CollectionsKt.take(this.f12874q.m12977i(), 5).size() : 0;
        int size2 = this.f12874q.m12970b() ? CollectionsKt.take(this.f12874q.m12976h(), 5).size() : 0;
        float f10 = size == 0 ? 0.0f : (size * 46.0f) + 32.0f;
        float f11 = size2 == 0 ? 0.0f : (size2 * 61.0f) + 23.0f;
        float fCoerceAtMost = RangesKt.coerceAtMost(f10 + ((f10 <= 0.0f || f11 <= 0.0f) ? 0.0f : 13.0f) + f11, view.getWidth());
        float fCoerceIn = RangesKt.coerceIn(rectF.left, 0.0f, RangesKt.coerceAtLeast(view.getWidth() - fCoerceAtMost, 0.0f));
        C8106b c8106bM11950U = m11950U(rectF);
        float fCoerceAtLeast = c8106bM11950U.m12955b().bottom + 13.0f;
        if (fCoerceAtLeast + 60.0f > view.getHeight()) {
            fCoerceAtLeast = RangesKt.coerceAtLeast((c8106bM11950U.m12955b().top - 60.0f) - 13.0f, 0.0f);
        }
        return new RectF(fCoerceIn, fCoerceAtLeast, fCoerceAtMost + fCoerceIn, 60.0f + fCoerceAtLeast);
    }

    /* renamed from: d */
    public final C8150k m11962d(List list, Paint paint, Path path) {
        Path path2 = new Path();
        if (path != null) {
            path2.set(path);
        } else {
            PointF pointF = new PointF();
            int i9 = 0;
            for (Object obj : list) {
                int i10 = i9 + 1;
                if (i9 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                PointF pointF2 = (PointF) obj;
                if (i9 == 0) {
                    path2.moveTo(pointF2.x, pointF2.y);
                    path2.lineTo(pointF2.x, pointF2.y);
                    pointF.set(pointF2);
                } else if (i9 == list.size() - 1) {
                    float f10 = pointF.x;
                    float f11 = pointF.y;
                    float f12 = 2;
                    path2.quadTo(f10, f11, (pointF2.x + f10) / f12, (pointF2.y + f11) / f12);
                    path2.lineTo(pointF2.x, pointF2.y);
                } else {
                    float f13 = pointF.x;
                    float f14 = pointF.y;
                    float f15 = 2;
                    path2.quadTo(f13, f14, (pointF2.x + f13) / f15, (pointF2.y + f14) / f15);
                    pointF.set(pointF2);
                }
                i9 = i10;
            }
        }
        Paint paint2 = new Paint(paint);
        RectF rectF = new RectF();
        path2.computeBounds(rectF, true);
        float fMapRadius = AbstractC9695n.m16200b(this.f12859b).mapRadius(this.f12858a.m12959d());
        float f16 = 2 * fMapRadius;
        if (rectF.width() < f16) {
            rectF.left -= fMapRadius;
            rectF.right += fMapRadius;
        }
        if (rectF.height() < f16) {
            rectF.top -= fMapRadius;
            rectF.bottom += fMapRadius;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        return new C8150k(path2, paint2, rectF, arrayList);
    }

    /* renamed from: d0 */
    public final RectF m11963d0(RectF rectF) {
        int size = this.f12874q.m12971c() ? CollectionsKt.take(this.f12874q.m12977i(), 5).size() : 0;
        if (size == 0) {
            return new RectF();
        }
        float f10 = rectF.left;
        return new RectF(f10, rectF.top, 32.0f + f10 + (size * 46.0f), rectF.bottom);
    }

    /* renamed from: e */
    public final boolean m11964e(PointF pointF, List list, float f10) {
        if (list.size() == 1) {
            return m11972i(pointF, (PointF) CollectionsKt.first(list)) <= f10;
        }
        int size = list.size() - 1;
        int i9 = 0;
        while (i9 < size) {
            float f11 = ((PointF) list.get(i9)).x;
            float f12 = ((PointF) list.get(i9)).y;
            i9++;
            if (AbstractC9430a.m15573b(f11, f12, ((PointF) list.get(i9)).x, ((PointF) list.get(i9)).y, pointF.x, pointF.y) <= f10) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e0 */
    public final List m11965e0(RectF rectF) {
        if (!this.f12874q.m12971c() || this.f12874q.m12977i().isEmpty()) {
            return CollectionsKt.emptyList();
        }
        RectF rectFM11963d0 = m11963d0(rectF);
        List listTake = CollectionsKt.take(this.f12874q.m12977i(), 5);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake, 10));
        int i9 = 0;
        for (Object obj : listTake) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            float fFloatValue = ((Number) obj).floatValue();
            float f10 = rectFM11963d0.left + 16.0f + (i9 * 46.0f);
            arrayList.add(TuplesKt.m13420to(new RectF(f10, rectFM11963d0.top, 46.0f + f10, rectFM11963d0.bottom), Float.valueOf(fFloatValue)));
            i9 = i10;
        }
        return arrayList;
    }

    /* renamed from: f */
    public final void m11966f() {
        m11968g();
        this.f12864g.clear();
        Function0 function0 = this.f12877t;
        if (function0 != null) {
            function0.invoke();
        }
        this.f12860c.mo11927c();
    }

    /* renamed from: f0 */
    public final boolean m11967f0(Integer num, Float f10) {
        boolean z9 = false;
        if (this.f12865h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = this.f12865h;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            C8150k c8150k = (C8150k) obj;
            if (num != null && this.f12874q.m12970b() && c8150k.m13076a().getColor() != num.intValue()) {
                c8150k.m13076a().setColor(num.intValue());
                z9 = true;
            }
            if (f10 != null && this.f12874q.m12971c() && !Intrinsics.areEqual(c8150k.m13076a().getStrokeWidth(), f10)) {
                c8150k.m13076a().setStrokeWidth(f10.floatValue());
                z9 = true;
            }
        }
        if (z9) {
            Function0 function0 = this.f12877t;
            if (function0 != null) {
                function0.invoke();
            }
            this.f12860c.mo11927c();
        }
        return z9;
    }

    /* renamed from: g */
    public final void m11968g() {
        if (this.f12865h.isEmpty() && this.f12866i.isEmpty()) {
            return;
        }
        this.f12865h.clear();
        this.f12866i.setEmpty();
        this.f12870m = SelectionTarget.f12822c;
        this.f12871n = false;
        this.f12872o = false;
        this.f12873p = false;
        m11946Q();
        this.f12860c.mo11926b();
    }

    /* renamed from: g0 */
    public final void m11969g0(int i9, int i10) {
        if (this.f12861d == null) {
            this.f12862e.set(0.0f, 0.0f, i9, i10);
            return;
        }
        float f10 = i9;
        float width = f10 / r0.getWidth();
        this.f12863f.setScale(width, width);
        this.f12862e.set(0.0f, 0.0f, f10, r0.getHeight() * width);
    }

    /* renamed from: h */
    public final boolean m11970h() {
        if (!this.f12874q.m12969a() || this.f12865h.isEmpty()) {
            return false;
        }
        this.f12864g.removeAll(CollectionsKt.toSet(this.f12865h));
        m11968g();
        Function0 function0 = this.f12877t;
        if (function0 != null) {
            function0.invoke();
        }
        this.f12860c.mo11927c();
        return true;
    }

    /* renamed from: h0 */
    public final void m11971h0(C8150k c8150k) {
        c8150k.m13077b().computeBounds(c8150k.m13079d(), true);
        float fMapRadius = AbstractC9695n.m16200b(this.f12859b).mapRadius(this.f12858a.m12959d());
        float f10 = 2 * fMapRadius;
        if (c8150k.m13079d().width() < f10) {
            c8150k.m13079d().inset(-fMapRadius, 0.0f);
        }
        if (c8150k.m13079d().height() < f10) {
            c8150k.m13079d().inset(0.0f, -fMapRadius);
        }
    }

    /* renamed from: i */
    public final float m11972i(PointF pointF, PointF pointF2) {
        float f10 = pointF.x - pointF2.x;
        float f11 = pointF.y - pointF2.y;
        return (float) Math.sqrt((f10 * f10) + (f11 * f11));
    }

    /* renamed from: j */
    public final void m11973j(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Bitmap bitmap = this.f12861d;
        if (bitmap == null) {
            canvas.drawColor(-1);
            return;
        }
        this.f12879v.set(this.f12863f);
        this.f12879v.postConcat(this.f12859b);
        C9686e.f17123a.m16168a(canvas, bitmap, this.f12879v);
    }

    /* renamed from: k */
    public final void m11974k(Canvas canvas, RectF rectF, int i9) {
        this.f12855A.setStyle(Paint.Style.STROKE);
        this.f12855A.setStrokeWidth(2.0f);
        this.f12855A.setColor(m11943N(i9) ? ViewCompat.MEASURED_STATE_MASK : -1);
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        float f10 = fCenterX - 1.0f;
        float f11 = fCenterY + 5.0f;
        canvas.drawLine(fCenterX - 6.0f, fCenterY, f10, f11, this.f12855A);
        canvas.drawLine(f10, f11, fCenterX + 7.0f, fCenterY - 5.0f, this.f12855A);
        m11948S();
    }

    /* renamed from: l */
    public final void m11975l(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.f12879v.set(this.f12859b);
        ArrayList arrayList = this.f12864g;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            C8150k c8150k = (C8150k) obj;
            this.f12878u.set(c8150k.m13077b());
            this.f12878u.transform(this.f12879v);
            canvas.drawPath(this.f12878u, c8150k.m13076a());
        }
    }

    /* renamed from: m */
    public final void m11976m(Canvas canvas, PointF pointF) {
        float f10 = 2;
        float f11 = 18.0f / f10;
        float f12 = pointF.x;
        float f13 = pointF.y;
        RectF rectF = new RectF(f12 - 18.0f, f13 - 18.0f, f12 + 18.0f, f13 + 18.0f);
        canvas.drawArc(rectF, 30.0f, 120.0f, false, this.f12855A);
        float f14 = pointF.x;
        float f15 = f11 * 1.73205f;
        float f16 = pointF.y;
        float f17 = ((f10 * 18.0f) / 3) / f10;
        canvas.drawLine(f14 - f15, (f16 - f11) - f17, f14 - f15, f16 - f11, this.f12855A);
        float f18 = pointF.x;
        float f19 = pointF.y;
        canvas.drawLine(f18 - f15, f19 - f11, (f18 - f15) + f17, f19 - f11, this.f12855A);
        canvas.drawArc(rectF, -150.0f, 120.0f, false, this.f12855A);
        float f20 = pointF.x;
        float f21 = pointF.y;
        canvas.drawLine(f20 + f15, f21 + f11 + f17, f20 + f15, f21 + f11, this.f12855A);
        float f22 = pointF.x;
        float f23 = pointF.y;
        canvas.drawLine(f22 + f15, f23 + f11, (f22 + f15) - f17, f23 + f11, this.f12855A);
        float f24 = pointF.x;
        float f25 = pointF.y;
        canvas.drawRect(f24 - f17, f25 - f17, f24 + f17, f25 + f17, this.f12855A);
    }

    /* renamed from: n */
    public final void m11977n(Canvas canvas, PointF pointF) {
        canvas.drawCircle(pointF.x, pointF.y, 24.0f, this.f12855A);
        float f10 = 24.0f / 2;
        float f11 = pointF.x;
        float f12 = pointF.y;
        canvas.drawLine(f11 - f10, f12 - f10, f11 + f10, f12 + f10, this.f12855A);
        float f13 = pointF.x;
        float f14 = pointF.y;
        canvas.drawLine(f13 - f10, f14, f13 - f10, f14 - f10, this.f12855A);
        float f15 = pointF.x;
        float f16 = pointF.y;
        canvas.drawLine(f15 - f10, f16 - f10, f15, f16 - f10, this.f12855A);
        float f17 = pointF.x;
        float f18 = pointF.y;
        canvas.drawLine(f17 + f10, f18, f17 + f10, f18 + f10, this.f12855A);
        float f19 = pointF.x;
        float f20 = pointF.y;
        canvas.drawLine(f19 + f10, f20 + f10, f19, f20 + f10, this.f12855A);
    }

    /* renamed from: o */
    public final void m11978o(Canvas canvas, RectF rectF, String str, boolean z9) {
        this.f12856B.setTextSize(25.0f);
        this.f12856B.setColor(z9 ? -15370497 : -1);
        canvas.drawText(str, rectF.centerX(), rectF.centerY() - ((this.f12856B.ascent() + this.f12856B.descent()) / 2), this.f12856B);
    }

    /* renamed from: p */
    public final void m11979p(Canvas canvas, RectF rectF) {
        float f10 = rectF.left;
        float f11 = rectF.top;
        canvas.drawLine(f10, f11, rectF.right, f11, this.f12855A);
        float f12 = rectF.left;
        canvas.drawLine(f12, rectF.top, f12, rectF.bottom, this.f12855A);
        if (this.f12874q.m12974f()) {
            float f13 = rectF.right;
            canvas.drawLine(f13, rectF.top, f13, rectF.bottom - 24.0f, this.f12855A);
            float f14 = rectF.left;
            float f15 = rectF.bottom;
            canvas.drawLine(f14, f15, rectF.right - 24.0f, f15, this.f12855A);
            return;
        }
        float f16 = rectF.right;
        canvas.drawLine(f16, rectF.top, f16, rectF.bottom, this.f12855A);
        float f17 = rectF.left;
        float f18 = rectF.bottom;
        canvas.drawLine(f17, f18, rectF.right, f18, this.f12855A);
    }

    /* renamed from: q */
    public final void m11980q(Canvas canvas, RectF rectF) {
        Canvas canvas2;
        m11979p(canvas, rectF);
        int i9 = 0;
        for (Object obj : m11951V(rectF)) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            PointF pointF = (PointF) obj;
            SelectionTarget selectionTarget = (SelectionTarget) SelectionTarget.INSTANCE.m11923b().get(i9);
            if (selectionTarget.m11918n(this.f12874q)) {
                switch (b.f12884a[selectionTarget.ordinal()]) {
                    case 5:
                        m11977n(canvas, pointF);
                        break;
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        m11981r(canvas, pointF);
                        break;
                }
            }
            i9 = i10;
        }
        if (this.f12874q.m12973e()) {
            PointF pointFM11949T = m11949T(rectF);
            canvas2 = canvas;
            canvas2.drawLine(rectF.centerX(), rectF.top, rectF.centerX(), 18.0f + pointFM11949T.y, this.f12855A);
            m11976m(canvas2, pointFM11949T);
        } else {
            canvas2 = canvas;
        }
        C8106b c8106bM11950U = m11950U(rectF);
        RectF rectF2 = new RectF(c8106bM11950U.m12955b());
        rectF2.union(c8106bM11950U.m12954a());
        rectF2.inset(-8.0f, 0.0f);
        canvas2.drawRoundRect(rectF2, 6.0f, 6.0f, this.f12857C);
        if (this.f12874q.m12969a()) {
            m11978o(canvas2, c8106bM11950U.m12954a(), "删除", false);
        }
        if (this.f12874q.m12970b() || this.f12874q.m12971c()) {
            m11978o(canvas2, c8106bM11950U.m12955b(), "编辑", this.f12873p);
        }
        if (this.f12873p) {
            m11982s(canvas2, rectF);
        }
    }

    /* renamed from: r */
    public final void m11981r(Canvas canvas, PointF pointF) {
        this.f12855A.setStyle(Paint.Style.FILL);
        float f10 = pointF.x;
        float f11 = pointF.y;
        canvas.drawRect(f10 - 4.5f, f11 - 4.5f, f10 + 4.5f, f11 + 4.5f, this.f12855A);
        m11948S();
    }

    /* renamed from: s */
    public final void m11982s(Canvas canvas, RectF rectF) {
        RectF rectFM11961c0 = m11961c0(rectF);
        RectF rectFM11963d0 = m11963d0(rectFM11961c0);
        RectF rectFM11957a0 = m11957a0(rectFM11961c0, rectFM11963d0);
        if (!rectFM11963d0.isEmpty()) {
            canvas.drawRoundRect(rectFM11963d0, 6.0f, 6.0f, this.f12857C);
        }
        if (!rectFM11957a0.isEmpty()) {
            canvas.drawRoundRect(rectFM11957a0, 6.0f, 6.0f, this.f12857C);
        }
        ArrayList arrayList = this.f12865h;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            arrayList2.add(Integer.valueOf(((C8150k) obj).m13076a().getColor()));
        }
        Integer num = (Integer) CollectionsKt.singleOrNull(CollectionsKt.distinct(arrayList2));
        for (Pair pair : m11959b0(rectFM11961c0)) {
            RectF rectF2 = (RectF) pair.component1();
            int iIntValue = ((Number) pair.component2()).intValue();
            this.f12855A.setStyle(Paint.Style.FILL);
            this.f12855A.setColor(iIntValue);
            canvas.drawRoundRect(rectF2, 6.0f, 6.0f, this.f12855A);
            if (num != null && num.intValue() == iIntValue) {
                m11974k(canvas, rectF2, iIntValue);
            }
        }
        ArrayList arrayList3 = this.f12865h;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        int size2 = arrayList3.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList3.get(i11);
            i11++;
            arrayList4.add(Float.valueOf(((C8150k) obj2).m13076a().getStrokeWidth()));
        }
        Float f10 = (Float) CollectionsKt.singleOrNull(CollectionsKt.distinct(arrayList4));
        for (Object obj3 : m11965e0(rectFM11961c0)) {
            int i12 = i9 + 1;
            if (i9 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Pair pair2 = (Pair) obj3;
            RectF rectF3 = (RectF) pair2.component1();
            float fFloatValue = ((Number) pair2.component2()).floatValue();
            this.f12855A.setStyle(Paint.Style.FILL);
            this.f12855A.setColor(Intrinsics.areEqual(f10, fFloatValue) ? -15370497 : -3552823);
            canvas.drawCircle(rectF3.centerX(), rectF3.centerY(), ((i9 * 3.0f) + 8.0f) / 2, this.f12855A);
            i9 = i12;
        }
        m11948S();
    }

    /* renamed from: t */
    public final void m11983t(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (!this.f12876s.isEmpty()) {
            canvas.drawPath(this.f12876s, this.f12882y);
        }
        if (!this.f12866i.isEmpty()) {
            RectF rectF = new RectF(this.f12866i);
            this.f12859b.mapRect(rectF);
            canvas.drawRect(rectF, this.f12883z);
        } else {
            if (this.f12865h.isEmpty() || m11945P()) {
                return;
            }
            m11980q(canvas, m11988z());
        }
    }

    /* renamed from: u */
    public final C8150k m11984u(PointF pointF) {
        Object next;
        Iterator it = CollectionsKt.asReversedMutable(this.f12864g).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (m11960c((C8150k) next).contains(pointF.x, pointF.y)) {
                break;
            }
        }
        return (C8150k) next;
    }

    /* renamed from: v */
    public final SelectionTarget m11985v(PointF pointF) {
        if (this.f12865h.isEmpty()) {
            return SelectionTarget.f12822c;
        }
        RectF rectFM11988z = m11988z();
        C8106b c8106bM11950U = m11950U(rectFM11988z);
        if (this.f12874q.m12969a() && c8106bM11950U.m12954a().contains(pointF.x, pointF.y)) {
            return SelectionTarget.f12834o;
        }
        if ((this.f12874q.m12970b() || this.f12874q.m12971c()) && c8106bM11950U.m12955b().contains(pointF.x, pointF.y)) {
            return SelectionTarget.f12833n;
        }
        int i9 = 0;
        if (this.f12873p) {
            RectF rectFM11961c0 = m11961c0(rectFM11988z);
            int i10 = 0;
            for (Object obj : m11959b0(rectFM11961c0)) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (((RectF) ((Pair) obj).getFirst()).contains(pointF.x, pointF.y)) {
                    return SelectionTarget.INSTANCE.m11922a(i10);
                }
                i10 = i11;
            }
            int i12 = 0;
            for (Object obj2 : m11965e0(rectFM11961c0)) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (((RectF) ((Pair) obj2).getFirst()).contains(pointF.x, pointF.y)) {
                    return SelectionTarget.INSTANCE.m11924c(i12);
                }
                i12 = i13;
            }
            if (rectFM11961c0.contains(pointF.x, pointF.y)) {
                return SelectionTarget.f12835p;
            }
        }
        if (this.f12874q.m12973e() && m11944O(pointF, m11949T(rectFM11988z), 24.0f)) {
            return SelectionTarget.f12832m;
        }
        for (Object obj3 : m11951V(rectFM11988z)) {
            int i14 = i9 + 1;
            if (i9 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            PointF pointF2 = (PointF) obj3;
            SelectionTarget selectionTarget = (SelectionTarget) SelectionTarget.INSTANCE.m11923b().get(i9);
            if (selectionTarget.m11920t(this.f12874q) && m11944O(pointF, pointF2, 24.0f)) {
                return selectionTarget;
            }
            i9 = i14;
        }
        return (this.f12874q.m12972d() && rectFM11988z.contains(pointF.x, pointF.y)) ? SelectionTarget.f12823d : SelectionTarget.f12822c;
    }

    /* renamed from: w */
    public final Bitmap m11986w() {
        return this.f12861d;
    }

    /* renamed from: x */
    public final RectF m11987x(boolean z9) {
        RectF rectF = new RectF();
        ((C8150k) CollectionsKt.first((List) this.f12865h)).m13077b().computeBounds(rectF, true);
        for (C8150k c8150k : CollectionsKt.drop(this.f12865h, 1)) {
            RectF rectF2 = new RectF();
            c8150k.m13077b().computeBounds(rectF2, true);
            rectF.union(rectF2);
        }
        if (z9) {
            float f10 = -AbstractC9695n.m16200b(this.f12859b).mapRadius(6.0f);
            rectF.inset(f10, f10);
        }
        return rectF;
    }

    /* renamed from: z */
    public final RectF m11988z() {
        RectF rectF = new RectF(m11929y(this, false, 1, null));
        this.f12859b.mapRect(rectF);
        return rectF;
    }
}
