package ba;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyPageSnapshot;
import com.zykj.board.EzyRectF;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AbstractC9979u;
import na.AbstractC10351n;
import p181hd.InterfaceC9540l;

/* renamed from: ba.a */
/* loaded from: classes5.dex */
public abstract class AbstractC5179a implements InterfaceC5181c {

    /* renamed from: a */
    public final String f3045a;

    /* renamed from: b */
    public final RectF f3046b;

    /* renamed from: c */
    public InterfaceC5181c f3047c;

    /* renamed from: d */
    public CopyOnWriteArrayList f3048d;

    /* renamed from: e */
    public final Matrix f3049e;

    /* renamed from: f */
    public final RectF f3050f;

    public AbstractC5179a(String id2, RectF originalRectF) {
        AbstractC9979u.m20294g(id2, "id");
        AbstractC9979u.m20294g(originalRectF, "originalRectF");
        this.f3045a = id2;
        this.f3046b = originalRectF;
        this.f3048d = new CopyOnWriteArrayList();
        this.f3049e = new Matrix();
        this.f3050f = new RectF(originalRectF);
    }

    @Override // ba.InterfaceC5182d
    /* renamed from: a */
    public void mo2713a(ImageGraph graph) {
        int iNextIndex;
        AbstractC9979u.m20294g(graph, "graph");
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3048d;
        if (copyOnWriteArrayList != null) {
            ListIterator listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                } else if (((InterfaceC5181c) listIterator.previous()) instanceof ImageGraph) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            if (iNextIndex == -1) {
                copyOnWriteArrayList.add(0, graph);
            } else {
                copyOnWriteArrayList.add(iNextIndex, graph);
            }
        }
        graph.mo2726r(this);
    }

    @Override // ba.InterfaceC5181c
    /* renamed from: b */
    public Matrix mo2714b() {
        return this.f3049e;
    }

    @Override // ba.InterfaceC5181c
    /* renamed from: d */
    public RectF mo2715d() {
        return this.f3050f;
    }

    @Override // ba.InterfaceC5182d
    /* renamed from: e */
    public void mo2716e(Matrix matrix) {
        AbstractC9979u.m20294g(matrix, "matrix");
        this.f3049e.postConcat(matrix);
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3048d;
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC5181c) it.next()).mo2716e(matrix);
            }
        }
        mo2730v();
    }

    @Override // ba.InterfaceC5181c
    /* renamed from: g */
    public RectF mo2718g() {
        return this.f3046b;
    }

    @Override // ba.InterfaceC5181c
    public String getId() {
        return this.f3045a;
    }

    @Override // ba.InterfaceC5181c
    public InterfaceC5181c getParent() {
        return this.f3047c;
    }

    @Override // ba.InterfaceC5181c
    public EzyPageSnapshot.PageSnapshot.GraphSnapshot.C8496b getSnapshot() {
        EzyPageSnapshot.PageSnapshot.GraphSnapshot.C8496b builder = EzyPageSnapshot.PageSnapshot.GraphSnapshot.m15601V();
        builder.m15652O(getId());
        builder.m15650M(graphType());
        builder.m15654Q(EzyRectF.RectF.m15793k().m15814r(this.f3046b.left).m15817u(this.f3046b.top).m15816t(this.f3046b.right).m15812p(this.f3046b.bottom).build());
        builder.m15653P(AbstractC10351n.m21664f(this.f3049e, 0L));
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3048d;
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                builder.m15661d(((InterfaceC5181c) it.next()).getSnapshot());
            }
        }
        AbstractC9979u.m20293f(builder, "builder");
        return builder;
    }

    @Override // ba.InterfaceC5181c
    /* renamed from: h */
    public EzyCommand.CommandSource.CommandInfo.GraphData.C8462b mo2719h() {
        EzyCommand.CommandSource.CommandInfo.GraphData.C8462b builder = EzyCommand.CommandSource.CommandInfo.GraphData.m14978I();
        builder.m15034x(getId());
        builder.m15032v(graphType());
        builder.m15035y(EzyRectF.RectF.m15793k().m15814r(this.f3046b.left).m15817u(this.f3046b.top).m15816t(this.f3046b.right).m15812p(this.f3046b.bottom).build());
        InterfaceC5181c interfaceC5181c = this.f3047c;
        if (interfaceC5181c != null) {
            builder.m15036z(interfaceC5181c.getId());
        }
        AbstractC9979u.m20293f(builder, "builder");
        return builder;
    }

    @Override // ba.InterfaceC5182d
    /* renamed from: i */
    public void mo2720i(InterfaceC5181c graph) {
        AbstractC9979u.m20294g(graph, "graph");
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3048d;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(graph);
        }
        graph.onDestroy();
    }

    @Override // ba.InterfaceC5181c
    public boolean isInRect(float f10, float f11, float f12) {
        return f12 > 0.0f ? mo2721j(null).intersects(f10 - f12, f11 - f12, f10 + f12, f11 + f12) : mo2721j(null).contains(f10, f11);
    }

    @Override // ba.InterfaceC5181c
    /* renamed from: j */
    public RectF mo2721j(Matrix matrix) {
        RectF rectF = new RectF(this.f3046b);
        Matrix matrix2 = new Matrix();
        matrix2.postConcat(this.f3049e);
        if (matrix != null) {
            matrix2.postConcat(matrix);
        }
        matrix2.mapRect(rectF);
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3048d;
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                rectF.union(((InterfaceC5181c) it.next()).mo2721j(matrix));
            }
        }
        return rectF;
    }

    @Override // ba.InterfaceC5181c
    /* renamed from: k */
    public void mo2722k(List graphList) {
        AbstractC9979u.m20294g(graphList, "graphList");
        Iterator it = graphList.iterator();
        while (it.hasNext()) {
            if (AbstractC9979u.m20289b(((InterfaceC5181c) it.next()).getId(), this.f3045a)) {
                InterfaceC5181c interfaceC5181c = this.f3047c;
                if (interfaceC5181c != null) {
                    interfaceC5181c.mo2720i(this);
                    return;
                }
                return;
            }
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3048d;
        if (copyOnWriteArrayList != null) {
            Iterator it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC5181c) it2.next()).mo2722k(graphList);
            }
        }
    }

    @Override // ba.InterfaceC5181c
    /* renamed from: n */
    public AbstractC5179a mo2723n(String id2) {
        AbstractC9979u.m20294g(id2, "id");
        if (AbstractC9979u.m20289b(getId(), id2)) {
            return this;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3048d;
        if (copyOnWriteArrayList == null) {
            return null;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            AbstractC5179a abstractC5179aMo2723n = ((InterfaceC5181c) it.next()).mo2723n(id2);
            if (abstractC5179aMo2723n != null) {
                return abstractC5179aMo2723n;
            }
        }
        return null;
    }

    @Override // ba.InterfaceC5180b
    /* renamed from: o */
    public void mo2724o(Canvas canvas, Matrix matrix, InterfaceC9540l interfaceC9540l, boolean z10, boolean z11) {
        AbstractC9979u.m20294g(canvas, "canvas");
        AbstractC9979u.m20294g(matrix, "matrix");
        if (interfaceC9540l == null || !((Boolean) interfaceC9540l.invoke(this)).booleanValue()) {
            mo2731m(canvas, matrix);
            CopyOnWriteArrayList copyOnWriteArrayList = this.f3048d;
            if (copyOnWriteArrayList != null) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((InterfaceC5181c) it.next()).mo2724o(canvas, matrix, interfaceC9540l, z10, z11);
                }
            }
        }
    }

    @Override // ba.InterfaceC5181c
    public void onDestroy() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3048d;
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC5181c) it.next()).onDestroy();
            }
        }
        CopyOnWriteArrayList copyOnWriteArrayList2 = this.f3048d;
        if (copyOnWriteArrayList2 != null) {
            copyOnWriteArrayList2.clear();
        }
        this.f3048d = null;
        this.f3047c = null;
    }

    @Override // ba.InterfaceC5181c
    /* renamed from: q */
    public boolean mo2725q(float f10, float f11, float f12) {
        return f12 > 0.0f ? mo2715d().intersects(f10 - f12, f11 - f12, f10 + f12, f11 + f12) : mo2715d().contains(f10, f11);
    }

    @Override // ba.InterfaceC5181c
    /* renamed from: r */
    public void mo2726r(InterfaceC5181c graph) {
        AbstractC9979u.m20294g(graph, "graph");
        this.f3047c = graph;
    }

    /* renamed from: s */
    public void mo2727s(InterfaceC5181c graph) {
        AbstractC9979u.m20294g(graph, "graph");
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3048d;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(graph);
        }
        graph.mo2726r(this);
    }

    @Override // ba.InterfaceC5181c
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public CopyOnWriteArrayList mo2717f() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3048d;
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList() : copyOnWriteArrayList;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f3045a + "  type = " + graphType() + " outRect = " + this.f3046b + " matrix = " + this.f3049e + " \r\n");
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3048d;
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                stringBuffer.append("child= " + ((InterfaceC5181c) it.next()) + " \r\n");
            }
        }
        String string = stringBuffer.toString();
        AbstractC9979u.m20293f(string, "buffer.toString()");
        return string;
    }

    /* renamed from: u */
    public void m2729u(Matrix matrix) {
        AbstractC9979u.m20294g(matrix, "matrix");
        this.f3049e.set(matrix);
        mo2730v();
    }

    /* renamed from: v */
    public void mo2730v() {
        mo2714b().mapRect(this.f3050f, mo2718g());
    }
}
