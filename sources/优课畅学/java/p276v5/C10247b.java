package p276v5;

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
import com.zykj.blackboard.extensions.ExtensionsKt;
import com.zykj.blackboard.utils.CanvasUtils;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.sketch.core.graph.GraphExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC9079b;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8809v;
import p287w5.C10358j;
import p298x5.InterfaceC10552d;
import p300x7.InterfaceC10559a;

/* renamed from: v5.b */
/* loaded from: classes5.dex */
public final class C10247b {

    /* renamed from: a */
    public final C10248c f20465a;

    /* renamed from: b */
    public final Matrix f20466b;

    /* renamed from: c */
    public final InterfaceC10552d f20467c;

    /* renamed from: d */
    public Bitmap f20468d;

    /* renamed from: e */
    public RectF f20469e;

    /* renamed from: f */
    public Matrix f20470f;

    /* renamed from: g */
    public final ArrayList f20471g;

    /* renamed from: h */
    public Path f20472h;

    /* renamed from: i */
    public InterfaceC10559a f20473i;

    /* renamed from: j */
    public final Path f20474j;

    /* renamed from: k */
    public final Matrix f20475k;

    /* renamed from: l */
    public final float[] f20476l;

    /* renamed from: m */
    public final Paint f20477m;

    /* renamed from: n */
    public final Paint f20478n;

    public C10247b(C10248c mBoardConfig, Matrix mCameraMatrix, InterfaceC10552d mDrawView) {
        AbstractC9133u.m16133g(mBoardConfig, "mBoardConfig");
        AbstractC9133u.m16133g(mCameraMatrix, "mCameraMatrix");
        AbstractC9133u.m16133g(mDrawView, "mDrawView");
        this.f20465a = mBoardConfig;
        this.f20466b = mCameraMatrix;
        this.f20467c = mDrawView;
        this.f20469e = new RectF();
        this.f20470f = new Matrix();
        this.f20471g = new ArrayList();
        this.f20472h = new Path();
        this.f20474j = new Path();
        this.f20475k = new Matrix();
        float[] fArr = new float[9];
        for (int i10 = 0; i10 < 9; i10++) {
            fArr[i10] = 0.0f;
        }
        this.f20476l = fArr;
        Paint paint = new Paint();
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Join join = Paint.Join.ROUND;
        paint.setStrokeJoin(join);
        paint.setDither(true);
        paint.setAntiAlias(true);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_OVER;
        paint.setXfermode(new PorterDuffXfermode(mode));
        this.f20477m = paint;
        Paint paint2 = new Paint();
        paint2.setStrokeCap(cap);
        paint2.setStrokeJoin(join);
        paint2.setDither(true);
        paint2.setAntiAlias(true);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f20478n = paint2;
    }

