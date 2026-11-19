package com.zykj.blackboard.core.action;

import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.enums.TranslationType;
import com.zykj.blackboard.utils.EventBus;
import com.zykj.blackboard.utils.EventKey;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.blackboard.utils.PointUtils;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzyTouchEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;

/* loaded from: classes4.dex */
public final class SelectAction extends MoveAction {
    private float firstX;
    private float firstY;
    private boolean isMove;
    private RectF selectRectF;
    private final List<EzyMatrix.Matrix> matrixList = new ArrayList();
    private long prevTime = System.currentTimeMillis();
    private final float minMoveDistance = 20.0f;
    private boolean isTransformationMode = true;
    private Path selectPath = new Path();
    private Paint selectPaint = new Paint();
    private Paint selectedRectFPaint = new Paint();
    private final float iconWidth = 50.0f;
    private int currentTranslationType = -1;
    private Matrix tempMatrix = new Matrix();
    private Matrix selectedMatrix = new Matrix();
    private ArrayList<IGraph> selectGraphList = new ArrayList<>();
    private ArrayList<RectF> selectGraphMinOutRectFList = new ArrayList<>();

    public SelectAction() {
        this.selectPaint.setColor(-16777216);
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
        EventBus.INSTANCE.register(EventKey.SELECT_ACTION_SELECTED_CANCEL, new InterfaceC10559a() { // from class: com.zykj.blackboard.core.action.SelectAction.1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27412invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27412invoke() {
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

    private final float calculateRadians(float f10, float f11) {
        return ((f10 > 0.0f ? 0.0f : (float) Math.toRadians(180.0d)) * (f11 > 0.0f ? -1 : 1)) + ((float) Math.atan(f11 / f10));
    }

    private final float calculateScaleOffset(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return ((float) Math.cos(calculateRadians(f12 - f10, f13 - f11) - calculateRadians(f16 - f14, f17 - f15))) * ((float) Math.sqrt((r7 * r7) + (r8 * r8)));
    }

    private final boolean checkColorLight(int i10) {
        return ((((double) ((i10 >> 16) & 255)) * 0.299d) + (((double) ((i10 >> 8) & 255)) * 0.578d)) + (((double) (i10 & 255)) * 0.114d) >= 192.0d;
    }

    private final void countRectF(RectF rectF, RectF rectF2) {
        if (rectF2.isEmpty()) {
            rectF2.set(rectF);
        } else {
            rectF2.union(rectF);
        }
    }

    private final IGraph getClickGraph(float f10, float f11) {
        IGraph iGraphRootGraph;
        IGraphControl graphControl = getGraphControl();
        List<IGraph> childGraph = (graphControl == null || (iGraphRootGraph = graphControl.rootGraph()) == null) ? null : iGraphRootGraph.getChildGraph();
        if (childGraph != null && !childGraph.isEmpty()) {
            int size = childGraph.size();
            do {
                size--;
                if (-1 < size) {
                }
            } while (!childGraph.get(size).isInRect(f10, f11, 0.0f));
            return childGraph.get(size);
        }
        return null;
    }

    private final PointF getRenderPointF(float f10, float f11) {
        PointUtils pointUtils = PointUtils.INSTANCE;
        MatrixAdapter matrixAdapter = getMatrixAdapter();
        AbstractC9133u.m16130d(matrixAdapter);
        return pointUtils.mapPoint(f10, f11, matrixAdapter.getAdapterMatrix());
    }

    private final void handleRotate(float f10, float f11) {
        PointF renderPointF = getRenderPointF(f10, f11);
        PointUtils pointUtils = PointUtils.INSTANCE;
        RectF rectF = this.selectRectF;
        AbstractC9133u.m16130d(rectF);
        float fCenterX = rectF.centerX();
        RectF rectF2 = this.selectRectF;
        AbstractC9133u.m16130d(rectF2);
        PointF pointFMapPoint = pointUtils.mapPoint(fCenterX, rectF2.centerY(), this.selectedMatrix);
        this.tempMatrix.setRotate((float) Math.toDegrees(calculateRadians(renderPointF.x - pointFMapPoint.x, renderPointF.y - pointFMapPoint.y) - calculateRadians(this.firstX - pointFMapPoint.x, this.firstY - pointFMapPoint.y)), pointFMapPoint.x, pointFMapPoint.y);
    }

    private final void handleScale(float f10, float f11) {
        PointF renderPointF = getRenderPointF(f10, f11);
        PointUtils pointUtils = PointUtils.INSTANCE;
        RectF rectF = this.selectRectF;
        AbstractC9133u.m16130d(rectF);
        float fCenterX = rectF.centerX();
        RectF rectF2 = this.selectRectF;
        AbstractC9133u.m16130d(rectF2);
        PointF pointFMapPoint = pointUtils.mapPoint(fCenterX, rectF2.centerY(), this.selectedMatrix);
        RectF rectF3 = this.selectRectF;
        AbstractC9133u.m16130d(rectF3);
        float f12 = rectF3.right;
        RectF rectF4 = this.selectRectF;
        AbstractC9133u.m16130d(rectF4);
        PointF pointFMapPoint2 = pointUtils.mapPoint(f12, rectF4.bottom, this.selectedMatrix);
        float fCalculateScaleOffset = calculateScaleOffset(pointFMapPoint.x, pointFMapPoint.y, pointFMapPoint2.x, pointFMapPoint2.y, this.firstX, this.firstY, renderPointF.x, renderPointF.y);
        double d10 = 2;
        float fSqrt = (float) Math.sqrt(((float) Math.pow(pointFMapPoint.x - pointFMapPoint2.x, d10)) + ((float) Math.pow(pointFMapPoint.y - pointFMapPoint2.y, d10)));
        float f13 = fCalculateScaleOffset + fSqrt;
        if (f13 > ((float) Math.sqrt(((float) Math.pow(this.iconWidth + 10, d10)) * 2))) {
            float f14 = f13 / fSqrt;
            this.tempMatrix.setScale(f14, f14, pointFMapPoint.x, pointFMapPoint.y);
        }
    }

    private final void handleSelectedRectF(List<? extends RectF> list) {
        RectF rectF = new RectF();
        Iterator<T> it = list.iterator();
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
        float f10 = 10;
        float fWidth = (this.iconWidth + f10) - rectF.width();
        float fHeight = (this.iconWidth + f10) - rectF.height();
        if (fWidth > 0.0f) {
            float f11 = fWidth / 2;
            rectF.left -= f11;
            rectF.right += f11;
        }
        if (fHeight > 0.0f) {
            float f12 = fHeight / 2;
            rectF.top -= f12;
            rectF.bottom += f12;
        }
        this.selectRectF = rectF;
        IGraphControl graphControl2 = getGraphControl();
        if (graphControl2 != null) {
            RectF rectF2 = this.selectRectF;
            AbstractC9133u.m16130d(rectF2);
            graphControl2.select(rectF2, this.tempMatrix, this.selectedRectFPaint, this.iconWidth, true);
        }
    }

    private final void handleTranslate(float f10, float f11) {
        PointF renderPointF = getRenderPointF(f10, f11);
        this.tempMatrix.setTranslate(renderPointF.x - this.firstX, renderPointF.y - this.firstY);
    }

    private final boolean isClickInSelect(PointF pointF) {
        if (this.selectRectF == null) {
            return false;
        }
        float fMapRadius = (this.iconWidth / 2) / this.selectedMatrix.mapRadius(1.0f);
        RectF rectF = this.selectRectF;
        AbstractC9133u.m16130d(rectF);
        float f10 = rectF.left - fMapRadius;
        RectF rectF2 = this.selectRectF;
        AbstractC9133u.m16130d(rectF2);
        float f11 = rectF2.top - fMapRadius;
        RectF rectF3 = this.selectRectF;
        AbstractC9133u.m16130d(rectF3);
        float f12 = rectF3.left + fMapRadius;
        RectF rectF4 = this.selectRectF;
        AbstractC9133u.m16130d(rectF4);
        RectF rectF5 = new RectF(f10, f11, f12, rectF4.top + fMapRadius);
        RectF rectF6 = this.selectRectF;
        AbstractC9133u.m16130d(rectF6);
        float f13 = rectF6.right - fMapRadius;
        RectF rectF7 = this.selectRectF;
        AbstractC9133u.m16130d(rectF7);
        float f14 = rectF7.top - fMapRadius;
        RectF rectF8 = this.selectRectF;
        AbstractC9133u.m16130d(rectF8);
        float f15 = rectF8.right + fMapRadius;
        RectF rectF9 = this.selectRectF;
        AbstractC9133u.m16130d(rectF9);
        RectF rectF10 = new RectF(f13, f14, f15, rectF9.top + fMapRadius);
        RectF rectF11 = this.selectRectF;
        AbstractC9133u.m16130d(rectF11);
        float f16 = rectF11.right - fMapRadius;
        RectF rectF12 = this.selectRectF;
        AbstractC9133u.m16130d(rectF12);
        float f17 = rectF12.bottom - fMapRadius;
        RectF rectF13 = this.selectRectF;
        AbstractC9133u.m16130d(rectF13);
        float f18 = rectF13.right + fMapRadius;
        RectF rectF14 = this.selectRectF;
        AbstractC9133u.m16130d(rectF14);
        RectF rectF15 = new RectF(f16, f17, f18, rectF14.bottom + fMapRadius);
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
        AbstractC9133u.m16130d(rectF16);
        if (!pointUtils.isPointInRect(rectF16, this.selectedMatrix, pointF)) {
            return false;
        }
        this.currentTranslationType = TranslationType.TRANSLATE.getValue();
        return true;
    }

    private final boolean isMove(float f10, float f11) {
        PointF renderPointF = getRenderPointF(f10, f11);
        double d10 = 2;
        return ((float) Math.sqrt((double) (((float) Math.pow((double) (renderPointF.x - this.firstX), d10)) + ((float) Math.pow((double) (renderPointF.y - this.firstY), d10))))) > this.minMoveDistance;
    }

    public final ArrayList<IGraph> getSelectGraphList() {
        return this.selectGraphList;
    }

    public final ArrayList<RectF> getSelectGraphMinOutRectFList() {
        return this.selectGraphMinOutRectFList;
    }

    public final RectF getSelectRectF() {
        return this.selectRectF;
    }

    @Override // com.zykj.blackboard.core.action.MoveAction, com.zykj.blackboard.core.action.ITouchAction
    public void reset() {
        IGraphControl graphControl = getGraphControl();
        if (graphControl != null) {
            this.selectPaint.setColor(checkColorLight(graphControl.getBackgroundColor()) ? -16777216 : -3355444);
            this.selectedRectFPaint.setColor(checkColorLight(graphControl.getBackgroundColor()) ? -12085261 : -3355444);
        }
        this.tempMatrix.reset();
        this.selectPath.reset();
        this.matrixList.clear();
        this.firstX = 0.0f;
        this.firstY = 0.0f;
    }

    public final void selectGraphList(List<String> graphIdList) {
        Matrix matrix;
        IGraph iGraphRootGraph;
        AbstractC9133u.m16133g(graphIdList, "graphIdList");
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
            List<IGraph> childGraph = (graphControl2 == null || (iGraphRootGraph = graphControl2.rootGraph()) == null) ? null : iGraphRootGraph.getChildGraph();
            if (childGraph != null && !childGraph.isEmpty()) {
                int size = childGraph.size();
                while (true) {
                    size--;
                    if (-1 < size) {
                        if (AbstractC9133u.m16128b(str, childGraph.get(size).getId())) {
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
    public void singleTouchCancel(EzyTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
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
    public void singleTouchDown(EzyTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
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
    public void singleTouchMove(EzyTouchEvent.TouchEvent event) {
        Matrix adapterMatrix;
        AbstractC9133u.m16133g(event, "event");
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
        int i10 = this.currentTranslationType;
        if (i10 == TranslationType.ROTATE.getValue()) {
            handleRotate(event.getX(), event.getY());
        } else if (i10 == TranslationType.SCALE.getValue()) {
            handleScale(event.getX(), event.getY());
        } else if (i10 == TranslationType.TRANSLATE.getValue()) {
            handleTranslate(event.getX(), event.getY());
        }
        Matrix matrix = new Matrix();
        MatrixAdapter matrixAdapter2 = getMatrixAdapter();
        AbstractC9133u.m16130d(matrixAdapter2);
        matrix.postConcat(matrixAdapter2.getAdapterMatrix());
        matrix.postConcat(this.tempMatrix);
        MatrixAdapter matrixAdapter3 = getMatrixAdapter();
        AbstractC9133u.m16130d(matrixAdapter3);
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
    public void singleTouchUp(EzyTouchEvent.TouchEvent event) {
        Matrix matrix;
        IGraph iGraphRootGraph;
        Matrix matrix2;
        IGraph iGraphRootGraph2;
        Matrix matrix3;
        AbstractC9133u.m16133g(event, "event");
        Log.i(NotificationCompat.CATEGORY_EVENT, "  Up: X---> " + event.getX() + ", Y---> " + event.getY());
        List<IGraph> childGraph = null;
        if (!this.isTransformationMode) {
            this.selectedMatrix.reset();
            if (this.isMove) {
                PointF renderPointF = getRenderPointF(event.getX(), event.getY());
                RectF rectF = new RectF(Math.min(this.firstX, renderPointF.x), Math.min(this.firstY, renderPointF.y), Math.max(this.firstX, renderPointF.x), Math.max(this.firstY, renderPointF.y));
                IGraphControl graphControl = getGraphControl();
                if (graphControl != null && (iGraphRootGraph = graphControl.rootGraph()) != null) {
                    childGraph = iGraphRootGraph.getChildGraph();
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
                if (graphControl2 != null && (iGraphRootGraph2 = graphControl2.rootGraph()) != null) {
                    childGraph = iGraphRootGraph2.getChildGraph();
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
            int i10 = this.currentTranslationType;
            if (i10 == TranslationType.ROTATE.getValue()) {
                handleRotate(event.getX(), event.getY());
            } else if (i10 == TranslationType.SCALE.getValue()) {
                handleScale(event.getX(), event.getY());
            } else if (i10 == TranslationType.TRANSLATE.getValue()) {
                handleTranslate(event.getX(), event.getY());
            }
            this.selectedMatrix.postConcat(this.tempMatrix);
            Matrix matrix4 = new Matrix();
            MatrixAdapter matrixAdapter3 = getMatrixAdapter();
            AbstractC9133u.m16130d(matrixAdapter3);
            matrix4.postConcat(matrixAdapter3.getAdapterMatrix());
            matrix4.postConcat(this.tempMatrix);
            MatrixAdapter matrixAdapter4 = getMatrixAdapter();
            AbstractC9133u.m16130d(matrixAdapter4);
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
