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
import com.zykj.blackboard.bean.BoardConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p077e5.AbstractC7352m;
import p077e5.AbstractC7356q;
import p077e5.C7341b;
import p077e5.C7343d;
import p109h4.C7623a;
import p120i4.C7663c;
import p120i4.C7665e;
import p131j4.C7792a;
import p142k4.AbstractC7878a;
import p155l4.C8497b;
import p155l4.C8505j;
import p155l4.InterfaceC8496a;
import p155l4.InterfaceC8498c;
import p155l4.InterfaceC8499d;
import p155l4.InterfaceC8501f;
import p177n4.InterfaceC8631k;
import p210q4.InterfaceC8887b;
import p210q4.InterfaceC8888c;
import p221r4.C9008d;

/* loaded from: classes4.dex */
public final class DrawControl {

    /* renamed from: a */
    public final BoardConfig f7121a;

    /* renamed from: b */
    public final RectF f7122b;

    /* renamed from: c */
    public C8505j f7123c;

    /* renamed from: d */
    public C7792a f7124d;

    /* renamed from: e */
    public Bitmap f7125e;

    /* renamed from: f */
    public Canvas f7126f;

    /* renamed from: g */
    public Bitmap f7127g;

    /* renamed from: h */
    public Canvas f7128h;

    /* renamed from: i */
    public Bitmap f7129i;

    /* renamed from: j */
    public RectF f7130j;

    /* renamed from: k */
    public final Rect f7131k;

    /* renamed from: l */
    public Bitmap f7132l;

    /* renamed from: m */
    public Canvas f7133m;

    /* renamed from: n */
    public final RectF f7134n;

    /* renamed from: o */
    public final Matrix f7135o;

    /* renamed from: p */
    public final RectF f7136p;

    /* renamed from: q */
    public final Matrix f7137q;

    /* renamed from: r */
    public final Paint f7138r;

    /* renamed from: s */
    public final C6634a f7139s;

    /* renamed from: t */
    public final C7623a f7140t;

    /* renamed from: com.zykj.blackboard.core.canvas.control.DrawControl$a */
    public static final class C6634a implements InterfaceC8631k {
        public C6634a() {
        }

        @Override // p177n4.InterfaceC8631k
        /* renamed from: a */
        public void mo6242a(RectF renderRectF, RectF visibleRectF) {
            Intrinsics.checkNotNullParameter(renderRectF, "renderRectF");
            Intrinsics.checkNotNullParameter(visibleRectF, "visibleRectF");
        }

        @Override // p177n4.InterfaceC8631k
        /* renamed from: b */
        public void mo6243b(Matrix matrix) {
            Intrinsics.checkNotNullParameter(matrix, "matrix");
            DrawControl.this.m6236u();
        }
    }

    public DrawControl(BoardConfig boardConfig) {
        Intrinsics.checkNotNullParameter(boardConfig, "boardConfig");
        this.f7121a = boardConfig;
        this.f7122b = new RectF();
        this.f7130j = new RectF();
        this.f7131k = new Rect();
        this.f7134n = new RectF();
        this.f7135o = new Matrix();
        this.f7136p = new RectF();
        this.f7137q = new Matrix();
        Paint paint = new Paint();
        paint.setColor(-16776961);
        paint.setStrokeWidth(5.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setDither(true);
        paint.setAntiAlias(true);
        this.f7138r = paint;
        this.f7139s = new C6634a();
        this.f7140t = new C7623a(boardConfig);
    }

    /* renamed from: n */
    public static /* synthetic */ void m6197n(DrawControl drawControl, Matrix matrix, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            matrix = null;
        }
        drawControl.m6229m(matrix);
    }

    /* renamed from: A */
    public final void m6198A(RectF rectF) {
        Bitmap bitmap = this.f7127g;
        if (bitmap != null) {
            bitmap.recycle();
        }
        if (rectF.isEmpty()) {
            return;
        }
        this.f7127g = Bitmap.createBitmap((int) rectF.width(), (int) rectF.height(), Bitmap.Config.ARGB_8888);
        Bitmap bitmap2 = this.f7127g;
        Intrinsics.checkNotNull(bitmap2);
        this.f7128h = new Canvas(bitmap2);
    }

    /* renamed from: B */
    public final void m6199B(InterfaceC8888c interfaceC8888c) {
        Matrix matrix;
        InterfaceC8496a interfaceC8496aM13975a;
        C8505j c8505j = this.f7123c;
        if (c8505j != null && (interfaceC8496aM13975a = c8505j.m13975a()) != null) {
            interfaceC8496aM13975a.clear();
        }
        RectF rectF = this.f7134n;
        rectF.setEmpty();
        Iterator it = interfaceC8888c.mo14995f().iterator();
        while (true) {
            Matrix matrixM13188b = null;
            if (!it.hasNext()) {
                break;
            }
            InterfaceC8888c interfaceC8888c2 = (InterfaceC8888c) it.next();
            C7792a c7792a = this.f7124d;
            if (c7792a != null) {
                matrixM13188b = c7792a.m13188b();
            }
            rectF.union(interfaceC8888c2.mo14999j(matrixM13188b));
        }
        Bitmap bitmap = this.f7132l;
        if (bitmap != null) {
            bitmap.recycle();
        }
        if (this.f7134n.isEmpty()) {
            this.f7132l = null;
            this.f7133m = null;
        } else {
            this.f7132l = Bitmap.createBitmap((int) this.f7134n.width(), (int) this.f7134n.height(), Bitmap.Config.ARGB_8888);
            Bitmap bitmap2 = this.f7132l;
            Intrinsics.checkNotNull(bitmap2);
            this.f7133m = new Canvas(bitmap2);
        }
        Canvas canvas = this.f7133m;
        if (canvas != null) {
            canvas.save();
            RectF rectF2 = this.f7134n;
            canvas.translate(-rectF2.left, -rectF2.top);
            C7792a c7792a2 = this.f7124d;
            if (c7792a2 == null || (matrix = c7792a2.m13188b()) == null) {
                matrix = new Matrix();
            }
            InterfaceC8887b.a.m15006a(interfaceC8888c, canvas, matrix, null, false, true, 12, null);
            canvas.restore();
        }
    }

