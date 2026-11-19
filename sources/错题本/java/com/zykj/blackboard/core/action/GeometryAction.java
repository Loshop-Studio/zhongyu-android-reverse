package com.zykj.blackboard.core.action;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.blackboard.utils.PointUtils;
import com.zykj.board.EzyTouchEvent$TouchEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/GeometryAction;", "Lcom/zykj/blackboard/core/action/MoveAction;", "<init>", "()V", "", "x", "y", "Landroid/graphics/PointF;", "getRenderPointF", "(FF)Landroid/graphics/PointF;", "Ld6/s;", "reset", "Lcom/zykj/board/EzyTouchEvent$TouchEvent;", NotificationCompat.CATEGORY_EVENT, "singleTouchDown", "(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V", "singleTouchMove", "singleTouchUp", "singleTouchCancel", "firstX", "F", "firstY", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class GeometryAction extends MoveAction {
    private float firstX;
    private float firstY;

    @NotNull
    private final Paint paint;

    @Metadata(m5111k = 3, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GeometryActionEnum.values().length];
            iArr[GeometryActionEnum.OVAL.ordinal()] = 1;
            iArr[GeometryActionEnum.RECTANGLE.ordinal()] = 2;
            iArr[GeometryActionEnum.TRIANGLE.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public GeometryAction() {
        Paint paint = new Paint();
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
        paint.setStrokeWidth(3.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setDither(true);
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.paint = paint;
    }

    private final PointF getRenderPointF(float x3, float y2) {
        PointUtils pointUtils = PointUtils.INSTANCE;
        MatrixAdapter matrixAdapter = getMatrixAdapter();
        AbstractC5830k.m5327d(matrixAdapter);
        return pointUtils.mapPoint(x3, y2, matrixAdapter.getAdapterMatrix());
    }

    @Override // com.zykj.blackboard.core.action.MoveAction, com.zykj.blackboard.core.action.ITouchAction
    public void reset() {
        this.firstX = 0.0f;
        this.firstY = 0.0f;
        BoardConfig boardConfig = getBoardConfig();
        if (boardConfig != null) {
            this.paint.setColor(boardConfig.getGeometryStrokeColor());
            this.paint.setStrokeWidth(boardConfig.getGeometryStrokeWidth());
        }
    }

    @Override // com.zykj.blackboard.core.action.MoveAction
    public void singleTouchCancel(@NotNull EzyTouchEvent$TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
    }

    @Override // com.zykj.blackboard.core.action.MoveAction
    public void singleTouchDown(@NotNull EzyTouchEvent$TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
        PointF renderPointF = getRenderPointF(event.getX(), event.getY());
        this.firstX = renderPointF.x;
        this.firstY = renderPointF.y;
    }

    @Override // com.zykj.blackboard.core.action.MoveAction
    public void singleTouchMove(@NotNull EzyTouchEvent$TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
        PointF renderPointF = getRenderPointF(event.getX(), event.getY());
        BoardConfig boardConfig = getBoardConfig();
        float geometryMinSize = boardConfig != null ? boardConfig.getGeometryMinSize() : 70.0f;
        if (renderPointF.x - this.firstX < geometryMinSize || renderPointF.y - this.firstY < geometryMinSize) {
            IGraphControl graphControl = getGraphControl();
            if (graphControl != null) {
                graphControl.selectCancel();
                return;
            }
            return;
        }
        Path path = new Path();
        BoardConfig boardConfig2 = getBoardConfig();
        GeometryActionEnum geometryActionEnum = boardConfig2 != null ? boardConfig2.getGeometryActionEnum() : null;
        int i = geometryActionEnum == null ? -1 : WhenMappings.$EnumSwitchMapping$0[geometryActionEnum.ordinal()];
        if (i == 1) {
            path.addOval(new RectF(this.firstX, this.firstY, renderPointF.x, renderPointF.y), Path.Direction.CW);
        } else if (i == 2) {
            path.moveTo(this.firstX, this.firstY);
            path.lineTo(this.firstX, renderPointF.y);
            path.lineTo(renderPointF.x, renderPointF.y);
            path.lineTo(renderPointF.x, this.firstY);
            path.close();
        } else if (i == 3) {
            path.moveTo((this.firstX + renderPointF.x) / 2, this.firstY);
            path.lineTo(this.firstX, renderPointF.y);
            path.lineTo(renderPointF.x, renderPointF.y);
            path.close();
        }
        IGraphControl graphControl2 = getGraphControl();
        if (graphControl2 != null) {
            graphControl2.drawPath(path, this.paint, null);
        }
    }

    @Override // com.zykj.blackboard.core.action.MoveAction
    public void singleTouchUp(@NotNull EzyTouchEvent$TouchEvent event) {
        Matrix matrix;
        Matrix adapterMatrix;
        AbstractC5830k.m5330g(event, "event");
        IGraphControl graphControl = getGraphControl();
        if (graphControl != null) {
            graphControl.selectCancel();
        }
        PointF renderPointF = getRenderPointF(event.getX(), event.getY());
        BoardConfig boardConfig = getBoardConfig();
        float geometryMinSize = boardConfig != null ? boardConfig.getGeometryMinSize() : 70.0f;
        if (renderPointF.x - this.firstX < geometryMinSize || renderPointF.y - this.firstY < geometryMinSize) {
            IGraphControl graphControl2 = getGraphControl();
            if (graphControl2 != null) {
                graphControl2.selectCancel();
                return;
            }
            return;
        }
        MatrixAdapter matrixAdapter = getMatrixAdapter();
        if (matrixAdapter == null || (adapterMatrix = matrixAdapter.getAdapterMatrix()) == null || (matrix = MatrixExtKt.invert(adapterMatrix)) == null) {
            matrix = new Matrix();
        }
        float fMapRadius = matrix.mapRadius(Math.abs(renderPointF.x - this.firstX));
        float fMapRadius2 = matrix.mapRadius(Math.abs(renderPointF.y - this.firstY));
        BoardConfig boardConfig2 = getBoardConfig();
        int i = (boardConfig2 != null ? boardConfig2.getGeometryActionEnum() : null) == GeometryActionEnum.OVAL ? 0 : 1;
        BoardConfig boardConfig3 = getBoardConfig();
        GeometryActionEnum geometryActionEnum = boardConfig3 != null ? boardConfig3.getGeometryActionEnum() : null;
        int i8 = geometryActionEnum == null ? -1 : WhenMappings.$EnumSwitchMapping$0[geometryActionEnum.ordinal()];
        List<? extends PointF> listM5287z = i8 != 1 ? i8 != 2 ? i8 != 3 ? EmptyList.INSTANCE : AbstractC5806u.m5287z(new PointF(fMapRadius / 2, 0.0f), new PointF(0.0f, fMapRadius2), new PointF(fMapRadius, fMapRadius2)) : AbstractC5806u.m5287z(new PointF(0.0f, 0.0f), new PointF(fMapRadius, 0.0f), new PointF(fMapRadius, fMapRadius2), new PointF(0.0f, fMapRadius2)) : EmptyList.INSTANCE;
        IActionListener listener = getListener();
        if (listener != null) {
            float f = this.firstX;
            float f7 = renderPointF.x;
            float f8 = f > f7 ? f7 : f;
            float f9 = this.firstY;
            float f10 = renderPointF.y;
            listener.geometryGraphEvent(fMapRadius, fMapRadius2, f8, f9 > f10 ? f10 : f9, i, listM5287z, this.paint, new InterfaceC6471c() { // from class: com.zykj.blackboard.core.action.GeometryAction.singleTouchUp.1
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((IGraph) obj);
                    return C5443s.f8405a;
                }

                public final void invoke(@NotNull IGraph it) {
                    InterfaceC6471c geometryCreateListener;
                    AbstractC5830k.m5330g(it, "it");
                    IGraphControl graphControl3 = GeometryAction.this.getGraphControl();
                    if (graphControl3 != null) {
                        IGraphControl graphControl4 = GeometryAction.this.getGraphControl();
                        graphControl3.addGraph(graphControl4 != null ? graphControl4.rootGraphId() : null, it);
                    }
                    IActionListener listener2 = GeometryAction.this.getListener();
                    if (listener2 != null && (geometryCreateListener = listener2.getGeometryCreateListener()) != null) {
                        geometryCreateListener.invoke(it.getId());
                    }
                    IActionListener listener3 = GeometryAction.this.getListener();
                    if (listener3 != null) {
                        listener3.saveSnapshot();
                    }
                }
            });
        }
    }
}
