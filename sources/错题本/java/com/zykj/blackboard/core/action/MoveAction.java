package com.zykj.blackboard.core.action;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Log;
import androidx.core.app.NotificationCompat;
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
import com.zykj.board.EzyMatrix$Matrix;
import com.zykj.board.EzyTouchEvent$TouchEvent;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 U2\u00020\u0001:\u0001UB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0017H\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020!2\u0006\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020!H\u0002¢\u0006\u0004\b&\u0010'J#\u0010*\u001a\u00020\f2\b\u0010(\u001a\u0004\u0018\u00010\u00172\b\u0010)\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b,\u0010\bJ\u0017\u0010-\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b-\u0010\bJ\u0017\u0010.\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b.\u0010\bJ\u0017\u0010/\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b/\u0010\bJ\u0017\u00100\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b0\u0010\bJ\u0017\u00101\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b1\u0010\bJ\u0017\u00102\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b2\u0010\bJ\u0017\u00103\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b3\u0010\bJ\u0017\u00104\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b4\u0010\bJ\u000f\u00105\u001a\u00020\u0006H\u0016¢\u0006\u0004\b5\u0010\u0003J\r\u00106\u001a\u00020\u0006¢\u0006\u0004\b6\u0010\u0003J!\u00107\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010\u00172\b\u0010)\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b7\u00108J!\u00109\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010\u00172\b\u0010)\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b9\u00108J\r\u0010:\u001a\u00020\u0017¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u0017¢\u0006\u0004\b<\u0010;R$\u0010@\u001a\u0012\u0012\u0004\u0012\u00020>0=j\b\u0012\u0004\u0012\u00020>`?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010CR\u0014\u0010E\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010H\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010J\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u001e\u0010M\u001a\n L*\u0004\u0018\u00010>0>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010QR\u0016\u0010S\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010T¨\u0006V"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/MoveAction;", "Lcom/zykj/blackboard/core/action/BaseTouchAction;", "<init>", "()V", "Lcom/zykj/board/EzyTouchEvent$TouchEvent;", NotificationCompat.CATEGORY_EVENT, "Ld6/s;", "doubleTouchDown", "(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V", "initCalculateField", "doubleTouchMove", "doubleTouchUp", "Landroid/graphics/Matrix;", "handleTranslation", "(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Landroid/graphics/Matrix;", "handleMatrixDown", "matrix", "", "time", "handleMatrixMove", "(Landroid/graphics/Matrix;J)V", "handleMatrixUp", "(Landroid/graphics/Matrix;Ljava/lang/Long;)V", "", "horizontal", "vertical", "onAreaMove", "(FF)V", "", "isQuickDoubleTouchDown", "()Z", "x", "y", "Landroid/graphics/PointF;", "getRenderPointF", "(FF)Landroid/graphics/PointF;", "pointF1", "pointF2", "calculateMiddlePointF", "(Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/graphics/PointF;", "horizontalProgress", "verticalProgress", "calculateMatrixByTranslateProgress", "(Ljava/lang/Float;Ljava/lang/Float;)Landroid/graphics/Matrix;", "singleTouchDown", "singleTouchMove", "singleTouchUp", "singleTouchCancel", "onTouchDown", "onTouchPointerDown", "onTouchMove", "onTouchPointerUp", "onTouchUp", "reset", "areaMoveStart", "areaMoving", "(Ljava/lang/Float;Ljava/lang/Float;)V", "areaMovEnd", "getVerticalProgress", "()F", "getHorizontalProgress", "Ljava/util/ArrayList;", "Lcom/zykj/board/EzyMatrix$Matrix;", "Lkotlin/collections/ArrayList;", "matrixList", "Ljava/util/ArrayList;", "tempMatrix", "Landroid/graphics/Matrix;", "tempMatrix2", "firstMiddlePointF", "Landroid/graphics/PointF;", "", "fingerMode", "I", "firstTouchDownTime", "J", "kotlin.jvm.PlatformType", "originMatrix", "Lcom/zykj/board/EzyMatrix$Matrix;", "Landroid/graphics/RectF;", "configLimitRectF", "Landroid/graphics/RectF;", "limitRenderRectF", "isAreaMoving", "Z", "Companion", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = 48)
/* loaded from: classes3.dex */
public abstract class MoveAction extends BaseTouchAction {
    private static final int DOUBLE_CHECK_TIME = 48;
    private static final int FINGER_MODE_DEFAULT = 0;
    private static final int FINGER_MODE_DOUBLE = 2;
    private static final int FINGER_MODE_SINGLE = 1;
    private int fingerMode;
    private long firstTouchDownTime;
    private boolean isAreaMoving;

