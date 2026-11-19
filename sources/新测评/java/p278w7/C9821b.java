package p278w7;

import android.graphics.Bitmap;
import android.graphics.Canvas;
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
import com.zykj.sketch.core.graph.GraphExtKt;
import com.zykj.view.utils.ProtoPath;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p024b5.AbstractC4982a;
import p077e5.AbstractC7352m;
import p077e5.C7343d;
import p288x7.C9880j;
import p298y7.InterfaceC9947d;

/* renamed from: w7.b */
/* loaded from: classes5.dex */
public final class C9821b {

    /* renamed from: a */
    public final C9822c f17362a;

    /* renamed from: b */
    public final Matrix f17363b;

    /* renamed from: c */
    public final InterfaceC9947d f17364c;

    /* renamed from: d */
    public Bitmap f17365d;

    /* renamed from: e */
    public RectF f17366e;

    /* renamed from: f */
    public Matrix f17367f;

    /* renamed from: g */
    public final ArrayList f17368g;

    /* renamed from: h */
    public Path f17369h;

    /* renamed from: i */
    public Function0 f17370i;

    /* renamed from: j */
    public final Path f17371j;

    /* renamed from: k */
    public final Matrix f17372k;

    /* renamed from: l */
    public final float[] f17373l;

    /* renamed from: m */
    public final Paint f17374m;

    /* renamed from: n */
    public final Paint f17375n;

    public C9821b(C9822c mBoardConfig, Matrix mCameraMatrix, InterfaceC9947d mDrawView) {
        Intrinsics.checkNotNullParameter(mBoardConfig, "mBoardConfig");
        Intrinsics.checkNotNullParameter(mCameraMatrix, "mCameraMatrix");
        Intrinsics.checkNotNullParameter(mDrawView, "mDrawView");
        this.f17362a = mBoardConfig;
        this.f17363b = mCameraMatrix;
        this.f17364c = mDrawView;
        this.f17366e = new RectF();
        this.f17367f = new Matrix();
        this.f17368g = new ArrayList();
        this.f17369h = new Path();
        this.f17371j = new Path();
        this.f17372k = new Matrix();
        float[] fArr = new float[9];
        for (int i10 = 0; i10 < 9; i10++) {
            fArr[i10] = 0.0f;
        }
        this.f17373l = fArr;
        Paint paint = new Paint();
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Join join = Paint.Join.ROUND;
        paint.setStrokeJoin(join);
        paint.setDither(true);
        paint.setAntiAlias(true);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_OVER;
        paint.setXfermode(new PorterDuffXfermode(mode));
        this.f17374m = paint;
        Paint paint2 = new Paint();
        paint2.setStrokeCap(cap);
        paint2.setStrokeJoin(join);
        paint2.setDither(true);
        paint2.setAntiAlias(true);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f17375n = paint2;
    }

