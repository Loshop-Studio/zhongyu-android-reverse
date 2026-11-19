package com.zykj.blackboard.core.action;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.graph.stroke.StrokeGraph;
import com.zykj.blackboard.utils.EventBus;
import com.zykj.blackboard.utils.EventKey;
import com.zykj.blackboard.utils.GraphUtils;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyTouchEvent;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;

/* loaded from: classes4.dex */
public final class WritingAction extends BaseWriteAction {
    public WritingAction() {
        EventBus.INSTANCE.register(EventKey.WRITE_NEW_GROUP, new InterfaceC10559a() { // from class: com.zykj.blackboard.core.action.WritingAction.1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27416invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27416invoke() {
                WritingAction.this.setForceNeedNewGroup(true);
            }
        });
    }

    @Override // com.zykj.blackboard.core.action.BaseWriteAction
    public Graph buildSimpleGraph(String graphId) {
        AbstractC9133u.m16133g(graphId, "graphId");
        GraphUtils graphUtils = GraphUtils.INSTANCE;
        StrokeGraph strokeGraph = new StrokeGraph(graphId, graphUtils.findPointListRectF(getEventList()), null, null, null, 28, null);
        strokeGraph.updateEventList(getEventList());
        strokeGraph.setPath(graphUtils.eventConvertPath(getEventList()));
        strokeGraph.setPaint(new Paint(getPaint()), getPaintItemLength(), getPaintSpacing());
        strokeGraph.updateRenderRectF();
        return strokeGraph;
    }

    @Override // com.zykj.blackboard.core.action.BaseWriteAction
    public EzyGraphEnum.GraphEnum getGraphEnum() {
        return EzyGraphEnum.GraphEnum.STROKE_GRAPH;
    }

    @Override // com.zykj.blackboard.core.action.BaseWriteAction
    public void handleTouchDown(EzyTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
        getEventList().add(event);
        getTempPath().reset();
        getTempPath().moveTo(event.getX(), event.getY());
        getTempPath().lineTo(event.getX(), event.getY());
        setMFirstX(event.getX());
        setMFirstY(event.getY());
        IGraphControl graphControl = getGraphControl();
        if (graphControl != null) {
            Path tempPath = getTempPath();
            Paint paint = getPaint();
            MatrixAdapter matrixAdapter = getMatrixAdapter();
            graphControl.drawPath(tempPath, paint, matrixAdapter != null ? matrixAdapter.getAdapterMatrix() : null);
        }
    }

    @Override // com.zykj.blackboard.core.action.BaseWriteAction
    public void handleTouchMove(EzyTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
        getEventList().add(event);
        float f10 = 2;
        getTempPath().quadTo(getMFirstX(), getMFirstY(), (event.getX() + getMFirstX()) / f10, (event.getY() + getMFirstY()) / f10);
        setMFirstX(event.getX());
        setMFirstY(event.getY());
        IGraphControl graphControl = getGraphControl();
        if (graphControl != null) {
            Path tempPath = getTempPath();
            Paint paint = getPaint();
            MatrixAdapter matrixAdapter = getMatrixAdapter();
            graphControl.drawPath(tempPath, paint, matrixAdapter != null ? matrixAdapter.getAdapterMatrix() : null);
        }
    }

    @Override // com.zykj.blackboard.core.action.BaseWriteAction
    public void handleTouchUp(EzyTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
        getEventList().add(event);
        float f10 = 2;
        getTempPath().quadTo(getMFirstX(), getMFirstY(), (event.getX() + getMFirstX()) / f10, (event.getY() + getMFirstY()) / f10);
        getTempPath().lineTo(event.getX(), event.getY());
        IGraphControl graphControl = getGraphControl();
        if (graphControl != null) {
            Path tempPath = getTempPath();
            Paint paint = getPaint();
            MatrixAdapter matrixAdapter = getMatrixAdapter();
            graphControl.drawPath(tempPath, paint, matrixAdapter != null ? matrixAdapter.getAdapterMatrix() : null);
        }
    }

    @Override // com.zykj.blackboard.core.action.BaseWriteAction
    public void initPaint() {
        Paint paint = getPaint();
        BoardConfig boardConfig = getBoardConfig();
        paint.setColor(boardConfig != null ? boardConfig.getPaintColor() : -16777216);
        BoardConfig boardConfig2 = getBoardConfig();
        paint.setStrokeWidth(boardConfig2 != null ? boardConfig2.getPaintWidth() : 3.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setDither(true);
        paint.setAntiAlias(true);
        BoardConfig boardConfig3 = getBoardConfig();
        if (boardConfig3 == null || !boardConfig3.isDottedLine()) {
            setPaintItemLength(1.0f);
            setPaintSpacing(0.0f);
            paint.setPathEffect(null);
        } else {
            BoardConfig boardConfig4 = getBoardConfig();
            setPaintItemLength(boardConfig4 != null ? boardConfig4.getPaintDottedLineItemLength() : 30.0f);
            BoardConfig boardConfig5 = getBoardConfig();
            setPaintSpacing(boardConfig5 != null ? boardConfig5.getPaintDottedLineSpacing() : 15.0f);
            paint.setPathEffect(new DashPathEffect(new float[]{getPaintItemLength(), getPaintSpacing()}, 0.0f));
        }
    }
}
