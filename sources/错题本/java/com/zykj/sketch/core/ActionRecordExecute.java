package com.zykj.sketch.core;

import android.view.ViewGroup;
import android.view.serialization.ClassDiscriminatorModeKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.google.protobuf.Message;
import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.core.listener.IAction;
import com.zykj.sketch.core.listener.IControl;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J-\u0010(\u001a\u00020\u00102\u0006\u0010$\u001a\u00020#2\u0014\u0010'\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010&\u0012\u0004\u0012\u00020\u00100%H\u0016¢\u0006\u0004\b(\u0010)J+\u0010.\u001a\u00020\u00102\u0006\u0010+\u001a\u00020*2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00100%H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u00102\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u00102\u0006\u00101\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u0002082\u0006\u00101\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u0002082\u0006\u00101\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\u00102\u0006\u00101\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020\u00102\u0006\u00101\u001a\u00020AH\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020\u00102\u0006\u00101\u001a\u00020DH\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\u00102\u0006\u00101\u001a\u00020GH\u0016¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0010H\u0016¢\u0006\u0004\bJ\u0010KR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010LR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010MR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010NR\u0016\u0010O\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010P¨\u0006Q"}, m5110d2 = {"Lcom/zykj/sketch/core/ActionRecordExecute;", "Lcom/zykj/sketch/core/ActionExecute;", "Landroid/view/ViewGroup;", "viewGroup", "Lcom/zykj/sketch/core/listener/IControl;", "control", "Lcom/zykj/sketch/core/ActionRecord;", "actionRecord", "Lcom/zykj/sketch/core/ActionStrategyFactory;", "actionFactory", "<init>", "(Landroid/view/ViewGroup;Lcom/zykj/sketch/core/listener/IControl;Lcom/zykj/sketch/core/ActionRecord;Lcom/zykj/sketch/core/ActionStrategyFactory;)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lcom/google/protobuf/Message;", "message", "Ld6/s;", "addRecord", "(Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;Lcom/google/protobuf/Message;)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;", NotificationCompat.CATEGORY_EVENT, "onTouchEvent", "(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig;", "modeConfig", "onActionModeEvent", "(Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig;)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;", "graphConfig", "onGraphConfigEvent", "(Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig;", "config", "onDrawConfigEvent", "(Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig;)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;", "imageConfig", "Lkotlin/Function1;", "Lcom/zykj/sketch/core/graph/ImageGraph;", "callBack", "onAddImageEvent", "(Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;Lr6/c;)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;", "webViewConfig", "Lcom/zykj/sketch/core/listener/PPTControl;", "viewBack", "onAddPPTEvent", "(Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;Lr6/c;)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction;", "action", "onPrevActionEvent", "(Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction;)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction;", "onNextActionEvent", "(Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction;)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;", "", "onZoom", "(Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;)Z", "Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;", "onTranslation", "(Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;)Z", "Lcom/zykj/sketch/EzyDrawBoard$ActionResetMatrix;", "resetMatrix", "(Lcom/zykj/sketch/EzyDrawBoard$ActionResetMatrix;)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard;", "onClearBoardEvent", "(Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard;)V", "Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;", "onAudioStartRecord", "(Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;)V", "Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;", "onAudioStopRecord", "(Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;)V", "reset", "()V", "Lcom/zykj/sketch/core/listener/IControl;", "Lcom/zykj/sketch/core/ActionRecord;", "Lcom/zykj/sketch/core/ActionStrategyFactory;", "isRecord", "Z", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class ActionRecordExecute extends ActionExecute {

    @NotNull
    private final ActionStrategyFactory actionFactory;

    @NotNull
    private final ActionRecord actionRecord;

    @NotNull
    private final IControl control;
    private boolean isRecord;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionRecordExecute(@NotNull ViewGroup viewGroup, @NotNull IControl control, @NotNull ActionRecord actionRecord, @NotNull ActionStrategyFactory actionFactory) {
        super(viewGroup, control, actionFactory);
        AbstractC5830k.m5330g(viewGroup, "viewGroup");
        AbstractC5830k.m5330g(control, "control");
        AbstractC5830k.m5330g(actionRecord, "actionRecord");
        AbstractC5830k.m5330g(actionFactory, "actionFactory");
        this.control = control;
        this.actionRecord = actionRecord;
        this.actionFactory = actionFactory;
        this.isRecord = true;
    }

    private final void addRecord(EzyDrawBoard.ActionEnum type, Message message) {
        if (this.isRecord) {
            this.actionRecord.addRecord(type, message);
        }
    }

    @Override // com.zykj.sketch.core.ActionExecute, com.zykj.sketch.core.listener.EventListener
    public void onActionModeEvent(@NotNull EzyDrawBoard.ActionModeConfig modeConfig) {
        AbstractC5830k.m5330g(modeConfig, "modeConfig");
        super.onActionModeEvent(modeConfig);
        addRecord(EzyDrawBoard.ActionEnum.ACTION_MODE, modeConfig);
    }

    @Override // com.zykj.sketch.core.ActionExecute, com.zykj.sketch.core.listener.EventListener
    public void onAddImageEvent(@NotNull EzyDrawBoard.ActionImageConfig imageConfig, @NotNull InterfaceC6471c callBack) {
        AbstractC5830k.m5330g(imageConfig, "imageConfig");
        AbstractC5830k.m5330g(callBack, "callBack");
        super.onAddImageEvent(imageConfig, callBack);
        addRecord(EzyDrawBoard.ActionEnum.ACTION_IMAGE, imageConfig);
    }

    @Override // com.zykj.sketch.core.ActionExecute, com.zykj.sketch.core.listener.EventListener
    public void onAddPPTEvent(@NotNull EzyDrawBoard.ActionWebViewConfig webViewConfig, @NotNull InterfaceC6471c viewBack) {
        AbstractC5830k.m5330g(webViewConfig, "webViewConfig");
        AbstractC5830k.m5330g(viewBack, "viewBack");
        super.onAddPPTEvent(webViewConfig, viewBack);
        addRecord(EzyDrawBoard.ActionEnum.ACTION_WEB, webViewConfig);
    }

    @Override // com.zykj.sketch.core.ActionExecute, com.zykj.sketch.core.listener.EventListener
    public void onAudioStartRecord(@NotNull EzyDrawBoard.AudioStartAction action) {
        AbstractC5830k.m5330g(action, "action");
        super.onAudioStartRecord(action);
        addRecord(EzyDrawBoard.ActionEnum.ACTION_AUDIO_START, action);
    }

    @Override // com.zykj.sketch.core.ActionExecute, com.zykj.sketch.core.listener.EventListener
    public void onAudioStopRecord(@NotNull EzyDrawBoard.AudioStopAction action) {
        AbstractC5830k.m5330g(action, "action");
        super.onAudioStopRecord(action);
        addRecord(EzyDrawBoard.ActionEnum.ACTION_AUDIO_STOP, action);
    }

    @Override // com.zykj.sketch.core.ActionExecute, com.zykj.sketch.core.listener.EventListener
    public void onClearBoardEvent(@NotNull EzyDrawBoard.ActionClearBoard action) {
        AbstractC5830k.m5330g(action, "action");
        super.onClearBoardEvent(action);
        addRecord(EzyDrawBoard.ActionEnum.ACTION_CLEAR_BOARD, action);
        this.actionRecord.clear();
    }

    @Override // com.zykj.sketch.core.ActionExecute, com.zykj.sketch.core.listener.EventListener
    public void onDrawConfigEvent(@NotNull EzyDrawBoard.ActionDrawConfig config) {
        AbstractC5830k.m5330g(config, "config");
        super.onDrawConfigEvent(config);
        addRecord(EzyDrawBoard.ActionEnum.ACTION_DRAW_CONFIG, config);
    }

    @Override // com.zykj.sketch.core.ActionExecute, com.zykj.sketch.core.listener.EventListener
    public void onGraphConfigEvent(@NotNull EzyDrawBoard.ActionGraphConfig graphConfig) {
        AbstractC5830k.m5330g(graphConfig, "graphConfig");
        super.onGraphConfigEvent(graphConfig);
        addRecord(EzyDrawBoard.ActionEnum.ACTION_GRAPH, graphConfig);
    }

    @Override // com.zykj.sketch.core.ActionExecute, com.zykj.sketch.core.listener.EventListener
    public void onNextActionEvent(@NotNull EzyDrawBoard.ActionNextAction action) {
        AbstractC5830k.m5330g(action, "action");
        super.onNextActionEvent(action);
        EzyDrawBoard.ActionContent next = this.actionRecord.next();
        if (next != null) {
            this.control.resetStatus();
            this.actionFactory.reset();
            graphSnapShot(next, false);
        }
        addRecord(EzyDrawBoard.ActionEnum.ACTION_NEXT, action);
    }

    @Override // com.zykj.sketch.core.ActionExecute, com.zykj.sketch.core.listener.EventListener
    public void onPrevActionEvent(@NotNull EzyDrawBoard.ActionPrevAction action) {
        AbstractC5830k.m5330g(action, "action");
        super.onPrevActionEvent(action);
        EzyDrawBoard.ActionContent actionContentPrev = this.actionRecord.prev();
        if (actionContentPrev != null) {
            this.control.resetStatus();
            this.actionFactory.reset();
            graphSnapShot(actionContentPrev, false);
        } else {
            this.control.reset();
            this.actionFactory.reset();
            this.control.render();
        }
        addRecord(EzyDrawBoard.ActionEnum.ACTION_PREV, action);
    }

    @Override // com.zykj.sketch.core.ActionExecute, com.zykj.sketch.core.listener.EventListener
    public void onTouchEvent(@NotNull EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        IAction action;
        AbstractC5830k.m5330g(event, "event");
        super.onTouchEvent(event);
        if (event.getAction() == 1 && (action = getAction()) != null && action.getRecord()) {
            List<EzyDrawBoard.ActionTouchEvent.TouchEvent> touchEventList = action.getTouchEventList();
            addRecord(EzyDrawBoard.ActionEnum.ACTION_TOUCH, this.actionRecord.buildTouch(action.getStartTime(), touchEventList));
            touchEventList.clear();
        }
    }

    @Override // com.zykj.sketch.core.ActionExecute, com.zykj.sketch.core.listener.EventListener
    public boolean onTranslation(@NotNull EzyDrawBoard.ActionTranslation action) {
        AbstractC5830k.m5330g(action, "action");
        super.onTranslation(action);
        addRecord(EzyDrawBoard.ActionEnum.ACTION_TRANS, action);
        return true;
    }

    @Override // com.zykj.sketch.core.ActionExecute, com.zykj.sketch.core.listener.EventListener
    public boolean onZoom(@NotNull EzyDrawBoard.ActionZoom action) {
        AbstractC5830k.m5330g(action, "action");
        super.onZoom(action);
        addRecord(EzyDrawBoard.ActionEnum.ACTION_ZOOM, action);
        return true;
    }

    @Override // com.zykj.sketch.core.ActionExecute, com.zykj.sketch.core.listener.EventListener
    public void reset() {
        super.reset();
        this.actionRecord.reset();
    }

    @Override // com.zykj.sketch.core.ActionExecute, com.zykj.sketch.core.listener.EventListener
    public void resetMatrix(@NotNull EzyDrawBoard.ActionResetMatrix action) {
        AbstractC5830k.m5330g(action, "action");
        super.resetMatrix(action);
        addRecord(EzyDrawBoard.ActionEnum.ACTION_RESET_MATRIX, action);
    }
}
