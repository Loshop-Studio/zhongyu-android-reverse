package com.zykj.sketch.core;

import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.google.protobuf.Message;
import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.core.graph.ImageGraph;
import com.zykj.sketch.core.listener.IAction;
import com.zykj.sketch.core.listener.IControl;
import com.zykj.sketch.core.listener.PPTControl;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J&\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\u0014\u0010\u0019\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u000e0\u001aH\u0016J$\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000e0\u001aH\u0016J\u0010\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u0010.\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020/H\u0016J\u0010\u00100\u001a\u00020\u000e2\u0006\u0010\"\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020\u000e2\u0006\u00103\u001a\u000204H\u0016J\u0010\u00105\u001a\u00020\f2\u0006\u0010\"\u001a\u000206H\u0016J\u0010\u00107\u001a\u00020\f2\u0006\u0010\"\u001a\u000208H\u0016J\b\u00109\u001a\u00020\u000eH\u0016J\u0010\u0010:\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020;H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, m13558d2 = {"Lcom/zykj/sketch/core/ActionRecordExecute;", "Lcom/zykj/sketch/core/ActionExecute;", "viewGroup", "Landroid/view/ViewGroup;", "control", "Lcom/zykj/sketch/core/listener/IControl;", "actionRecord", "Lcom/zykj/sketch/core/ActionRecord;", "actionFactory", "Lcom/zykj/sketch/core/ActionStrategyFactory;", "(Landroid/view/ViewGroup;Lcom/zykj/sketch/core/listener/IControl;Lcom/zykj/sketch/core/ActionRecord;Lcom/zykj/sketch/core/ActionStrategyFactory;)V", "isRecord", "", "addRecord", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;", "message", "Lcom/google/protobuf/Message;", "onActionModeEvent", "modeConfig", "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig;", "onAddImageEvent", "imageConfig", "Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;", "callBack", "Lkotlin/Function1;", "Lcom/zykj/sketch/core/graph/ImageGraph;", "onAddPPTEvent", "webViewConfig", "Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;", "viewBack", "Lcom/zykj/sketch/core/listener/PPTControl;", "onAudioStartRecord", "action", "Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;", "onAudioStopRecord", "Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;", "onClearBoardEvent", "Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard;", "onDrawConfigEvent", "config", "Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig;", "onGraphConfigEvent", "graphConfig", "Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;", "onNextActionEvent", "Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction;", "onPrevActionEvent", "Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction;", "onTouchEvent", NotificationCompat.CATEGORY_EVENT, "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;", "onTranslation", "Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;", "onZoom", "Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;", "reset", "resetMatrix", "Lcom/zykj/sketch/EzyDrawBoard$ActionResetMatrix;", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes5.dex */
public final class ActionRecordExecute extends ActionExecute {
    private final ActionStrategyFactory actionFactory;
    private final ActionRecord actionRecord;
    private final IControl control;
    private boolean isRecord;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionRecordExecute(ViewGroup viewGroup, IControl control, ActionRecord actionRecord, ActionStrategyFactory actionFactory) {
        super(viewGroup, control, actionFactory);
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Intrinsics.checkNotNullParameter(control, "control");
        Intrinsics.checkNotNullParameter(actionRecord, "actionRecord");
        Intrinsics.checkNotNullParameter(actionFactory, "actionFactory");
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
    public void onActionModeEvent(EzyDrawBoard.ActionModeConfig modeConfig) {
        Intrinsics.checkNotNullParameter(modeConfig, "modeConfig");
        super.onActionModeEvent(modeConfig);
        addRecord(EzyDrawBoard.ActionEnum.ACTION_MODE, modeConfig);
    }

    @Override // com.zykj.sketch.core.ActionExecute, com.zykj.sketch.core.listener.EventListener
    public void onAddImageEvent(EzyDrawBoard.ActionImageConfig imageConfig, Function1<? super ImageGraph, Unit> callBack) {
        Intrinsics.checkNotNullParameter(imageConfig, "imageConfig");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        super.onAddImageEvent(imageConfig, callBack);
        addRecord(EzyDrawBoard.ActionEnum.ACTION_IMAGE, imageConfig);
    }

    @Override // com.zykj.sketch.core.ActionExecute, com.zykj.sketch.core.listener.EventListener
    public void onAddPPTEvent(EzyDrawBoard.ActionWebViewConfig webViewConfig, Function1<? super PPTControl, Unit> viewBack) {
        Intrinsics.checkNotNullParameter(webViewConfig, "webViewConfig");
        Intrinsics.checkNotNullParameter(viewBack, "viewBack");
        super.onAddPPTEvent(webViewConfig, viewBack);
        addRecord(EzyDrawBoard.ActionEnum.ACTION_WEB, webViewConfig);
    }

    @Override // com.zykj.sketch.core.ActionExecute, com.zykj.sketch.core.listener.EventListener
    public void onAudioStartRecord(EzyDrawBoard.AudioStartAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        super.onAudioStartRecord(action);
        addRecord(EzyDrawBoard.ActionEnum.ACTION_AUDIO_START, action);
    }

    @Override // com.zykj.sketch.core.ActionExecute, com.zykj.sketch.core.listener.EventListener
    public void onAudioStopRecord(EzyDrawBoard.AudioStopAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        super.onAudioStopRecord(action);
        addRecord(EzyDrawBoard.ActionEnum.ACTION_AUDIO_STOP, action);
    }

    @Override // com.zykj.sketch.core.ActionExecute, com.zykj.sketch.core.listener.EventListener
    public void onClearBoardEvent(EzyDrawBoard.ActionClearBoard action) {
        Intrinsics.checkNotNullParameter(action, "action");
        super.onClearBoardEvent(action);
        addRecord(EzyDrawBoard.ActionEnum.ACTION_CLEAR_BOARD, action);
        this.actionRecord.clear();
    }

    @Override // com.zykj.sketch.core.ActionExecute, com.zykj.sketch.core.listener.EventListener
    public void onDrawConfigEvent(EzyDrawBoard.ActionDrawConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        super.onDrawConfigEvent(config);
        addRecord(EzyDrawBoard.ActionEnum.ACTION_DRAW_CONFIG, config);
    }

    @Override // com.zykj.sketch.core.ActionExecute, com.zykj.sketch.core.listener.EventListener
    public void onGraphConfigEvent(EzyDrawBoard.ActionGraphConfig graphConfig) {
        Intrinsics.checkNotNullParameter(graphConfig, "graphConfig");
        super.onGraphConfigEvent(graphConfig);
        addRecord(EzyDrawBoard.ActionEnum.ACTION_GRAPH, graphConfig);
    }

    @Override // com.zykj.sketch.core.ActionExecute, com.zykj.sketch.core.listener.EventListener
    public void onNextActionEvent(EzyDrawBoard.ActionNextAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
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
    public void onPrevActionEvent(EzyDrawBoard.ActionPrevAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
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
    public void onTouchEvent(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        IAction action;
        Intrinsics.checkNotNullParameter(event, "event");
        super.onTouchEvent(event);
        if (event.getAction() == 1 && (action = getAction()) != null && action.getRecord()) {
            List<EzyDrawBoard.ActionTouchEvent.TouchEvent> touchEventList = action.getTouchEventList();
            addRecord(EzyDrawBoard.ActionEnum.ACTION_TOUCH, this.actionRecord.buildTouch(action.getStartTime(), touchEventList));
            touchEventList.clear();
        }
    }

    @Override // com.zykj.sketch.core.ActionExecute, com.zykj.sketch.core.listener.EventListener
    public boolean onTranslation(EzyDrawBoard.ActionTranslation action) {
        Intrinsics.checkNotNullParameter(action, "action");
        super.onTranslation(action);
        addRecord(EzyDrawBoard.ActionEnum.ACTION_TRANS, action);
        return true;
    }

    @Override // com.zykj.sketch.core.ActionExecute, com.zykj.sketch.core.listener.EventListener
    public boolean onZoom(EzyDrawBoard.ActionZoom action) {
        Intrinsics.checkNotNullParameter(action, "action");
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
    public void resetMatrix(EzyDrawBoard.ActionResetMatrix action) {
        Intrinsics.checkNotNullParameter(action, "action");
        super.resetMatrix(action);
        addRecord(EzyDrawBoard.ActionEnum.ACTION_RESET_MATRIX, action);
    }
}
