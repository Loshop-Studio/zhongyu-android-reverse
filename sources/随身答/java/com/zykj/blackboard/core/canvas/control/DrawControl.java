package com.zykj.blackboard.core.canvas.control;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p006a5.AbstractC0037a;
import p023b5.C5112b;
import p023b5.C5120j;
import p023b5.InterfaceC5111a;
import p023b5.InterfaceC5113c;
import p023b5.InterfaceC5114d;
import p023b5.InterfaceC5116f;
import p084d5.InterfaceC7753m;
import p117g5.InterfaceC8054b;
import p117g5.InterfaceC8055c;
import p127h5.C8101d;
import p263u5.AbstractC9695n;
import p263u5.AbstractC9699r;
import p263u5.C9683b;
import p263u5.C9686e;
import p272v4.C9763b;
import p292x4.C9877a;
import p302y4.C9950c;
import p302y4.C9952e;
import p312z4.C9998a;

/* loaded from: classes4.dex */
public final class DrawControl {

    /* renamed from: a */
    public final C9763b f8404a;

    /* renamed from: b */
    public final RectF f8405b;

    /* renamed from: c */
    public C5120j f8406c;

    /* renamed from: d */
    public C9998a f8407d;

    /* renamed from: e */
    public Bitmap f8408e;

    /* renamed from: f */
    public Canvas f8409f;

    /* renamed from: g */
    public Bitmap f8410g;

    /* renamed from: h */
    public Canvas f8411h;

    /* renamed from: i */
    public Bitmap f8412i;

    /* renamed from: j */
    public RectF f8413j;

    /* renamed from: k */
    public final Rect f8414k;

    /* renamed from: l */
    public Bitmap f8415l;

    /* renamed from: m */
    public Canvas f8416m;

    /* renamed from: n */
    public final RectF f8417n;

    /* renamed from: o */
    public final Matrix f8418o;

    /* renamed from: p */
    public final RectF f8419p;

    /* renamed from: q */
    public final Matrix f8420q;

    /* renamed from: r */
    public final Paint f8421r;

    /* renamed from: s */
    public final C6951a f8422s;

    /* renamed from: t */
    public final C9877a f8423t;

    /* renamed from: com.zykj.blackboard.core.canvas.control.DrawControl$a */
    public static final class C6951a implements InterfaceC7753m {
        public C6951a() {
        }

        @Override // p084d5.InterfaceC7753m
        /* renamed from: a */
        public void mo7338a(RectF renderRectF, RectF visibleRectF) {
            Intrinsics.checkNotNullParameter(renderRectF, "renderRectF");
            Intrinsics.checkNotNullParameter(visibleRectF, "visibleRectF");
        }

        @Override // p084d5.InterfaceC7753m
        /* renamed from: b */
        public void mo7339b(Matrix matrix) {
            Intrinsics.checkNotNullParameter(matrix, "matrix");
            DrawControl.this.m7333v();
        }
    }

    public DrawControl(C9763b boardConfig) {
        Intrinsics.checkNotNullParameter(boardConfig, "boardConfig");
        this.f8404a = boardConfig;
        this.f8405b = new RectF();
        this.f8413j = new RectF();
        this.f8414k = new Rect();
        this.f8417n = new RectF();
        this.f8418o = new Matrix();
        this.f8419p = new RectF();
        this.f8420q = new Matrix();
        Paint paint = new Paint();
        paint.setColor(-16776961);
        paint.setStrokeWidth(5.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setDither(true);
        paint.setAntiAlias(true);
        this.f8421r = paint;
        this.f8422s = new C6951a();
        this.f8423t = new C9877a(boardConfig);
    }

    /* renamed from: o */
    public static /* synthetic */ void m7293o(DrawControl drawControl, Matrix matrix, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            matrix = null;
        }
        drawControl.m7326n(matrix);
    }

    /* renamed from: A */
    public final void m7294A(RectF rectF) {
        Bitmap bitmap = this.f8410g;
        if (bitmap != null) {
            bitmap.recycle();
        }
        if (rectF.isEmpty()) {
            return;
        }
        this.f8410g = Bitmap.createBitmap((int) rectF.width(), (int) rectF.height(), Bitmap.Config.ARGB_8888);
        Bitmap bitmap2 = this.f8410g;
        Intrinsics.checkNotNull(bitmap2);
        this.f8411h = new Canvas(bitmap2);
    }

    /* renamed from: B */
    public final void m7295B(InterfaceC8055c interfaceC8055c) {
        Matrix matrix;
        InterfaceC5111a interfaceC5111aM2182a;
        C5120j c5120j = this.f8406c;
        if (c5120j != null && (interfaceC5111aM2182a = c5120j.m2182a()) != null) {
            interfaceC5111aM2182a.clear();
        }
        RectF rectF = this.f8417n;
        rectF.setEmpty();
        Iterator it = interfaceC8055c.mo12796e().iterator();
        while (true) {
            Matrix matrixM17344b = null;
            if (!it.hasNext()) {
                break;
            }
            InterfaceC8055c interfaceC8055c2 = (InterfaceC8055c) it.next();
            C9998a c9998a = this.f8407d;
            if (c9998a != null) {
                matrixM17344b = c9998a.m17344b();
            }
            rectF.union(interfaceC8055c2.mo12799i(matrixM17344b));
        }
        Bitmap bitmap = this.f8415l;
        if (bitmap != null) {
            bitmap.recycle();
        }
        if (this.f8417n.isEmpty()) {
            this.f8415l = null;
            this.f8416m = null;
        } else {
            this.f8415l = Bitmap.createBitmap((int) this.f8417n.width(), (int) this.f8417n.height(), Bitmap.Config.ARGB_8888);
            Bitmap bitmap2 = this.f8415l;
            Intrinsics.checkNotNull(bitmap2);
            this.f8416m = new Canvas(bitmap2);
        }
        Canvas canvas = this.f8416m;
        if (canvas != null) {
            canvas.save();
            RectF rectF2 = this.f8417n;
            canvas.translate(-rectF2.left, -rectF2.top);
            C9998a c9998a2 = this.f8407d;
            if (c9998a2 == null || (matrix = c9998a2.m17344b()) == null) {
                matrix = new Matrix();
            }
            InterfaceC8054b.a.m12807a(interfaceC8055c, canvas, matrix, null, false, true, 12, null);
            canvas.restore();
        }
    }

