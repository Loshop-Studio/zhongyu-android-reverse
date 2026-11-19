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
import com.zykj.blackboard.utils.EventConvert;
import com.zykj.blackboard.utils.EventKey;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.blackboard.utils.PointUtils;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzyTouchEvent;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;

/* loaded from: classes4.dex */
public abstract class MoveAction extends BaseTouchAction {
    public static final Companion Companion = new Companion(null);
    private static final int DOUBLE_CHECK_TIME = 48;
    private static final int FINGER_MODE_DEFAULT = 0;
    private static final int FINGER_MODE_DOUBLE = 2;
    private static final int FINGER_MODE_SINGLE = 1;
    private int fingerMode;
    private long firstTouchDownTime;
    private boolean isAreaMoving;
    private final ArrayList<EzyMatrix.Matrix> matrixList = new ArrayList<>();
    private final Matrix tempMatrix = new Matrix();
    private final Matrix tempMatrix2 = new Matrix();
    private final PointF firstMiddlePointF = new PointF();
    private EzyMatrix.Matrix originMatrix = EzyMatrix.Matrix.m8225l();
    private final RectF configLimitRectF = new RectF();
    private final RectF limitRenderRectF = new RectF();

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private Companion() {
        }
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

    private final void doubleTouchDown(EzyTouchEvent.TouchEvent touchEvent) {
        Matrix cameraMatrix;
        EzyMatrix.Matrix ezyMatrix;
        IAreaMoveListener areaMoveListener;
        IActionListener listener = getListener();
        if (listener != null && (areaMoveListener = listener.getAreaMoveListener()) != null) {
            areaMoveListener.onMoveStart();
        }
        this.firstMiddlePointF.set(calculateMiddlePointF(getRenderPointF(touchEvent.m9085n(0).getX(), touchEvent.m9085n(0).getY()), getRenderPointF(touchEvent.m9085n(1).getX(), touchEvent.m9085n(1).getY())));
        initCalculateField();
        MatrixAdapter matrixAdapter = getMatrixAdapter();
        if (matrixAdapter != null && (cameraMatrix = matrixAdapter.getCameraMatrix()) != null && (ezyMatrix = MatrixExtKt.toEzyMatrix(cameraMatrix, System.currentTimeMillis())) != null) {
            this.originMatrix = ezyMatrix;
        }
        handleMatrixDown();
    }

    private final void doubleTouchMove(EzyTouchEvent.TouchEvent touchEvent) {
        Matrix matrixHandleTranslation = handleTranslation(touchEvent);
        if (matrixHandleTranslation != null) {
            handleMatrixMove(matrixHandleTranslation, touchEvent.getEventTime());
        }
    }

    private final void doubleTouchUp(EzyTouchEvent.TouchEvent touchEvent) {
        IAreaMoveListener areaMoveListener;
        handleMatrixUp(handleTranslation(touchEvent), Long.valueOf(touchEvent.getEventTime()));
        IActionListener listener = getListener();
        if (listener == null || (areaMoveListener = listener.getAreaMoveListener()) == null) {
            return;
        }
        areaMoveListener.onMoveEnd();
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
        this.matrixList.clear();
        IGraphControl graphControl = getGraphControl();
        if (graphControl != null) {
            graphControl.cameraChangeStart();
        }
    }

    private final void handleMatrixMove(Matrix matrix, long j10) {
        this.matrixList.add(MatrixExtKt.toEzyMatrix(matrix, j10));
        IGraphControl graphControl = getGraphControl();
        if (graphControl != null) {
            graphControl.cameraChanging(matrix);
        }
    }

