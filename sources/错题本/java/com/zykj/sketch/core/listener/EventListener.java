package com.zykj.sketch.core.listener;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.GraphSnapshot;
import com.zykj.sketch.core.graph.ImageGraph;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00040\u0015H&¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00040\u0015H&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H&¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010!\u001a\u00020$H&¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00042\u0006\u0010!\u001a\u00020'H&¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00042\u0006\u0010!\u001a\u00020*H&¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00042\u0006\u0010!\u001a\u00020-H&¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u0002012\u0006\u0010!\u001a\u000200H&¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u0002012\u0006\u0010!\u001a\u000204H&¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u00042\u0006\u0010!\u001a\u000207H&¢\u0006\u0004\b8\u00109J!\u0010=\u001a\u00020\u00042\u0006\u0010;\u001a\u00020:2\b\b\u0002\u0010<\u001a\u000201H&¢\u0006\u0004\b=\u0010>J\u0017\u0010=\u001a\u00020\u00042\u0006\u0010@\u001a\u00020?H&¢\u0006\u0004\b=\u0010AJ\u0017\u0010D\u001a\u00020\u00042\u0006\u0010C\u001a\u00020BH&¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u0004H&¢\u0006\u0004\bF\u0010GJ\u0017\u0010J\u001a\u00020\u00042\u0006\u0010I\u001a\u00020HH&¢\u0006\u0004\bJ\u0010K¨\u0006L"}, m5110d2 = {"Lcom/zykj/sketch/core/listener/EventListener;", "", "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;", NotificationCompat.CATEGORY_EVENT, "Ld6/s;", "onTouchEvent", "(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig;", "modeConfig", "onActionModeEvent", "(Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig;)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;", "graphConfig", "onGraphConfigEvent", "(Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig;", "config", "onDrawConfigEvent", "(Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig;)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;", "imageConfig", "Lkotlin/Function1;", "Lcom/zykj/sketch/core/graph/ImageGraph;", "callBack", "onAddImageEvent", "(Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;Lr6/c;)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;", "webViewConfig", "Lcom/zykj/sketch/core/listener/PPTControl;", "viewBack", "onAddPPTEvent", "(Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;Lr6/c;)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction;", "action", "onPrevActionEvent", "(Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction;)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction;", "onNextActionEvent", "(Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction;)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard;", "onClearBoardEvent", "(Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard;)V", "Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;", "onAudioStartRecord", "(Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;)V", "Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;", "onAudioStopRecord", "(Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;", "", "onZoom", "(Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;)Z", "Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;", "onTranslation", "(Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;)Z", "Lcom/zykj/sketch/EzyDrawBoard$ActionResetMatrix;", "resetMatrix", "(Lcom/zykj/sketch/EzyDrawBoard$ActionResetMatrix;)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;", "actionContent", "updateMode", "graphSnapShot", "(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;Z)V", "Lcom/zykj/sketch/GraphSnapshot$GraphData;", "graphSnapshot", "(Lcom/zykj/sketch/GraphSnapshot$GraphData;)V", "Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;", "resetData", "initConfig", "(Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;)V", "reset", "()V", "Lcom/zykj/sketch/core/listener/ViewControl;", "viewControl", "addViewControl", "(Lcom/zykj/sketch/core/listener/ViewControl;)V", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public interface EventListener {

    @Metadata(m5111k = 3, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static /* synthetic */ void graphSnapShot$default(EventListener eventListener, EzyDrawBoard.ActionContent actionContent, boolean z8, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: graphSnapShot");
            }
            if ((i & 2) != 0) {
                z8 = true;
            }
            eventListener.graphSnapShot(actionContent, z8);
        }

        public static /* synthetic */ void onAddImageEvent$default(EventListener eventListener, EzyDrawBoard.ActionImageConfig actionImageConfig, InterfaceC6471c interfaceC6471c, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAddImageEvent");
            }
            if ((i & 2) != 0) {
                interfaceC6471c = new InterfaceC6471c() { // from class: com.zykj.sketch.core.listener.EventListener.onAddImageEvent.1
                    public final void invoke(@Nullable ImageGraph imageGraph) {
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((ImageGraph) obj2);
                        return C5443s.f8405a;
                    }
                };
            }
            eventListener.onAddImageEvent(actionImageConfig, interfaceC6471c);
        }
    }

    void addViewControl(@NotNull ViewControl viewControl);

    void graphSnapShot(@NotNull EzyDrawBoard.ActionContent actionContent, boolean updateMode);

    void graphSnapShot(@NotNull GraphSnapshot.GraphData graphSnapshot);

    void initConfig(@NotNull EzyDrawBoard.GraphResetData resetData);

    void onActionModeEvent(@NotNull EzyDrawBoard.ActionModeConfig modeConfig);

    void onAddImageEvent(@NotNull EzyDrawBoard.ActionImageConfig imageConfig, @NotNull InterfaceC6471c callBack);

    void onAddPPTEvent(@NotNull EzyDrawBoard.ActionWebViewConfig webViewConfig, @NotNull InterfaceC6471c viewBack);

    void onAudioStartRecord(@NotNull EzyDrawBoard.AudioStartAction action);

    void onAudioStopRecord(@NotNull EzyDrawBoard.AudioStopAction action);

    void onClearBoardEvent(@NotNull EzyDrawBoard.ActionClearBoard action);

    void onDrawConfigEvent(@NotNull EzyDrawBoard.ActionDrawConfig config);

    void onGraphConfigEvent(@NotNull EzyDrawBoard.ActionGraphConfig graphConfig);

    void onNextActionEvent(@NotNull EzyDrawBoard.ActionNextAction action);

    void onPrevActionEvent(@NotNull EzyDrawBoard.ActionPrevAction action);

    void onTouchEvent(@NotNull EzyDrawBoard.ActionTouchEvent.TouchEvent event);

    boolean onTranslation(@NotNull EzyDrawBoard.ActionTranslation action);

    boolean onZoom(@NotNull EzyDrawBoard.ActionZoom action);

    void reset();

    void resetMatrix(@NotNull EzyDrawBoard.ActionResetMatrix action);
}