    /* renamed from: a */
    public final C10358j m19169a(List list, Paint paint, Path path) {
        Path path2 = new Path();
        if (path != null) {
            path2.set(path);
        } else {
            PointF pointF = new PointF();
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC8809v.m14780w();
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
        float fMapRadius = MatrixExtKt.invert(this.f20466b).mapRadius(this.f20465a.m19190d());
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
        return new C10358j(path2, paint2, rectF, arrayList);
    }

    /* renamed from: b */
    public final boolean m19170b(PointF pointF, List list, float f10) {
        int size = list.size() - 1;
        int i10 = 0;
        while (i10 < size) {
            float f11 = ((PointF) list.get(i10)).x;
            float f12 = ((PointF) list.get(i10)).y;
            i10++;
            if (ExtensionsKt.pointToLine(f11, f12, ((PointF) list.get(i10)).x, ((PointF) list.get(i10)).y, pointF.x, pointF.y) <= f10) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final void m19171c() {
        this.f20471g.clear();
        InterfaceC10559a interfaceC10559a = this.f20473i;
        if (interfaceC10559a != null) {
            interfaceC10559a.invoke();
        }
        this.f20467c.mo13293c();
    }

    /* renamed from: d */
    public final void m19172d(Canvas canvas) {
        AbstractC9133u.m16133g(canvas, "canvas");
        Bitmap bitmap = this.f20468d;
        if (bitmap == null) {
            canvas.drawColor(-1);
            return;
        }
        this.f20475k.set(this.f20470f);
        this.f20475k.postConcat(this.f20466b);
        CanvasUtils.INSTANCE.drawLargeBitmap(canvas, bitmap, this.f20475k);
    }

    /* renamed from: e */
    public final void m19173e(Canvas canvas) {
        AbstractC9133u.m16133g(canvas, "canvas");
        this.f20475k.set(this.f20466b);
        for (C10358j c10358j : this.f20471g) {
            this.f20474j.set(c10358j.m19293b());
            this.f20474j.transform(this.f20475k);
            canvas.drawPath(this.f20474j, c10358j.m19292a());
        }
    }

    /* renamed from: f */
    public final void m19174f(Canvas canvas) {
        AbstractC9133u.m16133g(canvas, "canvas");
        if (this.f20472h.isEmpty()) {
            return;
        }
        canvas.drawPath(this.f20472h, this.f20478n);
    }

    /* renamed from: g */
    public final Bitmap m19175g() {
        return this.f20468d;
    }

    /* renamed from: h */
    public final void m19176h(Matrix matrix) {
        AbstractC9133u.m16133g(matrix, "matrix");
        Object obj = this.f20467c;
        AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type android.view.View");
        Log.i("DrawControl", "before -> " + matrix.toShortString());
        matrix.getValues(this.f20476l);
        float[] fArr = this.f20476l;
        float f10 = fArr[0];
        float f11 = fArr[4];
        float f12 = fArr[2];
        float f13 = fArr[5];
        float fM19191e = this.f20465a.m19191e() > 1.0f ? this.f20465a.m19191e() : 1.0f;
        if (f10 < 1.0f) {
            this.f20476l[0] = 1.0f;
        } else if (f10 > fM19191e) {
            this.f20476l[0] = fM19191e;
        }
        if (f11 < 1.0f) {
            this.f20476l[4] = 1.0f;
        } else if (f10 > fM19191e) {
            this.f20476l[4] = fM19191e;
        }
        if (f12 > 0.0f) {
            this.f20476l[2] = 0.0f;
        } else if (f12 < (-((this.f20469e.width() * f10) - ((View) this.f20467c).getWidth()))) {
            this.f20476l[2] = -((this.f20469e.width() * this.f20476l[0]) - ((View) this.f20467c).getWidth());
        } else if (this.f20469e.width() * f10 == ((View) this.f20467c).getWidth()) {
            this.f20476l[2] = 0.0f;
        } else {
            float f14 = 1;
            this.f20476l[2] = (((f12 / ((this.f20469e.width() * f10) - ((View) this.f20467c).getWidth())) + f14) - f14) * ((this.f20469e.width() * this.f20476l[0]) - ((View) this.f20467c).getWidth());
        }
        if (f13 > 0.0f) {
            this.f20476l[5] = 0.0f;
        } else if (f13 < (-((this.f20469e.height() * f11) - ((View) this.f20467c).getHeight()))) {
            this.f20476l[5] = -((this.f20469e.height() * this.f20476l[4]) - ((View) this.f20467c).getHeight());
        } else if (this.f20469e.height() * f11 == ((View) this.f20467c).getHeight()) {
            this.f20476l[5] = 0.0f;
        } else {
            float f15 = 1;
            this.f20476l[5] = (((f13 / ((this.f20469e.height() * f11) - ((View) this.f20467c).getHeight())) + f15) - f15) * ((this.f20469e.height() * this.f20476l[4]) - ((View) this.f20467c).getHeight());
        }
        matrix.setValues(this.f20476l);
        Log.i("DrawControl", "after -> " + matrix.toShortString());
        this.f20466b.set(matrix);
        this.f20467c.mo13291a();
        this.f20467c.mo13293c();
        this.f20467c.mo13292b();
    }

    /* renamed from: i */
    public final void m19177i(PointF currentPointF) {
        InterfaceC10559a interfaceC10559a;
        AbstractC9133u.m16133g(currentPointF, "currentPointF");
        PointF pointFMapPoint = GraphExtKt.mapPoint(this.f20466b, currentPointF);
        this.f20472h.reset();
        this.f20472h.addCircle(pointFMapPoint.x, pointFMapPoint.y, this.f20465a.m19190d(), Path.Direction.CW);
        m19182n(this.f20478n);
        Iterator it = this.f20471g.iterator();
        AbstractC9133u.m16132f(it, "iterator(...)");
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC9133u.m16132f(next, "next(...)");
            C10358j c10358j = (C10358j) next;
            if (c10358j.m19295d().contains(currentPointF.x, currentPointF.y) && m19170b(currentPointF, c10358j.m19294c(), MatrixExtKt.invert(this.f20466b).mapRadius(this.f20465a.m19190d()))) {
                it.remove();
                z10 = true;
            }
        }
        if (z10 && (interfaceC10559a = this.f20473i) != null) {
            interfaceC10559a.invoke();
        }
        this.f20467c.mo13293c();
        this.f20467c.mo13292b();
    }

    /* renamed from: j */
    public final void m19178j(PointF currentPointF) {
        InterfaceC10559a interfaceC10559a;
        AbstractC9133u.m16133g(currentPointF, "currentPointF");
        this.f20472h.reset();
        Iterator it = this.f20471g.iterator();
        AbstractC9133u.m16132f(it, "iterator(...)");
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC9133u.m16132f(next, "next(...)");
            C10358j c10358j = (C10358j) next;
            if (c10358j.m19295d().contains(currentPointF.x, currentPointF.y) && m19170b(currentPointF, c10358j.m19294c(), MatrixExtKt.invert(this.f20466b).mapRadius(this.f20465a.m19190d()))) {
                it.remove();
                z10 = true;
            }
        }
        if (z10 && (interfaceC10559a = this.f20473i) != null) {
            interfaceC10559a.invoke();
        }
        this.f20467c.mo13293c();
        this.f20467c.mo13292b();
    }

    /* renamed from: k */
    public final void m19179k(Path path) {
        AbstractC9133u.m16133g(path, "path");
        this.f20474j.set(path);
        this.f20474j.transform(this.f20466b);
        this.f20472h.set(this.f20474j);
        m19183o(this.f20478n);
        this.f20467c.mo13292b();
    }

    /* renamed from: l */
    public final void m19180l() {
        this.f20472h.reset();
        this.f20467c.mo13292b();
    }

    /* renamed from: m */
    public final void m19181m(Path path, List pointFList) {
        AbstractC9133u.m16133g(path, "path");
        AbstractC9133u.m16133g(pointFList, "pointFList");
        this.f20472h.reset();
        m19183o(this.f20477m);
        this.f20471g.add(m19169a(pointFList, this.f20477m, path));
        InterfaceC10559a interfaceC10559a = this.f20473i;
        if (interfaceC10559a != null) {
            interfaceC10559a.invoke();
        }
        this.f20467c.mo13293c();
        this.f20467c.mo13292b();
    }

    /* renamed from: n */
    public final void m19182n(Paint paint) {
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.f20465a.m19189c());
    }

