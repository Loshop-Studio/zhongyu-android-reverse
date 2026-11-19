package com.zykj.blackboard.core.action.newSelectAtion.function;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import com.blankj.utilcode.util.AbstractC5380q;
import com.tencent.smtt.sdk.TbsListener;
import com.zykj.blackboard.core.action.IActionListener;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionType;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.graph.group.GeometryGraph;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.blackboard.utils.PointUtils;
import com.zykj.board.EzyGraphEnum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8809v;
import p134i7.AbstractC8811w;

/* loaded from: classes4.dex */
public final class GeometryFunction extends BaseSelectFunction {
    private final ArrayList<RectF> colorRectFList;
    private final ArrayList<RectF> funcRelativeRectFList;
    private final ArrayList<NewSelectFunctionType> functionTypeList;
    private float selectGraphOriginHeight;
    private float selectGraphOriginWidth;
    private final PointF triangleEndPointF;
    private final PointF triangleStartPointF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeometryFunction(IActionListener listener) {
        super(listener);
        AbstractC9133u.m16133g(listener, "listener");
        this.functionTypeList = new ArrayList<>();
        this.funcRelativeRectFList = new ArrayList<>();
        this.colorRectFList = new ArrayList<>();
        this.triangleStartPointF = new PointF();
        this.triangleEndPointF = new PointF();
        initFunctionTypeList();
        initFunctionRelativeRectF();
    }

    private final void calculateFunctionRectF() {
        getSelectFunctionRectF().set(getMaxFunctionRectF());
        setDirectionLeft(getFunctionRectFBySelectRectF(getSelectFunctionRectF(), getSelectRectFAfterTransform(), getLimitRectFInPage()));
        updateFunctionRectF();
    }

    private final float calculateRadians(float f10, float f11) {
        if (f10 == 0.0f) {
            return (float) Math.toRadians(f11 > 0.0f ? 90.0d : -90.0d);
        }
        return ((f10 > 0.0f ? 0.0f : (float) Math.toRadians(180.0d)) * (f11 > 0.0f ? -1 : 1)) + ((float) Math.atan(f11 / f10));
    }

    private final float calculateScaleOffset(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return ((float) Math.cos(calculateRadians(f12 - f10, f13 - f11) - calculateRadians(f16 - f14, f17 - f15))) * ((float) Math.sqrt((r7 * r7) + (r8 * r8)));
    }

    private final boolean getSingleGraph() {
        return getSelectGraphList().size() == 1;
    }

