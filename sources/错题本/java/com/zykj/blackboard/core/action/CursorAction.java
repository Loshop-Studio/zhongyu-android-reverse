package com.zykj.blackboard.core.action;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.internal.view.SupportMenu;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.utils.GraphUtilsKt;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.blackboard.utils.PointUtils;
import com.zykj.board.C4401x0;
import com.zykj.board.EzyTouchEvent$TouchEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\tJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\tR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR$\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u001bj\b\u0012\u0004\u0012\u00020\u0006`\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/CursorAction;", "Lcom/zykj/blackboard/core/action/MoveAction;", "<init>", "()V", "Ld6/s;", "initPointConfig", "Lcom/zykj/board/EzyTouchEvent$TouchEvent;", NotificationCompat.CATEGORY_EVENT, "handleTouch", "(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V", "reset", "singleTouchDown", "singleTouchMove", "singleTouchUp", "singleTouchCancel", "Landroid/graphics/Paint;", "mPaint", "Landroid/graphics/Paint;", "", "offsetForFinger", "F", "Landroid/graphics/Path;", "tempPath", "Landroid/graphics/Path;", "Landroid/graphics/PointF;", "tempPointF", "Landroid/graphics/PointF;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "eventList", "Ljava/util/ArrayList;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class CursorAction extends MoveAction {

    @NotNull
    private final ArrayList<EzyTouchEvent$TouchEvent> eventList;

    @NotNull
    private final Paint mPaint;
    private float offsetForFinger;

    @NotNull
    private final Path tempPath;

    @NotNull
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

    private final void handleTouch(final EzyTouchEvent$TouchEvent event) {
        isSingleFingerInput(event, new InterfaceC6469a() { // from class: com.zykj.blackboard.core.action.CursorAction.handleTouch.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m13736invoke();
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m13736invoke() {
                EzyTouchEvent$TouchEvent ezyTouchEvent$TouchEventBuild;
                Matrix adapterMatrix;
                Matrix matrix;
                Matrix adapterMatrix2;
                CursorAction.this.tempPath.reset();
                CursorAction.this.tempPointF.set(event.getX(), event.getY());
                List<EzyTouchEvent$TouchEvent.PointerProperties> pointerPropertiesList = event.getPointerPropertiesList();
                AbstractC5830k.m5329f(pointerPropertiesList, "event.pointerPropertiesList");
                int toolType = ((EzyTouchEvent$TouchEvent.PointerProperties) AbstractC5805t.m5228h0(pointerPropertiesList)).getToolType();
                if (toolType == 1) {
                    MatrixAdapter matrixAdapter = CursorAction.this.getMatrixAdapter();
                    if (matrixAdapter != null && (adapterMatrix = matrixAdapter.getAdapterMatrix()) != null) {
                        EzyTouchEvent$TouchEvent ezyTouchEvent$TouchEvent = event;
                        CursorAction cursorAction = CursorAction.this;
                        PointUtils pointUtils = PointUtils.INSTANCE;
                        PointF pointFMapPoint = pointUtils.mapPoint(ezyTouchEvent$TouchEvent.getX(), ezyTouchEvent$TouchEvent.getY(), adapterMatrix);
                        pointFMapPoint.y -= cursorAction.offsetForFinger; // 手指在视口先上移，再换算成页坐标写入分片；手写笔沿用原点。
                        cursorAction.tempPointF.set(pointUtils.mapPoint(pointFMapPoint, MatrixExtKt.invert(adapterMatrix)));
                    }
                    C4401x0 builder = event.toBuilder();
                    builder.m3871j(CursorAction.this.tempPointF.x);
                    builder.m3872k(CursorAction.this.tempPointF.y);
                    ezyTouchEvent$TouchEventBuild = builder.build();
                } else if (toolType != 2) {
                    return;
                } else {
                    ezyTouchEvent$TouchEventBuild = event;
                }
                Path path = CursorAction.this.tempPath;
                float f = CursorAction.this.tempPointF.x;
                float f7 = CursorAction.this.tempPointF.y;
                MatrixAdapter matrixAdapter2 = CursorAction.this.getMatrixAdapter();
                if (matrixAdapter2 == null || (adapterMatrix2 = matrixAdapter2.getAdapterMatrix()) == null || (matrix = MatrixExtKt.invert(adapterMatrix2)) == null) {
                    matrix = new Matrix();
                }
                path.addCircle(f, f7, matrix.mapRadius(CursorAction.this.mPaint.getStrokeWidth() / 2), Path.Direction.CW);
                IGraphControl graphControl = CursorAction.this.getGraphControl();
                if (graphControl != null) {
                    Path path2 = CursorAction.this.tempPath;
                    Paint paint = CursorAction.this.mPaint;
                    MatrixAdapter matrixAdapter3 = CursorAction.this.getMatrixAdapter();
                    graphControl.drawPath(path2, paint, matrixAdapter3 != null ? matrixAdapter3.getAdapterMatrix() : null);
                }
                CursorAction.this.eventList.add(ezyTouchEvent$TouchEventBuild);
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
    public void singleTouchCancel(@NotNull EzyTouchEvent$TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
        IGraphControl graphControl = getGraphControl();
        if (graphControl != null) {
            graphControl.selectCancel();
        }
    }

    @Override // com.zykj.blackboard.core.action.MoveAction
    public void singleTouchDown(@NotNull EzyTouchEvent$TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
        initPointConfig();
        handleTouch(event);
    }

    @Override // com.zykj.blackboard.core.action.MoveAction
    public void singleTouchMove(@NotNull EzyTouchEvent$TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
        handleTouch(event);
    }

    @Override // com.zykj.blackboard.core.action.MoveAction
    public void singleTouchUp(@NotNull EzyTouchEvent$TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
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
