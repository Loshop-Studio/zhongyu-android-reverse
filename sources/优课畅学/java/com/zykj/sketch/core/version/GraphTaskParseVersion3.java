package com.zykj.sketch.core.version;

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
public final class GraphTaskParseVersion3 implements ITaskParse {
    private long countTime;
    private int flag;
    private long playEndTime;
    private long playStartTime;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EzyDrawBoard.ActionEnum.values().length];
            iArr[EzyDrawBoard.ActionEnum.ACTION_TOUCH.ordinal()] = 1;
            iArr[EzyDrawBoard.ActionEnum.ACTION_DRAW_CONFIG.ordinal()] = 2;
            iArr[EzyDrawBoard.ActionEnum.ACTION_WEB.ordinal()] = 3;
            iArr[EzyDrawBoard.ActionEnum.ACTION_IMAGE.ordinal()] = 4;
            iArr[EzyDrawBoard.ActionEnum.ACTION_PREV.ordinal()] = 5;
            iArr[EzyDrawBoard.ActionEnum.ACTION_NEXT.ordinal()] = 6;
            iArr[EzyDrawBoard.ActionEnum.ACTION_CLEAR_BOARD.ordinal()] = 7;
            iArr[EzyDrawBoard.ActionEnum.ACTION_AUDIO_START.ordinal()] = 8;
            iArr[EzyDrawBoard.ActionEnum.ACTION_AUDIO_STOP.ordinal()] = 9;
            iArr[EzyDrawBoard.ActionEnum.ACTION_ZOOM.ordinal()] = 10;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void addGraphTask(long j10, final EzyDrawBoard.ActionContent actionContent, final EventListener eventListener, RenderTask renderTask, final InterfaceC10559a interfaceC10559a) {
        GraphTask graphTask = new GraphTask(countTaskStartTime(j10), actionContent, new InterfaceC10559a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion3.addGraphTask.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27568invoke() {
                if (actionContent.hasGraphSnapshot()) {
                    EventListener.DefaultImpls.graphSnapShot$default(eventListener, actionContent, false, 2, null);
                } else {
                    interfaceC10559a.invoke();
                }
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27568invoke();
                return C8736p.f16368a;
            }
        }, actionContent.hasGraphSnapshot(), new InterfaceC10559a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion3.addGraphTask.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27569invoke() {
                EventListener.DefaultImpls.graphSnapShot$default(eventListener, actionContent, false, 2, null);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27569invoke();
                return C8736p.f16368a;
            }
        });
        renderTask.getGraphTask().add(graphTask);
        if (actionContent.hasGraphSnapshot()) {
            renderTask.setLastSnapshot(graphTask);
        }
    }

    public static /* synthetic */ void addGraphTask$default(GraphTaskParseVersion3 graphTaskParseVersion3, long j10, EzyDrawBoard.ActionContent actionContent, EventListener eventListener, RenderTask renderTask, InterfaceC10559a interfaceC10559a, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            interfaceC10559a = new InterfaceC10559a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion3.addGraphTask.1
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m27567invoke() {
                }

                @Override // p300x7.InterfaceC10559a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m27567invoke();
                    return C8736p.f16368a;
                }
            };
        }
        graphTaskParseVersion3.addGraphTask(j10, actionContent, eventListener, renderTask, interfaceC10559a);
    }

    private final long countTaskStartTime(long j10) {
        long j11 = this.playStartTime;
        return j11 == 0 ? this.countTime : this.countTime + (j10 - j11);
    }

    private final Iterable<EzyDrawBoard.ActionContent> deleteSnapShot(List<EzyDrawBoard.ActionContent> list) {
        this.flag = 0;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            parseEventAsTask((EzyDrawBoard.ActionContent) it.next(), arrayList);
        }
        return arrayList;
    }

    private final void parseEventAsTask(final EzyDrawBoard.ActionContent actionContent, EventListener eventListener, RenderTask renderTask, InterfaceC10570l interfaceC10570l) {
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
                        addGraphTask(touchEvent.getEventTime(), actionContent, eventListener3, renderTask, new InterfaceC10559a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion3$parseEventAsTask$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // p300x7.InterfaceC10559a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m27570invoke();
                                return C8736p.f16368a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m27570invoke() {
                                EventListener eventListener4 = eventListener3;
                                EzyDrawBoard.ActionTouchEvent.TouchEvent touchEvent2 = touchEvent;
                                AbstractC9133u.m16132f(touchEvent2, "touchEvent");
                                eventListener4.onTouchEvent(touchEvent2);
                            }
                        });
                        eventListener2 = eventListener3;
                    } else {
                        eventListener2 = eventListener3;
                        if (i10 == 0) {
                            renderTask.getGraphTask().add(new GraphTask(countTaskStartTime(touchEvent.getEventTime()), actionContent, new InterfaceC10559a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion3$parseEventAsTask$1$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m27571invoke() {
                                    EventListener eventListener4 = eventListener2;
                                    EzyDrawBoard.GraphResetData resetData = actionContent.getResetData();
                                    AbstractC9133u.m16132f(resetData, "content.resetData");
                                    eventListener4.initConfig(resetData);
                                    EventListener eventListener5 = eventListener2;
                                    EzyDrawBoard.ActionTouchEvent.TouchEvent touchEvent2 = touchEvent;
                                    AbstractC9133u.m16132f(touchEvent2, "touchEvent");
                                    eventListener5.onTouchEvent(touchEvent2);
                                }

                                @Override // p300x7.InterfaceC10559a
                                public /* bridge */ /* synthetic */ Object invoke() {
                                    m27571invoke();
                                    return C8736p.f16368a;
                                }
                            }, false, null, 24, null));
                        } else {
                            renderTask.getGraphTask().add(new GraphTask(countTaskStartTime(touchEvent.getEventTime()), actionContent, new InterfaceC10559a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion3$parseEventAsTask$1$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m27572invoke() {
                                    EventListener eventListener4 = eventListener2;
                                    EzyDrawBoard.ActionTouchEvent.TouchEvent touchEvent2 = touchEvent;
                                    AbstractC9133u.m16132f(touchEvent2, "touchEvent");
                                    eventListener4.onTouchEvent(touchEvent2);
                                }

                                @Override // p300x7.InterfaceC10559a
                                public /* bridge */ /* synthetic */ Object invoke() {
                                    m27572invoke();
                                    return C8736p.f16368a;
                                }
                            }, false, null, 24, null));
                        }
                    }
                    i10 = i11;
                    eventListener3 = eventListener2;
                }
                break;
            case 2:
                addGraphTask(((EzyDrawBoard.ActionDrawConfig) actionContent.getAction().unpack(EzyDrawBoard.ActionDrawConfig.class)).getStartTime(), actionContent, eventListener3, renderTask, new InterfaceC10559a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion3.parseEventAsTask.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p300x7.InterfaceC10559a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m27574invoke();
                        return C8736p.f16368a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m27574invoke() {
                        EventListener.DefaultImpls.graphSnapShot$default(eventListener3, actionContent, false, 2, null);
                    }
                });
                return;
            case 3:
                addGraphTask(((EzyDrawBoard.ActionWebViewConfig) actionContent.getAction().unpack(EzyDrawBoard.ActionWebViewConfig.class)).getStartTime(), actionContent, eventListener3, renderTask, new InterfaceC10559a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion3.parseEventAsTask.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p300x7.InterfaceC10559a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m27575invoke();
                        return C8736p.f16368a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m27575invoke() {
                        EventListener.DefaultImpls.graphSnapShot$default(eventListener3, actionContent, false, 2, null);
                    }
                });
                return;
            case 4:
                addGraphTask(((EzyDrawBoard.ActionImageConfig) actionContent.getAction().unpack(EzyDrawBoard.ActionImageConfig.class)).getStartTime(), actionContent, eventListener3, renderTask, new InterfaceC10559a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion3.parseEventAsTask.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p300x7.InterfaceC10559a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m27576invoke();
                        return C8736p.f16368a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m27576invoke() {
                        EventListener.DefaultImpls.graphSnapShot$default(eventListener3, actionContent, false, 2, null);
                    }
                });
                return;
            case 5:
                addGraphTask(((EzyDrawBoard.ActionPrevAction) actionContent.getAction().unpack(EzyDrawBoard.ActionPrevAction.class)).getStartTime(), actionContent, eventListener3, renderTask, new InterfaceC10559a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion3.parseEventAsTask.5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p300x7.InterfaceC10559a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m27577invoke();
                        return C8736p.f16368a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m27577invoke() {
                        EventListener.DefaultImpls.graphSnapShot$default(eventListener3, actionContent, false, 2, null);
                    }
                });
                return;
            case 6:
                addGraphTask(((EzyDrawBoard.ActionNextAction) actionContent.getAction().unpack(EzyDrawBoard.ActionNextAction.class)).getStartTime(), actionContent, eventListener3, renderTask, new InterfaceC10559a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion3.parseEventAsTask.6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p300x7.InterfaceC10559a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m27578invoke();
                        return C8736p.f16368a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m27578invoke() {
                        EventListener.DefaultImpls.graphSnapShot$default(eventListener3, actionContent, false, 2, null);
                    }
                });
                return;
            case 7:
                addGraphTask(((EzyDrawBoard.ActionClearBoard) actionContent.getAction().unpack(EzyDrawBoard.ActionClearBoard.class)).getStartTime(), actionContent, eventListener3, renderTask, new InterfaceC10559a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion3.parseEventAsTask.7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p300x7.InterfaceC10559a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m27579invoke();
                        return C8736p.f16368a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m27579invoke() {
                        EventListener.DefaultImpls.graphSnapShot$default(eventListener3, actionContent, false, 2, null);
                    }
                });
                return;
            case 8:
                EzyDrawBoard.AudioStartAction audioStartAction = (EzyDrawBoard.AudioStartAction) actionContent.getAction().unpack(EzyDrawBoard.AudioStartAction.class);
                System.out.println((Object) ("AudioControl ACTION_AUDIO_START ACTION_AUDIO_START " + audioStartAction.getFileName()));
                addGraphTask(audioStartAction.getStartTime(), actionContent, eventListener3, renderTask, new InterfaceC10559a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion3.parseEventAsTask.8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p300x7.InterfaceC10559a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m27580invoke();
                        return C8736p.f16368a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m27580invoke() {
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
            case 9:
                EzyDrawBoard.AudioStopAction audioStopAction = (EzyDrawBoard.AudioStopAction) actionContent.getAction().unpack(EzyDrawBoard.AudioStopAction.class);
                System.out.println((Object) ("AudioControl ACTION_AUDIO_START ACTION_AUDIO_STOP " + audioStopAction.getFileName()));
                addGraphTask(audioStopAction.getStartTime(), actionContent, eventListener3, renderTask, new InterfaceC10559a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion3.parseEventAsTask.9
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p300x7.InterfaceC10559a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m27581invoke();
                        return C8736p.f16368a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m27581invoke() {
                        EventListener.DefaultImpls.graphSnapShot$default(eventListener3, actionContent, false, 2, null);
                    }
                });
                this.countTime = this.countTime + (audioStopAction.getStartTime() - this.playStartTime);
                this.playStartTime = 0L;
                this.playEndTime = 0L;
                return;
            case 10:
                addGraphTask(((EzyDrawBoard.ActionZoom) actionContent.getAction().unpack(EzyDrawBoard.ActionZoom.class)).getStartTime(), actionContent, eventListener3, renderTask, new InterfaceC10559a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion3.parseEventAsTask.10
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p300x7.InterfaceC10559a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m27573invoke();
                        return C8736p.f16368a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m27573invoke() {
                        EventListener.DefaultImpls.graphSnapShot$default(eventListener3, actionContent, false, 2, null);
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
        if (actionContent.hasGraphSnapshot() && (this.flag == 0 || actionContent.getType() != EzyDrawBoard.ActionEnum.ACTION_TOUCH)) {
            System.out.println((Object) (builderNewBuilder.hasGraphSnapshot() + ' ' + this.flag + "   " + actionContent.getType()));
            builderNewBuilder.setResetData(actionContent.getResetData());
            builderNewBuilder.setGraphSnapshot(actionContent.getGraphSnapshot());
            this.flag = this.flag + 1;
        }
        EzyDrawBoard.ActionContent actionContentBuild = builderNewBuilder.build();
        AbstractC9133u.m16132f(actionContentBuild, "builder.build()");
        list.add(actionContentBuild);
    }
}
