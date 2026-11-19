package com.zykj.blackboard.core.action;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import androidx.core.internal.view.SupportMenu;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.utils.GraphUtilsKt;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.blackboard.utils.PointUtils;
import com.zykj.board.EzyTouchEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p300x7.InterfaceC10559a;

/* loaded from: classes4.dex */
public final class CursorAction extends MoveAction {
    private final ArrayList<EzyTouchEvent.TouchEvent> eventList;
    private final Paint mPaint;
    private float offsetForFinger;
    private final Path tempPath;
    private final PointF tempPointF;

    public CursorAction() {
        Paint paint = new Paint();
        paint.setStrokeWidth(20.0f);
        paint.setColor(SupportMenu.CATEGORY_MASK);
        paint.setStyle(Paint.Style.FILL);
        paint.setDither(true);
        paint.setAntiAlias(true);
        this.mPaint = paint;
        this.offsetForFinger = 50.0f;
        this.tempPath = new Path();
        this.tempPointF = new PointF();
        this.eventList = new ArrayList<>();
    }

    private final void handleTouch(final EzyTouchEvent.TouchEvent touchEvent) {
        isSingleFingerInput(touchEvent, new InterfaceC10559a() { // from class: com.zykj.blackboard.core.action.CursorAction.handleTouch.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27407invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27407invoke() {
                EzyTouchEvent.TouchEvent touchEventBuild;
                Matrix adapterMatrix;
                Matrix matrix;
                Matrix adapterMatrix2;
                CursorAction.this.tempPath.reset();
                CursorAction.this.tempPointF.set(touchEvent.getX(), touchEvent.getY());
                List pointerPropertiesList = touchEvent.getPointerPropertiesList();
                AbstractC9133u.m16132f(pointerPropertiesList, "event.pointerPropertiesList");
                int toolType = ((EzyTouchEvent.TouchEvent.PointerProperties) AbstractC8778f0.m14566l0(pointerPropertiesList)).getToolType();
                if (toolType == 1) {
                    MatrixAdapter matrixAdapter = CursorAction.this.getMatrixAdapter();
                    if (matrixAdapter != null && (adapterMatrix = matrixAdapter.getAdapterMatrix()) != null) {
                        EzyTouchEvent.TouchEvent touchEvent2 = touchEvent;
                        CursorAction cursorAction = CursorAction.this;
                        PointUtils pointUtils = PointUtils.INSTANCE;
                        PointF pointFMapPoint = pointUtils.mapPoint(touchEvent2.getX(), touchEvent2.getY(), adapterMatrix);
                        pointFMapPoint.y -= cursorAction.offsetForFinger;
                        cursorAction.tempPointF.set(pointUtils.mapPoint(pointFMapPoint, MatrixExtKt.invert(adapterMatrix)));
                    }
                    touchEventBuild = touchEvent.toBuilder().m9145B(CursorAction.this.tempPointF.x).m9146C(CursorAction.this.tempPointF.y).build();
                    AbstractC9133u.m16132f(touchEventBuild, "event.toBuilder().setX(t…etY(tempPointF.y).build()");
                } else if (toolType != 2) {
                    return;
                } else {
                    touchEventBuild = touchEvent;
                }
                Path path = CursorAction.this.tempPath;
                float f10 = CursorAction.this.tempPointF.x;
                float f11 = CursorAction.this.tempPointF.y;
                MatrixAdapter matrixAdapter2 = CursorAction.this.getMatrixAdapter();
                if (matrixAdapter2 == null || (adapterMatrix2 = matrixAdapter2.getAdapterMatrix()) == null || (matrix = MatrixExtKt.invert(adapterMatrix2)) == null) {
                    matrix = new Matrix();
                }
                path.addCircle(f10, f11, matrix.mapRadius(CursorAction.this.mPaint.getStrokeWidth() / 2), Path.Direction.CW);
                IGraphControl graphControl = CursorAction.this.getGraphControl();
                if (graphControl != null) {
                    Path path2 = CursorAction.this.tempPath;
                    Paint paint = CursorAction.this.mPaint;
                    MatrixAdapter matrixAdapter3 = CursorAction.this.getMatrixAdapter();
                    graphControl.drawPath(path2, paint, matrixAdapter3 != null ? matrixAdapter3.getAdapterMatrix() : null);
                }
                CursorAction.this.eventList.add(touchEventBuild);
            }
        });
    }

    private final void initPointConfig() {
        BoardConfig boardConfig = getBoardConfig();
        if (boardConfig != null) {
            this.mPaint.setColor(boardConfig.getCursorColor());
            this.mPaint.setStrokeWidth(boardConfig.getCursorWidth());
            this.offsetForFinger = boardConfig.getCursorOffset();
        }
    }

    @Override // com.zykj.blackboard.core.action.MoveAction, com.zykj.blackboard.core.action.ITouchAction
    public void reset() {
        this.tempPath.reset();
        this.eventList.clear();
    }

    @Override // com.zykj.blackboard.core.action.MoveAction
    public void singleTouchCancel(EzyTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
        IGraphControl graphControl = getGraphControl();
        if (graphControl != null) {
            graphControl.selectCancel();
        }
    }

    @Override // com.zykj.blackboard.core.action.MoveAction
    public void singleTouchDown(EzyTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
        initPointConfig();
        handleTouch(event);
    }

    @Override // com.zykj.blackboard.core.action.MoveAction
    public void singleTouchMove(EzyTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
        handleTouch(event);
    }

    @Override // com.zykj.blackboard.core.action.MoveAction
    public void singleTouchUp(EzyTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
        handleTouch(event);
        IGraphControl graphControl = getGraphControl();
        if (graphControl != null) {
            graphControl.selectCancel();
        }
        IActionListener listener = getListener();
        if (listener != null) {
            listener.moveCursor(this.eventList, GraphUtilsKt.covertEzyPaint(this.mPaint, 1.0f, 0.0f));
        }
    }
}