    /* renamed from: C */
    public final void m7296C(RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, C9952e functionRectF, C9950c functionBackgroundRectF, List typeList, PointF pointF) {
        Intrinsics.checkNotNullParameter(selectRectF, "selectRectF");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(selectFunctionRectF, "selectFunctionRectF");
        Intrinsics.checkNotNullParameter(functionRectF, "functionRectF");
        Intrinsics.checkNotNullParameter(functionBackgroundRectF, "functionBackgroundRectF");
        Intrinsics.checkNotNullParameter(typeList, "typeList");
        Path pathM16887i = this.f8423t.m16887i(selectRectF, typeList, matrix);
        if (!this.f8404a.m16468S()) {
            m7322j();
            Canvas canvas = this.f8411h;
            if (canvas != null) {
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                this.f8423t.m16882d(canvas, m7335x(), pathM16887i, functionRectF, functionBackgroundRectF, typeList, pointF);
            }
            m7293o(this, null, 1, null);
            return;
        }
        RectF rectF = new RectF();
        pathM16887i.computeBounds(rectF, false);
        rectF.left -= 3.0f;
        rectF.top -= 3.0f;
        rectF.right += 3.0f;
        rectF.bottom += 3.0f;
        RectF rectF2 = new RectF();
        rectF2.union(rectF);
        rectF2.union(selectFunctionRectF);
        m7294A(rectF2);
        Canvas canvas2 = this.f8411h;
        if (canvas2 != null) {
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas2.save();
            canvas2.translate(-rectF2.left, -rectF2.top);
            this.f8423t.m16882d(canvas2, m7335x(), pathM16887i, functionRectF, functionBackgroundRectF, typeList, pointF);
            canvas2.restore();
        }
        this.f8420q.setTranslate(rectF2.left, rectF2.top);
        m7326n(this.f8420q);
    }

    /* renamed from: D */
    public final void m7297D(float f10, float f11, float f12, float f13) {
        InterfaceC5111a interfaceC5111aM2182a;
        C5120j c5120j = this.f8406c;
        if (c5120j == null || (interfaceC5111aM2182a = c5120j.m2182a()) == null) {
            return;
        }
        interfaceC5111aM2182a.mo2170b(this.f8423t.m16884f(f10, f11, f12, f13), this.f8423t.m16883e(m7335x()), null);
    }

    /* renamed from: E */
    public final void m7298E(InterfaceC8055c rootGraph, RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, C9952e functionRectF, C9950c functionBackgroundRectF, List typeList, PointF pointF) {
        Intrinsics.checkNotNullParameter(rootGraph, "rootGraph");
        Intrinsics.checkNotNullParameter(selectRectF, "selectRectF");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(selectFunctionRectF, "selectFunctionRectF");
        Intrinsics.checkNotNullParameter(functionRectF, "functionRectF");
        Intrinsics.checkNotNullParameter(functionBackgroundRectF, "functionBackgroundRectF");
        Intrinsics.checkNotNullParameter(typeList, "typeList");
        Canvas canvas = this.f8409f;
        if (canvas != null) {
            AbstractC0037a.m173a(canvas);
            C9998a c9998a = this.f8407d;
            if (c9998a != null) {
                InterfaceC8054b.a.m12807a(rootGraph, canvas, c9998a.m17344b(), null, false, this.f8404a.m16468S(), 8, null);
            }
        }
        m7330s();
        m7296C(selectRectF, matrix, selectFunctionRectF, functionRectF, functionBackgroundRectF, typeList, pointF);
    }

