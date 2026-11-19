package com.zykj.sketch.core.graph;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Log;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.internal.view.SupportMenu;
import androidx.exifinterface.media.ExifInterface;
import com.zykj.sketch.GraphSnapshot;
import com.zykj.sketch.core.listener.IControl;
import com.zykj.sketch.core.listener.IDraw;
import com.zykj.sketch.core.listener.IGraph;
import com.zykj.sketch.extensions.ExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u0000 d2\u00020\u00012\u00020\u0002:\u0001dB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u0000H\u0016J\u0006\u00106\u001a\u000204J\u000e\u00107\u001a\u0002082\u0006\u00109\u001a\u00020+J\u0006\u0010:\u001a\u000204J\u0010\u0010;\u001a\u0002042\u0006\u0010<\u001a\u00020=H\u0002J(\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00000?2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020A2\b\b\u0002\u0010C\u001a\u00020AH\u0016J\u0012\u0010D\u001a\u0004\u0018\u00010\u00002\u0006\u0010*\u001a\u00020+H\u0016J&\u0010E\u001a\b\u0012\u0004\u0012\u0002HF0?\"\b\b\u0000\u0010F*\u00020\u00002\f\u00109\u001a\b\u0012\u0004\u0012\u0002HF0GH\u0016J\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00000?J\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00000?J\u0006\u0010J\u001a\u00020\u0017J\b\u0010K\u001a\u00020+H\u0016J\u0006\u0010L\u001a\u00020\u0017J\u0006\u0010M\u001a\u00020\"J\b\u0010N\u001a\u00020OH\u0016J\u0006\u0010P\u001a\u00020\u0007J\u0016\u0010Q\u001a\u00020\u00072\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020AJ\b\u0010R\u001a\u00020\u0007H\u0016J \u0010S\u001a\u00020\u00072\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020AH\u0016J\b\u0010T\u001a\u000204H\u0016J\u0010\u0010U\u001a\u0002042\u0006\u0010<\u001a\u00020=H\u0016J$\u0010V\u001a\u0002042\u0006\u0010<\u001a\u00020=2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070XH\u0016J\u0010\u0010Y\u001a\u0002042\u0006\u00105\u001a\u00020\u0000H\u0016J\u0010\u0010Y\u001a\u0002042\u0006\u00109\u001a\u00020+H\u0016J\u0010\u0010Z\u001a\u0002042\u0006\u0010<\u001a\u00020=H\u0016J\u000e\u0010[\u001a\u0002042\u0006\u0010\\\u001a\u00020\u0017J\u000e\u0010[\u001a\u0002042\u0006\u0010]\u001a\u00020\u0011J\u000e\u0010^\u001a\u0002042\u0006\u0010_\u001a\u00020\u000fJ\u000e\u0010`\u001a\u0002042\u0006\u0010\\\u001a\u00020\u0017J\u000e\u0010a\u001a\u0002042\u0006\u0010b\u001a\u00020\"J\u0010\u00100\u001a\u0002042\u0006\u0010<\u001a\u00020=H\u0002J\b\u0010c\u001a\u00020+H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u000bR\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00000\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u00020\"X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00100\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\t\"\u0004\b2\u0010\u000b¨\u0006e"}, m13558d2 = {"Lcom/zykj/sketch/core/graph/Graph;", "Lcom/zykj/sketch/core/listener/IGraph;", "Lcom/zykj/sketch/core/listener/IDraw;", "control", "Lcom/zykj/sketch/core/listener/IControl;", "(Lcom/zykj/sketch/core/listener/IControl;)V", "complete", "", "getComplete", "()Z", "setComplete", "(Z)V", "getControl", "()Lcom/zykj/sketch/core/listener/IControl;", "deleteBitmap", "Landroid/graphics/Bitmap;", "deletePoint", "Landroid/graphics/PointF;", "isSelect", "setSelect", "mBorderPaint", "Landroid/graphics/Paint;", "mChildExtendMatrix", "Landroid/graphics/Matrix;", "mChildGraph", "Ljava/util/concurrent/CopyOnWriteArrayList;", "mDeletePaint", "mFatherGraph", "getMFatherGraph", "()Lcom/zykj/sketch/core/graph/Graph;", "setMFatherGraph", "(Lcom/zykj/sketch/core/graph/Graph;)V", "mMatrix", "mOutRect", "Landroid/graphics/RectF;", "getMOutRect", "()Landroid/graphics/RectF;", "setMOutRect", "(Landroid/graphics/RectF;)V", "mPaint", "getMPaint", "()Landroid/graphics/Paint;", HintConstants.AUTOFILL_HINT_NAME, "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "showDelete", "getShowDelete", "setShowDelete", "addGraph", "", "graph", "cancelSelected", "childTypeNumber", "", "className", "clear", "drawBorder", "canvas", "Landroid/graphics/Canvas;", "findGraph", "", "x", "", "y", TypedValues.CycleType.S_WAVE_OFFSET, "findGraphByName", "findGraphByType", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "findSelectGraph", "getChild", "getChildExtendMatrix", "getGraphName", "getMatrix", "getOutRect", "getSnapshotBuild", "Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;", "hasChild", "isClickDelete", "isComplete", "isInRect", "onDestroy", "onDraw", "onDrawComplete", "conditionVoid", "Lkotlin/Function1;", "removeGraph", "render", "setChildExtendMatrix", "matrix", "point", "setDeleteBitmap", "bitmap", "setMatrix", "setOutRect", "rectF", "toString", "Companion", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes5.dex */
public abstract class Graph implements IGraph, IDraw {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
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

    @Metadata(m13557d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13558d2 = {"Lcom/zykj/sketch/core/graph/Graph$Companion;", "", "()V", "cornerSize", "Landroid/graphics/PointF;", "getCornerSize", "()Landroid/graphics/PointF;", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PointF getCornerSize() {
            return Graph.cornerSize;
        }

        private Companion() {
        }
    }

    public Graph(IControl control) {
        Intrinsics.checkNotNullParameter(control, "control");
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
                Unit unit = Unit.INSTANCE;
            } catch (Throwable unused) {
                Log.e("graph", "deleteBitmap被回收");
            }
        }
    }

    public void addGraph(Graph graph) {
        Intrinsics.checkNotNullParameter(graph, "graph");
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
        Intrinsics.checkNotNullParameter(className, "className");
        boolean zAreEqual = Intrinsics.areEqual(className, getClass().getName());
        Iterator<T> it = this.mChildGraph.iterator();
        int iChildTypeNumber = zAreEqual;
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

    public List<Graph> findGraph(float x9, float y9, float offset) {
        ArrayList arrayList = new ArrayList();
        int size = this.mChildGraph.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            }
            arrayList.addAll(this.mChildGraph.get(size).findGraph(x9, y9, offset));
        }
        if (isInRect(x9, y9, offset)) {
            arrayList.add(this);
        }
        return arrayList;
    }

    @Override // com.zykj.sketch.core.listener.IGraph
    public Graph findGraphByName(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (Intrinsics.areEqual(this.name, name)) {
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
        Intrinsics.checkNotNullParameter(className, "className");
        ArrayList arrayList = new ArrayList();
        if (Intrinsics.areEqual(getClass(), className)) {
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of com.zykj.sketch.core.graph.Graph.findGraphByType");
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

    /* renamed from: getChildExtendMatrix, reason: from getter */
    public final Matrix getMChildExtendMatrix() {
        return this.mChildExtendMatrix;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final IControl getControl() {
        return this.control;
    }

    @Override // com.zykj.sketch.core.listener.IGraph
    /* renamed from: getGraphName, reason: from getter */
    public String getName() {
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

    /* renamed from: getMatrix, reason: from getter */
    public final Matrix getMMatrix() {
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
        getMMatrix().getValues(fArr);
        for (int i10 = 0; i10 < 9; i10++) {
            builder.addMatrix(fArr[i10]);
        }
        getMChildExtendMatrix().getValues(fArr);
        for (int i11 = 0; i11 < 9; i11++) {
            builder.addChildExtendMatrix(fArr[i11]);
        }
        builder.setWidth(this.mPaint.getStrokeWidth());
        builder.setColor(this.mPaint.getColor());
        builder.setIsSelect(this.isSelect);
        builder.setShowDelete(this.showDelete);
        builder.setName(this.name);
        builder.setOutRect(GraphSnapshot.RectF.newBuilder().setLeft(this.mOutRect.left).setTop(this.mOutRect.top).setRight(this.mOutRect.right).setBottom(this.mOutRect.bottom).build());
        Intrinsics.checkNotNullExpressionValue(builder, "builder");
        return builder;
    }

    public final boolean hasChild() {
        return !this.mChildGraph.isEmpty();
    }

    public final boolean isClickDelete(float x9, float y9) {
        PointF pointF;
        if (!this.isSelect || (pointF = this.deletePoint) == null) {
            return false;
        }
        PointF pointFMapPoint = GraphExtKt.mapPoint(this.control.getCameraMatrix(), new PointF(x9, y9));
        float f10 = pointF.x;
        float f11 = pointF.y;
        PointF pointF2 = cornerSize;
        return new RectF(f10, f11, pointF2.x + f10, pointF2.y + f11).contains(pointFMapPoint.x, pointFMapPoint.y);
    }

    @Override // com.zykj.sketch.core.listener.IGraph
    public boolean isComplete() {
        return this.complete;
    }

    @Override // com.zykj.sketch.core.listener.IGraph
    public boolean isInRect(float x9, float y9, float offset) {
        if (this.mOutRect.isEmpty()) {
            onMeasure();
        }
        PointF pointFMapPoint = GraphExtKt.mapPoint(this, x9, y9, GraphExtKt.getWP2FPMatrix(this));
        PointF pointFMapPoint2 = GraphExtKt.mapPoint(GraphExtKt.getWP2LPMatrix(this), new PointF(0.0f, offset));
        PointF pointFMapPoint3 = GraphExtKt.mapPoint(GraphExtKt.getWP2LPMatrix(this), new PointF(0.0f, 0.0f));
        float fLineSpace = ExtensionsKt.lineSpace(pointFMapPoint2.x, pointFMapPoint2.y, pointFMapPoint3.x, pointFMapPoint3.y);
        PointF pointFMapPoint4 = GraphExtKt.mapPoint(this, pointFMapPoint, GraphExtKt.inverts(getMMatrix()));
        RectF rectF = this.mOutRect;
        return new RectF(rectF.left - fLineSpace, rectF.top - fLineSpace, rectF.right + fLineSpace, rectF.bottom + fLineSpace).contains(pointFMapPoint4.x, pointFMapPoint4.y);
    }

    /* renamed from: isSelect, reason: from getter */
    public final boolean getIsSelect() {
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
        Intrinsics.checkNotNullParameter(canvas, "canvas");
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
    public void onDrawComplete(Canvas canvas, Function1<? super Graph, Boolean> conditionVoid) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(conditionVoid, "conditionVoid");
        if (this.mOutRect.isEmpty()) {
            onMeasure();
        }
        if (this.complete && conditionVoid.invoke(this).booleanValue()) {
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
        Intrinsics.checkNotNullParameter(className, "className");
        String str = this.name;
        if (!Intrinsics.areEqual(str, str)) {
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
        Intrinsics.checkNotNullParameter(canvas, "canvas");
    }

    public final void setChildExtendMatrix(PointF point) {
        Intrinsics.checkNotNullParameter(point, "point");
        this.mChildExtendMatrix.postTranslate(point.x, point.y);
    }

    public final void setComplete(boolean z9) {
        this.complete = z9;
    }

    public final void setDeleteBitmap(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        PointF pointF = cornerSize;
        this.deleteBitmap = Bitmap.createScaledBitmap(bitmap, (int) pointF.x, (int) pointF.y, true);
    }

    public final void setMFatherGraph(Graph graph) {
        this.mFatherGraph = graph;
    }

    public final void setMOutRect(RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<set-?>");
        this.mOutRect = rectF;
    }

    public final void setMatrix(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.mMatrix.set(matrix);
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setOutRect(RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "rectF");
        this.mOutRect.set(rectF);
    }

    public final void setSelect(boolean z9) {
        this.isSelect = z9;
    }

    public final void setShowDelete(boolean z9) {
        this.showDelete = z9;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.name + ' ' + this.mOutRect);
        Iterator<T> it = getChild().iterator();
        while (it.hasNext()) {
            stringBuffer.append("child= " + ((Graph) it.next()));
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "buffer.toString()");
        return string;
    }

    public final void setChildExtendMatrix(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.mChildExtendMatrix.set(matrix);
    }

    public void removeGraph(Graph graph) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        this.mChildGraph.remove(graph);
        graph.mFatherGraph = null;
        graph.onDestroy();
    }
}
