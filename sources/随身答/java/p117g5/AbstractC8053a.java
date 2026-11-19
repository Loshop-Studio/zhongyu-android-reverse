package p117g5;

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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p263u5.AbstractC9695n;

/* renamed from: g5.a */
/* loaded from: classes4.dex */
public abstract class AbstractC8053a implements InterfaceC8055c {

    /* renamed from: a */
    public final String f13697a;

    /* renamed from: b */
    public final RectF f13698b;

    /* renamed from: c */
    public InterfaceC8055c f13699c;

    /* renamed from: d */
    public CopyOnWriteArrayList f13700d;

    /* renamed from: e */
    public final Matrix f13701e;

    /* renamed from: f */
    public final RectF f13702f;

    public AbstractC8053a(String id, RectF originalRectF) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(originalRectF, "originalRectF");
        this.f13697a = id;
        this.f13698b = originalRectF;
        this.f13700d = new CopyOnWriteArrayList();
        this.f13701e = new Matrix();
        this.f13702f = new RectF(originalRectF);
    }

    @Override // p117g5.InterfaceC8056d
    /* renamed from: a */
    public void mo12793a(ImageGraph graph) {
        int iNextIndex;
        Intrinsics.checkNotNullParameter(graph, "graph");
        CopyOnWriteArrayList copyOnWriteArrayList = this.f13700d;
        if (copyOnWriteArrayList != null) {
            ListIterator listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                } else if (((InterfaceC8055c) listIterator.previous()) instanceof ImageGraph) {
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
        graph.mo12803q(this);
    }

    @Override // p117g5.InterfaceC8055c
    /* renamed from: b */
    public Matrix mo12794b() {
        return this.f13701e;
    }

    @Override // p117g5.InterfaceC8055c
    /* renamed from: c */
    public RectF mo12795c() {
        return this.f13702f;
    }

    @Override // p117g5.InterfaceC8056d
    /* renamed from: d */
    public void mo7858d(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.f13701e.postConcat(matrix);
        CopyOnWriteArrayList copyOnWriteArrayList = this.f13700d;
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC8055c) it.next()).mo7858d(matrix);
            }
        }
        mo12806u();
    }

    @Override // p117g5.InterfaceC8055c
    /* renamed from: f */
    public RectF mo12797f() {
        return this.f13698b;
    }

    @Override // p117g5.InterfaceC8055c
    /* renamed from: g */
    public EzyCommand.CommandSource.CommandInfo.GraphData.C7084b mo12798g() {
        EzyCommand.CommandSource.CommandInfo.GraphData.C7084b builder = EzyCommand.CommandSource.CommandInfo.GraphData.m8361L();
        builder.m8416y(getId());
        builder.m8414w(graphType());
        builder.m8417z(EzyRectF.RectF.m9175t().m9196s(this.f13698b.left).m9199v(this.f13698b.top).m9198u(this.f13698b.right).m9194q(this.f13698b.bottom).build());
        InterfaceC8055c interfaceC8055c = this.f13699c;
        if (interfaceC8055c != null) {
            builder.m8390A(interfaceC8055c.getId());
        }
        Intrinsics.checkNotNullExpressionValue(builder, "builder");
        return builder;
    }

    @Override // p117g5.InterfaceC8055c
    public String getId() {
        return this.f13697a;
    }

    @Override // p117g5.InterfaceC8055c
    public InterfaceC8055c getParent() {
        return this.f13699c;
    }

    @Override // p117g5.InterfaceC8055c
    public EzyPageSnapshot.PageSnapshot.GraphSnapshot.C7118b getSnapshot() {
        EzyPageSnapshot.PageSnapshot.GraphSnapshot.C7118b builder = EzyPageSnapshot.PageSnapshot.GraphSnapshot.m8989Y();
        builder.m9034M(getId());
        builder.m9032K(graphType());
        builder.m9036O(EzyRectF.RectF.m9175t().m9196s(this.f13698b.left).m9199v(this.f13698b.top).m9198u(this.f13698b.right).m9194q(this.f13698b.bottom).build());
        builder.m9035N(AbstractC9695n.m16201c(this.f13701e, 0L));
        CopyOnWriteArrayList copyOnWriteArrayList = this.f13700d;
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                builder.m9042b(((InterfaceC8055c) it.next()).getSnapshot());
            }
        }
        Intrinsics.checkNotNullExpressionValue(builder, "builder");
        return builder;
    }

    @Override // p117g5.InterfaceC8056d
    /* renamed from: h */
    public void mo7859h(InterfaceC8055c graph) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        CopyOnWriteArrayList copyOnWriteArrayList = this.f13700d;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(graph);
        }
        graph.onDestroy();
    }

    @Override // p117g5.InterfaceC8055c
    /* renamed from: i */
    public RectF mo12799i(Matrix matrix) {
        RectF rectF = new RectF(this.f13698b);
        Matrix matrix2 = new Matrix();
        matrix2.postConcat(this.f13701e);
        if (matrix != null) {
            matrix2.postConcat(matrix);
        }
        matrix2.mapRect(rectF);
        CopyOnWriteArrayList copyOnWriteArrayList = this.f13700d;
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                rectF.union(((InterfaceC8055c) it.next()).mo12799i(matrix));
            }
        }
        return rectF;
    }

    @Override // p117g5.InterfaceC8055c
    public boolean isInRect(float f10, float f11, float f12) {
        return f12 > 0.0f ? mo12799i(null).intersects(f10 - f12, f11 - f12, f10 + f12, f11 + f12) : mo12799i(null).contains(f10, f11);
    }

    @Override // p117g5.InterfaceC8055c
    /* renamed from: j */
    public void mo12800j(List graphList) {
        Intrinsics.checkNotNullParameter(graphList, "graphList");
        Iterator it = graphList.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((InterfaceC8055c) it.next()).getId(), this.f13697a)) {
                InterfaceC8055c interfaceC8055c = this.f13699c;
                if (interfaceC8055c != null) {
                    interfaceC8055c.mo7859h(this);
                    return;
                }
                return;
            }
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f13700d;
        if (copyOnWriteArrayList != null) {
            Iterator it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC8055c) it2.next()).mo12800j(graphList);
            }
        }
    }

    @Override // p117g5.InterfaceC8055c
    /* renamed from: m */
    public AbstractC8053a mo12801m(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        if (Intrinsics.areEqual(getId(), id)) {
            return this;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f13700d;
        if (copyOnWriteArrayList == null) {
            return null;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            AbstractC8053a abstractC8053aMo12801m = ((InterfaceC8055c) it.next()).mo12801m(id);
            if (abstractC8053aMo12801m != null) {
                return abstractC8053aMo12801m;
            }
        }
        return null;
    }

    @Override // p117g5.InterfaceC8055c
    /* renamed from: o */
    public boolean mo12802o(float f10, float f11, float f12) {
        return f12 > 0.0f ? mo12795c().intersects(f10 - f12, f11 - f12, f10 + f12, f11 + f12) : mo12795c().contains(f10, f11);
    }

    @Override // p117g5.InterfaceC8055c
    public void onDestroy() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f13700d;
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC8055c) it.next()).onDestroy();
            }
        }
        CopyOnWriteArrayList copyOnWriteArrayList2 = this.f13700d;
        if (copyOnWriteArrayList2 != null) {
            copyOnWriteArrayList2.clear();
        }
        this.f13700d = null;
        this.f13699c = null;
    }

    /* renamed from: p */
    public void mo7863p(Canvas canvas, Matrix matrix, Function1 function1, boolean z9, boolean z10) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        if (function1 == null || !((Boolean) function1.invoke(this)).booleanValue()) {
            mo7861l(canvas, matrix);
            CopyOnWriteArrayList copyOnWriteArrayList = this.f13700d;
            if (copyOnWriteArrayList != null) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((InterfaceC8055c) it.next()).mo7863p(canvas, matrix, function1, z9, z10);
                }
            }
        }
    }

    @Override // p117g5.InterfaceC8055c
    /* renamed from: q */
    public void mo12803q(InterfaceC8055c graph) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        this.f13699c = graph;
    }

    /* renamed from: r */
    public void mo7864r(InterfaceC8055c graph) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        CopyOnWriteArrayList copyOnWriteArrayList = this.f13700d;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(graph);
        }
        graph.mo12803q(this);
    }

    @Override // p117g5.InterfaceC8055c
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public CopyOnWriteArrayList mo12796e() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f13700d;
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList() : copyOnWriteArrayList;
    }

    /* renamed from: t */
    public void m12805t(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.f13701e.set(matrix);
        mo12806u();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f13697a + "  type = " + graphType() + " outRect = " + this.f13698b + " matrix = " + this.f13701e + " \r\n");
        CopyOnWriteArrayList copyOnWriteArrayList = this.f13700d;
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                stringBuffer.append("child= " + ((InterfaceC8055c) it.next()) + " \r\n");
            }
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "buffer.toString()");
        return string;
    }

    /* renamed from: u */
    public void mo12806u() {
        mo12794b().mapRect(this.f13702f, mo12797f());
    }
}
