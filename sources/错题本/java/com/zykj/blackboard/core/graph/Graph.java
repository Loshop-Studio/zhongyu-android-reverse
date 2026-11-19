package com.zykj.blackboard.core.graph;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.board.C4361d0;
import com.zykj.board.C4386q;
import com.zykj.board.EzyCommand$CommandSource;
import com.zykj.board.EzyGraphEnum$GraphEnum;
import com.zykj.board.EzyMatrix$Matrix;
import com.zykj.board.EzyPageSnapshot$PageSnapshot;
import com.zykj.board.EzyRectF$RectF;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p020b4.C3116b1;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJE\u0010#\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00132\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001fH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0013H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0013H\u0016¢\u0006\u0004\b'\u0010&J\u0019\u0010(\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b(\u0010)J)\u0010.\u001a\u0004\u0018\u00010\u00012\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\u0006\u0010-\u001a\u00020*H\u0016¢\u0006\u0004\b.\u0010/J5\u00102\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\u0006\u0010-\u001a\u00020*2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000100H\u0016¢\u0006\u0004\b2\u00103J%\u00105\u001a\u00020\u001f2\u0006\u00104\u001a\u00020\u00042\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000100H\u0016¢\u0006\u0004\b5\u00106J'\u00107\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\u0006\u0010-\u001a\u00020*H\u0016¢\u0006\u0004\b7\u00108J'\u00109\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\u0006\u0010-\u001a\u00020*H\u0016¢\u0006\u0004\b9\u00108J\u001d\u0010;\u001a\u00020\r2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000100H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0001H\u0016¢\u0006\u0004\b=\u0010\u000fJ\u0017\u0010?\u001a\u00020\r2\u0006\u0010\f\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0001H\u0016¢\u0006\u0004\bA\u0010\u000fJ\u0015\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00010BH\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\rH\u0016¢\u0006\u0004\bE\u0010\u001aJ\u000f\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bG\u0010HJ\u000f\u0010J\u001a\u00020IH\u0016¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\u0002H\u0016¢\u0006\u0004\bL\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010MR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010NR\u0018\u0010O\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u001e\u0010Q\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010S\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010U\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010N¨\u0006V"}, m5110d2 = {"Lcom/zykj/blackboard/core/graph/Graph;", "Lcom/zykj/blackboard/core/graph/IGraph;", "", "id", "Landroid/graphics/RectF;", "originalRectF", "<init>", "(Ljava/lang/String;Landroid/graphics/RectF;)V", "getId", "()Ljava/lang/String;", "getParent", "()Lcom/zykj/blackboard/core/graph/IGraph;", "graph", "Ld6/s;", "setParent", "(Lcom/zykj/blackboard/core/graph/IGraph;)V", "getOriginalRectF", "()Landroid/graphics/RectF;", "getRenderRectF", "Landroid/graphics/Matrix;", "getRenderMatrix", "()Landroid/graphics/Matrix;", "adapterMatrix", "getMinOutRectF", "(Landroid/graphics/Matrix;)Landroid/graphics/RectF;", "updateRenderRectF", "()V", "Landroid/graphics/Canvas;", "canvas", "matrix", "Lkotlin/Function1;", "", "interceptRendVoid", "isScreenCanvas", "isComplete", "onDraw", "(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Lr6/c;ZZ)V", "concatMatrix", "(Landroid/graphics/Matrix;)V", "initMatrix", "findById", "(Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/Graph;", "", "x", "y", TypedValues.CycleType.S_WAVE_OFFSET, "findByPoint", "(FFF)Lcom/zykj/blackboard/core/graph/IGraph;", "", "list", "findGraphListByPoint", "(FFFLjava/util/List;)Z", "rectF", "findByRectF", "(Landroid/graphics/RectF;Ljava/util/List;)Z", "isInRect", "(FFF)Z", "isCollide", "graphList", "deleteGraphList", "(Ljava/util/List;)V", "addGraph", "Lcom/zykj/blackboard/core/graph/group/ImageGraph;", "addImageGraph", "(Lcom/zykj/blackboard/core/graph/group/ImageGraph;)V", "removeGraph", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getChildGraph", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "onDestroy", "Lcom/zykj/board/d0;", "getSnapshot", "()Lcom/zykj/board/d0;", "Lcom/zykj/board/q;", "getGraphData", "()Lcom/zykj/board/q;", "toString", "Ljava/lang/String;", "Landroid/graphics/RectF;", "parentGraph", "Lcom/zykj/blackboard/core/graph/IGraph;", "childGraph", "Ljava/util/concurrent/CopyOnWriteArrayList;", "renderMatrix", "Landroid/graphics/Matrix;", "renderRectF", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public abstract class Graph implements IGraph {

    @Nullable
    private CopyOnWriteArrayList<IGraph> childGraph;

    @NotNull
    private final String id;

    @NotNull
    private final RectF originalRectF;

    @Nullable
    private IGraph parentGraph;

    @NotNull
    private final Matrix renderMatrix;

    @NotNull
    private final RectF renderRectF;

    public Graph(@NotNull String id, @NotNull RectF originalRectF) {
        AbstractC5830k.m5330g(id, "id");
        AbstractC5830k.m5330g(originalRectF, "originalRectF");
        this.id = id;
        this.originalRectF = originalRectF;
        this.childGraph = new CopyOnWriteArrayList<>();
        this.renderMatrix = new Matrix();
        this.renderRectF = new RectF(originalRectF);
    }

    @Override // com.zykj.blackboard.core.graph.IGraphChange
    public void addGraph(@NotNull IGraph graph) {
        AbstractC5830k.m5330g(graph, "graph");
        CopyOnWriteArrayList<IGraph> copyOnWriteArrayList = this.childGraph;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(graph);
        }
        graph.setParent(this);
    }

    @Override // com.zykj.blackboard.core.graph.IGraphChange
    public void addImageGraph(@NotNull ImageGraph graph) {
        int iNextIndex;
        AbstractC5830k.m5330g(graph, "graph");
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
    public void concatMatrix(@NotNull Matrix matrix) {
        AbstractC5830k.m5330g(matrix, "matrix");
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
    public void deleteGraphList(@NotNull List<IGraph> graphList) {
        AbstractC5830k.m5330g(graphList, "graphList");
        Iterator<IGraph> it = graphList.iterator();
        while (it.hasNext()) {
            if (AbstractC5830k.m5325b(it.next().getId(), this.id)) {
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
    @Nullable
    public Graph findById(@NotNull String id) {
        AbstractC5830k.m5330g(id, "id");
        if (AbstractC5830k.m5325b(getId(), id)) {
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
    @Nullable
    public IGraph findByPoint(float x3, float y2, float offset) {
        if (this.childGraph != null && (!r0.isEmpty())) {
            CopyOnWriteArrayList<IGraph> copyOnWriteArrayList = this.childGraph;
            AbstractC5830k.m5327d(copyOnWriteArrayList);
            for (int size = copyOnWriteArrayList.size() - 1; -1 < size; size--) {
                CopyOnWriteArrayList<IGraph> copyOnWriteArrayList2 = this.childGraph;
                AbstractC5830k.m5327d(copyOnWriteArrayList2);
                IGraph iGraphFindByPoint = copyOnWriteArrayList2.get(size).findByPoint(x3, y2, offset);
                if (iGraphFindByPoint != null) {
                    return iGraphFindByPoint;
                }
            }
        }
        if (isInRect(x3, y2, offset)) {
            return this;
        }
        return null;
    }

    @Override // com.zykj.blackboard.core.graph.IGraph
    public boolean findByRectF(@NotNull RectF rectF, @NotNull List<IGraph> list) {
        IGraph iGraph;
        AbstractC5830k.m5330g(rectF, "rectF");
        AbstractC5830k.m5330g(list, "list");
        if (this.childGraph != null && (!r0.isEmpty())) {
            CopyOnWriteArrayList<IGraph> copyOnWriteArrayList = this.childGraph;
            int size = copyOnWriteArrayList != null ? copyOnWriteArrayList.size() : 0;
            int i = size - 1;
            int i8 = 0;
            for (int i9 = i; -1 < i9; i9--) {
                CopyOnWriteArrayList<IGraph> copyOnWriteArrayList2 = this.childGraph;
                if (copyOnWriteArrayList2 != null && (iGraph = copyOnWriteArrayList2.get(i9)) != null && iGraph.findByRectF(rectF, list)) {
                    i8++;
                }
            }
            if (i8 == size) {
                while (-1 < i) {
                    list.remove(AbstractC5806u.m5282u(list));
                    i--;
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
    public boolean findGraphListByPoint(float x3, float y2, float offset, @NotNull List<IGraph> list) {
        AbstractC5830k.m5330g(list, "list");
        if (this.childGraph != null && (!r0.isEmpty())) {
            CopyOnWriteArrayList<IGraph> copyOnWriteArrayList = this.childGraph;
            AbstractC5830k.m5327d(copyOnWriteArrayList);
            int size = copyOnWriteArrayList.size();
            int i = size - 1;
            int i8 = 0;
            for (int i9 = i; -1 < i9; i9--) {
                CopyOnWriteArrayList<IGraph> copyOnWriteArrayList2 = this.childGraph;
                AbstractC5830k.m5327d(copyOnWriteArrayList2);
                if (copyOnWriteArrayList2.get(i9).findGraphListByPoint(x3, y2, offset, list)) {
                    i8++;
                }
            }
            if (i8 == size) {
                while (-1 < i) {
                    list.remove(AbstractC5806u.m5282u(list));
                    i--;
                }
                list.add(this);
                return true;
            }
        } else if (isInRect(x3, y2, offset)) {
            list.add(this);
            return true;
        }
        return false;
    }

    @Override // com.zykj.blackboard.core.graph.IGraph
    @NotNull
    public C4386q getGraphData() {
        C4386q c4386qNewBuilder = EzyCommand$CommandSource.CommandInfo.GraphData.newBuilder();
        c4386qNewBuilder.m3812k(getId());
        c4386qNewBuilder.m3811j(graphType());
        C3116b1 c3116b1NewBuilder = EzyRectF$RectF.newBuilder();
        c3116b1NewBuilder.m2091j(this.originalRectF.left);
        c3116b1NewBuilder.m2093l(this.originalRectF.top);
        c3116b1NewBuilder.m2092k(this.originalRectF.right);
        c3116b1NewBuilder.m2090i(this.originalRectF.bottom);
        c4386qNewBuilder.m3813l(c3116b1NewBuilder.build());
        IGraph iGraph = this.parentGraph;
        if (iGraph != null) {
            c4386qNewBuilder.m3814m(iGraph.getId());
        }
        return c4386qNewBuilder;
    }

    @Override // com.zykj.blackboard.core.graph.IGraph
    @NotNull
    public String getId() {
        return this.id;
    }

    @Override // com.zykj.blackboard.core.graph.IGraph
    @NotNull
    public RectF getMinOutRectF(@Nullable Matrix adapterMatrix) {
        RectF rectF = new RectF(this.originalRectF);
        Matrix matrix = new Matrix();
        matrix.postConcat(this.renderMatrix);
        if (adapterMatrix != null) {
            matrix.postConcat(adapterMatrix);
        }
        matrix.mapRect(rectF);
        CopyOnWriteArrayList<IGraph> copyOnWriteArrayList = this.childGraph;
        if (copyOnWriteArrayList != null) {
            Iterator<T> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                rectF.union(((IGraph) it.next()).getMinOutRectF(adapterMatrix));
            }
        }
        return rectF;
    }

    @Override // com.zykj.blackboard.core.graph.IGraph
    @NotNull
    public RectF getOriginalRectF() {
        return this.originalRectF;
    }

    @Override // com.zykj.blackboard.core.graph.IGraph
    @Nullable
    /* renamed from: getParent, reason: from getter */
    public IGraph getParentGraph() {
        return this.parentGraph;
    }

    @Override // com.zykj.blackboard.core.graph.IGraph
    @NotNull
    public Matrix getRenderMatrix() {
        return this.renderMatrix;
    }

    @Override // com.zykj.blackboard.core.graph.IGraph
    @NotNull
    public RectF getRenderRectF() {
        return this.renderRectF;
    }

    @Override // com.zykj.blackboard.core.graph.IGraph
    @NotNull
    public C4361d0 getSnapshot() {
        C4361d0 c4361d0NewBuilder = EzyPageSnapshot$PageSnapshot.GraphSnapshot.newBuilder();
        String id = getId();
        c4361d0NewBuilder.getClass();
        id.getClass();
        c4361d0NewBuilder.f5459b = id;
        c4361d0NewBuilder.f5458a |= 1;
        c4361d0NewBuilder.onChanged();
        EzyGraphEnum$GraphEnum ezyGraphEnum$GraphEnumGraphType = graphType();
        ezyGraphEnum$GraphEnumGraphType.getClass();
        c4361d0NewBuilder.f5458a |= 2;
        c4361d0NewBuilder.f5460c = ezyGraphEnum$GraphEnumGraphType.getNumber();
        c4361d0NewBuilder.onChanged();
        C3116b1 c3116b1NewBuilder = EzyRectF$RectF.newBuilder();
        c3116b1NewBuilder.m2091j(this.originalRectF.left);
        c3116b1NewBuilder.m2093l(this.originalRectF.top);
        c3116b1NewBuilder.m2092k(this.originalRectF.right);
        c3116b1NewBuilder.m2090i(this.originalRectF.bottom);
        EzyRectF$RectF ezyRectF$RectFM2085c = c3116b1NewBuilder.build();
        SingleFieldBuilderV3 singleFieldBuilderV3 = c4361d0NewBuilder.f5462e;
        if (singleFieldBuilderV3 == null) {
            c4361d0NewBuilder.f5461d = ezyRectF$RectFM2085c;
        } else {
            singleFieldBuilderV3.setMessage(ezyRectF$RectFM2085c);
        }
        c4361d0NewBuilder.f5458a |= 4;
        c4361d0NewBuilder.onChanged();
        EzyMatrix$Matrix ezyMatrix = MatrixExtKt.toEzyMatrix(this.renderMatrix, 0L);
        SingleFieldBuilderV3 singleFieldBuilderV32 = c4361d0NewBuilder.f5464g;
        if (singleFieldBuilderV32 == null) {
            ezyMatrix.getClass();
            c4361d0NewBuilder.f5463f = ezyMatrix;
        } else {
            singleFieldBuilderV32.setMessage(ezyMatrix);
        }
        c4361d0NewBuilder.f5458a |= 8;
        c4361d0NewBuilder.onChanged();
        CopyOnWriteArrayList<IGraph> copyOnWriteArrayList = this.childGraph;
        if (copyOnWriteArrayList != null) {
            Iterator<T> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C4361d0 snapshot = ((IGraph) it.next()).getSnapshot();
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = c4361d0NewBuilder.f5466i;
                if (repeatedFieldBuilderV3 == null) {
                    c4361d0NewBuilder.ensureChildGraphIsMutable();
                    c4361d0NewBuilder.f5465h.add(snapshot.build());
                    c4361d0NewBuilder.onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(snapshot.build());
                }
            }
        }
        return c4361d0NewBuilder;
    }

    @Override // com.zykj.blackboard.core.graph.IGraphChange
    public void initMatrix(@NotNull Matrix matrix) {
        AbstractC5830k.m5330g(matrix, "matrix");
        this.renderMatrix.set(matrix);
        updateRenderRectF();
    }

    @Override // com.zykj.blackboard.core.graph.IGraph
    public boolean isCollide(float x3, float y2, float offset) {
        return offset > 0.0f ? getRenderRectF().intersects(x3 - offset, y2 - offset, x3 + offset, y2 + offset) : getRenderRectF().contains(x3, y2);
    }

    @Override // com.zykj.blackboard.core.graph.IGraph
    public boolean isInRect(float x3, float y2, float offset) {
        return offset > 0.0f ? getMinOutRectF(null).intersects(x3 - offset, y2 - offset, x3 + offset, y2 + offset) : getMinOutRectF(null).contains(x3, y2);
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
    public void onDraw(@NotNull Canvas canvas, @NotNull Matrix matrix, @Nullable InterfaceC6471c interceptRendVoid, boolean isScreenCanvas, boolean isComplete) {
        AbstractC5830k.m5330g(canvas, "canvas");
        AbstractC5830k.m5330g(matrix, "matrix");
        if (interceptRendVoid == null || !((Boolean) interceptRendVoid.invoke(this)).booleanValue()) {
            render(canvas, matrix);
            CopyOnWriteArrayList<IGraph> copyOnWriteArrayList = this.childGraph;
            if (copyOnWriteArrayList != null) {
                Iterator<T> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((IGraph) it.next()).onDraw(canvas, matrix, interceptRendVoid, isScreenCanvas, isComplete);
                }
            }
        }
    }

    @Override // com.zykj.blackboard.core.graph.IGraphChange
    public void removeGraph(@NotNull IGraph graph) {
        AbstractC5830k.m5330g(graph, "graph");
        CopyOnWriteArrayList<IGraph> copyOnWriteArrayList = this.childGraph;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(graph);
        }
        graph.onDestroy();
    }

    @Override // com.zykj.blackboard.core.graph.IGraph
    public void setParent(@NotNull IGraph graph) {
        AbstractC5830k.m5330g(graph, "graph");
        this.parentGraph = graph;
    }

    @NotNull
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.id + "  type = " + graphType() + " outRect = " + this.originalRectF + " matrix = " + this.renderMatrix + " \r\n");
        CopyOnWriteArrayList<IGraph> copyOnWriteArrayList = this.childGraph;
        if (copyOnWriteArrayList != null) {
            Iterator<T> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                stringBuffer.append("child= " + ((IGraph) it.next()) + " \r\n");
            }
        }
        String string = stringBuffer.toString();
        AbstractC5830k.m5329f(string, "buffer.toString()");
        return string;
    }

    @Override // com.zykj.blackboard.core.graph.IGraphChange
    public void updateRenderRectF() {
        getRenderMatrix().mapRect(this.renderRectF, getOriginalRectF());
    }

    @Override // com.zykj.blackboard.core.graph.IGraph
    @NotNull
    public CopyOnWriteArrayList<IGraph> getChildGraph() {
        CopyOnWriteArrayList<IGraph> copyOnWriteArrayList = this.childGraph;
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList<>() : copyOnWriteArrayList;
    }
}
