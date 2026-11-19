package com.zykj.blackboard.core.graph.group;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.loader.SourceLoader;
import com.zykj.blackboard.utils.GraphUtilsKt;
import com.zykj.blackboard.utils.TextGraphUtils;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyPageSnapshot;
import com.zykj.board.EzyPaint;
import com.zykj.board.EzySource;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class TextGraph extends GroupGraph {
    private String content;
    private float mTempDrawOffset;
    private Matrix mTempMatrix;
    private Path mTempPath;
    private Paint paint;
    private String sourceFileName;
    private Integer sourceId;
    private final SourceLoader sourceLoader;

    public /* synthetic */ TextGraph(String str, RectF rectF, SourceLoader sourceLoader, String str2, Integer num, int i10, AbstractC9126n abstractC9126n) {
        this(str, rectF, (i10 & 4) != 0 ? null : sourceLoader, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : num);
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph, com.zykj.blackboard.core.graph.IGraph
    public Graph copy() {
        TextGraph textGraph = new TextGraph(getId(), new RectF(getOriginalRectF()), this.sourceLoader, getSourceFileName(), getSourceId());
        textGraph.setContent(this.content);
        Paint paint = this.paint;
        if (paint != null) {
            textGraph.setPaint(new Paint(paint));
        }
        textGraph.initMatrix(getRenderMatrix());
        Iterator<T> it = getChildGraph().iterator();
        while (it.hasNext()) {
            textGraph.addGraph(((IGraph) it.next()).copy());
        }
        return textGraph;
    }

    public final String getContent() {
        return this.content;
    }

    public final Paint getPaint() {
        return this.paint;
    }

    @Override // com.zykj.blackboard.core.graph.root.BoundedContainerGraph, com.zykj.blackboard.core.graph.Graph, com.zykj.blackboard.core.graph.IGraph
    public EzyPageSnapshot.PageSnapshot.GraphSnapshot.C7228b getSnapshot() {
        EzyPageSnapshot.PageSnapshot.GraphSnapshot.C7228b snapshot = super.getSnapshot();
        Paint paint = this.paint;
        if (paint != null) {
            snapshot.m8411P(GraphUtilsKt.covertEzyPaint(paint, 1.0f, 0.0f));
        }
        String str = this.content;
        if (str != null) {
            snapshot.m8403H(str);
        }
        return snapshot;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph
    public String getSourceFileName() {
        return this.sourceFileName;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph
    public Integer getSourceId() {
        return this.sourceId;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph, com.zykj.blackboard.core.graph.IGraph
    public EzyGraphEnum.GraphEnum graphType() {
        return EzyGraphEnum.GraphEnum.TEXT_GRAPH;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph, com.zykj.blackboard.core.graph.IDraw
    public void render(Canvas canvas, Matrix matrix) {
        SourceLoader sourceLoader;
        AbstractC9133u.m16133g(canvas, "canvas");
        AbstractC9133u.m16133g(matrix, "matrix");
        if ((this.content == null || this.paint == null) && (sourceLoader = this.sourceLoader) != null) {
            String sourceFileName = getSourceFileName();
            AbstractC9133u.m16130d(sourceFileName);
            Integer sourceId = getSourceId();
            AbstractC9133u.m16130d(sourceId);
            EzySource.TextSource.TextInfo textCache = sourceLoader.getTextCache(sourceFileName, sourceId.intValue());
            if (textCache != null) {
                if (this.content == null) {
                    setContent(textCache.getContent());
                }
                if (this.paint == null) {
                    EzyPaint.Paint paintM8942i = textCache.m8942i();
                    AbstractC9133u.m16132f(paintM8942i, "it.paint");
                    setPaint(GraphUtilsKt.covertPaint(paintM8942i));
                }
            }
        }
        this.mTempMatrix.reset();
        this.mTempMatrix.postConcat(getRenderMatrix());
        this.mTempMatrix.postConcat(matrix);
        Paint paint = this.paint;
        if (paint != null) {
            this.mTempDrawOffset = -paint.getFontMetrics().top;
            TextGraphUtils textGraphUtils = TextGraphUtils.INSTANCE;
            String str = this.content;
            if (str == null) {
                str = "";
            }
            for (String str2 : textGraphUtils.calculateTextToList(str, paint, getOriginalRectF().width())) {
                this.mTempPath.reset();
                paint.getTextPath(str2, 0, str2.length(), 0.0f, this.mTempDrawOffset, this.mTempPath);
                this.mTempPath.transform(this.mTempMatrix);
                canvas.drawPath(this.mTempPath, paint);
                this.mTempDrawOffset += paint.getFontMetrics().bottom - paint.getFontMetrics().top;
            }
        }
    }

    public final void setContent(String str) {
        this.content = str;
        setNeedUpdate(true);
    }

    public final void setPaint(Paint paint) {
        this.paint = paint;
        setNeedUpdate(true);
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph
    public void setSourceFileName(String str) {
        this.sourceFileName = str;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph
    public void setSourceId(Integer num) {
        this.sourceId = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextGraph(String id, RectF outRectF, SourceLoader sourceLoader, String str, Integer num) {
        super(id, outRectF, str, num);
        AbstractC9133u.m16133g(id, "id");
        AbstractC9133u.m16133g(outRectF, "outRectF");
        this.sourceLoader = sourceLoader;
        this.sourceFileName = str;
        this.sourceId = num;
        this.mTempMatrix = new Matrix();
        this.mTempPath = new Path();
    }
}
