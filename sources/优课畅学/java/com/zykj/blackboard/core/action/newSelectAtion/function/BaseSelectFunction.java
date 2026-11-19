package com.zykj.blackboard.core.action.newSelectAtion.function;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.core.action.IActionListener;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionType;
import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.blackboard.utils.PointUtils;
import com.zykj.board.EzyMatrix;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public abstract class BaseSelectFunction {
    public static final Companion Companion = new Companion(null);
    public static final float colorSpace = 23.0f;
    public static final float colorWidth = 38.0f;
    public static final float funcHorizontalPadding = 15.0f;
    public static final float funcRectHorizontalPadding = 8.0f;
    public static final float funcSize = 25.0f;
    public static final float spaceHeight = 13.0f;
    public static final float textPadding = 32.0f;
    public static final float textSpaceWidth = 2.0f;
    public static final float textWidth = 24.0f;
    public static final float writeCircleFirstWidth = 8.0f;
    public static final float writeCircleHorizontalPadding = 19.0f;
    public static final float writeCircleWidthStep = 3.0f;
    public static final float writeRectFHorizontalPadding = 16.0f;
    private final BoardConfig boardConfig;
    private NewSelectFunctionMode currentFunctionMode;
    private float firstX;
    private float firstY;
    private FunctionRectF functionRectF;
    private final IGraphControl graphControl;
    private boolean isDirectionLeft;
    private boolean isTransforming;
    private final IActionListener listener;
    private final MatrixAdapter matrixAdapter;
    private final List<EzyMatrix.Matrix> matrixList;
    private final RectF selectFunctionRectF;
    private final ArrayList<IGraph> selectGraphList;
    private final RectF selectRectF;
    private final Matrix singleMatrix;
    private final Matrix transformMatrix;
    private PointF trianglePointF;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private Companion() {
        }
    }

    public BaseSelectFunction(IActionListener listener) {
        AbstractC9133u.m16133g(listener, "listener");
        this.listener = listener;
        this.graphControl = listener.getGraphControl();
        this.boardConfig = listener.getBoardConfig();
        this.matrixAdapter = listener.getMatrixAdapter();
        this.transformMatrix = new Matrix();
        this.singleMatrix = new Matrix();
        this.selectRectF = new RectF();
        this.selectFunctionRectF = new RectF();
        this.isDirectionLeft = true;
        this.selectGraphList = new ArrayList<>();
        this.currentFunctionMode = NewSelectFunctionMode.Nothing.INSTANCE;
        this.functionRectF = new FunctionRectF(null, null, null, null, null, null, null, null, null, 511, null);
        this.matrixList = new ArrayList();
    }

    private final float calculateRadians(float f10, float f11) {
        return ((f10 > 0.0f ? 0.0f : (float) Math.toRadians(180.0d)) * (f11 > 0.0f ? -1 : 1)) + ((float) Math.atan(f11 / f10));
    }

    private final float calculateScaleOffset(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return ((float) Math.cos(calculateRadians(f12 - f10, f13 - f11) - calculateRadians(f16 - f14, f17 - f15))) * ((float) Math.sqrt((r7 * r7) + (r8 * r8)));
    }

    private final Matrix getAdapterMatrix(Matrix matrix) {
        Matrix matrix2 = new Matrix();
        matrix2.postConcat(this.matrixAdapter.getAdapterMatrix());
        matrix2.postConcat(matrix);
        matrix2.postConcat(MatrixExtKt.invert(this.matrixAdapter.getAdapterMatrix()));
        return matrix2;
    }

    private final void handleRotate(float f10, float f11) {
        PointF pointFMapPoint = PointUtils.INSTANCE.mapPoint(this.selectRectF.centerX(), this.selectRectF.centerY(), this.transformMatrix);
        this.singleMatrix.setRotate((float) Math.toDegrees(calculateRadians(f10 - pointFMapPoint.x, f11 - pointFMapPoint.y) - calculateRadians(this.firstX - pointFMapPoint.x, this.firstY - pointFMapPoint.y)), pointFMapPoint.x, pointFMapPoint.y);
    }

    private final void handleScale(float f10, float f11) {
        PointUtils pointUtils = PointUtils.INSTANCE;
        PointF pointFMapPoint = pointUtils.mapPoint(this.selectRectF.centerX(), this.selectRectF.centerY(), this.transformMatrix);
        RectF rectF = this.selectRectF;
        PointF pointFMapPoint2 = pointUtils.mapPoint(rectF.right, rectF.bottom, this.transformMatrix);
        float fCalculateScaleOffset = calculateScaleOffset(pointFMapPoint.x, pointFMapPoint.y, pointFMapPoint2.x, pointFMapPoint2.y, this.firstX, this.firstY, f10, f11);
        double d10 = 2;
        float fSqrt = (float) Math.sqrt(((float) Math.pow(pointFMapPoint.x - pointFMapPoint2.x, d10)) + ((float) Math.pow(pointFMapPoint.y - pointFMapPoint2.y, d10)));
        float f12 = fCalculateScaleOffset + fSqrt;
        float selectIconWidth = ((this.boardConfig.getSelectIconWidth() * fSqrt) * 2) / this.transformMatrix.mapRadius(Math.min(this.selectRectF.width(), this.selectRectF.height()));
        if (f12 < selectIconWidth) {
            f12 = selectIconWidth;
        }
        float f13 = f12 / fSqrt;
        this.singleMatrix.setScale(f13, f13, pointFMapPoint.x, pointFMapPoint.y);
    }

    private final void handleTranslate(float f10, float f11) {
        this.singleMatrix.setTranslate(f10 - this.firstX, f11 - this.firstY);
    }

    public static /* synthetic */ void showSelectRectF$default(BaseSelectFunction baseSelectFunction, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showSelectRectF");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        baseSelectFunction.showSelectRectF(z10);
    }

    public final BoardConfig getBoardConfig() {
        return this.boardConfig;
    }

    public final NewSelectFunctionMode getCurrentFunctionMode() {
        return this.currentFunctionMode;
    }

    public abstract List<NewSelectFunctionType> getCurrentFunctionTypeList();

    public final Matrix getCurrentMatrix() {
        Matrix matrix = new Matrix(this.transformMatrix);
        matrix.postConcat(this.singleMatrix);
        return matrix;
    }

    public final float getFirstX() {
        return this.firstX;
    }

    public final float getFirstY() {
        return this.firstY;
    }

    public final FunctionRectF getFunctionRectF() {
        return this.functionRectF;
    }

    public final boolean getFunctionRectFBySelectRectF(RectF functionRectF, RectF selectRectF, RectF limitRectF) {
        AbstractC9133u.m16133g(functionRectF, "functionRectF");
        AbstractC9133u.m16133g(selectRectF, "selectRectF");
        AbstractC9133u.m16133g(limitRectF, "limitRectF");
        float fWidth = selectRectF.left;
        float selectButtonHeight = selectRectF.bottom + 14.0f;
        if (selectButtonHeight > limitRectF.bottom - functionRectF.height()) {
            selectButtonHeight = (selectRectF.top - this.boardConfig.getSelectButtonHeight()) - 14.0f;
        }
        float f10 = limitRectF.top;
        if (selectButtonHeight < f10) {
            selectButtonHeight = f10;
        }
        boolean z10 = true;
        if (functionRectF.width() < limitRectF.width()) {
            float f11 = limitRectF.left;
            if (fWidth < f11) {
                fWidth = f11;
            } else if (fWidth > limitRectF.right - functionRectF.width()) {
                fWidth = limitRectF.right - functionRectF.width();
                z10 = false;
            }
        }
        functionRectF.left = fWidth;
        functionRectF.top = selectButtonHeight;
        functionRectF.right += fWidth;
        functionRectF.bottom += selectButtonHeight;
        return z10;
    }

    public final IGraphControl getGraphControl() {
        return this.graphControl;
    }

    public final RectF getLimitRectFInPage() {
        RectF pageRectF = this.graphControl.getPageRectF();
        RectF rectF = new RectF(pageRectF);
        if (this.boardConfig.getMoveActionConfig().isMoveActionEnable()) {
            RectF rectF2 = new RectF(0.0f, 0.0f, pageRectF.width() * this.boardConfig.getMoveActionConfig().getMaxWidthTimes(), pageRectF.height() * this.boardConfig.getMoveActionConfig().getMaxHeightTimes());
            this.matrixAdapter.getAdapterMatrix().mapRect(rectF2);
            rectF.intersect(rectF2);
        }
        return rectF;
    }

    public final IActionListener getListener() {
        return this.listener;
    }

    public final MatrixAdapter getMatrixAdapter() {
        return this.matrixAdapter;
    }

    public abstract RectF getMaxFunctionRectF();

    public final RectF getSelectFunctionRectF() {
        return this.selectFunctionRectF;
    }

    public final ArrayList<IGraph> getSelectGraphList() {
        return this.selectGraphList;
    }

    public final RectF getSelectRectF() {
        return this.selectRectF;
    }

    public final RectF getSelectRectFAfterTransform() {
        RectF rectF = new RectF(this.selectRectF);
        getCurrentMatrix().mapRect(rectF);
        return rectF;
    }

    public final Matrix getSingleMatrix() {
        return this.singleMatrix;
    }

    public final Matrix getTransformMatrix() {
        return this.transformMatrix;
    }

    public final PointF getTrianglePointF() {
        return this.trianglePointF;
    }

    public boolean handleClick(float f10, float f11) {
        return true;
    }

    public boolean handleDoubleClick(float f10, float f11) {
        return false;
    }

    public boolean handleMoveEnd(float f10, float f11) {
        NewSelectFunctionMode newSelectFunctionMode = this.currentFunctionMode;
        if (AbstractC9133u.m16128b(newSelectFunctionMode, NewSelectFunctionMode.Rotate.INSTANCE)) {
            handleRotate(f10, f11);
        } else if (AbstractC9133u.m16128b(newSelectFunctionMode, NewSelectFunctionMode.Scale.INSTANCE)) {
            handleScale(f10, f11);
        } else {
            if (!AbstractC9133u.m16128b(newSelectFunctionMode, NewSelectFunctionMode.Content.INSTANCE)) {
                return false;
            }
            handleTranslate(f10, f11);
        }
        this.transformMatrix.postConcat(this.singleMatrix);
        Matrix adapterMatrix = getAdapterMatrix(this.singleMatrix);
        this.singleMatrix.reset();
        this.graphControl.translationEnd(this.selectGraphList, adapterMatrix);
        this.isTransforming = false;
        showSelectRectF$default(this, false, 1, null);
        this.matrixList.add(MatrixExtKt.toEzyMatrix(adapterMatrix, System.currentTimeMillis()));
        this.listener.transformGraphEvent(this.selectGraphList, this.matrixList);
        this.listener.saveSnapshot();
        return true;
    }

    public boolean handleMoveStart(float f10, float f11) {
        return true;
    }

    public boolean handleMoving(float f10, float f11) {
        NewSelectFunctionMode newSelectFunctionMode = this.currentFunctionMode;
        if (AbstractC9133u.m16128b(newSelectFunctionMode, NewSelectFunctionMode.Rotate.INSTANCE)) {
            handleRotate(f10, f11);
        } else if (AbstractC9133u.m16128b(newSelectFunctionMode, NewSelectFunctionMode.Scale.INSTANCE)) {
            handleScale(f10, f11);
        } else {
            if (!AbstractC9133u.m16128b(newSelectFunctionMode, NewSelectFunctionMode.Content.INSTANCE)) {
                return false;
            }
            handleTranslate(f10, f11);
        }
        if (!this.isTransforming) {
            this.graphControl.selectCancel();
            this.graphControl.translationStart(this.selectGraphList);
            this.isTransforming = true;
        }
        Matrix adapterMatrix = getAdapterMatrix(this.singleMatrix);
        this.matrixList.add(MatrixExtKt.toEzyMatrix(adapterMatrix, System.currentTimeMillis()));
        this.graphControl.translation(this.selectGraphList, adapterMatrix);
        return true;
    }

    public void initForFunctionTouch() {
        this.singleMatrix.reset();
        this.matrixList.clear();
    }

    public abstract boolean isClickInSelectFunction(float f10, float f11);

    public final boolean isDirectionLeft() {
        return this.isDirectionLeft;
    }

    public void reset() {
        this.selectRectF.setEmpty();
        this.transformMatrix.reset();
        this.singleMatrix.reset();
        this.selectGraphList.clear();
        this.currentFunctionMode = NewSelectFunctionMode.Nothing.INSTANCE;
        this.trianglePointF = null;
    }

    public final void setCurrentFunctionMode(NewSelectFunctionMode newSelectFunctionMode) {
        AbstractC9133u.m16133g(newSelectFunctionMode, "<set-?>");
        this.currentFunctionMode = newSelectFunctionMode;
    }

    public final void setDirectionLeft(boolean z10) {
        this.isDirectionLeft = z10;
    }

    public final void setFirstPoint(float f10, float f11) {
        this.firstX = f10;
        this.firstY = f11;
    }

    public final void setFirstX(float f10) {
        this.firstX = f10;
    }

    public final void setFirstY(float f10) {
        this.firstY = f10;
    }

    public final void setFunctionRectF(FunctionRectF functionRectF) {
        AbstractC9133u.m16133g(functionRectF, "<set-?>");
        this.functionRectF = functionRectF;
    }

    public void setSelectGraphList(List<? extends IGraph> graphList) {
        AbstractC9133u.m16133g(graphList, "graphList");
        this.selectGraphList.clear();
        this.selectGraphList.addAll(graphList);
    }

    public final void setSelectRectF(RectF rectF) {
        AbstractC9133u.m16133g(rectF, "rectF");
        this.selectRectF.set(rectF);
    }

    public final void setSingleGraphData(RectF rectF, Matrix matrix, PointF pointF) {
        AbstractC9133u.m16133g(rectF, "rectF");
        AbstractC9133u.m16133g(matrix, "matrix");
        this.selectRectF.set(rectF);
        this.transformMatrix.set(matrix);
        this.trianglePointF = pointF;
    }

    public final void setTrianglePointF(PointF pointF) {
        this.trianglePointF = pointF;
    }

    public final void showSelectRectF(boolean z10) {
        if (z10) {
            this.selectFunctionRectF.set(getMaxFunctionRectF());
            this.isDirectionLeft = getFunctionRectFBySelectRectF(this.selectFunctionRectF, getSelectRectFAfterTransform(), getLimitRectFInPage());
            updateFunctionRectF();
        }
        PointF pointF = this.trianglePointF;
        this.graphControl.newSelect(this.selectRectF, getCurrentMatrix(), this.selectFunctionRectF, this.functionRectF, getCurrentFunctionTypeList(), pointF != null ? PointUtils.INSTANCE.mapPoint(pointF, getCurrentMatrix()) : null);
    }

    public abstract void updateFunctionRectF();
}
