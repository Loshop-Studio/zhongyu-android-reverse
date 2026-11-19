package p308qb;

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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC9979u;
import la.AbstractC10163a;
import na.AbstractC10351n;
import na.C10342e;
import p181hd.InterfaceC9529a;
import p324rb.C10933j;
import p325rc.AbstractC10978w;
import sb.InterfaceC11086a;

/* renamed from: qb.b */
/* loaded from: classes6.dex */
public final class C10768b {

    /* renamed from: a */
    public final C10769c f25969a;

    /* renamed from: b */
    public final Matrix f25970b;

    /* renamed from: c */
    public final InterfaceC11086a f25971c;

    /* renamed from: d */
    public Bitmap f25972d;

    /* renamed from: e */
    public RectF f25973e;

    /* renamed from: f */
    public Matrix f25974f;

    /* renamed from: g */
    public final ArrayList f25975g;

    /* renamed from: h */
    public Path f25976h;

    /* renamed from: i */
    public InterfaceC9529a f25977i;

    /* renamed from: j */
    public final Path f25978j;

    /* renamed from: k */
    public final Matrix f25979k;

    /* renamed from: l */
    public final float[] f25980l;

    /* renamed from: m */
    public final Paint f25981m;

    /* renamed from: n */
    public final Paint f25982n;

    public C10768b(C10769c mBoardConfig, Matrix mCameraMatrix, InterfaceC11086a mDrawView) {
        AbstractC9979u.m20294g(mBoardConfig, "mBoardConfig");
        AbstractC9979u.m20294g(mCameraMatrix, "mCameraMatrix");
        AbstractC9979u.m20294g(mDrawView, "mDrawView");
        this.f25969a = mBoardConfig;
        this.f25970b = mCameraMatrix;
        this.f25971c = mDrawView;
        this.f25973e = new RectF();
        this.f25974f = new Matrix();
        this.f25975g = new ArrayList();
        this.f25976h = new Path();
        this.f25978j = new Path();
        this.f25979k = new Matrix();
        float[] fArr = new float[9];
        for (int i10 = 0; i10 < 9; i10++) {
            fArr[i10] = 0.0f;
        }
        this.f25980l = fArr;
        Paint paint = new Paint();
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Join join = Paint.Join.ROUND;
        paint.setStrokeJoin(join);
        paint.setDither(true);
        paint.setAntiAlias(true);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_OVER;
        paint.setXfermode(new PorterDuffXfermode(mode));
        this.f25981m = paint;
        Paint paint2 = new Paint();
        paint2.setStrokeCap(cap);
        paint2.setStrokeJoin(join);
        paint2.setDither(true);
        paint2.setAntiAlias(true);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f25982n = paint2;
    }

