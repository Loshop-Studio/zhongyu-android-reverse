package com.zykj.blackboard.core.action;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import com.tencent.ijk.media.player.IjkMediaMeta;
import com.tencent.smtt.sdk.TbsListener;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.core.action.IActionListener;
import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.graph.group.TextGraph;
import com.zykj.blackboard.enums.TextActionType;
import com.zykj.blackboard.listener.ITextSelectListener;
import com.zykj.blackboard.listener.TextEditView;
import com.zykj.blackboard.utils.EventBus;
import com.zykj.blackboard.utils.EventKey;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.blackboard.utils.PointUtils;
import com.zykj.blackboard.utils.TextGraphUtils;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzyTouchEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8665e0;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes4.dex */
public final class TextAction extends MoveAction {
    private float firstSelectedWidth;
    private float firstX;
    private float firstY;
    private boolean isHandingEdit;
    private boolean isMove;
    private long lastTapTime;
    private float lastTapX;
    private float lastTapY;
    private TextGraph selectedGraph;
    private RectF selectedRectF;
    private final float minMoveDistance = 30.0f;
    private final int maxInterval = TbsListener.ErrorCode.INFO_CODE_MINIQB;
    private Matrix selectedRectFMatrix = new Matrix();
    private Matrix selectedMatrix = new Matrix();
    private Paint selectedRectFPaint = new Paint();
    private final float iconWidth = 50.0f;
    private int currentTextActionType = -1;
    private boolean isTextActionMode = true;
    private Paint textPaint = new Paint();
    private Matrix tempMatrix = new Matrix();
    private ArrayList<EzyMatrix.Matrix> tempMatrixList = new ArrayList<>();
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
        EventBus.INSTANCE.register(EventKey.TEXT_ACTION_SELECTED_CANCEL, new InterfaceC10559a() { // from class: com.zykj.blackboard.core.action.TextAction.1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27413invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27413invoke() {
                TextAction.this.selectCancel();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void buildSelectedRectF(IGraph iGraph) {
        Matrix adapterMatrix;
        if (this.selectedRectF == null) {
            this.selectedRectF = new RectF();
        }
        RectF rectF = this.selectedRectF;
        AbstractC9133u.m16130d(rectF);
        rectF.set(iGraph.getOriginalRectF());
        Matrix matrix = this.selectedRectFMatrix;
        matrix.reset();
        matrix.postConcat(iGraph.getRenderMatrix());
        MatrixAdapter matrixAdapter = getMatrixAdapter();
        if (matrixAdapter != null && (adapterMatrix = matrixAdapter.getAdapterMatrix()) != null) {
            matrix.postConcat(adapterMatrix);
        }
        this.selectedMatrix.reset();
    }

    private final TextGraph buildTextGraph(RectF rectF, float f10, float f11, String str) {
        TextGraph textGraph = new TextGraph("", new RectF(rectF), null, null, null, 28, null);
        Matrix matrix = new Matrix();
        matrix.setTranslate(f10, f11);
        MatrixAdapter matrixAdapter = getMatrixAdapter();
        Matrix adapterMatrix = matrixAdapter != null ? matrixAdapter.getAdapterMatrix() : null;
        AbstractC9133u.m16130d(adapterMatrix);
        matrix.postConcat(MatrixExtKt.invert(adapterMatrix));
        textGraph.concatMatrix(matrix);
        textGraph.setPaint(this.textPaint);
        textGraph.setContent(str);
        return textGraph;
    }

    private final float calculateRadians(float f10, float f11) {
        if (f10 == 0.0f) {
            return 0.0f;
        }
        return ((f10 > 0.0f ? 0.0f : (float) Math.toRadians(180.0d)) * (f11 > 0.0f ? -1 : 1)) + ((float) Math.atan(f11 / f10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RectF calculateRectF(String str, Paint paint, RectF rectF) {
        RectF addTextRectF;
        RectF addTextRectF2;
        float size = (paint.getFontMetrics().bottom - paint.getFontMetrics().top) * TextGraphUtils.INSTANCE.calculateTextToList(str, paint, rectF.width()).size();
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

    private final float calculateScaleOffset(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return ((float) Math.cos(calculateRadians(f12 - f10, f13 - f11) - calculateRadians(f16 - f14, f17 - f15))) * ((float) Math.sqrt((r7 * r7) + (r8 * r8)));
    }

    private final PointF getRenderPointF(float f10, float f11) {
        PointUtils pointUtils = PointUtils.INSTANCE;
        MatrixAdapter matrixAdapter = getMatrixAdapter();
        AbstractC9133u.m16130d(matrixAdapter);
        return pointUtils.mapPoint(f10, f11, matrixAdapter.getAdapterMatrix());
    }

    private final Matrix handleMatrix(Matrix matrix) {
        Matrix matrix2 = new Matrix();
        MatrixAdapter matrixAdapter = getMatrixAdapter();
        AbstractC9133u.m16130d(matrixAdapter);
        matrix2.postConcat(matrixAdapter.getAdapterMatrix());
        matrix2.postConcat(matrix);
        MatrixAdapter matrixAdapter2 = getMatrixAdapter();
        AbstractC9133u.m16130d(matrixAdapter2);
        matrix2.postConcat(MatrixExtKt.invert(matrixAdapter2.getAdapterMatrix()));
        return matrix2;
    }

    private final void handleScale(TextGraph textGraph, float f10, float f11) {
        Matrix adapterMatrix;
        PointF renderPointF = getRenderPointF(f10, f11);
        Matrix matrix = new Matrix();
        matrix.postConcat(textGraph.getRenderMatrix());
        MatrixAdapter matrixAdapter = getMatrixAdapter();
        if (matrixAdapter != null && (adapterMatrix = matrixAdapter.getAdapterMatrix()) != null) {
            matrix.postConcat(adapterMatrix);
        }
        PointUtils pointUtils = PointUtils.INSTANCE;
        PointF pointFMapPoint = pointUtils.mapPoint(textGraph.getOriginalRectF().left, textGraph.getOriginalRectF().bottom, matrix);
        PointF pointFMapPoint2 = pointUtils.mapPoint(textGraph.getOriginalRectF().right, textGraph.getOriginalRectF().bottom, matrix);
        float fCalculateScaleOffset = this.firstSelectedWidth + calculateScaleOffset(pointFMapPoint.x, pointFMapPoint.y, pointFMapPoint2.x, pointFMapPoint2.y, this.firstX, this.firstY, renderPointF.x, renderPointF.y);
        Paint paint = textGraph.getPaint();
        AbstractC9133u.m16130d(paint);
        String content = textGraph.getContent();
        AbstractC9133u.m16130d(content);
        float fMapRadius = matrix.mapRadius(paint.measureText(String.valueOf(AbstractC8665e0.m14031Y0(content))));
        if (fCalculateScaleOffset <= this.iconWidth + 10 || fCalculateScaleOffset <= fMapRadius) {
            return;
        }
        float fMapRadius2 = MatrixExtKt.invert(matrix).mapRadius(fCalculateScaleOffset);
        RectF rectF = new RectF(textGraph.getOriginalRectF());
        rectF.right = rectF.left + fMapRadius2;
        String content2 = textGraph.getContent();
        if (content2 == null) {
            content2 = "";
        }
        Paint paint2 = textGraph.getPaint();
        AbstractC9133u.m16130d(paint2);
        calculateRectF(content2, paint2, rectF);
        textGraph.changeOriginalRectF(rectF);
        buildSelectedRectF(textGraph);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleTextConfirm(boolean z10, RectF rectF, float f10, float f11, String str) {
        String str2;
        if (z10) {
            IActionListener listener = getListener();
            if (listener != null) {
                listener.textGraphEvent(rectF.width(), rectF.height(), f10, f11, this.textPaint, str, new InterfaceC10570l() { // from class: com.zykj.blackboard.core.action.TextAction.handleTextConfirm.1
                    {
                        super(1);
                    }

                    @Override // p300x7.InterfaceC10570l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((IGraph) obj);
                        return C8736p.f16368a;
                    }

                    public final void invoke(IGraph it) {
                        AbstractC9133u.m16133g(it, "it");
                        IGraphControl graphControl = TextAction.this.getGraphControl();
                        if (graphControl != null) {
                            IGraphControl graphControl2 = TextAction.this.getGraphControl();
                            graphControl.addGraph(graphControl2 != null ? graphControl2.rootGraphId() : null, it);
                        }
                        TextAction.this.selectedGraph = (TextGraph) it;
                        TextAction textAction = TextAction.this;
                        TextGraph selectedGraph = textAction.getSelectedGraph();
                        AbstractC9133u.m16130d(selectedGraph);
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
                AbstractC9133u.m16130d(textGraph);
                String id = textGraph.getId();
                TextGraph textGraph2 = this.selectedGraph;
                AbstractC9133u.m16130d(textGraph2);
                Paint paint = textGraph2.getPaint();
                AbstractC9133u.m16130d(paint);
                TextGraph textGraph3 = this.selectedGraph;
                AbstractC9133u.m16130d(textGraph3);
                str2 = str;
                graphControl.changeTextGraph(id, str2, paint, textGraph3.getOriginalRectF());
            } else {
                str2 = str;
            }
            IActionListener listener2 = getListener();
            if (listener2 != null) {
                TextGraph textGraph4 = this.selectedGraph;
                AbstractC9133u.m16130d(textGraph4);
                IActionListener.DefaultImpls.changeGraph$default(listener2, textGraph4, EzyGraphEnum.GraphEnum.TEXT_GRAPH, null, str2, null, null, null, null, IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, null);
            }
            IActionListener listener3 = getListener();
            if (listener3 != null) {
                listener3.saveSnapshot();
            }
        }
    }

    private final void handleTextEdit(float f10, float f11, final boolean z10) {
        final TextGraph textGraphBuildTextGraph;
        if (this.isHandingEdit) {
            return;
        }
        this.isHandingEdit = true;
        BoardConfig boardConfig = getBoardConfig();
        if (boardConfig != null) {
            final PointF renderPointF = getRenderPointF(f10, f11);
            if (z10 || (textGraphBuildTextGraph = this.selectedGraph) == null) {
                textGraphBuildTextGraph = buildTextGraph(boardConfig.getAddTextRectF(), renderPointF.x, renderPointF.y, boardConfig.getAddTextOriginalText());
            } else {
                AbstractC9133u.m16130d(textGraphBuildTextGraph);
            }
            buildSelectedRectF(textGraphBuildTextGraph);
            IGraphControl graphControl = getGraphControl();
            if (graphControl != null) {
                graphControl.selectCancel();
            }
            IGraphControl graphControl2 = getGraphControl();
            if (graphControl2 != null) {
                RectF rectF = this.selectedRectF;
                AbstractC9133u.m16130d(rectF);
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
                textEditView.showEditView(content2 != null ? content2 : "", new InterfaceC10570l() { // from class: com.zykj.blackboard.core.action.TextAction$handleTextEdit$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p300x7.InterfaceC10570l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((String) obj);
                        return C8736p.f16368a;
                    }

                    public final void invoke(String it) {
                        AbstractC9133u.m16133g(it, "it");
                        TextAction textAction = this.this$0;
                        Paint paint = textGraphBuildTextGraph.getPaint();
                        AbstractC9133u.m16130d(paint);
                        RectF rectFCalculateRectF = textAction.calculateRectF(it, paint, new RectF(textGraphBuildTextGraph.getOriginalRectF()));
                        if (!AbstractC9133u.m16128b(rectFCalculateRectF, textGraphBuildTextGraph.getOriginalRectF())) {
                            textGraphBuildTextGraph.changeOriginalRectF(rectFCalculateRectF);
                        }
                        textGraphBuildTextGraph.setContent(it);
                        this.this$0.buildSelectedRectF(textGraphBuildTextGraph);
                        IGraphControl graphControl4 = this.this$0.getGraphControl();
                        if (graphControl4 != null) {
                            RectF selectedRectF = this.this$0.getSelectedRectF();
                            AbstractC9133u.m16130d(selectedRectF);
                            graphControl4.select(selectedRectF, this.this$0.getSelectedRectFMatrix(), this.this$0.selectedRectFPaint, this.this$0.iconWidth, false);
                        }
                        IGraphControl graphControl5 = this.this$0.getGraphControl();
                        if (graphControl5 != null) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(textGraphBuildTextGraph);
                            graphControl5.drawGraphInActive(arrayList2);
                        }
                    }
                }, new InterfaceC10570l() { // from class: com.zykj.blackboard.core.action.TextAction$handleTextEdit$1$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p300x7.InterfaceC10570l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((String) obj);
                        return C8736p.f16368a;
                    }

                    public final void invoke(String it) {
                        AbstractC9133u.m16133g(it, "it");
                        TextAction textAction = this.this$0;
                        boolean z11 = z10;
                        RectF originalRectF = textGraphBuildTextGraph.getOriginalRectF();
                        PointF pointF = renderPointF;
                        textAction.handleTextConfirm(z11, originalRectF, pointF.x, pointF.y, it);
                        this.this$0.isHandingEdit = false;
                    }
                }, new InterfaceC10559a() { // from class: com.zykj.blackboard.core.action.TextAction$handleTextEdit$1$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p300x7.InterfaceC10559a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m27414invoke();
                        return C8736p.f16368a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m27414invoke() {
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

    private final Matrix handleTranslate(float f10, float f11) {
        PointF renderPointF = getRenderPointF(f10, f11);
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
        AbstractC9133u.m16130d(rectF);
        float f10 = rectF.right - fMapRadius;
        RectF rectF2 = this.selectedRectF;
        AbstractC9133u.m16130d(rectF2);
        float f11 = rectF2.top - fMapRadius;
        RectF rectF3 = this.selectedRectF;
        AbstractC9133u.m16130d(rectF3);
        float f12 = rectF3.right + fMapRadius;
        RectF rectF4 = this.selectedRectF;
        AbstractC9133u.m16130d(rectF4);
        RectF rectF5 = new RectF(f10, f11, f12, rectF4.top + fMapRadius);
        RectF rectF6 = this.selectedRectF;
        AbstractC9133u.m16130d(rectF6);
        float f13 = rectF6.right - fMapRadius;
        RectF rectF7 = this.selectedRectF;
        AbstractC9133u.m16130d(rectF7);
        float f14 = rectF7.bottom - fMapRadius;
        RectF rectF8 = this.selectedRectF;
        AbstractC9133u.m16130d(rectF8);
        float f15 = rectF8.right + fMapRadius;
        RectF rectF9 = this.selectedRectF;
        AbstractC9133u.m16130d(rectF9);
        RectF rectF10 = new RectF(f13, f14, f15, rectF9.bottom + fMapRadius);
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
        AbstractC9133u.m16130d(rectF11);
        if (!pointUtils.isPointInRect(rectF11, matrix, pointF)) {
            return false;
        }
        this.currentTextActionType = TextActionType.TRANSLATE.getValue();
        return true;
    }

    private final boolean isDoubleTap(float f10, float f11) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!this.isMove) {
            PointF renderPointF = getRenderPointF(f10, f11);
            double d10 = 2;
            float fSqrt = (float) Math.sqrt(((float) Math.pow(renderPointF.x - this.lastTapX, d10)) + ((float) Math.pow(renderPointF.y - this.lastTapY, d10)));
            if (jCurrentTimeMillis - this.lastTapTime < this.maxInterval && fSqrt < this.minMoveDistance) {
                return true;
            }
        }
        return false;
    }

    private final boolean isMove(float f10, float f11) {
        PointF renderPointF = getRenderPointF(f10, f11);
        double d10 = 2;
        return ((float) Math.sqrt((double) (((float) Math.pow((double) (renderPointF.x - this.firstX), d10)) + ((float) Math.pow((double) (renderPointF.y - this.firstY), d10))))) > this.minMoveDistance;
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
    public final void selectGraph(TextGraph textGraph) {
        ITextSelectListener textSelectListener;
        buildSelectedRectF(textGraph);
        IGraphControl graphControl = getGraphControl();
        if (graphControl != null) {
            RectF rectF = this.selectedRectF;
            AbstractC9133u.m16130d(rectF);
            graphControl.select(rectF, this.selectedRectFMatrix, this.selectedRectFPaint, this.iconWidth, false);
        }
        IActionListener listener = getListener();
        if (listener == null || (textSelectListener = listener.getTextSelectListener()) == null) {
            return;
        }
        Paint paint = textGraph.getPaint();
        AbstractC9133u.m16130d(paint);
        int color = paint.getColor();
        Paint paint2 = textGraph.getPaint();
        AbstractC9133u.m16130d(paint2);
        textSelectListener.textSelected(color, paint2.getTextSize());
    }

    public final boolean changeTextColor(int i10) {
        ITextSelectListener textSelectListener;
        TextGraph textGraph = this.selectedGraph;
        if (textGraph == null) {
            return false;
        }
        Paint paint = textGraph.getPaint();
        AbstractC9133u.m16130d(paint);
        paint.setColor(i10);
        textGraph.setPaint(paint);
        IGraphControl graphControl = getGraphControl();
        if (graphControl != null) {
            graphControl.reDrawFixView();
        }
        IActionListener listener = getListener();
        if (listener != null && (textSelectListener = listener.getTextSelectListener()) != null) {
            textSelectListener.textColorChange(i10);
        }
        IActionListener listener2 = getListener();
        if (listener2 != null) {
            IActionListener.DefaultImpls.changeGraph$default(listener2, textGraph, EzyGraphEnum.GraphEnum.TEXT_GRAPH, null, null, textGraph.getPaint(), null, null, null, 236, null);
        }
        IActionListener listener3 = getListener();
        if (listener3 == null) {
            return true;
        }
        listener3.saveSnapshot();
        return true;
    }

    public final boolean changeTextSize(float f10) {
        ITextSelectListener textSelectListener;
        TextGraph textGraph = this.selectedGraph;
        if (textGraph == null || f10 > textGraph.getOriginalRectF().width()) {
            return false;
        }
        Paint paint = textGraph.getPaint();
        AbstractC9133u.m16130d(paint);
        paint.setTextSize(f10);
        RectF rectF = new RectF(textGraph.getOriginalRectF());
        String content = textGraph.getContent();
        if (content == null) {
            content = "";
        }
        Paint paint2 = textGraph.getPaint();
        AbstractC9133u.m16130d(paint2);
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
            AbstractC9133u.m16130d(rectF2);
            graphControl2.select(rectF2, this.selectedRectFMatrix, this.selectedRectFPaint, this.iconWidth, false);
        }
        IActionListener listener = getListener();
        if (listener != null && (textSelectListener = listener.getTextSelectListener()) != null) {
            textSelectListener.textSizeChange(f10);
        }
        IActionListener listener2 = getListener();
        if (listener2 != null) {
            EzyGraphEnum.GraphEnum graphEnum = EzyGraphEnum.GraphEnum.TEXT_GRAPH;
            RectF originalRectF = textGraph.getOriginalRectF();
            Paint paint3 = textGraph.getPaint();
            AbstractC9133u.m16130d(paint3);
            paint3.setColor(paint3.getColor());
            C8736p c8736p = C8736p.f16368a;
            IActionListener.DefaultImpls.changeGraph$default(listener2, textGraph, graphEnum, originalRectF, null, paint3, null, null, null, 232, null);
        }
        IActionListener listener3 = getListener();
        if (listener3 == null) {
            return true;
        }
        listener3.saveSnapshot();
        return true;
    }

    public final TextGraph getSelectedGraph() {
        return this.selectedGraph;
    }

    public final RectF getSelectedRectF() {
        return this.selectedRectF;
    }

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
    public void singleTouchCancel(EzyTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
        IGraphControl graphControl = getGraphControl();
        if (graphControl != null) {
            graphControl.reDrawFixView();
        }
        selectCancel();
    }

    @Override // com.zykj.blackboard.core.action.MoveAction
    public void singleTouchDown(EzyTouchEvent.TouchEvent event) {
        IGraphControl graphControl;
        AbstractC9133u.m16133g(event, "event");
        this.isMove = false;
        PointF renderPointF = getRenderPointF(event.getX(), event.getY());
        this.firstX = renderPointF.x;
        this.firstY = renderPointF.y;
        boolean zIsClickInSelect = isClickInSelect(new PointF(this.firstX, this.firstY));
        this.isTextActionMode = zIsClickInSelect;
        if (zIsClickInSelect) {
            int i10 = this.currentTextActionType;
            if (i10 == TextActionType.TRANSLATE.getValue()) {
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
            if (i10 == TextActionType.SCALE.getValue()) {
                Matrix matrix = this.selectedRectFMatrix;
                RectF rectF = this.selectedRectF;
                AbstractC9133u.m16130d(rectF);
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
    public void singleTouchMove(EzyTouchEvent.TouchEvent event) {
        TextGraph textGraph;
        AbstractC9133u.m16133g(event, "event");
        if (isMove(event.getX(), event.getY())) {
            this.isMove = true;
        }
        if (this.isTextActionMode) {
            int i10 = this.currentTextActionType;
            if (i10 != TextActionType.TRANSLATE.getValue()) {
                if (i10 != TextActionType.SCALE.getValue() || (textGraph = this.selectedGraph) == null) {
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
    public void singleTouchUp(EzyTouchEvent.TouchEvent event) {
        IGraph iGraphRootGraph;
        TextGraph textGraph;
        AbstractC9133u.m16133g(event, "event");
        List<IGraph> childGraph = null;
        if (this.isTextActionMode) {
            if (isDoubleTap(event.getX(), event.getY())) {
                handleTextEdit(event.getX(), event.getY(), false);
            } else if (this.isMove) {
                int i10 = this.currentTextActionType;
                if (i10 == TextActionType.TRANSLATE.getValue()) {
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
                } else if (i10 == TextActionType.SCALE.getValue() && (textGraph = this.selectedGraph) != null) {
                    handleScale(textGraph, event.getX(), event.getY());
                    IGraphControl graphControl2 = getGraphControl();
                    if (graphControl2 != null) {
                        graphControl2.textHandleEnd(textGraph, this.selectedRectF, this.selectedRectFMatrix);
                    }
                    IActionListener listener3 = getListener();
                    if (listener3 != null) {
                        IActionListener.DefaultImpls.changeGraph$default(listener3, textGraph, EzyGraphEnum.GraphEnum.TEXT_GRAPH, textGraph.getOriginalRectF(), null, null, null, null, null, 248, null);
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
            if (graphControl5 != null && (iGraphRootGraph = graphControl5.rootGraph()) != null) {
                childGraph = iGraphRootGraph.getChildGraph();
            }
            if (childGraph != null && !childGraph.isEmpty()) {
                int size = childGraph.size() - 1;
                while (true) {
                    if (-1 < size) {
                        if ((childGraph.get(size) instanceof TextGraph) && childGraph.get(size).getRenderRectF().contains(event.getX(), event.getY())) {
                            IGraph iGraph = childGraph.get(size);
                            AbstractC9133u.m16131e(iGraph, "null cannot be cast to non-null type com.zykj.blackboard.core.graph.group.TextGraph");
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
                AbstractC9133u.m16130d(textGraph5);
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
