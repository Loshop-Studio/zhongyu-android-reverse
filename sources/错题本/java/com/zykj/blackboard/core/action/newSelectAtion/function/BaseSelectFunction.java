package com.zykj.blackboard.core.action.newSelectAtion.function;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.core.action.IActionListener;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionMode;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionType;
import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.blackboard.utils.PointUtils;
import com.zykj.board.EzyMatrix$Matrix;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u0000  \u00012\u00020\u0001:\u0002 \u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u000eJ\u001f\u0010\u0017\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u000eJ\u001f\u0010\u0018\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u000eJ\u001f\u0010\u0019\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u000eJ\u001f\u0010\u001a\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u000eJ\u0015\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\"\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b$\u0010%J\u001d\u0010(\u001a\u00020\u00062\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0012H\u0016¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u000f¢\u0006\u0004\b*\u0010\u0011J\u000f\u0010+\u001a\u00020\u0006H\u0016¢\u0006\u0004\b+\u0010\bJ\u000f\u0010,\u001a\u00020\u0006H\u0016¢\u0006\u0004\b,\u0010\bJ\u0017\u0010.\u001a\u00020\u00062\b\b\u0002\u0010-\u001a\u00020\f¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0006H\u0004¢\u0006\u0004\b0\u0010\bJ;\u00106\u001a\u00020\f2\u0006\u00101\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u000f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t04H\u0004¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u000fH\u0004¢\u0006\u0004\b8\u0010\u0011J\u001f\u00109\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b9\u0010%J\u001f\u0010:\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b:\u0010%J\u001f\u0010;\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b;\u0010%JO\u0010D\u001a\u00020\t2\u0006\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\t2\u0006\u0010>\u001a\u00020\t2\u0006\u0010?\u001a\u00020\t2\u0006\u0010@\u001a\u00020\t2\u0006\u0010A\u001a\u00020\t2\u0006\u0010B\u001a\u00020\t2\u0006\u0010C\u001a\u00020\tH\u0002¢\u0006\u0004\bD\u0010EJ\u001f\u0010F\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\bH\u0010IR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010N\u001a\u00020M8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001a\u0010S\u001a\u00020R8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001a\u0010X\u001a\u00020W8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u001a\u0010\\\u001a\u00020\u001e8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u001a\u0010`\u001a\u00020\u001e8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b`\u0010]\u001a\u0004\ba\u0010_R\u001a\u00102\u001a\u00020\u000f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b2\u0010b\u001a\u0004\bc\u0010\u0011R\u001a\u0010d\u001a\u00020\u000f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bd\u0010b\u001a\u0004\be\u0010\u0011R.\u0010f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t048\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\"\u0010l\u001a\u00020\f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bl\u0010n\"\u0004\bo\u0010/R*\u0010r\u001a\u0012\u0012\u0004\u0012\u00020&0pj\b\u0012\u0004\u0012\u00020&`q8\u0004X\u0084\u0004¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR\"\u0010w\u001a\u00020v8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R%\u00101\u001a\u00020}8\u0004@\u0004X\u0084\u000e¢\u0006\u0015\n\u0004\b1\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R*\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R)\u0010\u008a\u0001\u001a\u00020\t8\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R)\u0010\u0090\u0001\u001a\u00020\t8\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u008b\u0001\u001a\u0006\b\u0091\u0001\u0010\u008d\u0001\"\u0006\b\u0092\u0001\u0010\u008f\u0001R\u0018\u0010\u0093\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0093\u0001\u0010mR\u001f\u0010\u0096\u0001\u001a\n\u0012\u0005\u0012\u00030\u0095\u00010\u0094\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R+\u0010\u0098\u0001\u001a\u0004\u0018\u00010 8\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0016\u0010\u009f\u0001\u001a\u00020\u001e8DX\u0084\u0004¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010_¨\u0006¡\u0001"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/function/BaseSelectFunction;", "", "Lcom/zykj/blackboard/core/action/IActionListener;", "listener", "<init>", "(Lcom/zykj/blackboard/core/action/IActionListener;)V", "Ld6/s;", "updateFunctionRectF", "()V", "", "x", "y", "", "isClickInSelectFunction", "(FF)Z", "Landroid/graphics/RectF;", "getMaxFunctionRectF", "()Landroid/graphics/RectF;", "", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;", "getCurrentFunctionTypeList", "()Ljava/util/List;", "handleMoveStart", "handleMoving", "handleMoveEnd", "handleClick", "handleDoubleClick", "rectF", "setSelectRectF", "(Landroid/graphics/RectF;)V", "Landroid/graphics/Matrix;", "matrix", "Landroid/graphics/PointF;", "pointF", "setSingleGraphData", "(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/PointF;)V", "setFirstPoint", "(FF)V", "Lcom/zykj/blackboard/core/graph/IGraph;", "graphList", "setSelectGraphList", "(Ljava/util/List;)V", "getSelectRectFAfterTransform", "initForFunctionTouch", "reset", "needUpdateLocation", "showSelectRectF", "(Z)V", "updateFunctionBackgroundRectF", "functionRectF", "selectRectF", "limitRectF", "Lkotlin/Pair;", "pair", "getFunctionRectFBySelectRectF", "(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;Lkotlin/Pair;)Z", "getLimitRectFInPage", "handleRotate", "handleScale", "handleTranslate", "x1", "y1", "x2", "y2", "x3", "y3", "x4", "y4", "calculateScaleOffset", "(FFFFFFFF)F", "calculateRadians", "(FF)F", "getAdapterMatrix", "(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;", "Lcom/zykj/blackboard/core/action/IActionListener;", "getListener", "()Lcom/zykj/blackboard/core/action/IActionListener;", "Lcom/zykj/blackboard/core/canvas/control/IGraphControl;", "graphControl", "Lcom/zykj/blackboard/core/canvas/control/IGraphControl;", "getGraphControl", "()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;", "Lcom/zykj/blackboard/bean/BoardConfig;", "boardConfig", "Lcom/zykj/blackboard/bean/BoardConfig;", "getBoardConfig", "()Lcom/zykj/blackboard/bean/BoardConfig;", "Lcom/zykj/blackboard/core/canvas/MatrixAdapter;", "matrixAdapter", "Lcom/zykj/blackboard/core/canvas/MatrixAdapter;", "getMatrixAdapter", "()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;", "transformMatrix", "Landroid/graphics/Matrix;", "getTransformMatrix", "()Landroid/graphics/Matrix;", "singleMatrix", "getSingleMatrix", "Landroid/graphics/RectF;", "getSelectRectF", "selectFunctionRectF", "getSelectFunctionRectF", "selectSizePair", "Lkotlin/Pair;", "getSelectSizePair", "()Lkotlin/Pair;", "setSelectSizePair", "(Lkotlin/Pair;)V", "isDirectionLeft", "Z", "()Z", "setDirectionLeft", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "selectGraphList", "Ljava/util/ArrayList;", "getSelectGraphList", "()Ljava/util/ArrayList;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;", "currentFunctionMode", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;", "getCurrentFunctionMode", "()Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;", "setCurrentFunctionMode", "(Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;)V", "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;", "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;", "getFunctionRectF", "()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;", "setFunctionRectF", "(Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;)V", "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;", "functionBackgroundRectF", "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;", "getFunctionBackgroundRectF", "()Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;", "setFunctionBackgroundRectF", "(Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;)V", "firstX", "F", "getFirstX", "()F", "setFirstX", "(F)V", "firstY", "getFirstY", "setFirstY", "isTransforming", "", "Lcom/zykj/board/EzyMatrix$Matrix;", "matrixList", "Ljava/util/List;", "trianglePointF", "Landroid/graphics/PointF;", "getTrianglePointF", "()Landroid/graphics/PointF;", "setTrianglePointF", "(Landroid/graphics/PointF;)V", "getCurrentMatrix", "currentMatrix", "Companion", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public abstract class BaseSelectFunction {
    public static final float colorSpace = 23.0f;
    public static final float colorWidth = 38.0f;
    public static final float funcHorizontalPadding = 15.0f;
    public static final float funcRectHorizontalPadding = 8.0f;
    public static final float funcSize = 25.0f;
    public static final float spaceHeight = 13.0f;
    public static final float spaceWidth = 13.0f;
    public static final float textPadding = 32.0f;
    public static final float textSpaceWidth = 2.0f;
    public static final float textWidth = 24.0f;
    public static final float writeCircleFirstWidth = 8.0f;
    public static final float writeCircleHorizontalPadding = 19.0f;
    public static final float writeCircleWidthStep = 3.0f;
    public static final float writeRectFHorizontalPadding = 16.0f;

    @NotNull
    private final BoardConfig boardConfig;

    @NotNull
    private NewSelectFunctionMode currentFunctionMode;
    private float firstX;
    private float firstY;

    @NotNull
    private FunctionBackgroundRectF functionBackgroundRectF;

    @NotNull
    private FunctionRectF functionRectF;

    @NotNull
    private final IGraphControl graphControl;
    private boolean isDirectionLeft;
    private boolean isTransforming;

    @NotNull
    private final IActionListener listener;

    @NotNull
    private final MatrixAdapter matrixAdapter;

    @NotNull
    private final List<EzyMatrix$Matrix> matrixList;

    @NotNull
    private final RectF selectFunctionRectF;

    @NotNull
    private final ArrayList<IGraph> selectGraphList;

    @NotNull
    private final RectF selectRectF;

    @NotNull
    private Pair<Float, Float> selectSizePair;

    @NotNull
    private final Matrix singleMatrix;

    @NotNull
    private final Matrix transformMatrix;

    @Nullable
    private PointF trianglePointF;

    public BaseSelectFunction(@NotNull IActionListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
        this.listener = listener;
        this.graphControl = listener.getGraphControl();
        this.boardConfig = listener.getBoardConfig();
        this.matrixAdapter = listener.getMatrixAdapter();
        this.transformMatrix = new Matrix();
        this.singleMatrix = new Matrix();
        this.selectRectF = new RectF();
        this.selectFunctionRectF = new RectF();
        Float fValueOf = Float.valueOf(0.0f);
        this.selectSizePair = new Pair<>(fValueOf, fValueOf);
        this.isDirectionLeft = true;
        this.selectGraphList = new ArrayList<>();
        this.currentFunctionMode = NewSelectFunctionMode.Nothing.INSTANCE;
        this.functionRectF = new FunctionRectF(null, null, null, null, null, null, null, null, null, null, 1023, null);
        this.functionBackgroundRectF = new FunctionBackgroundRectF(null, null, null, null, null, 31, null);
        this.matrixList = new ArrayList();
    }

    private final float calculateRadians(float x3, float y2) {
        return ((x3 > 0.0f ? 0.0f : (float) Math.toRadians(180.0d)) * (y2 > 0.0f ? -1 : 1)) + ((float) Math.atan(y2 / x3));
    }

    private final float calculateScaleOffset(float x12, float y12, float x22, float y2, float x3, float y3, float x42, float y42) {
        return ((float) Math.cos(calculateRadians(x22 - x12, y2 - y12) - calculateRadians(x42 - x3, y42 - y3))) * ((float) Math.sqrt((r8 * r8) + (r7 * r7)));
    }

    private final Matrix getAdapterMatrix(Matrix matrix) {
        Matrix matrix2 = new Matrix();
        matrix2.postConcat(this.matrixAdapter.getAdapterMatrix());
        matrix2.postConcat(matrix);
        matrix2.postConcat(MatrixExtKt.invert(this.matrixAdapter.getAdapterMatrix()));
        return matrix2;
    }

    private final void handleRotate(float x3, float y2) {
        PointF pointFMapPoint = PointUtils.INSTANCE.mapPoint(this.selectRectF.centerX(), this.selectRectF.centerY(), this.transformMatrix);
        this.singleMatrix.setRotate((float) Math.toDegrees(calculateRadians(x3 - pointFMapPoint.x, y2 - pointFMapPoint.y) - calculateRadians(this.firstX - pointFMapPoint.x, this.firstY - pointFMapPoint.y)), pointFMapPoint.x, pointFMapPoint.y);
    }

    private final void handleScale(float x3, float y2) {
        PointUtils pointUtils = PointUtils.INSTANCE;
        PointF pointFMapPoint = pointUtils.mapPoint(this.selectRectF.centerX(), this.selectRectF.centerY(), this.transformMatrix);
        RectF rectF = this.selectRectF;
        PointF pointFMapPoint2 = pointUtils.mapPoint(rectF.right, rectF.bottom, this.transformMatrix);
        float fCalculateScaleOffset = calculateScaleOffset(pointFMapPoint.x, pointFMapPoint.y, pointFMapPoint2.x, pointFMapPoint2.y, this.firstX, this.firstY, x3, y2);
        double d9 = 2;
        float fSqrt = (float) Math.sqrt(((float) Math.pow(pointFMapPoint.x - pointFMapPoint2.x, d9)) + ((float) Math.pow(pointFMapPoint.y - pointFMapPoint2.y, d9)));
        float f = fCalculateScaleOffset + fSqrt;
        float selectIconWidth = ((this.boardConfig.getSelectIconWidth() * fSqrt) * 2) / this.transformMatrix.mapRadius(Math.min(this.selectRectF.width(), this.selectRectF.height()));
        if (f < selectIconWidth) {
            f = selectIconWidth;
        }
        float f7 = f / fSqrt;
        this.singleMatrix.setScale(f7, f7, pointFMapPoint.x, pointFMapPoint.y);
    }

    private final void handleTranslate(float x3, float y2) {
        this.singleMatrix.setTranslate(x3 - this.firstX, y2 - this.firstY);
    }

    public static /* synthetic */ void showSelectRectF$default(BaseSelectFunction baseSelectFunction, boolean z8, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showSelectRectF");
        }
        if ((i & 1) != 0) {
            z8 = true;
        }
        baseSelectFunction.showSelectRectF(z8);
    }

    @NotNull
    public final BoardConfig getBoardConfig() {
        return this.boardConfig;
    }

    @NotNull
    public final NewSelectFunctionMode getCurrentFunctionMode() {
        return this.currentFunctionMode;
    }

    @NotNull
    public abstract List<NewSelectFunctionType> getCurrentFunctionTypeList();

    @NotNull
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

    @NotNull
    public final FunctionBackgroundRectF getFunctionBackgroundRectF() {
        return this.functionBackgroundRectF;
    }

    @NotNull
    public final FunctionRectF getFunctionRectF() {
        return this.functionRectF;
    }

    public final boolean getFunctionRectFBySelectRectF(@NotNull RectF functionRectF, @NotNull RectF selectRectF, @NotNull RectF limitRectF, @NotNull Pair<Float, Float> pair) {
        AbstractC5830k.m5330g(functionRectF, "functionRectF");
        AbstractC5830k.m5330g(selectRectF, "selectRectF");
        AbstractC5830k.m5330g(limitRectF, "limitRectF");
        AbstractC5830k.m5330g(pair, "pair");
        float f = selectRectF.left;
        float selectButtonHeight = selectRectF.bottom + 14.0f;
        if (selectButtonHeight > limitRectF.bottom - pair.getSecond().floatValue()) {
            selectButtonHeight = (selectRectF.top - this.boardConfig.getSelectButtonHeight()) - 14.0f;
        }
        float f7 = limitRectF.top;
        if (selectButtonHeight < f7) {
            selectButtonHeight = f7;
        }
        float fWidth = functionRectF.width();
        boolean z8 = true;
        if (fWidth < limitRectF.width()) {
            float f8 = selectRectF.right;
            float f9 = limitRectF.right;
            if (f8 > f9) {
                f = f9 - fWidth;
                z8 = false;
            }
            float f10 = limitRectF.left;
            if (f < f10) {
                f = f10;
            }
        }
        functionRectF.left = f;
        functionRectF.top = selectButtonHeight;
        functionRectF.right += f;
        functionRectF.bottom += selectButtonHeight;
        return z8;
    }

    @NotNull
    public final IGraphControl getGraphControl() {
        return this.graphControl;
    }

    @NotNull
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

    @NotNull
    public final IActionListener getListener() {
        return this.listener;
    }

    @NotNull
    public final MatrixAdapter getMatrixAdapter() {
        return this.matrixAdapter;
    }

    @NotNull
    public abstract RectF getMaxFunctionRectF();

    @NotNull
    public final RectF getSelectFunctionRectF() {
        return this.selectFunctionRectF;
    }

    @NotNull
    public final ArrayList<IGraph> getSelectGraphList() {
        return this.selectGraphList;
    }

    @NotNull
    public final RectF getSelectRectF() {
        return this.selectRectF;
    }

    @NotNull
    public final RectF getSelectRectFAfterTransform() {
        RectF rectF = new RectF(this.selectRectF);
        getCurrentMatrix().mapRect(rectF);
        return rectF;
    }

    @NotNull
    public final Pair<Float, Float> getSelectSizePair() {
        return this.selectSizePair;
    }

    @NotNull
    public final Matrix getSingleMatrix() {
        return this.singleMatrix;
    }

    @NotNull
    public final Matrix getTransformMatrix() {
        return this.transformMatrix;
    }

    @Nullable
    public final PointF getTrianglePointF() {
        return this.trianglePointF;
    }

    public boolean handleClick(float x3, float y2) {
        return true;
    }

    public boolean handleDoubleClick(float x3, float y2) {
        return false;
    }

    public boolean handleMoveEnd(float x3, float y2) {
        NewSelectFunctionMode newSelectFunctionMode = this.currentFunctionMode;
        if (AbstractC5830k.m5325b(newSelectFunctionMode, NewSelectFunctionMode.Rotate.INSTANCE)) {
            handleRotate(x3, y2);
        } else if (AbstractC5830k.m5325b(newSelectFunctionMode, NewSelectFunctionMode.Scale.INSTANCE)) {
            handleScale(x3, y2);
        } else {
            if (!AbstractC5830k.m5325b(newSelectFunctionMode, NewSelectFunctionMode.Content.INSTANCE)) {
                return false;
            }
            handleTranslate(x3, y2);
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

    public boolean handleMoveStart(float x3, float y2) {
        return true;
    }

    public boolean handleMoving(float x3, float y2) {
        NewSelectFunctionMode newSelectFunctionMode = this.currentFunctionMode;
        if (AbstractC5830k.m5325b(newSelectFunctionMode, NewSelectFunctionMode.Rotate.INSTANCE)) {
            handleRotate(x3, y2);
        } else if (AbstractC5830k.m5325b(newSelectFunctionMode, NewSelectFunctionMode.Scale.INSTANCE)) {
            handleScale(x3, y2);
        } else {
            if (!AbstractC5830k.m5325b(newSelectFunctionMode, NewSelectFunctionMode.Content.INSTANCE)) {
                return false;
            }
            handleTranslate(x3, y2);
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

    public abstract boolean isClickInSelectFunction(float x3, float y2);

    /* renamed from: isDirectionLeft, reason: from getter */
    public final boolean getIsDirectionLeft() {
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

    public final void setCurrentFunctionMode(@NotNull NewSelectFunctionMode newSelectFunctionMode) {
        AbstractC5830k.m5330g(newSelectFunctionMode, "<set-?>");
        this.currentFunctionMode = newSelectFunctionMode;
    }

    public final void setDirectionLeft(boolean z8) {
        this.isDirectionLeft = z8;
    }

    public final void setFirstPoint(float x3, float y2) {
        this.firstX = x3;
        this.firstY = y2;
    }

    public final void setFirstX(float f) {
        this.firstX = f;
    }

    public final void setFirstY(float f) {
        this.firstY = f;
    }

    public final void setFunctionBackgroundRectF(@NotNull FunctionBackgroundRectF functionBackgroundRectF) {
        AbstractC5830k.m5330g(functionBackgroundRectF, "<set-?>");
        this.functionBackgroundRectF = functionBackgroundRectF;
    }

    public final void setFunctionRectF(@NotNull FunctionRectF functionRectF) {
        AbstractC5830k.m5330g(functionRectF, "<set-?>");
        this.functionRectF = functionRectF;
    }

    public void setSelectGraphList(@NotNull List<? extends IGraph> graphList) {
        AbstractC5830k.m5330g(graphList, "graphList");
        this.selectGraphList.clear();
        this.selectGraphList.addAll(graphList);
    }

    public final void setSelectRectF(@NotNull RectF rectF) {
        AbstractC5830k.m5330g(rectF, "rectF");
        this.selectRectF.set(rectF);
    }

    public final void setSelectSizePair(@NotNull Pair<Float, Float> pair) {
        AbstractC5830k.m5330g(pair, "<set-?>");
        this.selectSizePair = pair;
    }

    public final void setSingleGraphData(@NotNull RectF rectF, @NotNull Matrix matrix, @Nullable PointF pointF) {
        AbstractC5830k.m5330g(rectF, "rectF");
        AbstractC5830k.m5330g(matrix, "matrix");
        this.selectRectF.set(rectF);
        this.transformMatrix.set(matrix);
        this.trianglePointF = pointF;
    }

    public final void setTrianglePointF(@Nullable PointF pointF) {
        this.trianglePointF = pointF;
    }

    public final void showSelectRectF(boolean needUpdateLocation) {
        if (needUpdateLocation) {
            this.selectFunctionRectF.set(getMaxFunctionRectF());
            this.isDirectionLeft = getFunctionRectFBySelectRectF(this.selectFunctionRectF, getSelectRectFAfterTransform(), getLimitRectFInPage(), this.selectSizePair);
            updateFunctionRectF();
            updateFunctionBackgroundRectF();
        }
        PointF pointF = this.trianglePointF;
        this.graphControl.newSelect(this.selectRectF, getCurrentMatrix(), this.selectFunctionRectF, this.functionRectF, this.functionBackgroundRectF, getCurrentFunctionTypeList(), pointF != null ? PointUtils.INSTANCE.mapPoint(pointF, getCurrentMatrix()) : null);
    }

    public final void updateFunctionBackgroundRectF() {
        FunctionRectF functionRectF = this.functionRectF;
        FunctionBackgroundRectF functionBackgroundRectF = this.functionBackgroundRectF;
        RectF editRectF = functionBackgroundRectF.getEditRectF();
        editRectF.setEmpty();
        editRectF.union(functionRectF.getWriteEdit());
        editRectF.union(functionRectF.getTextEdit());
        editRectF.union(functionRectF.getGeometryStroke());
        editRectF.union(functionRectF.getImageCrop());
        editRectF.union(functionRectF.getDelete());
        editRectF.left -= 8.0f;
        editRectF.right += 8.0f;
        ArrayList<RectF> writeStrokeWidthList = functionRectF.getWriteStrokeWidthList();
        if (!writeStrokeWidthList.isEmpty()) {
            functionBackgroundRectF.getWriteStrokeRectF().set(((RectF) AbstractC5805t.m5228h0(writeStrokeWidthList)).left - 16.0f, ((RectF) AbstractC5805t.m5228h0(writeStrokeWidthList)).top, ((RectF) AbstractC5805t.m5235o0(writeStrokeWidthList)).right + 16.0f, ((RectF) AbstractC5805t.m5228h0(writeStrokeWidthList)).bottom);
        }
        functionBackgroundRectF.getTextSizeRectF().set(functionRectF.getTextSizeReduce().left, functionRectF.getTextSizeReduce().top, functionRectF.getTextSizeAdd().right, functionRectF.getTextSizeAdd().bottom);
        if (!functionRectF.getColorList().isEmpty()) {
            float selectButtonHeight = (this.boardConfig.getSelectButtonHeight() - 38.0f) / 2;
            functionBackgroundRectF.getColorRectF().set(((RectF) AbstractC5805t.m5228h0(functionRectF.getColorList())).left - 23.0f, ((RectF) AbstractC5805t.m5228h0(functionRectF.getColorList())).top - selectButtonHeight, ((RectF) AbstractC5805t.m5235o0(functionRectF.getColorList())).right + 23.0f, ((RectF) AbstractC5805t.m5235o0(functionRectF.getColorList())).bottom + selectButtonHeight);
        }
        functionBackgroundRectF.getCustomColorRectF().set(functionRectF.getCustomColor());
    }

    public abstract void updateFunctionRectF();
}
