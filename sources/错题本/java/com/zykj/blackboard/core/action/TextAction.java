package com.zykj.blackboard.core.action;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.core.action.IActionListener;
import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.graph.group.TextGraph;
import com.zykj.blackboard.enums.TextActionType;
import com.zykj.blackboard.listener.ITextSelectListener;
import com.zykj.blackboard.proxy.TextEditView;
import com.zykj.blackboard.utils.EventBus;
import com.zykj.blackboard.utils.EventKey;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.blackboard.utils.PointUtils;
import com.zykj.blackboard.utils.TextGraphUtils;
import com.zykj.board.EzyGraphEnum$GraphEnum;
import com.zykj.board.EzyMatrix$Matrix;
import com.zykj.board.EzyTouchEvent$TouchEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\tJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0012H\u0002¢\u0006\u0004\b!\u0010\"J'\u0010$\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u000fH\u0002¢\u0006\u0004\b$\u0010%J/\u0010*\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J7\u0010,\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0004H\u0002¢\u0006\u0004\b0\u0010\u0003J\u0017\u00102\u001a\u00020\u00042\u0006\u0010 \u001a\u000201H\u0002¢\u0006\u0004\b2\u00103J\u001f\u00104\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0012H\u0002¢\u0006\u0004\b4\u00105J\u001f\u00106\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0012H\u0002¢\u0006\u0004\b6\u00105J\u001f\u00107\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0012H\u0002¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u001c2\u0006\u00109\u001a\u00020\u001cH\u0002¢\u0006\u0004\b:\u0010;J'\u0010?\u001a\u00020&2\u0006\u0010<\u001a\u00020(2\u0006\u0010>\u001a\u00020=2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b?\u0010@JO\u0010I\u001a\u00020\u00122\u0006\u0010A\u001a\u00020\u00122\u0006\u0010B\u001a\u00020\u00122\u0006\u0010C\u001a\u00020\u00122\u0006\u0010D\u001a\u00020\u00122\u0006\u0010E\u001a\u00020\u00122\u0006\u0010F\u001a\u00020\u00122\u0006\u0010G\u001a\u00020\u00122\u0006\u0010H\u001a\u00020\u0012H\u0002¢\u0006\u0004\bI\u0010JJ\u001f\u0010K\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0012H\u0002¢\u0006\u0004\bK\u0010LR\u0016\u00104\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010MR\u0014\u0010N\u001a\u00020\u00128\u0002X\u0082D¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010P\u001a\u00020\r8\u0002X\u0082D¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010S\u001a\u00020R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010U\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010OR\u0016\u0010V\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010OR\u0016\u0010W\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010OR\u0016\u0010X\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010OR\u0016\u0010Y\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010OR(\u0010[\u001a\u0004\u0018\u00010\u001f2\b\u0010Z\u001a\u0004\u0018\u00010\u001f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R(\u0010_\u001a\u0004\u0018\u00010&2\b\u0010Z\u001a\u0004\u0018\u00010&8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR$\u0010c\u001a\u00020\u001c2\u0006\u0010Z\u001a\u00020\u001c8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0016\u0010g\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010dR\u0016\u0010h\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010j\u001a\u00020\u00128\u0002X\u0082D¢\u0006\u0006\n\u0004\bj\u0010OR\u0016\u0010k\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010QR\u0016\u0010l\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010MR\u0016\u0010m\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010iR\u0016\u0010n\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010dR&\u0010r\u001a\u0012\u0012\u0004\u0012\u00020p0oj\b\u0012\u0004\u0012\u00020p`q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010t\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0016\u0010v\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010M¨\u0006w"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/TextAction;", "Lcom/zykj/blackboard/core/action/MoveAction;", "<init>", "()V", "Ld6/s;", "reset", "Lcom/zykj/board/EzyTouchEvent$TouchEvent;", NotificationCompat.CATEGORY_EVENT, "singleTouchDown", "(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V", "singleTouchMove", "singleTouchUp", "singleTouchCancel", "", TypedValues.Custom.S_COLOR, "", "changeTextColor", "(I)Z", "", "size", "changeTextSize", "(F)Z", "Landroid/graphics/PointF;", "pointF", "isClickInSelect", "(Landroid/graphics/PointF;)Z", "x", "y", "Landroid/graphics/Matrix;", "handleTranslate", "(FF)Landroid/graphics/Matrix;", "Lcom/zykj/blackboard/core/graph/group/TextGraph;", "graph", "handleScale", "(Lcom/zykj/blackboard/core/graph/group/TextGraph;FF)V", "isNewGraph", "handleTextEdit", "(FFZ)V", "Landroid/graphics/RectF;", "rectF", "", "text", "buildTextGraph", "(Landroid/graphics/RectF;FFLjava/lang/String;)Lcom/zykj/blackboard/core/graph/group/TextGraph;", "handleTextConfirm", "(ZLandroid/graphics/RectF;FFLjava/lang/String;)V", "selectGraph", "(Lcom/zykj/blackboard/core/graph/group/TextGraph;)V", "selectCancel", "Lcom/zykj/blackboard/core/graph/IGraph;", "buildSelectedRectF", "(Lcom/zykj/blackboard/core/graph/IGraph;)V", "isMove", "(FF)Z", "isDoubleTap", "getRenderPointF", "(FF)Landroid/graphics/PointF;", "matrix", "handleMatrix", "(Landroid/graphics/Matrix;)Landroid/graphics/Matrix;", "content", "Landroid/graphics/Paint;", "paint", "calculateRectF", "(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/RectF;)Landroid/graphics/RectF;", "x1", "y1", "x2", "y2", "x3", "y3", "x4", "y4", "calculateScaleOffset", "(FFFFFFFF)F", "calculateRadians", "(FF)F", "Z", "minMoveDistance", "F", "maxInterval", "I", "", "lastTapTime", "J", "lastTapX", "lastTapY", "firstX", "firstY", "firstSelectedWidth", "<set-?>", "selectedGraph", "Lcom/zykj/blackboard/core/graph/group/TextGraph;", "getSelectedGraph", "()Lcom/zykj/blackboard/core/graph/group/TextGraph;", "selectedRectF", "Landroid/graphics/RectF;", "getSelectedRectF", "()Landroid/graphics/RectF;", "selectedRectFMatrix", "Landroid/graphics/Matrix;", "getSelectedRectFMatrix", "()Landroid/graphics/Matrix;", "selectedMatrix", "selectedRectFPaint", "Landroid/graphics/Paint;", "iconWidth", "currentTextActionType", "isTextActionMode", "textPaint", "tempMatrix", "Ljava/util/ArrayList;", "Lcom/zykj/board/EzyMatrix$Matrix;", "Lkotlin/collections/ArrayList;", "tempMatrixList", "Ljava/util/ArrayList;", "tempContent", "Ljava/lang/String;", "isHandingEdit", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class TextAction extends MoveAction {
    private float firstSelectedWidth;
    private float firstX;
    private float firstY;
    private boolean isHandingEdit;
    private boolean isMove;
    private long lastTapTime;
    private float lastTapX;
    private float lastTapY;

    @Nullable
    private TextGraph selectedGraph;

    @Nullable
    private RectF selectedRectF;
    private final float minMoveDistance = 30.0f;
    private final int maxInterval = 500;

    @NotNull
    private Matrix selectedRectFMatrix = new Matrix();

    @NotNull
    private Matrix selectedMatrix = new Matrix();

    @NotNull
    private Paint selectedRectFPaint = new Paint();
    private final float iconWidth = 50.0f;
    private int currentTextActionType = -1;
    private boolean isTextActionMode = true;

    @NotNull
    private Paint textPaint = new Paint();

    @NotNull
    private Matrix tempMatrix = new Matrix();

    @NotNull
    private ArrayList<EzyMatrix$Matrix> tempMatrixList = new ArrayList<>();

    @NotNull
    private String tempContent = "";

    public TextAction() {
        this.selectedRectFPaint.setColor(-4276546);
        this.selectedRectFPaint.setStrokeWidth(2.0f);
        this.selectedRectFPaint.setStyle(Paint.Style.STROKE);
        this.selectedRectFPaint.setDither(true);
        this.selectedRectFPaint.setAntiAlias(true);
        this.textPaint.setColor(-12085261);
        this.textPaint.setStyle(Paint.Style.FILL);
        this.textPaint.setTextSize(40.0f);
        this.textPaint.setDither(true);
        this.textPaint.setAntiAlias(true);
        EventBus.INSTANCE.register(EventKey.TEXT_ACTION_SELECTED_CANCEL, new InterfaceC6469a() { // from class: com.zykj.blackboard.core.action.TextAction.1
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m13742invoke();
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m13742invoke() {
                TextAction.this.selectCancel();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void buildSelectedRectF(IGraph graph) {
        Matrix adapterMatrix;
        if (this.selectedRectF == null) {
            this.selectedRectF = new RectF();
        }
        RectF rectF = this.selectedRectF;
        AbstractC5830k.m5327d(rectF);
        rectF.set(graph.getOriginalRectF());
        Matrix matrix = this.selectedRectFMatrix;
        matrix.reset();
        matrix.postConcat(graph.getRenderMatrix());
        MatrixAdapter matrixAdapter = getMatrixAdapter();
        if (matrixAdapter != null && (adapterMatrix = matrixAdapter.getAdapterMatrix()) != null) {
            matrix.postConcat(adapterMatrix);
        }
        this.selectedMatrix.reset();
    }

    private final TextGraph buildTextGraph(RectF rectF, float x3, float y2, String text) {
        TextGraph textGraph = new TextGraph("", new RectF(rectF), null, null, null, 28, null);
        Matrix matrix = new Matrix();
        matrix.setTranslate(x3, y2);
        MatrixAdapter matrixAdapter = getMatrixAdapter();
        Matrix adapterMatrix = matrixAdapter != null ? matrixAdapter.getAdapterMatrix() : null;
        AbstractC5830k.m5327d(adapterMatrix);
        matrix.postConcat(MatrixExtKt.invert(adapterMatrix));
        textGraph.concatMatrix(matrix);
        textGraph.setPaint(this.textPaint);
        textGraph.setContent(text);
        return textGraph;
    }

    private final float calculateRadians(float x3, float y2) {
        if (x3 == 0.0f) {
            return 0.0f;
        }
        return ((x3 > 0.0f ? 0.0f : (float) Math.toRadians(180.0d)) * (y2 > 0.0f ? -1 : 1)) + ((float) Math.atan(y2 / x3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RectF calculateRectF(String content, Paint paint, RectF rectF) {
        RectF addTextRectF;
        RectF addTextRectF2;
        float size = (paint.getFontMetrics().bottom - paint.getFontMetrics().top) * TextGraphUtils.INSTANCE.calculateTextToList(content, paint, rectF.width()).size();
        BoardConfig boardConfig = getBoardConfig();
        float fHeight = 0.0f;
        if (size > ((boardConfig == null || (addTextRectF2 = boardConfig.getAddTextRectF()) == null) ? 0.0f : addTextRectF2.height())) {
            rectF.bottom = size + rectF.top;
            return rectF;
        }
        BoardConfig boardConfig2 = getBoardConfig();
        if (boardConfig2 != null && (addTextRectF = boardConfig2.getAddTextRectF()) != null) {
            fHeight = addTextRectF.height();
        }
        rectF.bottom = fHeight + rectF.top;
        return rectF;
    }

    private final float calculateScaleOffset(float x12, float y12, float x22, float y2, float x3, float y3, float x42, float y42) {
        return ((float) Math.cos(calculateRadians(x22 - x12, y2 - y12) - calculateRadians(x42 - x3, y42 - y3))) * ((float) Math.sqrt((r8 * r8) + (r7 * r7)));
    }

    private final PointF getRenderPointF(float x3, float y2) {
        PointUtils pointUtils = PointUtils.INSTANCE;
        MatrixAdapter matrixAdapter = getMatrixAdapter();
        AbstractC5830k.m5327d(matrixAdapter);
        return pointUtils.mapPoint(x3, y2, matrixAdapter.getAdapterMatrix());
    }

    private final Matrix handleMatrix(Matrix matrix) {
        Matrix matrix2 = new Matrix();
        MatrixAdapter matrixAdapter = getMatrixAdapter();
        AbstractC5830k.m5327d(matrixAdapter);
        matrix2.postConcat(matrixAdapter.getAdapterMatrix());
        matrix2.postConcat(matrix);
        MatrixAdapter matrixAdapter2 = getMatrixAdapter();
        AbstractC5830k.m5327d(matrixAdapter2);
        matrix2.postConcat(MatrixExtKt.invert(matrixAdapter2.getAdapterMatrix()));
        return matrix2;
    }

    private final void handleScale(TextGraph graph, float x3, float y2) {
        Matrix adapterMatrix;
        PointF renderPointF = getRenderPointF(x3, y2);
        Matrix matrix = new Matrix();
        matrix.postConcat(graph.getRenderMatrix());
        MatrixAdapter matrixAdapter = getMatrixAdapter();
        if (matrixAdapter != null && (adapterMatrix = matrixAdapter.getAdapterMatrix()) != null) {
            matrix.postConcat(adapterMatrix);
        }
        PointUtils pointUtils = PointUtils.INSTANCE;
        PointF pointFMapPoint = pointUtils.mapPoint(graph.getOriginalRectF().left, graph.getOriginalRectF().bottom, matrix);
        PointF pointFMapPoint2 = pointUtils.mapPoint(graph.getOriginalRectF().right, graph.getOriginalRectF().bottom, matrix);
        float fCalculateScaleOffset = this.firstSelectedWidth + calculateScaleOffset(pointFMapPoint.x, pointFMapPoint.y, pointFMapPoint2.x, pointFMapPoint2.y, this.firstX, this.firstY, renderPointF.x, renderPointF.y);
        Paint paint = graph.getPaint();
        AbstractC5830k.m5327d(paint);
        String content = graph.getContent();
        AbstractC5830k.m5327d(content);
        if (content.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        float fMapRadius = matrix.mapRadius(paint.measureText(String.valueOf(content.charAt(0))));
        if (fCalculateScaleOffset <= this.iconWidth + 10 || fCalculateScaleOffset <= fMapRadius) {
            return;
        }
        float fMapRadius2 = MatrixExtKt.invert(matrix).mapRadius(fCalculateScaleOffset);
        RectF rectF = new RectF(graph.getOriginalRectF());
        rectF.right = rectF.left + fMapRadius2;
        String content2 = graph.getContent();
        if (content2 == null) {
            content2 = "";
        }
        Paint paint2 = graph.getPaint();
        AbstractC5830k.m5327d(paint2);
        calculateRectF(content2, paint2, rectF);
        graph.changeOriginalRectF(rectF);
        buildSelectedRectF(graph);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleTextConfirm(boolean isNewGraph, RectF rectF, float x3, float y2, String text) {
        String str;
        if (isNewGraph) {
            IActionListener listener = getListener();
            if (listener != null) {
                listener.textGraphEvent(rectF.width(), rectF.height(), x3, y2, this.textPaint, text, new InterfaceC6471c() { // from class: com.zykj.blackboard.core.action.TextAction.handleTextConfirm.1
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((IGraph) obj);
                        return C5443s.f8405a;
                    }

                    public final void invoke(@NotNull IGraph it) {
                        AbstractC5830k.m5330g(it, "it");
                        IGraphControl graphControl = TextAction.this.getGraphControl();
                        if (graphControl != null) {
                            IGraphControl graphControl2 = TextAction.this.getGraphControl();
                            graphControl.addGraph(graphControl2 != null ? graphControl2.rootGraphId() : null, it);
                        }
                        TextAction.this.selectedGraph = (TextGraph) it;
                        TextAction textAction = TextAction.this;
                        TextGraph selectedGraph = textAction.getSelectedGraph();
                        AbstractC5830k.m5327d(selectedGraph);
                        textAction.selectGraph(selectedGraph);
                        IActionListener listener2 = TextAction.this.getListener();
                        if (listener2 != null) {
                            listener2.saveSnapshot();
                        }
                    }
                });
                return;
            }
            return;
        }
        if (this.selectedGraph != null) {
            IGraphControl graphControl = getGraphControl();
            if (graphControl != null) {
                TextGraph textGraph = this.selectedGraph;
                AbstractC5830k.m5327d(textGraph);
                String id = textGraph.getId();
                TextGraph textGraph2 = this.selectedGraph;
                AbstractC5830k.m5327d(textGraph2);
                Paint paint = textGraph2.getPaint();
                AbstractC5830k.m5327d(paint);
                TextGraph textGraph3 = this.selectedGraph;
                AbstractC5830k.m5327d(textGraph3);
                str = text;
                graphControl.changeTextGraph(id, str, paint, textGraph3.getOriginalRectF());
            } else {
                str = text;
            }
            IActionListener listener2 = getListener();
            if (listener2 != null) {
                TextGraph textGraph4 = this.selectedGraph;
                AbstractC5830k.m5327d(textGraph4);
                IActionListener.DefaultImpls.changeGraph$default(listener2, textGraph4, EzyGraphEnum$GraphEnum.TEXT_GRAPH, null, str, null, null, null, null, 244, null);
            }
            IActionListener listener3 = getListener();
            if (listener3 != null) {
                listener3.saveSnapshot();
            }
        }
    }

    private final void handleTextEdit(float x3, float y2, final boolean isNewGraph) {
        final TextGraph textGraphBuildTextGraph;
        if (this.isHandingEdit) {
            return;
        }
        this.isHandingEdit = true;
        BoardConfig boardConfig = getBoardConfig();
        if (boardConfig != null) {
            final PointF renderPointF = getRenderPointF(x3, y2);
            if (isNewGraph || (textGraphBuildTextGraph = this.selectedGraph) == null) {
                textGraphBuildTextGraph = buildTextGraph(boardConfig.getAddTextRectF(), renderPointF.x, renderPointF.y, boardConfig.getAddTextOriginalText());
            } else {
                AbstractC5830k.m5327d(textGraphBuildTextGraph);
            }
            buildSelectedRectF(textGraphBuildTextGraph);
            IGraphControl graphControl = getGraphControl();
            if (graphControl != null) {
                graphControl.selectCancel();
            }
            IGraphControl graphControl2 = getGraphControl();
            if (graphControl2 != null) {
                RectF rectF = this.selectedRectF;
                AbstractC5830k.m5327d(rectF);
                graphControl2.select(rectF, this.selectedRectFMatrix, this.selectedRectFPaint, this.iconWidth, false);
            }
            IGraphControl graphControl3 = getGraphControl();
            if (graphControl3 != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(textGraphBuildTextGraph);
                graphControl3.drawGraphInActive(arrayList);
            }
            String content = textGraphBuildTextGraph.getContent();
            if (content == null) {
                content = "";
            }
            this.tempContent = content;
            TextEditView textEditView = boardConfig.getTextEditView();
            if (textEditView != null) {
                String content2 = textGraphBuildTextGraph.getContent();
                textEditView.showEditView(content2 != null ? content2 : "", new InterfaceC6471c() { // from class: com.zykj.blackboard.core.action.TextAction$handleTextEdit$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((String) obj);
                        return C5443s.f8405a;
                    }

                    public final void invoke(@NotNull String it) {
                        AbstractC5830k.m5330g(it, "it");
                        TextAction textAction = this.this$0;
                        Paint paint = textGraphBuildTextGraph.getPaint();
                        AbstractC5830k.m5327d(paint);
                        RectF rectFCalculateRectF = textAction.calculateRectF(it, paint, new RectF(textGraphBuildTextGraph.getOriginalRectF()));
                        if (!AbstractC5830k.m5325b(rectFCalculateRectF, textGraphBuildTextGraph.getOriginalRectF())) {
                            textGraphBuildTextGraph.changeOriginalRectF(rectFCalculateRectF);
                        }
                        textGraphBuildTextGraph.setContent(it);
                        this.this$0.buildSelectedRectF(textGraphBuildTextGraph);
                        IGraphControl graphControl4 = this.this$0.getGraphControl();
                        if (graphControl4 != null) {
                            RectF selectedRectF = this.this$0.getSelectedRectF();
                            AbstractC5830k.m5327d(selectedRectF);
                            graphControl4.select(selectedRectF, this.this$0.getSelectedRectFMatrix(), this.this$0.selectedRectFPaint, this.this$0.iconWidth, false);
                        }
                        IGraphControl graphControl5 = this.this$0.getGraphControl();
                        if (graphControl5 != null) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(textGraphBuildTextGraph);
                            graphControl5.drawGraphInActive(arrayList2);
                        }
                    }
                }, new InterfaceC6471c() { // from class: com.zykj.blackboard.core.action.TextAction$handleTextEdit$1$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((String) obj);
                        return C5443s.f8405a;
                    }

                    public final void invoke(@NotNull String it) {
                        AbstractC5830k.m5330g(it, "it");
                        TextAction textAction = this.this$0;
                        boolean z8 = isNewGraph;
                        RectF originalRectF = textGraphBuildTextGraph.getOriginalRectF();
                        PointF pointF = renderPointF;
                        textAction.handleTextConfirm(z8, originalRectF, pointF.x, pointF.y, it);
                        this.this$0.isHandingEdit = false;
                    }
                }, new InterfaceC6469a() { // from class: com.zykj.blackboard.core.action.TextAction$handleTextEdit$1$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m13743invoke();
                        return C5443s.f8405a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m13743invoke() {
                        textGraphBuildTextGraph.setContent(this.tempContent);
                        this.selectCancel();
                        IGraphControl graphControl4 = this.getGraphControl();
                        if (graphControl4 != null) {
                            graphControl4.reDrawFixView();
                        }
                        this.isHandingEdit = false;
                    }
                });
            }
        }
    }

    private final Matrix handleTranslate(float x3, float y2) {
        PointF renderPointF = getRenderPointF(x3, y2);
        this.tempMatrix.setTranslate(renderPointF.x - this.firstX, renderPointF.y - this.firstY);
        return handleMatrix(this.tempMatrix);
    }

    private final boolean isClickInSelect(PointF pointF) {
        if (this.selectedRectF == null) {
            return false;
        }
        Matrix matrix = new Matrix();
        matrix.postConcat(this.selectedRectFMatrix);
        matrix.postConcat(this.selectedMatrix);
        float fMapRadius = (this.iconWidth / 2) / matrix.mapRadius(1.0f);
        RectF rectF = this.selectedRectF;
        AbstractC5830k.m5327d(rectF);
        float f = rectF.right - fMapRadius;
        RectF rectF2 = this.selectedRectF;
        AbstractC5830k.m5327d(rectF2);
        float f7 = rectF2.top - fMapRadius;
        RectF rectF3 = this.selectedRectF;
        AbstractC5830k.m5327d(rectF3);
        float f8 = rectF3.right + fMapRadius;
        RectF rectF4 = this.selectedRectF;
        AbstractC5830k.m5327d(rectF4);
        RectF rectF5 = new RectF(f, f7, f8, rectF4.top + fMapRadius);
        RectF rectF6 = this.selectedRectF;
        AbstractC5830k.m5327d(rectF6);
        float f9 = rectF6.right - fMapRadius;
        RectF rectF7 = this.selectedRectF;
        AbstractC5830k.m5327d(rectF7);
        float f10 = rectF7.bottom - fMapRadius;
        RectF rectF8 = this.selectedRectF;
        AbstractC5830k.m5327d(rectF8);
        float f11 = rectF8.right + fMapRadius;
        RectF rectF9 = this.selectedRectF;
        AbstractC5830k.m5327d(rectF9);
        RectF rectF10 = new RectF(f9, f10, f11, rectF9.bottom + fMapRadius);
        PointUtils pointUtils = PointUtils.INSTANCE;
        if (pointUtils.isPointInRect(rectF5, matrix, pointF)) {
            this.currentTextActionType = TextActionType.DELETE.getValue();
            return true;
        }
        if (pointUtils.isPointInRect(rectF10, matrix, pointF)) {
            this.currentTextActionType = TextActionType.SCALE.getValue();
            return true;
        }
        RectF rectF11 = this.selectedRectF;
        AbstractC5830k.m5327d(rectF11);
        if (!pointUtils.isPointInRect(rectF11, matrix, pointF)) {
            return false;
        }
        this.currentTextActionType = TextActionType.TRANSLATE.getValue();
        return true;
    }

    private final boolean isDoubleTap(float x3, float y2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!this.isMove) {
            PointF renderPointF = getRenderPointF(x3, y2);
            double d9 = 2;
            float fSqrt = (float) Math.sqrt(((float) Math.pow(renderPointF.x - this.lastTapX, d9)) + ((float) Math.pow(renderPointF.y - this.lastTapY, d9)));
            if (jCurrentTimeMillis - this.lastTapTime < this.maxInterval && fSqrt < this.minMoveDistance) {
                return true;
            }
        }
        return false;
    }

    private final boolean isMove(float x3, float y2) {
        PointF renderPointF = getRenderPointF(x3, y2);
        double d9 = 2;
        return ((float) Math.sqrt((double) (((float) Math.pow((double) (renderPointF.x - this.firstX), d9)) + ((float) Math.pow((double) (renderPointF.y - this.firstY), d9))))) > this.minMoveDistance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void selectCancel() {
        ITextSelectListener textSelectListener;
        if (this.selectedGraph == null && this.selectedRectF == null) {
            return;
        }
        this.selectedGraph = null;
        this.selectedRectF = null;
        this.selectedRectFMatrix.reset();
        IGraphControl graphControl = getGraphControl();
        if (graphControl != null) {
            graphControl.selectCancel();
        }
        IActionListener listener = getListener();
        if (listener == null || (textSelectListener = listener.getTextSelectListener()) == null) {
            return;
        }
        textSelectListener.textSelectedCancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void selectGraph(TextGraph graph) {
        ITextSelectListener textSelectListener;
        buildSelectedRectF(graph);
        IGraphControl graphControl = getGraphControl();
        if (graphControl != null) {
            RectF rectF = this.selectedRectF;
            AbstractC5830k.m5327d(rectF);
            graphControl.select(rectF, this.selectedRectFMatrix, this.selectedRectFPaint, this.iconWidth, false);
        }
        IActionListener listener = getListener();
        if (listener == null || (textSelectListener = listener.getTextSelectListener()) == null) {
            return;
        }
        Paint paint = graph.getPaint();
        AbstractC5830k.m5327d(paint);
        int color = paint.getColor();
        Paint paint2 = graph.getPaint();
        AbstractC5830k.m5327d(paint2);
        textSelectListener.textSelected(color, paint2.getTextSize());
    }

    public final boolean changeTextColor(int color) {
        ITextSelectListener textSelectListener;
        TextGraph textGraph = this.selectedGraph;
        if (textGraph == null) {
            return false;
        }
        Paint paint = textGraph.getPaint();
        AbstractC5830k.m5327d(paint);
        paint.setColor(color);
        textGraph.setPaint(paint);
        IGraphControl graphControl = getGraphControl();
        if (graphControl != null) {
            graphControl.reDrawFixView();
        }
        IActionListener listener = getListener();
        if (listener != null && (textSelectListener = listener.getTextSelectListener()) != null) {
            textSelectListener.textColorChange(color);
        }
        IActionListener listener2 = getListener();
        if (listener2 != null) {
            IActionListener.DefaultImpls.changeGraph$default(listener2, textGraph, EzyGraphEnum$GraphEnum.TEXT_GRAPH, null, null, textGraph.getPaint(), null, null, null, 236, null);
        }
        IActionListener listener3 = getListener();
        if (listener3 == null) {
            return true;
        }
        listener3.saveSnapshot();
        return true;
    }

    public final boolean changeTextSize(float size) {
        ITextSelectListener textSelectListener;
        TextGraph textGraph = this.selectedGraph;
        if (textGraph == null || size > textGraph.getOriginalRectF().width()) {
            return false;
        }
        Paint paint = textGraph.getPaint();
        AbstractC5830k.m5327d(paint);
        paint.setTextSize(size);
        RectF rectF = new RectF(textGraph.getOriginalRectF());
        String content = textGraph.getContent();
        if (content == null) {
            content = "";
        }
        Paint paint2 = textGraph.getPaint();
        AbstractC5830k.m5327d(paint2);
        calculateRectF(content, paint2, rectF);
        textGraph.changeOriginalRectF(rectF);
        IGraphControl graphControl = getGraphControl();
        if (graphControl != null) {
            graphControl.reDrawFixView();
        }
        buildSelectedRectF(textGraph);
        IGraphControl graphControl2 = getGraphControl();
        if (graphControl2 != null) {
            RectF rectF2 = this.selectedRectF;
            AbstractC5830k.m5327d(rectF2);
            graphControl2.select(rectF2, this.selectedRectFMatrix, this.selectedRectFPaint, this.iconWidth, false);
        }
        IActionListener listener = getListener();
        if (listener != null && (textSelectListener = listener.getTextSelectListener()) != null) {
            textSelectListener.textSizeChange(size);
        }
        IActionListener listener2 = getListener();
        if (listener2 != null) {
            EzyGraphEnum$GraphEnum ezyGraphEnum$GraphEnum = EzyGraphEnum$GraphEnum.TEXT_GRAPH;
            RectF originalRectF = textGraph.getOriginalRectF();
            Paint paint3 = textGraph.getPaint();
            AbstractC5830k.m5327d(paint3);
            paint3.setColor(paint3.getColor());
            IActionListener.DefaultImpls.changeGraph$default(listener2, textGraph, ezyGraphEnum$GraphEnum, originalRectF, null, paint3, null, null, null, 232, null);
        }
        IActionListener listener3 = getListener();
        if (listener3 == null) {
            return true;
        }
        listener3.saveSnapshot();
        return true;
    }

    @Nullable
    public final TextGraph getSelectedGraph() {
        return this.selectedGraph;
    }

    @Nullable
    public final RectF getSelectedRectF() {
        return this.selectedRectF;
    }

    @NotNull
    public final Matrix getSelectedRectFMatrix() {
        return this.selectedRectFMatrix;
    }

    @Override // com.zykj.blackboard.core.action.MoveAction, com.zykj.blackboard.core.action.ITouchAction
    public void reset() {
        BoardConfig boardConfig = getBoardConfig();
        if (boardConfig != null) {
            this.textPaint.setColor(boardConfig.getAddTextOriginalTextColor());
            this.textPaint.setTextSize(boardConfig.getAddTextOriginalTextSize());
        }
        this.tempMatrixList.clear();
    }

    @Override // com.zykj.blackboard.core.action.MoveAction
    public void singleTouchCancel(@NotNull EzyTouchEvent$TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
        IGraphControl graphControl = getGraphControl();
        if (graphControl != null) {
            graphControl.reDrawFixView();
        }
        selectCancel();
    }

    @Override // com.zykj.blackboard.core.action.MoveAction
    public void singleTouchDown(@NotNull EzyTouchEvent$TouchEvent event) {
        IGraphControl graphControl;
        AbstractC5830k.m5330g(event, "event");
        this.isMove = false;
        PointF renderPointF = getRenderPointF(event.getX(), event.getY());
        this.firstX = renderPointF.x;
        this.firstY = renderPointF.y;
        boolean zIsClickInSelect = isClickInSelect(new PointF(this.firstX, this.firstY));
        this.isTextActionMode = zIsClickInSelect;
        if (zIsClickInSelect) {
            int i = this.currentTextActionType;
            if (i == TextActionType.TRANSLATE.getValue()) {
                IGraphControl graphControl2 = getGraphControl();
                if (graphControl2 != null) {
                    ArrayList arrayList = new ArrayList();
                    TextGraph textGraph = this.selectedGraph;
                    if (textGraph != null) {
                        arrayList.add(textGraph);
                    }
                    graphControl2.translationStart(arrayList);
                    return;
                }
                return;
            }
            if (i == TextActionType.SCALE.getValue()) {
                Matrix matrix = this.selectedRectFMatrix;
                RectF rectF = this.selectedRectF;
                AbstractC5830k.m5327d(rectF);
                this.firstSelectedWidth = matrix.mapRadius(rectF.width());
                TextGraph textGraph2 = this.selectedGraph;
                if (textGraph2 == null || (graphControl = getGraphControl()) == null) {
                    return;
                }
                graphControl.textHandleStart(textGraph2);
            }
        }
    }

    @Override // com.zykj.blackboard.core.action.MoveAction
    public void singleTouchMove(@NotNull EzyTouchEvent$TouchEvent event) {
        TextGraph textGraph;
        AbstractC5830k.m5330g(event, "event");
        if (isMove(event.getX(), event.getY())) {
            this.isMove = true;
        }
        if (this.isTextActionMode) {
            int i = this.currentTextActionType;
            if (i != TextActionType.TRANSLATE.getValue()) {
                if (i != TextActionType.SCALE.getValue() || (textGraph = this.selectedGraph) == null) {
                    return;
                }
                handleScale(textGraph, event.getX(), event.getY());
                IGraphControl graphControl = getGraphControl();
                if (graphControl != null) {
                    graphControl.textHandle(textGraph, this.selectedRectF, this.selectedRectFMatrix);
                    return;
                }
                return;
            }
            Matrix matrixHandleTranslate = handleTranslate(event.getX(), event.getY());
            IGraphControl graphControl2 = getGraphControl();
            if (graphControl2 != null) {
                ArrayList arrayList = new ArrayList();
                TextGraph textGraph2 = this.selectedGraph;
                if (textGraph2 != null) {
                    arrayList.add(textGraph2);
                }
                graphControl2.translation(arrayList, matrixHandleTranslate);
            }
            this.tempMatrixList.add(MatrixExtKt.toEzyMatrix(matrixHandleTranslate, System.currentTimeMillis()));
        }
    }

    @Override // com.zykj.blackboard.core.action.MoveAction
    public void singleTouchUp(@NotNull EzyTouchEvent$TouchEvent event) {
        IGraph rootGraph;
        TextGraph textGraph;
        AbstractC5830k.m5330g(event, "event");
        List<IGraph> childGraph = null;
        if (this.isTextActionMode) {
            if (isDoubleTap(event.getX(), event.getY())) {
                handleTextEdit(event.getX(), event.getY(), false);
            } else if (this.isMove) {
                int i = this.currentTextActionType;
                if (i == TextActionType.TRANSLATE.getValue()) {
                    this.selectedMatrix.postConcat(this.tempMatrix);
                    Matrix matrixHandleTranslate = handleTranslate(event.getX(), event.getY());
                    ArrayList arrayList = new ArrayList();
                    TextGraph textGraph2 = this.selectedGraph;
                    if (textGraph2 != null) {
                        arrayList.add(textGraph2);
                    }
                    IGraphControl graphControl = getGraphControl();
                    if (graphControl != null) {
                        graphControl.translationEnd(arrayList, matrixHandleTranslate);
                    }
                    this.tempMatrixList.add(MatrixExtKt.toEzyMatrix(matrixHandleTranslate, System.currentTimeMillis()));
                    IActionListener listener = getListener();
                    if (listener != null) {
                        listener.transformGraphEvent(arrayList, this.tempMatrixList);
                    }
                    IActionListener listener2 = getListener();
                    if (listener2 != null) {
                        listener2.saveSnapshot();
                    }
                } else if (i == TextActionType.SCALE.getValue() && (textGraph = this.selectedGraph) != null) {
                    handleScale(textGraph, event.getX(), event.getY());
                    IGraphControl graphControl2 = getGraphControl();
                    if (graphControl2 != null) {
                        graphControl2.textHandleEnd(textGraph, this.selectedRectF, this.selectedRectFMatrix);
                    }
                    IActionListener listener3 = getListener();
                    if (listener3 != null) {
                        IActionListener.DefaultImpls.changeGraph$default(listener3, textGraph, EzyGraphEnum$GraphEnum.TEXT_GRAPH, textGraph.getOriginalRectF(), null, null, null, null, null, 248, null);
                    }
                    IActionListener listener4 = getListener();
                    if (listener4 != null) {
                        listener4.saveSnapshot();
                    }
                }
            } else {
                if (this.currentTextActionType == TextActionType.DELETE.getValue()) {
                    ArrayList arrayList2 = new ArrayList();
                    TextGraph textGraph3 = this.selectedGraph;
                    if (textGraph3 != null) {
                        arrayList2.add(textGraph3);
                    }
                    IGraphControl graphControl3 = getGraphControl();
                    if (graphControl3 != null) {
                        graphControl3.delete(arrayList2);
                    }
                    selectCancel();
                    IActionListener listener5 = getListener();
                    if (listener5 != null) {
                        listener5.deleteGraphEvent(arrayList2, System.currentTimeMillis());
                    }
                    IActionListener listener6 = getListener();
                    if (listener6 != null) {
                        listener6.saveSnapshot();
                    }
                }
                IGraphControl graphControl4 = getGraphControl();
                if (graphControl4 != null) {
                    ArrayList arrayList3 = new ArrayList();
                    TextGraph textGraph4 = this.selectedGraph;
                    if (textGraph4 != null) {
                        arrayList3.add(textGraph4);
                    }
                    graphControl4.translationEnd(arrayList3, null);
                }
            }
        } else {
            if (this.isMove) {
                return;
            }
            this.selectedGraph = null;
            IGraphControl graphControl5 = getGraphControl();
            if (graphControl5 != null && (rootGraph = graphControl5.getRootGraph()) != null) {
                childGraph = rootGraph.getChildGraph();
            }
            if (childGraph != null && !childGraph.isEmpty()) {
                int size = childGraph.size() - 1;
                while (true) {
                    if (-1 < size) {
                        if ((childGraph.get(size) instanceof TextGraph) && childGraph.get(size).getRenderRectF().contains(event.getX(), event.getY())) {
                            IGraph iGraph = childGraph.get(size);
                            AbstractC5830k.m5328e(iGraph, "null cannot be cast to non-null type com.zykj.blackboard.core.graph.group.TextGraph");
                            this.selectedGraph = (TextGraph) iGraph;
                            break;
                        }
                        size--;
                    } else {
                        break;
                    }
                }
            }
            TextGraph textGraph5 = this.selectedGraph;
            if (textGraph5 != null) {
                AbstractC5830k.m5327d(textGraph5);
                selectGraph(textGraph5);
            } else if (this.selectedRectF == null) {
                handleTextEdit(event.getX(), event.getY(), true);
            } else {
                selectCancel();
            }
        }
        if (this.isMove) {
            return;
        }
        PointF renderPointF = getRenderPointF(event.getX(), event.getY());
        this.lastTapX = renderPointF.x;
        this.lastTapY = renderPointF.y;
        this.lastTapTime = System.currentTimeMillis();
    }
}
