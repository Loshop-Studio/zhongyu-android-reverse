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
import ba.InterfaceC5180b;
import ba.InterfaceC5181c;
import ca.C5414d;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import na.AbstractC10351n;
import na.AbstractC10355r;
import na.C10339b;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p307q9.C10762b;
import p309qc.C10786q;
import p337s9.C11080a;
import p348t9.C11257d;
import p362u9.C11373a;
import p377v9.AbstractC11550a;
import p390w9.C11719h;
import p390w9.InterfaceC11712a;
import p390w9.InterfaceC11713b;
import p390w9.InterfaceC11714c;
import p390w9.InterfaceC11716e;
import p422y9.InterfaceC11937p;

/* loaded from: classes5.dex */
public final class DrawControl {

    /* renamed from: a */
    public final C10762b f17951a;

    /* renamed from: b */
    public final RectF f17952b;

    /* renamed from: c */
    public C11719h f17953c;

    /* renamed from: d */
    public C11373a f17954d;

    /* renamed from: e */
    public Bitmap f17955e;

    /* renamed from: f */
    public Canvas f17956f;

    /* renamed from: g */
    public Bitmap f17957g;

    /* renamed from: h */
    public Canvas f17958h;

    /* renamed from: i */
    public Bitmap f17959i;

    /* renamed from: j */
    public RectF f17960j;

    /* renamed from: k */
    public final Rect f17961k;

    /* renamed from: l */
    public Bitmap f17962l;

    /* renamed from: m */
    public Canvas f17963m;

    /* renamed from: n */
    public final RectF f17964n;

    /* renamed from: o */
    public final Matrix f17965o;

    /* renamed from: p */
    public final RectF f17966p;

    /* renamed from: q */
    public final Matrix f17967q;

    /* renamed from: r */
    public final Paint f17968r;

    /* renamed from: s */
    public final C8331a f17969s;

    /* renamed from: t */
    public final C11080a f17970t;

    /* renamed from: com.zykj.blackboard.core.canvas.control.DrawControl$a */
    public static final class C8331a implements InterfaceC11937p {
        public C8331a() {
        }

        @Override // p422y9.InterfaceC11937p
        /* renamed from: a */
        public void mo13953a(RectF renderRectF, RectF visibleRectF) {
            AbstractC9979u.m20294g(renderRectF, "renderRectF");
            AbstractC9979u.m20294g(visibleRectF, "visibleRectF");
        }

        @Override // p422y9.InterfaceC11937p
        /* renamed from: b */
        public void mo13954b(Matrix matrix) {
            AbstractC9979u.m20294g(matrix, "matrix");
            DrawControl.this.m13946t();
        }
    }

