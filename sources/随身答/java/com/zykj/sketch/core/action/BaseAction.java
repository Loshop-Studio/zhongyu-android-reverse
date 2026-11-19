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
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13412d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\tH\u0016J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\tJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m13413d2 = {"Lcom/zykj/sketch/core/action/BaseAction;", "Lcom/zykj/sketch/core/listener/IAction;", "actionControl", "Lcom/zykj/sketch/core/listener/IControl;", "(Lcom/zykj/sketch/core/listener/IControl;)V", "list", "", "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;", "record", "", "startTime", "", "getTouchEventList", "getTouchStartTime", "isRecord", "isTouchEnable", NotificationCompat.CATEGORY_EVENT, "onlyFlag", "onTouchDown", "", "onTouchMove", "onTouchPointerDown", "onTouchPointerUp", "onTouchUp", "setRecord", "sketch_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public abstract class BaseAction implements IAction {
    private IControl actionControl;
    private List<EzyDrawBoard.ActionTouchEvent.TouchEvent> list;
    private boolean record;
    private long startTime;

    public BaseAction(IControl actionControl) {
        Intrinsics.checkNotNullParameter(actionControl, "actionControl");
        this.actionControl = actionControl;
        this.list = new ArrayList();
    }

    public static /* synthetic */ boolean isTouchEnable$default(BaseAction baseAction, EzyDrawBoard.ActionTouchEvent.TouchEvent touchEvent, boolean z9, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isTouchEnable");
        }
        if ((i9 & 2) != 0) {
            z9 = true;
        }
        return baseAction.isTouchEnable(touchEvent, z9);
    }

    @Override // com.zykj.sketch.core.listener.IAction
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

    public final boolean isTouchEnable(EzyDrawBoard.ActionTouchEvent.TouchEvent event, boolean onlyFlag) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.actionControl.getSketchConfig().getIsTouchable()) {
            List<EzyDrawBoard.ActionTouchEvent.TouchEvent.PointerProperties> pointerPropertiesList = event.getPointerPropertiesList();
            Intrinsics.checkNotNullExpressionValue(pointerPropertiesList, "event.pointerPropertiesList");
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
    public void onTouchDown(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.startTime = event.getEventTime();
        this.list.add(event);
    }

    @Override // com.zykj.sketch.core.listener.IAction
    public void onTouchMove(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.list.add(event);
    }

    @Override // com.zykj.sketch.core.listener.IAction
    public void onTouchPointerDown(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.list.add(event);
    }

    @Override // com.zykj.sketch.core.listener.IAction
    public void onTouchPointerUp(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.list.add(event);
    }

    @Override // com.zykj.sketch.core.listener.IAction
    public void onTouchUp(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.list.add(event);
    }

    @Override // com.zykj.sketch.core.listener.IAction
    public void setRecord(boolean record) {
        this.record = record;
    }
}