    @NotNull
    private final ArrayList<EzyMatrix$Matrix> matrixList = new ArrayList<>();

    @NotNull
    private final Matrix tempMatrix = new Matrix();

    @NotNull
    private final Matrix tempMatrix2 = new Matrix();

    @NotNull
    private final PointF firstMiddlePointF = new PointF();
    private EzyMatrix$Matrix originMatrix = EzyMatrix$Matrix.getDefaultInstance();

    @NotNull
    private final RectF configLimitRectF = new RectF();

    @NotNull
    private final RectF limitRenderRectF = new RectF();

    private final Matrix calculateMatrixByTranslateProgress(Float horizontalProgress, Float verticalProgress) {
        Float fValueOf;
        Float fValueOf2 = null;
        if (horizontalProgress != null) {
            float fFloatValue = horizontalProgress.floatValue();
            RectF rectF = this.limitRenderRectF;
            fValueOf = Float.valueOf(rectF.right - (rectF.width() * fFloatValue));
        } else {
            fValueOf = null;
        }
        if (verticalProgress != null) {
            float fFloatValue2 = verticalProgress.floatValue();
            RectF rectF2 = this.limitRenderRectF;
            fValueOf2 = Float.valueOf(rectF2.bottom - (rectF2.height() * fFloatValue2));
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
        AbstractC5830k.m5327d(matrixAdapter);
        matrix2.postConcat(matrixAdapter.getScreenMatrix());
        matrix2.postConcat(this.tempMatrix);
        MatrixAdapter matrixAdapter2 = getMatrixAdapter();
        AbstractC5830k.m5327d(matrixAdapter2);
        matrix2.postConcat(MatrixExtKt.invert(matrixAdapter2.getScreenMatrix()));
        return matrix2;
    }

    private final PointF calculateMiddlePointF(PointF pointF1, PointF pointF2) {
        PointF pointF = new PointF();
        float f = 2;
        pointF.set((pointF1.x + pointF2.x) / f, (pointF1.y + pointF2.y) / f);
        return pointF;
    }

    private final void doubleTouchDown(EzyTouchEvent$TouchEvent event) {
        Matrix cameraMatrix;
        EzyMatrix$Matrix ezyMatrix;
        IAreaMoveListener areaMoveListener;
        IActionListener listener = getListener();
        if (listener != null && (areaMoveListener = listener.getAreaMoveListener()) != null) {
            areaMoveListener.onMoveStart();
        }
        this.firstMiddlePointF.set(calculateMiddlePointF(getRenderPointF(event.getPointerCoords(0).getX(), event.getPointerCoords(0).getY()), getRenderPointF(event.getPointerCoords(1).getX(), event.getPointerCoords(1).getY())));
        initCalculateField();
        MatrixAdapter matrixAdapter = getMatrixAdapter();
        if (matrixAdapter != null && (cameraMatrix = matrixAdapter.getCameraMatrix()) != null && (ezyMatrix = MatrixExtKt.toEzyMatrix(cameraMatrix, System.currentTimeMillis())) != null) {
            this.originMatrix = ezyMatrix;
        }
        handleMatrixDown();
    }

    private final void doubleTouchMove(EzyTouchEvent$TouchEvent event) {
        Matrix matrixHandleTranslation = handleTranslation(event);
        if (matrixHandleTranslation != null) {
            handleMatrixMove(matrixHandleTranslation, event.getEventTime());
        }
    }

    private final void doubleTouchUp(EzyTouchEvent$TouchEvent event) {
        IAreaMoveListener areaMoveListener;
        handleMatrixUp(handleTranslation(event), Long.valueOf(event.getEventTime()));
        IActionListener listener = getListener();
        if (listener == null || (areaMoveListener = listener.getAreaMoveListener()) == null) {
            return;
        }
        areaMoveListener.onMoveEnd();
    }

    private final PointF getRenderPointF(float x3, float y2) {
        if (getMatrixAdapter() == null) {
            return new PointF(x3, y2);
        }
        PointUtils pointUtils = PointUtils.INSTANCE;
        MatrixAdapter matrixAdapter = getMatrixAdapter();
        AbstractC5830k.m5327d(matrixAdapter);
        return pointUtils.mapPoint(x3, y2, matrixAdapter.getAdapterMatrix());
    }

    private final void handleMatrixDown() {
        this.matrixList.clear();
        IGraphControl graphControl = getGraphControl();
        if (graphControl != null) {
            graphControl.cameraChangeStart();
        }
    }

    private final void handleMatrixMove(Matrix matrix, long time) {
        this.matrixList.add(MatrixExtKt.toEzyMatrix(matrix, time));
        IGraphControl graphControl = getGraphControl();
        if (graphControl != null) {
            graphControl.cameraChanging(matrix);
        }
    }

    private final void handleMatrixUp(Matrix matrix, Long time) {
        Matrix matrix2;
        if (matrix != null) {
            ArrayList<EzyMatrix$Matrix> arrayList = this.matrixList;
            AbstractC5830k.m5327d(time);
            arrayList.add(MatrixExtKt.toEzyMatrix(matrix, time.longValue()));
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
            graphControl2.cameraChangeEnd(MatrixExtKt.toMatrix((EzyMatrix$Matrix) AbstractC5805t.m5235o0(this.matrixList)));
        }
        EventBus.INSTANCE.post(EventKey.DELETE_ACTION);
        IActionListener listener = getListener();
        if (listener != null) {
            EzyMatrix$Matrix originMatrix = this.originMatrix;
            AbstractC5830k.m5329f(originMatrix, "originMatrix");
            MatrixAdapter matrixAdapter = getMatrixAdapter();
            if (matrixAdapter == null || (matrix2 = matrixAdapter.getCameraMatrix()) == null) {
                matrix2 = new Matrix();
            }
            listener.transformCameraEvent(originMatrix, MatrixExtKt.toEzyMatrix(matrix2, 0L), this.matrixList);
        }
    }

    // Writing mode pans from the original two-finger midpoint, independent of the span.
    private final Matrix handleTranslation(EzyTouchEvent$TouchEvent event) {
        BoardConfig board = getBoardConfig();
        if (event.getPointerCoordsCount() == 1 || board == null || board.getMoveActionConfig() == null) {
            return null;
        }
        MoveActionConfig config = board.getMoveActionConfig();
        PointF a = getRenderPointF(event.getPointerCoords(0).getX(), event.getPointerCoords(0).getY());
        PointF b = getRenderPointF(event.getPointerCoords(1).getX(), event.getPointerCoords(1).getY());
        PointF midpoint = calculateMiddlePointF(a, b);
        RectF limits = this.limitRenderRectF;
        float dx = 0f;
        float dy = 0f;
        this.tempMatrix.reset();
        if (config.getHorizontalTranslate() && limits.left < limits.right) {
            dx = Math.max(limits.left, Math.min(limits.right, midpoint.x - this.firstMiddlePointF.x));
            this.tempMatrix.postTranslate(dx, 0f);
        }
        if (config.getVerticalTranslate() && limits.top < limits.bottom) {
            dy = Math.max(limits.top, Math.min(limits.bottom, midpoint.y - this.firstMiddlePointF.y));
            this.tempMatrix.postTranslate(0f, dy);
        }
        onAreaMove(dx, dy);
        Matrix result = new Matrix();
        Matrix screen = getMatrixAdapter().getScreenMatrix();
        result.postConcat(screen);
        result.postConcat(this.tempMatrix);
        result.postConcat(MatrixExtKt.invert(screen));
        return result;
    }

    private final void initCalculateField() {
        Matrix matrix;
        IGraphControl graphControl = getGraphControl();
        AbstractC5830k.m5327d(graphControl);
        RectF pageRectF = graphControl.getPageRectF();
        BoardConfig boardConfig = getBoardConfig();
        AbstractC5830k.m5327d(boardConfig);
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
        float f = pageRectF.right;
        RectF rectF2 = this.configLimitRectF;
        rectF.set(f - rectF2.right, pageRectF.bottom - rectF2.bottom, pageRectF.left - rectF2.left, pageRectF.top - rectF2.top);
        Log.i("MoveAction", "configRectF -> " + this.configLimitRectF);
        Log.i("MoveAction", "limitRenderRectF -> " + this.limitRenderRectF);
    }

    private final boolean isQuickDoubleTouchDown() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.firstTouchDownTime;
        Log.i("MoveAction", "time -> " + jCurrentTimeMillis);
        return jCurrentTimeMillis <= 48;
    }

