package com.zykj.blackboard.core.action;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.bean.MoveActionConfig;
import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.listener.IAreaMoveListener;
import com.zykj.blackboard.utils.EventBus;
import com.zykj.blackboard.utils.EventKey;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.blackboard.utils.PointUtils;
import com.zykj.board.EzyMatrix$Matrix;
import com.zykj.board.EzyTouchEvent$TouchEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ]2\u00020\u0001:\u0001]B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\rJ\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0003J!\u0010\u0016\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001c\u0010\rJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\rJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u0003J\u001f\u0010#\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010\u0003J\u0019\u0010&\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010\u0003J\u001f\u0010*\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010)\u001a\u00020!H\u0002¢\u0006\u0004\b*\u0010$J#\u0010+\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010)\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0004H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0006H\u0002¢\u0006\u0004\b/\u0010\u0003J\u001b\u00101\u001a\u00020\u00062\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b1\u00102J\u001f\u00105\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u00132\u0006\u00104\u001a\u00020\u0013H\u0002¢\u0006\u0004\b5\u00106J#\u00107\u001a\u00020\u001f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b7\u00108J\u001f\u0010<\u001a\u00020;2\u0006\u00109\u001a\u00020\u00132\u0006\u0010:\u001a\u00020\u0013H\u0002¢\u0006\u0004\b<\u0010=J\u001f\u0010@\u001a\u00020\u00132\u0006\u0010>\u001a\u00020;2\u0006\u0010?\u001a\u00020;H\u0002¢\u0006\u0004\b@\u0010AJ\u001f\u0010B\u001a\u00020;2\u0006\u0010>\u001a\u00020;2\u0006\u0010?\u001a\u00020;H\u0002¢\u0006\u0004\bB\u0010CJ\u001f\u0010D\u001a\u00020\u00132\u0006\u0010>\u001a\u00020;2\u0006\u0010?\u001a\u00020;H\u0002¢\u0006\u0004\bD\u0010AR\u0014\u0010E\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010G\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010FR\u0016\u0010H\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001e\u0010L\u001a\n K*\u0004\u0018\u00010J0J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010N\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010P\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010OR\u0016\u0010R\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020J0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010Z\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010YR\u0016\u0010[\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010IR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\\¨\u0006^"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/SeeAction;", "Lcom/zykj/blackboard/core/action/BaseTouchAction;", "<init>", "()V", "", "isPlay", "Ld6/s;", "setPlay", "(Z)V", "reset", "Lcom/zykj/board/EzyTouchEvent$TouchEvent;", NotificationCompat.CATEGORY_EVENT, "onTouchDown", "(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V", "onTouchPointerDown", "onTouchMove", "onTouchPointerUp", "onTouchUp", "areaMoveStart", "", "horizontalProgress", "verticalProgress", "areaMoving", "(Ljava/lang/Float;Ljava/lang/Float;)V", "areaMovEnd", "getVerticalProgress", "()F", "getHorizontalProgress", "initSingleDownField", "initDoubleDownField", "initDataSaveField", "Landroid/graphics/Matrix;", "matrix", "", "eventTime", "addMatrixList", "(Landroid/graphics/Matrix;J)V", "saveData", "handleTranslation", "(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Landroid/graphics/Matrix;", "handleMatrixDown", "time", "handleMatrixMove", "handleMatrixUp", "(Landroid/graphics/Matrix;Ljava/lang/Long;)V", "checkMoveEnable", "()Z", "notifyOtherAction", "extraMatrix", "initCalculateField", "(Landroid/graphics/Matrix;)V", "horizontal", "vertical", "onAreaMove", "(FF)V", "calculateMatrixByTranslateProgress", "(Ljava/lang/Float;Ljava/lang/Float;)Landroid/graphics/Matrix;", "x", "y", "Landroid/graphics/PointF;", "getRenderPointF", "(FF)Landroid/graphics/PointF;", "pointF1", "pointF2", "calculateDegrees", "(Landroid/graphics/PointF;Landroid/graphics/PointF;)F", "calculateMiddlePointF", "(Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/graphics/PointF;", "calculateDistance", "firstPointF", "Landroid/graphics/PointF;", "firstMiddlePointF", "firstDistance", "F", "Lcom/zykj/board/EzyMatrix$Matrix;", "kotlin.jvm.PlatformType", "originMatrix", "Lcom/zykj/board/EzyMatrix$Matrix;", "tempMatrix", "Landroid/graphics/Matrix;", "tempMatrix2", "", "fingerMode", "I", "", "matrixList", "Ljava/util/List;", "Landroid/graphics/RectF;", "configLimitRectF", "Landroid/graphics/RectF;", "limitRenderRectF", "minScale", "Z", "Companion", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class SeeAction extends BaseTouchAction {
    private static final int FINGER_MODE_DEFAULT = 0;
    private static final int FINGER_MODE_DOUBLE = 2;
    private static final int FINGER_MODE_SINGLE = 1;
    private int fingerMode;
    private boolean isPlay;

    @NotNull
    private final PointF firstPointF = new PointF();

    @NotNull
    private final PointF firstMiddlePointF = new PointF();
    private float firstDistance = 1.0f;
    private EzyMatrix$Matrix originMatrix = EzyMatrix$Matrix.getDefaultInstance();

    @NotNull
    private final Matrix tempMatrix = new Matrix();

    @NotNull
    private final Matrix tempMatrix2 = new Matrix();

    @NotNull
    private final List<EzyMatrix$Matrix> matrixList = new ArrayList();

    @NotNull
    private final RectF configLimitRectF = new RectF();

    @NotNull
    private final RectF limitRenderRectF = new RectF();
    private float minScale = 1.0f;

    private final void addMatrixList(Matrix matrix, long eventTime) {
        this.matrixList.add(MatrixExtKt.toEzyMatrix(matrix, eventTime));
    }

    private final float calculateDegrees(PointF pointF1, PointF pointF2) {
        return (float) Math.toDegrees(Math.atan2(pointF2.y - pointF1.y, pointF2.x - pointF1.x));
    }

    private final float calculateDistance(PointF pointF1, PointF pointF2) {
        double d9 = 2;
        return (float) Math.sqrt(((float) Math.pow(pointF1.x - pointF2.x, d9)) + ((float) Math.pow(pointF1.y - pointF2.y, d9)));
    }

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

    private final boolean checkMoveEnable() {
        BoardConfig boardConfig;
        MoveActionConfig moveActionConfig;
        return (this.isPlay || (boardConfig = getBoardConfig()) == null || (moveActionConfig = boardConfig.getMoveActionConfig()) == null || !moveActionConfig.isMoveActionEnable()) ? false : true;
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
        IGraphControl graphControl = getGraphControl();
        if (graphControl != null) {
            graphControl.cameraChangeStart();
        }
        this.matrixList.clear();
    }

    private final void handleMatrixMove(Matrix matrix, long time) {
        IGraphControl graphControl = getGraphControl();
        if (graphControl != null) {
            graphControl.cameraChanging(matrix);
        }
        addMatrixList(matrix, time);
    }

    private final void handleMatrixUp(Matrix matrix, Long time) {
        if (matrix != null) {
            this.matrixList.add(MatrixExtKt.toEzyMatrix(matrix, time != null ? time.longValue() : System.currentTimeMillis()));
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
        saveData();
    }

    // Viewing mode uses distance for zoom and midpoint for motion. Every matrix is
    // relative to the camera at the start of this gesture, not to the previous sample.
    private final Matrix handleTranslation(EzyTouchEvent$TouchEvent event) {
        PointF renderPointF;
        PointF pointF;
        float fWidth;
        Matrix matrix;
        Matrix matrix2;
        MoveActionConfig moveActionConfig;
        MoveActionConfig moveActionConfig2;
        MoveActionConfig moveActionConfig3;
        int i = this.fingerMode;
        if (i == 1) {
            this.tempMatrix.reset();
            renderPointF = getRenderPointF(event.getX(), event.getY());
            pointF = this.firstPointF;
        } else {
            if (i != 2) {
                return null;
            }
            this.tempMatrix.reset();
            PointF renderPointF2 = getRenderPointF(event.getPointerCoords(0).getX(), event.getPointerCoords(0).getY());
            PointF renderPointF3 = getRenderPointF(event.getPointerCoords(1).getX(), event.getPointerCoords(1).getY());
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
        float f = 0.0f;
        if (boardConfig2 == null || (moveActionConfig2 = boardConfig2.getMoveActionConfig()) == null || !moveActionConfig2.getHorizontalTranslate()) {
            fWidth = 0.0f;
        } else {
            RectF rectF = this.limitRenderRectF;
            fWidth = rectF.left;
            float f7 = rectF.right;
            if (fWidth > f7) {
                IGraphControl graphControl = getGraphControl();
                AbstractC5830k.m5327d(graphControl);
                fWidth = ((graphControl.getPageRectF().width() - this.configLimitRectF.width()) / 2) - this.configLimitRectF.left;
            } else {
                float f8 = renderPointF.x - pointF.x;
                if (f8 >= fWidth) {
                    fWidth = f8 > f7 ? f7 : f8;
                }
            }
            this.tempMatrix.postTranslate(fWidth, 0.0f);
        }
        BoardConfig boardConfig3 = getBoardConfig();
        if (boardConfig3 != null && (moveActionConfig = boardConfig3.getMoveActionConfig()) != null && moveActionConfig.getVerticalTranslate()) {
            RectF rectF2 = this.limitRenderRectF;
            float fHeight = rectF2.top;
            float f9 = rectF2.bottom;
            if (fHeight > f9) {
                IGraphControl graphControl2 = getGraphControl();
                AbstractC5830k.m5327d(graphControl2);
                fHeight = ((graphControl2.getPageRectF().height() - this.configLimitRectF.height()) / 2) - this.configLimitRectF.top;
            } else {
                float f10 = renderPointF.y - pointF.y;
                if (f10 >= fHeight) {
                    fHeight = f10 > f9 ? f9 : f10;
                }
            }
            this.tempMatrix.postTranslate(0.0f, fHeight);
            f = fHeight;
        }
        onAreaMove(fWidth, f);
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

    private final void initCalculateField(Matrix extraMatrix) {
        Matrix matrix;
        IGraphControl graphControl = getGraphControl();
        AbstractC5830k.m5327d(graphControl);
        RectF oldPageRectF = graphControl.getOldPageRectF();
        IGraphControl graphControl2 = getGraphControl();
        AbstractC5830k.m5327d(graphControl2);
        RectF pageRectF = graphControl2.getPageRectF();
        if (oldPageRectF.isEmpty()) {
            oldPageRectF = new RectF(pageRectF);
        }
        BoardConfig boardConfig = getBoardConfig();
        AbstractC5830k.m5327d(boardConfig);
        MoveActionConfig moveActionConfig = boardConfig.getMoveActionConfig();
        if (moveActionConfig.getMaxHeightTimes() < 1 || moveActionConfig.getMaxWidthTimes() < 1) {
            this.configLimitRectF.setEmpty();
            return;
        }
        this.configLimitRectF.set(0.0f, 0.0f, oldPageRectF.width() * moveActionConfig.getMaxWidthTimes(), oldPageRectF.height() * moveActionConfig.getMaxHeightTimes());
        MatrixAdapter matrixAdapter = getMatrixAdapter();
        if (matrixAdapter == null || (matrix = matrixAdapter.getAdapterMatrix()) == null) {
            matrix = new Matrix();
        }
        if (extraMatrix != null) {
            matrix.postConcat(extraMatrix);
        }
        matrix.mapRect(this.configLimitRectF);
        RectF rectF = this.limitRenderRectF;
        float f = pageRectF.right;
        RectF rectF2 = this.configLimitRectF;
        rectF.set(f - rectF2.right, pageRectF.bottom - rectF2.bottom, pageRectF.left - rectF2.left, pageRectF.top - rectF2.top);
        if (extraMatrix == null) {
            this.minScale = Math.min(pageRectF.width() / this.configLimitRectF.width(), pageRectF.height() / this.configLimitRectF.height());
        }
        Log.i("MoveAction", "configRectF -> " + this.configLimitRectF);
        Log.i("MoveAction", "limitRenderRectF -> " + this.limitRenderRectF);
    }

    public static /* synthetic */ void initCalculateField$default(SeeAction seeAction, Matrix matrix, int i, Object obj) {
        if ((i & 1) != 0) {
            matrix = null;
        }
        seeAction.initCalculateField(matrix);
    }

    private final void initDataSaveField() {
        Matrix cameraMatrix;
        MatrixAdapter matrixAdapter = getMatrixAdapter();
        this.originMatrix = (matrixAdapter == null || (cameraMatrix = matrixAdapter.getCameraMatrix()) == null) ? null : MatrixExtKt.toEzyMatrix(cameraMatrix, System.currentTimeMillis());
    }

    private final void initDoubleDownField(EzyTouchEvent$TouchEvent event) {
        PointF renderPointF = getRenderPointF(event.getPointerCoords(0).getX(), event.getPointerCoords(0).getY());
        PointF renderPointF2 = getRenderPointF(event.getPointerCoords(1).getX(), event.getPointerCoords(1).getY());
        this.firstMiddlePointF.set(calculateMiddlePointF(renderPointF, renderPointF2));
        this.firstDistance = calculateDistance(renderPointF, renderPointF2);
    }

    private final void initSingleDownField(EzyTouchEvent$TouchEvent event) {
        this.firstPointF.set(getRenderPointF(event.getX(), event.getY()));
    }

    private final void notifyOtherAction() {
        EventBus eventBus = EventBus.INSTANCE;
        eventBus.post(EventKey.TEXT_ACTION_SELECTED_CANCEL);
        eventBus.post(EventKey.SELECT_ACTION_SELECTED_CANCEL);
    }

    private final void onAreaMove(float horizontal, float vertical) {
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

    private final void saveData() {
        Matrix matrix;
        IActionListener listener = getListener();
        if (listener != null) {
            EzyMatrix$Matrix originMatrix = this.originMatrix;
            AbstractC5830k.m5329f(originMatrix, "originMatrix");
            MatrixAdapter matrixAdapter = getMatrixAdapter();
            if (matrixAdapter == null || (matrix = matrixAdapter.getCameraMatrix()) == null) {
                matrix = new Matrix();
            }
            listener.transformCameraEvent(originMatrix, MatrixExtKt.toEzyMatrix(matrix, 0L), this.matrixList);
        }
    }

    public final void areaMovEnd(@Nullable Float horizontalProgress, @Nullable Float verticalProgress) {
        if (this.configLimitRectF.isEmpty()) {
            return;
        }
        handleMatrixUp(calculateMatrixByTranslateProgress(horizontalProgress, verticalProgress), Long.valueOf(System.currentTimeMillis()));
    }

    public final void areaMoveStart() {
        initCalculateField$default(this, null, 1, null);
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
        initCalculateField$default(this, null, 1, null);
        RectF rectF = this.limitRenderRectF;
        float f = rectF.right;
        if (f > rectF.left) {
            return f / rectF.width();
        }
        return 0.0f;
    }

    public final float getVerticalProgress() {
        initCalculateField$default(this, null, 1, null);
        RectF rectF = this.limitRenderRectF;
        float f = rectF.bottom;
        if (f > rectF.top) {
            return f / rectF.height();
        }
        return 0.0f;
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, com.zykj.blackboard.core.action.ITouchAction
    public void onTouchDown(@NotNull EzyTouchEvent$TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
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
    public void onTouchMove(@NotNull EzyTouchEvent$TouchEvent event) {
        Matrix matrixHandleTranslation;
        AbstractC5830k.m5330g(event, "event");
        super.onTouchMove(event);
        if (checkMoveEnable() && (matrixHandleTranslation = handleTranslation(event)) != null) {
            handleMatrixMove(matrixHandleTranslation, event.getEventTime());
        }
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, com.zykj.blackboard.core.action.ITouchAction
    public void onTouchPointerDown(@NotNull EzyTouchEvent$TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
        super.onTouchPointerDown(event);
        this.fingerMode = 2;
        if (checkMoveEnable()) {
            initDoubleDownField(event);
        }
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, com.zykj.blackboard.core.action.ITouchAction
    public void onTouchPointerUp(@NotNull EzyTouchEvent$TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
        super.onTouchPointerUp(event);
        this.fingerMode = 0;
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction, com.zykj.blackboard.core.action.ITouchAction
    public void onTouchUp(@NotNull EzyTouchEvent$TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
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

    public final void setPlay(boolean isPlay) {
        this.isPlay = isPlay;
    }
}
