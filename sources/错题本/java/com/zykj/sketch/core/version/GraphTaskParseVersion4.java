package com.zykj.sketch.core.version;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.sketch.EzyDrawBoard;
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

@Metadata(m5109d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0000\n\u0002\u0010\u001d\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ?\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0019H\u0002¢\u0006\u0004\b\u000e\u0010\u001fJ9\u0010 \u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00192\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0016¢\u0006\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010#R\u0016\u0010%\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010#R\"\u0010'\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006-"}, m5110d2 = {"Lcom/zykj/sketch/core/version/GraphTaskParseVersion4;", "Lcom/zykj/sketch/core/version/ITaskParse;", "<init>", "()V", "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;", "content", "Lcom/zykj/sketch/core/listener/EventListener;", "eventListener", "Lcom/zykj/sketch/core/data/RenderTask;", "task", "Lkotlin/Function1;", "Lcom/zykj/sketch/core/listener/ViewControl;", "Ld6/s;", "viewBack", "parseEventAsTask", "(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/core/data/RenderTask;Lr6/c;)V", "", "actionTime", "Lkotlin/Function0;", "callBack", "addGraphTask", "(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/core/data/RenderTask;Lr6/a;)V", "eventTime", "countTaskStartTime", "(J)J", "", "filterData", "", "deleteSnapShot", "(Ljava/util/List;)Ljava/lang/Iterable;", "newContentList", "(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;Ljava/util/List;)V", "parse", "(Ljava/util/List;Lcom/zykj/sketch/core/listener/EventListener;Lr6/c;)Lcom/zykj/sketch/core/data/RenderTask;", "countTime", "J", "playStartTime", "playEndTime", "", "flag", "I", "getFlag", "()I", "setFlag", "(I)V", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class GraphTaskParseVersion4 implements ITaskParse {
    private long countTime;
    private int flag;
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
            iArr[EzyDrawBoard.ActionEnum.ACTION_DRAW_CONFIG.ordinal()] = 4;
            iArr[EzyDrawBoard.ActionEnum.ACTION_WEB.ordinal()] = 5;
            iArr[EzyDrawBoard.ActionEnum.ACTION_IMAGE.ordinal()] = 6;
            iArr[EzyDrawBoard.ActionEnum.ACTION_PREV.ordinal()] = 7;
            iArr[EzyDrawBoard.ActionEnum.ACTION_NEXT.ordinal()] = 8;
            iArr[EzyDrawBoard.ActionEnum.ACTION_CLEAR_BOARD.ordinal()] = 9;
            iArr[EzyDrawBoard.ActionEnum.ACTION_AUDIO_START.ordinal()] = 10;
            iArr[EzyDrawBoard.ActionEnum.ACTION_AUDIO_STOP.ordinal()] = 11;
            iArr[EzyDrawBoard.ActionEnum.ACTION_ZOOM.ordinal()] = 12;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void addGraphTask(long actionTime, final EzyDrawBoard.ActionContent content, final EventListener eventListener, RenderTask task, final InterfaceC6469a callBack) {
        GraphTask graphTask = new GraphTask(countTaskStartTime(actionTime), content, new InterfaceC6469a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion4.addGraphTask.2
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m13924invoke() {
                callBack.invoke();
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m13924invoke();
                return C5443s.f8405a;
            }
        }, content.hasGraphSnapshot(), new InterfaceC6469a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion4.addGraphTask.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m13925invoke() {
                EventListener.DefaultImpls.graphSnapShot$default(eventListener, content, false, 2, null);
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m13925invoke();
                return C5443s.f8405a;
            }
        });
        task.getGraphTask().add(graphTask);
        task.setLastSnapshot(graphTask);
    }

    public static /* synthetic */ void addGraphTask$default(GraphTaskParseVersion4 graphTaskParseVersion4, long j7, EzyDrawBoard.ActionContent actionContent, EventListener eventListener, RenderTask renderTask, InterfaceC6469a interfaceC6469a, int i, Object obj) {
        if ((i & 16) != 0) {
            interfaceC6469a = new InterfaceC6469a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion4.addGraphTask.1
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m13923invoke() {
                }

                @Override // p152r6.InterfaceC6469a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m13923invoke();
                    return C5443s.f8405a;
                }
            };
        }
        graphTaskParseVersion4.addGraphTask(j7, actionContent, eventListener, renderTask, interfaceC6469a);
    }

    private final long countTaskStartTime(long eventTime) {
        long j7 = this.playStartTime;
        if (j7 == 0) {
            return this.countTime;
        }
        return (eventTime - j7) + this.countTime;
    }

    private final Iterable<EzyDrawBoard.ActionContent> deleteSnapShot(List<EzyDrawBoard.ActionContent> filterData) {
        this.flag = 0;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = filterData.iterator();
        while (it.hasNext()) {
            parseEventAsTask((EzyDrawBoard.ActionContent) it.next(), arrayList);
        }
        return arrayList;
    }

    private final void parseEventAsTask(final EzyDrawBoard.ActionContent content, EventListener eventListener, RenderTask task, final InterfaceC6471c viewBack) {
        final EventListener eventListener2;
        final EventListener eventListener3 = eventListener;
        EzyDrawBoard.ActionEnum type = content.getType();
        switch (type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                List<EzyDrawBoard.ActionTouchEvent.TouchEvent> touchEventList = ((EzyDrawBoard.ActionTouchEvent) content.getAction().unpack(EzyDrawBoard.ActionTouchEvent.class)).getTouchEventList();
                AbstractC5830k.m5329f(touchEventList, "action.touchEventList");
                int i = 0;
                for (Object obj : touchEventList) {
                    int i8 = i + 1;
                    if (i < 0) {
                        AbstractC5806u.m5258L();
                        throw null;
                    }
                    final EzyDrawBoard.ActionTouchEvent.TouchEvent touchEvent = (EzyDrawBoard.ActionTouchEvent.TouchEvent) obj;
                    if (i == r9.getTouchEventCount() - 1) {
                        addGraphTask(touchEvent.getEventTime(), content, eventListener3, task, new InterfaceC6469a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion4$parseEventAsTask$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // p152r6.InterfaceC6469a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m13926invoke();
                                return C5443s.f8405a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m13926invoke() {
                                EventListener eventListener4 = eventListener3;
                                EzyDrawBoard.ActionTouchEvent.TouchEvent touchEvent2 = touchEvent;
                                AbstractC5830k.m5329f(touchEvent2, "touchEvent");
                                eventListener4.onTouchEvent(touchEvent2);
                            }
                        });
                        eventListener2 = eventListener3;
                    } else {
                        eventListener2 = eventListener3;
                        task.getGraphTask().add(new GraphTask(countTaskStartTime(touchEvent.getEventTime()), content, new InterfaceC6469a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion4$parseEventAsTask$1$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m13927invoke() {
                                EventListener eventListener4 = eventListener2;
                                EzyDrawBoard.ActionTouchEvent.TouchEvent touchEvent2 = touchEvent;
                                AbstractC5830k.m5329f(touchEvent2, "touchEvent");
                                eventListener4.onTouchEvent(touchEvent2);
                            }

                            @Override // p152r6.InterfaceC6469a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m13927invoke();
                                return C5443s.f8405a;
                            }
                        }, false, null, 24, null));
                    }
                    i = i8;
                    eventListener3 = eventListener2;
                }
                break;
            case 2:
                final EzyDrawBoard.ActionModeConfig actionModeConfig = (EzyDrawBoard.ActionModeConfig) content.getAction().unpack(EzyDrawBoard.ActionModeConfig.class);
                addGraphTask(actionModeConfig.getStartTime(), content, eventListener3, task, new InterfaceC6469a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion4.parseEventAsTask.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m13930invoke();
                        return C5443s.f8405a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m13930invoke() {
                        EventListener eventListener4 = eventListener3;
                        EzyDrawBoard.ActionModeConfig action = actionModeConfig;
                        AbstractC5830k.m5329f(action, "action");
                        eventListener4.onActionModeEvent(action);
                    }
                });
                return;
            case 3:
                final EzyDrawBoard.ActionGraphConfig actionGraphConfig = (EzyDrawBoard.ActionGraphConfig) content.getAction().unpack(EzyDrawBoard.ActionGraphConfig.class);
                addGraphTask(actionGraphConfig.getStartTime(), content, eventListener3, task, new InterfaceC6469a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion4.parseEventAsTask.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m13931invoke();
                        return C5443s.f8405a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m13931invoke() {
                        EventListener eventListener4 = eventListener3;
                        EzyDrawBoard.ActionGraphConfig action = actionGraphConfig;
                        AbstractC5830k.m5329f(action, "action");
                        eventListener4.onGraphConfigEvent(action);
                    }
                });
                return;
            case 4:
                final EzyDrawBoard.ActionDrawConfig actionDrawConfig = (EzyDrawBoard.ActionDrawConfig) content.getAction().unpack(EzyDrawBoard.ActionDrawConfig.class);
                addGraphTask(actionDrawConfig.getStartTime(), content, eventListener3, task, new InterfaceC6469a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion4.parseEventAsTask.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m13932invoke();
                        return C5443s.f8405a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m13932invoke() {
                        EventListener eventListener4 = eventListener3;
                        EzyDrawBoard.ActionDrawConfig action = actionDrawConfig;
                        AbstractC5830k.m5329f(action, "action");
                        eventListener4.onDrawConfigEvent(action);
                    }
                });
                return;
            case 5:
                final EzyDrawBoard.ActionWebViewConfig actionWebViewConfig = (EzyDrawBoard.ActionWebViewConfig) content.getAction().unpack(EzyDrawBoard.ActionWebViewConfig.class);
                addGraphTask(actionWebViewConfig.getStartTime(), content, eventListener3, task, new InterfaceC6469a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion4.parseEventAsTask.5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m13933invoke();
                        return C5443s.f8405a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m13933invoke() {
                        EventListener eventListener4 = eventListener3;
                        EzyDrawBoard.ActionWebViewConfig action = actionWebViewConfig;
                        AbstractC5830k.m5329f(action, "action");
                        eventListener4.onAddPPTEvent(action, viewBack);
                    }
                });
                return;
            case 6:
                final EzyDrawBoard.ActionImageConfig actionImageConfig = (EzyDrawBoard.ActionImageConfig) content.getAction().unpack(EzyDrawBoard.ActionImageConfig.class);
                addGraphTask(actionImageConfig.getStartTime(), content, eventListener3, task, new InterfaceC6469a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion4.parseEventAsTask.6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m13934invoke();
                        return C5443s.f8405a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m13934invoke() {
                        EventListener eventListener4 = eventListener3;
                        EzyDrawBoard.ActionImageConfig action = actionImageConfig;
                        AbstractC5830k.m5329f(action, "action");
                        EventListener.DefaultImpls.onAddImageEvent$default(eventListener4, action, null, 2, null);
                    }
                });
                return;
            case 7:
                addGraphTask(((EzyDrawBoard.ActionPrevAction) content.getAction().unpack(EzyDrawBoard.ActionPrevAction.class)).getStartTime(), content, eventListener3, task, new InterfaceC6469a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion4.parseEventAsTask.7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m13935invoke();
                        return C5443s.f8405a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m13935invoke() {
                        EventListener.DefaultImpls.graphSnapShot$default(eventListener3, content, false, 2, null);
                    }
                });
                return;
            case 8:
                addGraphTask(((EzyDrawBoard.ActionNextAction) content.getAction().unpack(EzyDrawBoard.ActionNextAction.class)).getStartTime(), content, eventListener3, task, new InterfaceC6469a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion4.parseEventAsTask.8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m13936invoke();
                        return C5443s.f8405a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m13936invoke() {
                        EventListener.DefaultImpls.graphSnapShot$default(eventListener3, content, false, 2, null);
                    }
                });
                return;
            case 9:
                final EzyDrawBoard.ActionClearBoard actionClearBoard = (EzyDrawBoard.ActionClearBoard) content.getAction().unpack(EzyDrawBoard.ActionClearBoard.class);
                addGraphTask(actionClearBoard.getStartTime(), content, eventListener3, task, new InterfaceC6469a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion4.parseEventAsTask.9
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m13937invoke();
                        return C5443s.f8405a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m13937invoke() {
                        EventListener eventListener4 = eventListener3;
                        EzyDrawBoard.ActionClearBoard action = actionClearBoard;
                        AbstractC5830k.m5329f(action, "action");
                        eventListener4.onClearBoardEvent(action);
                    }
                });
                return;
            case 10:
                EzyDrawBoard.AudioStartAction audioStartAction = (EzyDrawBoard.AudioStartAction) content.getAction().unpack(EzyDrawBoard.AudioStartAction.class);
                System.out.println((Object) ("AudioControl ACTION_AUDIO_START ACTION_AUDIO_START " + audioStartAction.getFileName()));
                addGraphTask(audioStartAction.getStartTime(), content, eventListener3, task, new InterfaceC6469a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion4.parseEventAsTask.10
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m13928invoke();
                        return C5443s.f8405a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m13928invoke() {
                        EventListener.DefaultImpls.graphSnapShot$default(eventListener3, content, false, 2, null);
                    }
                });
                this.playStartTime = audioStartAction.getStartTime();
                this.playEndTime = audioStartAction.getStartTime();
                List<AudioTask> audioTaskList = task.getAudioTaskList();
                long j7 = this.countTime;
                String fileName = audioStartAction.getFileName();
                AbstractC5830k.m5329f(fileName, "action.fileName");
                audioTaskList.add(new AudioTask(j7, fileName, null, 0, 12, null));
                return;
            case 11:
                EzyDrawBoard.AudioStopAction audioStopAction = (EzyDrawBoard.AudioStopAction) content.getAction().unpack(EzyDrawBoard.AudioStopAction.class);
                System.out.println((Object) ("AudioControl ACTION_AUDIO_START ACTION_AUDIO_STOP " + audioStopAction.getFileName()));
                addGraphTask$default(this, audioStopAction.getStartTime(), content, eventListener, task, null, 16, null);
                this.countTime = (audioStopAction.getStartTime() - this.playStartTime) + this.countTime;
                this.playStartTime = 0L;
                this.playEndTime = 0L;
                return;
            case 12:
                final EzyDrawBoard.ActionZoom actionZoom = (EzyDrawBoard.ActionZoom) content.getAction().unpack(EzyDrawBoard.ActionZoom.class);
                addGraphTask(actionZoom.getStartTime(), content, eventListener3, task, new InterfaceC6469a() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion4.parseEventAsTask.11
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m13929invoke();
                        return C5443s.f8405a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m13929invoke() {
                        EventListener eventListener4 = eventListener3;
                        EzyDrawBoard.ActionZoom action = actionZoom;
                        AbstractC5830k.m5329f(action, "action");
                        eventListener4.onZoom(action);
                    }
                });
                return;
        }
    }

    public final int getFlag() {
        return this.flag;
    }

    @Override // com.zykj.sketch.core.version.ITaskParse
    @NotNull
    public RenderTask parse(@NotNull List<EzyDrawBoard.ActionContent> content, @NotNull EventListener eventListener, @NotNull InterfaceC6471c viewBack) {
        AbstractC5830k.m5330g(content, "content");
        AbstractC5830k.m5330g(eventListener, "eventListener");
        AbstractC5830k.m5330g(viewBack, "viewBack");
        RenderTask renderTask = new RenderTask(new ArrayList(), new ArrayList(), null, 0L, 8, null);
        Iterable<EzyDrawBoard.ActionContent> iterableDeleteSnapShot = deleteSnapShot(content);
        if (iterableDeleteSnapShot != null) {
            Iterator<EzyDrawBoard.ActionContent> it = iterableDeleteSnapShot.iterator();
            while (it.hasNext()) {
                parseEventAsTask(it.next(), eventListener, renderTask, viewBack);
            }
        }
        renderTask.setProgress(this.countTime);
        return renderTask;
    }

    public final void setFlag(int i) {
        this.flag = i;
    }

    private final void parseEventAsTask(EzyDrawBoard.ActionContent content, List<EzyDrawBoard.ActionContent> newContentList) {
        EzyDrawBoard.ActionContent.Builder builderNewBuilder = EzyDrawBoard.ActionContent.newBuilder();
        builderNewBuilder.setType(content.getType());
        builderNewBuilder.setAction(content.getAction());
        if (content.hasGraphSnapshot() && (this.flag == 0 || content.getType() != EzyDrawBoard.ActionEnum.ACTION_TOUCH)) {
            System.out.println((Object) (builderNewBuilder.hasGraphSnapshot() + ' ' + this.flag + "   " + content.getType()));
            builderNewBuilder.setResetData(content.getResetData());
            builderNewBuilder.setGraphSnapshot(content.getGraphSnapshot());
            this.flag = this.flag + 1;
        }
        EzyDrawBoard.ActionContent actionContentBuild = builderNewBuilder.build();
        AbstractC5830k.m5329f(actionContentBuild, "builder.build()");
        newContentList.add(actionContentBuild);
    }
}
