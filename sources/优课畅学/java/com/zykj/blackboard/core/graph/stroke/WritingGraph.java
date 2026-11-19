package com.zykj.blackboard.core.graph.stroke;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.Log;
import com.zykj.blackboard.core.graph.root.BoundedContainerGraph;
import com.zykj.blackboard.core.loader.SourceLoader;
import com.zykj.blackboard.utils.GraphUtils;
import com.zykj.blackboard.utils.GraphUtilsKt;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.board.EzyPageSnapshot;
import com.zykj.board.EzyPaint;
import com.zykj.board.EzySource;
import com.zykj.board.EzyTouchEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public abstract class WritingGraph extends BoundedContainerGraph {
    private final ArrayList<EzyTouchEvent.TouchEvent> mEventList;
    private Paint mPaint;
    private float paintItemLength;
    private float paintSpacing;
    private Path path;
    private Path renderPath;
    private String sourceFileName;
    private Integer sourceId;
    private SourceLoader sourceLoader;
    private final Matrix tempMatrix;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WritingGraph(String id, RectF outRectF, SourceLoader sourceLoader, String str, Integer num) {
        super(id, outRectF, str, num);
        AbstractC9133u.m16133g(id, "id");
        AbstractC9133u.m16133g(outRectF, "outRectF");
        this.sourceLoader = sourceLoader;
        this.sourceFileName = str;
        this.sourceId = num;
        this.paintItemLength = 1.0f;
        this.renderPath = new Path();
        this.tempMatrix = new Matrix();
        this.mEventList = new ArrayList<>();
    }

    private final EzySource.TouchSource.TouchInfo getTouchInfo() {
        if (this.sourceLoader == null || getSourceFileName() == null || getSourceId() == null) {
            return null;
        }
        SourceLoader sourceLoader = this.sourceLoader;
        AbstractC9133u.m16130d(sourceLoader);
        String sourceFileName = getSourceFileName();
        AbstractC9133u.m16130d(sourceFileName);
        Integer sourceId = getSourceId();
        AbstractC9133u.m16130d(sourceId);
        return sourceLoader.getTouchCache(sourceFileName, sourceId.intValue());
    }

    private final float lineSpace(float f10, float f11, float f12, float f13) {
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        return (float) Math.sqrt((f14 * f14) + (f15 * f15));
    }

    private final float pointToLine(float f10, float f11, float f12, float f13, float f14, float f15) {
        float fLineSpace = lineSpace(f10, f11, f12, f13);
        float fLineSpace2 = lineSpace(f10, f11, f14, f15);
        float fLineSpace3 = lineSpace(f12, f13, f14, f15);
        float f16 = fLineSpace3 * fLineSpace3;
        float f17 = fLineSpace * fLineSpace;
        float f18 = fLineSpace2 * fLineSpace2;
        if (f16 >= f17 + f18) {
            return fLineSpace2;
        }
        if (f18 >= f17 + f16) {
            return fLineSpace3;
        }
        float f19 = 2;
        float f20 = ((fLineSpace + fLineSpace2) + fLineSpace3) / f19;
        return (f19 * ((float) Math.sqrt((((f20 - fLineSpace) * f20) * (f20 - fLineSpace2)) * (f20 - fLineSpace3)))) / fLineSpace;
    }

    public final ArrayList<EzyTouchEvent.TouchEvent> getMEventList() {
        return this.mEventList;
    }

    public final Paint getMPaint() {
        return this.mPaint;
    }

    @Override // com.zykj.blackboard.core.graph.Graph, com.zykj.blackboard.core.graph.IGraph
    public RectF getMinOutRectF(Matrix matrix) {
        if (this.path == null) {
            initPath();
        }
        Path path = this.path;
        if (path != null) {
            path.transform(getRenderMatrix(), this.renderPath);
        }
        Path path2 = this.renderPath;
        if (path2 != null) {
            if (matrix == null) {
                matrix = new Matrix();
            }
            path2.transform(matrix, this.renderPath);
        }
        RectF rectF = new RectF();
        Path path3 = this.renderPath;
        if (path3 != null) {
            path3.computeBounds(rectF, false);
        }
        float f10 = rectF.left;
        Paint paint = this.mPaint;
        rectF.left = f10 - (paint != null ? paint.getStrokeWidth() : 0.0f);
        float f11 = rectF.top;
        Paint paint2 = this.mPaint;
        rectF.top = f11 - (paint2 != null ? paint2.getStrokeWidth() : 0.0f);
        float f12 = rectF.right;
        Paint paint3 = this.mPaint;
        rectF.right = f12 + (paint3 != null ? paint3.getStrokeWidth() : 0.0f);
        float f13 = rectF.bottom;
        Paint paint4 = this.mPaint;
        rectF.bottom = f13 + (paint4 != null ? paint4.getStrokeWidth() : 0.0f);
        return rectF;
    }

    public final float getPaintItemLength() {
        return this.paintItemLength;
    }

    public final float getPaintSpacing() {
        return this.paintSpacing;
    }

    public final Path getPath() {
        return this.path;
    }

    public final Path getRenderPath() {
        return this.renderPath;
    }

    @Override // com.zykj.blackboard.core.graph.root.BoundedContainerGraph, com.zykj.blackboard.core.graph.Graph, com.zykj.blackboard.core.graph.IGraph
    public EzyPageSnapshot.PageSnapshot.GraphSnapshot.C7228b getSnapshot() {
        EzyPageSnapshot.PageSnapshot.GraphSnapshot.C7228b snapshot = super.getSnapshot();
        Paint paint = this.mPaint;
        if (paint != null) {
            snapshot.m8411P(GraphUtilsKt.covertEzyPaint(paint, this.paintItemLength, this.paintSpacing));
        }
        return snapshot;
    }

    @Override // com.zykj.blackboard.core.graph.root.BoundedContainerGraph
    public String getSourceFileName() {
        return this.sourceFileName;
    }

    @Override // com.zykj.blackboard.core.graph.root.BoundedContainerGraph
    public Integer getSourceId() {
        return this.sourceId;
    }

    public final SourceLoader getSourceLoader() {
        return this.sourceLoader;
    }

    public final Matrix getTempMatrix() {
        return this.tempMatrix;
    }

    public void initPath() {
        EzySource.TouchSource.TouchInfo touchInfo = getTouchInfo();
        if (touchInfo != null) {
            List touchEventList = touchInfo.getTouchEventList();
            AbstractC9133u.m16132f(touchEventList, "it.touchEventList");
            updateEventList(touchEventList);
            updatePath(GraphUtils.INSTANCE.eventConvertPath(this.mEventList));
            EzyPaint.Paint paintM9013j = touchInfo.m9013j();
            AbstractC9133u.m16132f(paintM9013j, "it.paint");
            updatePaint(paintM9013j);
            updateRenderRectF();
        }
    }

    @Override // com.zykj.blackboard.core.graph.Graph, com.zykj.blackboard.core.graph.IGraph
    public boolean isCollide(float f10, float f11, float f12) {
        EzySource.TouchSource.TouchInfo touchInfo;
        long jCurrentTimeMillis = System.currentTimeMillis();
        float[] fArr = {f10, f11};
        this.tempMatrix.reset();
        this.tempMatrix.postConcat(MatrixExtKt.invert(getRenderMatrix()));
        this.tempMatrix.mapPoints(fArr);
        if (this.mEventList.isEmpty() && (touchInfo = getTouchInfo()) != null) {
            this.mEventList.addAll(touchInfo.getTouchEventList());
        }
        int size = this.mEventList.size() - 1;
        int i10 = 0;
        while (i10 < size) {
            float x10 = this.mEventList.get(i10).getX();
            float y10 = this.mEventList.get(i10).getY();
            i10++;
            if (pointToLine(x10, y10, this.mEventList.get(i10).getX(), this.mEventList.get(i10).getY(), fArr[0], fArr[1]) <= f12) {
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

    public final void setPaint(Paint paint, float f10, float f11) {
        AbstractC9133u.m16133g(paint, "paint");
        this.mPaint = paint;
        if (f11 == 0.0f || f10 == 0.0f) {
            f10 = 1.0f;
        }
        this.paintItemLength = f10;
        this.paintSpacing = f11;
    }

    public final void setPaintItemLength(float f10) {
        this.paintItemLength = f10;
    }

    public final void setPaintSpacing(float f10) {
        this.paintSpacing = f10;
    }

    public final void setPath(Path path) {
        this.path = path;
    }

    public final void setRenderPath(Path path) {
        this.renderPath = path;
    }

    @Override // com.zykj.blackboard.core.graph.root.BoundedContainerGraph
    public void setSourceFileName(String str) {
        this.sourceFileName = str;
    }

    @Override // com.zykj.blackboard.core.graph.root.BoundedContainerGraph
    public void setSourceId(Integer num) {
        this.sourceId = num;
    }

    public final void setSourceLoader(SourceLoader sourceLoader) {
        this.sourceLoader = sourceLoader;
    }

    public final void updateEventList(List<EzyTouchEvent.TouchEvent> list) {
        AbstractC9133u.m16133g(list, "list");
        this.mEventList.clear();
        this.mEventList.addAll(list);
    }

    public final void updatePaint(EzyPaint.Paint paint) {
        AbstractC9133u.m16133g(paint, "paint");
        if (this.mPaint != null) {
            return;
        }
        this.mPaint = GraphUtilsKt.covertPaint(paint);
        this.paintItemLength = (paint.m8477k() == 0.0f || paint.m8476j() == 0.0f) ? 1.0f : paint.m8476j();
        this.paintSpacing = paint.m8477k();
    }

    public final void updatePath(Path path) {
        AbstractC9133u.m16133g(path, "path");
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
        float f10 = renderRectF.left;
        if (f10 == renderRectF.right && f10 != 0.0f) {
            renderRectF.left = f10 - 1;
        }
        float f11 = renderRectF.top;
        if (f11 != renderRectF.bottom || f11 == 0.0f) {
            return;
        }
        renderRectF.top = f11 - 1;
    }
}