    /* renamed from: C */
    public final void m6200C(RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, C7665e functionRectF, C7663c functionBackgroundRectF, List typeList, PointF pointF) {
        Intrinsics.checkNotNullParameter(selectRectF, "selectRectF");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(selectFunctionRectF, "selectFunctionRectF");
        Intrinsics.checkNotNullParameter(functionRectF, "functionRectF");
        Intrinsics.checkNotNullParameter(functionBackgroundRectF, "functionBackgroundRectF");
        Intrinsics.checkNotNullParameter(typeList, "typeList");
        Path pathM12560i = this.f7140t.m12560i(selectRectF, typeList, matrix);
        if (!this.f7121a.getIsGroupGraphComplete()) {
            m6226j();
            Canvas canvas = this.f7128h;
            if (canvas != null) {
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                this.f7140t.m12555d(canvas, m6238w(), pathM12560i, functionRectF, functionBackgroundRectF, typeList, pointF);
            }
            m6197n(this, null, 1, null);
            return;
        }
        RectF rectF = new RectF();
        pathM12560i.computeBounds(rectF, false);
        rectF.left -= 3.0f;
        rectF.top -= 3.0f;
        rectF.right += 3.0f;
        rectF.bottom += 3.0f;
        RectF rectF2 = new RectF();
        rectF2.union(rectF);
        rectF2.union(selectFunctionRectF);
        m6198A(rectF2);
        Canvas canvas2 = this.f7128h;
        if (canvas2 != null) {
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas2.save();
            canvas2.translate(-rectF2.left, -rectF2.top);
            this.f7140t.m12555d(canvas2, m6238w(), pathM12560i, functionRectF, functionBackgroundRectF, typeList, pointF);
            canvas2.restore();
        }
        this.f7137q.setTranslate(rectF2.left, rectF2.top);
        m6229m(this.f7137q);
    }

    /* renamed from: D */
    public final void m6201D(float f10, float f11, float f12, float f13) {
        InterfaceC8496a interfaceC8496aM13975a;
        C8505j c8505j = this.f7123c;
        if (c8505j == null || (interfaceC8496aM13975a = c8505j.m13975a()) == null) {
            return;
        }
        interfaceC8496aM13975a.mo13964b(this.f7140t.m12557f(f10, f11, f12, f13), this.f7140t.m12556e(m6238w()), null);
    }

    /* renamed from: E */
    public final void m6202E(InterfaceC8888c rootGraph, RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, C7665e functionRectF, C7663c functionBackgroundRectF, List typeList, PointF pointF) {
        Intrinsics.checkNotNullParameter(rootGraph, "rootGraph");
        Intrinsics.checkNotNullParameter(selectRectF, "selectRectF");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(selectFunctionRectF, "selectFunctionRectF");
        Intrinsics.checkNotNullParameter(functionRectF, "functionRectF");
        Intrinsics.checkNotNullParameter(functionBackgroundRectF, "functionBackgroundRectF");
        Intrinsics.checkNotNullParameter(typeList, "typeList");
        Canvas canvas = this.f7126f;
        if (canvas != null) {
            AbstractC7878a.m13413a(canvas);
            C7792a c7792a = this.f7124d;
            if (c7792a != null) {
                InterfaceC8887b.a.m15006a(rootGraph, canvas, c7792a.m13188b(), null, false, this.f7121a.getIsGroupGraphComplete(), 8, null);
            }
        }
        m6233r();
        m6200C(selectRectF, matrix, selectFunctionRectF, functionRectF, functionBackgroundRectF, typeList, pointF);
    }

