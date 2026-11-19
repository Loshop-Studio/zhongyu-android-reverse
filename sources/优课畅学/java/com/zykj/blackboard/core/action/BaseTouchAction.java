package com.zykj.blackboard.core.action;

import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.board.EzyTouchEvent;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p300x7.InterfaceC10559a;

/* loaded from: classes4.dex */
public abstract class BaseTouchAction implements ITouchAction {
    private BoardConfig boardConfig;
    private IGraphControl graphControl;
    private IActionListener listener;
    private MatrixAdapter matrixAdapter;

    private final void touchEnableCheck(boolean z10, EzyTouchEvent.TouchEvent touchEvent, InterfaceC10559a interfaceC10559a) {
        if (!z10) {
            List pointerPropertiesList = touchEvent.getPointerPropertiesList();
            AbstractC9133u.m16132f(pointerPropertiesList, "event.pointerPropertiesList");
            Iterator it = pointerPropertiesList.iterator();
            while (it.hasNext()) {
                if (((EzyTouchEvent.TouchEvent.PointerProperties) it.next()).getToolType() == 1) {
                    return;
                }
            }
        }
        interfaceC10559a.invoke();
    }

    public final BoardConfig getBoardConfig() {
        return this.boardConfig;
    }

    public final IGraphControl getGraphControl() {
        return this.graphControl;
    }

    public final IActionListener getListener() {
        return this.listener;
    }

    public final MatrixAdapter getMatrixAdapter() {
        return this.matrixAdapter;
    }

    public final boolean isFingerTouch(EzyTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
        return ((EzyTouchEvent.TouchEvent.PointerProperties) event.getPointerPropertiesList().get(0)).getToolType() == 1;
    }

    public final void isSingleFingerInput(final EzyTouchEvent.TouchEvent event, final InterfaceC10559a callback) {
        AbstractC9133u.m16133g(event, "event");
        AbstractC9133u.m16133g(callback, "callback");
        BoardConfig boardConfig = this.boardConfig;
        touchEnableCheck(boardConfig != null ? boardConfig.isFingerDraw() : false, event, new InterfaceC10559a() { // from class: com.zykj.blackboard.core.action.BaseTouchAction.isSingleFingerInput.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27402invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27402invoke() {
                List pointerPropertiesList = event.getPointerPropertiesList();
                AbstractC9133u.m16132f(pointerPropertiesList, "event.pointerPropertiesList");
                if (pointerPropertiesList.isEmpty()) {
                    return;
                }
                List pointerPropertiesList2 = event.getPointerPropertiesList();
                AbstractC9133u.m16132f(pointerPropertiesList2, "event.pointerPropertiesList");
                Object objM14566l0 = AbstractC8778f0.m14566l0(pointerPropertiesList2);
                InterfaceC10559a interfaceC10559a = callback;
                if (((EzyTouchEvent.TouchEvent.PointerProperties) objM14566l0).getId() == 0) {
                    interfaceC10559a.invoke();
                }
            }
        });
    }

    @Override // com.zykj.blackboard.core.action.ITouchAction
    public void onTouchDown(EzyTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
    }

    @Override // com.zykj.blackboard.core.action.ITouchAction
    public void onTouchMove(EzyTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
    }

    @Override // com.zykj.blackboard.core.action.ITouchAction
    public void onTouchPointerDown(EzyTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
    }

    @Override // com.zykj.blackboard.core.action.ITouchAction
    public void onTouchPointerUp(EzyTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
    }

    @Override // com.zykj.blackboard.core.action.ITouchAction
    public void onTouchUp(EzyTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
    }

    public void setActionListener(IActionListener listener) {
        AbstractC9133u.m16133g(listener, "listener");
        this.listener = listener;
        this.boardConfig = listener.getBoardConfig();
        this.graphControl = listener.getGraphControl();
        this.matrixAdapter = listener.getMatrixAdapter();
    }

    public final void setBoardConfig(BoardConfig boardConfig) {
        this.boardConfig = boardConfig;
    }

    public final void setGraphControl(IGraphControl iGraphControl) {
        this.graphControl = iGraphControl;
    }

    public final void setListener(IActionListener iActionListener) {
        this.listener = iActionListener;
    }

    public final void setMatrixAdapter(MatrixAdapter matrixAdapter) {
        this.matrixAdapter = matrixAdapter;
    }
}
