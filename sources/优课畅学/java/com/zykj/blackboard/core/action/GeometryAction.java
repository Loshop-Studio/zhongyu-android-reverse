package com.zykj.blackboard.core.action;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.blackboard.utils.PointUtils;
import com.zykj.board.EzyTouchEvent;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p123h7.C8736p;
import p134i7.AbstractC8809v;
import p300x7.InterfaceC10570l;

/* loaded from: classes4.dex */
public final class GeometryAction extends MoveAction {
    private float firstX;
    private float firstY;
    private final Paint paint;

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
        paint.setColor(-16777216);
        paint.setStrokeWidth(3.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setDither(true);
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.paint = paint;
    }

    private final PointF getRenderPointF(float f10, float f11) {
        PointUtils pointUtils = PointUtils.INSTANCE;
        MatrixAdapter matrixAdapter = getMatrixAdapter();
        AbstractC9133u.m16130d(matrixAdapter);
        return pointUtils.mapPoint(f10, f11, matrixAdapter.getAdapterMatrix());
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
    public void singleTouchCancel(EzyTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
    }

    @Override // com.zykj.blackboard.core.action.MoveAction
    public void singleTouchDown(EzyTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
        PointF renderPointF = getRenderPointF(event.getX(), event.getY());
        this.firstX = renderPointF.x;
        this.firstY = renderPointF.y;
    }

    @Override // com.zykj.blackboard.core.action.MoveAction
    public void singleTouchMove(EzyTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
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
        int i10 = geometryActionEnum == null ? -1 : WhenMappings.$EnumSwitchMapping$0[geometryActionEnum.ordinal()];
        if (i10 == 1) {
            path.addOval(new RectF(this.firstX, this.firstY, renderPointF.x, renderPointF.y), Path.Direction.CW);
        } else if (i10 == 2) {
            path.moveTo(this.firstX, this.firstY);
            path.lineTo(this.firstX, renderPointF.y);
            path.lineTo(renderPointF.x, renderPointF.y);
            path.lineTo(renderPointF.x, this.firstY);
            path.close();
        } else if (i10 == 3) {
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
    public void singleTouchUp(EzyTouchEvent.TouchEvent event) {
        Matrix matrix;
        Matrix adapterMatrix;
        AbstractC9133u.m16133g(event, "event");
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
        int i10 = (boardConfig2 != null ? boardConfig2.getGeometryActionEnum() : null) == GeometryActionEnum.OVAL ? 0 : 1;
        BoardConfig boardConfig3 = getBoardConfig();
        GeometryActionEnum geometryActionEnum = boardConfig3 != null ? boardConfig3.getGeometryActionEnum() : null;
        int i11 = geometryActionEnum == null ? -1 : WhenMappings.$EnumSwitchMapping$0[geometryActionEnum.ordinal()];
        List<? extends PointF> listM14771n = i11 != 1 ? i11 != 2 ? i11 != 3 ? AbstractC8809v.m14771n() : AbstractC8809v.m14774q(new PointF(fMapRadius / 2, 0.0f), new PointF(0.0f, fMapRadius2), new PointF(fMapRadius, fMapRadius2)) : AbstractC8809v.m14774q(new PointF(0.0f, 0.0f), new PointF(fMapRadius, 0.0f), new PointF(fMapRadius, fMapRadius2), new PointF(0.0f, fMapRadius2)) : AbstractC8809v.m14771n();
        IActionListener listener = getListener();
        if (listener != null) {
            listener.geometryGraphEvent(fMapRadius, fMapRadius2, AbstractC8323h.m13512g(this.firstX, renderPointF.x), AbstractC8323h.m13512g(this.firstY, renderPointF.y), i10, listM14771n, this.paint, new InterfaceC10570l() { // from class: com.zykj.blackboard.core.action.GeometryAction.singleTouchUp.1
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((IGraph) obj);
                    return C8736p.f16368a;
                }

                public final void invoke(IGraph it) {
                    InterfaceC10570l geometryCreateListener;
                    AbstractC9133u.m16133g(it, "it");
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