    /* renamed from: F */
    public final void m6203F(InterfaceC8888c rootGraph, final InterfaceC8888c textGraph, RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, C7665e functionRectF, C7663c functionBackgroundRectF, List typeList, PointF pointF) {
        Intrinsics.checkNotNullParameter(rootGraph, "rootGraph");
        Intrinsics.checkNotNullParameter(textGraph, "textGraph");
        Intrinsics.checkNotNullParameter(selectRectF, "selectRectF");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(selectFunctionRectF, "selectFunctionRectF");
        Intrinsics.checkNotNullParameter(functionRectF, "functionRectF");
        Intrinsics.checkNotNullParameter(functionBackgroundRectF, "functionBackgroundRectF");
        Intrinsics.checkNotNullParameter(typeList, "typeList");
        Canvas canvas = this.f7126f;
        if (canvas != null) {
            AbstractC7878a.m13413a(canvas);
            C7792a c7792a = this.f7124d;
            if (c7792a != null) {
                InterfaceC8887b.a.m15006a(rootGraph, canvas, c7792a.m13188b(), new Function1<InterfaceC8888c, Boolean>() { // from class: com.zykj.blackboard.core.canvas.control.DrawControl$newTextHandleStart$1$1$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke(InterfaceC8888c childGraph) {
                        Intrinsics.checkNotNullParameter(childGraph, "childGraph");
                        return Boolean.valueOf(Intrinsics.areEqual(childGraph.getId(), textGraph.getId()));
                    }
                }, false, this.f7121a.getIsGroupGraphComplete(), 8, null);
            }
        }
        m6233r();
        m6204G(textGraph, selectRectF, matrix, selectFunctionRectF, functionRectF, functionBackgroundRectF, typeList, pointF);
    }

    /* renamed from: G */
    public final void m6204G(InterfaceC8888c textGraph, RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, C7665e functionRectF, C7663c functionBackgroundRectF, List typeList, PointF pointF) {
        Matrix matrix2;
        Intrinsics.checkNotNullParameter(textGraph, "textGraph");
        Intrinsics.checkNotNullParameter(selectRectF, "selectRectF");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(selectFunctionRectF, "selectFunctionRectF");
        Intrinsics.checkNotNullParameter(functionRectF, "functionRectF");
        Intrinsics.checkNotNullParameter(functionBackgroundRectF, "functionBackgroundRectF");
        Intrinsics.checkNotNullParameter(typeList, "typeList");
        Path pathM12560i = this.f7140t.m12560i(selectRectF, typeList, matrix);
        if (!this.f7121a.getIsGroupGraphComplete()) {
            m6226j();
            Canvas canvas = this.f7128h;
            if (canvas != null) {
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                C7792a c7792a = this.f7124d;
                if (c7792a != null) {
                    InterfaceC8887b.a.m15006a(textGraph, canvas, c7792a.m13188b(), null, false, false, 28, null);
                }
                this.f7140t.m12555d(canvas, m6238w(), pathM12560i, functionRectF, functionBackgroundRectF, typeList, pointF);
            }
            m6197n(this, null, 1, null);
            return;
        }
        RectF rectF = new RectF();
        pathM12560i.computeBounds(rectF, false);
        rectF.left -= 3.0f;
        rectF.top -= 3.0f;
        rectF.right += 3.0f;
        rectF.bottom += 3.0f;
        RectF rectF2 = new RectF();
        rectF2.union(rectF);
        rectF2.union(selectFunctionRectF);
        m6198A(rectF2);
        Canvas canvas2 = this.f7128h;
        if (canvas2 != null) {
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas2.save();
            canvas2.translate(-rectF2.left, -rectF2.top);
            C7792a c7792a2 = this.f7124d;
            if (c7792a2 == null || (matrix2 = c7792a2.m13188b()) == null) {
                matrix2 = new Matrix();
            }
            InterfaceC8887b.a.m15006a(textGraph, canvas2, matrix2, null, false, true, 12, null);
            rectF2 = rectF2;
            this.f7140t.m12555d(canvas2, m6238w(), pathM12560i, functionRectF, functionBackgroundRectF, typeList, pointF);
            canvas2.restore();
        }
        this.f7137q.setTranslate(rectF2.left, rectF2.top);
        m6229m(this.f7137q);
    }

    /* renamed from: H */
    public final void m6205H() {
        InterfaceC8496a interfaceC8496aM13975a;
        C8505j c8505j = this.f7123c;
        if (c8505j != null && (interfaceC8496aM13975a = c8505j.m13975a()) != null) {
            interfaceC8496aM13975a.clear();
        }
        this.f7126f = null;
        this.f7128h = null;
        C7341b.f11907a.m11742a(new Bitmap[]{this.f7125e, this.f7127g, this.f7129i, this.f7132l}, new Function0<Unit>() { // from class: com.zykj.blackboard.core.canvas.control.DrawControl$release$1
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
                this.f7144a.f7125e = null;
                this.f7144a.f7127g = null;
                this.f7144a.f7129i = null;
                this.f7144a.f7132l = null;
            }
        });
        C7792a c7792a = this.f7124d;
        if (c7792a != null) {
            c7792a.m13199m(this.f7139s);
        }
    }

    /* renamed from: I */
    public final void m6206I(RectF rectF, List graphList) {
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
            InterfaceC8888c interfaceC8888c = (InterfaceC8888c) it.next();
            C7792a c7792a = this.f7124d;
            if (c7792a == null || (matrix = c7792a.m13188b()) == null) {
                matrix = new Matrix();
            }
            InterfaceC8887b.a.m15006a(interfaceC8888c, canvas, matrix, null, false, this.f7121a.getIsGroupGraphComplete(), 4, null);
        }
        Canvas canvas2 = this.f7126f;
        if (canvas2 != null) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            Unit unit = Unit.INSTANCE;
            canvas2.drawRect(rect, paint);
            canvas2.drawBitmap(bitmapCreateBitmap, new Rect(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight()), rect, (Paint) null);
        }
        m6233r();
    }

    /* renamed from: J */
    public final void m6207J() {
        C8505j c8505j = this.f7123c;
        if (c8505j != null) {
            c8505j.m13980f();
        }
    }

    /* renamed from: K */
    public final Bitmap m6208K(InterfaceC8888c graph) {
        Matrix matrixM13188b;
        InterfaceC8499d interfaceC8499dM13977c;
        Intrinsics.checkNotNullParameter(graph, "graph");
        C8505j c8505j = this.f7123c;
        RectF rectF = new RectF((c8505j == null || (interfaceC8499dM13977c = c8505j.m13977c()) == null) ? null : interfaceC8499dM13977c.mo13968b());
        RectF rectF2 = new RectF();
        if (this.f7121a.getMoveActionConfig().m11999g()) {
            rectF2.set(0.0f, 0.0f, rectF.width() * this.f7121a.getMoveActionConfig().m11995c(), rectF.height() * this.f7121a.getMoveActionConfig().m11994b());
            Matrix matrix = new Matrix();
            C7792a c7792a = this.f7124d;
            if (c7792a != null) {
                matrix.postConcat(AbstractC7352m.m11777b(c7792a.m13191e()));
                matrix.postConcat(c7792a.m13188b());
            }
            matrix.mapRect(rectF2);
        } else {
            rectF2.setEmpty();
        }
        if (!rectF2.isEmpty()) {
            rectF.intersect(rectF2);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) rectF.width()) + 1, ((int) rectF.height()) + 1, Bitmap.Config.ARGB_8888);
        this.f7129i = bitmapCreateBitmap;
        if (bitmapCreateBitmap != null) {
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            C7792a c7792a2 = this.f7124d;
            if (c7792a2 != null && (matrixM13188b = c7792a2.m13188b()) != null) {
                m6230o(canvas, matrixM13188b);
                InterfaceC8887b.a.m15006a(graph, canvas, matrixM13188b, null, false, false, 4, null);
            }
        }
        return this.f7129i;
    }

    /* renamed from: L */
    public final void m6209L(Path path, Paint paint) {
        Intrinsics.checkNotNullParameter(path, "path");
        if (!this.f7121a.getIsGroupGraphComplete()) {
            m6226j();
            Canvas canvas = this.f7128h;
            if (canvas != null) {
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                if (paint == null) {
                    paint = this.f7138r;
                }
                canvas.drawPath(path, paint);
            }
            m6197n(this, null, 1, null);
            return;
        }
        if (paint == null) {
            paint = this.f7138r;
        }
        RectF rectF = new RectF();
        path.computeBounds(rectF, false);
        rectF.left -= paint.getStrokeWidth();
        rectF.top -= paint.getStrokeWidth();
        rectF.right += paint.getStrokeWidth();
        rectF.bottom += paint.getStrokeWidth();
        m6198A(rectF);
        Canvas canvas2 = this.f7128h;
        if (canvas2 != null) {
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas2.save();
            canvas2.translate(-rectF.left, -rectF.top);
            canvas2.drawPath(path, paint);
            canvas2.restore();
        }
        this.f7137q.setTranslate(rectF.left, rectF.top);
        m6229m(this.f7137q);
    }

    /* renamed from: M */
    public final void m6210M() {
        InterfaceC8496a interfaceC8496aM13975a;
        if (this.f7121a.getIsGroupGraphComplete()) {
            m6227k();
        }
        C8505j c8505j = this.f7123c;
        if (c8505j == null || (interfaceC8496aM13975a = c8505j.m13975a()) == null) {
            return;
        }
        interfaceC8496aM13975a.clear();
    }

    /* renamed from: N */
    public final void m6211N(int i10) {
        InterfaceC8498c interfaceC8498cM13976b;
        InterfaceC8498c interfaceC8498cM13976b2;
        C8505j c8505j = this.f7123c;
        if (c8505j != null && (interfaceC8498cM13976b2 = c8505j.m13976b()) != null) {
            interfaceC8498cM13976b2.setMyBackgroundColor(i10);
        }
        C8505j c8505j2 = this.f7123c;
        if (c8505j2 == null || (interfaceC8498cM13976b = c8505j2.m13976b()) == null) {
            return;
        }
        interfaceC8498cM13976b.refresh();
    }

    /* renamed from: O */
    public final void m6212O(BackgroundLineConfig backgroundLineConfig) {
        InterfaceC8498c interfaceC8498cM13976b;
        InterfaceC8498c interfaceC8498cM13976b2;
        Intrinsics.checkNotNullParameter(backgroundLineConfig, "backgroundLineConfig");
        C8505j c8505j = this.f7123c;
        if (c8505j != null && (interfaceC8498cM13976b2 = c8505j.m13976b()) != null) {
            interfaceC8498cM13976b2.setBackgroundLineConfig(backgroundLineConfig);
        }
        C8505j c8505j2 = this.f7123c;
        if (c8505j2 == null || (interfaceC8498cM13976b = c8505j2.m13976b()) == null) {
            return;
        }
        interfaceC8498cM13976b.refresh();
    }

    /* renamed from: P */
    public final void m6213P(C7792a matrixAdapter) {
        Intrinsics.checkNotNullParameter(matrixAdapter, "matrixAdapter");
        this.f7124d = matrixAdapter;
        matrixAdapter.m13194h(this.f7139s);
    }

    /* renamed from: Q */
    public final void m6214Q(C8505j renderLayer) {
        Intrinsics.checkNotNullParameter(renderLayer, "renderLayer");
        this.f7123c = renderLayer;
        this.f7131k.set(renderLayer.m13979e());
        if (!this.f7131k.isEmpty()) {
            this.f7125e = Bitmap.createBitmap(this.f7131k.width(), this.f7131k.height(), Bitmap.Config.ARGB_8888);
            Bitmap bitmap = this.f7125e;
            Intrinsics.checkNotNull(bitmap);
            this.f7126f = new Canvas(bitmap);
        }
        m6236u();
    }

    /* renamed from: R */
    public final void m6215R(C9008d graph, Path path, Paint paint) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        Paint paint2 = paint == null ? this.f7138r : paint;
        RectF rectF = new RectF();
        if (path != null) {
            path.computeBounds(rectF, false);
            rectF.left -= paint2.getStrokeWidth();
            rectF.top -= paint2.getStrokeWidth();
            rectF.right += paint2.getStrokeWidth();
            rectF.bottom += paint2.getStrokeWidth();
        } else {
            C7792a c7792a = this.f7124d;
            rectF.set(graph.mo14999j(c7792a != null ? c7792a.m13188b() : null));
        }
        m6198A(rectF);
        Canvas canvas = this.f7128h;
        if (canvas != null) {
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas.save();
            canvas.translate(-rectF.left, -rectF.top);
            C7792a c7792a2 = this.f7124d;
            if (c7792a2 != null) {
                InterfaceC8887b.a.m15006a(graph, canvas, c7792a2.m13188b(), null, false, this.f7121a.getIsGroupGraphComplete(), 4, null);
            }
            if (path != null) {
                if (paint == null) {
                    paint = this.f7138r;
                }
                canvas.drawPath(path, paint);
            }
            canvas.restore();
        }
        this.f7135o.setTranslate(rectF.left, rectF.top);
        m6229m(this.f7135o);
    }

    /* renamed from: S */
    public final void m6216S(InterfaceC8888c rootGraph, Path path, Paint paint) {
        InterfaceC8496a interfaceC8496aM13975a;
        Intrinsics.checkNotNullParameter(rootGraph, "rootGraph");
        Canvas canvas = this.f7126f;
        if (canvas != null) {
            AbstractC7878a.m13413a(canvas);
            C7792a c7792a = this.f7124d;
            if (c7792a != null) {
                InterfaceC8887b.a.m15006a(rootGraph, canvas, c7792a.m13188b(), null, false, this.f7121a.getIsGroupGraphComplete(), 4, null);
            }
        }
        m6233r();
        if (path == null) {
            m6227k();
            C8505j c8505j = this.f7123c;
            if (c8505j == null || (interfaceC8496aM13975a = c8505j.m13975a()) == null) {
                return;
            }
            interfaceC8496aM13975a.clear();
            return;
        }
        if (paint == null) {
            paint = this.f7138r;
        }
        RectF rectF = new RectF();
        path.computeBounds(rectF, false);
        rectF.left -= paint.getStrokeWidth();
        rectF.top -= paint.getStrokeWidth();
        rectF.right += paint.getStrokeWidth();
        rectF.bottom += paint.getStrokeWidth();
        m6198A(rectF);
        Canvas canvas2 = this.f7128h;
        if (canvas2 != null) {
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas2.save();
            canvas2.translate(-rectF.left, -rectF.top);
            canvas2.drawPath(path, paint);
            canvas2.restore();
        }
        Matrix matrix = this.f7137q;
        matrix.setTranslate(rectF.left, rectF.top);
        m6229m(matrix);
    }

    /* renamed from: T */
    public final void m6217T(InterfaceC8888c rootGraph, final C9008d graph, Path path, Paint paint) {
        Intrinsics.checkNotNullParameter(rootGraph, "rootGraph");
        Intrinsics.checkNotNullParameter(graph, "graph");
        Canvas canvas = this.f7126f;
        if (canvas != null) {
            AbstractC7878a.m13413a(canvas);
            C7792a c7792a = this.f7124d;
            if (c7792a != null) {
                InterfaceC8887b.a.m15006a(rootGraph, canvas, c7792a.m13188b(), new Function1<InterfaceC8888c, Boolean>() { // from class: com.zykj.blackboard.core.canvas.control.DrawControl$textHandleStart$1$1$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke(InterfaceC8888c childGraph) {
                        Intrinsics.checkNotNullParameter(childGraph, "childGraph");
                        return Boolean.valueOf(Intrinsics.areEqual(childGraph.getId(), graph.getId()));
                    }
                }, false, false, 24, null);
            }
        }
        m6233r();
        Paint paint2 = paint == null ? this.f7138r : paint;
        RectF rectF = new RectF();
        if (path != null) {
            path.computeBounds(rectF, false);
            rectF.left -= paint2.getStrokeWidth();
            rectF.top -= paint2.getStrokeWidth();
            rectF.right += paint2.getStrokeWidth();
            rectF.bottom += paint2.getStrokeWidth();
        } else {
            C7792a c7792a2 = this.f7124d;
            graph.mo14999j(c7792a2 != null ? c7792a2.m13188b() : null);
        }
        m6198A(rectF);
        Canvas canvas2 = this.f7128h;
        if (canvas2 != null) {
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas2.save();
            canvas2.translate(-rectF.left, -rectF.top);
            C7792a c7792a3 = this.f7124d;
            if (c7792a3 != null) {
                InterfaceC8887b.a.m15006a(graph, canvas2, c7792a3.m13188b(), null, false, this.f7121a.getIsGroupGraphComplete(), 4, null);
            }
            if (path != null) {
                if (paint == null) {
                    paint = this.f7138r;
                }
                canvas2.drawPath(path, paint);
            }
            canvas2.restore();
        }
        this.f7135o.setTranslate(rectF.left, rectF.top);
        m6229m(this.f7135o);
    }

    /* renamed from: U */
    public final void m6218U(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        if (!this.f7121a.getIsGroupGraphComplete()) {
            m6229m(matrix);
            return;
        }
        Matrix matrix2 = new Matrix();
        matrix2.set(this.f7135o);
        matrix2.postConcat(matrix);
        m6229m(matrix2);
    }

    /* renamed from: V */
    public final void m6219V(InterfaceC8888c rootGraph, Path path, Paint paint) {
        InterfaceC8496a interfaceC8496aM13975a;
        Intrinsics.checkNotNullParameter(rootGraph, "rootGraph");
        Canvas canvas = this.f7126f;
        if (canvas != null) {
            AbstractC7878a.m13413a(canvas);
            C7792a c7792a = this.f7124d;
            if (c7792a != null) {
                InterfaceC8887b.a.m15006a(rootGraph, canvas, c7792a.m13188b(), null, false, this.f7121a.getIsGroupGraphComplete(), 12, null);
            }
        }
        m6233r();
        if (!this.f7121a.getIsGroupGraphComplete()) {
            m6226j();
            Canvas canvas2 = this.f7128h;
            if (canvas2 != null) {
                canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                if (path != null) {
                    if (paint == null) {
                        paint = this.f7138r;
                    }
                    canvas2.drawPath(path, paint);
                }
            }
            m6197n(this, null, 1, null);
            return;
        }
        if (path == null) {
            m6227k();
            C8505j c8505j = this.f7123c;
            if (c8505j == null || (interfaceC8496aM13975a = c8505j.m13975a()) == null) {
                return;
            }
            interfaceC8496aM13975a.clear();
            return;
        }
        if (paint == null) {
            paint = this.f7138r;
        }
        RectF rectF = new RectF();
        path.computeBounds(rectF, false);
        rectF.left -= paint.getStrokeWidth();
        rectF.top -= paint.getStrokeWidth();
        rectF.right += paint.getStrokeWidth();
        rectF.bottom += paint.getStrokeWidth();
        m6198A(rectF);
        Canvas canvas3 = this.f7128h;
        if (canvas3 != null) {
            canvas3.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas3.save();
            canvas3.translate(-rectF.left, -rectF.top);
            canvas3.drawPath(path, paint);
            canvas3.restore();
        }
        Matrix matrix = this.f7137q;
        matrix.setTranslate(rectF.left, rectF.top);
        m6229m(matrix);
    }

    /* renamed from: W */
    public final void m6220W(InterfaceC8888c rootGraph, final List graphList, Path path, Paint paint) {
        Intrinsics.checkNotNullParameter(rootGraph, "rootGraph");
        Intrinsics.checkNotNullParameter(graphList, "graphList");
        Canvas canvas = this.f7126f;
        if (canvas != null) {
            AbstractC7878a.m13413a(canvas);
            C7792a c7792a = this.f7124d;
            if (c7792a != null) {
                InterfaceC8887b.a.m15006a(rootGraph, canvas, c7792a.m13188b(), new Function1<InterfaceC8888c, Boolean>() { // from class: com.zykj.blackboard.core.canvas.control.DrawControl$transGraphStart$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke(InterfaceC8888c childGraph) {
                        Intrinsics.checkNotNullParameter(childGraph, "childGraph");
                        List list = graphList;
                        boolean z9 = false;
                        if (list == null || !list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                if (Intrinsics.areEqual(childGraph.getId(), ((InterfaceC8888c) it.next()).getId())) {
                                    z9 = true;
                                    break;
                                }
                            }
                        }
                        return Boolean.valueOf(z9);
                    }
                }, false, this.f7121a.getIsGroupGraphComplete(), 8, null);
            }
        }
        m6233r();
        if (!this.f7121a.getIsGroupGraphComplete()) {
            m6226j();
            Canvas canvas2 = this.f7128h;
            if (canvas2 != null) {
                canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                Iterator it = graphList.iterator();
                while (it.hasNext()) {
                    InterfaceC8888c interfaceC8888c = (InterfaceC8888c) it.next();
                    C7792a c7792a2 = this.f7124d;
                    if (c7792a2 != null) {
                        InterfaceC8887b.a.m15006a(interfaceC8888c, canvas2, c7792a2.m13188b(), null, false, false, 28, null);
                    }
                }
                if (path != null) {
                    canvas2.drawPath(path, paint == null ? this.f7138r : paint);
                }
            }
            m6197n(this, null, 1, null);
            return;
        }
        Paint paint2 = paint == null ? this.f7138r : paint;
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
                InterfaceC8888c interfaceC8888c2 = (InterfaceC8888c) it2.next();
                C7792a c7792a3 = this.f7124d;
                rectF.union(interfaceC8888c2.mo14999j(c7792a3 != null ? c7792a3.m13188b() : null));
            }
        }
        m6198A(rectF);
        Canvas canvas3 = this.f7128h;
        if (canvas3 != null) {
            canvas3.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas3.save();
            canvas3.translate(-rectF.left, -rectF.top);
            Iterator it3 = graphList.iterator();
            while (it3.hasNext()) {
                InterfaceC8888c interfaceC8888c3 = (InterfaceC8888c) it3.next();
                C7792a c7792a4 = this.f7124d;
                if (c7792a4 != null) {
                    InterfaceC8887b.a.m15006a(interfaceC8888c3, canvas3, c7792a4.m13188b(), null, false, true, 12, null);
                }
            }
            if (path != null) {
                canvas3.drawPath(path, paint == null ? this.f7138r : paint);
            }
            canvas3.restore();
        }
        this.f7135o.setTranslate(rectF.left, rectF.top);
        m6229m(this.f7135o);
    }

    /* renamed from: X */
    public final void m6221X(Matrix matrix) {
        InterfaceC8498c interfaceC8498cM13976b;
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        C8505j c8505j = this.f7123c;
        if (c8505j == null || (interfaceC8498cM13976b = c8505j.m13976b()) == null) {
            return;
        }
        interfaceC8498cM13976b.setMatrix(matrix);
    }

    /* renamed from: f */
    public final void m6222f(InterfaceC8888c graph) {
        InterfaceC8496a interfaceC8496aM13975a;
        C7792a c7792a;
        Intrinsics.checkNotNullParameter(graph, "graph");
        Canvas canvas = this.f7126f;
        if (canvas != null && (c7792a = this.f7124d) != null) {
            graph.mo6749m(canvas, c7792a.m13188b());
        }
        Log.i("DrawView", "开始绘制");
        m6233r();
        C8505j c8505j = this.f7123c;
        if (c8505j == null || (interfaceC8496aM13975a = c8505j.m13975a()) == null) {
            return;
        }
        interfaceC8496aM13975a.clear();
    }

    /* renamed from: g */
    public final void m6223g(InterfaceC8888c rootGraph) {
        Matrix matrixM13188b;
        InterfaceC8496a interfaceC8496aM13975a;
        Intrinsics.checkNotNullParameter(rootGraph, "rootGraph");
        Canvas canvas = this.f7126f;
        if (canvas != null) {
            AbstractC7878a.m13413a(canvas);
            C7792a c7792a = this.f7124d;
            if (c7792a != null) {
                InterfaceC8887b.a.m15006a(rootGraph, canvas, c7792a.m13188b(), null, false, this.f7121a.getIsGroupGraphComplete(), 12, null);
            }
        }
        m6233r();
        if (this.f7121a.getIsGroupGraphComplete()) {
            m6227k();
            C8505j c8505j = this.f7123c;
            if (c8505j != null && (interfaceC8496aM13975a = c8505j.m13975a()) != null) {
                interfaceC8496aM13975a.clear();
            }
        } else {
            m6226j();
            Canvas canvas2 = this.f7128h;
            if (canvas2 != null) {
                canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            }
            m6197n(this, null, 1, null);
        }
        C7792a c7792a2 = this.f7124d;
        if (c7792a2 == null || (matrixM13188b = c7792a2.m13188b()) == null) {
            return;
        }
        m6221X(matrixM13188b);
    }

    /* renamed from: h */
    public final void m6224h(InterfaceC8888c rootGraph) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(rootGraph, "rootGraph");
        if (this.f7121a.getIsGroupGraphComplete()) {
            m6199B(rootGraph);
            Matrix matrix = this.f7135o;
            RectF rectF = this.f7134n;
            matrix.setTranslate(rectF.left, rectF.top);
            Bitmap bitmap2 = this.f7132l;
            if (bitmap2 != null) {
                if (this.f7134n.contains(new RectF(this.f7131k))) {
                    RectF rectF2 = this.f7134n;
                    m6232q(bitmap2, rectF2.left, rectF2.top);
                } else {
                    m6231p(bitmap2, this.f7135o);
                }
            }
        } else {
            m6226j();
            Canvas canvas = this.f7128h;
            if (canvas != null && (bitmap = this.f7125e) != null) {
                C7343d.f11910a.m11747a(canvas, bitmap, new Matrix());
            }
            m6197n(this, null, 1, null);
        }
        Canvas canvas2 = this.f7126f;
        if (canvas2 != null) {
            AbstractC7878a.m13413a(canvas2);
        }
        m6233r();
    }

    /* renamed from: i */
    public final void m6225i(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        if (this.f7121a.getIsGroupGraphComplete()) {
            Matrix matrix2 = this.f7137q;
            matrix2.set(this.f7135o);
            matrix2.postConcat(matrix);
            float[] fArr = {0.0f, 0.0f};
            this.f7137q.mapPoints(fArr);
            Log.i("cameraChanging", fArr[0] + "  " + fArr[1]);
            Bitmap bitmap = this.f7132l;
            if (bitmap != null) {
                if (this.f7134n.contains(new RectF(this.f7131k))) {
                    m6232q(bitmap, fArr[0], fArr[1]);
                } else {
                    m6231p(bitmap, this.f7137q);
                }
            }
        } else {
            m6229m(matrix);
        }
        Matrix matrix3 = new Matrix();
        C7792a c7792a = this.f7124d;
        if (c7792a != null) {
            matrix3.postConcat(c7792a.m13190d());
            matrix3.postConcat(matrix);
            matrix3.postConcat(c7792a.m13191e());
        }
        m6221X(matrix3);
    }

    /* renamed from: j */
    public final void m6226j() {
        Bitmap bitmap = this.f7127g;
        if (bitmap != null) {
            Intrinsics.checkNotNull(bitmap);
            if (!bitmap.isRecycled()) {
                Bitmap bitmap2 = this.f7127g;
                Intrinsics.checkNotNull(bitmap2);
                if (bitmap2.getWidth() == this.f7131k.width()) {
                    Bitmap bitmap3 = this.f7127g;
                    Intrinsics.checkNotNull(bitmap3);
                    if (bitmap3.getHeight() == this.f7131k.height()) {
                        return;
                    }
                }
            }
        }
        m6198A(new RectF(this.f7131k));
    }

    /* renamed from: k */
    public final void m6227k() {
        Bitmap bitmap = this.f7127g;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f7127g = null;
        this.f7128h = null;
    }

    /* renamed from: l */
    public final void m6228l(InterfaceC8888c rootGraph) {
        Matrix matrix;
        Intrinsics.checkNotNullParameter(rootGraph, "rootGraph");
        Canvas canvas = this.f7126f;
        if (canvas != null) {
            AbstractC7878a.m13413a(canvas);
            C7792a c7792a = this.f7124d;
            if (c7792a == null || (matrix = c7792a.m13188b()) == null) {
                matrix = new Matrix();
            }
            InterfaceC8887b.a.m15006a(rootGraph, canvas, matrix, null, false, this.f7121a.getIsGroupGraphComplete(), 12, null);
        }
        m6233r();
    }

    /* renamed from: m */
    public final void m6229m(Matrix matrix) {
        C8505j c8505j;
        InterfaceC8496a interfaceC8496aM13975a;
        Bitmap bitmap = this.f7127g;
        if (bitmap == null || (c8505j = this.f7123c) == null || (interfaceC8496aM13975a = c8505j.m13975a()) == null) {
            return;
        }
        interfaceC8496aM13975a.mo13963a(bitmap, matrix);
    }

    /* renamed from: o */
    public final void m6230o(Canvas canvas, Matrix matrix) {
        InterfaceC8498c interfaceC8498cM13976b;
        C8505j c8505j = this.f7123c;
        if (c8505j == null || (interfaceC8498cM13976b = c8505j.m13976b()) == null) {
            return;
        }
        interfaceC8498cM13976b.mo6249a(canvas, matrix);
    }

    /* renamed from: p */
    public final void m6231p(Bitmap bitmap, Matrix matrix) {
        C8505j c8505j = this.f7123c;
        InterfaceC8496a interfaceC8496aM13975a = c8505j != null ? c8505j.m13975a() : null;
        if (interfaceC8496aM13975a instanceof C8497b) {
            ((C8497b) interfaceC8496aM13975a).m13965c(bitmap, matrix);
        } else if (interfaceC8496aM13975a != null) {
            interfaceC8496aM13975a.mo13963a(bitmap, matrix);
        }
    }

    /* renamed from: q */
    public final void m6232q(Bitmap bitmap, float f10, float f11) {
        InterfaceC8496a interfaceC8496aM13975a;
        int i10 = (int) f10;
        int i11 = -i10;
        int i12 = (int) f11;
        int i13 = -i12;
        int iMin = Math.min(bitmap.getWidth() + i10, this.f7131k.width());
        int iMin2 = Math.min(bitmap.getHeight() + i12, this.f7131k.height());
        if (i11 < 0 || i13 < 0 || i11 > bitmap.getWidth() || i13 > bitmap.getHeight() || iMin <= 0 || iMin2 <= 0) {
            C8505j c8505j = this.f7123c;
            if (c8505j == null || (interfaceC8496aM13975a = c8505j.m13975a()) == null) {
                return;
            }
            interfaceC8496aM13975a.clear();
            return;
        }
        Rect rect = new Rect(i11, i13, i11 + iMin, i13 + iMin2);
        C8505j c8505j2 = this.f7123c;
        InterfaceC8496a interfaceC8496aM13975a2 = c8505j2 != null ? c8505j2.m13975a() : null;
        if (interfaceC8496aM13975a2 instanceof C8497b) {
            ((C8497b) interfaceC8496aM13975a2).m13966d(bitmap, rect);
        } else if (interfaceC8496aM13975a2 != null) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, iMin, iMin2);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(bitmap, sou…eRect.top, width, height)");
            interfaceC8496aM13975a2.mo13963a(bitmapCreateBitmap, null);
        }
    }

    /* renamed from: r */
    public final void m6233r() {
        C8505j c8505j;
        InterfaceC8499d interfaceC8499dM13977c;
        Bitmap bitmap = this.f7125e;
        if (bitmap == null || (c8505j = this.f7123c) == null || (interfaceC8499dM13977c = c8505j.m13977c()) == null) {
            return;
        }
        interfaceC8499dM13977c.mo13967a(bitmap);
    }

    /* renamed from: s */
    public final void m6234s(List graphList) {
        Matrix matrix;
        Intrinsics.checkNotNullParameter(graphList, "graphList");
        Canvas canvas = this.f7128h;
        if (canvas != null) {
            Iterator it = graphList.iterator();
            while (it.hasNext()) {
                InterfaceC8888c interfaceC8888c = (InterfaceC8888c) it.next();
                C7792a c7792a = this.f7124d;
                if (c7792a == null || (matrix = c7792a.m13188b()) == null) {
                    matrix = new Matrix();
                }
                InterfaceC8887b.a.m15006a(interfaceC8888c, canvas, matrix, null, false, this.f7121a.getIsGroupGraphComplete(), 12, null);
            }
        }
        m6197n(this, null, 1, null);
    }

    /* renamed from: t */
    public final void m6235t(List graphList) {
        Matrix matrix;
        Intrinsics.checkNotNullParameter(graphList, "graphList");
        Canvas canvas = this.f7126f;
        if (canvas != null) {
            AbstractC7878a.m13413a(canvas);
            Iterator it = graphList.iterator();
            while (it.hasNext()) {
                InterfaceC8888c interfaceC8888c = (InterfaceC8888c) it.next();
                C7792a c7792a = this.f7124d;
                if (c7792a == null || (matrix = c7792a.m13188b()) == null) {
                    matrix = new Matrix();
                }
                InterfaceC8887b.a.m15006a(interfaceC8888c, canvas, matrix, null, false, this.f7121a.getIsGroupGraphComplete(), 12, null);
            }
        }
        m6233r();
    }

    /* renamed from: u */
    public final void m6236u() {
        InterfaceC8501f interfaceC8501fM13978d;
        InterfaceC8501f interfaceC8501fM13978d2;
        InterfaceC8501f interfaceC8501fM13978d3;
        float fIntValue;
        float fIntValue2;
        Rect rectM13979e;
        Rect rectM13979e2;
        if (this.f7121a.getMoveActionConfig().m11999g()) {
            if (this.f7122b.isEmpty()) {
                C8505j c8505j = this.f7123c;
                Integer numValueOf = null;
                Integer numValueOf2 = (c8505j == null || (rectM13979e2 = c8505j.m13979e()) == null) ? null : Integer.valueOf(rectM13979e2.width());
                Intrinsics.checkNotNull(numValueOf2);
                fIntValue = numValueOf2.intValue();
                C8505j c8505j2 = this.f7123c;
                if (c8505j2 != null && (rectM13979e = c8505j2.m13979e()) != null) {
                    numValueOf = Integer.valueOf(rectM13979e.height());
                }
                Intrinsics.checkNotNull(numValueOf);
                fIntValue2 = numValueOf.intValue();
            } else {
                fIntValue = this.f7122b.width();
                fIntValue2 = this.f7122b.height();
            }
            this.f7130j.set(0.0f, 0.0f, fIntValue * this.f7121a.getMoveActionConfig().m11995c(), fIntValue2 * this.f7121a.getMoveActionConfig().m11994b());
        } else {
            this.f7130j.setEmpty();
        }
        if (this.f7130j.isEmpty()) {
            C8505j c8505j3 = this.f7123c;
            if (c8505j3 == null || (interfaceC8501fM13978d3 = c8505j3.m13978d()) == null) {
                return;
            }
            interfaceC8501fM13978d3.hide();
            return;
        }
        this.f7136p.set(this.f7130j);
        Matrix matrix = this.f7137q;
        matrix.reset();
        C7792a c7792a = this.f7124d;
        if (c7792a != null) {
            if (this.f7122b.isEmpty()) {
                matrix.postConcat(AbstractC7352m.m11777b(c7792a.m13191e()));
                matrix.postConcat(c7792a.m13188b());
            } else {
                matrix.postConcat(c7792a.m13188b());
            }
        }
        this.f7137q.mapRect(this.f7136p);
        if (!this.f7136p.intersect(AbstractC7356q.m11788a(this.f7131k))) {
            C8505j c8505j4 = this.f7123c;
            if (c8505j4 == null || (interfaceC8501fM13978d2 = c8505j4.m13978d()) == null) {
                return;
            }
            interfaceC8501fM13978d2.hide();
            return;
        }
        C8505j c8505j5 = this.f7123c;
        if (c8505j5 == null || (interfaceC8501fM13978d = c8505j5.m13978d()) == null) {
            return;
        }
        interfaceC8501fM13978d.show();
        interfaceC8501fM13978d.mo13970a(this.f7136p);
        interfaceC8501fM13978d.refresh();
    }

    /* renamed from: v */
    public final void m6237v(Path path, Paint paint, Matrix matrix) {
        InterfaceC8496a interfaceC8496aM13975a;
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
        C8505j c8505j = this.f7123c;
        if (c8505j == null || (interfaceC8496aM13975a = c8505j.m13975a()) == null) {
            return;
        }
        interfaceC8496aM13975a.mo13964b(path, paint, matrix);
    }

    /* renamed from: w */
    public final int m6238w() {
        InterfaceC8498c interfaceC8498cM13976b;
        C8505j c8505j = this.f7123c;
        if (c8505j != null && (interfaceC8498cM13976b = c8505j.m13976b()) != null) {
            Integer numValueOf = Integer.valueOf(interfaceC8498cM13976b.getMyBackgroundColor());
            if (numValueOf.intValue() == 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
        }
        return this.f7121a.getBackgroundColorOutside();
    }

    /* renamed from: x */
    public final BackgroundLineConfig m6239x() {
        InterfaceC8498c interfaceC8498cM13976b;
        BackgroundLineConfig backgroundLineConfig;
        C8505j c8505j = this.f7123c;
        return (c8505j == null || (interfaceC8498cM13976b = c8505j.m13976b()) == null || (backgroundLineConfig = interfaceC8498cM13976b.getBackgroundLineConfig()) == null) ? new BackgroundLineConfig(0, 0.0f, null, 0.0f, 15, null) : backgroundLineConfig;
    }

    /* renamed from: y */
    public final Bitmap m6240y(InterfaceC8888c graph, int i10, int i11, int i12, int i13, boolean z9, boolean z10, boolean z11, final InterfaceC8888c interfaceC8888c) {
        int i14;
        Matrix matrixM13188b;
        InterfaceC8499d interfaceC8499dM13977c;
        Intrinsics.checkNotNullParameter(graph, "graph");
        RectF rectF = new RectF();
        Iterator it = graph.mo14995f().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            InterfaceC8888c interfaceC8888c2 = (InterfaceC8888c) it.next();
            if (!Intrinsics.areEqual(interfaceC8888c2, interfaceC8888c)) {
                C7792a c7792a = this.f7124d;
                rectF.union(interfaceC8888c2.mo14999j(c7792a != null ? c7792a.m13188b() : null));
            }
        }
        float f10 = i10;
        rectF.left -= f10;
        rectF.right += f10;
        float f11 = i11;
        rectF.top -= f11;
        rectF.bottom += f11;
        C8505j c8505j = this.f7123c;
        RectF rectF2 = new RectF((c8505j == null || (interfaceC8499dM13977c = c8505j.m13977c()) == null) ? null : interfaceC8499dM13977c.mo13968b());
        RectF rectF3 = new RectF();
        if (this.f7121a.getMoveActionConfig().m11999g()) {
            rectF3.set(0.0f, 0.0f, rectF2.width() * this.f7121a.getMoveActionConfig().m11995c(), rectF2.height() * this.f7121a.getMoveActionConfig().m11994b());
            Matrix matrix = new Matrix();
            C7792a c7792a2 = this.f7124d;
            if (c7792a2 != null) {
                matrix.postConcat(AbstractC7352m.m11777b(c7792a2.m13191e()));
                matrix.postConcat(c7792a2.m13188b());
            }
            matrix.mapRect(rectF3);
        } else {
            rectF3.setEmpty();
        }
        C7792a c7792a3 = this.f7124d;
        if (c7792a3 != null && (matrixM13188b = c7792a3.m13188b()) != null) {
            matrixM13188b.mapRect(rectF2);
        }
        if (z10 && !rectF3.isEmpty()) {
            rectF2.intersect(rectF3);
            rectF.intersect(rectF3);
        }
        Matrix matrix2 = new Matrix();
        C7792a c7792a4 = this.f7124d;
        if (c7792a4 != null) {
            matrix2.postConcat(c7792a4.m13188b());
        }
        int iWidth = (int) rectF.width();
        int iHeight = (int) rectF.height();
        if (z9) {
            matrix2.postTranslate(-rectF2.left, 0.0f);
            iWidth = (int) rectF2.width();
        } else if (iWidth < i12) {
            matrix2.postTranslate(((i12 - iWidth) / 2) - rectF.left, 0.0f);
            iWidth = i12;
        } else {
            matrix2.postTranslate(-rectF.left, 0.0f);
        }
        if (z11 && !rectF3.isEmpty()) {
            matrix2.postTranslate(0.0f, -rectF3.top);
            i14 = (int) (rectF.bottom - rectF3.top);
        } else if (iHeight < i13) {
            matrix2.postTranslate(0.0f, ((i13 - iHeight) / 2) - rectF.top);
            i14 = i13;
        } else {
            matrix2.postTranslate(0.0f, -rectF.top);
            i14 = iHeight;
        }
        if (iWidth <= 0 || i14 <= 0) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iWidth, i14, Bitmap.Config.ARGB_8888);
        this.f7129i = bitmapCreateBitmap;
        if (bitmapCreateBitmap != null) {
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            m6230o(canvas, matrix2);
            graph.mo6751q(canvas, matrix2, new Function1<InterfaceC8888c, Boolean>() { // from class: com.zykj.blackboard.core.canvas.control.DrawControl$getMinScreenShot$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(InterfaceC8888c it2) {
                    Intrinsics.checkNotNullParameter(it2, "it");
                    return Boolean.valueOf(Intrinsics.areEqual(it2, interfaceC8888c));
                }
            }, false, true);
        }
        return this.f7129i;
    }

    /* renamed from: z */
    public final RectF m6241z() {
        return this.f7122b;
    }
}
