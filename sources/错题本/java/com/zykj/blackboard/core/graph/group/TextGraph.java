package com.zykj.blackboard.core.graph.group;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.loader.SourceLoader;
import com.zykj.blackboard.utils.GraphUtilsKt;
import com.zykj.blackboard.utils.TextGraphUtils;
import com.zykj.board.C4361d0;
import com.zykj.board.EzyGraphEnum$GraphEnum;
import com.zykj.board.EzyPaint$Paint;
import com.zykj.board.EzySource$TextSource;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R.\u0010)\u001a\u0004\u0018\u00010\u00022\b\u0010(\u001a\u0004\u0018\u00010\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001e\u001a\u0004\b*\u0010 \"\u0004\b+\u0010\"R.\u0010-\u001a\u0004\u0018\u00010,2\b\u0010(\u001a\u0004\u0018\u00010,8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0016\u00103\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006;"}, m5110d2 = {"Lcom/zykj/blackboard/core/graph/group/TextGraph;", "Lcom/zykj/blackboard/core/graph/group/GroupGraph;", "", "id", "Landroid/graphics/RectF;", "outRectF", "Lcom/zykj/blackboard/core/loader/SourceLoader;", "sourceLoader", "sourceFileName", "", "sourceId", "<init>", "(Ljava/lang/String;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/loader/SourceLoader;Ljava/lang/String;Ljava/lang/Integer;)V", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/Matrix;", "matrix", "Ld6/s;", "render", "(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V", "Lcom/zykj/board/d0;", "getSnapshot", "()Lcom/zykj/board/d0;", "Lcom/zykj/board/EzyGraphEnum$GraphEnum;", "graphType", "()Lcom/zykj/board/EzyGraphEnum$GraphEnum;", "Lcom/zykj/blackboard/core/graph/Graph;", "copy", "()Lcom/zykj/blackboard/core/graph/Graph;", "Lcom/zykj/blackboard/core/loader/SourceLoader;", "Ljava/lang/String;", "getSourceFileName", "()Ljava/lang/String;", "setSourceFileName", "(Ljava/lang/String;)V", "Ljava/lang/Integer;", "getSourceId", "()Ljava/lang/Integer;", "setSourceId", "(Ljava/lang/Integer;)V", "value", "content", "getContent", "setContent", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "setPaint", "(Landroid/graphics/Paint;)V", "mTempMatrix", "Landroid/graphics/Matrix;", "Landroid/graphics/Path;", "mTempPath", "Landroid/graphics/Path;", "", "mTempDrawOffset", "F", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class TextGraph extends GroupGraph {

    @Nullable
    private String content;
    private float mTempDrawOffset;

    @NotNull
    private Matrix mTempMatrix;

    @NotNull
    private Path mTempPath;

    @Nullable
    private Paint paint;

    @Nullable
    private String sourceFileName;

    @Nullable
    private Integer sourceId;

    @Nullable
    private final SourceLoader sourceLoader;

    public /* synthetic */ TextGraph(String str, RectF rectF, SourceLoader sourceLoader, String str2, Integer num, int i, AbstractC5824e abstractC5824e) {
        this(str, rectF, (i & 4) != 0 ? null : sourceLoader, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num);
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph, com.zykj.blackboard.core.graph.IGraph
    @NotNull
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

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final Paint getPaint() {
        return this.paint;
    }

    @Override // com.zykj.blackboard.core.graph.root.BoundedContainerGraph, com.zykj.blackboard.core.graph.Graph, com.zykj.blackboard.core.graph.IGraph
    @NotNull
    public C4361d0 getSnapshot() {
        C4361d0 snapshot = super.getSnapshot();
        Paint paint = this.paint;
        if (paint != null) {
            snapshot.m3719n(GraphUtilsKt.covertEzyPaint(paint, 1.0f, 0.0f));
        }
        String str = this.content;
        if (str != null) {
            snapshot.getClass();
            snapshot.f5472o = str;
            snapshot.f5458a |= 512;
            snapshot.onChanged();
        }
        return snapshot;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph
    @Nullable
    public String getSourceFileName() {
        return this.sourceFileName;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph
    @Nullable
    public Integer getSourceId() {
        return this.sourceId;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph, com.zykj.blackboard.core.graph.IGraph
    @NotNull
    public EzyGraphEnum$GraphEnum graphType() {
        return EzyGraphEnum$GraphEnum.TEXT_GRAPH;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph, com.zykj.blackboard.core.graph.IDraw
    public void render(@NotNull Canvas canvas, @NotNull Matrix matrix) {
        SourceLoader sourceLoader;
        AbstractC5830k.m5330g(canvas, "canvas");
        AbstractC5830k.m5330g(matrix, "matrix");
        if ((this.content == null || this.paint == null) && (sourceLoader = this.sourceLoader) != null) {
            String sourceFileName = getSourceFileName();
            AbstractC5830k.m5327d(sourceFileName);
            Integer sourceId = getSourceId();
            AbstractC5830k.m5327d(sourceId);
            EzySource$TextSource.TextInfo textCache = sourceLoader.getTextCache(sourceFileName, sourceId.intValue());
            if (textCache != null) {
                if (this.content == null) {
                    setContent(textCache.getContent());
                }
                if (this.paint == null) {
                    EzyPaint$Paint paint = textCache.getPaint();
                    AbstractC5830k.m5329f(paint, "it.paint");
                    setPaint(GraphUtilsKt.covertPaint(paint));
                }
            }
        }
        this.mTempMatrix.reset();
        this.mTempMatrix.postConcat(getRenderMatrix());
        this.mTempMatrix.postConcat(matrix);
        Paint paint2 = this.paint;
        if (paint2 != null) {
            this.mTempDrawOffset = -paint2.getFontMetrics().top;
            TextGraphUtils textGraphUtils = TextGraphUtils.INSTANCE;
            String str = this.content;
            if (str == null) {
                str = "";
            }
            for (String str2 : textGraphUtils.calculateTextToList(str, paint2, getOriginalRectF().width())) {
                this.mTempPath.reset();
                paint2.getTextPath(str2, 0, str2.length(), 0.0f, this.mTempDrawOffset, this.mTempPath);
                this.mTempPath.transform(this.mTempMatrix);
                canvas.drawPath(this.mTempPath, paint2);
                this.mTempDrawOffset = (paint2.getFontMetrics().bottom - paint2.getFontMetrics().top) + this.mTempDrawOffset;
            }
        }
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
        setNeedUpdate(true);
    }

    public final void setPaint(@Nullable Paint paint) {
        this.paint = paint;
        setNeedUpdate(true);
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph
    public void setSourceFileName(@Nullable String str) {
        this.sourceFileName = str;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph
    public void setSourceId(@Nullable Integer num) {
        this.sourceId = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextGraph(@NotNull String id, @NotNull RectF outRectF, @Nullable SourceLoader sourceLoader, @Nullable String str, @Nullable Integer num) {
        super(id, outRectF, str, num);
        AbstractC5830k.m5330g(id, "id");
        AbstractC5830k.m5330g(outRectF, "outRectF");
        this.sourceLoader = sourceLoader;
        this.sourceFileName = str;
        this.sourceId = num;
        this.mTempMatrix = new Matrix();
        this.mTempPath = new Path();
    }
}
