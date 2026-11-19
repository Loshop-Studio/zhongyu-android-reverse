package com.zykj.sketch.core.version;

import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.core.data.AudioTask;
import com.zykj.sketch.core.data.GraphTask;
import com.zykj.sketch.core.data.RenderTask;
import com.zykj.sketch.core.listener.EventListener;
import com.zykj.sketch.core.listener.ViewControl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001d\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J8\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0002J\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u001dH\u0002J2\u0010\u001e\u001a\u00020\u00152\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u001d2\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000e0 H\u0016J4\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000e0 H\u0002J\u001e\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110\u001dH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, m13558d2 = {"Lcom/zykj/sketch/core/version/GraphTaskParseVersion4;", "Lcom/zykj/sketch/core/version/ITaskParse;", "()V", "countTime", "", "flag", "", "getFlag", "()I", "setFlag", "(I)V", "playEndTime", "playStartTime", "addGraphTask", "", "actionTime", "content", "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;", "eventListener", "Lcom/zykj/sketch/core/listener/EventListener;", "task", "Lcom/zykj/sketch/core/data/RenderTask;", "callBack", "Lkotlin/Function0;", "countTaskStartTime", "eventTime", "deleteSnapShot", "", "filterData", "", "parse", "viewBack", "Lkotlin/Function1;", "Lcom/zykj/sketch/core/listener/ViewControl;", "parseEventAsTask", "newContentList", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes5.dex */
public final class GraphTaskParseVersion4 implements ITaskParse {
    private long countTime;
    private int flag;
    private long playEndTime;
    private long playStartTime;

    @Metadata(m13559k = 3, m13560mv = {1, 7, 1}, m13562xi = 48)
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

    private final void addGraphTask(long actionTime, final EzyDrawBoard.ActionContent content, final EventListener eventListener, RenderTask task, final Function0<Unit> callBack) {
        GraphTask graphTask = new GraphTask(countTaskStartTime(actionTime), content, new Function0<Unit>() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion4.addGraphTask.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                callBack.invoke();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        }, content.hasGraphSnapshot(), new Function0<Unit>() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion4.addGraphTask.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                EventListener.DefaultImpls.graphSnapShot$default(eventListener, content, false, 2, null);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
        task.getGraphTask().add(graphTask);
        task.setLastSnapshot(graphTask);
    }

    public static /* synthetic */ void addGraphTask$default(GraphTaskParseVersion4 graphTaskParseVersion4, long j10, EzyDrawBoard.ActionContent actionContent, EventListener eventListener, RenderTask renderTask, Function0 function0, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            function0 = new Function0<Unit>() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion4.addGraphTask.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        graphTaskParseVersion4.addGraphTask(j10, actionContent, eventListener, renderTask, function0);
    }

    private final long countTaskStartTime(long eventTime) {
        long j10 = this.playStartTime;
        return j10 == 0 ? this.countTime : this.countTime + (eventTime - j10);
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

    private final void parseEventAsTask(final EzyDrawBoard.ActionContent content, EventListener eventListener, RenderTask task, final Function1<? super ViewControl, Unit> viewBack) {
        final EventListener eventListener2;
        final EventListener eventListener3 = eventListener;
        EzyDrawBoard.ActionEnum type = content.getType();
        switch (type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                List<EzyDrawBoard.ActionTouchEvent.TouchEvent> touchEventList = ((EzyDrawBoard.ActionTouchEvent) content.getAction().unpack(EzyDrawBoard.ActionTouchEvent.class)).getTouchEventList();
                Intrinsics.checkNotNullExpressionValue(touchEventList, "action.touchEventList");
                int i10 = 0;
                for (Object obj : touchEventList) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    final EzyDrawBoard.ActionTouchEvent.TouchEvent touchEvent = (EzyDrawBoard.ActionTouchEvent.TouchEvent) obj;
                    if (i10 == r9.getTouchEventCount() - 1) {
                        addGraphTask(touchEvent.getEventTime(), content, eventListener3, task, new Function0<Unit>() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion4$parseEventAsTask$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                EventListener eventListener4 = eventListener3;
                                EzyDrawBoard.ActionTouchEvent.TouchEvent touchEvent2 = touchEvent;
                                Intrinsics.checkNotNullExpressionValue(touchEvent2, "touchEvent");
                                eventListener4.onTouchEvent(touchEvent2);
                            }
                        });
                        eventListener2 = eventListener3;
                    } else {
                        eventListener2 = eventListener3;
                        task.getGraphTask().add(new GraphTask(countTaskStartTime(touchEvent.getEventTime()), content, new Function0<Unit>() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion4$parseEventAsTask$1$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                EventListener eventListener4 = eventListener2;
                                EzyDrawBoard.ActionTouchEvent.TouchEvent touchEvent2 = touchEvent;
                                Intrinsics.checkNotNullExpressionValue(touchEvent2, "touchEvent");
                                eventListener4.onTouchEvent(touchEvent2);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }
                        }, false, null, 24, null));
                    }
                    i10 = i11;
                    eventListener3 = eventListener2;
                }
                break;
            case 2:
                final EzyDrawBoard.ActionModeConfig actionModeConfig = (EzyDrawBoard.ActionModeConfig) content.getAction().unpack(EzyDrawBoard.ActionModeConfig.class);
                addGraphTask(actionModeConfig.getStartTime(), content, eventListener3, task, new Function0<Unit>() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion4.parseEventAsTask.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        EventListener eventListener4 = eventListener3;
                        EzyDrawBoard.ActionModeConfig action = actionModeConfig;
                        Intrinsics.checkNotNullExpressionValue(action, "action");
                        eventListener4.onActionModeEvent(action);
                    }
                });
                return;
            case 3:
                final EzyDrawBoard.ActionGraphConfig actionGraphConfig = (EzyDrawBoard.ActionGraphConfig) content.getAction().unpack(EzyDrawBoard.ActionGraphConfig.class);
                addGraphTask(actionGraphConfig.getStartTime(), content, eventListener3, task, new Function0<Unit>() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion4.parseEventAsTask.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        EventListener eventListener4 = eventListener3;
                        EzyDrawBoard.ActionGraphConfig action = actionGraphConfig;
                        Intrinsics.checkNotNullExpressionValue(action, "action");
                        eventListener4.onGraphConfigEvent(action);
                    }
                });
                return;
            case 4:
                final EzyDrawBoard.ActionDrawConfig actionDrawConfig = (EzyDrawBoard.ActionDrawConfig) content.getAction().unpack(EzyDrawBoard.ActionDrawConfig.class);
                addGraphTask(actionDrawConfig.getStartTime(), content, eventListener3, task, new Function0<Unit>() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion4.parseEventAsTask.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        EventListener eventListener4 = eventListener3;
                        EzyDrawBoard.ActionDrawConfig action = actionDrawConfig;
                        Intrinsics.checkNotNullExpressionValue(action, "action");
                        eventListener4.onDrawConfigEvent(action);
                    }
                });
                return;
            case 5:
                final EzyDrawBoard.ActionWebViewConfig actionWebViewConfig = (EzyDrawBoard.ActionWebViewConfig) content.getAction().unpack(EzyDrawBoard.ActionWebViewConfig.class);
                addGraphTask(actionWebViewConfig.getStartTime(), content, eventListener3, task, new Function0<Unit>() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion4.parseEventAsTask.5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        EventListener eventListener4 = eventListener3;
                        EzyDrawBoard.ActionWebViewConfig action = actionWebViewConfig;
                        Intrinsics.checkNotNullExpressionValue(action, "action");
                        eventListener4.onAddPPTEvent(action, viewBack);
                    }
                });
                return;
            case 6:
                final EzyDrawBoard.ActionImageConfig actionImageConfig = (EzyDrawBoard.ActionImageConfig) content.getAction().unpack(EzyDrawBoard.ActionImageConfig.class);
                addGraphTask(actionImageConfig.getStartTime(), content, eventListener3, task, new Function0<Unit>() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion4.parseEventAsTask.6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        EventListener eventListener4 = eventListener3;
                        EzyDrawBoard.ActionImageConfig action = actionImageConfig;
                        Intrinsics.checkNotNullExpressionValue(action, "action");
                        EventListener.DefaultImpls.onAddImageEvent$default(eventListener4, action, null, 2, null);
                    }
                });
                return;
            case 7:
                addGraphTask(((EzyDrawBoard.ActionPrevAction) content.getAction().unpack(EzyDrawBoard.ActionPrevAction.class)).getStartTime(), content, eventListener3, task, new Function0<Unit>() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion4.parseEventAsTask.7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        EventListener.DefaultImpls.graphSnapShot$default(eventListener3, content, false, 2, null);
                    }
                });
                return;
            case 8:
                addGraphTask(((EzyDrawBoard.ActionNextAction) content.getAction().unpack(EzyDrawBoard.ActionNextAction.class)).getStartTime(), content, eventListener3, task, new Function0<Unit>() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion4.parseEventAsTask.8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        EventListener.DefaultImpls.graphSnapShot$default(eventListener3, content, false, 2, null);
                    }
                });
                return;
            case 9:
                final EzyDrawBoard.ActionClearBoard actionClearBoard = (EzyDrawBoard.ActionClearBoard) content.getAction().unpack(EzyDrawBoard.ActionClearBoard.class);
                addGraphTask(actionClearBoard.getStartTime(), content, eventListener3, task, new Function0<Unit>() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion4.parseEventAsTask.9
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        EventListener eventListener4 = eventListener3;
                        EzyDrawBoard.ActionClearBoard action = actionClearBoard;
                        Intrinsics.checkNotNullExpressionValue(action, "action");
                        eventListener4.onClearBoardEvent(action);
                    }
                });
                return;
            case 10:
                EzyDrawBoard.AudioStartAction audioStartAction = (EzyDrawBoard.AudioStartAction) content.getAction().unpack(EzyDrawBoard.AudioStartAction.class);
                System.out.println((Object) ("AudioControl ACTION_AUDIO_START ACTION_AUDIO_START " + audioStartAction.getFileName()));
                addGraphTask(audioStartAction.getStartTime(), content, eventListener3, task, new Function0<Unit>() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion4.parseEventAsTask.10
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        EventListener.DefaultImpls.graphSnapShot$default(eventListener3, content, false, 2, null);
                    }
                });
                this.playStartTime = audioStartAction.getStartTime();
                this.playEndTime = audioStartAction.getStartTime();
                List<AudioTask> audioTaskList = task.getAudioTaskList();
                long j10 = this.countTime;
                String fileName = audioStartAction.getFileName();
                Intrinsics.checkNotNullExpressionValue(fileName, "action.fileName");
                audioTaskList.add(new AudioTask(j10, fileName, null, 0, 12, null));
                return;
            case 11:
                EzyDrawBoard.AudioStopAction audioStopAction = (EzyDrawBoard.AudioStopAction) content.getAction().unpack(EzyDrawBoard.AudioStopAction.class);
                System.out.println((Object) ("AudioControl ACTION_AUDIO_START ACTION_AUDIO_STOP " + audioStopAction.getFileName()));
                addGraphTask$default(this, audioStopAction.getStartTime(), content, eventListener, task, null, 16, null);
                this.countTime = this.countTime + (audioStopAction.getStartTime() - this.playStartTime);
                this.playStartTime = 0L;
                this.playEndTime = 0L;
                return;
            case 12:
                final EzyDrawBoard.ActionZoom actionZoom = (EzyDrawBoard.ActionZoom) content.getAction().unpack(EzyDrawBoard.ActionZoom.class);
                addGraphTask(actionZoom.getStartTime(), content, eventListener3, task, new Function0<Unit>() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion4.parseEventAsTask.11
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        EventListener eventListener4 = eventListener3;
                        EzyDrawBoard.ActionZoom action = actionZoom;
                        Intrinsics.checkNotNullExpressionValue(action, "action");
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
    public RenderTask parse(List<EzyDrawBoard.ActionContent> content, EventListener eventListener, Function1<? super ViewControl, Unit> viewBack) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Intrinsics.checkNotNullParameter(viewBack, "viewBack");
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

    public final void setFlag(int i10) {
        this.flag = i10;
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
        Intrinsics.checkNotNullExpressionValue(actionContentBuild, "builder.build()");
        newContentList.add(actionContentBuild);
    }
}