    /* renamed from: c */
    public static /* synthetic */ C9880j m16407c(C9821b c9821b, List list, Paint paint, Path path, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            path = null;
        }
        return c9821b.m16409b(list, paint, path);
    }

    /* renamed from: a */
    public final Bitmap m16408a() throws Exception {
        Object objM24299constructorimpl;
        float fWidth = this.f17366e.width();
        float fHeight = this.f17366e.height();
        try {
            Result.Companion companion = Result.INSTANCE;
            objM24299constructorimpl = Result.m24299constructorimpl(Bitmap.createBitmap((int) fWidth, (int) fHeight, Bitmap.Config.RGB_565));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM24299constructorimpl = Result.m24299constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m24305isFailureimpl(objM24299constructorimpl)) {
            objM24299constructorimpl = null;
        }
        Bitmap bitmap = (Bitmap) objM24299constructorimpl;
        if (bitmap == null) {
            throw new Exception("view have not init");
        }
        Canvas canvas = new Canvas(bitmap);
        Bitmap bitmap2 = this.f17365d;
        this.f17372k.set(this.f17367f);
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, this.f17372k, null);
        } else {
            canvas.drawColor(-1);
        }
        ArrayList arrayList = this.f17368g;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            C9880j c9880j = (C9880j) obj;
            this.f17371j.set(c9880j.m16587b());
            canvas.drawPath(this.f17371j, c9880j.m16586a());
        }
        return bitmap;
    }

    /* renamed from: b */
    public final C9880j m16409b(List list, Paint paint, Path path) {
        Path path2 = new Path();
        if (path != null) {
            path2.set(path);
        } else {
            PointF pointF = new PointF();
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                PointF pointF2 = (PointF) obj;
                if (i10 == 0) {
                    path2.moveTo(pointF2.x, pointF2.y);
                    path2.lineTo(pointF2.x, pointF2.y);
                    pointF.set(pointF2);
                } else if (i10 == list.size() - 1) {
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
                i10 = i11;
            }
        }
        Paint paint2 = new Paint(paint);
        RectF rectF = new RectF();
        path2.computeBounds(rectF, true);
        float fMapRadius = AbstractC7352m.m11777b(this.f17363b).mapRadius(this.f17362a.m16435d());
        float f16 = 2 * fMapRadius; // SimpleBoard freezes the narrow-axis hit bounds here using the current eraser diameter.
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
        return new C9880j(path2, paint2, rectF, arrayList);
    }

    /* renamed from: d */
    public final boolean m16410d(PointF pointF, List list, float f10) {
        int size = list.size() - 1; // Hit testing joins consecutive raw samples, including gaps in a dashed path.
        int i10 = 0;
        while (i10 < size) {
            float f11 = ((PointF) list.get(i10)).x;
            float f12 = ((PointF) list.get(i10)).y;
            i10++;
            if (AbstractC4982a.m2462b(f11, f12, ((PointF) list.get(i10)).x, ((PointF) list.get(i10)).y, pointF.x, pointF.y) <= f10) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final void m16411e() {
        this.f17368g.clear();
        Function0 function0 = this.f17370i;
        if (function0 != null) {
            function0.invoke();
        }
        this.f17364c.mo11426c();
    }

    /* renamed from: f */
    public final void m16412f(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Bitmap bitmap = this.f17365d;
        if (bitmap == null) {
            canvas.drawColor(-1);
            return;
        }
        this.f17372k.set(this.f17367f);
        this.f17372k.postConcat(this.f17363b);
        C7343d.f11910a.m11747a(canvas, bitmap, this.f17372k);
    }

    /* renamed from: g */
    public final void m16413g(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.f17372k.set(this.f17363b);
        ArrayList arrayList = this.f17368g;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            C9880j c9880j = (C9880j) obj;
            this.f17371j.set(c9880j.m16587b());
            this.f17371j.transform(this.f17372k);
            canvas.drawPath(this.f17371j, c9880j.m16586a());
        }
    }

    /* renamed from: h */
    public final void m16414h(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f17369h.isEmpty()) {
            return;
        }
        canvas.drawPath(this.f17369h, this.f17375n);
    }

    /* renamed from: i */
    public final Bitmap m16415i() {
        return this.f17365d;
    }

    /* renamed from: j */
    public final ArrayList m16416j() {
        return this.f17368g;
    }

    /* renamed from: k */
    public final void m16417k(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Object obj = this.f17364c;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.view.View");
        Log.i("DrawControl", "before -> " + matrix.toShortString());
        matrix.getValues(this.f17373l);
        float[] fArr = this.f17373l;
        float f10 = fArr[0];
        float f11 = fArr[4];
        float f12 = fArr[2];
        float f13 = fArr[5];
        float fM16436e = this.f17362a.m16436e() > 1.0f ? this.f17362a.m16436e() : 1.0f;
        if (f10 < 1.0f) {
            this.f17373l[0] = 1.0f;
        } else if (f10 > fM16436e) {
            this.f17373l[0] = fM16436e;
        }
        if (f11 < 1.0f) {
            this.f17373l[4] = 1.0f;
        } else if (f10 > fM16436e) {
            this.f17373l[4] = fM16436e;
        }
        if (f12 > 0.0f) {
            this.f17373l[2] = 0.0f;
        } else if (f12 < (-((this.f17366e.width() * f10) - ((View) this.f17364c).getWidth()))) {
            this.f17373l[2] = -((this.f17366e.width() * this.f17373l[0]) - ((View) this.f17364c).getWidth());
        } else if (this.f17366e.width() * f10 == ((View) this.f17364c).getWidth()) {
            this.f17373l[2] = 0.0f;
        } else {
            float f14 = 1;
            this.f17373l[2] = (((f12 / ((this.f17366e.width() * f10) - ((View) this.f17364c).getWidth())) + f14) - f14) * ((this.f17366e.width() * this.f17373l[0]) - ((View) this.f17364c).getWidth());
        }
        if (f13 > 0.0f) {
            this.f17373l[5] = 0.0f;
        } else if (f13 < (-((this.f17366e.height() * f11) - ((View) this.f17364c).getHeight()))) {
            this.f17373l[5] = -((this.f17366e.height() * this.f17373l[4]) - ((View) this.f17364c).getHeight());
        } else if (this.f17366e.height() * f11 == ((View) this.f17364c).getHeight()) {
            this.f17373l[5] = 0.0f;
        } else {
            float f15 = 1;
            this.f17373l[5] = (((f13 / ((this.f17366e.height() * f11) - ((View) this.f17364c).getHeight())) + f15) - f15) * ((this.f17366e.height() * this.f17373l[4]) - ((View) this.f17364c).getHeight());
        }
        matrix.setValues(this.f17373l);
        Log.i("DrawControl", "after -> " + matrix.toShortString());
        this.f17363b.set(matrix);
        this.f17364c.mo11424a();
        this.f17364c.mo11426c();
        this.f17364c.mo11425b();
    }

    /* renamed from: l */
    public final void m16418l(PointF currentPointF) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(currentPointF, "currentPointF");
        PointF pointFMapPoint = GraphExtKt.mapPoint(this.f17363b, currentPointF);
        this.f17369h.reset();
        this.f17369h.addCircle(pointFMapPoint.x, pointFMapPoint.y, this.f17362a.m16435d(), Path.Direction.CW);
        m16423q(this.f17375n);
        Iterator it = this.f17368g.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        boolean z9 = false;
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            C9880j c9880j = (C9880j) next;
            if (c9880j.m16589d().contains(currentPointF.x, currentPointF.y) && m16410d(currentPointF, c9880j.m16588c(), AbstractC7352m.m11777b(this.f17363b).mapRadius(this.f17362a.m16435d()))) {
                it.remove();
                z9 = true;
            }
        }
        if (z9 && (function0 = this.f17370i) != null) {
            function0.invoke();
        }
        this.f17364c.mo11426c();
        this.f17364c.mo11425b();
    }

    /* renamed from: m */
    public final void m16419m(PointF currentPointF) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(currentPointF, "currentPointF");
        this.f17369h.reset();
        Iterator it = this.f17368g.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        boolean z9 = false;
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            C9880j c9880j = (C9880j) next;
            if (c9880j.m16589d().contains(currentPointF.x, currentPointF.y) && m16410d(currentPointF, c9880j.m16588c(), AbstractC7352m.m11777b(this.f17363b).mapRadius(this.f17362a.m16435d()))) {
                it.remove();
                z9 = true;
            }
        }
        if (z9 && (function0 = this.f17370i) != null) {
            function0.invoke();
        }
        this.f17364c.mo11426c();
        this.f17364c.mo11425b();
    }

    /* renamed from: n */
    public final void m16420n(Path path) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.f17371j.set(path);
        this.f17371j.transform(this.f17363b);
        this.f17369h.set(this.f17371j);
        m16424r(this.f17375n);
        this.f17364c.mo11425b();
    }

    /* renamed from: o */
    public final void m16421o() {
        this.f17369h.reset();
        this.f17364c.mo11425b();
    }

    /* renamed from: p */
    public final void m16422p(Path path, List pointFList) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(pointFList, "pointFList");
        this.f17369h.reset();
        m16424r(this.f17374m);
        this.f17368g.add(m16409b(pointFList, this.f17374m, path));
        Function0 function0 = this.f17370i;
        if (function0 != null) {
            function0.invoke();
        }
        this.f17364c.mo11426c();
        this.f17364c.mo11425b();
    }

    /* renamed from: q */
    public final void m16423q(Paint paint) {
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.f17362a.m16434c());
    }

    /* renamed from: r */
    public final void m16424r(Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(this.f17362a.m16438g());
        paint.setStrokeWidth(this.f17362a.m16439h());
        paint.setPathEffect(this.f17362a.m16440i() ? new DashPathEffect(new float[]{30.0f, 15.0f}, 0.0f) : null);
    }

    /* renamed from: s */
    public final boolean m16425s() {
        return this.f17368g.isEmpty() || this.f17365d == null;
    }

    /* renamed from: t */
    public final void m16426t() {
        Object obj = this.f17364c;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.view.View");
        View view = (View) obj;
        this.f17368g.clear();
        this.f17365d = null;
        this.f17366e.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        this.f17367f.reset();
        this.f17363b.reset();
        this.f17364c.mo11424a();
        this.f17364c.mo11426c();
    }

    /* renamed from: u */
    public final void m16427u(Bitmap bitmap) {
        Object objM24299constructorimpl;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM24299constructorimpl = Result.m24299constructorimpl(Bitmap.createBitmap(bitmap));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM24299constructorimpl = Result.m24299constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m24305isFailureimpl(objM24299constructorimpl)) {
            objM24299constructorimpl = null;
        }
        Bitmap bitmap2 = (Bitmap) objM24299constructorimpl;
        if (bitmap2 != null) {
            this.f17365d = bitmap2;
            Object obj = this.f17364c;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.view.View");
            int width = ((View) obj).getWidth();
            if (width > 0) {
                float f10 = width;
                float width2 = f10 / bitmap2.getWidth();
                this.f17367f.setScale(width2, width2);
                this.f17366e.set(0.0f, 0.0f, f10, bitmap2.getHeight() * width2);
            }
        }
        this.f17364c.mo11424a();
    }

    /* renamed from: v */
    public final void m16428v(Function0 function0) {
        this.f17370i = function0;
    }

    /* renamed from: w */
    public final void m16429w(List pathList) {
        Intrinsics.checkNotNullParameter(pathList, "pathList");
        this.f17368g.clear();
        ArrayList arrayList = this.f17368g;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(pathList, 10));
        Iterator it = pathList.iterator();
        while (it.hasNext()) {
            ProtoPath protoPath = (ProtoPath) it.next();
            arrayList2.add(m16407c(this, protoPath.getPointList(), protoPath.getPaint(), null, 4, null));
        }
        arrayList.addAll(arrayList2);
        this.f17364c.mo11426c();
    }

    /* renamed from: x */
    public final void m16430x(float f10) throws Exception {
        if (f10 < this.f17362a.m16437f() || f10 > this.f17362a.m16436e()) {
            throw new Exception("scale is not in range at config");
        }
        this.f17363b.getValues(this.f17373l);
        float[] fArr = this.f17373l;
        fArr[0] = f10;
        fArr[4] = f10;
        this.f17372k.setValues(fArr);
        m16417k(this.f17372k);
    }

    /* renamed from: y */
    public final void m16431y(int i10, int i11) {
        if (this.f17365d == null) {
            this.f17366e.set(0.0f, 0.0f, i10, i11);
            return;
        }
        float f10 = i10;
        float width = f10 / r0.getWidth();
        this.f17367f.setScale(width, width);
        this.f17366e.set(0.0f, 0.0f, f10, r0.getHeight() * width);
    }
}