    /* renamed from: o */
    public final void m19183o(Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(this.f20465a.m19192f());
        paint.setStrokeWidth(this.f20465a.m19193g());
        paint.setPathEffect(this.f20465a.m19194h() ? new DashPathEffect(new float[]{30.0f, 15.0f}, 0.0f) : null);
    }

    /* renamed from: p */
    public final void m19184p(Bitmap bitmap) {
        Object objM15909b;
        AbstractC9133u.m16133g(bitmap, "bitmap");
        try {
            Result.C9076a c9076a = Result.f17350b;
            objM15909b = Result.m15909b(Bitmap.createBitmap(bitmap));
        } catch (Throwable th) {
            Result.C9076a c9076a2 = Result.f17350b;
            objM15909b = Result.m15909b(AbstractC9079b.m15925a(th));
        }
        if (Result.m15913g(objM15909b)) {
            objM15909b = null;
        }
        Bitmap bitmap2 = (Bitmap) objM15909b;
        if (bitmap2 != null) {
            this.f20468d = bitmap2;
            Object obj = this.f20467c;
            AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type android.view.View");
            int width = ((View) obj).getWidth();
            if (width > 0) {
                float f10 = width;
                float width2 = f10 / bitmap2.getWidth();
                this.f20470f.setScale(width2, width2);
                this.f20469e.set(0.0f, 0.0f, f10, bitmap2.getHeight() * width2);
            }
        }
        this.f20467c.mo13291a();
    }

    /* renamed from: q */
    public final void m19185q(InterfaceC10559a interfaceC10559a) {
        this.f20473i = interfaceC10559a;
    }

    /* renamed from: r */
    public final void m19186r(int i10, int i11) {
        if (this.f20468d == null) {
            this.f20469e.set(0.0f, 0.0f, i10, i11);
            return;
        }
        float f10 = i10;
        float width = f10 / r0.getWidth();
        this.f20470f.setScale(width, width);
        this.f20469e.set(0.0f, 0.0f, f10, r0.getHeight() * width);
    }
}
