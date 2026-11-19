package com.zykj.blackboard.core.action;

import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.enums.TranslationType;
import com.zykj.blackboard.utils.EventBus;
import com.zykj.blackboard.utils.EventKey;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.blackboard.utils.PointUtils;
import com.zykj.board.EzyMatrix$Matrix;
import com.zykj.board.EzyTouchEvent$TouchEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b!\u0010 J\u001f\u0010\"\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\"\u0010 J\u001f\u0010#\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b#\u0010$JO\u0010-\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u0017H\u0002¢\u0006\u0004\b-\u0010.J\u001f\u0010/\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\fH\u0016¢\u0006\u0004\b1\u0010\u0003J\u0017\u00104\u001a\u00020\f2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\f2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b6\u00105J\u0017\u00107\u001a\u00020\f2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b7\u00105J\u0017\u00108\u001a\u00020\f2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b8\u00105J\u001b\u0010;\u001a\u00020\f2\f\u0010:\u001a\b\u0012\u0004\u0012\u0002090\t¢\u0006\u0004\b;\u0010\u000eR\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010A\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010\u001a\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010CR\u0014\u0010D\u001a\u00020\u00178\u0002X\u0082D¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010CR\u0016\u0010G\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010ER\u0016\u0010H\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010ER\u0016\u0010J\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010M\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010O\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010NR\u0014\u0010P\u001a\u00020\u00178\u0002X\u0082D¢\u0006\u0006\n\u0004\bP\u0010ER\u0016\u0010Q\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010T\u001a\u00020S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010V\u001a\u00020S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010UR(\u0010X\u001a\u0004\u0018\u00010\n2\b\u0010W\u001a\u0004\u0018\u00010\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[RD\u0010;\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\\j\b\u0012\u0004\u0012\u00020\u001c`]2\u0016\u0010W\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\\j\b\u0012\u0004\u0012\u00020\u001c`]8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b;\u0010^\u001a\u0004\b_\u0010`RD\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\n0\\j\b\u0012\u0004\u0012\u00020\n`]2\u0016\u0010W\u001a\u0012\u0012\u0004\u0012\u00020\n0\\j\b\u0012\u0004\u0012\u00020\n`]8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010^\u001a\u0004\ba\u0010`¨\u0006b"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/SelectAction;", "Lcom/zykj/blackboard/core/action/MoveAction;", "<init>", "()V", "", TypedValues.Custom.S_COLOR, "", "checkColorLight", "(I)Z", "", "Landroid/graphics/RectF;", "selectGraphMinOutRectFList", "Ld6/s;", "handleSelectedRectF", "(Ljava/util/List;)V", "srcRectF", "dstRectF", "countRectF", "(Landroid/graphics/RectF;Landroid/graphics/RectF;)V", "Landroid/graphics/PointF;", "pointF", "isClickInSelect", "(Landroid/graphics/PointF;)Z", "", "x", "y", "isMove", "(FF)Z", "Lcom/zykj/blackboard/core/graph/IGraph;", "getClickGraph", "(FF)Lcom/zykj/blackboard/core/graph/IGraph;", "handleRotate", "(FF)V", "handleScale", "handleTranslate", "getRenderPointF", "(FF)Landroid/graphics/PointF;", "x1", "y1", "x2", "y2", "x3", "y3", "x4", "y4", "calculateScaleOffset", "(FFFFFFFF)F", "calculateRadians", "(FF)F", "reset", "Lcom/zykj/board/EzyTouchEvent$TouchEvent;", NotificationCompat.CATEGORY_EVENT, "singleTouchDown", "(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V", "singleTouchMove", "singleTouchUp", "singleTouchCancel", "", "graphIdList", "selectGraphList", "", "Lcom/zykj/board/EzyMatrix$Matrix;", "matrixList", "Ljava/util/List;", "", "prevTime", "J", "Z", "minMoveDistance", "F", "isTransformationMode", "firstX", "firstY", "Landroid/graphics/Path;", "selectPath", "Landroid/graphics/Path;", "Landroid/graphics/Paint;", "selectPaint", "Landroid/graphics/Paint;", "selectedRectFPaint", "iconWidth", "currentTranslationType", "I", "Landroid/graphics/Matrix;", "tempMatrix", "Landroid/graphics/Matrix;", "selectedMatrix", "<set-?>", "selectRectF", "Landroid/graphics/RectF;", "getSelectRectF", "()Landroid/graphics/RectF;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "getSelectGraphList", "()Ljava/util/ArrayList;", "getSelectGraphMinOutRectFList", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class SelectAction extends MoveAction {
    private float firstX;
    private float firstY;
    private boolean isMove;

    @Nullable
    private RectF selectRectF;

    @NotNull
    private final List<EzyMatrix$Matrix> matrixList = new ArrayList();
    private long prevTime = System.currentTimeMillis();
    private final float minMoveDistance = 20.0f;
    private boolean isTransformationMode = true;

    @NotNull
    private Path selectPath = new Path();

    @NotNull
    private Paint selectPaint = new Paint();

    @NotNull
    private Paint selectedRectFPaint = new Paint();
    private final float iconWidth = 50.0f;
    private int currentTranslationType = -1;

    @NotNull
    private Matrix tempMatrix = new Matrix();

    @NotNull
    private Matrix selectedMatrix = new Matrix();

    @NotNull
    private ArrayList<IGraph> selectGraphList = new ArrayList<>();

    @NotNull
    private ArrayList<RectF> selectGraphMinOutRectFList = new ArrayList<>();

    public SelectAction() {
        this.selectPaint.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.selectPaint.setStrokeWidth(3.0f);
        Paint paint = this.selectPaint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.selectPaint.setPathEffect(new DashPathEffect(new float[]{30.0f, 15.0f}, 0.0f));
        this.selectPaint.setDither(true);
        this.selectPaint.setAntiAlias(true);
        this.selectedRectFPaint.setColor(-12085261);
        this.selectedRectFPaint.setStrokeWidth(3.0f);
        this.selectedRectFPaint.setStyle(style);
        this.selectedRectFPaint.setDither(true);
        this.selectedRectFPaint.setAntiAlias(true);
        EventBus.INSTANCE.register(EventKey.SELECT_ACTION_SELECTED_CANCEL, new InterfaceC6469a() { // from class: com.zykj.blackboard.core.action.SelectAction.1
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m13741invoke();
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m13741invoke() {
                SelectAction.this.selectRectF = null;
                SelectAction.this.getSelectGraphList().clear();
                SelectAction.this.getSelectGraphMinOutRectFList().clear();
                IGraphControl graphControl = SelectAction.this.getGraphControl();
                if (graphControl != null) {
                    graphControl.selectCancel();
                }
            }
        });
    }

    private final float calculateRadians(float x3, float y2) {
        return ((x3 > 0.0f ? 0.0f : (float) Math.toRadians(180.0d)) * (y2 > 0.0f ? -1 : 1)) + ((float) Math.atan(y2 / x3));
    }

    private final float calculateScaleOffset(float x12, float y12, float x22, float y2, float x3, float y3, float x42, float y42) {
        return ((float) Math.cos(calculateRadians(x22 - x12, y2 - y12) - calculateRadians(x42 - x3, y42 - y3))) * ((float) Math.sqrt((r8 * r8) + (r7 * r7)));
    }

    private final boolean checkColorLight(int color) {
        return (((double) (color & 255)) * 0.114d) + ((((double) ((color >> 8) & 255)) * 0.578d) + (((double) ((color >> 16) & 255)) * 0.299d)) >= 192.0d;
    }

    private final void countRectF(RectF srcRectF, RectF dstRectF) {
        if (dstRectF.isEmpty()) {
            dstRectF.set(srcRectF);
        } else {
            dstRectF.union(srcRectF);
        }
    }

    private final IGraph getClickGraph(float x3, float y2) {
        IGraph rootGraph;
        IGraphControl graphControl = getGraphControl();
        List<IGraph> childGraph = (graphControl == null || (rootGraph = graphControl.getRootGraph()) == null) ? null : rootGraph.getChildGraph();
        if (childGraph != null && !childGraph.isEmpty()) {
            int size = childGraph.size();
            do {
                size--;
                if (-1 < size) {
                }
            } while (!childGraph.get(size).isInRect(x3, y2, 0.0f));
            return childGraph.get(size);
        }
        return null;
    }

    private final PointF getRenderPointF(float x3, float y2) {
        PointUtils pointUtils = PointUtils.INSTANCE;
        MatrixAdapter matrixAdapter = getMatrixAdapter();
        AbstractC5830k.m5327d(matrixAdapter);
        return pointUtils.mapPoint(x3, y2, matrixAdapter.getAdapterMatrix());
    }

    private final void handleRotate(float x3, float y2) {
        PointF renderPointF = getRenderPointF(x3, y2);
        PointUtils pointUtils = PointUtils.INSTANCE;
        RectF rectF = this.selectRectF;
        AbstractC5830k.m5327d(rectF);
        float fCenterX = rectF.centerX();
        RectF rectF2 = this.selectRectF;
        AbstractC5830k.m5327d(rectF2);
        PointF pointFMapPoint = pointUtils.mapPoint(fCenterX, rectF2.centerY(), this.selectedMatrix);
        this.tempMatrix.setRotate((float) Math.toDegrees(calculateRadians(renderPointF.x - pointFMapPoint.x, renderPointF.y - pointFMapPoint.y) - calculateRadians(this.firstX - pointFMapPoint.x, this.firstY - pointFMapPoint.y)), pointFMapPoint.x, pointFMapPoint.y);
    }

    private final void handleScale(float x3, float y2) {
        PointF renderPointF = getRenderPointF(x3, y2);
        PointUtils pointUtils = PointUtils.INSTANCE;
        RectF rectF = this.selectRectF;
        AbstractC5830k.m5327d(rectF);
        float fCenterX = rectF.centerX();
        RectF rectF2 = this.selectRectF;
        AbstractC5830k.m5327d(rectF2);
        PointF pointFMapPoint = pointUtils.mapPoint(fCenterX, rectF2.centerY(), this.selectedMatrix);
        RectF rectF3 = this.selectRectF;
        AbstractC5830k.m5327d(rectF3);
        float f = rectF3.right;
        RectF rectF4 = this.selectRectF;
        AbstractC5830k.m5327d(rectF4);
        PointF pointFMapPoint2 = pointUtils.mapPoint(f, rectF4.bottom, this.selectedMatrix);
        float fCalculateScaleOffset = calculateScaleOffset(pointFMapPoint.x, pointFMapPoint.y, pointFMapPoint2.x, pointFMapPoint2.y, this.firstX, this.firstY, renderPointF.x, renderPointF.y);
        double d9 = 2;
        float fSqrt = (float) Math.sqrt(((float) Math.pow(pointFMapPoint.x - pointFMapPoint2.x, d9)) + ((float) Math.pow(pointFMapPoint.y - pointFMapPoint2.y, d9)));
        float f7 = fCalculateScaleOffset + fSqrt;
        if (f7 > ((float) Math.sqrt(((float) Math.pow(this.iconWidth + 10, d9)) * 2))) {
            float f8 = f7 / fSqrt;
            this.tempMatrix.setScale(f8, f8, pointFMapPoint.x, pointFMapPoint.y);
        }
    }

    private final void handleSelectedRectF(List<? extends RectF> selectGraphMinOutRectFList) {
        RectF rectF = new RectF();
        Iterator<T> it = selectGraphMinOutRectFList.iterator();
        while (it.hasNext()) {
            countRectF((RectF) it.next(), rectF);
        }
        if (rectF.isEmpty()) {
            this.selectRectF = null;
            IGraphControl graphControl = getGraphControl();
            if (graphControl != null) {
                graphControl.selectCancel();
                return;
            }
            return;
        }
        float f = 10;
        float fWidth = (this.iconWidth + f) - rectF.width();
        float fHeight = (this.iconWidth + f) - rectF.height();
        if (fWidth > 0.0f) {
            float f7 = fWidth / 2;
            rectF.left -= f7;
            rectF.right += f7;
        }
        if (fHeight > 0.0f) {
            float f8 = fHeight / 2;
            rectF.top -= f8;
            rectF.bottom += f8;
        }
        this.selectRectF = rectF;
        IGraphControl graphControl2 = getGraphControl();
        if (graphControl2 != null) {
            RectF rectF2 = this.selectRectF;
            AbstractC5830k.m5327d(rectF2);
            graphControl2.select(rectF2, this.tempMatrix, this.selectedRectFPaint, this.iconWidth, true);
        }
    }

    private final void handleTranslate(float x3, float y2) {
        PointF renderPointF = getRenderPointF(x3, y2);
        this.tempMatrix.setTranslate(renderPointF.x - this.firstX, renderPointF.y - this.firstY);
    }

    private final boolean isClickInSelect(PointF pointF) {
        if (this.selectRectF == null) {
            return false;
        }
        float fMapRadius = (this.iconWidth / 2) / this.selectedMatrix.mapRadius(1.0f);
        RectF rectF = this.selectRectF;
        AbstractC5830k.m5327d(rectF);
        float f = rectF.left - fMapRadius;
        RectF rectF2 = this.selectRectF;
        AbstractC5830k.m5327d(rectF2);
        float f7 = rectF2.top - fMapRadius;
        RectF rectF3 = this.selectRectF;
        AbstractC5830k.m5327d(rectF3);
        float f8 = rectF3.left + fMapRadius;
        RectF rectF4 = this.selectRectF;
        AbstractC5830k.m5327d(rectF4);
        RectF rectF5 = new RectF(f, f7, f8, rectF4.top + fMapRadius);
        RectF rectF6 = this.selectRectF;
        AbstractC5830k.m5327d(rectF6);
        float f9 = rectF6.right - fMapRadius;
        RectF rectF7 = this.selectRectF;
        AbstractC5830k.m5327d(rectF7);
        float f10 = rectF7.top - fMapRadius;
        RectF rectF8 = this.selectRectF;
        AbstractC5830k.m5327d(rectF8);
        float f11 = rectF8.right + fMapRadius;
        RectF rectF9 = this.selectRectF;
        AbstractC5830k.m5327d(rectF9);
        RectF rectF10 = new RectF(f9, f10, f11, rectF9.top + fMapRadius);
        RectF rectF11 = this.selectRectF;
        AbstractC5830k.m5327d(rectF11);
        float f12 = rectF11.right - fMapRadius;
        RectF rectF12 = this.selectRectF;
        AbstractC5830k.m5327d(rectF12);
        float f13 = rectF12.bottom - fMapRadius;
        RectF rectF13 = this.selectRectF;
        AbstractC5830k.m5327d(rectF13);
        float f14 = rectF13.right + fMapRadius;
        RectF rectF14 = this.selectRectF;
        AbstractC5830k.m5327d(rectF14);
        RectF rectF15 = new RectF(f12, f13, f14, rectF14.bottom + fMapRadius);
        PointUtils pointUtils = PointUtils.INSTANCE;
        if (pointUtils.isPointInRect(rectF5, this.selectedMatrix, pointF)) {
            this.currentTranslationType = TranslationType.ROTATE.getValue();
            return true;
        }
        if (pointUtils.isPointInRect(rectF10, this.selectedMatrix, pointF)) {
            this.currentTranslationType = TranslationType.DELETE.getValue();
            return true;
        }
        if (pointUtils.isPointInRect(rectF15, this.selectedMatrix, pointF)) {
            this.currentTranslationType = TranslationType.SCALE.getValue();
            return true;
        }
        RectF rectF16 = this.selectRectF;
        AbstractC5830k.m5327d(rectF16);
        if (!pointUtils.isPointInRect(rectF16, this.selectedMatrix, pointF)) {
            return false;
        }
        this.currentTranslationType = TranslationType.TRANSLATE.getValue();
        return true;
    }

    private final boolean isMove(float x3, float y2) {
        PointF renderPointF = getRenderPointF(x3, y2);
        double d9 = 2;
        return ((float) Math.sqrt((double) (((float) Math.pow((double) (renderPointF.x - this.firstX), d9)) + ((float) Math.pow((double) (renderPointF.y - this.firstY), d9))))) > this.minMoveDistance;
    }

    @NotNull
    public final ArrayList<IGraph> getSelectGraphList() {
        return this.selectGraphList;
    }

    @NotNull
    public final ArrayList<RectF> getSelectGraphMinOutRectFList() {
        return this.selectGraphMinOutRectFList;
    }

    @Nullable
    public final RectF getSelectRectF() {
        return this.selectRectF;
    }

    @Override // com.zykj.blackboard.core.action.MoveAction, com.zykj.blackboard.core.action.ITouchAction
    public void reset() {
        IGraphControl graphControl = getGraphControl();
        if (graphControl != null) {
            this.selectPaint.setColor(checkColorLight(graphControl.getBackgroundColor()) ? ViewCompat.MEASURED_STATE_MASK : -3355444);
            this.selectedRectFPaint.setColor(checkColorLight(graphControl.getBackgroundColor()) ? -12085261 : -3355444);
        }
        this.tempMatrix.reset();
        this.selectPath.reset();
        this.matrixList.clear();
        this.firstX = 0.0f;
        this.firstY = 0.0f;
    }

    public final void selectGraphList(@NotNull List<String> graphIdList) {
        Matrix matrix;
        IGraph rootGraph;
        AbstractC5830k.m5330g(graphIdList, "graphIdList");
        this.selectRectF = null;
        IGraphControl graphControl = getGraphControl();
        if (graphControl != null) {
            graphControl.selectCancel();
        }
        this.selectGraphList.clear();
        this.selectGraphMinOutRectFList.clear();
        this.selectedMatrix.reset();
        this.tempMatrix.reset();
        this.selectPath.reset();
        this.matrixList.clear();
        this.firstX = 0.0f;
        this.firstY = 0.0f;
        for (String str : graphIdList) {
            IGraphControl graphControl2 = getGraphControl();
            List<IGraph> childGraph = (graphControl2 == null || (rootGraph = graphControl2.getRootGraph()) == null) ? null : rootGraph.getChildGraph();
            if (childGraph != null && !childGraph.isEmpty()) {
                int size = childGraph.size();
                while (true) {
                    size--;
                    if (-1 < size) {
                        if (AbstractC5830k.m5325b(str, childGraph.get(size).getId())) {
                            this.selectGraphList.add(childGraph.get(size));
                            ArrayList<RectF> arrayList = this.selectGraphMinOutRectFList;
                            IGraph iGraph = childGraph.get(size);
                            MatrixAdapter matrixAdapter = getMatrixAdapter();
                            if (matrixAdapter == null || (matrix = matrixAdapter.getAdapterMatrix()) == null) {
                                matrix = new Matrix();
                            }
                            arrayList.add(iGraph.getMinOutRectF(matrix));
                        }
                    }
                }
            }
        }
        handleSelectedRectF(this.selectGraphMinOutRectFList);
    }

    @Override // com.zykj.blackboard.core.action.MoveAction
    public void singleTouchCancel(@NotNull EzyTouchEvent$TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
        this.selectRectF = null;
        this.selectGraphList.clear();
        this.selectGraphMinOutRectFList.clear();
        IGraphControl graphControl = getGraphControl();
        if (graphControl != null) {
            graphControl.reDrawFixView();
        }
        IGraphControl graphControl2 = getGraphControl();
        if (graphControl2 != null) {
            graphControl2.selectCancel();
        }
    }

    @Override // com.zykj.blackboard.core.action.MoveAction
    public void singleTouchDown(@NotNull EzyTouchEvent$TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
        Log.i("SelectAction", String.valueOf(hashCode()));
        Log.i(NotificationCompat.CATEGORY_EVENT, "Down: X---> " + event.getX() + ", Y---> " + event.getY());
        this.isMove = false;
        PointF renderPointF = getRenderPointF(event.getX(), event.getY());
        this.firstX = renderPointF.x;
        this.firstY = renderPointF.y;
        boolean zIsClickInSelect = isClickInSelect(new PointF(this.firstX, this.firstY));
        this.isTransformationMode = zIsClickInSelect;
        if (zIsClickInSelect) {
            IGraphControl graphControl = getGraphControl();
            if (graphControl != null) {
                graphControl.translationStart(this.selectGraphList);
            }
            this.prevTime = System.currentTimeMillis();
            return;
        }
        this.selectRectF = null;
        IGraphControl graphControl2 = getGraphControl();
        if (graphControl2 != null) {
            graphControl2.selectCancel();
        }
        this.selectGraphList.clear();
        this.selectGraphMinOutRectFList.clear();
    }

    @Override // com.zykj.blackboard.core.action.MoveAction
    public void singleTouchMove(@NotNull EzyTouchEvent$TouchEvent event) {
        Matrix adapterMatrix;
        AbstractC5830k.m5330g(event, "event");
        Log.i(NotificationCompat.CATEGORY_EVENT, "Move: X---> " + event.getX() + ", Y---> " + event.getY());
        if (isMove(event.getX(), event.getY())) {
            this.isMove = true;
        }
        if (!this.isTransformationMode) {
            this.selectPath.reset();
            MatrixAdapter matrixAdapter = getMatrixAdapter();
            if (matrixAdapter != null && (adapterMatrix = matrixAdapter.getAdapterMatrix()) != null) {
                float[] fArr = {event.getX(), event.getY()};
                adapterMatrix.mapPoints(fArr);
                this.selectPath.addRect(this.firstX, this.firstY, fArr[0], fArr[1], Path.Direction.CW);
            }
            this.selectPath.close();
            IGraphControl graphControl = getGraphControl();
            if (graphControl != null) {
                graphControl.drawPath(this.selectPath, this.selectPaint, null);
                return;
            }
            return;
        }
        Log.i("currentTranslationType", "currentTranslationType: " + this.currentTranslationType);
        int i = this.currentTranslationType;
        if (i == TranslationType.ROTATE.getValue()) {
            handleRotate(event.getX(), event.getY());
        } else if (i == TranslationType.SCALE.getValue()) {
            handleScale(event.getX(), event.getY());
        } else if (i == TranslationType.TRANSLATE.getValue()) {
            handleTranslate(event.getX(), event.getY());
        }
        Matrix matrix = new Matrix();
        MatrixAdapter matrixAdapter2 = getMatrixAdapter();
        AbstractC5830k.m5327d(matrixAdapter2);
        matrix.postConcat(matrixAdapter2.getAdapterMatrix());
        matrix.postConcat(this.tempMatrix);
        MatrixAdapter matrixAdapter3 = getMatrixAdapter();
        AbstractC5830k.m5327d(matrixAdapter3);
        matrix.postConcat(MatrixExtKt.invert(matrixAdapter3.getAdapterMatrix()));
        IGraphControl graphControl2 = getGraphControl();
        if (graphControl2 != null) {
            graphControl2.translation(this.selectGraphList, matrix);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.matrixList.add(MatrixExtKt.toEzyMatrix(matrix, jCurrentTimeMillis));
        this.prevTime = jCurrentTimeMillis;
    }

    @Override // com.zykj.blackboard.core.action.MoveAction
    public void singleTouchUp(@NotNull EzyTouchEvent$TouchEvent event) {
        Matrix matrix;
        IGraph rootGraph;
        Matrix matrix2;
        IGraph rootGraph2;
        Matrix matrix3;
        AbstractC5830k.m5330g(event, "event");
        Log.i(NotificationCompat.CATEGORY_EVENT, "  Up: X---> " + event.getX() + ", Y---> " + event.getY());
        List<IGraph> childGraph = null;
        if (!this.isTransformationMode) {
            this.selectedMatrix.reset();
            if (this.isMove) {
                PointF renderPointF = getRenderPointF(event.getX(), event.getY());
                RectF rectF = new RectF(Math.min(this.firstX, renderPointF.x), Math.min(this.firstY, renderPointF.y), Math.max(this.firstX, renderPointF.x), Math.max(this.firstY, renderPointF.y));
                IGraphControl graphControl = getGraphControl();
                if (graphControl != null && (rootGraph = graphControl.getRootGraph()) != null) {
                    childGraph = rootGraph.getChildGraph();
                }
                if (childGraph != null && (!childGraph.isEmpty())) {
                    for (int size = childGraph.size() - 1; -1 < size; size--) {
                        IGraph iGraph = childGraph.get(size);
                        MatrixAdapter matrixAdapter = getMatrixAdapter();
                        if (matrixAdapter == null || (matrix = matrixAdapter.getAdapterMatrix()) == null) {
                            matrix = new Matrix();
                        }
                        RectF minOutRectF = iGraph.getMinOutRectF(matrix);
                        if (rectF.contains(minOutRectF)) {
                            this.selectGraphList.add(childGraph.get(size));
                            this.selectGraphMinOutRectFList.add(minOutRectF);
                        }
                    }
                }
            } else {
                IGraphControl graphControl2 = getGraphControl();
                if (graphControl2 != null && (rootGraph2 = graphControl2.getRootGraph()) != null) {
                    childGraph = rootGraph2.getChildGraph();
                }
                if (childGraph != null && !childGraph.isEmpty()) {
                    int size2 = childGraph.size() - 1;
                    while (true) {
                        if (-1 >= size2) {
                            break;
                        }
                        if (childGraph.get(size2).isInRect(event.getX(), event.getY(), 0.0f)) {
                            this.selectGraphList.add(childGraph.get(size2));
                            ArrayList<RectF> arrayList = this.selectGraphMinOutRectFList;
                            IGraph iGraph2 = childGraph.get(size2);
                            MatrixAdapter matrixAdapter2 = getMatrixAdapter();
                            if (matrixAdapter2 == null || (matrix2 = matrixAdapter2.getAdapterMatrix()) == null) {
                                matrix2 = new Matrix();
                            }
                            arrayList.add(iGraph2.getMinOutRectF(matrix2));
                        } else {
                            size2--;
                        }
                    }
                }
            }
            handleSelectedRectF(this.selectGraphMinOutRectFList);
            return;
        }
        if (this.isMove) {
            int i = this.currentTranslationType;
            if (i == TranslationType.ROTATE.getValue()) {
                handleRotate(event.getX(), event.getY());
            } else if (i == TranslationType.SCALE.getValue()) {
                handleScale(event.getX(), event.getY());
            } else if (i == TranslationType.TRANSLATE.getValue()) {
                handleTranslate(event.getX(), event.getY());
            }
            this.selectedMatrix.postConcat(this.tempMatrix);
            Matrix matrix4 = new Matrix();
            MatrixAdapter matrixAdapter3 = getMatrixAdapter();
            AbstractC5830k.m5327d(matrixAdapter3);
            matrix4.postConcat(matrixAdapter3.getAdapterMatrix());
            matrix4.postConcat(this.tempMatrix);
            MatrixAdapter matrixAdapter4 = getMatrixAdapter();
            AbstractC5830k.m5327d(matrixAdapter4);
            matrix4.postConcat(MatrixExtKt.invert(matrixAdapter4.getAdapterMatrix()));
            IGraphControl graphControl3 = getGraphControl();
            if (graphControl3 != null) {
                graphControl3.translationEnd(this.selectGraphList, matrix4);
            }
            IActionListener listener = getListener();
            if (listener != null) {
                listener.saveSnapshot();
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.matrixList.add(MatrixExtKt.toEzyMatrix(matrix4, jCurrentTimeMillis));
            this.prevTime = jCurrentTimeMillis;
            IActionListener listener2 = getListener();
            if (listener2 != null) {
                listener2.transformGraphEvent(this.selectGraphList, this.matrixList);
                return;
            }
            return;
        }
        IGraphControl graphControl4 = getGraphControl();
        if (graphControl4 != null) {
            graphControl4.translationEnd(this.selectGraphList, null);
        }
        if (this.currentTranslationType == TranslationType.DELETE.getValue()) {
            IGraphControl graphControl5 = getGraphControl();
            if (graphControl5 != null) {
                graphControl5.delete(this.selectGraphList);
            }
            IGraphControl graphControl6 = getGraphControl();
            if (graphControl6 != null) {
                graphControl6.selectCancel();
            }
            IActionListener listener3 = getListener();
            if (listener3 != null) {
                listener3.deleteGraphEvent(this.selectGraphList, System.currentTimeMillis());
            }
            IActionListener listener4 = getListener();
            if (listener4 != null) {
                listener4.saveSnapshot();
            }
            this.selectRectF = null;
            this.selectGraphList.clear();
            this.selectGraphMinOutRectFList.clear();
            return;
        }
        IGraph clickGraph = getClickGraph(event.getX(), event.getY());
        if (clickGraph != null) {
            ArrayList<IGraph> arrayList2 = this.selectGraphList;
            arrayList2.clear();
            arrayList2.add(clickGraph);
            ArrayList<RectF> arrayList3 = this.selectGraphMinOutRectFList;
            arrayList3.clear();
            MatrixAdapter matrixAdapter5 = getMatrixAdapter();
            if (matrixAdapter5 == null || (matrix3 = matrixAdapter5.getAdapterMatrix()) == null) {
                matrix3 = new Matrix();
            }
            arrayList3.add(clickGraph.getMinOutRectF(matrix3));
            IGraphControl graphControl7 = getGraphControl();
            if (graphControl7 != null) {
                graphControl7.selectCancel();
            }
            handleSelectedRectF(this.selectGraphMinOutRectFList);
        }
    }
}