    /* renamed from: a */
    public final C10933j m22942a(List list, Paint paint, Path path) {
        Path path2 = new Path();
        if (path != null) {
            path2.set(path);
        } else {
            PointF pointF = new PointF();
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC10978w.m24145w();
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
        float fMapRadius = AbstractC10351n.m21660b(this.f25970b).mapRadius(this.f25969a.m22963d());
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
        return new C10933j(path2, paint2, rectF, arrayList);
    }

    /* renamed from: b */
    public final boolean m22943b(PointF pointF, List list, float f10) {
        int size = list.size() - 1;
        int i10 = 0;
        while (i10 < size) {
            float f11 = ((PointF) list.get(i10)).x;
            float f12 = ((PointF) list.get(i10)).y;
            i10++;
            if (AbstractC10163a.m21211b(f11, f12, ((PointF) list.get(i10)).x, ((PointF) list.get(i10)).y, pointF.x, pointF.y) <= f10) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final void m22944c() {
        this.f25975g.clear();
        InterfaceC9529a interfaceC9529a = this.f25977i;
        if (interfaceC9529a != null) {
            interfaceC9529a.invoke();
        }
        this.f25971c.mo17365c();
    }

    /* renamed from: d */
    public final void m22945d(Canvas canvas) {
        AbstractC9979u.m20294g(canvas, "canvas");
        Bitmap bitmap = this.f25972d;
        if (bitmap == null) {
            canvas.drawColor(-1);
            return;
        }
        this.f25979k.set(this.f25974f);
        this.f25979k.postConcat(this.f25970b);
        C10342e.f24648a.m21630a(canvas, bitmap, this.f25979k);
    }

    /* renamed from: e */
    public final void m22946e(Canvas canvas) {
        AbstractC9979u.m20294g(canvas, "canvas");
        this.f25979k.set(this.f25970b);
        ArrayList arrayList = this.f25975g;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            C10933j c10933j = (C10933j) obj;
            this.f25978j.set(c10933j.m23850b());
            this.f25978j.transform(this.f25979k);
            canvas.drawPath(this.f25978j, c10933j.m23849a());
        }
    }

    /* renamed from: f */
    public final void m22947f(Canvas canvas) {
        AbstractC9979u.m20294g(canvas, "canvas");
        if (this.f25976h.isEmpty()) {
            return;
        }
        canvas.drawPath(this.f25976h, this.f25982n);
    }

    /* renamed from: g */
    public final Bitmap m22948g() {
        return this.f25972d;
    }

    /* renamed from: h */
    public final void m22949h(Matrix matrix) {
        AbstractC9979u.m20294g(matrix, "matrix");
        Object obj = this.f25971c;
        AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type android.view.View");
        Log.i("DrawControl", "before -> " + matrix.toShortString());
        matrix.getValues(this.f25980l);
        float[] fArr = this.f25980l;
        float f10 = fArr[0];
        float f11 = fArr[4];
        float f12 = fArr[2];
        float f13 = fArr[5];
        float fM22964e = this.f25969a.m22964e() > 1.0f ? this.f25969a.m22964e() : 1.0f;
        if (f10 < 1.0f) {
            this.f25980l[0] = 1.0f;
        } else if (f10 > fM22964e) {
            this.f25980l[0] = fM22964e;
        }
        if (f11 < 1.0f) {
            this.f25980l[4] = 1.0f;
        } else if (f10 > fM22964e) {
            this.f25980l[4] = fM22964e;
        }
        if (f12 > 0.0f) {
            this.f25980l[2] = 0.0f;
        } else if (f12 < (-((this.f25973e.width() * f10) - ((View) this.f25971c).getWidth()))) {
            this.f25980l[2] = -((this.f25973e.width() * this.f25980l[0]) - ((View) this.f25971c).getWidth());
        } else if (this.f25973e.width() * f10 == ((View) this.f25971c).getWidth()) {
            this.f25980l[2] = 0.0f;
        } else {
            float f14 = 1;
            this.f25980l[2] = (((f12 / ((this.f25973e.width() * f10) - ((View) this.f25971c).getWidth())) + f14) - f14) * ((this.f25973e.width() * this.f25980l[0]) - ((View) this.f25971c).getWidth());
        }
        if (f13 > 0.0f) {
            this.f25980l[5] = 0.0f;
        } else if (f13 < (-((this.f25973e.height() * f11) - ((View) this.f25971c).getHeight()))) {
            this.f25980l[5] = -((this.f25973e.height() * this.f25980l[4]) - ((View) this.f25971c).getHeight());
        } else if (this.f25973e.height() * f11 == ((View) this.f25971c).getHeight()) {
            this.f25980l[5] = 0.0f;
        } else {
            float f15 = 1;
            this.f25980l[5] = (((f13 / ((this.f25973e.height() * f11) - ((View) this.f25971c).getHeight())) + f15) - f15) * ((this.f25973e.height() * this.f25980l[4]) - ((View) this.f25971c).getHeight());
        }
        matrix.setValues(this.f25980l);
        Log.i("DrawControl", "after -> " + matrix.toShortString());
        this.f25970b.set(matrix);
        this.f25971c.mo17363a();
        this.f25971c.mo17365c();
        this.f25971c.mo17364b();
    }

    /* renamed from: i */
    public final void m22950i(PointF currentPointF) {
        InterfaceC9529a interfaceC9529a;
        AbstractC9979u.m20294g(currentPointF, "currentPointF");
        PointF pointFMapPoint = GraphExtKt.mapPoint(this.f25970b, currentPointF);
        this.f25976h.reset();
        this.f25976h.addCircle(pointFMapPoint.x, pointFMapPoint.y, this.f25969a.m22963d(), Path.Direction.CW);
        m22955n(this.f25982n);
        Iterator it = this.f25975g.iterator();
        AbstractC9979u.m20293f(it, "iterator(...)");
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC9979u.m20293f(next, "next(...)");
            C10933j c10933j = (C10933j) next;
            if (c10933j.m23852d().contains(currentPointF.x, currentPointF.y) && m22943b(currentPointF, c10933j.m23851c(), AbstractC10351n.m21660b(this.f25970b).mapRadius(this.f25969a.m22963d()))) {
                it.remove();
                z10 = true;
            }
        }
        if (z10 && (interfaceC9529a = this.f25977i) != null) {
            interfaceC9529a.invoke();
        }
        this.f25971c.mo17365c();
        this.f25971c.mo17364b();
    }

    /* renamed from: j */
    public final void m22951j(PointF currentPointF) {
        InterfaceC9529a interfaceC9529a;
        AbstractC9979u.m20294g(currentPointF, "currentPointF");
        this.f25976h.reset();
        Iterator it = this.f25975g.iterator();
        AbstractC9979u.m20293f(it, "iterator(...)");
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC9979u.m20293f(next, "next(...)");
            C10933j c10933j = (C10933j) next;
            if (c10933j.m23852d().contains(currentPointF.x, currentPointF.y) && m22943b(currentPointF, c10933j.m23851c(), AbstractC10351n.m21660b(this.f25970b).mapRadius(this.f25969a.m22963d()))) {
                it.remove();
                z10 = true;
            }
        }
        if (z10 && (interfaceC9529a = this.f25977i) != null) {
            interfaceC9529a.invoke();
        }
        this.f25971c.mo17365c();
        this.f25971c.mo17364b();
    }

