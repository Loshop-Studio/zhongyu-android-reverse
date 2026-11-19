package com.zykj.sketch.core.version;

// RE note 把第 5 版动作记录和图元快照转为可回放的绘图任务。

import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.core.data.AudioTask;
import com.zykj.sketch.core.data.GraphTask;
import com.zykj.sketch.core.data.RenderTask;
import com.zykj.sketch.core.listener.EventListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p134i7.AbstractC8809v;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public final class GraphTaskParseVersion5 implements ITaskParse {
    private long countTime;
    private int flag;
    private long playEndTime;
    private long playStartTime;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EzyDrawBoard.ActionEnum.values().length];
            iArr[EzyDrawBoard.ActionEnum.ACTION_TOUCH.ordinal()] = 1;
            iArr[EzyDrawBoard.ActionEnum.ACTION_MODE.ordinal()] = 2;
            iArr[EzyDrawBoard.ActionEnum.ACTION_GRAPH.ordinal()] = 3;
            iArr[EzyDrawBoard.ActionEnum.ACTION_DRAW_CONFIG.ordinal()] = 4;
            iArr[EzyDrawBoard.ActionEnum.ACTION_WEB.ordinal()] = 5;
            iArr[EzyDrawBoard.ActionEnum.ACTION_IMAGE.ordinal()] = 6;
            iArr[EzyDrawBoard.ActionEnum.ACTION_PREV.ordinal()] = 7;
            iArr[EzyDrawBoard.ActionEnum.ACTION_NEXT.ordinal()] = 8;
            iArr[EzyDrawBoard.ActionEnum.ACTION_CLEAR_BOARD.ordinal()] = 9;
            iArr[EzyDrawBoard.ActionEnum.ACTION_AUDIO_START.ordinal()] = 10;
            iArr[EzyDrawBoard.ActionEnum.ACTION_AUDIO_STOP.ordinal()] = 11;
            iArr[EzyDrawBoard.ActionEnum.ACTION_ZOOM.ordinal()] = 12;
            iArr[EzyDrawBoard.ActionEnum.ACTION_TRANS.ordinal()] = 13;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void addGraphTask(long j10, final EzyDrawBoard.ActionContent actionContent, final EventListener eventListener, RenderTask renderTask, final InterfaceC10559a interfaceC10559a) {
        GraphTask graphTask = new GraphTask(countTaskStartTime(j10), actionContent, new InterfaceC10559a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion5.addGraphTask.2
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27598invoke() {
                interfaceC10559a.invoke();
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27598invoke();
                return C8736p.f16368a;
            }
        }, actionContent.hasGraphSnapshot(), new InterfaceC10559a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion5.addGraphTask.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27599invoke() {
                EventListener.DefaultImpls.graphSnapShot$default(eventListener, actionContent, false, 2, null);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27599invoke();
                return C8736p.f16368a;
            }
        });
        renderTask.getGraphTask().add(graphTask);
        if (actionContent.hasGraphSnapshot()) {
            renderTask.setLastSnapshot(graphTask);
        }
    }

    public static /* synthetic */ void addGraphTask$default(GraphTaskParseVersion5 graphTaskParseVersion5, long j10, EzyDrawBoard.ActionContent actionContent, EventListener eventListener, RenderTask renderTask, InterfaceC10559a interfaceC10559a, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            interfaceC10559a = new InterfaceC10559a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion5.addGraphTask.1
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m27597invoke() {
                }

                @Override // p300x7.InterfaceC10559a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m27597invoke();
                    return C8736p.f16368a;
                }
            };
        }
        graphTaskParseVersion5.addGraphTask(j10, actionContent, eventListener, renderTask, interfaceC10559a);
    }

    private final long countTaskStartTime(long j10) {
        long j11 = this.playStartTime;
        return j11 == 0 ? this.countTime : this.countTime + (j10 - j11);
    }

    private final Iterable<EzyDrawBoard.ActionContent> deleteSnapShot(List<EzyDrawBoard.ActionContent> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            parseEventAsTask((EzyDrawBoard.ActionContent) it.next(), arrayList);
        }
        return arrayList;
    }

    private final void parseEventAsTask(final EzyDrawBoard.ActionContent actionContent, EventListener eventListener, RenderTask renderTask, final InterfaceC10570l interfaceC10570l) {
        final EventListener eventListener2;
        final EventListener eventListener3 = eventListener;
        EzyDrawBoard.ActionEnum type = actionContent.getType();
        switch (type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                List<EzyDrawBoard.ActionTouchEvent.TouchEvent> touchEventList = ((EzyDrawBoard.ActionTouchEvent) actionContent.getAction().unpack(EzyDrawBoard.ActionTouchEvent.class)).getTouchEventList();
                AbstractC9133u.m16132f(touchEventList, "action.touchEventList");
                int i10 = 0;
                for (Object obj : touchEventList) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        AbstractC8809v.m14780w();
                    }
                    final EzyDrawBoard.ActionTouchEvent.TouchEvent touchEvent = (EzyDrawBoard.ActionTouchEvent.TouchEvent) obj;
                    if (i10 == r9.getTouchEventCount() - 1) {
                        addGraphTask(touchEvent.getEventTime(), actionContent, eventListener3, renderTask, new InterfaceC10559a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion5$parseEventAsTask$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // p300x7.InterfaceC10559a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m27600invoke();
                                return C8736p.f16368a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m27600invoke() {
                                EventListener eventListener4 = eventListener3;
                                EzyDrawBoard.ActionTouchEvent.TouchEvent touchEvent2 = touchEvent;
                                AbstractC9133u.m16132f(touchEvent2, "touchEvent");
                                eventListener4.onTouchEvent(touchEvent2);
                            }
                        });
                        eventListener2 = eventListener3;
                    } else {
                        eventListener2 = eventListener3;
                        renderTask.getGraphTask().add(new GraphTask(countTaskStartTime(touchEvent.getEventTime()), actionContent, new InterfaceC10559a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion5$parseEventAsTask$1$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m27601invoke() {
                                EventListener eventListener4 = eventListener2;
                                EzyDrawBoard.ActionTouchEvent.TouchEvent touchEvent2 = touchEvent;
                                AbstractC9133u.m16132f(touchEvent2, "touchEvent");
                                eventListener4.onTouchEvent(touchEvent2);
                            }

                            @Override // p300x7.InterfaceC10559a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m27601invoke();
                                return C8736p.f16368a;
                            }
                        }, false, null, 24, null));
                    }
                    i10 = i11;
                    eventListener3 = eventListener2;
                }
                break;
            case 2:
                final EzyDrawBoard.ActionModeConfig actionModeConfig = (EzyDrawBoard.ActionModeConfig) actionContent.getAction().unpack(EzyDrawBoard.ActionModeConfig.class);
                addGraphTask(actionModeConfig.getStartTime(), actionContent, eventListener3, renderTask, new InterfaceC10559a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion5.parseEventAsTask.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p300x7.InterfaceC10559a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m27606invoke();
                        return C8736p.f16368a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m27606invoke() {
                        EventListener eventListener4 = eventListener3;
                        EzyDrawBoard.ActionModeConfig action = actionModeConfig;
                        AbstractC9133u.m16132f(action, "action");
                        eventListener4.onActionModeEvent(action);
                    }
                });
                return;
            case 3:
                final EzyDrawBoard.ActionGraphConfig actionGraphConfig = (EzyDrawBoard.ActionGraphConfig) actionContent.getAction().unpack(EzyDrawBoard.ActionGraphConfig.class);
                addGraphTask(actionGraphConfig.getStartTime(), actionContent, eventListener3, renderTask, new InterfaceC10559a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion5.parseEventAsTask.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p300x7.InterfaceC10559a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m27607invoke();
                        return C8736p.f16368a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m27607invoke() {
                        EventListener eventListener4 = eventListener3;
                        EzyDrawBoard.ActionGraphConfig action = actionGraphConfig;
                        AbstractC9133u.m16132f(action, "action");
                        eventListener4.onGraphConfigEvent(action);
                    }
                });
                return;
            case 4:
                final EzyDrawBoard.ActionDrawConfig actionDrawConfig = (EzyDrawBoard.ActionDrawConfig) actionContent.getAction().unpack(EzyDrawBoard.ActionDrawConfig.class);
                addGraphTask(actionDrawConfig.getStartTime(), actionContent, eventListener3, renderTask, new InterfaceC10559a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion5.parseEventAsTask.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p300x7.InterfaceC10559a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m27608invoke();
                        return C8736p.f16368a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m27608invoke() {
                        EventListener eventListener4 = eventListener3;
                        EzyDrawBoard.ActionDrawConfig action = actionDrawConfig;
                        AbstractC9133u.m16132f(action, "action");
                        eventListener4.onDrawConfigEvent(action);
                    }
                });
                return;
            case 5:
                final EzyDrawBoard.ActionWebViewConfig actionWebViewConfig = (EzyDrawBoard.ActionWebViewConfig) actionContent.getAction().unpack(EzyDrawBoard.ActionWebViewConfig.class);
                addGraphTask(actionWebViewConfig.getStartTime(), actionContent, eventListener3, renderTask, new InterfaceC10559a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion5.parseEventAsTask.5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p300x7.InterfaceC10559a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m27609invoke();
                        return C8736p.f16368a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m27609invoke() {
                        EventListener eventListener4 = eventListener3;
                        EzyDrawBoard.ActionWebViewConfig action = actionWebViewConfig;
                        AbstractC9133u.m16132f(action, "action");
                        eventListener4.onAddPPTEvent(action, interfaceC10570l);
                    }
                });
                return;
            case 6:
                final EzyDrawBoard.ActionImageConfig actionImageConfig = (EzyDrawBoard.ActionImageConfig) actionContent.getAction().unpack(EzyDrawBoard.ActionImageConfig.class);
                addGraphTask(actionImageConfig.getStartTime(), actionContent, eventListener3, renderTask, new InterfaceC10559a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion5.parseEventAsTask.6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p300x7.InterfaceC10559a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m27610invoke();
                        return C8736p.f16368a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m27610invoke() {
                        EventListener eventListener4 = eventListener3;
                        EzyDrawBoard.ActionImageConfig action = actionImageConfig;
                        AbstractC9133u.m16132f(action, "action");
                        EventListener.DefaultImpls.onAddImageEvent$default(eventListener4, action, null, 2, null);
                    }
                });
                return;
            case 7:
                addGraphTask(((EzyDrawBoard.ActionPrevAction) actionContent.getAction().unpack(EzyDrawBoard.ActionPrevAction.class)).getStartTime(), actionContent, eventListener3, renderTask, new InterfaceC10559a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion5.parseEventAsTask.7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p300x7.InterfaceC10559a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m27611invoke();
                        return C8736p.f16368a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m27611invoke() {
                        EventListener.DefaultImpls.graphSnapShot$default(eventListener3, actionContent, false, 2, null);
                    }
                });
                return;
            case 8:
                addGraphTask(((EzyDrawBoard.ActionNextAction) actionContent.getAction().unpack(EzyDrawBoard.ActionNextAction.class)).getStartTime(), actionContent, eventListener3, renderTask, new InterfaceC10559a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion5.parseEventAsTask.8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p300x7.InterfaceC10559a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m27612invoke();
                        return C8736p.f16368a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m27612invoke() {
                        EventListener.DefaultImpls.graphSnapShot$default(eventListener3, actionContent, false, 2, null);
                    }
                });
                return;
            case 9:
                final EzyDrawBoard.ActionClearBoard actionClearBoard = (EzyDrawBoard.ActionClearBoard) actionContent.getAction().unpack(EzyDrawBoard.ActionClearBoard.class);
                addGraphTask(actionClearBoard.getStartTime(), actionContent, eventListener3, renderTask, new InterfaceC10559a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion5.parseEventAsTask.9
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p300x7.InterfaceC10559a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m27613invoke();
                        return C8736p.f16368a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m27613invoke() {
                        EventListener eventListener4 = eventListener3;
                        EzyDrawBoard.ActionClearBoard action = actionClearBoard;
                        AbstractC9133u.m16132f(action, "action");
                        eventListener4.onClearBoardEvent(action);
                    }
                });
                return;
            case 10:
                EzyDrawBoard.AudioStartAction audioStartAction = (EzyDrawBoard.AudioStartAction) actionContent.getAction().unpack(EzyDrawBoard.AudioStartAction.class);
                System.out.println((Object) ("AudioControl ACTION_AUDIO_START ACTION_AUDIO_START " + audioStartAction.getFileName()));
                addGraphTask(audioStartAction.getStartTime(), actionContent, eventListener3, renderTask, new InterfaceC10559a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion5.parseEventAsTask.10
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p300x7.InterfaceC10559a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m27602invoke();
                        return C8736p.f16368a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m27602invoke() {
                        EventListener.DefaultImpls.graphSnapShot$default(eventListener3, actionContent, false, 2, null);
                    }
                });
                this.playStartTime = audioStartAction.getStartTime();
                this.playEndTime = audioStartAction.getStartTime();
                List<AudioTask> audioTaskList = renderTask.getAudioTaskList();
                long j10 = this.countTime;
                String fileName = audioStartAction.getFileName();
                AbstractC9133u.m16132f(fileName, "action.fileName");
                audioTaskList.add(new AudioTask(j10, fileName, null, 0, 12, null));
                return;
            case 11:
                EzyDrawBoard.AudioStopAction audioStopAction = (EzyDrawBoard.AudioStopAction) actionContent.getAction().unpack(EzyDrawBoard.AudioStopAction.class);
                System.out.println((Object) ("AudioControl ACTION_AUDIO_START ACTION_AUDIO_STOP " + audioStopAction.getFileName()));
                addGraphTask(audioStopAction.getStartTime(), actionContent, eventListener3, renderTask, new InterfaceC10559a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion5.parseEventAsTask.11
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p300x7.InterfaceC10559a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m27603invoke();
                        return C8736p.f16368a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m27603invoke() {
                        EventListener.DefaultImpls.graphSnapShot$default(eventListener3, actionContent, false, 2, null);
                    }
                });
                this.countTime = this.countTime + (audioStopAction.getStartTime() - this.playStartTime);
                this.playStartTime = 0L;
                this.playEndTime = 0L;
                return;
            case 12:
                final EzyDrawBoard.ActionZoom actionZoom = (EzyDrawBoard.ActionZoom) actionContent.getAction().unpack(EzyDrawBoard.ActionZoom.class);
                addGraphTask(actionZoom.getStartTime(), actionContent, eventListener3, renderTask, new InterfaceC10559a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion5.parseEventAsTask.12
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p300x7.InterfaceC10559a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m27604invoke();
                        return C8736p.f16368a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m27604invoke() {
                        EventListener eventListener4 = eventListener3;
                        EzyDrawBoard.ActionZoom action = actionZoom;
                        AbstractC9133u.m16132f(action, "action");
                        eventListener4.onZoom(action);
                    }
                });
                return;
            case 13:
                final EzyDrawBoard.ActionTranslation actionTranslation = (EzyDrawBoard.ActionTranslation) actionContent.getAction().unpack(EzyDrawBoard.ActionTranslation.class);
                addGraphTask(actionTranslation.getStartTime(), actionContent, eventListener3, renderTask, new InterfaceC10559a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion5.parseEventAsTask.13
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p300x7.InterfaceC10559a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m27605invoke();
                        return C8736p.f16368a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m27605invoke() {
                        EventListener eventListener4 = eventListener3;
                        EzyDrawBoard.ActionTranslation action = actionTranslation;
                        AbstractC9133u.m16132f(action, "action");
                        eventListener4.onTranslation(action);
                    }
                });
                return;
        }
    }

    public final int getFlag() {
        return this.flag;
    }

    @Override // com.zykj.sketch.core.version.ITaskParse
    public RenderTask parse(List<EzyDrawBoard.ActionContent> content, EventListener eventListener, InterfaceC10570l viewBack) {
        AbstractC9133u.m16133g(content, "content");
        AbstractC9133u.m16133g(eventListener, "eventListener");
        AbstractC9133u.m16133g(viewBack, "viewBack");
        RenderTask renderTask = new RenderTask(new ArrayList(), new ArrayList(), null, 0L, 8, null);
        this.flag = 0;
        Iterator<T> it = content.iterator();
        while (it.hasNext()) {
            parseEventAsTask((EzyDrawBoard.ActionContent) it.next(), eventListener, renderTask, viewBack);
        }
        renderTask.setProgress(this.countTime);
        return renderTask;
    }

    public final void setFlag(int i10) {
        this.flag = i10;
    }

    private final void parseEventAsTask(EzyDrawBoard.ActionContent actionContent, List<EzyDrawBoard.ActionContent> list) {
        EzyDrawBoard.ActionContent.Builder builderNewBuilder = EzyDrawBoard.ActionContent.newBuilder();
        builderNewBuilder.setType(actionContent.getType());
        builderNewBuilder.setAction(actionContent.getAction());
        builderNewBuilder.setResetData(actionContent.getResetData());
        if (actionContent.hasGraphSnapshot() && (this.flag == 0 || actionContent.getType() != EzyDrawBoard.ActionEnum.ACTION_TOUCH)) {
            System.out.println((Object) (builderNewBuilder.hasGraphSnapshot() + ' ' + this.flag + "   " + actionContent.getType()));
            builderNewBuilder.setGraphSnapshot(actionContent.getGraphSnapshot());
            this.flag = this.flag + 1;
        }
        EzyDrawBoard.ActionContent actionContentBuild = builderNewBuilder.build();
        AbstractC9133u.m16132f(actionContentBuild, "builder.build()");
        list.add(actionContentBuild);
    }
}