    private final void onAreaMove(float horizontal, float vertical) {
        float fWidth;
        IAreaMoveListener areaMoveListener;
        MoveActionConfig moveActionConfig;
        MoveActionConfig moveActionConfig2;
        if (this.configLimitRectF.isEmpty()) {
            return;
        }
        Log.i("MoveAction", "horizontal->" + horizontal + "  vertical->" + vertical);
        float fHeight = 0.0f;
        if (this.limitRenderRectF.width() > 0.0f) {
            RectF rectF = this.limitRenderRectF;
            fWidth = (rectF.right - horizontal) / rectF.width();
        } else {
            fWidth = 0.0f;
        }
        if (this.limitRenderRectF.height() > 0.0f) {
            RectF rectF2 = this.limitRenderRectF;
            fHeight = (rectF2.bottom - vertical) / rectF2.height();
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

    public final void areaMovEnd(@Nullable Float horizontalProgress, @Nullable Float verticalProgress) {
        if (!this.configLimitRectF.isEmpty()) {
            handleMatrixUp(calculateMatrixByTranslateProgress(horizontalProgress, verticalProgress), Long.valueOf(System.currentTimeMillis()));
        }
        this.isAreaMoving = false;
    }

    public final void areaMoveStart() {
        Matrix cameraMatrix;
        EzyMatrix$Matrix ezyMatrix;
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

    public final void areaMoving(@Nullable Float horizontalProgress, @Nullable Float verticalProgress) {
        if (this.configLimitRectF.isEmpty()) {
            return;
        }
        handleMatrixMove(calculateMatrixByTranslateProgress(horizontalProgress, verticalProgress), System.currentTimeMillis());
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
    public void onTouchDown(@NotNull EzyTouchEvent$TouchEvent event) {
        Matrix adapterMatrix;
        AbstractC5830k.m5330g(event, "event");
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
                matrix = adapterMatrix2;
            }
            event = eventConvert.updateTouchEventByNewMatrix(event, matrix);
        }
        this.fingerMode = 1;
        this.firstTouchDownTime = System.currentTimeMillis();
        singleTouchDown(event);
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, com.zykj.blackboard.core.action.ITouchAction
    public void onTouchMove(@NotNull EzyTouchEvent$TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
        super.onTouchMove(event);
        int i = this.fingerMode;
        if (i == 1) {
            singleTouchMove(event);
        } else {
            if (i != 2) {
                return;
            }
            doubleTouchMove(event);
        }
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, com.zykj.blackboard.core.action.ITouchAction
    public void onTouchPointerDown(@NotNull EzyTouchEvent$TouchEvent event) {
        MoveActionConfig moveActionConfig;
        AbstractC5830k.m5330g(event, "event");
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
    public void onTouchPointerUp(@NotNull EzyTouchEvent$TouchEvent event) {
        MoveActionConfig moveActionConfig;
        AbstractC5830k.m5330g(event, "event");
        super.onTouchPointerUp(event);
        BoardConfig boardConfig = getBoardConfig();
        if (boardConfig == null || (moveActionConfig = boardConfig.getMoveActionConfig()) == null || !moveActionConfig.isMoveActionEnable() || this.fingerMode != 2) {
            return;
        }
        this.fingerMode = 0;
        doubleTouchUp(event);
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, com.zykj.blackboard.core.action.ITouchAction
    public void onTouchUp(@NotNull EzyTouchEvent$TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
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

    public abstract void singleTouchCancel(@NotNull EzyTouchEvent$TouchEvent event);

    public abstract void singleTouchDown(@NotNull EzyTouchEvent$TouchEvent event);

    public abstract void singleTouchMove(@NotNull EzyTouchEvent$TouchEvent event);

    public abstract void singleTouchUp(@NotNull EzyTouchEvent$TouchEvent event);
}
