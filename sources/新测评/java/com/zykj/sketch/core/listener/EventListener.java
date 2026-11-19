package com.zykj.sketch.core.listener;

import androidx.core.app.NotificationCompat;
import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.GraphSnapshot;
import com.zykj.sketch.core.graph.ImageGraph;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(m13557d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H&J(\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00030\u0017H&J$\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00030\u0017H&J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 H&J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\"H&J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020$H&J\u0010\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020'H&J\u0010\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020*H&J\u0010\u0010+\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020,H&J\u0010\u0010-\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020.H&J\u0010\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u000201H&J\u0010\u00102\u001a\u00020\n2\u0006\u0010\u001f\u001a\u000203H&J\u0010\u00104\u001a\u00020\n2\u0006\u0010\u001f\u001a\u000205H&J\b\u00106\u001a\u00020\u0003H&J\u0010\u00107\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u000208H&¨\u00069"}, m13558d2 = {"Lcom/zykj/sketch/core/listener/EventListener;", "", "addViewControl", "", "viewControl", "Lcom/zykj/sketch/core/listener/ViewControl;", "graphSnapShot", "actionContent", "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;", "updateMode", "", "graphSnapshot", "Lcom/zykj/sketch/GraphSnapshot$GraphData;", "initConfig", "resetData", "Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;", "onActionModeEvent", "modeConfig", "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig;", "onAddImageEvent", "imageConfig", "Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;", "callBack", "Lkotlin/Function1;", "Lcom/zykj/sketch/core/graph/ImageGraph;", "onAddPPTEvent", "webViewConfig", "Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;", "viewBack", "Lcom/zykj/sketch/core/listener/PPTControl;", "onAudioStartRecord", "action", "Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;", "onAudioStopRecord", "Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;", "onClearBoardEvent", "Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard;", "onDrawConfigEvent", "config", "Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig;", "onGraphConfigEvent", "graphConfig", "Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;", "onNextActionEvent", "Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction;", "onPrevActionEvent", "Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction;", "onTouchEvent", NotificationCompat.CATEGORY_EVENT, "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;", "onTranslation", "Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;", "onZoom", "Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;", "reset", "resetMatrix", "Lcom/zykj/sketch/EzyDrawBoard$ActionResetMatrix;", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes5.dex */
public interface EventListener {

    @Metadata(m13559k = 3, m13560mv = {1, 7, 1}, m13562xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void graphSnapShot$default(EventListener eventListener, EzyDrawBoard.ActionContent actionContent, boolean z9, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: graphSnapShot");
            }
            if ((i10 & 2) != 0) {
                z9 = true;
            }
            eventListener.graphSnapShot(actionContent, z9);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void onAddImageEvent$default(EventListener eventListener, EzyDrawBoard.ActionImageConfig actionImageConfig, Function1 function1, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAddImageEvent");
            }
            if ((i10 & 2) != 0) {
                function1 = new Function1<ImageGraph, Unit>() { // from class: com.zykj.sketch.core.listener.EventListener.onAddImageEvent.1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(ImageGraph imageGraph) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(ImageGraph imageGraph) {
                        invoke2(imageGraph);
                        return Unit.INSTANCE;
                    }
                };
            }
            eventListener.onAddImageEvent(actionImageConfig, function1);
        }
    }

    void addViewControl(ViewControl viewControl);

    void graphSnapShot(EzyDrawBoard.ActionContent actionContent, boolean updateMode);

    void graphSnapShot(GraphSnapshot.GraphData graphSnapshot);

    void initConfig(EzyDrawBoard.GraphResetData resetData);

    void onActionModeEvent(EzyDrawBoard.ActionModeConfig modeConfig);

    void onAddImageEvent(EzyDrawBoard.ActionImageConfig imageConfig, Function1<? super ImageGraph, Unit> callBack);

    void onAddPPTEvent(EzyDrawBoard.ActionWebViewConfig webViewConfig, Function1<? super PPTControl, Unit> viewBack);

    void onAudioStartRecord(EzyDrawBoard.AudioStartAction action);

    void onAudioStopRecord(EzyDrawBoard.AudioStopAction action);

    void onClearBoardEvent(EzyDrawBoard.ActionClearBoard action);

    void onDrawConfigEvent(EzyDrawBoard.ActionDrawConfig config);

    void onGraphConfigEvent(EzyDrawBoard.ActionGraphConfig graphConfig);

    void onNextActionEvent(EzyDrawBoard.ActionNextAction action);

    void onPrevActionEvent(EzyDrawBoard.ActionPrevAction action);

    void onTouchEvent(EzyDrawBoard.ActionTouchEvent.TouchEvent event);

    boolean onTranslation(EzyDrawBoard.ActionTranslation action);

    boolean onZoom(EzyDrawBoard.ActionZoom action);

    void reset();

    void resetMatrix(EzyDrawBoard.ActionResetMatrix action);
}
