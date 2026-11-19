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
import androidx.constraintlayout.widget.ConstraintLayout;
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
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0015\b&\u0018\u0000 ~2\u00020\u00012\u00020\u0002:\u0001~B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u000eJ\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b\"\b\b\u0000\u0010\u0018*\u00020\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010%J\u0013\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b¢\u0006\u0004\b&\u0010'J\u001d\u0010(\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 ¢\u0006\u0004\b(\u0010)J'\u0010*\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020 H\u0016¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020\f2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u0010¢\u0006\u0004\b0\u00101J\r\u00103\u001a\u000202¢\u0006\u0004\b3\u00104J\u0015\u0010.\u001a\u00020\f2\u0006\u00105\u001a\u000202¢\u0006\u0004\b.\u00106J\r\u00107\u001a\u000202¢\u0006\u0004\b7\u00104J\u0015\u00108\u001a\u00020\f2\u0006\u00105\u001a\u000202¢\u0006\u0004\b8\u00106J\r\u0010:\u001a\u000209¢\u0006\u0004\b:\u0010;J\u0015\u0010=\u001a\u00020\f2\u0006\u0010<\u001a\u000209¢\u0006\u0004\b=\u0010>J\u0013\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b¢\u0006\u0004\b?\u0010'J\u000f\u0010@\u001a\u00020\u0010H\u0016¢\u0006\u0004\b@\u00101J\u0017\u0010B\u001a\u00020\f2\u0006\u0010A\u001a\u00020\u0000H\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010A\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001e\u0010CJ\r\u0010D\u001a\u00020\f¢\u0006\u0004\bD\u0010EJ\u0015\u0010G\u001a\u00020F2\u0006\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\bG\u0010HJ\u0015\u0010K\u001a\u00020\f2\u0006\u0010J\u001a\u00020I¢\u0006\u0004\bK\u0010LJ\r\u0010M\u001a\u00020\f¢\u0006\u0004\bM\u0010EJ\u000f\u0010N\u001a\u00020\fH\u0016¢\u0006\u0004\bN\u0010EJ\u000f\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\u0007H\u0016¢\u0006\u0004\bR\u0010\tJ\u0017\u0010S\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\bS\u0010\u000eJ\u0017\u0010T\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\bT\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010U\u001a\u0004\bV\u0010WR\"\u0010\u0015\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010X\u001a\u0004\bY\u0010\t\"\u0004\bZ\u0010\u001fR$\u0010[\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010CR\u001c\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00000`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010c\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010e\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010dR\"\u0010f\u001a\u0002098\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010;\"\u0004\bi\u0010>R\u0017\u0010k\u001a\u00020j8\u0006¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u0014\u0010o\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010lR\u0014\u0010p\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010lR\"\u0010q\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bq\u00101\"\u0004\bs\u0010tR\"\u0010T\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010r\u001a\u0004\bu\u00101\"\u0004\bv\u0010tR\u0018\u0010w\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0018\u0010y\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\"\u0010{\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b{\u0010r\u001a\u0004\b|\u00101\"\u0004\b}\u0010t¨\u0006\u007f"}, m5110d2 = {"Lcom/zykj/sketch/core/graph/Graph;", "Lcom/zykj/sketch/core/listener/IGraph;", "Lcom/zykj/sketch/core/listener/IDraw;", "Lcom/zykj/sketch/core/listener/IControl;", "control", "<init>", "(Lcom/zykj/sketch/core/listener/IControl;)V", "", "getGraphName", "()Ljava/lang/String;", "Landroid/graphics/Canvas;", "canvas", "Ld6/s;", "onDraw", "(Landroid/graphics/Canvas;)V", "Lkotlin/Function1;", "", "conditionVoid", "onDrawComplete", "(Landroid/graphics/Canvas;Lr6/c;)V", "render", HintConstants.AUTOFILL_HINT_NAME, "findGraphByName", "(Ljava/lang/String;)Lcom/zykj/sketch/core/graph/Graph;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "className", "", "findGraphByType", "(Ljava/lang/Class;)Ljava/util/List;", "removeGraph", "(Ljava/lang/String;)V", "", "x", "y", TypedValues.CycleType.S_WAVE_OFFSET, "findGraph", "(FFF)Ljava/util/List;", "findSelectGraph", "()Ljava/util/List;", "isClickDelete", "(FF)Z", "isInRect", "(FFF)Z", "Landroid/graphics/PointF;", "point", "setChildExtendMatrix", "(Landroid/graphics/PointF;)V", "hasChild", "()Z", "Landroid/graphics/Matrix;", "getChildExtendMatrix", "()Landroid/graphics/Matrix;", "matrix", "(Landroid/graphics/Matrix;)V", "getMatrix", "setMatrix", "Landroid/graphics/RectF;", "getOutRect", "()Landroid/graphics/RectF;", "rectF", "setOutRect", "(Landroid/graphics/RectF;)V", "getChild", "isComplete", "graph", "addGraph", "(Lcom/zykj/sketch/core/graph/Graph;)V", "cancelSelected", "()V", "", "childTypeNumber", "(Ljava/lang/String;)I", "Landroid/graphics/Bitmap;", "bitmap", "setDeleteBitmap", "(Landroid/graphics/Bitmap;)V", "clear", "onDestroy", "Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;", "getSnapshotBuild", "()Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;", "toString", "drawBorder", "showDelete", "Lcom/zykj/sketch/core/listener/IControl;", "getControl", "()Lcom/zykj/sketch/core/listener/IControl;", "Ljava/lang/String;", "getName", "setName", "mFatherGraph", "Lcom/zykj/sketch/core/graph/Graph;", "getMFatherGraph", "()Lcom/zykj/sketch/core/graph/Graph;", "setMFatherGraph", "Ljava/util/concurrent/CopyOnWriteArrayList;", "mChildGraph", "Ljava/util/concurrent/CopyOnWriteArrayList;", "mMatrix", "Landroid/graphics/Matrix;", "mChildExtendMatrix", "mOutRect", "Landroid/graphics/RectF;", "getMOutRect", "setMOutRect", "Landroid/graphics/Paint;", "mPaint", "Landroid/graphics/Paint;", "getMPaint", "()Landroid/graphics/Paint;", "mDeletePaint", "mBorderPaint", "isSelect", "Z", "setSelect", "(Z)V", "getShowDelete", "setShowDelete", "deleteBitmap", "Landroid/graphics/Bitmap;", "deletePoint", "Landroid/graphics/PointF;", "complete", "getComplete", "setComplete", "Companion", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public abstract class Graph implements IGraph, IDraw {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final PointF cornerSize = new PointF(60.0f, 60.0f);
    private boolean complete;

    @NotNull
    private final IControl control;

    @Nullable
    private Bitmap deleteBitmap;

    @Nullable
    private PointF deletePoint;
    private boolean isSelect;

    @NotNull
    private final Paint mBorderPaint;

    @NotNull
    private final Matrix mChildExtendMatrix;

    @NotNull
    private CopyOnWriteArrayList<Graph> mChildGraph;

    @NotNull
    private final Paint mDeletePaint;

    @Nullable
    private Graph mFatherGraph;

    @NotNull
    private final Matrix mMatrix;

    @NotNull
    private RectF mOutRect;

    @NotNull
    private final Paint mPaint;

    @NotNull
    private String name;
    private boolean showDelete;

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m5110d2 = {"Lcom/zykj/sketch/core/graph/Graph$Companion;", "", "()V", "cornerSize", "Landroid/graphics/PointF;", "getCornerSize", "()Landroid/graphics/PointF;", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        @NotNull
        public final PointF getCornerSize() {
            return Graph.cornerSize;
        }

        private Companion() {
        }
    }

    public Graph(@NotNull IControl control) {
        AbstractC5830k.m5330g(control, "control");
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

    public static /* synthetic */ List findGraph$default(Graph graph, float f, float f7, float f8, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findGraph");
        }
        if ((i & 4) != 0) {
            f8 = 0.0f;
        }
        return graph.findGraph(f, f7, f8);
    }

    private final void showDelete(Canvas canvas) {
        canvas.drawPath(GraphExtKt.rectConvertPath(this, this.mOutRect, GraphExtKt.getFP2WPRendMatrix(this)), this.mDeletePaint);
        RectF rectF = this.mOutRect;
        PointF pointFMapPoint = GraphExtKt.mapPoint(this, rectF.right, rectF.top, GraphExtKt.getFP2WPRendMatrix(this));
        float f = pointFMapPoint.x;
        PointF pointF = cornerSize;
        float f7 = pointF.x;
        float f8 = 2;
        if (f < f7 / f8) {
            pointFMapPoint.x = f7 / f8;
        }
        if (pointFMapPoint.x > canvas.getWidth() - (pointF.x / f8)) {
            pointFMapPoint.x = canvas.getWidth() - (pointF.x / f8);
        }
        float f9 = pointFMapPoint.y;
        float f10 = pointF.y;
        if (f9 < f10 / f8) {
            pointFMapPoint.y = f10 / f8;
        }
        if (pointFMapPoint.y > canvas.getHeight() - (pointF.y / f8)) {
            pointFMapPoint.y = canvas.getHeight() - (pointF.y / f8);
        }
        float f11 = pointFMapPoint.x;
        float f12 = pointF.x;
        PointF pointF2 = new PointF(f11 - (f12 / f8), pointFMapPoint.y - (f12 / f8));
        this.deletePoint = pointF2;
        Bitmap bitmap = this.deleteBitmap;
        if (bitmap != null) {
            try {
                canvas.drawBitmap(bitmap, pointF2.x, pointF2.y, this.mDeletePaint);
            } catch (Throwable unused) {
                Log.e("graph", "deleteBitmap被回收");
            }
        }
    }

    public void addGraph(@NotNull Graph graph) {
        AbstractC5830k.m5330g(graph, "graph");
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
    public final int childTypeNumber(@NotNull String className) {
        AbstractC5830k.m5330g(className, "className");
        boolean zEquals = className.equals(getClass().getName());
        Iterator<T> it = this.mChildGraph.iterator();
        int iChildTypeNumber = zEquals;
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

    @NotNull
    public List<Graph> findGraph(float x3, float y2, float offset) {
        ArrayList arrayList = new ArrayList();
        int size = this.mChildGraph.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            }
            arrayList.addAll(this.mChildGraph.get(size).findGraph(x3, y2, offset));
        }
        if (isInRect(x3, y2, offset)) {
            arrayList.add(this);
        }
        return arrayList;
    }

    @Override // com.zykj.sketch.core.listener.IGraph
    @Nullable
    public Graph findGraphByName(@NotNull String name) {
        AbstractC5830k.m5330g(name, "name");
        if (AbstractC5830k.m5325b(this.name, name)) {
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
    @NotNull
    public <T extends Graph> List<T> findGraphByType(@NotNull Class<T> className) {
        AbstractC5830k.m5330g(className, "className");
        ArrayList arrayList = new ArrayList();
        if (getClass().equals(className)) {
            arrayList.add(this);
            return arrayList;
        }
        Iterator<T> it = this.mChildGraph.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((Graph) it.next()).findGraphByType(className));
        }
        return arrayList;
    }

    @NotNull
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

    @NotNull
    public final List<Graph> getChild() {
        return this.mChildGraph;
    }

    @NotNull
    /* renamed from: getChildExtendMatrix, reason: from getter */
    public final Matrix getMChildExtendMatrix() {
        return this.mChildExtendMatrix;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    @NotNull
    public final IControl getControl() {
        return this.control;
    }

    @Override // com.zykj.sketch.core.listener.IGraph
    @NotNull
    /* renamed from: getGraphName, reason: from getter */
    public String getName() {
        return this.name;
    }

    @Nullable
    public final Graph getMFatherGraph() {
        return this.mFatherGraph;
    }

    @NotNull
    public final RectF getMOutRect() {
        return this.mOutRect;
    }

    @NotNull
    public final Paint getMPaint() {
        return this.mPaint;
    }

    @NotNull
    /* renamed from: getMatrix, reason: from getter */
    public final Matrix getMMatrix() {
        return this.mMatrix;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final RectF getOutRect() {
        return new RectF(this.mOutRect);
    }

    public final boolean getShowDelete() {
        return this.showDelete;
    }

    @NotNull
    public GraphSnapshot.GraphData.Builder getSnapshotBuild() {
        GraphSnapshot.GraphData.Builder builderNewBuilder = GraphSnapshot.GraphData.newBuilder();
        builderNewBuilder.setGraphType(graphType());
        Iterator<T> it = getChild().iterator();
        while (it.hasNext()) {
            builderNewBuilder.addChildGraph(((Graph) it.next()).getSnapshot());
        }
        float[] fArr = new float[9];
        getMMatrix().getValues(fArr);
        for (int i = 0; i < 9; i++) {
            builderNewBuilder.addMatrix(fArr[i]);
        }
        getMChildExtendMatrix().getValues(fArr);
        for (int i8 = 0; i8 < 9; i8++) {
            builderNewBuilder.addChildExtendMatrix(fArr[i8]);
        }
        builderNewBuilder.setWidth(this.mPaint.getStrokeWidth());
        builderNewBuilder.setColor(this.mPaint.getColor());
        builderNewBuilder.setIsSelect(this.isSelect);
        builderNewBuilder.setShowDelete(this.showDelete);
        builderNewBuilder.setName(this.name);
        builderNewBuilder.setOutRect(GraphSnapshot.RectF.newBuilder().setLeft(this.mOutRect.left).setTop(this.mOutRect.top).setRight(this.mOutRect.right).setBottom(this.mOutRect.bottom).build());
        return builderNewBuilder;
    }

    public final boolean hasChild() {
        return !this.mChildGraph.isEmpty();
    }

    public final boolean isClickDelete(float x3, float y2) {
        PointF pointF;
        if (!this.isSelect || (pointF = this.deletePoint) == null) {
            return false;
        }
        PointF pointFMapPoint = GraphExtKt.mapPoint(this.control.getCameraMatrix(), new PointF(x3, y2));
        float f = pointF.x;
        float f7 = pointF.y;
        PointF pointF2 = cornerSize;
        return new RectF(f, f7, pointF2.x + f, pointF2.y + f7).contains(pointFMapPoint.x, pointFMapPoint.y);
    }

    @Override // com.zykj.sketch.core.listener.IGraph
    public boolean isComplete() {
        return this.complete;
    }

    @Override // com.zykj.sketch.core.listener.IGraph
    public boolean isInRect(float x3, float y2, float offset) {
        if (this.mOutRect.isEmpty()) {
            onMeasure();
        }
        PointF pointFMapPoint = GraphExtKt.mapPoint(this, x3, y2, GraphExtKt.getWP2FPMatrix(this));
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
    public void onDraw(@NotNull Canvas canvas) {
        AbstractC5830k.m5330g(canvas, "canvas");
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
    public void onDrawComplete(@NotNull Canvas canvas, @NotNull InterfaceC6471c conditionVoid) {
        AbstractC5830k.m5330g(canvas, "canvas");
        AbstractC5830k.m5330g(conditionVoid, "conditionVoid");
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
    public void removeGraph(@NotNull String className) {
        AbstractC5830k.m5330g(className, "className");
        String str = this.name;
        if (!AbstractC5830k.m5325b(str, str)) {
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

    public void render(@NotNull Canvas canvas) {
        AbstractC5830k.m5330g(canvas, "canvas");
    }

    public final void setChildExtendMatrix(@NotNull PointF point) {
        AbstractC5830k.m5330g(point, "point");
        this.mChildExtendMatrix.postTranslate(point.x, point.y);
    }

    public final void setComplete(boolean z8) {
        this.complete = z8;
    }

    public final void setDeleteBitmap(@NotNull Bitmap bitmap) {
        AbstractC5830k.m5330g(bitmap, "bitmap");
        PointF pointF = cornerSize;
        this.deleteBitmap = Bitmap.createScaledBitmap(bitmap, (int) pointF.x, (int) pointF.y, true);
    }

    public final void setMFatherGraph(@Nullable Graph graph) {
        this.mFatherGraph = graph;
    }

    public final void setMOutRect(@NotNull RectF rectF) {
        AbstractC5830k.m5330g(rectF, "<set-?>");
        this.mOutRect = rectF;
    }

    public final void setMatrix(@NotNull Matrix matrix) {
        AbstractC5830k.m5330g(matrix, "matrix");
        this.mMatrix.set(matrix);
    }

    public final void setName(@NotNull String str) {
        AbstractC5830k.m5330g(str, "<set-?>");
        this.name = str;
    }

    public final void setOutRect(@NotNull RectF rectF) {
        AbstractC5830k.m5330g(rectF, "rectF");
        this.mOutRect.set(rectF);
    }

    public final void setSelect(boolean z8) {
        this.isSelect = z8;
    }

    public final void setShowDelete(boolean z8) {
        this.showDelete = z8;
    }

    @NotNull
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.name + ' ' + this.mOutRect);
        Iterator<T> it = getChild().iterator();
        while (it.hasNext()) {
            stringBuffer.append("child= " + ((Graph) it.next()));
        }
        String string = stringBuffer.toString();
        AbstractC5830k.m5329f(string, "buffer.toString()");
        return string;
    }

    public final void setChildExtendMatrix(@NotNull Matrix matrix) {
        AbstractC5830k.m5330g(matrix, "matrix");
        this.mChildExtendMatrix.set(matrix);
    }

    public void removeGraph(@NotNull Graph graph) {
        AbstractC5830k.m5330g(graph, "graph");
        this.mChildGraph.remove(graph);
        graph.mFatherGraph = null;
        graph.onDestroy();
    }
}
