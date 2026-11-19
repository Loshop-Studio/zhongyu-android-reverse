package com.zykj.blackboard.core.graph.group;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import ba.AbstractC5179a;
import ba.InterfaceC5180b;
import ba.InterfaceC5181c;
import ca.InterfaceC5413c;
import com.zykj.board.EzyGraphEnum;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import na.C10339b;
import p118da.C9007a;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes5.dex */
public class GroupGraph extends C9007a implements InterfaceC5413c {

    /* renamed from: i */
    public String f18546i;

    /* renamed from: j */
    public Integer f18547j;

    /* renamed from: k */
    public boolean f18548k;

    /* renamed from: l */
    public final RectF f18549l;

    /* renamed from: m */
    public Bitmap f18550m;

    /* renamed from: n */
    public Matrix f18551n;

    /* renamed from: o */
    public final Matrix f18552o;

    /* renamed from: p */
    public float f18553p;

    /* renamed from: q */
    public float f18554q;

    public /* synthetic */ GroupGraph(String str, RectF rectF, String str2, Integer num, int i10, AbstractC9972n abstractC9972n) {
        this(str, rectF, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : num);
    }

    /* renamed from: A */
    public final Matrix m14488A() {
        return this.f18551n;
    }

    /* renamed from: B */
    public final void m14489B(Canvas canvas) {
        Bitmap bitmap;
        Bitmap bitmap2 = this.f18550m;
        if (bitmap2 == null || bitmap2 == null || bitmap2.isRecycled() || (bitmap = this.f18550m) == null) {
            return;
        }
        RectF rectF = this.f18549l;
        canvas.drawBitmap(bitmap, rectF.left, rectF.top, (Paint) null);
    }

    /* renamed from: C */
    public final void m14490C(boolean z10) {
        this.f18548k = z10;
    }

    /* renamed from: D */
    public final void m14491D(boolean z10, Matrix matrix, InterfaceC9540l interfaceC9540l) {
        this.f18549l.set(mo2721j(matrix));
        if (!z10) {
            RectF rectF = new RectF(0.0f, 0.0f, this.f18553p, this.f18554q);
            if (!rectF.isEmpty()) {
                if (!this.f18549l.intersect(rectF)) {
                    Bitmap bitmap = this.f18550m;
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    this.f18550m = null;
                    return;
                }
                if (this.f18549l.width() == 0.0f || this.f18549l.height() == 0.0f) {
                    Bitmap bitmap2 = this.f18550m;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    this.f18550m = null;
                    return;
                }
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.f18549l.width()) + 1, ((int) this.f18549l.height()) + 1, Bitmap.Config.ARGB_8888);
        this.f18550m = bitmapCreateBitmap;
        if (bitmapCreateBitmap != null) {
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.save();
            RectF rectF2 = this.f18549l;
            canvas.translate(-rectF2.left, -rectF2.top);
            mo2731m(canvas, matrix);
            for (InterfaceC5181c it : mo2717f()) {
                AbstractC9979u.m20293f(it, "it");
                InterfaceC5180b.a.m2732a(it, canvas, matrix, interfaceC9540l, false, false, 24, null);
            }
            canvas.restore();
        }
    }

    @Override // p118da.C9007a, ba.InterfaceC5181c
    /* renamed from: c */
    public AbstractC5179a mo2733c() {
        GroupGraph groupGraph = new GroupGraph(getId(), new RectF(mo2718g()), null, null, 12, null);
        groupGraph.m2729u(mo2714b());
        Iterator it = mo2717f().iterator();
        while (it.hasNext()) {
            groupGraph.mo2727s(((InterfaceC5181c) it.next()).mo2733c());
        }
        return groupGraph;
    }

    @Override // ba.AbstractC5179a, ba.InterfaceC5182d
    /* renamed from: e */
    public void mo2716e(Matrix matrix) {
        AbstractC9979u.m20294g(matrix, "matrix");
        super.mo2716e(matrix);
        this.f18548k = true;
    }

