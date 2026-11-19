package com.zykj.blackboard.core.graph.stroke;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.core.graph.root.BoundedContainerGraph;
import com.zykj.blackboard.core.loader.SourceLoader;
import com.zykj.blackboard.utils.GraphUtils;
import com.zykj.blackboard.utils.GraphUtilsKt;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.board.C4361d0;
import com.zykj.board.EzyPaint$Paint;
import com.zykj.board.EzySource$TouchSource;
import com.zykj.board.EzyTouchEvent$TouchEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u000fJ\u0015\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010\"\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u0013¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u001b\u0010+\u001a\u00020\r2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(¢\u0006\u0004\b+\u0010,J\u0019\u0010/\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\rH\u0016¢\u0006\u0004\b1\u0010\u000fJ\u0011\u00103\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\b3\u00104J?\u0010;\u001a\u00020\u00132\u0006\u00105\u001a\u00020\u00132\u0006\u00106\u001a\u00020\u00132\u0006\u00107\u001a\u00020\u00132\u0006\u00108\u001a\u00020\u00132\u0006\u00109\u001a\u00020\u00132\u0006\u0010:\u001a\u00020\u0013H\u0002¢\u0006\u0004\b;\u0010<J/\u0010=\u001a\u00020\u00132\u0006\u00105\u001a\u00020\u00132\u0006\u00106\u001a\u00020\u00132\u0006\u00107\u001a\u00020\u00132\u0006\u00108\u001a\u00020\u0013H\u0002¢\u0006\u0004\b=\u0010>R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010N\u001a\u00020\u00138\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010!\u001a\u00020\u00138\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b!\u0010O\u001a\u0004\bT\u0010Q\"\u0004\bU\u0010SR(\u0010W\u001a\u0004\u0018\u00010\u001f2\b\u0010V\u001a\u0004\u0018\u00010\u001f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR$\u0010%\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010'R$\u0010_\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010[\u001a\u0004\b`\u0010]\"\u0004\ba\u0010'R\u0017\u0010b\u001a\u00020-8\u0006¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR'\u0010h\u001a\u0012\u0012\u0004\u0012\u00020)0fj\b\u0012\u0004\u0012\u00020)`g8\u0006¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u0011\u0010l\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\bl\u0010m¨\u0006n"}, m5110d2 = {"Lcom/zykj/blackboard/core/graph/stroke/WritingGraph;", "Lcom/zykj/blackboard/core/graph/root/BoundedContainerGraph;", "", "id", "Landroid/graphics/RectF;", "outRectF", "Lcom/zykj/blackboard/core/loader/SourceLoader;", "sourceLoader", "sourceFileName", "", "sourceId", "<init>", "(Ljava/lang/String;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/loader/SourceLoader;Ljava/lang/String;Ljava/lang/Integer;)V", "Ld6/s;", "initPath", "()V", "Lcom/zykj/board/d0;", "getSnapshot", "()Lcom/zykj/board/d0;", "", "x", "y", TypedValues.CycleType.S_WAVE_OFFSET, "", "isCollide", "(FFF)Z", "updateRenderRectF", "Lcom/zykj/board/EzyPaint$Paint;", "paint", "updatePaint", "(Lcom/zykj/board/EzyPaint$Paint;)V", "Landroid/graphics/Paint;", "pathItemLength", "paintSpacing", "setPaint", "(Landroid/graphics/Paint;FF)V", "Landroid/graphics/Path;", "path", "updatePath", "(Landroid/graphics/Path;)V", "", "Lcom/zykj/board/EzyTouchEvent$TouchEvent;", "list", "updateEventList", "(Ljava/util/List;)V", "Landroid/graphics/Matrix;", "adapterMatrix", "getMinOutRectF", "(Landroid/graphics/Matrix;)Landroid/graphics/RectF;", "onDestroy", "Lcom/zykj/board/EzySource$TouchSource$TouchInfo;", "getTouchInfo", "()Lcom/zykj/board/EzySource$TouchSource$TouchInfo;", "x1", "y1", "x2", "y2", "x0", "y0", "pointToLine", "(FFFFFF)F", "lineSpace", "(FFFF)F", "Lcom/zykj/blackboard/core/loader/SourceLoader;", "getSourceLoader", "()Lcom/zykj/blackboard/core/loader/SourceLoader;", "setSourceLoader", "(Lcom/zykj/blackboard/core/loader/SourceLoader;)V", "Ljava/lang/String;", "getSourceFileName", "()Ljava/lang/String;", "setSourceFileName", "(Ljava/lang/String;)V", "Ljava/lang/Integer;", "getSourceId", "()Ljava/lang/Integer;", "setSourceId", "(Ljava/lang/Integer;)V", "paintItemLength", "F", "getPaintItemLength", "()F", "setPaintItemLength", "(F)V", "getPaintSpacing", "setPaintSpacing", "<set-?>", "mPaint", "Landroid/graphics/Paint;", "getMPaint", "()Landroid/graphics/Paint;", "Landroid/graphics/Path;", "getPath", "()Landroid/graphics/Path;", "setPath", "renderPath", "getRenderPath", "setRenderPath", "tempMatrix", "Landroid/graphics/Matrix;", "getTempMatrix", "()Landroid/graphics/Matrix;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "mEventList", "Ljava/util/ArrayList;", "getMEventList", "()Ljava/util/ArrayList;", "isHighlighter", "()Z", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public abstract class WritingGraph extends BoundedContainerGraph {

    @NotNull
    private final ArrayList<EzyTouchEvent$TouchEvent> mEventList;

    @Nullable
    private Paint mPaint;
    private float paintItemLength;
    private float paintSpacing;

    @Nullable
    private Path path;

    @Nullable
    private Path renderPath;

    @Nullable
    private String sourceFileName;

    @Nullable
    private Integer sourceId;

    @Nullable
    private SourceLoader sourceLoader;

    @NotNull
    private final Matrix tempMatrix;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WritingGraph(@NotNull String id, @NotNull RectF outRectF, @Nullable SourceLoader sourceLoader, @Nullable String str, @Nullable Integer num) {
        super(id, outRectF, str, num);
        AbstractC5830k.m5330g(id, "id");
        AbstractC5830k.m5330g(outRectF, "outRectF");
        this.sourceLoader = sourceLoader;
        this.sourceFileName = str;
        this.sourceId = num;
        this.paintItemLength = 1.0f;
        this.renderPath = new Path();
        this.tempMatrix = new Matrix();
        this.mEventList = new ArrayList<>();
    }

    private final EzySource$TouchSource.TouchInfo getTouchInfo() {
        if (this.sourceLoader == null || getSourceFileName() == null || getSourceId() == null) {
            return null;
        }
        SourceLoader sourceLoader = this.sourceLoader;
        AbstractC5830k.m5327d(sourceLoader);
        String sourceFileName = getSourceFileName();
        AbstractC5830k.m5327d(sourceFileName);
        Integer sourceId = getSourceId();
        AbstractC5830k.m5327d(sourceId);
        return sourceLoader.getTouchCache(sourceFileName, sourceId.intValue());
    }

    private final float lineSpace(float x12, float y12, float x22, float y2) {
        float f = x12 - x22;
        float f7 = y12 - y2;
        return (float) Math.sqrt((f7 * f7) + (f * f));
    }

    private final float pointToLine(float x12, float y12, float x22, float y2, float x0, float y02) {
        float fLineSpace = lineSpace(x12, y12, x22, y2);
        float fLineSpace2 = lineSpace(x12, y12, x0, y02);
        float fLineSpace3 = lineSpace(x22, y2, x0, y02);
        float f = fLineSpace3 * fLineSpace3;
        float f7 = fLineSpace * fLineSpace;
        float f8 = fLineSpace2 * fLineSpace2;
        if (f >= f7 + f8) {
            return fLineSpace2;
        }
        if (f8 >= f7 + f) {
            return fLineSpace3;
        }
        float f9 = 2;
        float f10 = ((fLineSpace + fLineSpace2) + fLineSpace3) / f9;
        return (f9 * ((float) Math.sqrt((f10 - fLineSpace3) * ((f10 - fLineSpace2) * ((f10 - fLineSpace) * f10))))) / fLineSpace;
    }

    @NotNull
    public final ArrayList<EzyTouchEvent$TouchEvent> getMEventList() {
        return this.mEventList;
    }

    @Nullable
    public final Paint getMPaint() {
        return this.mPaint;
    }

    @Override // com.zykj.blackboard.core.graph.Graph, com.zykj.blackboard.core.graph.IGraph
    @NotNull
    public RectF getMinOutRectF(@Nullable Matrix adapterMatrix) {
        if (this.path == null) {
            initPath();
        }
        Path path = this.path;
        if (path != null) {
            path.transform(getRenderMatrix(), this.renderPath);
        }
        Path path2 = this.renderPath;
        if (path2 != null) {
            if (adapterMatrix == null) {
                adapterMatrix = new Matrix();
            }
            path2.transform(adapterMatrix, this.renderPath);
        }
        RectF rectF = new RectF();
        Path path3 = this.renderPath;
        if (path3 != null) {
            path3.computeBounds(rectF, false);
        }
        float f = rectF.left;
        Paint paint = this.mPaint;
        rectF.left = f - (paint != null ? paint.getStrokeWidth() : 0.0f);
        float f7 = rectF.top;
        Paint paint2 = this.mPaint;
        rectF.top = f7 - (paint2 != null ? paint2.getStrokeWidth() : 0.0f);
        float f8 = rectF.right;
        Paint paint3 = this.mPaint;
        rectF.right = f8 + (paint3 != null ? paint3.getStrokeWidth() : 0.0f);
        float f9 = rectF.bottom;
        Paint paint4 = this.mPaint;
        rectF.bottom = f9 + (paint4 != null ? paint4.getStrokeWidth() : 0.0f);
        return rectF;
    }

    public final float getPaintItemLength() {
        return this.paintItemLength;
    }

    public final float getPaintSpacing() {
        return this.paintSpacing;
    }

    @Nullable
    public final Path getPath() {
        return this.path;
    }

    @Nullable
    public final Path getRenderPath() {
        return this.renderPath;
    }

    @Override // com.zykj.blackboard.core.graph.root.BoundedContainerGraph, com.zykj.blackboard.core.graph.Graph, com.zykj.blackboard.core.graph.IGraph
    @NotNull
    public C4361d0 getSnapshot() {
        C4361d0 snapshot = super.getSnapshot();
        Paint paint = this.mPaint;
        if (paint != null) {
            snapshot.m3719n(GraphUtilsKt.covertEzyPaint(paint, this.paintItemLength, this.paintSpacing));
        }
        return snapshot;
    }

    @Override // com.zykj.blackboard.core.graph.root.BoundedContainerGraph
    @Nullable
    public String getSourceFileName() {
        return this.sourceFileName;
    }

    @Override // com.zykj.blackboard.core.graph.root.BoundedContainerGraph
    @Nullable
    public Integer getSourceId() {
        return this.sourceId;
    }

    @Nullable
    public final SourceLoader getSourceLoader() {
        return this.sourceLoader;
    }

    @NotNull
    public final Matrix getTempMatrix() {
        return this.tempMatrix;
    }

    public void initPath() {
        EzySource$TouchSource.TouchInfo touchInfo = getTouchInfo();
        if (touchInfo != null) {
            List<EzyTouchEvent$TouchEvent> touchEventList = touchInfo.getTouchEventList();
            AbstractC5830k.m5329f(touchEventList, "it.touchEventList");
            updateEventList(touchEventList);
            updatePath(GraphUtils.INSTANCE.eventConvertPath(this.mEventList));
            EzyPaint$Paint paint = touchInfo.getPaint();
            AbstractC5830k.m5329f(paint, "it.paint");
            updatePaint(paint);
            updateRenderRectF();
        }
    }

    @Override // com.zykj.blackboard.core.graph.Graph, com.zykj.blackboard.core.graph.IGraph
    public boolean isCollide(float x3, float y2, float offset) {
        EzySource$TouchSource.TouchInfo touchInfo;
        long jCurrentTimeMillis = System.currentTimeMillis();
        float[] fArr = {x3, y2};
        this.tempMatrix.reset();
        this.tempMatrix.postConcat(MatrixExtKt.invert(getRenderMatrix()));
        this.tempMatrix.mapPoints(fArr);
        if (this.mEventList.isEmpty() && (touchInfo = getTouchInfo()) != null) {
            this.mEventList.addAll(touchInfo.getTouchEventList());
        }
        int size = this.mEventList.size() - 1;
        int i = 0;
        while (i < size) {
            float x8 = this.mEventList.get(i).getX();
            float y3 = this.mEventList.get(i).getY();
            i++;
            if (pointToLine(x8, y3, this.mEventList.get(i).getX(), this.mEventList.get(i).getY(), fArr[0], fArr[1]) <= offset) {
                return true;
            }
        }
        Log.i("deleteGraph", "消耗时间D >> " + (System.currentTimeMillis() - jCurrentTimeMillis));
        return false;
    }

    public final boolean isHighlighter() {
        Paint paint = this.mPaint;
        return paint != null && Color.alpha(paint.getColor()) < 255;
    }

    @Override // com.zykj.blackboard.core.graph.Graph, com.zykj.blackboard.core.graph.IGraph
    public void onDestroy() {
        super.onDestroy();
        this.path = null;
        this.mPaint = null;
        this.renderPath = null;
    }

    public final void setPaint(@NotNull Paint paint, float pathItemLength, float paintSpacing) {
        AbstractC5830k.m5330g(paint, "paint");
        this.mPaint = paint;
        if (paintSpacing == 0.0f || pathItemLength == 0.0f) {
            pathItemLength = 1.0f;
        }
        this.paintItemLength = pathItemLength;
        this.paintSpacing = paintSpacing;
    }

    public final void setPaintItemLength(float f) {
        this.paintItemLength = f;
    }

    public final void setPaintSpacing(float f) {
        this.paintSpacing = f;
    }

    public final void setPath(@Nullable Path path) {
        this.path = path;
    }

    public final void setRenderPath(@Nullable Path path) {
        this.renderPath = path;
    }

    @Override // com.zykj.blackboard.core.graph.root.BoundedContainerGraph
    public void setSourceFileName(@Nullable String str) {
        this.sourceFileName = str;
    }

    @Override // com.zykj.blackboard.core.graph.root.BoundedContainerGraph
    public void setSourceId(@Nullable Integer num) {
        this.sourceId = num;
    }

    public final void setSourceLoader(@Nullable SourceLoader sourceLoader) {
        this.sourceLoader = sourceLoader;
    }

    public final void updateEventList(@NotNull List<EzyTouchEvent$TouchEvent> list) {
        AbstractC5830k.m5330g(list, "list");
        this.mEventList.clear();
        this.mEventList.addAll(list);
    }

    public final void updatePaint(@NotNull EzyPaint$Paint paint) {
        AbstractC5830k.m5330g(paint, "paint");
        if (this.mPaint != null) {
            return;
        }
        this.mPaint = GraphUtilsKt.covertPaint(paint);
        this.paintItemLength = (paint.getSpacing() == 0.0f || paint.getItemLength() == 0.0f) ? 1.0f : paint.getItemLength();
        this.paintSpacing = paint.getSpacing();
    }

    public final void updatePath(@NotNull Path path) {
        AbstractC5830k.m5330g(path, "path");
        Path path2 = new Path();
        this.path = path2;
        path2.set(path);
    }

    @Override // com.zykj.blackboard.core.graph.Graph, com.zykj.blackboard.core.graph.IGraphChange
    public void updateRenderRectF() {
        Path path = this.path;
        if (path != null) {
            path.transform(getRenderMatrix(), this.renderPath);
        }
        Path path2 = this.renderPath;
        if (path2 != null) {
            path2.computeBounds(getRenderRectF(), false);
        }
        RectF renderRectF = getRenderRectF();
        float f = renderRectF.left;
        if (f == renderRectF.right && f != 0.0f) {
            renderRectF.left = f - 1;
        }
        float f7 = renderRectF.top;
        if (f7 != renderRectF.bottom || f7 == 0.0f) {
            return;
        }
        renderRectF.top = f7 - 1;
    }
}
