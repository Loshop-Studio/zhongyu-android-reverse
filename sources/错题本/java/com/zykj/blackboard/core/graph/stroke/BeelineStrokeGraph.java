package com.zykj.blackboard.core.graph.stroke;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.loader.SourceLoader;
import com.zykj.board.EzyGraphEnum$GraphEnum;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0010"}, m5110d2 = {"Lcom/zykj/blackboard/core/graph/stroke/BeelineStrokeGraph;", "Lcom/zykj/blackboard/core/graph/stroke/StrokeGraph;", "id", "", "outRect", "Landroid/graphics/RectF;", "sourceLoader", "Lcom/zykj/blackboard/core/loader/SourceLoader;", "sourceFileName", "sourceId", "", "(Ljava/lang/String;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/loader/SourceLoader;Ljava/lang/String;Ljava/lang/Integer;)V", "copy", "Lcom/zykj/blackboard/core/graph/Graph;", "graphType", "Lcom/zykj/board/EzyGraphEnum$GraphEnum;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class BeelineStrokeGraph extends StrokeGraph {
    public /* synthetic */ BeelineStrokeGraph(String str, RectF rectF, SourceLoader sourceLoader, String str2, Integer num, int i, AbstractC5824e abstractC5824e) {
        this(str, rectF, (i & 4) != 0 ? null : sourceLoader, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num);
    }

    @Override // com.zykj.blackboard.core.graph.stroke.StrokeGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph, com.zykj.blackboard.core.graph.IGraph
    @NotNull
    public Graph copy() {
        BeelineStrokeGraph beelineStrokeGraph = new BeelineStrokeGraph(getId(), new RectF(getOriginalRectF()), getSourceLoader(), getSourceFileName(), getSourceId());
        beelineStrokeGraph.getMEventList().addAll(getMEventList());
        Path path = getPath();
        if (path != null) {
            beelineStrokeGraph.setPath(new Path(path));
        }
        Paint mPaint = getMPaint();
        if (mPaint != null) {
            beelineStrokeGraph.setPaint(new Paint(mPaint), getPaintItemLength(), getPaintSpacing());
        }
        beelineStrokeGraph.initMatrix(getRenderMatrix());
        beelineStrokeGraph.updateRenderRectF();
        beelineStrokeGraph.initMatrix(getRenderMatrix());
        Iterator<T> it = getChildGraph().iterator();
        while (it.hasNext()) {
            beelineStrokeGraph.addGraph(((IGraph) it.next()).copy());
        }
        return beelineStrokeGraph;
    }

    @Override // com.zykj.blackboard.core.graph.stroke.StrokeGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph, com.zykj.blackboard.core.graph.IGraph
    @NotNull
    public EzyGraphEnum$GraphEnum graphType() {
        return EzyGraphEnum$GraphEnum.BEELINE_STROKE_GRAPH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeelineStrokeGraph(@NotNull String id, @NotNull RectF outRect, @Nullable SourceLoader sourceLoader, @Nullable String str, @Nullable Integer num) {
        super(id, outRect, sourceLoader, str, num);
        AbstractC5830k.m5330g(id, "id");
        AbstractC5830k.m5330g(outRect, "outRect");
    }
}