    public DrawControl(C10762b boardConfig) {
        AbstractC9979u.m20294g(boardConfig, "boardConfig");
        this.f17951a = boardConfig;
        this.f17952b = new RectF();
        this.f17960j = new RectF();
        this.f17961k = new Rect();
        this.f17964n = new RectF();
        this.f17965o = new Matrix();
        this.f17966p = new RectF();
        this.f17967q = new Matrix();
        Paint paint = new Paint();
        paint.setColor(-16776961);
        paint.setStrokeWidth(5.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setDither(true);
        paint.setAntiAlias(true);
        this.f17968r = paint;
        this.f17969s = new C8331a();
        this.f17970t = new C11080a(boardConfig);
    }

    /* renamed from: o */
    public static /* synthetic */ void m13909o(DrawControl drawControl, Matrix matrix, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            matrix = null;
        }
        drawControl.m13941n(matrix);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m13910A() {
        /*
            r3 = this;
            na.f r0 = na.C10343f.f24649a
            w9.h r1 = r3.f17953c
            if (r1 == 0) goto L23
            w9.b r1 = r1.m25945b()
            if (r1 == 0) goto L23
            int r1 = r1.getMyBackgroundColor()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = r1.intValue()
            if (r2 == 0) goto L1b
            goto L1c
        L1b:
            r1 = 0
        L1c:
            if (r1 == 0) goto L23
            int r1 = r1.intValue()
            goto L29
        L23:
            q9.b r1 = r3.f17951a
            int r1 = r1.m22898i()
        L29:
            boolean r0 = r0.m21631a(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.canvas.control.DrawControl.m13910A():boolean"); // DEX body: android/中育云笔记/smali_classes5/com/zykj/blackboard/core/canvas/control/DrawControl.smali:327
    }

    /* renamed from: B */
    public final void m13911B(RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, C11257d functionRectF, List typeList, PointF pointF) {
        AbstractC9979u.m20294g(selectRectF, "selectRectF");
        AbstractC9979u.m20294g(matrix, "matrix");
        AbstractC9979u.m20294g(selectFunctionRectF, "selectFunctionRectF");
        AbstractC9979u.m20294g(functionRectF, "functionRectF");
        AbstractC9979u.m20294g(typeList, "typeList");
        Path pathM24636g = this.f17970t.m24636g(selectRectF, typeList, matrix);
        if (!this.f17951a.m22872P()) {
            m13937j();
            Canvas canvas = this.f17958h;
            if (canvas != null) {
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                this.f17970t.m24631b(canvas, m13910A(), pathM24636g, functionRectF, typeList, pointF);
            }
            m13909o(this, null, 1, null);
            return;
        }
        RectF rectF = new RectF();
        pathM24636g.computeBounds(rectF, false);
        rectF.left -= 3.0f;
        rectF.top -= 3.0f;
        rectF.right += 3.0f;
        rectF.bottom += 3.0f;
        RectF rectF2 = new RectF();
        rectF2.union(rectF);
        rectF2.union(selectFunctionRectF);
        m13951y(rectF2);
        Canvas canvas2 = this.f17958h;
        if (canvas2 != null) {
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas2.save();
            canvas2.translate(-rectF2.left, -rectF2.top);
            this.f17970t.m24631b(canvas2, m13910A(), pathM24636g, functionRectF, typeList, pointF);
            canvas2.restore();
        }
        this.f17967q.setTranslate(rectF2.left, rectF2.top);
        m13941n(this.f17967q);
    }

    /* renamed from: C */
    public final void m13912C(float f10, float f11, float f12, float f13) {
        InterfaceC11712a interfaceC11712aM25944a;
        C11719h c11719h = this.f17953c;
        if (c11719h == null || (interfaceC11712aM25944a = c11719h.m25944a()) == null) {
            return;
        }
        interfaceC11712aM25944a.mo13959b(this.f17970t.m24633d(f10, f11, f12, f13), this.f17970t.m24632c(m13910A()), null);
    }

    /* renamed from: D */
    public final void m13913D(InterfaceC5181c rootGraph, RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, C11257d functionRectF, List typeList, PointF pointF) {
        AbstractC9979u.m20294g(rootGraph, "rootGraph");
        AbstractC9979u.m20294g(selectRectF, "selectRectF");
        AbstractC9979u.m20294g(matrix, "matrix");
        AbstractC9979u.m20294g(selectFunctionRectF, "selectFunctionRectF");
        AbstractC9979u.m20294g(functionRectF, "functionRectF");
        AbstractC9979u.m20294g(typeList, "typeList");
        Canvas canvas = this.f17956f;
        if (canvas != null) {
            AbstractC11550a.m25414a(canvas);
            C11373a c11373a = this.f17954d;
            if (c11373a != null) {
                InterfaceC5180b.a.m2732a(rootGraph, canvas, c11373a.m25311b(), null, false, this.f17951a.m22872P(), 8, null);
            }
        }
        m13943q();
        m13911B(selectRectF, matrix, selectFunctionRectF, functionRectF, typeList, pointF);
    }

    /* renamed from: E */
    public final void m13914E(InterfaceC5181c rootGraph, final InterfaceC5181c textGraph, RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, C11257d functionRectF, List typeList, PointF pointF) {
        AbstractC9979u.m20294g(rootGraph, "rootGraph");
        AbstractC9979u.m20294g(textGraph, "textGraph");
        AbstractC9979u.m20294g(selectRectF, "selectRectF");
        AbstractC9979u.m20294g(matrix, "matrix");
        AbstractC9979u.m20294g(selectFunctionRectF, "selectFunctionRectF");
        AbstractC9979u.m20294g(functionRectF, "functionRectF");
        AbstractC9979u.m20294g(typeList, "typeList");
        Canvas canvas = this.f17956f;
        if (canvas != null) {
            AbstractC11550a.m25414a(canvas);
            C11373a c11373a = this.f17954d;
            if (c11373a != null) {
                InterfaceC5180b.a.m2732a(rootGraph, canvas, c11373a.m25311b(), new InterfaceC9540l() { // from class: com.zykj.blackboard.core.canvas.control.DrawControl$newTextHandleStart$1$1$1
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke(InterfaceC5181c childGraph) {
                        AbstractC9979u.m20294g(childGraph, "childGraph");
                        return Boolean.valueOf(AbstractC9979u.m20289b(childGraph.getId(), textGraph.getId()));
                    }
                }, false, this.f17951a.m22872P(), 8, null);
            }
        }
        m13943q();
        m13915F(textGraph, selectRectF, matrix, selectFunctionRectF, functionRectF, typeList, pointF);
    }

    /* renamed from: F */
    public final void m13915F(InterfaceC5181c textGraph, RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, C11257d functionRectF, List typeList, PointF pointF) {
        RectF rectF;
        Matrix matrix2;
        AbstractC9979u.m20294g(textGraph, "textGraph");
        AbstractC9979u.m20294g(selectRectF, "selectRectF");
        AbstractC9979u.m20294g(matrix, "matrix");
        AbstractC9979u.m20294g(selectFunctionRectF, "selectFunctionRectF");
        AbstractC9979u.m20294g(functionRectF, "functionRectF");
        AbstractC9979u.m20294g(typeList, "typeList");
        Path pathM24636g = this.f17970t.m24636g(selectRectF, typeList, matrix);
        if (!this.f17951a.m22872P()) {
            m13937j();
            Canvas canvas = this.f17958h;
            if (canvas != null) {
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                C11373a c11373a = this.f17954d;
                if (c11373a != null) {
                    InterfaceC5180b.a.m2732a(textGraph, canvas, c11373a.m25311b(), null, false, false, 28, null);
                }
                this.f17970t.m24631b(canvas, m13910A(), pathM24636g, functionRectF, typeList, pointF);
            }
            m13909o(this, null, 1, null);
            return;
        }
        RectF rectF2 = new RectF();
        pathM24636g.computeBounds(rectF2, false);
        rectF2.left -= 3.0f;
        rectF2.top -= 3.0f;
        rectF2.right += 3.0f;
        rectF2.bottom += 3.0f;
        RectF rectF3 = new RectF();
        rectF3.union(rectF2);
        rectF3.union(selectFunctionRectF);
        m13951y(rectF3);
        Canvas canvas2 = this.f17958h;
        if (canvas2 != null) {
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas2.save();
            canvas2.translate(-rectF3.left, -rectF3.top);
            C11373a c11373a2 = this.f17954d;
            if (c11373a2 == null || (matrix2 = c11373a2.m25311b()) == null) {
                matrix2 = new Matrix();
            }
            InterfaceC5180b.a.m2732a(textGraph, canvas2, matrix2, null, false, true, 12, null);
            rectF = rectF3;
            this.f17970t.m24631b(canvas2, m13910A(), pathM24636g, functionRectF, typeList, pointF);
            canvas2.restore();
        } else {
            rectF = rectF3;
        }
        this.f17967q.setTranslate(rectF.left, rectF.top);
        m13941n(this.f17967q);
    }

    /* renamed from: G */
    public final void m13916G() {
        this.f17956f = null;
        this.f17958h = null;
        C10339b.f24642a.m21620a(new Bitmap[]{this.f17955e, this.f17957g, this.f17959i, this.f17962l}, new InterfaceC9529a() { // from class: com.zykj.blackboard.core.canvas.control.DrawControl$release$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m34004invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m34004invoke() {
                this.f17973c.f17955e = null;
                this.f17973c.f17957g = null;
                this.f17973c.f17959i = null;
                this.f17973c.f17962l = null;
            }
        });
        C11373a c11373a = this.f17954d;
        if (c11373a != null) {
            c11373a.m25322m(this.f17969s);
        }
    }

    /* renamed from: H */
    public final void m13917H(RectF rectF, List graphList) {
        Matrix matrix;
        AbstractC9979u.m20294g(rectF, "rectF");
        AbstractC9979u.m20294g(graphList, "graphList");
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
            InterfaceC5181c interfaceC5181c = (InterfaceC5181c) it.next();
            C11373a c11373a = this.f17954d;
            if (c11373a == null || (matrix = c11373a.m25311b()) == null) {
                matrix = new Matrix();
            }
            InterfaceC5180b.a.m2732a(interfaceC5181c, canvas, matrix, null, false, this.f17951a.m22872P(), 4, null);
        }
        Canvas canvas2 = this.f17956f;
        if (canvas2 != null) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            C10786q c10786q = C10786q.f26013a;
            canvas2.drawRect(rect, paint);
            canvas2.drawBitmap(bitmapCreateBitmap, new Rect(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight()), rect, (Paint) null);
        }
        m13943q();
    }

    /* renamed from: I */
    public final void m13918I() {
        C11719h c11719h = this.f17953c;
        if (c11719h != null) {
            c11719h.m25949f();
        }
    }

    /* renamed from: J */
    public final Bitmap m13919J(InterfaceC5181c graph) {
        Matrix matrixM25311b;
        InterfaceC11714c interfaceC11714cM25946c;
        AbstractC9979u.m20294g(graph, "graph");
        C11719h c11719h = this.f17953c;
        RectF rectF = new RectF((c11719h == null || (interfaceC11714cM25946c = c11719h.m25946c()) == null) ? null : interfaceC11714cM25946c.mo13968b());
        RectF rectF2 = new RectF();
        if (this.f17951a.m22919z().m22928g()) {
            rectF2.set(0.0f, 0.0f, rectF.width() * this.f17951a.m22919z().m22924c(), rectF.height() * this.f17951a.m22919z().m22923b());
            Matrix matrix = new Matrix();
            C11373a c11373a = this.f17954d;
            if (c11373a != null) {
                matrix.postConcat(AbstractC10351n.m21660b(c11373a.m25314e()));
                matrix.postConcat(c11373a.m25311b());
            }
            matrix.mapRect(rectF2);
        } else {
            rectF2.setEmpty();
        }
        if (!rectF2.isEmpty()) {
            rectF.intersect(rectF2);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) rectF.width()) + 1, ((int) rectF.height()) + 1, Bitmap.Config.ARGB_8888);
        this.f17959i = bitmapCreateBitmap;
        if (bitmapCreateBitmap != null) {
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            C11373a c11373a2 = this.f17954d;
            if (c11373a2 != null && (matrixM25311b = c11373a2.m25311b()) != null) {
                m13942p(canvas, matrixM25311b);
                InterfaceC5180b.a.m2732a(graph, canvas, matrixM25311b, null, false, false, 4, null);
            }
        }
        return this.f17959i;
    }

    /* renamed from: K */
    public final void m13920K(Path path, Paint paint) {
        AbstractC9979u.m20294g(path, "path");
        if (!this.f17951a.m22872P()) {
            m13937j();
            Canvas canvas = this.f17958h;
            if (canvas != null) {
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                if (paint == null) {
                    paint = this.f17968r;
                }
                canvas.drawPath(path, paint);
            }
            m13909o(this, null, 1, null);
            return;
        }
        if (paint == null) {
            paint = this.f17968r;
        }
        RectF rectF = new RectF();
        path.computeBounds(rectF, false);
        rectF.left -= paint.getStrokeWidth();
        rectF.top -= paint.getStrokeWidth();
        rectF.right += paint.getStrokeWidth();
        rectF.bottom += paint.getStrokeWidth();
        m13951y(rectF);
        Canvas canvas2 = this.f17958h;
        if (canvas2 != null) {
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas2.save();
            canvas2.translate(-rectF.left, -rectF.top);
            canvas2.drawPath(path, paint);
            canvas2.restore();
        }
        this.f17967q.setTranslate(rectF.left, rectF.top);
        m13941n(this.f17967q);
    }

    /* renamed from: L */
    public final void m13921L() {
        InterfaceC11712a interfaceC11712aM25944a;
        if (this.f17951a.m22872P()) {
            m13938k();
        }
        C11719h c11719h = this.f17953c;
        if (c11719h == null || (interfaceC11712aM25944a = c11719h.m25944a()) == null) {
            return;
        }
        interfaceC11712aM25944a.clear();
    }

    /* renamed from: M */
    public final void m13922M(int i10) {
        InterfaceC11713b interfaceC11713bM25945b;
        InterfaceC11713b interfaceC11713bM25945b2;
        C11719h c11719h = this.f17953c;
        if (c11719h != null && (interfaceC11713bM25945b2 = c11719h.m25945b()) != null) {
            interfaceC11713bM25945b2.setMyBackgroundColor(i10);
        }
        C11719h c11719h2 = this.f17953c;
        if (c11719h2 == null || (interfaceC11713bM25945b = c11719h2.m25945b()) == null) {
            return;
        }
        interfaceC11713bM25945b.refresh();
    }

    /* renamed from: N */
    public final void m13923N(BackgroundLineConfig backgroundLineConfig) {
        InterfaceC11713b interfaceC11713bM25945b;
        InterfaceC11713b interfaceC11713bM25945b2;
        AbstractC9979u.m20294g(backgroundLineConfig, "backgroundLineConfig");
        C11719h c11719h = this.f17953c;
        if (c11719h != null && (interfaceC11713bM25945b2 = c11719h.m25945b()) != null) {
            interfaceC11713bM25945b2.setBackgroundLineConfig(backgroundLineConfig);
        }
        C11719h c11719h2 = this.f17953c;
        if (c11719h2 == null || (interfaceC11713bM25945b = c11719h2.m25945b()) == null) {
            return;
        }
        interfaceC11713bM25945b.refresh();
    }

    /* renamed from: O */
    public final void m13924O(C11373a matrixAdapter) {
        AbstractC9979u.m20294g(matrixAdapter, "matrixAdapter");
        this.f17954d = matrixAdapter;
        matrixAdapter.m25317h(this.f17969s);
    }

    /* renamed from: P */
    public final void m13925P(C11719h renderLayer) {
        AbstractC9979u.m20294g(renderLayer, "renderLayer");
        this.f17953c = renderLayer;
        this.f17961k.set(renderLayer.m25948e());
        if (!this.f17961k.isEmpty()) {
            this.f17955e = Bitmap.createBitmap(this.f17961k.width(), this.f17961k.height(), Bitmap.Config.ARGB_8888);
            Bitmap bitmap = this.f17955e;
            AbstractC9979u.m20291d(bitmap);
            this.f17956f = new Canvas(bitmap);
        }
        m13946t();
    }

    /* renamed from: Q */
    public final void m13926Q(C5414d graph, Path path, Paint paint) {
        AbstractC9979u.m20294g(graph, "graph");
        Paint paint2 = paint == null ? this.f17968r : paint;
        RectF rectF = new RectF();
        if (path != null) {
            path.computeBounds(rectF, false);
            rectF.left -= paint2.getStrokeWidth();
            rectF.top -= paint2.getStrokeWidth();
            rectF.right += paint2.getStrokeWidth();
            rectF.bottom += paint2.getStrokeWidth();
        } else {
            C11373a c11373a = this.f17954d;
            rectF.set(graph.mo2721j(c11373a != null ? c11373a.m25311b() : null));
        }
        m13951y(rectF);
        Canvas canvas = this.f17958h;
        if (canvas != null) {
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas.save();
            canvas.translate(-rectF.left, -rectF.top);
            C11373a c11373a2 = this.f17954d;
            if (c11373a2 != null) {
                InterfaceC5180b.a.m2732a(graph, canvas, c11373a2.m25311b(), null, false, this.f17951a.m22872P(), 4, null);
            }
            if (path != null) {
                if (paint == null) {
                    paint = this.f17968r;
                }
                canvas.drawPath(path, paint);
            }
            canvas.restore();
        }
        this.f17965o.setTranslate(rectF.left, rectF.top);
        m13941n(this.f17965o);
    }

    /* renamed from: R */
    public final void m13927R(InterfaceC5181c rootGraph, Path path, Paint paint) {
        InterfaceC11712a interfaceC11712aM25944a;
        AbstractC9979u.m20294g(rootGraph, "rootGraph");
        Canvas canvas = this.f17956f;
        if (canvas != null) {
            AbstractC11550a.m25414a(canvas);
            C11373a c11373a = this.f17954d;
            if (c11373a != null) {
                InterfaceC5180b.a.m2732a(rootGraph, canvas, c11373a.m25311b(), null, false, this.f17951a.m22872P(), 4, null);
            }
        }
        m13943q();
        if (path == null) {
            m13938k();
            C11719h c11719h = this.f17953c;
            if (c11719h == null || (interfaceC11712aM25944a = c11719h.m25944a()) == null) {
                return;
            }
            interfaceC11712aM25944a.clear();
            return;
        }
        if (paint == null) {
            paint = this.f17968r;
        }
        RectF rectF = new RectF();
        path.computeBounds(rectF, false);
        rectF.left -= paint.getStrokeWidth();
        rectF.top -= paint.getStrokeWidth();
        rectF.right += paint.getStrokeWidth();
        rectF.bottom += paint.getStrokeWidth();
        m13951y(rectF);
        Canvas canvas2 = this.f17958h;
        if (canvas2 != null) {
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas2.save();
            canvas2.translate(-rectF.left, -rectF.top);
            canvas2.drawPath(path, paint);
            canvas2.restore();
        }
        Matrix matrix = this.f17967q;
        matrix.setTranslate(rectF.left, rectF.top);
        m13941n(matrix);
    }

    /* renamed from: S */
    public final void m13928S(InterfaceC5181c rootGraph, final C5414d graph, Path path, Paint paint) {
        AbstractC9979u.m20294g(rootGraph, "rootGraph");
        AbstractC9979u.m20294g(graph, "graph");
        Canvas canvas = this.f17956f;
        if (canvas != null) {
            AbstractC11550a.m25414a(canvas);
            C11373a c11373a = this.f17954d;
            if (c11373a != null) {
                InterfaceC5180b.a.m2732a(rootGraph, canvas, c11373a.m25311b(), new InterfaceC9540l() { // from class: com.zykj.blackboard.core.canvas.control.DrawControl$textHandleStart$1$1$1
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke(InterfaceC5181c childGraph) {
                        AbstractC9979u.m20294g(childGraph, "childGraph");
                        return Boolean.valueOf(AbstractC9979u.m20289b(childGraph.getId(), graph.getId()));
                    }
                }, false, false, 24, null);
            }
        }
        m13943q();
        Paint paint2 = paint == null ? this.f17968r : paint;
        RectF rectF = new RectF();
        if (path != null) {
            path.computeBounds(rectF, false);
            rectF.left -= paint2.getStrokeWidth();
            rectF.top -= paint2.getStrokeWidth();
            rectF.right += paint2.getStrokeWidth();
            rectF.bottom += paint2.getStrokeWidth();
        } else {
            C11373a c11373a2 = this.f17954d;
            graph.mo2721j(c11373a2 != null ? c11373a2.m25311b() : null);
        }
        m13951y(rectF);
        Canvas canvas2 = this.f17958h;
        if (canvas2 != null) {
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas2.save();
            canvas2.translate(-rectF.left, -rectF.top);
            C11373a c11373a3 = this.f17954d;
            if (c11373a3 != null) {
                InterfaceC5180b.a.m2732a(graph, canvas2, c11373a3.m25311b(), null, false, this.f17951a.m22872P(), 4, null);
            }
            if (path != null) {
                if (paint == null) {
                    paint = this.f17968r;
                }
                canvas2.drawPath(path, paint);
            }
            canvas2.restore();
        }
        this.f17965o.setTranslate(rectF.left, rectF.top);
        m13941n(this.f17965o);
    }

    /* renamed from: T */
    public final void m13929T(Matrix matrix) {
        AbstractC9979u.m20294g(matrix, "matrix");
        if (!this.f17951a.m22872P()) {
            m13941n(matrix);
            return;
        }
        Matrix matrix2 = new Matrix();
        matrix2.set(this.f17965o);
        matrix2.postConcat(matrix);
        m13941n(matrix2);
    }

    /* renamed from: U */
    public final void m13930U(InterfaceC5181c rootGraph, Path path, Paint paint) {
        InterfaceC11712a interfaceC11712aM25944a;
        AbstractC9979u.m20294g(rootGraph, "rootGraph");
        Canvas canvas = this.f17956f;
        if (canvas != null) {
            AbstractC11550a.m25414a(canvas);
            C11373a c11373a = this.f17954d;
            if (c11373a != null) {
                InterfaceC5180b.a.m2732a(rootGraph, canvas, c11373a.m25311b(), null, false, this.f17951a.m22872P(), 12, null);
            }
        }
        m13943q();
        if (!this.f17951a.m22872P()) {
            m13937j();
            Canvas canvas2 = this.f17958h;
            if (canvas2 != null) {
                canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                if (path != null) {
                    if (paint == null) {
                        paint = this.f17968r;
                    }
                    canvas2.drawPath(path, paint);
                }
            }
            m13909o(this, null, 1, null);
            return;
        }
        if (path == null) {
            m13938k();
            C11719h c11719h = this.f17953c;
            if (c11719h == null || (interfaceC11712aM25944a = c11719h.m25944a()) == null) {
                return;
            }
            interfaceC11712aM25944a.clear();
            return;
        }
        if (paint == null) {
            paint = this.f17968r;
        }
        RectF rectF = new RectF();
        path.computeBounds(rectF, false);
        rectF.left -= paint.getStrokeWidth();
        rectF.top -= paint.getStrokeWidth();
        rectF.right += paint.getStrokeWidth();
        rectF.bottom += paint.getStrokeWidth();
        m13951y(rectF);
        Canvas canvas3 = this.f17958h;
        if (canvas3 != null) {
            canvas3.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas3.save();
            canvas3.translate(-rectF.left, -rectF.top);
            canvas3.drawPath(path, paint);
            canvas3.restore();
        }
        Matrix matrix = this.f17967q;
        matrix.setTranslate(rectF.left, rectF.top);
        m13941n(matrix);
    }

    /* renamed from: V */
    public final void m13931V(InterfaceC5181c rootGraph, final List graphList, Path path, Paint paint) {
        AbstractC9979u.m20294g(rootGraph, "rootGraph");
        AbstractC9979u.m20294g(graphList, "graphList");
        Canvas canvas = this.f17956f;
        if (canvas != null) {
            AbstractC11550a.m25414a(canvas);
            C11373a c11373a = this.f17954d;
            if (c11373a != null) {
                InterfaceC5180b.a.m2732a(rootGraph, canvas, c11373a.m25311b(), new InterfaceC9540l() { // from class: com.zykj.blackboard.core.canvas.control.DrawControl$transGraphStart$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke(InterfaceC5181c childGraph) {
                        AbstractC9979u.m20294g(childGraph, "childGraph");
                        List list = graphList;
                        boolean z10 = false;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                if (AbstractC9979u.m20289b(childGraph.getId(), ((InterfaceC5181c) it.next()).getId())) {
                                    z10 = true;
                                    break;
                                }
                            }
                        }
                        return Boolean.valueOf(z10);
                    }
                }, false, this.f17951a.m22872P(), 8, null);
            }
        }
        m13943q();
        if (!this.f17951a.m22872P()) {
            m13937j();
            Canvas canvas2 = this.f17958h;
            if (canvas2 != null) {
                canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                Iterator it = graphList.iterator();
                while (it.hasNext()) {
                    InterfaceC5181c interfaceC5181c = (InterfaceC5181c) it.next();
                    C11373a c11373a2 = this.f17954d;
                    if (c11373a2 != null) {
                        InterfaceC5180b.a.m2732a(interfaceC5181c, canvas2, c11373a2.m25311b(), null, false, false, 28, null);
                    }
                }
                if (path != null) {
                    canvas2.drawPath(path, paint == null ? this.f17968r : paint);
                }
            }
            m13909o(this, null, 1, null);
            return;
        }
        Paint paint2 = paint == null ? this.f17968r : paint;
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
                InterfaceC5181c interfaceC5181c2 = (InterfaceC5181c) it2.next();
                C11373a c11373a3 = this.f17954d;
                rectF.union(interfaceC5181c2.mo2721j(c11373a3 != null ? c11373a3.m25311b() : null));
            }
        }
        m13951y(rectF);
        Canvas canvas3 = this.f17958h;
        if (canvas3 != null) {
            canvas3.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas3.save();
            canvas3.translate(-rectF.left, -rectF.top);
            Iterator it3 = graphList.iterator();
            while (it3.hasNext()) {
                InterfaceC5181c interfaceC5181c3 = (InterfaceC5181c) it3.next();
                C11373a c11373a4 = this.f17954d;
                if (c11373a4 != null) {
                    InterfaceC5180b.a.m2732a(interfaceC5181c3, canvas3, c11373a4.m25311b(), null, false, true, 12, null);
                }
            }
            if (path != null) {
                canvas3.drawPath(path, paint == null ? this.f17968r : paint);
            }
            canvas3.restore();
        }
        this.f17965o.setTranslate(rectF.left, rectF.top);
        m13941n(this.f17965o);
    }

    /* renamed from: W */
    public final void m13932W(Matrix matrix) {
        InterfaceC11713b interfaceC11713bM25945b;
        AbstractC9979u.m20294g(matrix, "matrix");
        C11719h c11719h = this.f17953c;
        if (c11719h == null || (interfaceC11713bM25945b = c11719h.m25945b()) == null) {
            return;
        }
        interfaceC11713bM25945b.setMatrix(matrix);
    }

    /* renamed from: f */
    public final void m13933f(InterfaceC5181c graph) {
        InterfaceC11712a interfaceC11712aM25944a;
        C11373a c11373a;
        AbstractC9979u.m20294g(graph, "graph");
        Canvas canvas = this.f17956f;
        if (canvas != null && (c11373a = this.f17954d) != null) {
            graph.mo2731m(canvas, c11373a.m25311b());
        }
        Log.i("DrawView", "开始绘制");
        m13943q();
        C11719h c11719h = this.f17953c;
        if (c11719h == null || (interfaceC11712aM25944a = c11719h.m25944a()) == null) {
            return;
        }
        interfaceC11712aM25944a.clear();
    }

    /* renamed from: g */
    public final void m13934g(InterfaceC5181c rootGraph) {
        Matrix matrixM25311b;
        InterfaceC11712a interfaceC11712aM25944a;
        AbstractC9979u.m20294g(rootGraph, "rootGraph");
        Canvas canvas = this.f17956f;
        if (canvas != null) {
            AbstractC11550a.m25414a(canvas);
            C11373a c11373a = this.f17954d;
            if (c11373a != null) {
                InterfaceC5180b.a.m2732a(rootGraph, canvas, c11373a.m25311b(), null, false, this.f17951a.m22872P(), 12, null);
            }
        }
        m13943q();
        if (this.f17951a.m22872P()) {
            m13938k();
            C11719h c11719h = this.f17953c;
            if (c11719h != null && (interfaceC11712aM25944a = c11719h.m25944a()) != null) {
                interfaceC11712aM25944a.clear();
            }
        } else {
            m13937j();
            Canvas canvas2 = this.f17958h;
            if (canvas2 != null) {
                canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            }
            m13909o(this, null, 1, null);
        }
        C11373a c11373a2 = this.f17954d;
        if (c11373a2 == null || (matrixM25311b = c11373a2.m25311b()) == null) {
            return;
        }
        m13932W(matrixM25311b);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13935h(ba.InterfaceC5181c r7) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.canvas.control.DrawControl.m13935h(ba.c):void"); // DEX body: android/中育云笔记/smali_classes5/com/zykj/blackboard/core/canvas/control/DrawControl.smali:5577
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00bb  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13936i(android.graphics.Matrix r8) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.canvas.control.DrawControl.m13936i(android.graphics.Matrix):void"); // DEX body: android/中育云笔记/smali_classes5/com/zykj/blackboard/core/canvas/control/DrawControl.smali:6045
    }

    /* renamed from: j */
    public final void m13937j() {
        Bitmap bitmap = this.f17957g;
        if (bitmap != null) {
            AbstractC9979u.m20291d(bitmap);
            if (!bitmap.isRecycled()) {
                Bitmap bitmap2 = this.f17957g;
                AbstractC9979u.m20291d(bitmap2);
                if (bitmap2.getWidth() == this.f17961k.width()) {
                    Bitmap bitmap3 = this.f17957g;
                    AbstractC9979u.m20291d(bitmap3);
                    if (bitmap3.getHeight() == this.f17961k.height()) {
                        return;
                    }
                }
            }
        }
        m13951y(new RectF(this.f17961k));
    }

    /* renamed from: k */
    public final void m13938k() {
        Bitmap bitmap = this.f17957g;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f17957g = null;
        this.f17958h = null;
    }

    /* renamed from: l */
    public final Bitmap m13939l(InterfaceC5181c graph) {
        Matrix matrixM25314e;
        InterfaceC11714c interfaceC11714cM25946c;
        AbstractC9979u.m20294g(graph, "graph");
        RectF rectF = new RectF();
        Iterator it = graph.mo2717f().iterator();
        while (true) {
            Matrix matrixM25314e2 = null;
            if (!it.hasNext()) {
                break;
            }
            InterfaceC5181c interfaceC5181c = (InterfaceC5181c) it.next();
            C11373a c11373a = this.f17954d;
            if (c11373a != null) {
                matrixM25314e2 = c11373a.m25314e();
            }
            rectF.union(interfaceC5181c.mo2721j(matrixM25314e2));
        }
        C11719h c11719h = this.f17953c;
        RectF rectF2 = new RectF((c11719h == null || (interfaceC11714cM25946c = c11719h.m25946c()) == null) ? null : interfaceC11714cM25946c.mo13968b());
        RectF rectF3 = new RectF();
        if (this.f17951a.m22919z().m22928g()) {
            rectF3.set(0.0f, 0.0f, rectF2.width() * this.f17951a.m22919z().m22924c(), rectF2.height() * this.f17951a.m22919z().m22923b());
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
        C11373a c11373a2 = this.f17954d;
        if (c11373a2 != null && (matrixM25314e = c11373a2.m25314e()) != null) {
            m13942p(canvas, matrixM25314e);
            graph.mo2724o(canvas, matrixM25314e, null, false, true);
        }
        return bitmapCreateBitmap;
    }

    /* renamed from: m */
    public final void m13940m(InterfaceC5181c rootGraph) {
        Matrix matrix;
        AbstractC9979u.m20294g(rootGraph, "rootGraph");
        Canvas canvas = this.f17956f;
        if (canvas != null) {
            AbstractC11550a.m25414a(canvas);
            C11373a c11373a = this.f17954d;
            if (c11373a == null || (matrix = c11373a.m25311b()) == null) {
                matrix = new Matrix();
            }
            InterfaceC5180b.a.m2732a(rootGraph, canvas, matrix, null, false, this.f17951a.m22872P(), 12, null);
        }
        m13943q();
    }

    /* renamed from: n */
    public final void m13941n(Matrix matrix) {
        C11719h c11719h;
        InterfaceC11712a interfaceC11712aM25944a;
        Bitmap bitmap = this.f17957g;
        if (bitmap == null || (c11719h = this.f17953c) == null || (interfaceC11712aM25944a = c11719h.m25944a()) == null) {
            return;
        }
        interfaceC11712aM25944a.mo13958a(bitmap, matrix);
    }

    /* renamed from: p */
    public final void m13942p(Canvas canvas, Matrix matrix) {
        InterfaceC11713b interfaceC11713bM25945b;
        C11719h c11719h = this.f17953c;
        if (c11719h == null || (interfaceC11713bM25945b = c11719h.m25945b()) == null) {
            return;
        }
        interfaceC11713bM25945b.mo13961a(canvas, matrix);
    }

    /* renamed from: q */
    public final void m13943q() {
        C11719h c11719h;
        InterfaceC11714c interfaceC11714cM25946c;
        Bitmap bitmap = this.f17955e;
        if (bitmap == null || (c11719h = this.f17953c) == null || (interfaceC11714cM25946c = c11719h.m25946c()) == null) {
            return;
        }
        interfaceC11714cM25946c.mo13967a(bitmap);
    }

    /* renamed from: r */
    public final void m13944r(List graphList) {
        Matrix matrix;
        AbstractC9979u.m20294g(graphList, "graphList");
        Canvas canvas = this.f17958h;
        if (canvas != null) {
            Iterator it = graphList.iterator();
            while (it.hasNext()) {
                InterfaceC5181c interfaceC5181c = (InterfaceC5181c) it.next();
                C11373a c11373a = this.f17954d;
                if (c11373a == null || (matrix = c11373a.m25311b()) == null) {
                    matrix = new Matrix();
                }
                InterfaceC5180b.a.m2732a(interfaceC5181c, canvas, matrix, null, false, this.f17951a.m22872P(), 12, null);
            }
        }
        m13909o(this, null, 1, null);
    }

    /* renamed from: s */
    public final void m13945s(List graphList) {
        Matrix matrix;
        AbstractC9979u.m20294g(graphList, "graphList");
        Canvas canvas = this.f17956f;
        if (canvas != null) {
            AbstractC11550a.m25414a(canvas);
            Iterator it = graphList.iterator();
            while (it.hasNext()) {
                InterfaceC5181c interfaceC5181c = (InterfaceC5181c) it.next();
                C11373a c11373a = this.f17954d;
                if (c11373a == null || (matrix = c11373a.m25311b()) == null) {
                    matrix = new Matrix();
                }
                InterfaceC5180b.a.m2732a(interfaceC5181c, canvas, matrix, null, false, this.f17951a.m22872P(), 12, null);
            }
        }
        m13943q();
    }

    /* renamed from: t */
    public final void m13946t() {
        InterfaceC11716e interfaceC11716eM25947d;
        InterfaceC11716e interfaceC11716eM25947d2;
        InterfaceC11716e interfaceC11716eM25947d3;
        float fIntValue;
        float fIntValue2;
        Rect rectM25948e;
        Rect rectM25948e2;
        if (this.f17951a.m22919z().m22928g()) {
            if (this.f17952b.isEmpty()) {
                C11719h c11719h = this.f17953c;
                Integer numValueOf = null;
                Integer numValueOf2 = (c11719h == null || (rectM25948e2 = c11719h.m25948e()) == null) ? null : Integer.valueOf(rectM25948e2.width());
                AbstractC9979u.m20291d(numValueOf2);
                fIntValue = numValueOf2.intValue();
                C11719h c11719h2 = this.f17953c;
                if (c11719h2 != null && (rectM25948e = c11719h2.m25948e()) != null) {
                    numValueOf = Integer.valueOf(rectM25948e.height());
                }
                AbstractC9979u.m20291d(numValueOf);
                fIntValue2 = numValueOf.intValue();
            } else {
                fIntValue = this.f17952b.width();
                fIntValue2 = this.f17952b.height();
            }
            this.f17960j.set(0.0f, 0.0f, fIntValue * this.f17951a.m22919z().m22924c(), fIntValue2 * this.f17951a.m22919z().m22923b());
        } else {
            this.f17960j.setEmpty();
        }
        if (this.f17960j.isEmpty()) {
            C11719h c11719h3 = this.f17953c;
            if (c11719h3 == null || (interfaceC11716eM25947d3 = c11719h3.m25947d()) == null) {
                return;
            }
            interfaceC11716eM25947d3.hide();
            return;
        }
        this.f17966p.set(this.f17960j);
        Matrix matrix = this.f17967q;
        matrix.reset();
        C11373a c11373a = this.f17954d;
        if (c11373a != null) {
            if (this.f17952b.isEmpty()) {
                matrix.postConcat(AbstractC10351n.m21660b(c11373a.m25314e()));
                matrix.postConcat(c11373a.m25311b());
            } else {
                matrix.postConcat(c11373a.m25311b());
            }
        }
        this.f17967q.mapRect(this.f17966p);
        if (!this.f17966p.intersect(AbstractC10355r.m21677a(this.f17961k))) {
            C11719h c11719h4 = this.f17953c;
            if (c11719h4 == null || (interfaceC11716eM25947d2 = c11719h4.m25947d()) == null) {
                return;
            }
            interfaceC11716eM25947d2.hide();
            return;
        }
        C11719h c11719h5 = this.f17953c;
        if (c11719h5 == null || (interfaceC11716eM25947d = c11719h5.m25947d()) == null) {
            return;
        }
        interfaceC11716eM25947d.show();
        interfaceC11716eM25947d.mo13974a(this.f17966p);
        interfaceC11716eM25947d.refresh();
    }

    /* renamed from: u */
    public final void m13947u(Path path, Paint paint, Matrix matrix) {
        InterfaceC11712a interfaceC11712aM25944a;
        AbstractC9979u.m20294g(path, "path");
        AbstractC9979u.m20294g(paint, "paint");
        C11719h c11719h = this.f17953c;
        if (c11719h == null || (interfaceC11712aM25944a = c11719h.m25944a()) == null) {
            return;
        }
        interfaceC11712aM25944a.mo13959b(path, paint, matrix);
    }

    /* renamed from: v */
    public final int m13948v() {
        InterfaceC11713b interfaceC11713bM25945b;
        C11719h c11719h = this.f17953c;
        if (c11719h == null || (interfaceC11713bM25945b = c11719h.m25945b()) == null) {
            return -1;
        }
        return interfaceC11713bM25945b.getMyBackgroundColor();
    }

    /* renamed from: w */
    public final BackgroundLineConfig m13949w() {
        InterfaceC11713b interfaceC11713bM25945b;
        BackgroundLineConfig backgroundLineConfig;
        C11719h c11719h = this.f17953c;
        return (c11719h == null || (interfaceC11713bM25945b = c11719h.m25945b()) == null || (backgroundLineConfig = interfaceC11713bM25945b.getBackgroundLineConfig()) == null) ? new BackgroundLineConfig(0, 0.0f, null, 0.0f, 15, null) : backgroundLineConfig;
    }

    /* renamed from: x */
    public final RectF m13950x() {
        return this.f17952b;
    }

    /* renamed from: y */
    public final void m13951y(RectF rectF) {
        Bitmap bitmap = this.f17957g;
        if (bitmap != null) {
            bitmap.recycle();
        }
        if (rectF.isEmpty()) {
            return;
        }
        this.f17957g = Bitmap.createBitmap((int) rectF.width(), (int) rectF.height(), Bitmap.Config.ARGB_8888);
        Bitmap bitmap2 = this.f17957g;
        AbstractC9979u.m20291d(bitmap2);
        this.f17958h = new Canvas(bitmap2);
    }

    /* renamed from: z */
    public final void m13952z(InterfaceC5181c interfaceC5181c) {
        Matrix matrix;
        RectF rectF = this.f17964n;
        rectF.setEmpty();
        Iterator it = interfaceC5181c.mo2717f().iterator();
        while (true) {
            Matrix matrixM25311b = null;
            if (!it.hasNext()) {
                break;
            }
            InterfaceC5181c interfaceC5181c2 = (InterfaceC5181c) it.next();
            C11373a c11373a = this.f17954d;
            if (c11373a != null) {
                matrixM25311b = c11373a.m25311b();
            }
            rectF.union(interfaceC5181c2.mo2721j(matrixM25311b));
        }
        Bitmap bitmap = this.f17962l;
        if (bitmap != null) {
            bitmap.recycle();
        }
        if (this.f17964n.isEmpty()) {
            this.f17962l = null;
            this.f17963m = null;
        } else {
            this.f17962l = Bitmap.createBitmap((int) this.f17964n.width(), (int) this.f17964n.height(), Bitmap.Config.ARGB_8888);
            Bitmap bitmap2 = this.f17962l;
            AbstractC9979u.m20291d(bitmap2);
            this.f17963m = new Canvas(bitmap2);
        }
        Canvas canvas = this.f17963m;
        if (canvas != null) {
            canvas.save();
            RectF rectF2 = this.f17964n;
            canvas.translate(-rectF2.left, -rectF2.top);
            C11373a c11373a2 = this.f17954d;
            if (c11373a2 == null || (matrix = c11373a2.m25311b()) == null) {
                matrix = new Matrix();
            }
            InterfaceC5180b.a.m2732a(interfaceC5181c, canvas, matrix, null, false, true, 12, null);
            canvas.restore();
        }
    }
}