    @Override // p118da.C9007a, ba.InterfaceC5181c
    public EzyGraphEnum.GraphEnum graphType() {
        return EzyGraphEnum.GraphEnum.GROUP_GRAPH;
    }

    @Override // ba.AbstractC5179a, ba.InterfaceC5182d
    /* renamed from: i */
    public void mo2720i(InterfaceC5181c graph) {
        AbstractC9979u.m20294g(graph, "graph");
        super.mo2720i(graph);
        this.f18548k = true;
    }

    @Override // ca.InterfaceC5413c
    /* renamed from: l */
    public void mo2876l(boolean z10) {
        this.f18548k = z10;
    }

    @Override // p118da.C9007a, ba.InterfaceC5180b
    /* renamed from: m */
    public void mo2731m(Canvas canvas, Matrix matrix) {
        AbstractC9979u.m20294g(canvas, "canvas");
        AbstractC9979u.m20294g(matrix, "matrix");
    }

    @Override // ba.AbstractC5179a, ba.InterfaceC5180b
    /* renamed from: o */
    public void mo2724o(Canvas canvas, Matrix matrix, InterfaceC9540l interfaceC9540l, boolean z10, boolean z11) {
        AbstractC9979u.m20294g(canvas, "canvas");
        AbstractC9979u.m20294g(matrix, "matrix");
        if (interfaceC9540l == null || !((Boolean) interfaceC9540l.invoke(this)).booleanValue()) {
            if (mo2715d().isEmpty() && mo2717f().isEmpty()) {
                Bitmap bitmap = this.f18550m;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.f18550m = null;
                return;
            }
            if (!AbstractC9979u.m20289b(this.f18552o, matrix)) {
                this.f18552o.set(matrix);
                this.f18548k = true;
            }
            Bitmap bitmap2 = this.f18550m;
            if (bitmap2 == null || ((bitmap2 != null && bitmap2.isRecycled()) || this.f18548k || z11)) {
                if (z10) {
                    this.f18553p = canvas.getWidth();
                    this.f18554q = canvas.getHeight();
                }
                m14491D(z11, matrix, interfaceC9540l);
                this.f18548k = false;
            }
            m14489B(canvas);
        }
    }

    @Override // ba.AbstractC5179a, ba.InterfaceC5181c
    public void onDestroy() {
        super.onDestroy();
        C10339b.f24642a.m21620a(new Bitmap[]{this.f18550m}, new InterfaceC9529a() { // from class: com.zykj.blackboard.core.graph.group.GroupGraph.onDestroy.1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m34011invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m34011invoke() {
                GroupGraph.this.f18550m = null;
            }
        });
    }

    /* renamed from: p */
    public void mo2875p(RectF newRectF) {
        AbstractC9979u.m20294g(newRectF, "newRectF");
        mo2718g().set(newRectF);
        mo2730v();
        this.f18548k = true;
    }

    @Override // ba.AbstractC5179a
    /* renamed from: s */
    public void mo2727s(InterfaceC5181c graph) {
        AbstractC9979u.m20294g(graph, "graph");
        super.mo2727s(graph);
        this.f18548k = true;
    }

    @Override // p118da.C9007a
    /* renamed from: w */
    public String mo2867w() {
        return this.f18546i;
    }

    @Override // p118da.C9007a
    /* renamed from: x */
    public Integer mo2868x() {
        return this.f18547j;
    }

    /* renamed from: z */
    public void m14492z(Matrix newMatrix) {
        AbstractC9979u.m20294g(newMatrix, "newMatrix");
        mo2714b().set(newMatrix);
        mo2730v();
        this.f18548k = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupGraph(String id2, RectF outRectF, String str, Integer num) {
        super(id2, outRectF, str, num);
        AbstractC9979u.m20294g(id2, "id");
        AbstractC9979u.m20294g(outRectF, "outRectF");
        this.f18546i = str;
        this.f18547j = num;
        this.f18549l = new RectF();
        this.f18551n = new Matrix();
        this.f18552o = new Matrix();
    }
}
