package com.zykj.sketch.core;

import android.view.ViewGroup;
import com.google.protobuf.Message;
import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.core.listener.IAction;
import com.zykj.sketch.core.listener.IControl;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes6.dex */
public final class ActionRecordExecute extends ActionExecute {
    private final ActionStrategyFactory actionFactory;
    private final ActionRecord actionRecord;
    private final IControl control;
    private boolean isRecord;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionRecordExecute(ViewGroup viewGroup, IControl control, ActionRecord actionRecord, ActionStrategyFactory actionFactory) {
        super(viewGroup, control, actionFactory);
        AbstractC9979u.m20294g(viewGroup, "viewGroup");
        AbstractC9979u.m20294g(control, "control");
        AbstractC9979u.m20294g(actionRecord, "actionRecord");
        AbstractC9979u.m20294g(actionFactory, "actionFactory");
        this.control = control;
        this.actionRecord = actionRecord;
        this.actionFactory = actionFactory;
        this.isRecord = true;
    }

    private final void addRecord(EzyDrawBoard.ActionEnum actionEnum, Message message) {
        if (this.isRecord) {
            this.actionRecord.addRecord(actionEnum, message);
        }
    }

    @Override // com.zykj.sketch.core.ActionExecute, com.zykj.sketch.core.listener.EventListener
    public void onActionModeEvent(EzyDrawBoard.ActionModeConfig modeConfig) {
        AbstractC9979u.m20294g(modeConfig, "modeConfig");
        super.onActionModeEvent(modeConfig);
        addRecord(EzyDrawBoard.ActionEnum.ACTION_MODE, modeConfig);
    }

    @Override // com.zykj.sketch.core.ActionExecute, com.zykj.sketch.core.listener.EventListener
    public void onAddImageEvent(EzyDrawBoard.ActionImageConfig imageConfig, InterfaceC9540l callBack) {
        AbstractC9979u.m20294g(imageConfig, "imageConfig");
        AbstractC9979u.m20294g(callBack, "callBack");
        super.onAddImageEvent(imageConfig, callBack);
        addRecord(EzyDrawBoard.ActionEnum.ACTION_IMAGE, imageConfig);
    }

    @Override // com.zykj.sketch.core.ActionExecute, com.zykj.sketch.core.listener.EventListener
    public void onAddPPTEvent(EzyDrawBoard.ActionWebViewConfig webViewConfig, InterfaceC9540l viewBack) {
        AbstractC9979u.m20294g(webViewConfig, "webViewConfig");
        AbstractC9979u.m20294g(viewBack, "viewBack");
        super.onAddPPTEvent(webViewConfig, viewBack);
        addRecord(EzyDrawBoard.ActionEnum.ACTION_WEB, webViewConfig);
    }

    @Override // com.zykj.sketch.core.ActionExecute, com.zykj.sketch.core.listener.EventListener
    public void onAudioStartRecord(EzyDrawBoard.AudioStartAction action) {
        AbstractC9979u.m20294g(action, "action");
        super.onAudioStartRecord(action);
        addRecord(EzyDrawBoard.ActionEnum.ACTION_AUDIO_START, action);
    }

    @Override // com.zykj.sketch.core.ActionExecute, com.zykj.sketch.core.listener.EventListener
    public void onAudioStopRecord(EzyDrawBoard.AudioStopAction action) {
        AbstractC9979u.m20294g(action, "action");
        super.onAudioStopRecord(action);
        addRecord(EzyDrawBoard.ActionEnum.ACTION_AUDIO_STOP, action);
    }

    @Override // com.zykj.sketch.core.ActionExecute, com.zykj.sketch.core.listener.EventListener
    public void onClearBoardEvent(EzyDrawBoard.ActionClearBoard action) {
        AbstractC9979u.m20294g(action, "action");
        super.onClearBoardEvent(action);
        addRecord(EzyDrawBoard.ActionEnum.ACTION_CLEAR_BOARD, action);
        this.actionRecord.clear();
    }

    @Override // com.zykj.sketch.core.ActionExecute, com.zykj.sketch.core.listener.EventListener
    public void onDrawConfigEvent(EzyDrawBoard.ActionDrawConfig config) {
        AbstractC9979u.m20294g(config, "config");
        super.onDrawConfigEvent(config);
        addRecord(EzyDrawBoard.ActionEnum.ACTION_DRAW_CONFIG, config);
    }

    @Override // com.zykj.sketch.core.ActionExecute, com.zykj.sketch.core.listener.EventListener
    public void onGraphConfigEvent(EzyDrawBoard.ActionGraphConfig graphConfig) {
        AbstractC9979u.m20294g(graphConfig, "graphConfig");
        super.onGraphConfigEvent(graphConfig);
        addRecord(EzyDrawBoard.ActionEnum.ACTION_GRAPH, graphConfig);
    }

    @Override // com.zykj.sketch.core.ActionExecute, com.zykj.sketch.core.listener.EventListener
    public void onNextActionEvent(EzyDrawBoard.ActionNextAction action) {
        AbstractC9979u.m20294g(action, "action");
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
        AbstractC9979u.m20294g(action, "action");
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
        AbstractC9979u.m20294g(event, "event");
        super.onTouchEvent(event);
        if (event.getAction() == 1 && (action = getAction()) != null && action.isRecord()) {
            List<EzyDrawBoard.ActionTouchEvent.TouchEvent> touchEventList = action.getTouchEventList();
            addRecord(EzyDrawBoard.ActionEnum.ACTION_TOUCH, this.actionRecord.buildTouch(action.getTouchStartTime(), touchEventList));
            touchEventList.clear();
        }
    }

    @Override // com.zykj.sketch.core.ActionExecute, com.zykj.sketch.core.listener.EventListener
    public boolean onTranslation(EzyDrawBoard.ActionTranslation action) {
        AbstractC9979u.m20294g(action, "action");
        super.onTranslation(action);
        addRecord(EzyDrawBoard.ActionEnum.ACTION_TRANS, action);
        return true;
    }

    @Override // com.zykj.sketch.core.ActionExecute, com.zykj.sketch.core.listener.EventListener
    public boolean onZoom(EzyDrawBoard.ActionZoom action) {
        AbstractC9979u.m20294g(action, "action");
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
        AbstractC9979u.m20294g(action, "action");
        super.resetMatrix(action);
        addRecord(EzyDrawBoard.ActionEnum.ACTION_RESET_MATRIX, action);
    }
}
