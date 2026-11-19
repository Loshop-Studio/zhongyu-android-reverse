package p210q4;

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
import p077e5.AbstractC7352m;

/* renamed from: q4.a */
/* loaded from: classes4.dex */
public abstract class AbstractC8886a implements InterfaceC8888c {

    /* renamed from: a */
    public final String f15185a;

    /* renamed from: b */
    public final RectF f15186b;

    /* renamed from: c */
    public InterfaceC8888c f15187c;

    /* renamed from: d */
    public CopyOnWriteArrayList f15188d;

    /* renamed from: e */
    public final Matrix f15189e;

    /* renamed from: f */
    public final RectF f15190f;

    public AbstractC8886a(String id, RectF originalRectF) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(originalRectF, "originalRectF");
        this.f15185a = id;
        this.f15186b = originalRectF;
        this.f15188d = new CopyOnWriteArrayList();
        this.f15189e = new Matrix();
        this.f15190f = new RectF(originalRectF);
    }

    @Override // p210q4.InterfaceC8889d
    /* renamed from: a */
    public void mo14992a(ImageGraph graph) {
        int iNextIndex;
        Intrinsics.checkNotNullParameter(graph, "graph");
        CopyOnWriteArrayList copyOnWriteArrayList = this.f15188d;
        if (copyOnWriteArrayList != null) {
            ListIterator listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                } else if (((InterfaceC8888c) listIterator.previous()) instanceof ImageGraph) {
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
        graph.mo14998i(this);
    }

    @Override // p210q4.InterfaceC8888c
    /* renamed from: b */
    public Matrix mo14993b() {
        return this.f15189e;
    }

    @Override // p210q4.InterfaceC8888c
    /* renamed from: d */
    public RectF mo14994d() {
        return this.f15190f;
    }

    @Override // p210q4.InterfaceC8889d
    /* renamed from: e */
    public void mo6747e(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.f15189e.postConcat(matrix);
        CopyOnWriteArrayList copyOnWriteArrayList = this.f15188d;
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC8888c) it.next()).mo6747e(matrix);
            }
        }
        mo15005v();
    }

    @Override // p210q4.InterfaceC8888c
    /* renamed from: g */
    public RectF mo14996g() {
        return this.f15186b;
    }

    @Override // p210q4.InterfaceC8888c
    public String getId() {
        return this.f15185a;
    }

    @Override // p210q4.InterfaceC8888c
    public InterfaceC8888c getParent() {
        return this.f15187c;
    }

    @Override // p210q4.InterfaceC8888c
    public EzyPageSnapshot.PageSnapshot.GraphSnapshot.C6799b getSnapshot() {
        EzyPageSnapshot.PageSnapshot.GraphSnapshot.C6799b builder = EzyPageSnapshot.PageSnapshot.GraphSnapshot.m7855U();
        builder.m7902M(getId());
        builder.m7900K(graphType());
        builder.m7904O(EzyRectF.RectF.m8043q().m8064s(this.f15186b.left).m8067v(this.f15186b.top).m8066u(this.f15186b.right).m8062q(this.f15186b.bottom).build());
        builder.m7903N(AbstractC7352m.m11778c(this.f15189e, 0L));
        CopyOnWriteArrayList copyOnWriteArrayList = this.f15188d;
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                builder.m7910b(((InterfaceC8888c) it.next()).getSnapshot());
            }
        }
        Intrinsics.checkNotNullExpressionValue(builder, "builder");
        return builder;
    }

    @Override // p210q4.InterfaceC8888c
    /* renamed from: h */
    public EzyCommand.CommandSource.CommandInfo.GraphData.C6765b mo14997h() {
        EzyCommand.CommandSource.CommandInfo.GraphData.C6765b builder = EzyCommand.CommandSource.CommandInfo.GraphData.m7242I();
        builder.m7299y(getId());
        builder.m7297w(graphType());
        builder.m7300z(EzyRectF.RectF.m8043q().m8064s(this.f15186b.left).m8067v(this.f15186b.top).m8066u(this.f15186b.right).m8062q(this.f15186b.bottom).build());
        InterfaceC8888c interfaceC8888c = this.f15187c;
        if (interfaceC8888c != null) {
            builder.m7273A(interfaceC8888c.getId());
        }
        Intrinsics.checkNotNullExpressionValue(builder, "builder");
        return builder;
    }

    @Override // p210q4.InterfaceC8888c
    /* renamed from: i */
    public void mo14998i(InterfaceC8888c graph) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        this.f15187c = graph;
    }

    @Override // p210q4.InterfaceC8888c
    public boolean isInRect(float f10, float f11, float f12) {
        return f12 > 0.0f ? mo14999j(null).intersects(f10 - f12, f11 - f12, f10 + f12, f11 + f12) : mo14999j(null).contains(f10, f11);
    }

    @Override // p210q4.InterfaceC8888c
    /* renamed from: j */
    public RectF mo14999j(Matrix matrix) {
        RectF rectF = new RectF(this.f15186b);
        Matrix matrix2 = new Matrix();
        matrix2.postConcat(this.f15189e);
        if (matrix != null) {
            matrix2.postConcat(matrix);
        }
        matrix2.mapRect(rectF);
        CopyOnWriteArrayList copyOnWriteArrayList = this.f15188d;
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                rectF.union(((InterfaceC8888c) it.next()).mo14999j(matrix));
            }
        }
        return rectF;
    }

    @Override // p210q4.InterfaceC8888c
    /* renamed from: k */
    public void mo15000k(List graphList) {
        Intrinsics.checkNotNullParameter(graphList, "graphList");
        Iterator it = graphList.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((InterfaceC8888c) it.next()).getId(), this.f15185a)) {
                InterfaceC8888c interfaceC8888c = this.f15187c;
                if (interfaceC8888c != null) {
                    interfaceC8888c.mo6752r(this);
                    return;
                }
                return;
            }
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f15188d;
        if (copyOnWriteArrayList != null) {
            Iterator it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                ((InterfaceC8888c) it2.next()).mo15000k(graphList);
            }
        }
    }

    @Override // p210q4.InterfaceC8888c
    /* renamed from: n */
    public AbstractC8886a mo15001n(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        if (Intrinsics.areEqual(getId(), id)) {
            return this;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f15188d;
        if (copyOnWriteArrayList == null) {
            return null;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            AbstractC8886a abstractC8886aMo15001n = ((InterfaceC8888c) it.next()).mo15001n(id);
            if (abstractC8886aMo15001n != null) {
                return abstractC8886aMo15001n;
            }
        }
        return null;
    }

    @Override // p210q4.InterfaceC8888c
    public void onDestroy() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f15188d;
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC8888c) it.next()).onDestroy();
            }
        }
        CopyOnWriteArrayList copyOnWriteArrayList2 = this.f15188d;
        if (copyOnWriteArrayList2 != null) {
            copyOnWriteArrayList2.clear();
        }
        this.f15188d = null;
        this.f15187c = null;
    }

    @Override // p210q4.InterfaceC8888c
    /* renamed from: p */
    public boolean mo15002p(float f10, float f11, float f12) {
        return f12 > 0.0f ? mo14994d().intersects(f10 - f12, f11 - f12, f10 + f12, f11 + f12) : mo14994d().contains(f10, f11);
    }

    /* renamed from: q */
    public void mo6751q(Canvas canvas, Matrix matrix, Function1 function1, boolean z9, boolean z10) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        if (function1 == null || !((Boolean) function1.invoke(this)).booleanValue()) {
            mo6749m(canvas, matrix);
            CopyOnWriteArrayList copyOnWriteArrayList = this.f15188d;
            if (copyOnWriteArrayList != null) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((InterfaceC8888c) it.next()).mo6751q(canvas, matrix, function1, z9, z10);
                }
            }
        }
    }

    @Override // p210q4.InterfaceC8889d
    /* renamed from: r */
    public void mo6752r(InterfaceC8888c graph) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        CopyOnWriteArrayList copyOnWriteArrayList = this.f15188d;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(graph);
        }
        graph.onDestroy();
    }

    /* renamed from: s */
    public void mo6753s(InterfaceC8888c graph) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        CopyOnWriteArrayList copyOnWriteArrayList = this.f15188d;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(graph);
        }
        graph.mo14998i(this);
    }

    @Override // p210q4.InterfaceC8888c
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public CopyOnWriteArrayList mo14995f() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f15188d;
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList() : copyOnWriteArrayList;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f15185a + "  type = " + graphType() + " outRect = " + this.f15186b + " matrix = " + this.f15189e + " \r\n");
        CopyOnWriteArrayList copyOnWriteArrayList = this.f15188d;
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                stringBuffer.append("child= " + ((InterfaceC8888c) it.next()) + " \r\n");
            }
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "buffer.toString()");
        return string;
    }

    /* renamed from: u */
    public void m15004u(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.f15189e.set(matrix);
        mo15005v();
    }

    /* renamed from: v */
    public void mo15005v() {
        mo14993b().mapRect(this.f15190f, mo14996g());
    }
}
