package com.zykj.sketch.core.graph;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Log;
import androidx.core.internal.view.SupportMenu;
import com.zykj.sketch.GraphSnapshot;
import com.zykj.sketch.core.listener.IControl;
import com.zykj.sketch.core.listener.IDraw;
import com.zykj.sketch.core.listener.IGraph;
import com.zykj.sketch.extensions.ExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public abstract class Graph implements IGraph, IDraw {
    public static final Companion Companion = new Companion(null);
    private static final PointF cornerSize = new PointF(60.0f, 60.0f);
    private boolean complete;
    private final IControl control;
    private Bitmap deleteBitmap;
    private PointF deletePoint;
    private boolean isSelect;
    private final Paint mBorderPaint;
    private final Matrix mChildExtendMatrix;
    private CopyOnWriteArrayList<Graph> mChildGraph;
    private final Paint mDeletePaint;
    private Graph mFatherGraph;
    private final Matrix mMatrix;
    private RectF mOutRect;
    private final Paint mPaint;
    private String name;
    private boolean showDelete;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final PointF getCornerSize() {
            return Graph.cornerSize;
        }

        private Companion() {
        }
    }

    public Graph(IControl control) {
        AbstractC9133u.m16133g(control, "control");
        this.control = control;
        this.name = getClass().getSimpleName() + '-' + hashCode();
        this.mChildGraph = new CopyOnWriteArrayList<>();
        this.mMatrix = new Matrix();
        this.mChildExtendMatrix = new Matrix();
        this.mOutRect = new RectF();
        Paint paint = new Paint();
        this.mPaint = paint;
        Paint paint2 = new Paint();
        this.mDeletePaint = paint2;
        Paint paint3 = new Paint();
        this.mBorderPaint = paint3;
        this.complete = true;
        paint.setDither(true);
        paint.setAntiAlias(true);
        paint.setFlags(1);
        paint3.setColor(-16776961);
        paint3.setStrokeWidth(2.0f);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint3.setDither(true);
        paint3.setAntiAlias(true);
        paint2.setStrokeWidth(2.0f);
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        paint2.setColor(SupportMenu.CATEGORY_MASK);
        paint2.setStyle(style);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f}, 0.0f));
        this.deleteBitmap = control.getDeleteBitmap();
    }

    private final void drawBorder(Canvas canvas) {
        canvas.drawPath(GraphExtKt.rectConvertPath(this, this.mOutRect, GraphExtKt.getFP2WPRendMatrix(this)), this.mBorderPaint);
    }

    public static /* synthetic */ List findGraph$default(Graph graph, float f10, float f11, float f12, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findGraph");
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        return graph.findGraph(f10, f11, f12);
    }

    private final void showDelete(Canvas canvas) {
        canvas.drawPath(GraphExtKt.rectConvertPath(this, this.mOutRect, GraphExtKt.getFP2WPRendMatrix(this)), this.mDeletePaint);
        RectF rectF = this.mOutRect;
        PointF pointFMapPoint = GraphExtKt.mapPoint(this, rectF.right, rectF.top, GraphExtKt.getFP2WPRendMatrix(this));
        float f10 = pointFMapPoint.x;
        PointF pointF = cornerSize;
        float f11 = pointF.x;
        float f12 = 2;
        if (f10 < f11 / f12) {
            pointFMapPoint.x = f11 / f12;
        }
        if (pointFMapPoint.x > canvas.getWidth() - (pointF.x / f12)) {
            pointFMapPoint.x = canvas.getWidth() - (pointF.x / f12);
        }
        float f13 = pointFMapPoint.y;
        float f14 = pointF.y;
        if (f13 < f14 / f12) {
            pointFMapPoint.y = f14 / f12;
        }
        if (pointFMapPoint.y > canvas.getHeight() - (pointF.y / f12)) {
            pointFMapPoint.y = canvas.getHeight() - (pointF.y / f12);
        }
        float f15 = pointFMapPoint.x;
        float f16 = pointF.x;
        PointF pointF2 = new PointF(f15 - (f16 / f12), pointFMapPoint.y - (f16 / f12));
        this.deletePoint = pointF2;
        Bitmap bitmap = this.deleteBitmap;
        if (bitmap != null) {
            try {
                canvas.drawBitmap(bitmap, pointF2.x, pointF2.y, this.mDeletePaint);
                C8736p c8736p = C8736p.f16368a;
            } catch (Throwable unused) {
                Log.e("graph", "deleteBitmap被回收");
            }
        }
    }

    public void addGraph(Graph graph) {
        AbstractC9133u.m16133g(graph, "graph");
        if (!this.mChildGraph.contains(graph)) {
            this.mChildGraph.add(graph);
        }
        graph.mFatherGraph = this;
    }

    public final void cancelSelected() {
        for (Graph graph : this.mChildGraph) {
            graph.isSelect = false;
            graph.showDelete = false;
            graph.cancelSelected();
        }
        this.isSelect = false;
        this.showDelete = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int childTypeNumber(String className) {
        AbstractC9133u.m16133g(className, "className");
        boolean zM16128b = AbstractC9133u.m16128b(className, getClass().getName());
        Iterator<T> it = this.mChildGraph.iterator();
        int iChildTypeNumber = zM16128b;
        while (it.hasNext()) {
            iChildTypeNumber += ((Graph) it.next()).childTypeNumber(className);
        }
        return iChildTypeNumber;
    }

    public final void clear() {
        Iterator<T> it = this.mChildGraph.iterator();
        while (it.hasNext()) {
            ((Graph) it.next()).onDestroy();
        }
        this.mChildGraph.clear();
        this.mOutRect.setEmpty();
        this.mMatrix.reset();
        this.mChildExtendMatrix.reset();
    }

    public List<Graph> findGraph(float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        int size = this.mChildGraph.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            }
            arrayList.addAll(this.mChildGraph.get(size).findGraph(f10, f11, f12));
        }
        if (isInRect(f10, f11, f12)) {
            arrayList.add(this);
        }
        return arrayList;
    }

    @Override // com.zykj.sketch.core.listener.IGraph
    public Graph findGraphByName(String name) {
        AbstractC9133u.m16133g(name, "name");
        if (AbstractC9133u.m16128b(this.name, name)) {
            return this;
        }
        Iterator<T> it = this.mChildGraph.iterator();
        while (it.hasNext()) {
            Graph graphFindGraphByName = ((Graph) it.next()).findGraphByName(name);
            if (graphFindGraphByName != null) {
                return graphFindGraphByName;
            }
        }
        return null;
    }

    @Override // com.zykj.sketch.core.listener.IGraph
    public <T extends Graph> List<T> findGraphByType(Class<T> className) {
        AbstractC9133u.m16133g(className, "className");
        ArrayList arrayList = new ArrayList();
        if (AbstractC9133u.m16128b(getClass(), className)) {
            AbstractC9133u.m16131e(this, "null cannot be cast to non-null type T of com.zykj.sketch.core.graph.Graph.findGraphByType");
            arrayList.add(this);
            return arrayList;
        }
        Iterator<T> it = this.mChildGraph.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((Graph) it.next()).findGraphByType(className));
        }
        return arrayList;
    }

    public final List<Graph> findSelectGraph() {
        ArrayList arrayList = new ArrayList();
        if (this.isSelect) {
            arrayList.add(this);
            return arrayList;
        }
        Iterator<T> it = getChild().iterator();
        while (it.hasNext()) {
            arrayList.addAll(((Graph) it.next()).findSelectGraph());
        }
        return arrayList;
    }

    public final List<Graph> getChild() {
        return this.mChildGraph;
    }

    public final Matrix getChildExtendMatrix() {
        return this.mChildExtendMatrix;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final IControl getControl() {
        return this.control;
    }

    @Override // com.zykj.sketch.core.listener.IGraph
    public String getGraphName() {
        return this.name;
    }

    public final Graph getMFatherGraph() {
        return this.mFatherGraph;
    }

    public final RectF getMOutRect() {
        return this.mOutRect;
    }

    public final Paint getMPaint() {
        return this.mPaint;
    }

    public final Matrix getMatrix() {
        return this.mMatrix;
    }

    public final String getName() {
        return this.name;
    }

    public final RectF getOutRect() {
        return new RectF(this.mOutRect);
    }

    public final boolean getShowDelete() {
        return this.showDelete;
    }

    public GraphSnapshot.GraphData.Builder getSnapshotBuild() {
        GraphSnapshot.GraphData.Builder builder = GraphSnapshot.GraphData.newBuilder();
        builder.setGraphType(graphType());
        Iterator<T> it = getChild().iterator();
        while (it.hasNext()) {
            builder.addChildGraph(((Graph) it.next()).getSnapshot());
        }
        float[] fArr = new float[9];
        getMatrix().getValues(fArr);
        for (int i10 = 0; i10 < 9; i10++) {
            builder.addMatrix(fArr[i10]);
        }
        getChildExtendMatrix().getValues(fArr);
        for (int i11 = 0; i11 < 9; i11++) {
            builder.addChildExtendMatrix(fArr[i11]);
        }
        builder.setWidth(this.mPaint.getStrokeWidth());
        builder.setColor(this.mPaint.getColor());
        builder.setIsSelect(this.isSelect);
        builder.setShowDelete(this.showDelete);
        builder.setName(this.name);
        builder.setOutRect(GraphSnapshot.RectF.newBuilder().setLeft(this.mOutRect.left).setTop(this.mOutRect.top).setRight(this.mOutRect.right).setBottom(this.mOutRect.bottom).build());
        AbstractC9133u.m16132f(builder, "builder");
        return builder;
    }

    public final boolean hasChild() {
        return !this.mChildGraph.isEmpty();
    }

    public final boolean isClickDelete(float f10, float f11) {
        PointF pointF;
        if (!this.isSelect || (pointF = this.deletePoint) == null) {
            return false;
        }
        PointF pointFMapPoint = GraphExtKt.mapPoint(this.control.getCameraMatrix(), new PointF(f10, f11));
        float f12 = pointF.x;
        float f13 = pointF.y;
        PointF pointF2 = cornerSize;
        return new RectF(f12, f13, pointF2.x + f12, pointF2.y + f13).contains(pointFMapPoint.x, pointFMapPoint.y);
    }

    @Override // com.zykj.sketch.core.listener.IGraph
    public boolean isComplete() {
        return this.complete;
    }

    @Override // com.zykj.sketch.core.listener.IGraph
    public boolean isInRect(float f10, float f11, float f12) {
        if (this.mOutRect.isEmpty()) {
            onMeasure();
        }
        PointF pointFMapPoint = GraphExtKt.mapPoint(this, f10, f11, GraphExtKt.getWP2FPMatrix(this));
        PointF pointFMapPoint2 = GraphExtKt.mapPoint(GraphExtKt.getWP2LPMatrix(this), new PointF(0.0f, f12));
        PointF pointFMapPoint3 = GraphExtKt.mapPoint(GraphExtKt.getWP2LPMatrix(this), new PointF(0.0f, 0.0f));
        float fLineSpace = ExtensionsKt.lineSpace(pointFMapPoint2.x, pointFMapPoint2.y, pointFMapPoint3.x, pointFMapPoint3.y);
        PointF pointFMapPoint4 = GraphExtKt.mapPoint(this, pointFMapPoint, GraphExtKt.inverts(getMatrix()));
        RectF rectF = this.mOutRect;
        return new RectF(rectF.left - fLineSpace, rectF.top - fLineSpace, rectF.right + fLineSpace, rectF.bottom + fLineSpace).contains(pointFMapPoint4.x, pointFMapPoint4.y);
    }

    public final boolean isSelect() {
        return this.isSelect;
    }

    public void onDestroy() {
        Iterator<T> it = this.mChildGraph.iterator();
        while (it.hasNext()) {
            ((Graph) it.next()).onDestroy();
        }
        this.mChildGraph.clear();
        this.showDelete = false;
    }

    @Override // com.zykj.sketch.core.listener.IDraw
    public void onDraw(Canvas canvas) {
        AbstractC9133u.m16133g(canvas, "canvas");
        if (this.mOutRect.isEmpty()) {
            onMeasure();
        }
        render(canvas);
        for (Graph graph : this.mChildGraph) {
            canvas.save();
            graph.onDraw(canvas);
            canvas.restore();
        }
        if (this.isSelect) {
            canvas.save();
            drawBorder(canvas);
            canvas.restore();
        }
        if (!this.showDelete) {
            this.deletePoint = null;
            return;
        }
        canvas.save();
        showDelete(canvas);
        canvas.restore();
    }

    @Override // com.zykj.sketch.core.listener.IDraw
    public void onDrawComplete(Canvas canvas, InterfaceC10570l conditionVoid) {
        AbstractC9133u.m16133g(canvas, "canvas");
        AbstractC9133u.m16133g(conditionVoid, "conditionVoid");
        if (this.mOutRect.isEmpty()) {
            onMeasure();
        }
        if (this.complete && ((Boolean) conditionVoid.invoke(this)).booleanValue()) {
            render(canvas);
        }
        for (Graph graph : this.mChildGraph) {
            canvas.save();
            graph.onDrawComplete(canvas, conditionVoid);
            canvas.restore();
        }
    }

    @Override // com.zykj.sketch.core.listener.IGraph
    public void removeGraph(String className) {
        AbstractC9133u.m16133g(className, "className");
        String str = this.name;
        if (!AbstractC9133u.m16128b(str, str)) {
            Iterator<T> it = this.mChildGraph.iterator();
            while (it.hasNext()) {
                ((Graph) it.next()).removeGraph(className);
            }
        } else {
            Graph graph = this.mFatherGraph;
            if (graph != null) {
                graph.removeGraph(this);
            }
        }
    }

    public void render(Canvas canvas) {
        AbstractC9133u.m16133g(canvas, "canvas");
    }

    public final void setChildExtendMatrix(PointF point) {
        AbstractC9133u.m16133g(point, "point");
        this.mChildExtendMatrix.postTranslate(point.x, point.y);
    }

    public final void setComplete(boolean z10) {
        this.complete = z10;
    }

    public final void setDeleteBitmap(Bitmap bitmap) {
        AbstractC9133u.m16133g(bitmap, "bitmap");
        PointF pointF = cornerSize;
        this.deleteBitmap = Bitmap.createScaledBitmap(bitmap, (int) pointF.x, (int) pointF.y, true);
    }

    public final void setMFatherGraph(Graph graph) {
        this.mFatherGraph = graph;
    }

    public final void setMOutRect(RectF rectF) {
        AbstractC9133u.m16133g(rectF, "<set-?>");
        this.mOutRect = rectF;
    }

    public final void setMatrix(Matrix matrix) {
        AbstractC9133u.m16133g(matrix, "matrix");
        this.mMatrix.set(matrix);
    }

    public final void setName(String str) {
        AbstractC9133u.m16133g(str, "<set-?>");
        this.name = str;
    }

    public final void setOutRect(RectF rectF) {
        AbstractC9133u.m16133g(rectF, "rectF");
        this.mOutRect.set(rectF);
    }

    public final void setSelect(boolean z10) {
        this.isSelect = z10;
    }

    public final void setShowDelete(boolean z10) {
        this.showDelete = z10;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.name + ' ' + this.mOutRect);
        Iterator<T> it = getChild().iterator();
        while (it.hasNext()) {
            stringBuffer.append("child= " + ((Graph) it.next()));
        }
        String string = stringBuffer.toString();
        AbstractC9133u.m16132f(string, "buffer.toString()");
        return string;
    }

    public final void setChildExtendMatrix(Matrix matrix) {
        AbstractC9133u.m16133g(matrix, "matrix");
        this.mChildExtendMatrix.set(matrix);
    }

    public void removeGraph(Graph graph) {
        AbstractC9133u.m16133g(graph, "graph");
        this.mChildGraph.remove(graph);
        graph.mFatherGraph = null;
        graph.onDestroy();
    }
}
