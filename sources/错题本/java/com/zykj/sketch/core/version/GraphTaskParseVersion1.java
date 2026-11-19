package com.zykj.sketch.core.version;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.GraphSnapshot;
import com.zykj.sketch.core.data.AudioTask;
import com.zykj.sketch.core.data.GraphTask;
import com.zykj.sketch.core.data.RenderTask;
import com.zykj.sketch.core.listener.EventListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ9\u0010\u0011\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, m5110d2 = {"Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;", "Lcom/zykj/sketch/core/version/ITaskParse;", "<init>", "()V", "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;", "content", "Lcom/zykj/sketch/core/listener/EventListener;", "eventListener", "Lcom/zykj/sketch/core/data/RenderTask;", "task", "Lkotlin/Function1;", "Lcom/zykj/sketch/core/listener/ViewControl;", "Ld6/s;", "viewBack", "parseEventAsTask", "(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/core/data/RenderTask;Lr6/c;)V", "", "parse", "(Ljava/util/List;Lcom/zykj/sketch/core/listener/EventListener;Lr6/c;)Lcom/zykj/sketch/core/data/RenderTask;", "", "countTime", "J", "playStartTime", "playEndTime", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public class GraphTaskParseVersion1 implements ITaskParse {
    private long countTime;
    private long playEndTime;
    private long playStartTime;

    @Metadata(m5111k = 3, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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

    private final void parseEventAsTask(final EzyDrawBoard.ActionContent content, final EventListener eventListener, RenderTask task, final InterfaceC6471c viewBack) {
        long j7;
        EzyDrawBoard.ActionEnum type = content.getType();
        long j8 = 0;
        switch (type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                final EzyDrawBoard.ActionContent actionContent = content;
                List<EzyDrawBoard.ActionTouchEvent.TouchEvent> touchEventList = ((EzyDrawBoard.ActionTouchEvent) actionContent.getAction().unpack(EzyDrawBoard.ActionTouchEvent.class)).getTouchEventList();
                AbstractC5830k.m5329f(touchEventList, "action.touchEventList");
                int i = 0;
                for (Object obj : touchEventList) {
                    int i8 = i + 1;
                    if (i < 0) {
                        AbstractC5806u.m5258L();
                        throw null;
                    }
                    final EzyDrawBoard.ActionTouchEvent.TouchEvent touchEvent = (EzyDrawBoard.ActionTouchEvent.TouchEvent) obj;
                    if (i == r14.getTouchEventCount() - 1) {
                        long j9 = this.playStartTime;
                        long eventTime = this.countTime;
                        if (j9 == j8) {
                            j7 = j8;
                        } else {
                            j7 = j8;
                            eventTime += touchEvent.getEventTime() - this.playStartTime;
                        }
                        GraphTask graphTask = new GraphTask(eventTime, actionContent, new InterfaceC6469a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1$parseEventAsTask$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m13887invoke() {
                                EventListener eventListener2 = eventListener;
                                EzyDrawBoard.ActionTouchEvent.TouchEvent touchEvent2 = touchEvent;
                                AbstractC5830k.m5329f(touchEvent2, "touchEvent");
                                eventListener2.onTouchEvent(touchEvent2);
                                EventListener eventListener3 = eventListener;
                                GraphSnapshot.GraphData graphSnapshot = actionContent.getGraphSnapshot();
                                AbstractC5830k.m5329f(graphSnapshot, "content.graphSnapshot");
                                eventListener3.graphSnapShot(graphSnapshot);
                            }

                            @Override // p152r6.InterfaceC6469a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m13887invoke();
                                return C5443s.f8405a;
                            }
                        }, true, new InterfaceC6469a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1$parseEventAsTask$1$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m13888invoke() {
                                EventListener eventListener2 = eventListener;
                                GraphSnapshot.GraphData graphSnapshot = actionContent.getGraphSnapshot();
                                AbstractC5830k.m5329f(graphSnapshot, "content.graphSnapshot");
                                eventListener2.graphSnapShot(graphSnapshot);
                            }

                            @Override // p152r6.InterfaceC6469a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m13888invoke();
                                return C5443s.f8405a;
                            }
                        });
                        task.getGraphTask().add(graphTask);
                        task.setLastSnapshot(graphTask);
                        task.setProgress(this.countTime);
                    } else {
                        j7 = j8;
                        task.getGraphTask().add(new GraphTask(this.playStartTime == j7 ? this.countTime : this.countTime + (touchEvent.getEventTime() - this.playStartTime), content, new InterfaceC6469a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1$parseEventAsTask$1$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // p152r6.InterfaceC6469a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m13889invoke();
                                return C5443s.f8405a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m13889invoke() {
                                EventListener eventListener2 = eventListener;
                                EzyDrawBoard.ActionTouchEvent.TouchEvent touchEvent2 = touchEvent;
                                AbstractC5830k.m5329f(touchEvent2, "touchEvent");
                                eventListener2.onTouchEvent(touchEvent2);
                            }
                        }, false, null, 16, null));
                    }
                    actionContent = content;
                    i = i8;
                    j8 = j7;
                }
                return;
            case 2:
                final EzyDrawBoard.ActionModeConfig actionModeConfig = (EzyDrawBoard.ActionModeConfig) content.getAction().unpack(EzyDrawBoard.ActionModeConfig.class);
                task.getGraphTask().add(new GraphTask(this.playStartTime == 0 ? this.countTime : this.countTime + (actionModeConfig.getStartTime() - this.playStartTime), content, new InterfaceC6469a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m13896invoke();
                        return C5443s.f8405a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m13896invoke() {
                        EventListener eventListener2 = eventListener;
                        EzyDrawBoard.ActionModeConfig action = actionModeConfig;
                        AbstractC5830k.m5329f(action, "action");
                        eventListener2.onActionModeEvent(action);
                    }
                }, content.hasGraphSnapshot(), new InterfaceC6469a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.3
                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m13901invoke() {
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m13901invoke();
                        return C5443s.f8405a;
                    }
                }));
                return;
            case 3:
                final EzyDrawBoard.ActionGraphConfig actionGraphConfig = (EzyDrawBoard.ActionGraphConfig) content.getAction().unpack(EzyDrawBoard.ActionGraphConfig.class);
                task.getGraphTask().add(new GraphTask(this.playStartTime == 0 ? this.countTime : this.countTime + (actionGraphConfig.getStartTime() - this.playStartTime), content, new InterfaceC6469a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m13902invoke();
                        return C5443s.f8405a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m13902invoke() {
                        EventListener eventListener2 = eventListener;
                        EzyDrawBoard.ActionGraphConfig action = actionGraphConfig;
                        AbstractC5830k.m5329f(action, "action");
                        eventListener2.onGraphConfigEvent(action);
                    }
                }, content.hasGraphSnapshot(), new InterfaceC6469a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.5
                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m13903invoke() {
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m13903invoke();
                        return C5443s.f8405a;
                    }
                }));
                return;
            case 4:
                final EzyDrawBoard.ActionWebViewConfig actionWebViewConfig = (EzyDrawBoard.ActionWebViewConfig) content.getAction().unpack(EzyDrawBoard.ActionWebViewConfig.class);
                List<GraphTask> graphTask2 = task.getGraphTask();
                long j10 = this.playStartTime;
                long startTime = this.countTime;
                if (j10 != 0) {
                    startTime += actionWebViewConfig.getStartTime() - this.playStartTime;
                }
                graphTask2.add(new GraphTask(startTime, content, new InterfaceC6469a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m13904invoke();
                        return C5443s.f8405a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m13904invoke() {
                        EventListener eventListener2 = eventListener;
                        EzyDrawBoard.ActionWebViewConfig action = actionWebViewConfig;
                        AbstractC5830k.m5329f(action, "action");
                        eventListener2.onAddPPTEvent(action, viewBack);
                    }
                }, content.hasGraphSnapshot(), new InterfaceC6469a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m13905invoke();
                        return C5443s.f8405a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m13905invoke() {
                        EventListener eventListener2 = eventListener;
                        GraphSnapshot.GraphData graphSnapshot = content.getGraphSnapshot();
                        AbstractC5830k.m5329f(graphSnapshot, "content.graphSnapshot");
                        eventListener2.graphSnapShot(graphSnapshot);
                    }
                }));
                return;
            case 5:
                GraphTask graphTask3 = new GraphTask(this.playStartTime == 0 ? this.countTime : (((EzyDrawBoard.ActionImageConfig) content.getAction().unpack(EzyDrawBoard.ActionImageConfig.class)).getStartTime() - this.playStartTime) + this.countTime, content, new InterfaceC6469a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m13906invoke() {
                        EventListener eventListener2 = eventListener;
                        GraphSnapshot.GraphData graphSnapshot = content.getGraphSnapshot();
                        AbstractC5830k.m5329f(graphSnapshot, "content.graphSnapshot");
                        eventListener2.graphSnapShot(graphSnapshot);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m13906invoke();
                        return C5443s.f8405a;
                    }
                }, content.hasGraphSnapshot(), new InterfaceC6469a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.9
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m13907invoke() {
                        EventListener eventListener2 = eventListener;
                        GraphSnapshot.GraphData graphSnapshot = content.getGraphSnapshot();
                        AbstractC5830k.m5329f(graphSnapshot, "content.graphSnapshot");
                        eventListener2.graphSnapShot(graphSnapshot);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m13907invoke();
                        return C5443s.f8405a;
                    }
                });
                task.getGraphTask().add(graphTask3);
                task.setLastSnapshot(graphTask3);
                return;
            case 6:
                GraphTask graphTask4 = new GraphTask(this.playStartTime == 0 ? this.countTime : (((EzyDrawBoard.ActionPrevAction) content.getAction().unpack(EzyDrawBoard.ActionPrevAction.class)).getStartTime() - this.playStartTime) + this.countTime, content, new InterfaceC6469a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.11
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m13890invoke() {
                        EventListener eventListener2 = eventListener;
                        GraphSnapshot.GraphData graphSnapshot = content.getGraphSnapshot();
                        AbstractC5830k.m5329f(graphSnapshot, "content.graphSnapshot");
                        eventListener2.graphSnapShot(graphSnapshot);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m13890invoke();
                        return C5443s.f8405a;
                    }
                }, content.hasGraphSnapshot(), new InterfaceC6469a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.12
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m13891invoke() {
                        EventListener eventListener2 = eventListener;
                        GraphSnapshot.GraphData graphSnapshot = content.getGraphSnapshot();
                        AbstractC5830k.m5329f(graphSnapshot, "content.graphSnapshot");
                        eventListener2.graphSnapShot(graphSnapshot);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m13891invoke();
                        return C5443s.f8405a;
                    }
                });
                task.getGraphTask().add(graphTask4);
                task.setLastSnapshot(graphTask4);
                return;
            case 7:
                GraphTask graphTask5 = new GraphTask(this.playStartTime == 0 ? this.countTime : (((EzyDrawBoard.ActionNextAction) content.getAction().unpack(EzyDrawBoard.ActionNextAction.class)).getStartTime() - this.playStartTime) + this.countTime, content, new InterfaceC6469a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.14
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m13892invoke() {
                        EventListener eventListener2 = eventListener;
                        GraphSnapshot.GraphData graphSnapshot = content.getGraphSnapshot();
                        AbstractC5830k.m5329f(graphSnapshot, "content.graphSnapshot");
                        eventListener2.graphSnapShot(graphSnapshot);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m13892invoke();
                        return C5443s.f8405a;
                    }
                }, content.hasGraphSnapshot(), new InterfaceC6469a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.15
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m13893invoke() {
                        EventListener eventListener2 = eventListener;
                        GraphSnapshot.GraphData graphSnapshot = content.getGraphSnapshot();
                        AbstractC5830k.m5329f(graphSnapshot, "content.graphSnapshot");
                        eventListener2.graphSnapShot(graphSnapshot);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m13893invoke();
                        return C5443s.f8405a;
                    }
                });
                task.getGraphTask().add(graphTask5);
                task.setLastSnapshot(graphTask5);
                return;
            case 8:
                GraphTask graphTask6 = new GraphTask(this.playStartTime == 0 ? this.countTime : (((EzyDrawBoard.ActionClearBoard) content.getAction().unpack(EzyDrawBoard.ActionClearBoard.class)).getStartTime() - this.playStartTime) + this.countTime, content, new InterfaceC6469a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.17
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m13894invoke() {
                        EventListener eventListener2 = eventListener;
                        GraphSnapshot.GraphData graphSnapshot = content.getGraphSnapshot();
                        AbstractC5830k.m5329f(graphSnapshot, "content.graphSnapshot");
                        eventListener2.graphSnapShot(graphSnapshot);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m13894invoke();
                        return C5443s.f8405a;
                    }
                }, content.hasGraphSnapshot(), new InterfaceC6469a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.18
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m13895invoke() {
                        EventListener eventListener2 = eventListener;
                        GraphSnapshot.GraphData graphSnapshot = content.getGraphSnapshot();
                        AbstractC5830k.m5329f(graphSnapshot, "content.graphSnapshot");
                        eventListener2.graphSnapShot(graphSnapshot);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m13895invoke();
                        return C5443s.f8405a;
                    }
                });
                task.getGraphTask().add(graphTask6);
                task.setLastSnapshot(graphTask6);
                return;
            case 9:
                final EzyDrawBoard.AudioStartAction audioStartAction = (EzyDrawBoard.AudioStartAction) content.getAction().unpack(EzyDrawBoard.AudioStartAction.class);
                this.playStartTime = audioStartAction.getStartTime();
                this.playEndTime = audioStartAction.getStartTime();
                task.getGraphTask().add(new GraphTask(this.playStartTime == 0 ? this.countTime : this.countTime + (audioStartAction.getStartTime() - this.playStartTime), content, new InterfaceC6469a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.20
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m13897invoke();
                        return C5443s.f8405a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m13897invoke() {
                        EventListener eventListener2 = eventListener;
                        EzyDrawBoard.AudioStartAction action = audioStartAction;
                        AbstractC5830k.m5329f(action, "action");
                        eventListener2.onAudioStartRecord(action);
                    }
                }, content.hasGraphSnapshot(), new InterfaceC6469a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.21
                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m13898invoke() {
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m13898invoke();
                        return C5443s.f8405a;
                    }
                }));
                List<AudioTask> audioTaskList = task.getAudioTaskList();
                long j11 = this.countTime;
                String fileName = audioStartAction.getFileName();
                AbstractC5830k.m5329f(fileName, "action.fileName");
                audioTaskList.add(new AudioTask(j11, fileName, null, 0, 12, null));
                return;
            case 10:
                final EzyDrawBoard.AudioStopAction audioStopAction = (EzyDrawBoard.AudioStopAction) content.getAction().unpack(EzyDrawBoard.AudioStopAction.class);
                task.getGraphTask().add(new GraphTask(this.playStartTime == 0 ? this.countTime : this.countTime + (audioStopAction.getStartTime() - this.playStartTime), content, new InterfaceC6469a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.22
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m13899invoke();
                        return C5443s.f8405a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m13899invoke() {
                        EventListener eventListener2 = eventListener;
                        EzyDrawBoard.AudioStopAction action = audioStopAction;
                        AbstractC5830k.m5329f(action, "action");
                        eventListener2.onAudioStopRecord(action);
                    }
                }, content.hasGraphSnapshot(), new InterfaceC6469a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.23
                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m13900invoke() {
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m13900invoke();
                        return C5443s.f8405a;
                    }
                }));
                this.countTime = (audioStopAction.getStartTime() - this.playStartTime) + this.countTime;
                this.playStartTime = 0L;
                this.playEndTime = 0L;
                return;
            default:
                return;
        }
    }

    @Override // com.zykj.sketch.core.version.ITaskParse
    @NotNull
    public RenderTask parse(@NotNull List<EzyDrawBoard.ActionContent> content, @NotNull EventListener eventListener, @NotNull InterfaceC6471c viewBack) {
        AbstractC5830k.m5330g(content, "content");
        AbstractC5830k.m5330g(eventListener, "eventListener");
        AbstractC5830k.m5330g(viewBack, "viewBack");
        RenderTask renderTask = new RenderTask(new ArrayList(), new ArrayList(), null, 0L, 8, null);
        Iterator<T> it = content.iterator();
        while (it.hasNext()) {
            parseEventAsTask((EzyDrawBoard.ActionContent) it.next(), eventListener, renderTask, viewBack);
        }
        renderTask.setProgress(this.countTime);
        return renderTask;
    }
}
