package com.zykj.blackboard.core.action;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.graph.stroke.StrokeGraph;
import com.zykj.blackboard.utils.EventBus;
import com.zykj.blackboard.utils.EventKey;
import com.zykj.blackboard.utils.GraphUtils;
import com.zykj.board.EzyGraphEnum$GraphEnum;
import com.zykj.board.EzyTouchEvent$TouchEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u0003J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/WritingAction;", "Lcom/zykj/blackboard/core/action/BaseWriteAction;", "<init>", "()V", "Lcom/zykj/board/EzyGraphEnum$GraphEnum;", "getGraphEnum", "()Lcom/zykj/board/EzyGraphEnum$GraphEnum;", "Lcom/zykj/board/EzyTouchEvent$TouchEvent;", NotificationCompat.CATEGORY_EVENT, "Ld6/s;", "handleTouchDown", "(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V", "handleTouchMove", "handleTouchUp", "initPaint", "", "graphId", "Lcom/zykj/blackboard/core/graph/Graph;", "buildSimpleGraph", "(Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/Graph;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class WritingAction extends BaseWriteAction {
    public WritingAction() {
        EventBus.INSTANCE.register(EventKey.WRITE_NEW_GROUP, new InterfaceC6469a() { // from class: com.zykj.blackboard.core.action.WritingAction.1
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m13745invoke();
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m13745invoke() {
                WritingAction.this.setForceNeedNewGroup(true);
            }
        });
    }

    @Override // com.zykj.blackboard.core.action.BaseWriteAction
    @NotNull
    public Graph buildSimpleGraph(@NotNull String graphId) {
        AbstractC5830k.m5330g(graphId, "graphId");
        GraphUtils graphUtils = GraphUtils.INSTANCE;
        StrokeGraph strokeGraph = new StrokeGraph(graphId, graphUtils.findPointListRectF(getEventList()), null, null, null, 28, null);
        strokeGraph.updateEventList(getEventList());
        strokeGraph.setPath(graphUtils.eventConvertPath(getEventList()));
        strokeGraph.setPaint(new Paint(getPaint()), getPaintItemLength(), getPaintSpacing());
        strokeGraph.updateRenderRectF();
        return strokeGraph;
    }

    @Override // com.zykj.blackboard.core.action.BaseWriteAction
    @NotNull
    public EzyGraphEnum$GraphEnum getGraphEnum() {
        return EzyGraphEnum$GraphEnum.STROKE_GRAPH;
    }

    @Override // com.zykj.blackboard.core.action.BaseWriteAction
    public void handleTouchDown(@NotNull EzyTouchEvent$TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
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
    public void handleTouchMove(@NotNull EzyTouchEvent$TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
        getEventList().add(event);
        float f = 2;
        getTempPath().quadTo(getMFirstX(), getMFirstY(), (getMFirstX() + event.getX()) / f, (getMFirstY() + event.getY()) / f);
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
    public void handleTouchUp(@NotNull EzyTouchEvent$TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
        getEventList().add(event);
        float f = 2;
        getTempPath().quadTo(getMFirstX(), getMFirstY(), (getMFirstX() + event.getX()) / f, (getMFirstY() + event.getY()) / f);
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
        paint.setColor(boardConfig != null ? boardConfig.getPaintColor() : ViewCompat.MEASURED_STATE_MASK);
        BoardConfig boardConfig2 = getBoardConfig();
        paint.setStrokeWidth(boardConfig2 != null ? boardConfig2.getPaintWidth() : 3.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setDither(true);
        paint.setAntiAlias(true);
        BoardConfig boardConfig3 = getBoardConfig();
        if (boardConfig3 == null || !boardConfig3.getIsDottedLine()) {
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