    /* renamed from: k */
    public final void m22952k(Path path) {
        AbstractC9979u.m20294g(path, "path");
        this.f25978j.set(path);
        this.f25978j.transform(this.f25970b);
        this.f25976h.set(this.f25978j);
        m22956o(this.f25982n);
        this.f25971c.mo17364b();
    }

    /* renamed from: l */
    public final void m22953l() {
        this.f25976h.reset();
        this.f25971c.mo17364b();
    }

    /* renamed from: m */
    public final void m22954m(Path path, List pointFList) {
        AbstractC9979u.m20294g(path, "path");
        AbstractC9979u.m20294g(pointFList, "pointFList");
        this.f25976h.reset();
        m22956o(this.f25981m);
        this.f25975g.add(m22942a(pointFList, this.f25981m, path));
        InterfaceC9529a interfaceC9529a = this.f25977i;
        if (interfaceC9529a != null) {
            interfaceC9529a.invoke();
        }
        this.f25971c.mo17365c();
        this.f25971c.mo17364b();
    }

    /* renamed from: n */
    public final void m22955n(Paint paint) {
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.f25969a.m22962c());
    }

    /* renamed from: o */
    public final void m22956o(Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(this.f25969a.m22965f());
        paint.setStrokeWidth(this.f25969a.m22966g());
        paint.setPathEffect(this.f25969a.m22967h() ? new DashPathEffect(new float[]{30.0f, 15.0f}, 0.0f) : null);
    }

    /* renamed from: p */
    public final void m22957p(Bitmap bitmap) {
        Object objM20054c;
        AbstractC9979u.m20294g(bitmap, "bitmap");
        try {
            Result.C9921a c9921a = Result.f23263d;
            objM20054c = Result.m20054c(Bitmap.createBitmap(bitmap));
        } catch (Throwable th) {
            Result.C9921a c9921a2 = Result.f23263d;
            objM20054c = Result.m20054c(AbstractC9924b.m20070a(th));
        }
        if (Result.m20058g(objM20054c)) {
            objM20054c = null;
        }
        Bitmap bitmap2 = (Bitmap) objM20054c;
        if (bitmap2 != null) {
            this.f25972d = bitmap2;
            Object obj = this.f25971c;
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type android.view.View");
            int width = ((View) obj).getWidth();
            if (width > 0) {
                float f10 = width;
                float width2 = f10 / bitmap2.getWidth();
                this.f25974f.setScale(width2, width2);
                this.f25973e.set(0.0f, 0.0f, f10, bitmap2.getHeight() * width2);
            }
        }
        this.f25971c.mo17363a();
    }

    /* renamed from: q */
    public final void m22958q(InterfaceC9529a interfaceC9529a) {
        this.f25977i = interfaceC9529a;
    }

    /* renamed from: r */
    public final void m22959r(int i10, int i11) {
        if (this.f25972d == null) {
            this.f25973e.set(0.0f, 0.0f, i10, i11);
            return;
        }
        float f10 = i10;
        float width = f10 / r0.getWidth();
        this.f25974f.setScale(width, width);
        this.f25973e.set(0.0f, 0.0f, f10, r0.getHeight() * width);
    }
}