    /* renamed from: F */
    public final void m7299F(InterfaceC8055c rootGraph, final InterfaceC8055c textGraph, RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, C9952e functionRectF, C9950c functionBackgroundRectF, List typeList, PointF pointF) {
        Intrinsics.checkNotNullParameter(rootGraph, "rootGraph");
        Intrinsics.checkNotNullParameter(textGraph, "textGraph");
        Intrinsics.checkNotNullParameter(selectRectF, "selectRectF");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(selectFunctionRectF, "selectFunctionRectF");
        Intrinsics.checkNotNullParameter(functionRectF, "functionRectF");
        Intrinsics.checkNotNullParameter(functionBackgroundRectF, "functionBackgroundRectF");
        Intrinsics.checkNotNullParameter(typeList, "typeList");
        Canvas canvas = this.f8409f;
        if (canvas != null) {
            AbstractC0037a.m173a(canvas);
            C9998a c9998a = this.f8407d;
            if (c9998a != null) {
                InterfaceC8054b.a.m12807a(rootGraph, canvas, c9998a.m17344b(), new Function1<InterfaceC8055c, Boolean>() { // from class: com.zykj.blackboard.core.canvas.control.DrawControl$newTextHandleStart$1$1$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke(InterfaceC8055c childGraph) {
                        Intrinsics.checkNotNullParameter(childGraph, "childGraph");
                        return Boolean.valueOf(Intrinsics.areEqual(childGraph.getId(), textGraph.getId()));
                    }
                }, false, this.f8404a.m16468S(), 8, null);
            }
        }
        m7330s();
        m7300G(textGraph, selectRectF, matrix, selectFunctionRectF, functionRectF, functionBackgroundRectF, typeList, pointF);
    }

    /* renamed from: G */
    public final void m7300G(InterfaceC8055c textGraph, RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, C9952e functionRectF, C9950c functionBackgroundRectF, List typeList, PointF pointF) {
        Matrix matrix2;
        Intrinsics.checkNotNullParameter(textGraph, "textGraph");
        Intrinsics.checkNotNullParameter(selectRectF, "selectRectF");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(selectFunctionRectF, "selectFunctionRectF");
        Intrinsics.checkNotNullParameter(functionRectF, "functionRectF");
        Intrinsics.checkNotNullParameter(functionBackgroundRectF, "functionBackgroundRectF");
        Intrinsics.checkNotNullParameter(typeList, "typeList");
        Path pathM16887i = this.f8423t.m16887i(selectRectF, typeList, matrix);
        if (!this.f8404a.m16468S()) {
            m7322j();
            Canvas canvas = this.f8411h;
            if (canvas != null) {
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                C9998a c9998a = this.f8407d;
                if (c9998a != null) {
                    InterfaceC8054b.a.m12807a(textGraph, canvas, c9998a.m17344b(), null, false, false, 28, null);
                }
                this.f8423t.m16882d(canvas, m7335x(), pathM16887i, functionRectF, functionBackgroundRectF, typeList, pointF);
            }
            m7293o(this, null, 1, null);
            return;
        }
        RectF rectF = new RectF();
        pathM16887i.computeBounds(rectF, false);
        rectF.left -= 3.0f;
        rectF.top -= 3.0f;
        rectF.right += 3.0f;
        rectF.bottom += 3.0f;
        RectF rectF2 = new RectF();
        rectF2.union(rectF);
        rectF2.union(selectFunctionRectF);
        m7294A(rectF2);
        Canvas canvas2 = this.f8411h;
        if (canvas2 != null) {
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas2.save();
            canvas2.translate(-rectF2.left, -rectF2.top);
            C9998a c9998a2 = this.f8407d;
            if (c9998a2 == null || (matrix2 = c9998a2.m17344b()) == null) {
                matrix2 = new Matrix();
            }
            InterfaceC8054b.a.m12807a(textGraph, canvas2, matrix2, null, false, true, 12, null);
            rectF2 = rectF2;
            this.f8423t.m16882d(canvas2, m7335x(), pathM16887i, functionRectF, functionBackgroundRectF, typeList, pointF);
            canvas2.restore();
        }
        this.f8420q.setTranslate(rectF2.left, rectF2.top);
        m7326n(this.f8420q);
    }

    /* renamed from: H */
    public final void m7301H() {
        InterfaceC5111a interfaceC5111aM2182a;
        C5120j c5120j = this.f8406c;
        if (c5120j != null && (interfaceC5111aM2182a = c5120j.m2182a()) != null) {
            interfaceC5111aM2182a.clear();
        }
        this.f8409f = null;
        this.f8411h = null;
        C9683b.f17119a.m16159a(new Bitmap[]{this.f8408e, this.f8410g, this.f8412i, this.f8415l}, new Function0<Unit>() { // from class: com.zykj.blackboard.core.canvas.control.DrawControl$release$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f8426a.f8408e = null;
                this.f8426a.f8410g = null;
                this.f8426a.f8412i = null;
                this.f8426a.f8415l = null;
            }
        });
        C9998a c9998a = this.f8407d;
        if (c9998a != null) {
            c9998a.m17355m(this.f8422s);
        }
    }

    /* renamed from: I */
    public final void m7302I(RectF rectF, List graphList) {
        Matrix matrix;
        Intrinsics.checkNotNullParameter(rectF, "rectF");
        Intrinsics.checkNotNullParameter(graphList, "graphList");
        Rect rect = new Rect();
        rect.left = ((int) rectF.left) + 1;
        rect.top = ((int) rectF.top) + 1;
        rect.right = (int) rectF.right;
        rect.bottom = (int) rectF.bottom;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.translate(-rect.left, -rect.top);
        Iterator it = graphList.iterator();
        while (it.hasNext()) {
            InterfaceC8055c interfaceC8055c = (InterfaceC8055c) it.next();
            C9998a c9998a = this.f8407d;
            if (c9998a == null || (matrix = c9998a.m17344b()) == null) {
                matrix = new Matrix();
            }
            InterfaceC8054b.a.m12807a(interfaceC8055c, canvas, matrix, null, false, this.f8404a.m16468S(), 4, null);
        }
        Canvas canvas2 = this.f8409f;
        if (canvas2 != null) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            Unit unit = Unit.INSTANCE;
            canvas2.drawRect(rect, paint);
            canvas2.drawBitmap(bitmapCreateBitmap, new Rect(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight()), rect, (Paint) null);
        }
        m7330s();
    }

    /* renamed from: J */
    public final void m7303J() {
        C5120j c5120j = this.f8406c;
        if (c5120j != null) {
            c5120j.m2187f();
        }
    }

    /* renamed from: K */
    public final Bitmap m7304K(InterfaceC8055c graph) {
        Matrix matrixM17344b;
        InterfaceC5114d interfaceC5114dM2184c;
        Intrinsics.checkNotNullParameter(graph, "graph");
        C5120j c5120j = this.f8406c;
        RectF rectF = new RectF((c5120j == null || (interfaceC5114dM2184c = c5120j.m2184c()) == null) ? null : interfaceC5114dM2184c.mo2175b());
        RectF rectF2 = new RectF();
        if (this.f8404a.m16519z().m16528g()) {
            rectF2.set(0.0f, 0.0f, rectF.width() * this.f8404a.m16519z().m16524c(), rectF.height() * this.f8404a.m16519z().m16523b());
            Matrix matrix = new Matrix();
            C9998a c9998a = this.f8407d;
            if (c9998a != null) {
                matrix.postConcat(AbstractC9695n.m16200b(c9998a.m17347e()));
                matrix.postConcat(c9998a.m17344b());
            }
            matrix.mapRect(rectF2);
        } else {
            rectF2.setEmpty();
        }
        if (!rectF2.isEmpty()) {
            rectF.intersect(rectF2);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) rectF.width()) + 1, ((int) rectF.height()) + 1, Bitmap.Config.ARGB_8888);
        this.f8412i = bitmapCreateBitmap;
        if (bitmapCreateBitmap != null) {
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            C9998a c9998a2 = this.f8407d;
            if (c9998a2 != null && (matrixM17344b = c9998a2.m17344b()) != null) {
                m7327p(canvas, matrixM17344b);
                InterfaceC8054b.a.m12807a(graph, canvas, matrixM17344b, null, false, false, 4, null);
            }
        }
        return this.f8412i;
    }

    /* renamed from: L */
    public final void m7305L(Path path, Paint paint) {
        Intrinsics.checkNotNullParameter(path, "path");
        if (!this.f8404a.m16468S()) {
            m7322j();
            Canvas canvas = this.f8411h;
            if (canvas != null) {
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                if (paint == null) {
                    paint = this.f8421r;
                }
                canvas.drawPath(path, paint);
            }
            m7293o(this, null, 1, null);
            return;
        }
        if (paint == null) {
            paint = this.f8421r;
        }
        RectF rectF = new RectF();
        path.computeBounds(rectF, false);
        rectF.left -= paint.getStrokeWidth();
        rectF.top -= paint.getStrokeWidth();
        rectF.right += paint.getStrokeWidth();
        rectF.bottom += paint.getStrokeWidth();
        m7294A(rectF);
        Canvas canvas2 = this.f8411h;
        if (canvas2 != null) {
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas2.save();
            canvas2.translate(-rectF.left, -rectF.top);
            canvas2.drawPath(path, paint);
            canvas2.restore();
        }
        this.f8420q.setTranslate(rectF.left, rectF.top);
        m7326n(this.f8420q);
    }

    /* renamed from: M */
    public final void m7306M() {
        InterfaceC5111a interfaceC5111aM2182a;
        if (this.f8404a.m16468S()) {
            m7323k();
        }
        C5120j c5120j = this.f8406c;
        if (c5120j == null || (interfaceC5111aM2182a = c5120j.m2182a()) == null) {
            return;
        }
        interfaceC5111aM2182a.clear();
    }

    /* renamed from: N */
    public final void m7307N(int i9) {
        InterfaceC5113c interfaceC5113cM2183b;
        InterfaceC5113c interfaceC5113cM2183b2;
        C5120j c5120j = this.f8406c;
        if (c5120j != null && (interfaceC5113cM2183b2 = c5120j.m2183b()) != null) {
            interfaceC5113cM2183b2.setMyBackgroundColor(i9);
        }
        C5120j c5120j2 = this.f8406c;
        if (c5120j2 == null || (interfaceC5113cM2183b = c5120j2.m2183b()) == null) {
            return;
        }
        interfaceC5113cM2183b.refresh();
    }

    /* renamed from: O */
    public final void m7308O(BackgroundLineConfig backgroundLineConfig) {
        InterfaceC5113c interfaceC5113cM2183b;
        InterfaceC5113c interfaceC5113cM2183b2;
        Intrinsics.checkNotNullParameter(backgroundLineConfig, "backgroundLineConfig");
        C5120j c5120j = this.f8406c;
        if (c5120j != null && (interfaceC5113cM2183b2 = c5120j.m2183b()) != null) {
            interfaceC5113cM2183b2.setBackgroundLineConfig(backgroundLineConfig);
        }
        C5120j c5120j2 = this.f8406c;
        if (c5120j2 == null || (interfaceC5113cM2183b = c5120j2.m2183b()) == null) {
            return;
        }
        interfaceC5113cM2183b.refresh();
    }

    /* renamed from: P */
    public final void m7309P(C9998a matrixAdapter) {
        Intrinsics.checkNotNullParameter(matrixAdapter, "matrixAdapter");
        this.f8407d = matrixAdapter;
        matrixAdapter.m17350h(this.f8422s);
    }

    /* renamed from: Q */
    public final void m7310Q(C5120j renderLayer) {
        Intrinsics.checkNotNullParameter(renderLayer, "renderLayer");
        this.f8406c = renderLayer;
        this.f8414k.set(renderLayer.m2186e());
        if (!this.f8414k.isEmpty()) {
            this.f8408e = Bitmap.createBitmap(this.f8414k.width(), this.f8414k.height(), Bitmap.Config.ARGB_8888);
            Bitmap bitmap = this.f8408e;
            Intrinsics.checkNotNull(bitmap);
            this.f8409f = new Canvas(bitmap);
        }
        m7333v();
    }

    /* renamed from: R */
    public final void m7311R(C8101d graph, Path path, Paint paint) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        Paint paint2 = paint == null ? this.f8421r : paint;
        RectF rectF = new RectF();
        if (path != null) {
            path.computeBounds(rectF, false);
            rectF.left -= paint2.getStrokeWidth();
            rectF.top -= paint2.getStrokeWidth();
            rectF.right += paint2.getStrokeWidth();
            rectF.bottom += paint2.getStrokeWidth();
        } else {
            C9998a c9998a = this.f8407d;
            rectF.set(graph.mo12799i(c9998a != null ? c9998a.m17344b() : null));
        }
        m7294A(rectF);
        Canvas canvas = this.f8411h;
        if (canvas != null) {
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas.save();
            canvas.translate(-rectF.left, -rectF.top);
            C9998a c9998a2 = this.f8407d;
            if (c9998a2 != null) {
                InterfaceC8054b.a.m12807a(graph, canvas, c9998a2.m17344b(), null, false, this.f8404a.m16468S(), 4, null);
            }
            if (path != null) {
                if (paint == null) {
                    paint = this.f8421r;
                }
                canvas.drawPath(path, paint);
            }
            canvas.restore();
        }
        this.f8418o.setTranslate(rectF.left, rectF.top);
        m7326n(this.f8418o);
    }

    /* renamed from: S */
    public final void m7312S(InterfaceC8055c rootGraph, Path path, Paint paint) {
        InterfaceC5111a interfaceC5111aM2182a;
        Intrinsics.checkNotNullParameter(rootGraph, "rootGraph");
        Canvas canvas = this.f8409f;
        if (canvas != null) {
            AbstractC0037a.m173a(canvas);
            C9998a c9998a = this.f8407d;
            if (c9998a != null) {
                InterfaceC8054b.a.m12807a(rootGraph, canvas, c9998a.m17344b(), null, false, this.f8404a.m16468S(), 4, null);
            }
        }
        m7330s();
        if (path == null) {
            m7323k();
            C5120j c5120j = this.f8406c;
            if (c5120j == null || (interfaceC5111aM2182a = c5120j.m2182a()) == null) {
                return;
            }
            interfaceC5111aM2182a.clear();
            return;
        }
        if (paint == null) {
            paint = this.f8421r;
        }
        RectF rectF = new RectF();
        path.computeBounds(rectF, false);
        rectF.left -= paint.getStrokeWidth();
        rectF.top -= paint.getStrokeWidth();
        rectF.right += paint.getStrokeWidth();
        rectF.bottom += paint.getStrokeWidth();
        m7294A(rectF);
        Canvas canvas2 = this.f8411h;
        if (canvas2 != null) {
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas2.save();
            canvas2.translate(-rectF.left, -rectF.top);
            canvas2.drawPath(path, paint);
            canvas2.restore();
        }
        Matrix matrix = this.f8420q;
        matrix.setTranslate(rectF.left, rectF.top);
        m7326n(matrix);
    }

    /* renamed from: T */
    public final void m7313T(InterfaceC8055c rootGraph, final C8101d graph, Path path, Paint paint) {
        Intrinsics.checkNotNullParameter(rootGraph, "rootGraph");
        Intrinsics.checkNotNullParameter(graph, "graph");
        Canvas canvas = this.f8409f;
        if (canvas != null) {
            AbstractC0037a.m173a(canvas);
            C9998a c9998a = this.f8407d;
            if (c9998a != null) {
                InterfaceC8054b.a.m12807a(rootGraph, canvas, c9998a.m17344b(), new Function1<InterfaceC8055c, Boolean>() { // from class: com.zykj.blackboard.core.canvas.control.DrawControl$textHandleStart$1$1$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke(InterfaceC8055c childGraph) {
                        Intrinsics.checkNotNullParameter(childGraph, "childGraph");
                        return Boolean.valueOf(Intrinsics.areEqual(childGraph.getId(), graph.getId()));
                    }
                }, false, false, 24, null);
            }
        }
        m7330s();
        Paint paint2 = paint == null ? this.f8421r : paint;
        RectF rectF = new RectF();
        if (path != null) {
            path.computeBounds(rectF, false);
            rectF.left -= paint2.getStrokeWidth();
            rectF.top -= paint2.getStrokeWidth();
            rectF.right += paint2.getStrokeWidth();
            rectF.bottom += paint2.getStrokeWidth();
        } else {
            C9998a c9998a2 = this.f8407d;
            graph.mo12799i(c9998a2 != null ? c9998a2.m17344b() : null);
        }
        m7294A(rectF);
        Canvas canvas2 = this.f8411h;
        if (canvas2 != null) {
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas2.save();
            canvas2.translate(-rectF.left, -rectF.top);
            C9998a c9998a3 = this.f8407d;
            if (c9998a3 != null) {
                InterfaceC8054b.a.m12807a(graph, canvas2, c9998a3.m17344b(), null, false, this.f8404a.m16468S(), 4, null);
            }
            if (path != null) {
                if (paint == null) {
                    paint = this.f8421r;
                }
                canvas2.drawPath(path, paint);
            }
            canvas2.restore();
        }
        this.f8418o.setTranslate(rectF.left, rectF.top);
        m7326n(this.f8418o);
    }

    /* renamed from: U */
    public final void m7314U(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        if (!this.f8404a.m16468S()) {
            m7326n(matrix);
            return;
        }
        Matrix matrix2 = new Matrix();
        matrix2.set(this.f8418o);
        matrix2.postConcat(matrix);
        m7326n(matrix2);
    }

    /* renamed from: V */
    public final void m7315V(InterfaceC8055c rootGraph, Path path, Paint paint) {
        InterfaceC5111a interfaceC5111aM2182a;
        Intrinsics.checkNotNullParameter(rootGraph, "rootGraph");
        Canvas canvas = this.f8409f;
        if (canvas != null) {
            AbstractC0037a.m173a(canvas);
            C9998a c9998a = this.f8407d;
            if (c9998a != null) {
                InterfaceC8054b.a.m12807a(rootGraph, canvas, c9998a.m17344b(), null, false, this.f8404a.m16468S(), 12, null);
            }
        }
        m7330s();
        if (!this.f8404a.m16468S()) {
            m7322j();
            Canvas canvas2 = this.f8411h;
            if (canvas2 != null) {
                canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                if (path != null) {
                    if (paint == null) {
                        paint = this.f8421r;
                    }
                    canvas2.drawPath(path, paint);
                }
            }
            m7293o(this, null, 1, null);
            return;
        }
        if (path == null) {
            m7323k();
            C5120j c5120j = this.f8406c;
            if (c5120j == null || (interfaceC5111aM2182a = c5120j.m2182a()) == null) {
                return;
            }
            interfaceC5111aM2182a.clear();
            return;
        }
        if (paint == null) {
            paint = this.f8421r;
        }
        RectF rectF = new RectF();
        path.computeBounds(rectF, false);
        rectF.left -= paint.getStrokeWidth();
        rectF.top -= paint.getStrokeWidth();
        rectF.right += paint.getStrokeWidth();
        rectF.bottom += paint.getStrokeWidth();
        m7294A(rectF);
        Canvas canvas3 = this.f8411h;
        if (canvas3 != null) {
            canvas3.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas3.save();
            canvas3.translate(-rectF.left, -rectF.top);
            canvas3.drawPath(path, paint);
            canvas3.restore();
        }
        Matrix matrix = this.f8420q;
        matrix.setTranslate(rectF.left, rectF.top);
        m7326n(matrix);
    }

    /* renamed from: W */
    public final void m7316W(InterfaceC8055c rootGraph, final List graphList, Path path, Paint paint) {
        Intrinsics.checkNotNullParameter(rootGraph, "rootGraph");
        Intrinsics.checkNotNullParameter(graphList, "graphList");
        Canvas canvas = this.f8409f;
        if (canvas != null) {
            AbstractC0037a.m173a(canvas);
            C9998a c9998a = this.f8407d;
            if (c9998a != null) {
                InterfaceC8054b.a.m12807a(rootGraph, canvas, c9998a.m17344b(), new Function1<InterfaceC8055c, Boolean>() { // from class: com.zykj.blackboard.core.canvas.control.DrawControl$transGraphStart$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke(InterfaceC8055c childGraph) {
                        Intrinsics.checkNotNullParameter(childGraph, "childGraph");
                        List list = graphList;
                        boolean z9 = false;
                        if (list == null || !list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                if (Intrinsics.areEqual(childGraph.getId(), ((InterfaceC8055c) it.next()).getId())) {
                                    z9 = true;
                                    break;
                                }
                            }
                        }
                        return Boolean.valueOf(z9);
                    }
                }, false, this.f8404a.m16468S(), 8, null);
            }
        }
        m7330s();
        if (!this.f8404a.m16468S()) {
            m7322j();
            Canvas canvas2 = this.f8411h;
            if (canvas2 != null) {
                canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                Iterator it = graphList.iterator();
                while (it.hasNext()) {
                    InterfaceC8055c interfaceC8055c = (InterfaceC8055c) it.next();
                    C9998a c9998a2 = this.f8407d;
                    if (c9998a2 != null) {
                        InterfaceC8054b.a.m12807a(interfaceC8055c, canvas2, c9998a2.m17344b(), null, false, false, 28, null);
                    }
                }
                if (path != null) {
                    canvas2.drawPath(path, paint == null ? this.f8421r : paint);
                }
            }
            m7293o(this, null, 1, null);
            return;
        }
        Paint paint2 = paint == null ? this.f8421r : paint;
        RectF rectF = new RectF();
        if (path != null) {
            path.computeBounds(rectF, false);
            rectF.left -= paint2.getStrokeWidth();
            rectF.top -= paint2.getStrokeWidth();
            rectF.right += paint2.getStrokeWidth();
            rectF.bottom += paint2.getStrokeWidth();
        } else {
            Iterator it2 = graphList.iterator();
            while (it2.hasNext()) {
                InterfaceC8055c interfaceC8055c2 = (InterfaceC8055c) it2.next();
                C9998a c9998a3 = this.f8407d;
                rectF.union(interfaceC8055c2.mo12799i(c9998a3 != null ? c9998a3.m17344b() : null));
            }
        }
        m7294A(rectF);
        Canvas canvas3 = this.f8411h;
        if (canvas3 != null) {
            canvas3.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas3.save();
            canvas3.translate(-rectF.left, -rectF.top);
            Iterator it3 = graphList.iterator();
            while (it3.hasNext()) {
                InterfaceC8055c interfaceC8055c3 = (InterfaceC8055c) it3.next();
                C9998a c9998a4 = this.f8407d;
                if (c9998a4 != null) {
                    InterfaceC8054b.a.m12807a(interfaceC8055c3, canvas3, c9998a4.m17344b(), null, false, true, 12, null);
                }
            }
            if (path != null) {
                canvas3.drawPath(path, paint == null ? this.f8421r : paint);
            }
            canvas3.restore();
        }
        this.f8418o.setTranslate(rectF.left, rectF.top);
        m7326n(this.f8418o);
    }

    /* renamed from: X */
    public final void m7317X(Matrix matrix) {
        InterfaceC5113c interfaceC5113cM2183b;
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        C5120j c5120j = this.f8406c;
        if (c5120j == null || (interfaceC5113cM2183b = c5120j.m2183b()) == null) {
            return;
        }
        interfaceC5113cM2183b.setMatrix(matrix);
    }

    /* renamed from: f */
    public final void m7318f(InterfaceC8055c graph) {
        InterfaceC5111a interfaceC5111aM2182a;
        C9998a c9998a;
        Intrinsics.checkNotNullParameter(graph, "graph");
        Canvas canvas = this.f8409f;
        if (canvas != null && (c9998a = this.f8407d) != null) {
            graph.mo7861l(canvas, c9998a.m17344b());
        }
        Log.i("DrawView", "开始绘制");
        m7330s();
        C5120j c5120j = this.f8406c;
        if (c5120j == null || (interfaceC5111aM2182a = c5120j.m2182a()) == null) {
            return;
        }
        interfaceC5111aM2182a.clear();
    }

    /* renamed from: g */
    public final void m7319g(InterfaceC8055c rootGraph) {
        Matrix matrixM17344b;
        InterfaceC5111a interfaceC5111aM2182a;
        Intrinsics.checkNotNullParameter(rootGraph, "rootGraph");
        Canvas canvas = this.f8409f;
        if (canvas != null) {
            AbstractC0037a.m173a(canvas);
            C9998a c9998a = this.f8407d;
            if (c9998a != null) {
                InterfaceC8054b.a.m12807a(rootGraph, canvas, c9998a.m17344b(), null, false, this.f8404a.m16468S(), 12, null);
            }
        }
        m7330s();
        if (this.f8404a.m16468S()) {
            m7323k();
            C5120j c5120j = this.f8406c;
            if (c5120j != null && (interfaceC5111aM2182a = c5120j.m2182a()) != null) {
                interfaceC5111aM2182a.clear();
            }
        } else {
            m7322j();
            Canvas canvas2 = this.f8411h;
            if (canvas2 != null) {
                canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            }
            m7293o(this, null, 1, null);
        }
        C9998a c9998a2 = this.f8407d;
        if (c9998a2 == null || (matrixM17344b = c9998a2.m17344b()) == null) {
            return;
        }
        m7317X(matrixM17344b);
    }

    /* renamed from: h */
    public final void m7320h(InterfaceC8055c rootGraph) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(rootGraph, "rootGraph");
        if (this.f8404a.m16468S()) {
            m7295B(rootGraph);
            Matrix matrix = this.f8418o;
            RectF rectF = this.f8417n;
            matrix.setTranslate(rectF.left, rectF.top);
            Bitmap bitmap2 = this.f8415l;
            if (bitmap2 != null) {
                if (this.f8417n.contains(new RectF(this.f8414k))) {
                    RectF rectF2 = this.f8417n;
                    m7329r(bitmap2, rectF2.left, rectF2.top);
                } else {
                    m7328q(bitmap2, this.f8418o);
                }
            }
        } else {
            m7322j();
            Canvas canvas = this.f8411h;
            if (canvas != null && (bitmap = this.f8408e) != null) {
                C9686e.f17123a.m16168a(canvas, bitmap, new Matrix());
            }
            m7293o(this, null, 1, null);
        }
        Canvas canvas2 = this.f8409f;
        if (canvas2 != null) {
            AbstractC0037a.m173a(canvas2);
        }
        m7330s();
    }

    /* renamed from: i */
    public final void m7321i(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        if (this.f8404a.m16468S()) {
            Matrix matrix2 = this.f8420q;
            matrix2.set(this.f8418o);
            matrix2.postConcat(matrix);
            float[] fArr = {0.0f, 0.0f};
            this.f8420q.mapPoints(fArr);
            Log.i("cameraChanging", fArr[0] + "  " + fArr[1]);
            Bitmap bitmap = this.f8415l;
            if (bitmap != null) {
                if (this.f8417n.contains(new RectF(this.f8414k))) {
                    m7329r(bitmap, fArr[0], fArr[1]);
                } else {
                    m7328q(bitmap, this.f8420q);
                }
            }
        } else {
            m7326n(matrix);
        }
        Matrix matrix3 = new Matrix();
        C9998a c9998a = this.f8407d;
        if (c9998a != null) {
            matrix3.postConcat(c9998a.m17346d());
            matrix3.postConcat(matrix);
            matrix3.postConcat(c9998a.m17347e());
        }
        m7317X(matrix3);
    }

    /* renamed from: j */
    public final void m7322j() {
        Bitmap bitmap = this.f8410g;
        if (bitmap != null) {
            Intrinsics.checkNotNull(bitmap);
            if (!bitmap.isRecycled()) {
                Bitmap bitmap2 = this.f8410g;
                Intrinsics.checkNotNull(bitmap2);
                if (bitmap2.getWidth() == this.f8414k.width()) {
                    Bitmap bitmap3 = this.f8410g;
                    Intrinsics.checkNotNull(bitmap3);
                    if (bitmap3.getHeight() == this.f8414k.height()) {
                        return;
                    }
                }
            }
        }
        m7294A(new RectF(this.f8414k));
    }

    /* renamed from: k */
    public final void m7323k() {
        Bitmap bitmap = this.f8410g;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f8410g = null;
        this.f8411h = null;
    }

    /* renamed from: l */
    public final Bitmap m7324l(InterfaceC8055c graph) {
        Matrix matrixM17347e;
        InterfaceC5114d interfaceC5114dM2184c;
        Intrinsics.checkNotNullParameter(graph, "graph");
        RectF rectF = new RectF();
        Iterator it = graph.mo12796e().iterator();
        while (true) {
            Matrix matrixM17347e2 = null;
            if (!it.hasNext()) {
                break;
            }
            InterfaceC8055c interfaceC8055c = (InterfaceC8055c) it.next();
            C9998a c9998a = this.f8407d;
            if (c9998a != null) {
                matrixM17347e2 = c9998a.m17347e();
            }
            rectF.union(interfaceC8055c.mo12799i(matrixM17347e2));
        }
        C5120j c5120j = this.f8406c;
        RectF rectF2 = new RectF((c5120j == null || (interfaceC5114dM2184c = c5120j.m2184c()) == null) ? null : interfaceC5114dM2184c.mo2175b());
        RectF rectF3 = new RectF();
        if (this.f8404a.m16519z().m16528g()) {
            rectF3.set(0.0f, 0.0f, rectF2.width() * this.f8404a.m16519z().m16524c(), rectF2.height() * this.f8404a.m16519z().m16523b());
        } else {
            rectF3.set(rectF2);
        }
        float fMin = Math.min(rectF3.bottom, rectF.bottom);
        rectF3.bottom = fMin;
        rectF3.bottom = Math.max(fMin, rectF2.bottom);
        if (rectF3.isEmpty()) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) rectF3.width(), (int) rectF3.height(), Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        C9998a c9998a2 = this.f8407d;
        if (c9998a2 != null && (matrixM17347e = c9998a2.m17347e()) != null) {
            m7327p(canvas, matrixM17347e);
            graph.mo7863p(canvas, matrixM17347e, null, false, true);
        }
        return bitmapCreateBitmap;
    }

    /* renamed from: m */
    public final void m7325m(InterfaceC8055c rootGraph) {
        Matrix matrix;
        Intrinsics.checkNotNullParameter(rootGraph, "rootGraph");
        Canvas canvas = this.f8409f;
        if (canvas != null) {
            AbstractC0037a.m173a(canvas);
            C9998a c9998a = this.f8407d;
            if (c9998a == null || (matrix = c9998a.m17344b()) == null) {
                matrix = new Matrix();
            }
            InterfaceC8054b.a.m12807a(rootGraph, canvas, matrix, null, false, this.f8404a.m16468S(), 12, null);
        }
        m7330s();
    }

    /* renamed from: n */
    public final void m7326n(Matrix matrix) {
        C5120j c5120j;
        InterfaceC5111a interfaceC5111aM2182a;
        Bitmap bitmap = this.f8410g;
        if (bitmap == null || (c5120j = this.f8406c) == null || (interfaceC5111aM2182a = c5120j.m2182a()) == null) {
            return;
        }
        interfaceC5111aM2182a.mo2169a(bitmap, matrix);
    }

    /* renamed from: p */
    public final void m7327p(Canvas canvas, Matrix matrix) {
        InterfaceC5113c interfaceC5113cM2183b;
        C5120j c5120j = this.f8406c;
        if (c5120j == null || (interfaceC5113cM2183b = c5120j.m2183b()) == null) {
            return;
        }
        interfaceC5113cM2183b.mo2173a(canvas, matrix);
    }

    /* renamed from: q */
    public final void m7328q(Bitmap bitmap, Matrix matrix) {
        C5120j c5120j = this.f8406c;
        InterfaceC5111a interfaceC5111aM2182a = c5120j != null ? c5120j.m2182a() : null;
        if (interfaceC5111aM2182a instanceof C5112b) {
            ((C5112b) interfaceC5111aM2182a).m2171c(bitmap, matrix);
        } else if (interfaceC5111aM2182a != null) {
            interfaceC5111aM2182a.mo2169a(bitmap, matrix);
        }
    }

    /* renamed from: r */
    public final void m7329r(Bitmap bitmap, float f10, float f11) {
        InterfaceC5111a interfaceC5111aM2182a;
        int i9 = (int) f10;
        int i10 = -i9;
        int i11 = (int) f11;
        int i12 = -i11;
        int iMin = Math.min(bitmap.getWidth() + i9, this.f8414k.width());
        int iMin2 = Math.min(bitmap.getHeight() + i11, this.f8414k.height());
        if (i10 < 0 || i12 < 0 || i10 > bitmap.getWidth() || i12 > bitmap.getHeight() || iMin <= 0 || iMin2 <= 0) {
            C5120j c5120j = this.f8406c;
            if (c5120j == null || (interfaceC5111aM2182a = c5120j.m2182a()) == null) {
                return;
            }
            interfaceC5111aM2182a.clear();
            return;
        }
        Rect rect = new Rect(i10, i12, i10 + iMin, i12 + iMin2);
        C5120j c5120j2 = this.f8406c;
        InterfaceC5111a interfaceC5111aM2182a2 = c5120j2 != null ? c5120j2.m2182a() : null;
        if (interfaceC5111aM2182a2 instanceof C5112b) {
            ((C5112b) interfaceC5111aM2182a2).m2172d(bitmap, rect);
        } else if (interfaceC5111aM2182a2 != null) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, iMin, iMin2);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(bitmap, sou…eRect.top, width, height)");
            interfaceC5111aM2182a2.mo2169a(bitmapCreateBitmap, null);
        }
    }

    /* renamed from: s */
    public final void m7330s() {
        C5120j c5120j;
        InterfaceC5114d interfaceC5114dM2184c;
        Bitmap bitmap = this.f8408e;
        if (bitmap == null || (c5120j = this.f8406c) == null || (interfaceC5114dM2184c = c5120j.m2184c()) == null) {
            return;
        }
        interfaceC5114dM2184c.mo2174a(bitmap);
    }

    /* renamed from: t */
    public final void m7331t(List graphList) {
        Matrix matrix;
        Intrinsics.checkNotNullParameter(graphList, "graphList");
        Canvas canvas = this.f8411h;
        if (canvas != null) {
            Iterator it = graphList.iterator();
            while (it.hasNext()) {
                InterfaceC8055c interfaceC8055c = (InterfaceC8055c) it.next();
                C9998a c9998a = this.f8407d;
                if (c9998a == null || (matrix = c9998a.m17344b()) == null) {
                    matrix = new Matrix();
                }
                InterfaceC8054b.a.m12807a(interfaceC8055c, canvas, matrix, null, false, this.f8404a.m16468S(), 12, null);
            }
        }
        m7293o(this, null, 1, null);
    }

    /* renamed from: u */
    public final void m7332u(List graphList) {
        Matrix matrix;
        Intrinsics.checkNotNullParameter(graphList, "graphList");
        Canvas canvas = this.f8409f;
        if (canvas != null) {
            AbstractC0037a.m173a(canvas);
            Iterator it = graphList.iterator();
            while (it.hasNext()) {
                InterfaceC8055c interfaceC8055c = (InterfaceC8055c) it.next();
                C9998a c9998a = this.f8407d;
                if (c9998a == null || (matrix = c9998a.m17344b()) == null) {
                    matrix = new Matrix();
                }
                InterfaceC8054b.a.m12807a(interfaceC8055c, canvas, matrix, null, false, this.f8404a.m16468S(), 12, null);
            }
        }
        m7330s();
    }

    /* renamed from: v */
    public final void m7333v() {
        InterfaceC5116f interfaceC5116fM2185d;
        InterfaceC5116f interfaceC5116fM2185d2;
        InterfaceC5116f interfaceC5116fM2185d3;
        float fIntValue;
        float fIntValue2;
        Rect rectM2186e;
        Rect rectM2186e2;
        if (this.f8404a.m16519z().m16528g()) {
            if (this.f8405b.isEmpty()) {
                C5120j c5120j = this.f8406c;
                Integer numValueOf = null;
                Integer numValueOf2 = (c5120j == null || (rectM2186e2 = c5120j.m2186e()) == null) ? null : Integer.valueOf(rectM2186e2.width());
                Intrinsics.checkNotNull(numValueOf2);
                fIntValue = numValueOf2.intValue();
                C5120j c5120j2 = this.f8406c;
                if (c5120j2 != null && (rectM2186e = c5120j2.m2186e()) != null) {
                    numValueOf = Integer.valueOf(rectM2186e.height());
                }
                Intrinsics.checkNotNull(numValueOf);
                fIntValue2 = numValueOf.intValue();
            } else {
                fIntValue = this.f8405b.width();
                fIntValue2 = this.f8405b.height();
            }
            this.f8413j.set(0.0f, 0.0f, fIntValue * this.f8404a.m16519z().m16524c(), fIntValue2 * this.f8404a.m16519z().m16523b());
        } else {
            this.f8413j.setEmpty();
        }
        if (this.f8413j.isEmpty()) {
            C5120j c5120j3 = this.f8406c;
            if (c5120j3 == null || (interfaceC5116fM2185d3 = c5120j3.m2185d()) == null) {
                return;
            }
            interfaceC5116fM2185d3.hide();
            return;
        }
        this.f8419p.set(this.f8413j);
        Matrix matrix = this.f8420q;
        matrix.reset();
        C9998a c9998a = this.f8407d;
        if (c9998a != null) {
            if (this.f8405b.isEmpty()) {
                matrix.postConcat(AbstractC9695n.m16200b(c9998a.m17347e()));
                matrix.postConcat(c9998a.m17344b());
            } else {
                matrix.postConcat(c9998a.m17344b());
            }
        }
        this.f8420q.mapRect(this.f8419p);
        if (!this.f8419p.intersect(AbstractC9699r.m16212a(this.f8414k))) {
            C5120j c5120j4 = this.f8406c;
            if (c5120j4 == null || (interfaceC5116fM2185d2 = c5120j4.m2185d()) == null) {
                return;
            }
            interfaceC5116fM2185d2.hide();
            return;
        }
        C5120j c5120j5 = this.f8406c;
        if (c5120j5 == null || (interfaceC5116fM2185d = c5120j5.m2185d()) == null) {
            return;
        }
        interfaceC5116fM2185d.show();
        interfaceC5116fM2185d.mo2177a(this.f8419p);
        interfaceC5116fM2185d.refresh();
    }

    /* renamed from: w */
    public final void m7334w(Path path, Paint paint, Matrix matrix) {
        InterfaceC5111a interfaceC5111aM2182a;
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
        C5120j c5120j = this.f8406c;
        if (c5120j == null || (interfaceC5111aM2182a = c5120j.m2182a()) == null) {
            return;
        }
        interfaceC5111aM2182a.mo2170b(path, paint, matrix);
    }

    /* renamed from: x */
    public final int m7335x() {
        InterfaceC5113c interfaceC5113cM2183b;
        C5120j c5120j = this.f8406c;
        if (c5120j != null && (interfaceC5113cM2183b = c5120j.m2183b()) != null) {
            Integer numValueOf = Integer.valueOf(interfaceC5113cM2183b.getMyBackgroundColor());
            if (numValueOf.intValue() == 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
        }
        return this.f8404a.m16491i();
    }

    /* renamed from: y */
    public final BackgroundLineConfig m7336y() {
        InterfaceC5113c interfaceC5113cM2183b;
        BackgroundLineConfig backgroundLineConfig;
        C5120j c5120j = this.f8406c;
        return (c5120j == null || (interfaceC5113cM2183b = c5120j.m2183b()) == null || (backgroundLineConfig = interfaceC5113cM2183b.getBackgroundLineConfig()) == null) ? new BackgroundLineConfig(0, 0.0f, null, 0.0f, 15, null) : backgroundLineConfig;
    }

    /* renamed from: z */
    public final RectF m7337z() {
        return this.f8405b;
    }
}
