package com.zykj.blackboard.core.action;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.board.EzyTouchEvent$TouchEvent;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u0016R$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010'\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010.\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00064"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/BaseTouchAction;", "Lcom/zykj/blackboard/core/action/ITouchAction;", "<init>", "()V", "", "isTouchable", "Lcom/zykj/board/EzyTouchEvent$TouchEvent;", NotificationCompat.CATEGORY_EVENT, "Lkotlin/Function0;", "Ld6/s;", "callback", "touchEnableCheck", "(ZLcom/zykj/board/EzyTouchEvent$TouchEvent;Lr6/a;)V", "onTouchDown", "(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V", "onTouchPointerDown", "onTouchMove", "onTouchPointerUp", "onTouchUp", "Lcom/zykj/blackboard/core/action/IActionListener;", "listener", "setActionListener", "(Lcom/zykj/blackboard/core/action/IActionListener;)V", "isSingleFingerInput", "(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Lr6/a;)V", "isFingerTouch", "(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Z", "Lcom/zykj/blackboard/core/action/IActionListener;", "getListener", "()Lcom/zykj/blackboard/core/action/IActionListener;", "setListener", "Lcom/zykj/blackboard/core/canvas/control/IGraphControl;", "graphControl", "Lcom/zykj/blackboard/core/canvas/control/IGraphControl;", "getGraphControl", "()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;", "setGraphControl", "(Lcom/zykj/blackboard/core/canvas/control/IGraphControl;)V", "Lcom/zykj/blackboard/bean/BoardConfig;", "boardConfig", "Lcom/zykj/blackboard/bean/BoardConfig;", "getBoardConfig", "()Lcom/zykj/blackboard/bean/BoardConfig;", "setBoardConfig", "(Lcom/zykj/blackboard/bean/BoardConfig;)V", "Lcom/zykj/blackboard/core/canvas/MatrixAdapter;", "matrixAdapter", "Lcom/zykj/blackboard/core/canvas/MatrixAdapter;", "getMatrixAdapter", "()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;", "setMatrixAdapter", "(Lcom/zykj/blackboard/core/canvas/MatrixAdapter;)V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public abstract class BaseTouchAction implements ITouchAction {

    @Nullable
    private BoardConfig boardConfig;

    @Nullable
    private IGraphControl graphControl;

    @Nullable
    private IActionListener listener;

    @Nullable
    private MatrixAdapter matrixAdapter;

    private final void touchEnableCheck(boolean isTouchable, EzyTouchEvent$TouchEvent event, InterfaceC6469a callback) {
        if (!isTouchable) {
            List<EzyTouchEvent$TouchEvent.PointerProperties> pointerPropertiesList = event.getPointerPropertiesList();
            AbstractC5830k.m5329f(pointerPropertiesList, "event.pointerPropertiesList");
            Iterator<T> it = pointerPropertiesList.iterator();
            while (it.hasNext()) {
                if (((EzyTouchEvent$TouchEvent.PointerProperties) it.next()).getToolType() == 1) {
                    return;
                }
            }
        }
        callback.invoke();
    }

    @Nullable
    public final BoardConfig getBoardConfig() {
        return this.boardConfig;
    }

    @Nullable
    public final IGraphControl getGraphControl() {
        return this.graphControl;
    }

    @Nullable
    public final IActionListener getListener() {
        return this.listener;
    }

    @Nullable
    public final MatrixAdapter getMatrixAdapter() {
        return this.matrixAdapter;
    }

    public final boolean isFingerTouch(@NotNull EzyTouchEvent$TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
        return event.getPointerPropertiesList().get(0).getToolType() == 1;
    }

    public final void isSingleFingerInput(@NotNull final EzyTouchEvent$TouchEvent event, @NotNull final InterfaceC6469a callback) {
        AbstractC5830k.m5330g(event, "event");
        AbstractC5830k.m5330g(callback, "callback");
        BoardConfig boardConfig = this.boardConfig;
        touchEnableCheck(boardConfig != null ? boardConfig.getIsFingerDraw() : false, event, new InterfaceC6469a() { // from class: com.zykj.blackboard.core.action.BaseTouchAction.isSingleFingerInput.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m13731invoke();
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m13731invoke() {
                List<EzyTouchEvent$TouchEvent.PointerProperties> pointerPropertiesList = event.getPointerPropertiesList();
                AbstractC5830k.m5329f(pointerPropertiesList, "event.pointerPropertiesList");
                if (pointerPropertiesList.isEmpty()) {
                    return;
                }
                List<EzyTouchEvent$TouchEvent.PointerProperties> pointerPropertiesList2 = event.getPointerPropertiesList();
                AbstractC5830k.m5329f(pointerPropertiesList2, "event.pointerPropertiesList");
                Object objM5228h0 = AbstractC5805t.m5228h0(pointerPropertiesList2);
                InterfaceC6469a interfaceC6469a = callback;
                if (((EzyTouchEvent$TouchEvent.PointerProperties) objM5228h0).getId() == 0) {
                    interfaceC6469a.invoke();
                }
            }
        });
    }

    @Override // com.zykj.blackboard.core.action.ITouchAction
    public void onTouchDown(@NotNull EzyTouchEvent$TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
    }

    @Override // com.zykj.blackboard.core.action.ITouchAction
    public void onTouchMove(@NotNull EzyTouchEvent$TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
    }

    @Override // com.zykj.blackboard.core.action.ITouchAction
    public void onTouchPointerDown(@NotNull EzyTouchEvent$TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
    }

    @Override // com.zykj.blackboard.core.action.ITouchAction
    public void onTouchPointerUp(@NotNull EzyTouchEvent$TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
    }

    @Override // com.zykj.blackboard.core.action.ITouchAction
    public void onTouchUp(@NotNull EzyTouchEvent$TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
    }

    public void setActionListener(@NotNull IActionListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
        this.listener = listener;
        this.boardConfig = listener.getBoardConfig();
        this.graphControl = listener.getGraphControl();
        this.matrixAdapter = listener.getMatrixAdapter();
    }

    public final void setBoardConfig(@Nullable BoardConfig boardConfig) {
        this.boardConfig = boardConfig;
    }

    public final void setGraphControl(@Nullable IGraphControl iGraphControl) {
        this.graphControl = iGraphControl;
    }

    public final void setListener(@Nullable IActionListener iActionListener) {
        this.listener = iActionListener;
    }

    public final void setMatrixAdapter(@Nullable MatrixAdapter matrixAdapter) {
        this.matrixAdapter = matrixAdapter;
    }
}
