package com.zykj.sketch.core.version;

import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.GraphSnapshot;
import com.zykj.sketch.core.data.AudioTask;
import com.zykj.sketch.core.data.GraphTask;
import com.zykj.sketch.core.data.RenderTask;
import com.zykj.sketch.core.listener.EventListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p325rc.AbstractC10978w;

/* loaded from: classes6.dex */
public class GraphTaskParseVersion1 implements ITaskParse {
    private long countTime;
    private long playEndTime;
    private long playStartTime;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EzyDrawBoard.ActionEnum.values().length];
            iArr[EzyDrawBoard.ActionEnum.ACTION_TOUCH.ordinal()] = 1;
            iArr[EzyDrawBoard.ActionEnum.ACTION_MODE.ordinal()] = 2;
            iArr[EzyDrawBoard.ActionEnum.ACTION_GRAPH.ordinal()] = 3;
            iArr[EzyDrawBoard.ActionEnum.ACTION_WEB.ordinal()] = 4;
            iArr[EzyDrawBoard.ActionEnum.ACTION_IMAGE.ordinal()] = 5;
            iArr[EzyDrawBoard.ActionEnum.ACTION_PREV.ordinal()] = 6;
            iArr[EzyDrawBoard.ActionEnum.ACTION_NEXT.ordinal()] = 7;
            iArr[EzyDrawBoard.ActionEnum.ACTION_CLEAR_BOARD.ordinal()] = 8;
            iArr[EzyDrawBoard.ActionEnum.ACTION_AUDIO_START.ordinal()] = 9;
            iArr[EzyDrawBoard.ActionEnum.ACTION_AUDIO_STOP.ordinal()] = 10;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void parseEventAsTask(final EzyDrawBoard.ActionContent actionContent, final EventListener eventListener, RenderTask renderTask, final InterfaceC9540l interfaceC9540l) {
        long j10;
        EzyDrawBoard.ActionEnum type = actionContent.getType();
        long j11 = 0;
        switch (type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                final EzyDrawBoard.ActionContent actionContent2 = actionContent;
                List<EzyDrawBoard.ActionTouchEvent.TouchEvent> touchEventList = ((EzyDrawBoard.ActionTouchEvent) actionContent2.getAction().unpack(EzyDrawBoard.ActionTouchEvent.class)).getTouchEventList();
                AbstractC9979u.m20293f(touchEventList, "action.touchEventList");
                int i10 = 0;
                for (Object obj : touchEventList) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        AbstractC10978w.m24145w();
                    }
                    final EzyDrawBoard.ActionTouchEvent.TouchEvent touchEvent = (EzyDrawBoard.ActionTouchEvent.TouchEvent) obj;
                    if (i10 == r14.getTouchEventCount() - 1) {
                        long j12 = this.playStartTime;
                        long eventTime = this.countTime;
                        if (j12 == j11) {
                            j10 = j11;
                        } else {
                            j10 = j11;
                            eventTime += touchEvent.getEventTime() - this.playStartTime;
                        }
                        GraphTask graphTask = new GraphTask(eventTime, actionContent2, new InterfaceC9529a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1$parseEventAsTask$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m34090invoke() {
                                EventListener eventListener2 = eventListener;
                                EzyDrawBoard.ActionTouchEvent.TouchEvent touchEvent2 = touchEvent;
                                AbstractC9979u.m20293f(touchEvent2, "touchEvent");
                                eventListener2.onTouchEvent(touchEvent2);
                                EventListener eventListener3 = eventListener;
                                GraphSnapshot.GraphData graphSnapshot = actionContent2.getGraphSnapshot();
                                AbstractC9979u.m20293f(graphSnapshot, "content.graphSnapshot");
                                eventListener3.graphSnapShot(graphSnapshot);
                            }

                            @Override // p181hd.InterfaceC9529a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m34090invoke();
                                return C10786q.f26013a;
                            }
                        }, true, new InterfaceC9529a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1$parseEventAsTask$1$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m34091invoke() {
                                EventListener eventListener2 = eventListener;
                                GraphSnapshot.GraphData graphSnapshot = actionContent2.getGraphSnapshot();
                                AbstractC9979u.m20293f(graphSnapshot, "content.graphSnapshot");
                                eventListener2.graphSnapShot(graphSnapshot);
                            }

                            @Override // p181hd.InterfaceC9529a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m34091invoke();
                                return C10786q.f26013a;
                            }
                        });
                        renderTask.getGraphTask().add(graphTask);
                        renderTask.setLastSnapshot(graphTask);
                        renderTask.setProgress(this.countTime);
                    } else {
                        j10 = j11;
                        renderTask.getGraphTask().add(new GraphTask(this.playStartTime == j10 ? this.countTime : this.countTime + (touchEvent.getEventTime() - this.playStartTime), actionContent, new InterfaceC9529a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1$parseEventAsTask$1$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // p181hd.InterfaceC9529a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m34092invoke();
                                return C10786q.f26013a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m34092invoke() {
                                EventListener eventListener2 = eventListener;
                                EzyDrawBoard.ActionTouchEvent.TouchEvent touchEvent2 = touchEvent;
                                AbstractC9979u.m20293f(touchEvent2, "touchEvent");
                                eventListener2.onTouchEvent(touchEvent2);
                            }
                        }, false, null, 16, null));
                    }
                    actionContent2 = actionContent;
                    i10 = i11;
                    j11 = j10;
                }
                break;
            case 2:
                final EzyDrawBoard.ActionModeConfig actionModeConfig = (EzyDrawBoard.ActionModeConfig) actionContent.getAction().unpack(EzyDrawBoard.ActionModeConfig.class);
                renderTask.getGraphTask().add(new GraphTask(this.playStartTime == 0 ? this.countTime : this.countTime + (actionModeConfig.getStartTime() - this.playStartTime), actionContent, new InterfaceC9529a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m34099invoke();
                        return C10786q.f26013a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m34099invoke() {
                        EventListener eventListener2 = eventListener;
                        EzyDrawBoard.ActionModeConfig action = actionModeConfig;
                        AbstractC9979u.m20293f(action, "action");
                        eventListener2.onActionModeEvent(action);
                    }
                }, actionContent.hasGraphSnapshot(), new InterfaceC9529a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.3
                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m34104invoke() {
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m34104invoke();
                        return C10786q.f26013a;
                    }
                }));
                break;
            case 3:
                final EzyDrawBoard.ActionGraphConfig actionGraphConfig = (EzyDrawBoard.ActionGraphConfig) actionContent.getAction().unpack(EzyDrawBoard.ActionGraphConfig.class);
                renderTask.getGraphTask().add(new GraphTask(this.playStartTime == 0 ? this.countTime : this.countTime + (actionGraphConfig.getStartTime() - this.playStartTime), actionContent, new InterfaceC9529a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m34105invoke();
                        return C10786q.f26013a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m34105invoke() {
                        EventListener eventListener2 = eventListener;
                        EzyDrawBoard.ActionGraphConfig action = actionGraphConfig;
                        AbstractC9979u.m20293f(action, "action");
                        eventListener2.onGraphConfigEvent(action);
                    }
                }, actionContent.hasGraphSnapshot(), new InterfaceC9529a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.5
                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m34106invoke() {
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m34106invoke();
                        return C10786q.f26013a;
                    }
                }));
                break;
            case 4:
                final EzyDrawBoard.ActionWebViewConfig actionWebViewConfig = (EzyDrawBoard.ActionWebViewConfig) actionContent.getAction().unpack(EzyDrawBoard.ActionWebViewConfig.class);
                List<GraphTask> graphTask2 = renderTask.getGraphTask();
                long j13 = this.playStartTime;
                long startTime = this.countTime;
                if (j13 != 0) {
                    startTime += actionWebViewConfig.getStartTime() - this.playStartTime;
                }
                graphTask2.add(new GraphTask(startTime, actionContent, new InterfaceC9529a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m34107invoke();
                        return C10786q.f26013a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m34107invoke() {
                        EventListener eventListener2 = eventListener;
                        EzyDrawBoard.ActionWebViewConfig action = actionWebViewConfig;
                        AbstractC9979u.m20293f(action, "action");
                        eventListener2.onAddPPTEvent(action, interfaceC9540l);
                    }
                }, actionContent.hasGraphSnapshot(), new InterfaceC9529a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m34108invoke();
                        return C10786q.f26013a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m34108invoke() {
                        EventListener eventListener2 = eventListener;
                        GraphSnapshot.GraphData graphSnapshot = actionContent.getGraphSnapshot();
                        AbstractC9979u.m20293f(graphSnapshot, "content.graphSnapshot");
                        eventListener2.graphSnapShot(graphSnapshot);
                    }
                }));
                break;
            case 5:
                GraphTask graphTask3 = new GraphTask(this.playStartTime == 0 ? this.countTime : (((EzyDrawBoard.ActionImageConfig) actionContent.getAction().unpack(EzyDrawBoard.ActionImageConfig.class)).getStartTime() - this.playStartTime) + this.countTime, actionContent, new InterfaceC9529a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m34109invoke() {
                        EventListener eventListener2 = eventListener;
                        GraphSnapshot.GraphData graphSnapshot = actionContent.getGraphSnapshot();
                        AbstractC9979u.m20293f(graphSnapshot, "content.graphSnapshot");
                        eventListener2.graphSnapShot(graphSnapshot);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m34109invoke();
                        return C10786q.f26013a;
                    }
                }, actionContent.hasGraphSnapshot(), new InterfaceC9529a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.9
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m34110invoke() {
                        EventListener eventListener2 = eventListener;
                        GraphSnapshot.GraphData graphSnapshot = actionContent.getGraphSnapshot();
                        AbstractC9979u.m20293f(graphSnapshot, "content.graphSnapshot");
                        eventListener2.graphSnapShot(graphSnapshot);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m34110invoke();
                        return C10786q.f26013a;
                    }
                });
                renderTask.getGraphTask().add(graphTask3);
                renderTask.setLastSnapshot(graphTask3);
                break;
            case 6:
                GraphTask graphTask4 = new GraphTask(this.playStartTime == 0 ? this.countTime : (((EzyDrawBoard.ActionPrevAction) actionContent.getAction().unpack(EzyDrawBoard.ActionPrevAction.class)).getStartTime() - this.playStartTime) + this.countTime, actionContent, new InterfaceC9529a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.11
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m34093invoke() {
                        EventListener eventListener2 = eventListener;
                        GraphSnapshot.GraphData graphSnapshot = actionContent.getGraphSnapshot();
                        AbstractC9979u.m20293f(graphSnapshot, "content.graphSnapshot");
                        eventListener2.graphSnapShot(graphSnapshot);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m34093invoke();
                        return C10786q.f26013a;
                    }
                }, actionContent.hasGraphSnapshot(), new InterfaceC9529a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.12
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m34094invoke() {
                        EventListener eventListener2 = eventListener;
                        GraphSnapshot.GraphData graphSnapshot = actionContent.getGraphSnapshot();
                        AbstractC9979u.m20293f(graphSnapshot, "content.graphSnapshot");
                        eventListener2.graphSnapShot(graphSnapshot);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m34094invoke();
                        return C10786q.f26013a;
                    }
                });
                renderTask.getGraphTask().add(graphTask4);
                renderTask.setLastSnapshot(graphTask4);
                break;
            case 7:
                GraphTask graphTask5 = new GraphTask(this.playStartTime == 0 ? this.countTime : (((EzyDrawBoard.ActionNextAction) actionContent.getAction().unpack(EzyDrawBoard.ActionNextAction.class)).getStartTime() - this.playStartTime) + this.countTime, actionContent, new InterfaceC9529a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.14
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m34095invoke() {
                        EventListener eventListener2 = eventListener;
                        GraphSnapshot.GraphData graphSnapshot = actionContent.getGraphSnapshot();
                        AbstractC9979u.m20293f(graphSnapshot, "content.graphSnapshot");
                        eventListener2.graphSnapShot(graphSnapshot);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m34095invoke();
                        return C10786q.f26013a;
                    }
                }, actionContent.hasGraphSnapshot(), new InterfaceC9529a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.15
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m34096invoke() {
                        EventListener eventListener2 = eventListener;
                        GraphSnapshot.GraphData graphSnapshot = actionContent.getGraphSnapshot();
                        AbstractC9979u.m20293f(graphSnapshot, "content.graphSnapshot");
                        eventListener2.graphSnapShot(graphSnapshot);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m34096invoke();
                        return C10786q.f26013a;
                    }
                });
                renderTask.getGraphTask().add(graphTask5);
                renderTask.setLastSnapshot(graphTask5);
                break;
            case 8:
                GraphTask graphTask6 = new GraphTask(this.playStartTime == 0 ? this.countTime : (((EzyDrawBoard.ActionClearBoard) actionContent.getAction().unpack(EzyDrawBoard.ActionClearBoard.class)).getStartTime() - this.playStartTime) + this.countTime, actionContent, new InterfaceC9529a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.17
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m34097invoke() {
                        EventListener eventListener2 = eventListener;
                        GraphSnapshot.GraphData graphSnapshot = actionContent.getGraphSnapshot();
                        AbstractC9979u.m20293f(graphSnapshot, "content.graphSnapshot");
                        eventListener2.graphSnapShot(graphSnapshot);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m34097invoke();
                        return C10786q.f26013a;
                    }
                }, actionContent.hasGraphSnapshot(), new InterfaceC9529a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.18
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m34098invoke() {
                        EventListener eventListener2 = eventListener;
                        GraphSnapshot.GraphData graphSnapshot = actionContent.getGraphSnapshot();
                        AbstractC9979u.m20293f(graphSnapshot, "content.graphSnapshot");
                        eventListener2.graphSnapShot(graphSnapshot);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m34098invoke();
                        return C10786q.f26013a;
                    }
                });
                renderTask.getGraphTask().add(graphTask6);
                renderTask.setLastSnapshot(graphTask6);
                break;
            case 9:
                final EzyDrawBoard.AudioStartAction audioStartAction = (EzyDrawBoard.AudioStartAction) actionContent.getAction().unpack(EzyDrawBoard.AudioStartAction.class);
                this.playStartTime = audioStartAction.getStartTime();
                this.playEndTime = audioStartAction.getStartTime();
                renderTask.getGraphTask().add(new GraphTask(this.playStartTime == 0 ? this.countTime : this.countTime + (audioStartAction.getStartTime() - this.playStartTime), actionContent, new InterfaceC9529a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.20
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m34100invoke();
                        return C10786q.f26013a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m34100invoke() {
                        EventListener eventListener2 = eventListener;
                        EzyDrawBoard.AudioStartAction action = audioStartAction;
                        AbstractC9979u.m20293f(action, "action");
                        eventListener2.onAudioStartRecord(action);
                    }
                }, actionContent.hasGraphSnapshot(), new InterfaceC9529a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.21
                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m34101invoke() {
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m34101invoke();
                        return C10786q.f26013a;
                    }
                }));
                List<AudioTask> audioTaskList = renderTask.getAudioTaskList();
                long j14 = this.countTime;
                String fileName = audioStartAction.getFileName();
                AbstractC9979u.m20293f(fileName, "action.fileName");
                audioTaskList.add(new AudioTask(j14, fileName, null, 0, 12, null));
                break;
            case 10:
                final EzyDrawBoard.AudioStopAction audioStopAction = (EzyDrawBoard.AudioStopAction) actionContent.getAction().unpack(EzyDrawBoard.AudioStopAction.class);
                renderTask.getGraphTask().add(new GraphTask(this.playStartTime == 0 ? this.countTime : this.countTime + (audioStopAction.getStartTime() - this.playStartTime), actionContent, new InterfaceC9529a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.22
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m34102invoke();
                        return C10786q.f26013a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m34102invoke() {
                        EventListener eventListener2 = eventListener;
                        EzyDrawBoard.AudioStopAction action = audioStopAction;
                        AbstractC9979u.m20293f(action, "action");
                        eventListener2.onAudioStopRecord(action);
                    }
                }, actionContent.hasGraphSnapshot(), new InterfaceC9529a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.23
                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m34103invoke() {
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m34103invoke();
                        return C10786q.f26013a;
                    }
                }));
                this.countTime += audioStopAction.getStartTime() - this.playStartTime;
                this.playStartTime = 0L;
                this.playEndTime = 0L;
                break;
        }
    }

    @Override // com.zykj.sketch.core.version.ITaskParse
    public RenderTask parse(List<EzyDrawBoard.ActionContent> content, EventListener eventListener, InterfaceC9540l viewBack) {
        AbstractC9979u.m20294g(content, "content");
        AbstractC9979u.m20294g(eventListener, "eventListener");
        AbstractC9979u.m20294g(viewBack, "viewBack");
        RenderTask renderTask = new RenderTask(new ArrayList(), new ArrayList(), null, 0L, 8, null);
        Iterator<T> it = content.iterator();
        while (it.hasNext()) {
            parseEventAsTask((EzyDrawBoard.ActionContent) it.next(), eventListener, renderTask, viewBack);
        }
        renderTask.setProgress(this.countTime);
        return renderTask;
    }
}