    private final void handleMovedPoint(float f10, float f11) {
        PointF pointF = new PointF();
        PointF pointF2 = this.triangleStartPointF;
        float f12 = pointF2.x;
        float f13 = pointF2.y;
        PointF pointF3 = this.triangleEndPointF;
        float fCalculateScaleOffset = calculateScaleOffset(f12, f13, pointF3.x, pointF3.y, f12, f13, f10, f11);
        if (fCalculateScaleOffset < 0.0f) {
            pointF.set(this.triangleStartPointF);
        } else {
            PointF pointF4 = this.triangleStartPointF;
            float f14 = pointF4.x;
            PointF pointF5 = this.triangleEndPointF;
            float f15 = pointF5.x;
            float f16 = (f14 - f15) * (f14 - f15);
            float f17 = pointF4.y;
            float f18 = pointF5.y;
            float fSqrt = (float) Math.sqrt(f16 + ((f17 - f18) * (f17 - f18)));
            if (fCalculateScaleOffset > fSqrt) {
                pointF.set(this.triangleEndPointF);
            } else {
                float f19 = fCalculateScaleOffset / fSqrt;
                PointF pointF6 = this.triangleStartPointF;
                float f20 = pointF6.x;
                PointF pointF7 = this.triangleEndPointF;
                float f21 = f20 + ((pointF7.x - f20) * f19);
                float f22 = pointF6.y;
                pointF.set(f21, f22 + ((pointF7.y - f22) * f19));
            }
        }
        pointF.set(PointUtils.INSTANCE.mapPoint(pointF, MatrixExtKt.invert(getCurrentMatrix())));
        IGraph iGraph = (IGraph) AbstractC8778f0.m14568n0(getSelectGraphList());
        if (iGraph != null) {
            GeometryGraph geometryGraph = (GeometryGraph) iGraph;
            geometryGraph.setPointList(AbstractC8809v.m14774q(pointF, new PointF(geometryGraph.getOriginalRectF().left, geometryGraph.getOriginalRectF().bottom), new PointF(geometryGraph.getOriginalRectF().right, geometryGraph.getOriginalRectF().bottom)));
            PointF trianglePointF = getTrianglePointF();
            if (trianglePointF != null) {
                trianglePointF.set(pointF);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void handleStretch(com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Frame r13, float r14, float r15) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.action.newSelectAtion.function.GeometryFunction.handleStretch(com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode$Frame, float, float):void"); // DEX body: android/优课畅学/smali_classes4/com/zykj/blackboard/core/action/newSelectAtion/function/GeometryFunction.smali:853
    }

    private final void initFunctionRelativeRectF() {
        Paint paint = new Paint();
        paint.setTextSize(25.0f);
        paint.setStyle(Paint.Style.FILL);
        float f10 = paint.getFontMetrics().bottom - paint.getFontMetrics().top;
        float f11 = 2;
        float selectButtonHeight = (getBoardConfig().getSelectButtonHeight() - f10) / f11;
        float selectButtonHeight2 = ((getBoardConfig().getSelectButtonHeight() - f10) / f11) + f10;
        ArrayList<NewSelectFunctionType> arrayList = this.functionTypeList;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((NewSelectFunctionType) obj).getText().length() > 0) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        float f12 = 23.0f;
        while (it.hasNext()) {
            float fMeasureText = paint.measureText(((NewSelectFunctionType) it.next()).getText());
            this.funcRelativeRectFList.add(new RectF(f12, selectButtonHeight, f12 + fMeasureText, selectButtonHeight2));
            f12 += fMeasureText + 30.0f;
        }
        float selectButtonHeight3 = (getBoardConfig().getSelectButtonHeight() - 38.0f) / f11;
        float selectButtonHeight4 = ((getBoardConfig().getSelectButtonHeight() - 38.0f) / f11) + 38.0f;
        int size = getBoardConfig().getSelectNormalColor().size();
        for (int i10 = 0; i10 < size; i10++) {
            float f13 = (i10 * 61.0f) + 23.0f;
            this.colorRectFList.add(new RectF(f13, selectButtonHeight3, f13 + 38.0f, selectButtonHeight4));
        }
    }

    private final void initFunctionTypeList() {
        this.functionTypeList.clear();
        this.functionTypeList.add(NewSelectFunctionType.Rotate.INSTANCE);
        this.functionTypeList.add(NewSelectFunctionType.Scale.INSTANCE);
        this.functionTypeList.add(new NewSelectFunctionType.GeometryStroke(getSingleGraph(), getBoardConfig().getSelectNormalColor().get(0).intValue()));
        this.functionTypeList.add(NewSelectFunctionType.Delete.INSTANCE);
    }

    private final void updateSingleSelectedRectF() {
        IGraph iGraph = (IGraph) AbstractC8778f0.m14568n0(getSelectGraphList());
        if (iGraph != null) {
            getSelectRectF().set(iGraph.getOriginalRectF());
            Matrix transformMatrix = getTransformMatrix();
            transformMatrix.reset();
            transformMatrix.postConcat(iGraph.getRenderMatrix());
            transformMatrix.postConcat(getMatrixAdapter().getAdapterMatrix());
            setTrianglePointF((PointF) AbstractC8778f0.m14568n0(((GeometryGraph) iGraph).getMovePointFList()));
        }
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public List<NewSelectFunctionType> getCurrentFunctionTypeList() {
        return this.functionTypeList;
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public RectF getMaxFunctionRectF() {
        return new RectF(0.0f, 0.0f, Math.max(((RectF) AbstractC8778f0.m14578x0(this.funcRelativeRectFList)).right + 15.0f + 8.0f, ((RectF) AbstractC8778f0.m14578x0(this.colorRectFList)).right + 23.0f), (getBoardConfig().getSelectButtonHeight() * 2) + 13.0f);
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public boolean handleClick(float f10, float f11) {
        GeometryGraph geometryGraph;
        Paint paint;
        if (!super.handleClick(f10, f11)) {
            return false;
        }
        NewSelectFunctionMode currentFunctionMode = getCurrentFunctionMode();
        Object obj = null;
        if (currentFunctionMode instanceof NewSelectFunctionMode.Function) {
            NewSelectFunctionMode currentFunctionMode2 = getCurrentFunctionMode();
            AbstractC9133u.m16131e(currentFunctionMode2, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Function");
            int index = ((NewSelectFunctionMode.Function) currentFunctionMode2).getIndex();
            if (index == 0) {
                Iterator<T> it = this.functionTypeList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((NewSelectFunctionType) next) instanceof NewSelectFunctionType.GeometryStroke) {
                        obj = next;
                        break;
                    }
                }
                NewSelectFunctionType newSelectFunctionType = (NewSelectFunctionType) obj;
                if (newSelectFunctionType != null) {
                    newSelectFunctionType.setSelected(!newSelectFunctionType.isSelected());
                    showSelectRectF(false);
                }
            } else if (index == 1) {
                getGraphControl().delete(getSelectGraphList());
                getGraphControl().selectCancel();
                getListener().deleteGraphEvent(getSelectGraphList(), System.currentTimeMillis());
                getListener().saveSnapshot();
                reset();
            }
        } else if (currentFunctionMode instanceof NewSelectFunctionMode.Color) {
            NewSelectFunctionMode currentFunctionMode3 = getCurrentFunctionMode();
            AbstractC9133u.m16131e(currentFunctionMode3, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Color");
            int iIntValue = getBoardConfig().getSelectNormalColor().get(((NewSelectFunctionMode.Color) currentFunctionMode3).getIndex()).intValue();
            for (IGraph iGraph : getSelectGraphList()) {
                if ((iGraph instanceof GeometryGraph) && (paint = (geometryGraph = (GeometryGraph) iGraph).getPaint()) != null) {
                    paint.setColor(iIntValue);
                    geometryGraph.setPaint(paint);
                    IActionListener.DefaultImpls.changeGraph$default(getListener(), iGraph, EzyGraphEnum.GraphEnum.GEOMETRY_GRAPH, null, null, new Paint(paint), null, null, null, 236, null);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("GeometryFunction:color -> color:");
            sb.append(iIntValue);
            sb.append(" graphList: ");
            ArrayList<IGraph> selectGraphList = getSelectGraphList();
            ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(selectGraphList, 10));
            Iterator<T> it2 = selectGraphList.iterator();
            while (it2.hasNext()) {
                arrayList.add(((IGraph) it2.next()).getId());
            }
            sb.append(arrayList);
            AbstractC5380q.m2623s(sb.toString());
            getGraphControl().reDrawFixView();
            getListener().saveSnapshot();
            Iterator<T> it3 = this.functionTypeList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next2 = it3.next();
                if (((NewSelectFunctionType) next2) instanceof NewSelectFunctionType.GeometryStroke) {
                    obj = next2;
                    break;
                }
            }
            NewSelectFunctionType newSelectFunctionType2 = (NewSelectFunctionType) obj;
            if (newSelectFunctionType2 != null) {
                ((NewSelectFunctionType.GeometryStroke) newSelectFunctionType2).setColor(iIntValue);
            }
            showSelectRectF(false);
        }
        return true;
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public boolean handleMoveEnd(float f10, float f11) {
        if (super.handleMoveEnd(f10, f11)) {
            return true;
        }
        NewSelectFunctionMode currentFunctionMode = getCurrentFunctionMode();
        if (currentFunctionMode instanceof NewSelectFunctionMode.Frame) {
            NewSelectFunctionMode currentFunctionMode2 = getCurrentFunctionMode();
            AbstractC9133u.m16131e(currentFunctionMode2, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Frame");
            handleStretch((NewSelectFunctionMode.Frame) currentFunctionMode2, f10, f11);
            updateSingleSelectedRectF();
            calculateFunctionRectF();
            PointF trianglePointF = getTrianglePointF();
            PointF pointFMapPoint = trianglePointF != null ? PointUtils.INSTANCE.mapPoint(trianglePointF, getCurrentMatrix()) : null;
            IGraph iGraph = (IGraph) AbstractC8778f0.m14568n0(getSelectGraphList());
            if (iGraph != null) {
                getGraphControl().newChangeHandleEnd(getSelectRectF(), getCurrentMatrix(), getSelectFunctionRectF(), getFunctionRectF(), getCurrentFunctionTypeList(), pointFMapPoint);
                IActionListener.DefaultImpls.changeGraph$default(getListener(), iGraph, EzyGraphEnum.GraphEnum.GEOMETRY_GRAPH, iGraph.getOriginalRectF(), null, null, null, null, null, 248, null);
            }
            getListener().saveSnapshot();
        } else {
            if (!(currentFunctionMode instanceof NewSelectFunctionMode.GeometryPoint)) {
                return false;
            }
            handleMovedPoint(f10, f11);
            PointF trianglePointF2 = getTrianglePointF();
            PointF pointFMapPoint2 = trianglePointF2 != null ? PointUtils.INSTANCE.mapPoint(trianglePointF2, getCurrentMatrix()) : null;
            IGraph iGraph2 = (IGraph) AbstractC8778f0.m14568n0(getSelectGraphList());
            if (iGraph2 != null) {
                getGraphControl().newChangeHandleEnd(getSelectRectF(), getCurrentMatrix(), getSelectFunctionRectF(), getFunctionRectF(), getCurrentFunctionTypeList(), pointFMapPoint2);
                IActionListener.DefaultImpls.changeGraph$default(getListener(), iGraph2, EzyGraphEnum.GraphEnum.GEOMETRY_GRAPH, null, null, null, ((GeometryGraph) iGraph2).getPointList(), null, null, TbsListener.ErrorCode.COPY_INSTALL_SUCCESS, null);
            }
            getListener().saveSnapshot();
        }
        return true;
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public boolean handleMoveStart(float f10, float f11) {
        NewSelectFunctionMode currentFunctionMode = getCurrentFunctionMode();
        if (!(currentFunctionMode instanceof NewSelectFunctionMode.Frame)) {
            if (!(currentFunctionMode instanceof NewSelectFunctionMode.GeometryPoint)) {
                return true;
            }
            IGraph iGraph = (IGraph) AbstractC8778f0.m14568n0(getSelectGraphList());
            if (iGraph == null) {
                return false;
            }
            GeometryGraph geometryGraph = (GeometryGraph) iGraph;
            Matrix matrix = new Matrix();
            matrix.postConcat(geometryGraph.getRenderMatrix());
            matrix.postConcat(getMatrixAdapter().getAdapterMatrix());
            PointF pointF = this.triangleStartPointF;
            PointUtils pointUtils = PointUtils.INSTANCE;
            pointF.set(pointUtils.mapPoint(geometryGraph.getOriginalRectF().left, geometryGraph.getOriginalRectF().top, matrix));
            this.triangleEndPointF.set(pointUtils.mapPoint(geometryGraph.getOriginalRectF().right, geometryGraph.getOriginalRectF().top, matrix));
            PointF trianglePointF = getTrianglePointF();
            PointF pointFMapPoint = trianglePointF != null ? pointUtils.mapPoint(trianglePointF, getCurrentMatrix()) : null;
            IGraph iGraph2 = (IGraph) AbstractC8778f0.m14568n0(getSelectGraphList());
            if (iGraph2 == null) {
                return true;
            }
            getGraphControl().newChangeHandleStart((GeometryGraph) iGraph2, getSelectRectF(), getCurrentMatrix(), getSelectFunctionRectF(), getFunctionRectF(), getCurrentFunctionTypeList(), pointFMapPoint);
            return true;
        }
        IGraph iGraph3 = (IGraph) AbstractC8778f0.m14568n0(getSelectGraphList());
        if (iGraph3 == null) {
            return false;
        }
        GeometryGraph geometryGraph2 = (GeometryGraph) iGraph3;
        Matrix matrix2 = new Matrix();
        matrix2.postConcat(geometryGraph2.getRenderMatrix());
        matrix2.postConcat(getMatrixAdapter().getAdapterMatrix());
        this.selectGraphOriginWidth = matrix2.mapRadius(geometryGraph2.getOriginalRectF().width());
        this.selectGraphOriginHeight = matrix2.mapRadius(geometryGraph2.getOriginalRectF().height());
        AbstractC5380q.m2623s("GeometryFunction:changeFrame -> start graph:" + geometryGraph2.getId());
        updateSingleSelectedRectF();
        calculateFunctionRectF();
        PointF trianglePointF2 = getTrianglePointF();
        PointF pointFMapPoint2 = trianglePointF2 != null ? PointUtils.INSTANCE.mapPoint(trianglePointF2, getCurrentMatrix()) : null;
        IGraph iGraph4 = (IGraph) AbstractC8778f0.m14568n0(getSelectGraphList());
        if (iGraph4 == null) {
            return true;
        }
        getGraphControl().newChangeHandleStart((GeometryGraph) iGraph4, getSelectRectF(), getCurrentMatrix(), getSelectFunctionRectF(), getFunctionRectF(), getCurrentFunctionTypeList(), pointFMapPoint2);
        return true;
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public boolean handleMoving(float f10, float f11) {
        if (super.handleMoving(f10, f11)) {
            return true;
        }
        NewSelectFunctionMode currentFunctionMode = getCurrentFunctionMode();
        if (currentFunctionMode instanceof NewSelectFunctionMode.Frame) {
            NewSelectFunctionMode currentFunctionMode2 = getCurrentFunctionMode();
            AbstractC9133u.m16131e(currentFunctionMode2, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode.Frame");
            handleStretch((NewSelectFunctionMode.Frame) currentFunctionMode2, f10, f11);
            updateSingleSelectedRectF();
            calculateFunctionRectF();
            PointF trianglePointF = getTrianglePointF();
            PointF pointFMapPoint = trianglePointF != null ? PointUtils.INSTANCE.mapPoint(trianglePointF, getCurrentMatrix()) : null;
            IGraph iGraph = (IGraph) AbstractC8778f0.m14568n0(getSelectGraphList());
            if (iGraph != null) {
                getGraphControl().newChangeHandling((GeometryGraph) iGraph, getSelectRectF(), getCurrentMatrix(), getSelectFunctionRectF(), getFunctionRectF(), getCurrentFunctionTypeList(), pointFMapPoint);
            }
        } else {
            if (!(currentFunctionMode instanceof NewSelectFunctionMode.GeometryPoint)) {
                return false;
            }
            handleMovedPoint(f10, f11);
            PointF trianglePointF2 = getTrianglePointF();
            PointF pointFMapPoint2 = trianglePointF2 != null ? PointUtils.INSTANCE.mapPoint(trianglePointF2, getCurrentMatrix()) : null;
            IGraph iGraph2 = (IGraph) AbstractC8778f0.m14568n0(getSelectGraphList());
            if (iGraph2 != null) {
                getGraphControl().newChangeHandling((GeometryGraph) iGraph2, getSelectRectF(), getCurrentMatrix(), getSelectFunctionRectF(), getFunctionRectF(), getCurrentFunctionTypeList(), pointFMapPoint2);
            }
        }
        return true;
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public boolean isClickInSelectFunction(float f10, float f11) {
        Object next;
        if (getFunctionRectF().getGeometryStroke().contains(f10, f11)) {
            setCurrentFunctionMode(new NewSelectFunctionMode.Function(0));
            return true;
        }
        if (getFunctionRectF().getDelete().contains(f10, f11)) {
            setCurrentFunctionMode(new NewSelectFunctionMode.Function(1));
            return true;
        }
        Iterator<T> it = this.functionTypeList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((NewSelectFunctionType) next) instanceof NewSelectFunctionType.GeometryStroke) {
                break;
            }
        }
        NewSelectFunctionType newSelectFunctionType = (NewSelectFunctionType) next;
        if (newSelectFunctionType != null && newSelectFunctionType.isSelected()) {
            int size = getFunctionRectF().getColorList().size();
            for (int i10 = 0; i10 < size; i10++) {
                if (getFunctionRectF().getColorList().get(i10).contains(f10, f11)) {
                    setCurrentFunctionMode(new NewSelectFunctionMode.Color(i10));
                    return true;
                }
            }
        }
        Matrix matrixInvert = MatrixExtKt.invert(getCurrentMatrix());
        float[] fArr = {f10, f11};
        matrixInvert.mapPoints(fArr);
        float f12 = fArr[0];
        float f13 = fArr[1];
        float fMapRadius = matrixInvert.mapRadius(getBoardConfig().getSelectIconWidth());
        if (getSingleGraph()) {
            PointF trianglePointF = getTrianglePointF();
            if (trianglePointF != null) {
                float f14 = trianglePointF.x;
                float f15 = fMapRadius / 2;
                float f16 = trianglePointF.y;
                if (new RectF(f14 - f15, f16 - f15, f14 + f15, f16 + f15).contains(f12, f13)) {
                    setCurrentFunctionMode(NewSelectFunctionMode.GeometryPoint.INSTANCE);
                    return true;
                }
            }
            float f17 = fMapRadius / 2;
            if (new RectF(getSelectRectF().left - f17, getSelectRectF().centerY() - f17, getSelectRectF().left + f17, getSelectRectF().centerY() + f17).contains(f12, f13)) {
                setCurrentFunctionMode(NewSelectFunctionMode.Frame.Left.INSTANCE);
                return true;
            }
            if (new RectF(getSelectRectF().centerX() - f17, getSelectRectF().top - f17, getSelectRectF().centerX() + f17, getSelectRectF().top + f17).contains(f12, f13)) {
                setCurrentFunctionMode(NewSelectFunctionMode.Frame.Top.INSTANCE);
                return true;
            }
            if (new RectF(getSelectRectF().right - f17, getSelectRectF().centerY() - f17, getSelectRectF().right + f17, getSelectRectF().centerY() + f17).contains(f12, f13)) {
                setCurrentFunctionMode(NewSelectFunctionMode.Frame.Right.INSTANCE);
                return true;
            }
            if (new RectF(getSelectRectF().centerX() - f17, getSelectRectF().bottom - f17, getSelectRectF().centerX() + f17, getSelectRectF().bottom + f17).contains(f12, f13)) {
                setCurrentFunctionMode(NewSelectFunctionMode.Frame.Bottom.INSTANCE);
                return true;
            }
        }
        float f18 = 2;
        float f19 = fMapRadius / f18;
        if (new RectF(getSelectRectF().centerX() - f19, getSelectRectF().top - ((5 * fMapRadius) / f18), getSelectRectF().centerX() + f19, getSelectRectF().top - ((fMapRadius * 3) / f18)).contains(f12, f13)) {
            setCurrentFunctionMode(NewSelectFunctionMode.Rotate.INSTANCE);
            return true;
        }
        if (new RectF(getSelectRectF().right - f19, getSelectRectF().bottom - f19, getSelectRectF().right + f19, getSelectRectF().bottom + f19).contains(f12, f13)) {
            setCurrentFunctionMode(NewSelectFunctionMode.Scale.INSTANCE);
            return true;
        }
        if (getSelectRectF().contains(f12, f13)) {
            setCurrentFunctionMode(NewSelectFunctionMode.Content.INSTANCE);
            return true;
        }
        setCurrentFunctionMode(NewSelectFunctionMode.Nothing.INSTANCE);
        return false;
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public void reset() {
        super.reset();
        initFunctionTypeList();
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public void setSelectGraphList(List<? extends IGraph> graphList) {
        Object next;
        AbstractC9133u.m16133g(graphList, "graphList");
        super.setSelectGraphList(graphList);
        Iterator<T> it = this.functionTypeList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((NewSelectFunctionType) next) instanceof NewSelectFunctionType.GeometryStroke) {
                    break;
                }
            }
        }
        NewSelectFunctionType newSelectFunctionType = (NewSelectFunctionType) next;
        if (newSelectFunctionType != null) {
            NewSelectFunctionType.GeometryStroke geometryStroke = (NewSelectFunctionType.GeometryStroke) newSelectFunctionType;
            geometryStroke.setSingle(getSingleGraph());
            int color = Integer.MAX_VALUE;
            if (geometryStroke.isSingle()) {
                Object objM14566l0 = AbstractC8778f0.m14566l0(graphList);
                AbstractC9133u.m16131e(objM14566l0, "null cannot be cast to non-null type com.zykj.blackboard.core.graph.group.GeometryGraph");
                Paint paint = ((GeometryGraph) objM14566l0).getPaint();
                if (paint != null) {
                    color = paint.getColor();
                }
            }
            geometryStroke.setColor(color);
        }
    }

    @Override // com.zykj.blackboard.core.action.newSelectAtion.function.BaseSelectFunction
    public void updateFunctionRectF() {
        FunctionRectF functionRectF = getFunctionRectF();
        functionRectF.getGeometryStroke().set((getSelectFunctionRectF().left + this.funcRelativeRectFList.get(0).left) - 15.0f, getSelectFunctionRectF().top, getSelectFunctionRectF().left + this.funcRelativeRectFList.get(0).right + 15.0f, getSelectFunctionRectF().top + getBoardConfig().getSelectButtonHeight());
        functionRectF.getDelete().set((getSelectFunctionRectF().left + this.funcRelativeRectFList.get(1).left) - 15.0f, getSelectFunctionRectF().top, getSelectFunctionRectF().left + this.funcRelativeRectFList.get(1).right + 15.0f, getSelectFunctionRectF().top + getBoardConfig().getSelectButtonHeight());
        functionRectF.getColorList().clear();
        for (RectF rectF : this.colorRectFList) {
            functionRectF.getColorList().add(new RectF(getSelectFunctionRectF().left + rectF.left, getSelectFunctionRectF().top + getBoardConfig().getSelectButtonHeight() + 13.0f + rectF.top, getSelectFunctionRectF().left + rectF.right, getSelectFunctionRectF().top + getBoardConfig().getSelectButtonHeight() + 13.0f + rectF.bottom));
        }
        if (isDirectionLeft()) {
            return;
        }
        float f10 = (functionRectF.getDelete().right - functionRectF.getGeometryStroke().left) + 16.0f;
        functionRectF.getGeometryStroke().offset(getSelectFunctionRectF().width() - f10, 0.0f);
        functionRectF.getDelete().offset(getSelectFunctionRectF().width() - f10, 0.0f);
        float f11 = (((RectF) AbstractC8778f0.m14578x0(functionRectF.getColorList())).right - ((RectF) AbstractC8778f0.m14566l0(functionRectF.getColorList())).left) + 46.0f;
        Iterator<T> it = functionRectF.getColorList().iterator();
        while (it.hasNext()) {
            ((RectF) it.next()).offset(getSelectFunctionRectF().width() - f11, 0.0f);
        }
    }
}
