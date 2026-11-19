package com.zykj.sketch.core.action;

import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.core.listener.IAction;
import com.zykj.sketch.core.listener.IControl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes6.dex */
public abstract class BaseAction implements IAction {
    private IControl actionControl;
    private List<EzyDrawBoard.ActionTouchEvent.TouchEvent> list;
    private boolean record;
    private long startTime;

    public BaseAction(IControl actionControl) {
        AbstractC9979u.m20294g(actionControl, "actionControl");
        this.actionControl = actionControl;
        this.list = new ArrayList();
    }

    public static /* synthetic */ boolean isTouchEnable$default(BaseAction baseAction, EzyDrawBoard.ActionTouchEvent.TouchEvent touchEvent, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isTouchEnable");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return baseAction.isTouchEnable(touchEvent, z10);
    }

    @Override // com.zykj.sketch.core.listener.IAction
    public List<EzyDrawBoard.ActionTouchEvent.TouchEvent> getTouchEventList() {
        return this.list;
    }

    @Override // com.zykj.sketch.core.listener.IAction
    public long getTouchStartTime() {
        return this.startTime;
    }

    @Override // com.zykj.sketch.core.listener.IAction
    public boolean isRecord() {
        return this.record;
    }

    public final boolean isTouchEnable(EzyDrawBoard.ActionTouchEvent.TouchEvent event, boolean z10) {
        AbstractC9979u.m20294g(event, "event");
        if (!this.actionControl.getSketchConfig().isTouchable()) {
            List<EzyDrawBoard.ActionTouchEvent.TouchEvent.PointerProperties> pointerPropertiesList = event.getPointerPropertiesList();
            AbstractC9979u.m20293f(pointerPropertiesList, "event.pointerPropertiesList");
            Iterator<T> it = pointerPropertiesList.iterator();
            while (it.hasNext()) {
                if (((EzyDrawBoard.ActionTouchEvent.TouchEvent.PointerProperties) it.next()).getToolType() == 1) {
                    return false;
                }
            }
        }
        return !z10 || event.getPointerPropertiesList().get(0).getId() == 0;
    }

    @Override // com.zykj.sketch.core.listener.IAction
    public void onTouchDown(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
        this.startTime = event.getEventTime();
        this.list.add(event);
    }

    @Override // com.zykj.sketch.core.listener.IAction
    public void onTouchMove(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
        this.list.add(event);
    }

    @Override // com.zykj.sketch.core.listener.IAction
    public void onTouchPointerDown(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
        this.list.add(event);
    }

    @Override // com.zykj.sketch.core.listener.IAction
    public void onTouchPointerUp(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
        this.list.add(event);
    }

    @Override // com.zykj.sketch.core.listener.IAction
    public void onTouchUp(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
        this.list.add(event);
    }

    @Override // com.zykj.sketch.core.listener.IAction
    public void setRecord(boolean z10) {
        this.record = z10;
    }
}
