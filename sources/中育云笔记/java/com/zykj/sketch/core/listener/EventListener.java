package com.zykj.sketch.core.listener;

import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.GraphSnapshot;
import com.zykj.sketch.core.graph.ImageGraph;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes6.dex */
public interface EventListener {

    public static final class DefaultImpls {
        public static /* synthetic */ void graphSnapShot$default(EventListener eventListener, EzyDrawBoard.ActionContent actionContent, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: graphSnapShot");
            }
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            eventListener.graphSnapShot(actionContent, z10);
        }

        public static /* synthetic */ void onAddImageEvent$default(EventListener eventListener, EzyDrawBoard.ActionImageConfig actionImageConfig, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAddImageEvent");
            }
            if ((i10 & 2) != 0) {
                interfaceC9540l = new InterfaceC9540l() { // from class: com.zykj.sketch.core.listener.EventListener.onAddImageEvent.1
                    public final void invoke(ImageGraph imageGraph) {
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((ImageGraph) obj2);
                        return C10786q.f26013a;
                    }
                };
            }
            eventListener.onAddImageEvent(actionImageConfig, interfaceC9540l);
        }
    }

    void addViewControl(ViewControl viewControl);

    void graphSnapShot(EzyDrawBoard.ActionContent actionContent, boolean z10);

    void graphSnapShot(GraphSnapshot.GraphData graphData);

    void initConfig(EzyDrawBoard.GraphResetData graphResetData);

    void onActionModeEvent(EzyDrawBoard.ActionModeConfig actionModeConfig);

    void onAddImageEvent(EzyDrawBoard.ActionImageConfig actionImageConfig, InterfaceC9540l interfaceC9540l);

    void onAddPPTEvent(EzyDrawBoard.ActionWebViewConfig actionWebViewConfig, InterfaceC9540l interfaceC9540l);

    void onAudioStartRecord(EzyDrawBoard.AudioStartAction audioStartAction);

    void onAudioStopRecord(EzyDrawBoard.AudioStopAction audioStopAction);

    void onClearBoardEvent(EzyDrawBoard.ActionClearBoard actionClearBoard);

    void onDrawConfigEvent(EzyDrawBoard.ActionDrawConfig actionDrawConfig);

    void onGraphConfigEvent(EzyDrawBoard.ActionGraphConfig actionGraphConfig);

    void onNextActionEvent(EzyDrawBoard.ActionNextAction actionNextAction);

    void onPrevActionEvent(EzyDrawBoard.ActionPrevAction actionPrevAction);

    void onTouchEvent(EzyDrawBoard.ActionTouchEvent.TouchEvent touchEvent);

    boolean onTranslation(EzyDrawBoard.ActionTranslation actionTranslation);

    boolean onZoom(EzyDrawBoard.ActionZoom actionZoom);

    void reset();

    void resetMatrix(EzyDrawBoard.ActionResetMatrix actionResetMatrix);
}
