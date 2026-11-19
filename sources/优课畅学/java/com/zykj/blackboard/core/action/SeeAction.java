package com.zykj.blackboard.core.action;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Log;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.bean.MoveActionConfig;
import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.listener.IAreaMoveListener;
import com.zykj.blackboard.utils.EventBus;
import com.zykj.blackboard.utils.EventKey;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.blackboard.utils.PointUtils;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzyTouchEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8778f0;

/* loaded from: classes4.dex */
public final class SeeAction extends BaseTouchAction {
    public static final Companion Companion = new Companion(null);
    private static final int FINGER_MODE_DEFAULT = 0;
    private static final int FINGER_MODE_DOUBLE = 2;
    private static final int FINGER_MODE_SINGLE = 1;
    private int fingerMode;
    private boolean isPlay;
    private final PointF firstPointF = new PointF();
    private final PointF firstMiddlePointF = new PointF();
    private float firstDistance = 1.0f;
    private EzyMatrix.Matrix originMatrix = EzyMatrix.Matrix.m8225l();
    private final Matrix tempMatrix = new Matrix();
    private final Matrix tempMatrix2 = new Matrix();
    private final List<EzyMatrix.Matrix> matrixList = new ArrayList();
    private final RectF configLimitRectF = new RectF();
    private final RectF limitRenderRectF = new RectF();
    private float minScale = 1.0f;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private Companion() {
        }
    }

    private final void addMatrixList(Matrix matrix, long j10) {
        this.matrixList.add(MatrixExtKt.toEzyMatrix(matrix, j10));
    }

    private final float calculateDegrees(PointF pointF, PointF pointF2) {
        return (float) Math.toDegrees(Math.atan2(pointF2.y - pointF.y, pointF2.x - pointF.x));
    }

    private final float calculateDistance(PointF pointF, PointF pointF2) {
        double d10 = 2;
        return (float) Math.sqrt(((float) Math.pow(pointF.x - pointF2.x, d10)) + ((float) Math.pow(pointF.y - pointF2.y, d10)));
    }

    private final Matrix calculateMatrixByTranslateProgress(Float f10, Float f11) {
        Float fValueOf;
        Float fValueOf2 = null;
        if (f10 != null) {
            float fFloatValue = f10.floatValue();
            RectF rectF = this.limitRenderRectF;
            fValueOf = Float.valueOf(rectF.right - (fFloatValue * rectF.width()));
        } else {
            fValueOf = null;
        }
        if (f11 != null) {
            float fFloatValue2 = f11.floatValue();
            RectF rectF2 = this.limitRenderRectF;
            fValueOf2 = Float.valueOf(rectF2.bottom - (fFloatValue2 * rectF2.height()));
        }
        Matrix matrix = this.tempMatrix;
        matrix.reset();
        if (fValueOf != null) {
            matrix.postTranslate(fValueOf.floatValue(), 0.0f);
        }
        if (fValueOf2 != null) {
            matrix.postTranslate(0.0f, fValueOf2.floatValue());
        }
        Matrix matrix2 = new Matrix();
        MatrixAdapter matrixAdapter = getMatrixAdapter();
        AbstractC9133u.m16130d(matrixAdapter);
        matrix2.postConcat(matrixAdapter.getScreenMatrix());
        matrix2.postConcat(this.tempMatrix);
        MatrixAdapter matrixAdapter2 = getMatrixAdapter();
        AbstractC9133u.m16130d(matrixAdapter2);
        matrix2.postConcat(MatrixExtKt.invert(matrixAdapter2.getScreenMatrix()));
        return matrix2;
    }

    private final PointF calculateMiddlePointF(PointF pointF, PointF pointF2) {
        PointF pointF3 = new PointF();
        float f10 = 2;
        pointF3.set((pointF.x + pointF2.x) / f10, (pointF.y + pointF2.y) / f10);
        return pointF3;
    }

    private final boolean checkMoveEnable() {
        BoardConfig boardConfig;
        MoveActionConfig moveActionConfig;
        return (this.isPlay || (boardConfig = getBoardConfig()) == null || (moveActionConfig = boardConfig.getMoveActionConfig()) == null || !moveActionConfig.isMoveActionEnable()) ? false : true;
    }

    private final PointF getRenderPointF(float f10, float f11) {
        if (getMatrixAdapter() == null) {
            return new PointF(f10, f11);
        }
        PointUtils pointUtils = PointUtils.INSTANCE;
        MatrixAdapter matrixAdapter = getMatrixAdapter();
        AbstractC9133u.m16130d(matrixAdapter);
        return pointUtils.mapPoint(f10, f11, matrixAdapter.getAdapterMatrix());
    }

    private final void handleMatrixDown() {
        IGraphControl graphControl = getGraphControl();
        if (graphControl != null) {
            graphControl.cameraChangeStart();
        }
        this.matrixList.clear();
    }

    private final void handleMatrixMove(Matrix matrix, long j10) {
        IGraphControl graphControl = getGraphControl();
        if (graphControl != null) {
            graphControl.cameraChanging(matrix);
        }
        addMatrixList(matrix, j10);
    }

    private final void handleMatrixUp(Matrix matrix, Long l10) {
        if (matrix != null) {
            this.matrixList.add(MatrixExtKt.toEzyMatrix(matrix, l10 != null ? l10.longValue() : System.currentTimeMillis()));
        }
        if (this.matrixList.isEmpty()) {
            IGraphControl graphControl = getGraphControl();
            if (graphControl != null) {
                IGraphControl.DefaultImpls.cameraChangeEnd$default(graphControl, null, 1, null);
                return;
            }
            return;
        }
        IGraphControl graphControl2 = getGraphControl();
        if (graphControl2 != null) {
            graphControl2.cameraChangeEnd(MatrixExtKt.toMatrix((EzyMatrix.Matrix) AbstractC8778f0.m14578x0(this.matrixList)));
        }
        saveData();
    }

    private final Matrix handleTranslation(EzyTouchEvent.TouchEvent touchEvent) {
        PointF renderPointF;
        PointF pointF;
        float fWidth;
        Matrix matrix;
        Matrix matrix2;
        MoveActionConfig moveActionConfig;
        MoveActionConfig moveActionConfig2;
        MoveActionConfig moveActionConfig3;
        int i10 = this.fingerMode;
        if (i10 == 1) {
            this.tempMatrix.reset();
            renderPointF = getRenderPointF(touchEvent.getX(), touchEvent.getY());
            pointF = this.firstPointF;
        } else {
            if (i10 != 2) {
                return null;
            }
            this.tempMatrix.reset();
            PointF renderPointF2 = getRenderPointF(touchEvent.m9085n(0).getX(), touchEvent.m9085n(0).getY());
            PointF renderPointF3 = getRenderPointF(touchEvent.m9085n(1).getX(), touchEvent.m9085n(1).getY());
            BoardConfig boardConfig = getBoardConfig();
            if (boardConfig != null && (moveActionConfig3 = boardConfig.getMoveActionConfig()) != null && moveActionConfig3.getScale()) {
                float fMax = Float.max(calculateDistance(renderPointF2, renderPointF3) / this.firstDistance, this.minScale);
                Matrix matrix3 = this.tempMatrix;
                PointF pointF2 = this.firstMiddlePointF;
                matrix3.postScale(fMax, fMax, pointF2.x, pointF2.y);
                initCalculateField(this.tempMatrix);
            }
            renderPointF = calculateMiddlePointF(renderPointF2, renderPointF3);
            pointF = this.firstMiddlePointF;
        }
        BoardConfig boardConfig2 = getBoardConfig();
        float f10 = 0.0f;
        if (boardConfig2 == null || (moveActionConfig2 = boardConfig2.getMoveActionConfig()) == null || !moveActionConfig2.getHorizontalTranslate()) {
            fWidth = 0.0f;
        } else {
            RectF rectF = this.limitRenderRectF;
            fWidth = rectF.left;
            float f11 = rectF.right;
            if (fWidth > f11) {
                IGraphControl graphControl = getGraphControl();
                AbstractC9133u.m16130d(graphControl);
                fWidth = ((graphControl.getPageRectF().width() - this.configLimitRectF.width()) / 2) - this.configLimitRectF.left;
            } else {
                float f12 = renderPointF.x - pointF.x;
                if (f12 >= fWidth) {
                    fWidth = f12 > f11 ? f11 : f12;
                }
            }
            this.tempMatrix.postTranslate(fWidth, 0.0f);
        }
        BoardConfig boardConfig3 = getBoardConfig();
        if (boardConfig3 != null && (moveActionConfig = boardConfig3.getMoveActionConfig()) != null && moveActionConfig.getVerticalTranslate()) {
            RectF rectF2 = this.limitRenderRectF;
            float fHeight = rectF2.top;
            float f13 = rectF2.bottom;
            if (fHeight > f13) {
                IGraphControl graphControl2 = getGraphControl();
                AbstractC9133u.m16130d(graphControl2);
                fHeight = ((graphControl2.getPageRectF().height() - this.configLimitRectF.height()) / 2) - this.configLimitRectF.top;
            } else {
                float f14 = renderPointF.y - pointF.y;
                if (f14 >= fHeight) {
                    fHeight = f14 > f13 ? f13 : f14;
                }
            }
            this.tempMatrix.postTranslate(0.0f, fHeight);
            f10 = fHeight;
        }
        onAreaMove(fWidth, f10);
        Matrix matrix4 = new Matrix();
        MatrixAdapter matrixAdapter = getMatrixAdapter();
        if (matrixAdapter == null || (matrix = matrixAdapter.getScreenMatrix()) == null) {
            matrix = new Matrix();
        }
        matrix4.postConcat(matrix);
        matrix4.postConcat(this.tempMatrix);
        MatrixAdapter matrixAdapter2 = getMatrixAdapter();
        if (matrixAdapter2 == null || (matrix2 = matrixAdapter2.getScreenMatrix()) == null) {
            matrix2 = new Matrix();
        }
        matrix4.postConcat(MatrixExtKt.invert(matrix2));
        return matrix4;
    }

    private final void initCalculateField(Matrix matrix) {
        Matrix matrix2;
        IGraphControl graphControl = getGraphControl();
        AbstractC9133u.m16130d(graphControl);
        RectF oldPageRectF = graphControl.getOldPageRectF();
        IGraphControl graphControl2 = getGraphControl();
        AbstractC9133u.m16130d(graphControl2);
        RectF pageRectF = graphControl2.getPageRectF();
        if (oldPageRectF.isEmpty()) {
            oldPageRectF = new RectF(pageRectF);
        }
        BoardConfig boardConfig = getBoardConfig();
        AbstractC9133u.m16130d(boardConfig);
        MoveActionConfig moveActionConfig = boardConfig.getMoveActionConfig();
        if (moveActionConfig.getMaxHeightTimes() < 1 || moveActionConfig.getMaxWidthTimes() < 1) {
            this.configLimitRectF.setEmpty();
            return;
        }
        this.configLimitRectF.set(0.0f, 0.0f, oldPageRectF.width() * moveActionConfig.getMaxWidthTimes(), oldPageRectF.height() * moveActionConfig.getMaxHeightTimes());
        MatrixAdapter matrixAdapter = getMatrixAdapter();
        if (matrixAdapter == null || (matrix2 = matrixAdapter.getAdapterMatrix()) == null) {
            matrix2 = new Matrix();
        }
        if (matrix != null) {
            matrix2.postConcat(matrix);
        }
        matrix2.mapRect(this.configLimitRectF);
        RectF rectF = this.limitRenderRectF;
        float f10 = pageRectF.right;
        RectF rectF2 = this.configLimitRectF;
        rectF.set(f10 - rectF2.right, pageRectF.bottom - rectF2.bottom, pageRectF.left - rectF2.left, pageRectF.top - rectF2.top);
        if (matrix == null) {
            this.minScale = Math.min(pageRectF.width() / this.configLimitRectF.width(), pageRectF.height() / this.configLimitRectF.height());
        }
        Log.i("MoveAction", "configRectF -> " + this.configLimitRectF);
        Log.i("MoveAction", "limitRenderRectF -> " + this.limitRenderRectF);
    }

    public static /* synthetic */ void initCalculateField$default(SeeAction seeAction, Matrix matrix, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            matrix = null;
        }
        seeAction.initCalculateField(matrix);
    }

    private final void initDataSaveField() {
        Matrix cameraMatrix;
        MatrixAdapter matrixAdapter = getMatrixAdapter();
        this.originMatrix = (matrixAdapter == null || (cameraMatrix = matrixAdapter.getCameraMatrix()) == null) ? null : MatrixExtKt.toEzyMatrix(cameraMatrix, System.currentTimeMillis());
    }

    private final void initDoubleDownField(EzyTouchEvent.TouchEvent touchEvent) {
        PointF renderPointF = getRenderPointF(touchEvent.m9085n(0).getX(), touchEvent.m9085n(0).getY());
        PointF renderPointF2 = getRenderPointF(touchEvent.m9085n(1).getX(), touchEvent.m9085n(1).getY());
        this.firstMiddlePointF.set(calculateMiddlePointF(renderPointF, renderPointF2));
        this.firstDistance = calculateDistance(renderPointF, renderPointF2);
    }

    private final void initSingleDownField(EzyTouchEvent.TouchEvent touchEvent) {
        this.firstPointF.set(getRenderPointF(touchEvent.getX(), touchEvent.getY()));
    }

    private final void notifyOtherAction() {
        EventBus eventBus = EventBus.INSTANCE;
        eventBus.post(EventKey.TEXT_ACTION_SELECTED_CANCEL);
        eventBus.post(EventKey.SELECT_ACTION_SELECTED_CANCEL);
    }

    private final void onAreaMove(float f10, float f11) {
        float fWidth;
        IAreaMoveListener areaMoveListener;
        MoveActionConfig moveActionConfig;
        MoveActionConfig moveActionConfig2;
        if (this.configLimitRectF.isEmpty()) {
            return;
        }
        float fHeight = 0.0f;
        if (this.limitRenderRectF.width() > 0.0f) {
            RectF rectF = this.limitRenderRectF;
            fWidth = (rectF.right - f10) / rectF.width();
        } else {
            fWidth = 0.0f;
        }
        if (this.limitRenderRectF.height() > 0.0f) {
            RectF rectF2 = this.limitRenderRectF;
            fHeight = (rectF2.bottom - f11) / rectF2.height();
        }
        IActionListener listener = getListener();
        if (listener == null || (areaMoveListener = listener.getAreaMoveListener()) == null) {
            return;
        }
        BoardConfig boardConfig = getBoardConfig();
        if (boardConfig != null && (moveActionConfig2 = boardConfig.getMoveActionConfig()) != null && moveActionConfig2.getHorizontalTranslate()) {
            areaMoveListener.onHorizontalMove(fWidth);
        }
        BoardConfig boardConfig2 = getBoardConfig();
        if (boardConfig2 == null || (moveActionConfig = boardConfig2.getMoveActionConfig()) == null || !moveActionConfig.getVerticalTranslate()) {
            return;
        }
        areaMoveListener.onVerticalMove(fHeight);
    }

    private final void saveData() {
        Matrix matrix;
        IActionListener listener = getListener();
        if (listener != null) {
            EzyMatrix.Matrix originMatrix = this.originMatrix;
            AbstractC9133u.m16132f(originMatrix, "originMatrix");
            MatrixAdapter matrixAdapter = getMatrixAdapter();
            if (matrixAdapter == null || (matrix = matrixAdapter.getCameraMatrix()) == null) {
                matrix = new Matrix();
            }
            listener.transformCameraEvent(originMatrix, MatrixExtKt.toEzyMatrix(matrix, 0L), this.matrixList);
        }
    }

    public final void areaMovEnd(Float f10, Float f11) {
        if (this.configLimitRectF.isEmpty()) {
            return;
        }
        handleMatrixUp(calculateMatrixByTranslateProgress(f10, f11), Long.valueOf(System.currentTimeMillis()));
    }

    public final void areaMoveStart() {
        initCalculateField$default(this, null, 1, null);
        if (this.configLimitRectF.isEmpty()) {
            return;
        }
        handleMatrixDown();
    }

    public final void areaMoving(Float f10, Float f11) {
        if (this.configLimitRectF.isEmpty()) {
            return;
        }
        handleMatrixMove(calculateMatrixByTranslateProgress(f10, f11), System.currentTimeMillis());
    }

    public final float getHorizontalProgress() {
        initCalculateField$default(this, null, 1, null);
        RectF rectF = this.limitRenderRectF;
        float f10 = rectF.right;
        if (f10 > rectF.left) {
            return f10 / rectF.width();
        }
        return 0.0f;
    }

    public final float getVerticalProgress() {
        initCalculateField$default(this, null, 1, null);
        RectF rectF = this.limitRenderRectF;
        float f10 = rectF.bottom;
        if (f10 > rectF.top) {
            return f10 / rectF.height();
        }
        return 0.0f;
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, com.zykj.blackboard.core.action.ITouchAction
    public void onTouchDown(EzyTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
        super.onTouchDown(event);
        this.fingerMode = 1;
        if (checkMoveEnable()) {
            notifyOtherAction();
            initCalculateField$default(this, null, 1, null);
            initSingleDownField(event);
            initDataSaveField();
            handleMatrixDown();
        }
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, com.zykj.blackboard.core.action.ITouchAction
    public void onTouchMove(EzyTouchEvent.TouchEvent event) {
        Matrix matrixHandleTranslation;
        AbstractC9133u.m16133g(event, "event");
        super.onTouchMove(event);
        if (checkMoveEnable() && (matrixHandleTranslation = handleTranslation(event)) != null) {
            handleMatrixMove(matrixHandleTranslation, event.getEventTime());
        }
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, com.zykj.blackboard.core.action.ITouchAction
    public void onTouchPointerDown(EzyTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
        super.onTouchPointerDown(event);
        this.fingerMode = 2;
        if (checkMoveEnable()) {
            initDoubleDownField(event);
        }
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, com.zykj.blackboard.core.action.ITouchAction
    public void onTouchPointerUp(EzyTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
        super.onTouchPointerUp(event);
        this.fingerMode = 0;
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, com.zykj.blackboard.core.action.ITouchAction
    public void onTouchUp(EzyTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
        super.onTouchUp(event);
        this.fingerMode = 0;
        if (checkMoveEnable()) {
            handleMatrixUp(handleTranslation(event), Long.valueOf(event.getEventTime()));
        }
    }

    @Override // com.zykj.blackboard.core.action.ITouchAction
    public void reset() {
        this.tempMatrix.reset();
        this.matrixList.clear();
        this.fingerMode = 0;
        this.firstPointF.set(0.0f, 0.0f);
        this.firstDistance = 1.0f;
        this.firstMiddlePointF.set(0.0f, 0.0f);
    }

    public final void setPlay(boolean z10) {
        this.isPlay = z10;
    }
}