    private final void handleMatrixUp(Matrix matrix, Long l10) {
        Matrix matrix2;
        if (matrix != null) {
            ArrayList<EzyMatrix.Matrix> arrayList = this.matrixList;
            AbstractC9133u.m16130d(l10);
            arrayList.add(MatrixExtKt.toEzyMatrix(matrix, l10.longValue()));
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
        EventBus.INSTANCE.post(EventKey.DELETE_ACTION);
        IActionListener listener = getListener();
        if (listener != null) {
            EzyMatrix.Matrix originMatrix = this.originMatrix;
            AbstractC9133u.m16132f(originMatrix, "originMatrix");
            MatrixAdapter matrixAdapter = getMatrixAdapter();
            if (matrixAdapter == null || (matrix2 = matrixAdapter.getCameraMatrix()) == null) {
                matrix2 = new Matrix();
            }
            listener.transformCameraEvent(originMatrix, MatrixExtKt.toEzyMatrix(matrix2, 0L), this.matrixList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.graphics.Matrix handleTranslation(com.zykj.board.EzyTouchEvent.TouchEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getPointerCoordsCount()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L9
            return r1
        L9:
            com.zykj.blackboard.bean.BoardConfig r0 = r8.getBoardConfig()
            if (r0 == 0) goto Ld9
            com.zykj.blackboard.bean.MoveActionConfig r0 = r0.getMoveActionConfig()
            if (r0 == 0) goto Ld9
            r3 = 0
            com.zykj.board.EzyTouchEvent$TouchEvent$PointerCoords r4 = r9.m9085n(r3)
            float r4 = r4.getX()
            com.zykj.board.EzyTouchEvent$TouchEvent$PointerCoords r3 = r9.m9085n(r3)
            float r3 = r3.getY()
            android.graphics.PointF r3 = r8.getRenderPointF(r4, r3)
            com.zykj.board.EzyTouchEvent$TouchEvent$PointerCoords r4 = r9.m9085n(r2)
            float r4 = r4.getX()
            com.zykj.board.EzyTouchEvent$TouchEvent$PointerCoords r9 = r9.m9085n(r2)
            float r9 = r9.getY()
            android.graphics.PointF r9 = r8.getRenderPointF(r4, r9)
            android.graphics.Matrix r2 = r8.tempMatrix
            r2.reset()
            boolean r2 = r0.getHorizontalTranslate()
            r4 = 0
            if (r2 == 0) goto L76
            android.graphics.RectF r2 = r8.limitRenderRectF
            float r5 = r2.left
            float r2 = r2.right
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 >= 0) goto L76
            android.graphics.PointF r1 = r8.calculateMiddlePointF(r3, r9)
            float r2 = r1.x
            android.graphics.PointF r5 = r8.firstMiddlePointF
            float r5 = r5.x
            float r2 = r2 - r5
            android.graphics.RectF r5 = r8.limitRenderRectF
            float r6 = r5.left
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 >= 0) goto L69
            r2 = r6
            goto L70
        L69:
            float r5 = r5.right
            int r6 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r6 <= 0) goto L70
            r2 = r5
        L70:
            android.graphics.Matrix r5 = r8.tempMatrix
            r5.postTranslate(r2, r4)
            goto L77
        L76:
            r2 = r4
        L77:
            boolean r0 = r0.getVerticalTranslate()
            if (r0 == 0) goto Lab
            android.graphics.RectF r0 = r8.limitRenderRectF
            float r5 = r0.top
            float r0 = r0.bottom
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto Lab
            if (r1 != 0) goto L8d
            android.graphics.PointF r1 = r8.calculateMiddlePointF(r3, r9)
        L8d:
            float r9 = r1.y
            android.graphics.PointF r0 = r8.firstMiddlePointF
            float r0 = r0.y
            float r9 = r9 - r0
            android.graphics.RectF r0 = r8.limitRenderRectF
            float r1 = r0.top
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 >= 0) goto L9e
            r9 = r1
            goto La5
        L9e:
            float r0 = r0.bottom
            int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r1 <= 0) goto La5
            r9 = r0
        La5:
            android.graphics.Matrix r0 = r8.tempMatrix
            r0.postTranslate(r4, r9)
            r4 = r9
        Lab:
            r8.onAreaMove(r2, r4)
            android.graphics.Matrix r9 = new android.graphics.Matrix
            r9.<init>()
            com.zykj.blackboard.core.canvas.MatrixAdapter r0 = r8.getMatrixAdapter()
            kotlin.jvm.internal.AbstractC9133u.m16130d(r0)
            android.graphics.Matrix r0 = r0.getScreenMatrix()
            r9.postConcat(r0)
            android.graphics.Matrix r0 = r8.tempMatrix
            r9.postConcat(r0)
            com.zykj.blackboard.core.canvas.MatrixAdapter r0 = r8.getMatrixAdapter()
            kotlin.jvm.internal.AbstractC9133u.m16130d(r0)
            android.graphics.Matrix r0 = r0.getScreenMatrix()
            android.graphics.Matrix r0 = com.zykj.blackboard.utils.MatrixExtKt.invert(r0)
            r9.postConcat(r0)
            return r9
        Ld9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.action.MoveAction.handleTranslation(com.zykj.board.EzyTouchEvent$TouchEvent):android.graphics.Matrix"); // DEX body: android/优课畅学/smali_classes4/com/zykj/blackboard/core/action/MoveAction.smali:1118
    }

    private final void initCalculateField() {
        Matrix matrix;
        IGraphControl graphControl = getGraphControl();
        AbstractC9133u.m16130d(graphControl);
        RectF pageRectF = graphControl.getPageRectF();
        BoardConfig boardConfig = getBoardConfig();
        AbstractC9133u.m16130d(boardConfig);
        MoveActionConfig moveActionConfig = boardConfig.getMoveActionConfig();
        if (moveActionConfig.getMaxHeightTimes() < 1 || moveActionConfig.getMaxWidthTimes() < 1) {
            this.configLimitRectF.setEmpty();
            return;
        }
        this.configLimitRectF.set(0.0f, 0.0f, pageRectF.width() * moveActionConfig.getMaxWidthTimes(), pageRectF.height() * moveActionConfig.getMaxHeightTimes());
        MatrixAdapter matrixAdapter = getMatrixAdapter();
        if (matrixAdapter == null || (matrix = matrixAdapter.getCameraMatrix()) == null) {
            matrix = new Matrix();
        }
        matrix.mapRect(this.configLimitRectF);
        RectF rectF = this.limitRenderRectF;
        float f10 = pageRectF.right;
        RectF rectF2 = this.configLimitRectF;
        rectF.set(f10 - rectF2.right, pageRectF.bottom - rectF2.bottom, pageRectF.left - rectF2.left, pageRectF.top - rectF2.top);
        Log.i("MoveAction", "configRectF -> " + this.configLimitRectF);
        Log.i("MoveAction", "limitRenderRectF -> " + this.limitRenderRectF);
    }

    private final boolean isQuickDoubleTouchDown() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.firstTouchDownTime;
        Log.i("MoveAction", "time -> " + jCurrentTimeMillis);
        return jCurrentTimeMillis <= 48;
    }

    private final void onAreaMove(float f10, float f11) {
        float fWidth;
        IAreaMoveListener areaMoveListener;
        MoveActionConfig moveActionConfig;
        MoveActionConfig moveActionConfig2;
        if (this.configLimitRectF.isEmpty()) {
            return;
        }
        Log.i("MoveAction", "horizontal->" + f10 + "  vertical->" + f11);
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

    public final void areaMovEnd(Float f10, Float f11) {
        if (!this.configLimitRectF.isEmpty()) {
            handleMatrixUp(calculateMatrixByTranslateProgress(f10, f11), Long.valueOf(System.currentTimeMillis()));
        }
        this.isAreaMoving = false;
    }

    public final void areaMoveStart() {
        Matrix cameraMatrix;
        EzyMatrix.Matrix ezyMatrix;
        this.isAreaMoving = true;
        initCalculateField();
        MatrixAdapter matrixAdapter = getMatrixAdapter();
        if (matrixAdapter != null && (cameraMatrix = matrixAdapter.getCameraMatrix()) != null && (ezyMatrix = MatrixExtKt.toEzyMatrix(cameraMatrix, System.currentTimeMillis())) != null) {
            this.originMatrix = ezyMatrix;
        }
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
        initCalculateField();
        if (this.configLimitRectF.isEmpty() || this.limitRenderRectF.width() <= 0.0f) {
            return 0.0f;
        }
        RectF rectF = this.limitRenderRectF;
        return rectF.right / rectF.width();
    }

    public final float getVerticalProgress() {
        initCalculateField();
        if (this.configLimitRectF.isEmpty() || this.limitRenderRectF.height() <= 0.0f) {
            return 0.0f;
        }
        RectF rectF = this.limitRenderRectF;
        return rectF.bottom / rectF.height();
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, com.zykj.blackboard.core.action.ITouchAction
    public void onTouchDown(EzyTouchEvent.TouchEvent event) {
        Matrix adapterMatrix;
        AbstractC9133u.m16133g(event, "event");
        super.onTouchDown(event);
        if (this.fingerMode == 2) {
            MatrixAdapter matrixAdapter = getMatrixAdapter();
            Matrix matrix = null;
            Matrix adapterMatrix2 = matrixAdapter != null ? matrixAdapter.getAdapterMatrix() : null;
            doubleTouchUp(event);
            MatrixAdapter matrixAdapter2 = getMatrixAdapter();
            Matrix matrixInvert = (matrixAdapter2 == null || (adapterMatrix = matrixAdapter2.getAdapterMatrix()) == null) ? null : MatrixExtKt.invert(adapterMatrix);
            EventConvert eventConvert = EventConvert.INSTANCE;
            if (adapterMatrix2 != null) {
                adapterMatrix2.postConcat(matrixInvert);
                C8736p c8736p = C8736p.f16368a;
                matrix = adapterMatrix2;
            }
            event = eventConvert.updateTouchEventByNewMatrix(event, matrix);
        }
        this.fingerMode = 1;
        this.firstTouchDownTime = System.currentTimeMillis();
        singleTouchDown(event);
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, com.zykj.blackboard.core.action.ITouchAction
    public void onTouchMove(EzyTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
        super.onTouchMove(event);
        int i10 = this.fingerMode;
        if (i10 == 1) {
            singleTouchMove(event);
        } else {
            if (i10 != 2) {
                return;
            }
            doubleTouchMove(event);
        }
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, com.zykj.blackboard.core.action.ITouchAction
    public void onTouchPointerDown(EzyTouchEvent.TouchEvent event) {
        MoveActionConfig moveActionConfig;
        AbstractC9133u.m16133g(event, "event");
        super.onTouchPointerDown(event);
        BoardConfig boardConfig = getBoardConfig();
        if (boardConfig == null || (moveActionConfig = boardConfig.getMoveActionConfig()) == null || !moveActionConfig.isMoveActionEnable() || this.isAreaMoving || this.fingerMode != 1) {
            return;
        }
        this.fingerMode = 2;
        if (isQuickDoubleTouchDown()) {
            singleTouchCancel(event);
        } else {
            singleTouchUp(event);
        }
        doubleTouchDown(event);
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, com.zykj.blackboard.core.action.ITouchAction
    public void onTouchPointerUp(EzyTouchEvent.TouchEvent event) {
        MoveActionConfig moveActionConfig;
        AbstractC9133u.m16133g(event, "event");
        super.onTouchPointerUp(event);
        BoardConfig boardConfig = getBoardConfig();
        if (boardConfig == null || (moveActionConfig = boardConfig.getMoveActionConfig()) == null || !moveActionConfig.isMoveActionEnable() || this.fingerMode != 2) {
            return;
        }
        this.fingerMode = 0;
        doubleTouchUp(event);
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, com.zykj.blackboard.core.action.ITouchAction
    public void onTouchUp(EzyTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
        super.onTouchUp(event);
        if (this.fingerMode == 1) {
            singleTouchUp(event);
        }
    }

    @Override // com.zykj.blackboard.core.action.ITouchAction
    public void reset() {
        this.tempMatrix.reset();
        this.matrixList.clear();
    }

    public abstract void singleTouchCancel(EzyTouchEvent.TouchEvent touchEvent);

    public abstract void singleTouchDown(EzyTouchEvent.TouchEvent touchEvent);

    public abstract void singleTouchMove(EzyTouchEvent.TouchEvent touchEvent);

    public abstract void singleTouchUp(EzyTouchEvent.TouchEvent touchEvent);
}
