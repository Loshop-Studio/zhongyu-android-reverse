package com.zykj.sketch.core.action;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.core.listener.IAction;
import com.zykj.sketch.core.listener.IControl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010#¨\u0006$"}, m5110d2 = {"Lcom/zykj/sketch/core/action/BaseAction;", "Lcom/zykj/sketch/core/listener/IAction;", "Lcom/zykj/sketch/core/listener/IControl;", "actionControl", "<init>", "(Lcom/zykj/sketch/core/listener/IControl;)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;", NotificationCompat.CATEGORY_EVENT, "Ld6/s;", "onTouchDown", "(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V", "onTouchPointerDown", "onTouchMove", "onTouchPointerUp", "onTouchUp", "", "getTouchEventList", "()Ljava/util/List;", "", "getTouchStartTime", "()J", "", "isRecord", "()Z", "record", "setRecord", "(Z)V", "onlyFlag", "isTouchEnable", "(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;Z)Z", "Lcom/zykj/sketch/core/listener/IControl;", "list", "Ljava/util/List;", "startTime", "J", "Z", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public abstract class BaseAction implements IAction {

    @NotNull
    private IControl actionControl;

    @NotNull
    private List<EzyDrawBoard.ActionTouchEvent.TouchEvent> list;
    private boolean record;
    private long startTime;

    public BaseAction(@NotNull IControl actionControl) {
        AbstractC5830k.m5330g(actionControl, "actionControl");
        this.actionControl = actionControl;
        this.list = new ArrayList();
    }

    public static /* synthetic */ boolean isTouchEnable$default(BaseAction baseAction, EzyDrawBoard.ActionTouchEvent.TouchEvent touchEvent, boolean z8, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isTouchEnable");
        }
        if ((i & 2) != 0) {
            z8 = true;
        }
        return baseAction.isTouchEnable(touchEvent, z8);
    }

    @Override // com.zykj.sketch.core.listener.IAction
    @NotNull
    public List<EzyDrawBoard.ActionTouchEvent.TouchEvent> getTouchEventList() {
        return this.list;
    }

    @Override // com.zykj.sketch.core.listener.IAction
    /* renamed from: getTouchStartTime, reason: from getter */
    public long getStartTime() {
        return this.startTime;
    }

    @Override // com.zykj.sketch.core.listener.IAction
    /* renamed from: isRecord, reason: from getter */
    public boolean getRecord() {
        return this.record;
    }

    public final boolean isTouchEnable(@NotNull EzyDrawBoard.ActionTouchEvent.TouchEvent event, boolean onlyFlag) {
        AbstractC5830k.m5330g(event, "event");
        if (!this.actionControl.getSketchConfig().getIsTouchable()) {
            List<EzyDrawBoard.ActionTouchEvent.TouchEvent.PointerProperties> pointerPropertiesList = event.getPointerPropertiesList();
            AbstractC5830k.m5329f(pointerPropertiesList, "event.pointerPropertiesList");
            Iterator<T> it = pointerPropertiesList.iterator();
            while (it.hasNext()) {
                if (((EzyDrawBoard.ActionTouchEvent.TouchEvent.PointerProperties) it.next()).getToolType() == 1) {
                    return false;
                }
            }
        }
        return !onlyFlag || event.getPointerPropertiesList().get(0).getId() == 0;
    }

    @Override // com.zykj.sketch.core.listener.IAction
    public void onTouchDown(@NotNull EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
        this.startTime = event.getEventTime();
        this.list.add(event);
    }

    @Override // com.zykj.sketch.core.listener.IAction
    public void onTouchMove(@NotNull EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
        this.list.add(event);
    }

    @Override // com.zykj.sketch.core.listener.IAction
    public void onTouchPointerDown(@NotNull EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
        this.list.add(event);
    }

    @Override // com.zykj.sketch.core.listener.IAction
    public void onTouchPointerUp(@NotNull EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
        this.list.add(event);
    }

    @Override // com.zykj.sketch.core.listener.IAction
    public void onTouchUp(@NotNull EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
        this.list.add(event);
    }

    @Override // com.zykj.sketch.core.listener.IAction
    public void setRecord(boolean record) {
        this.record = record;
    }
}
