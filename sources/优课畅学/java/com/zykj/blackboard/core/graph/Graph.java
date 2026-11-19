package com.zykj.blackboard.core.graph;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyPageSnapshot;
import com.zykj.board.EzyRectF;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8809v;
import p300x7.InterfaceC10570l;

/* loaded from: classes4.dex */
public abstract class Graph implements IGraph {
    private CopyOnWriteArrayList<IGraph> childGraph;

    /* renamed from: id */
    private final String f8779id;
    private final RectF originalRectF;
    private IGraph parentGraph;
    private final Matrix renderMatrix;
    private final RectF renderRectF;

    public Graph(String id, RectF originalRectF) {
        AbstractC9133u.m16133g(id, "id");
        AbstractC9133u.m16133g(originalRectF, "originalRectF");
        this.f8779id = id;
        this.originalRectF = originalRectF;
        this.childGraph = new CopyOnWriteArrayList<>();
        this.renderMatrix = new Matrix();
        this.renderRectF = new RectF(originalRectF);
    }

    @Override // com.zykj.blackboard.core.graph.IGraphChange
    public void addGraph(IGraph graph) {
        AbstractC9133u.m16133g(graph, "graph");
        CopyOnWriteArrayList<IGraph> copyOnWriteArrayList = this.childGraph;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(graph);
        }
        graph.setParent(this);
    }

    @Override // com.zykj.blackboard.core.graph.IGraphChange
    public void addImageGraph(ImageGraph graph) {
        int iNextIndex;
        AbstractC9133u.m16133g(graph, "graph");
        CopyOnWriteArrayList<IGraph> copyOnWriteArrayList = this.childGraph;
        if (copyOnWriteArrayList != null) {
            ListIterator<IGraph> listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                } else if (listIterator.previous() instanceof ImageGraph) {
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
        graph.setParent(this);
    }

    @Override // com.zykj.blackboard.core.graph.IGraphChange
    public void concatMatrix(Matrix matrix) {
        AbstractC9133u.m16133g(matrix, "matrix");
        this.renderMatrix.postConcat(matrix);
        CopyOnWriteArrayList<IGraph> copyOnWriteArrayList = this.childGraph;
        if (copyOnWriteArrayList != null) {
            Iterator<T> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((IGraph) it.next()).concatMatrix(matrix);
            }
        }
        updateRenderRectF();
    }

    @Override // com.zykj.blackboard.core.graph.IGraph
    public void deleteGraphList(List<IGraph> graphList) {
        AbstractC9133u.m16133g(graphList, "graphList");
        Iterator<IGraph> it = graphList.iterator();
        while (it.hasNext()) {
            if (AbstractC9133u.m16128b(it.next().getId(), this.f8779id)) {
                IGraph iGraph = this.parentGraph;
                if (iGraph != null) {
                    iGraph.removeGraph(this);
                    return;
                }
                return;
            }
        }
        CopyOnWriteArrayList<IGraph> copyOnWriteArrayList = this.childGraph;
        if (copyOnWriteArrayList != null) {
            Iterator<T> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                ((IGraph) it2.next()).deleteGraphList(graphList);
            }
        }
    }

    @Override // com.zykj.blackboard.core.graph.IGraph
    public Graph findById(String id) {
        AbstractC9133u.m16133g(id, "id");
        if (AbstractC9133u.m16128b(getId(), id)) {
            return this;
        }
        CopyOnWriteArrayList<IGraph> copyOnWriteArrayList = this.childGraph;
        if (copyOnWriteArrayList == null) {
            return null;
        }
        Iterator<T> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            Graph graphFindById = ((IGraph) it.next()).findById(id);
            if (graphFindById != null) {
                return graphFindById;
            }
        }
        return null;
    }

    @Override // com.zykj.blackboard.core.graph.IGraph
    public IGraph findByPoint(float f10, float f11, float f12) {
        if (this.childGraph != null && (!r0.isEmpty())) {
            CopyOnWriteArrayList<IGraph> copyOnWriteArrayList = this.childGraph;
            AbstractC9133u.m16130d(copyOnWriteArrayList);
            for (int size = copyOnWriteArrayList.size() - 1; -1 < size; size--) {
                CopyOnWriteArrayList<IGraph> copyOnWriteArrayList2 = this.childGraph;
                AbstractC9133u.m16130d(copyOnWriteArrayList2);
                IGraph iGraphFindByPoint = copyOnWriteArrayList2.get(size).findByPoint(f10, f11, f12);
                if (iGraphFindByPoint != null) {
                    return iGraphFindByPoint;
                }
            }
        }
        if (isInRect(f10, f11, f12)) {
            return this;
        }
        return null;
    }

    @Override // com.zykj.blackboard.core.graph.IGraph
    public boolean findByRectF(RectF rectF, List<IGraph> list) {
        IGraph iGraph;
        AbstractC9133u.m16133g(rectF, "rectF");
        AbstractC9133u.m16133g(list, "list");
        if (this.childGraph != null && (!r0.isEmpty())) {
            CopyOnWriteArrayList<IGraph> copyOnWriteArrayList = this.childGraph;
            int size = copyOnWriteArrayList != null ? copyOnWriteArrayList.size() : 0;
            int i10 = size - 1;
            int i11 = 0;
            for (int i12 = i10; -1 < i12; i12--) {
                CopyOnWriteArrayList<IGraph> copyOnWriteArrayList2 = this.childGraph;
                if (copyOnWriteArrayList2 != null && (iGraph = copyOnWriteArrayList2.get(i12)) != null && iGraph.findByRectF(rectF, list)) {
                    i11++;
                }
            }
            if (i11 == size) {
                while (-1 < i10) {
                    list.remove(AbstractC8809v.m14773p(list));
                    i10--;
                }
                list.add(this);
                return true;
            }
        } else if (RectF.intersects(getMinOutRectF(null), rectF)) {
            list.add(this);
            return true;
        }
        return false;
    }

    @Override // com.zykj.blackboard.core.graph.IGraph
    public boolean findGraphListByPoint(float f10, float f11, float f12, List<IGraph> list) {
        AbstractC9133u.m16133g(list, "list");
        if (this.childGraph != null && (!r0.isEmpty())) {
            CopyOnWriteArrayList<IGraph> copyOnWriteArrayList = this.childGraph;
            AbstractC9133u.m16130d(copyOnWriteArrayList);
            int size = copyOnWriteArrayList.size();
            int i10 = size - 1;
            int i11 = 0;
            for (int i12 = i10; -1 < i12; i12--) {
                CopyOnWriteArrayList<IGraph> copyOnWriteArrayList2 = this.childGraph;
                AbstractC9133u.m16130d(copyOnWriteArrayList2);
                if (copyOnWriteArrayList2.get(i12).findGraphListByPoint(f10, f11, f12, list)) {
                    i11++;
                }
            }
            if (i11 == size) {
                while (-1 < i10) {
                    list.remove(AbstractC8809v.m14773p(list));
                    i10--;
                }
                list.add(this);
                return true;
            }
        } else if (isInRect(f10, f11, f12)) {
            list.add(this);
            return true;
        }
        return false;
    }

    @Override // com.zykj.blackboard.core.graph.IGraph
    public EzyCommand.CommandSource.CommandInfo.GraphData.C7194b getGraphData() {
        EzyCommand.CommandSource.CommandInfo.GraphData.C7194b builder = EzyCommand.CommandSource.CommandInfo.GraphData.m7754z();
        builder.m7794y(getId());
        builder.m7792w(graphType());
        builder.m7795z(EzyRectF.RectF.m8548h().m8569s(this.originalRectF.left).m8572v(this.originalRectF.top).m8571u(this.originalRectF.right).m8567q(this.originalRectF.bottom).build());
        IGraph iGraph = this.parentGraph;
        if (iGraph != null) {
            builder.m7768A(iGraph.getId());
        }
        AbstractC9133u.m16132f(builder, "builder");
        return builder;
    }

    @Override // com.zykj.blackboard.core.graph.IGraph
    public String getId() {
        return this.f8779id;
    }

    @Override // com.zykj.blackboard.core.graph.IGraph
    public RectF getMinOutRectF(Matrix matrix) {
        RectF rectF = new RectF(this.originalRectF);
        Matrix matrix2 = new Matrix();
        matrix2.postConcat(this.renderMatrix);
        if (matrix != null) {
            matrix2.postConcat(matrix);
        }
        matrix2.mapRect(rectF);
        CopyOnWriteArrayList<IGraph> copyOnWriteArrayList = this.childGraph;
        if (copyOnWriteArrayList != null) {
            Iterator<T> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                rectF.union(((IGraph) it.next()).getMinOutRectF(matrix));
            }
        }
        return rectF;
    }

    @Override // com.zykj.blackboard.core.graph.IGraph
    public RectF getOriginalRectF() {
        return this.originalRectF;
    }

    @Override // com.zykj.blackboard.core.graph.IGraph
    public IGraph getParent() {
        return this.parentGraph;
    }

    @Override // com.zykj.blackboard.core.graph.IGraph
    public Matrix getRenderMatrix() {
        return this.renderMatrix;
    }

    @Override // com.zykj.blackboard.core.graph.IGraph
    public RectF getRenderRectF() {
        return this.renderRectF;
    }

    @Override // com.zykj.blackboard.core.graph.IGraph
    public EzyPageSnapshot.PageSnapshot.GraphSnapshot.C7228b getSnapshot() {
        EzyPageSnapshot.PageSnapshot.GraphSnapshot.C7228b builder = EzyPageSnapshot.PageSnapshot.GraphSnapshot.m8354L();
        builder.m8408M(getId());
        builder.m8406K(graphType());
        builder.m8410O(EzyRectF.RectF.m8548h().m8569s(this.originalRectF.left).m8572v(this.originalRectF.top).m8571u(this.originalRectF.right).m8567q(this.originalRectF.bottom).build());
        builder.m8409N(MatrixExtKt.toEzyMatrix(this.renderMatrix, 0L));
        CopyOnWriteArrayList<IGraph> copyOnWriteArrayList = this.childGraph;
        if (copyOnWriteArrayList != null) {
            Iterator<T> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                builder.m8416c(((IGraph) it.next()).getSnapshot());
            }
        }
        AbstractC9133u.m16132f(builder, "builder");
        return builder;
    }

    @Override // com.zykj.blackboard.core.graph.IGraphChange
    public void initMatrix(Matrix matrix) {
        AbstractC9133u.m16133g(matrix, "matrix");
        this.renderMatrix.set(matrix);
        updateRenderRectF();
    }

    @Override // com.zykj.blackboard.core.graph.IGraph
    public boolean isCollide(float f10, float f11, float f12) {
        return f12 > 0.0f ? getRenderRectF().intersects(f10 - f12, f11 - f12, f10 + f12, f11 + f12) : getRenderRectF().contains(f10, f11);
    }

    @Override // com.zykj.blackboard.core.graph.IGraph
    public boolean isInRect(float f10, float f11, float f12) {
        return f12 > 0.0f ? getMinOutRectF(null).intersects(f10 - f12, f11 - f12, f10 + f12, f11 + f12) : getMinOutRectF(null).contains(f10, f11);
    }

    @Override // com.zykj.blackboard.core.graph.IGraph
    public void onDestroy() {
        CopyOnWriteArrayList<IGraph> copyOnWriteArrayList = this.childGraph;
        if (copyOnWriteArrayList != null) {
            Iterator<T> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((IGraph) it.next()).onDestroy();
            }
        }
        CopyOnWriteArrayList<IGraph> copyOnWriteArrayList2 = this.childGraph;
        if (copyOnWriteArrayList2 != null) {
            copyOnWriteArrayList2.clear();
        }
        this.childGraph = null;
        this.parentGraph = null;
    }

    @Override // com.zykj.blackboard.core.graph.IDraw
    public void onDraw(Canvas canvas, Matrix matrix, InterfaceC10570l interfaceC10570l, boolean z10, boolean z11) {
        AbstractC9133u.m16133g(canvas, "canvas");
        AbstractC9133u.m16133g(matrix, "matrix");
        if (interfaceC10570l == null || !((Boolean) interfaceC10570l.invoke(this)).booleanValue()) {
            render(canvas, matrix);
            CopyOnWriteArrayList<IGraph> copyOnWriteArrayList = this.childGraph;
            if (copyOnWriteArrayList != null) {
                Iterator<T> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((IGraph) it.next()).onDraw(canvas, matrix, interfaceC10570l, z10, z11);
                }
            }
        }
    }

    @Override // com.zykj.blackboard.core.graph.IGraphChange
    public void removeGraph(IGraph graph) {
        AbstractC9133u.m16133g(graph, "graph");
        CopyOnWriteArrayList<IGraph> copyOnWriteArrayList = this.childGraph;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(graph);
        }
        graph.onDestroy();
    }

    @Override // com.zykj.blackboard.core.graph.IGraph
    public void setParent(IGraph graph) {
        AbstractC9133u.m16133g(graph, "graph");
        this.parentGraph = graph;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f8779id + "  type = " + graphType() + " outRect = " + this.originalRectF + " matrix = " + this.renderMatrix + " \r\n");
        CopyOnWriteArrayList<IGraph> copyOnWriteArrayList = this.childGraph;
        if (copyOnWriteArrayList != null) {
            Iterator<T> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                stringBuffer.append("child= " + ((IGraph) it.next()) + " \r\n");
            }
        }
        String string = stringBuffer.toString();
        AbstractC9133u.m16132f(string, "buffer.toString()");
        return string;
    }

    @Override // com.zykj.blackboard.core.graph.IGraphChange
    public void updateRenderRectF() {
        getRenderMatrix().mapRect(this.renderRectF, getOriginalRectF());
    }

    @Override // com.zykj.blackboard.core.graph.IGraph
    public CopyOnWriteArrayList<IGraph> getChildGraph() {
        CopyOnWriteArrayList<IGraph> copyOnWriteArrayList = this.childGraph;
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList<>() : copyOnWriteArrayList;
    }
}
