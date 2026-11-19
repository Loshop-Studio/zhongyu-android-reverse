package com.zykj.sketch.core.version;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.GraphSnapshot;
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

@Metadata(m13412d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J2\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0016J4\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m13413d2 = {"Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;", "Lcom/zykj/sketch/core/version/ITaskParse;", "()V", "countTime", "", "playEndTime", "playStartTime", "parse", "Lcom/zykj/sketch/core/data/RenderTask;", "content", "", "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;", "eventListener", "Lcom/zykj/sketch/core/listener/EventListener;", "viewBack", "Lkotlin/Function1;", "Lcom/zykj/sketch/core/listener/ViewControl;", "", "parseEventAsTask", "task", "sketch_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public class GraphTaskParseVersion1 implements ITaskParse {
    private long countTime;
    private long playEndTime;
    private long playStartTime;

    @Metadata(m13414k = 3, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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

    private final void parseEventAsTask(final EzyDrawBoard.ActionContent content, final EventListener eventListener, RenderTask task, final Function1<? super ViewControl, Unit> viewBack) {
        long j9;
        EzyDrawBoard.ActionEnum type = content.getType();
        long j10 = 0;
        switch (type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                final EzyDrawBoard.ActionContent actionContent = content;
                List<EzyDrawBoard.ActionTouchEvent.TouchEvent> touchEventList = ((EzyDrawBoard.ActionTouchEvent) actionContent.getAction().unpack(EzyDrawBoard.ActionTouchEvent.class)).getTouchEventList();
                Intrinsics.checkNotNullExpressionValue(touchEventList, "action.touchEventList");
                int i9 = 0;
                for (Object obj : touchEventList) {
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    final EzyDrawBoard.ActionTouchEvent.TouchEvent touchEvent = (EzyDrawBoard.ActionTouchEvent.TouchEvent) obj;
                    if (i9 == r14.getTouchEventCount() - 1) {
                        long j11 = this.playStartTime;
                        long eventTime = this.countTime;
                        if (j11 == j10) {
                            j9 = j10;
                        } else {
                            j9 = j10;
                            eventTime += touchEvent.getEventTime() - this.playStartTime;
                        }
                        GraphTask graphTask = new GraphTask(eventTime, actionContent, new Function0<Unit>() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1$parseEventAsTask$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                EventListener eventListener2 = eventListener;
                                EzyDrawBoard.ActionTouchEvent.TouchEvent touchEvent2 = touchEvent;
                                Intrinsics.checkNotNullExpressionValue(touchEvent2, "touchEvent");
                                eventListener2.onTouchEvent(touchEvent2);
                                EventListener eventListener3 = eventListener;
                                GraphSnapshot.GraphData graphSnapshot = actionContent.getGraphSnapshot();
                                Intrinsics.checkNotNullExpressionValue(graphSnapshot, "content.graphSnapshot");
                                eventListener3.graphSnapShot(graphSnapshot);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }
                        }, true, new Function0<Unit>() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1$parseEventAsTask$1$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                EventListener eventListener2 = eventListener;
                                GraphSnapshot.GraphData graphSnapshot = actionContent.getGraphSnapshot();
                                Intrinsics.checkNotNullExpressionValue(graphSnapshot, "content.graphSnapshot");
                                eventListener2.graphSnapShot(graphSnapshot);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }
                        });
                        task.getGraphTask().add(graphTask);
                        task.setLastSnapshot(graphTask);
                        task.setProgress(this.countTime);
                    } else {
                        j9 = j10;
                        task.getGraphTask().add(new GraphTask(this.playStartTime == j9 ? this.countTime : this.countTime + (touchEvent.getEventTime() - this.playStartTime), content, new Function0<Unit>() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1$parseEventAsTask$1$4
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
                                EventListener eventListener2 = eventListener;
                                EzyDrawBoard.ActionTouchEvent.TouchEvent touchEvent2 = touchEvent;
                                Intrinsics.checkNotNullExpressionValue(touchEvent2, "touchEvent");
                                eventListener2.onTouchEvent(touchEvent2);
                            }
                        }, false, null, 16, null));
                    }
                    actionContent = content;
                    i9 = i10;
                    j10 = j9;
                }
                break;
            case 2:
                final EzyDrawBoard.ActionModeConfig actionModeConfig = (EzyDrawBoard.ActionModeConfig) content.getAction().unpack(EzyDrawBoard.ActionModeConfig.class);
                task.getGraphTask().add(new GraphTask(this.playStartTime == 0 ? this.countTime : this.countTime + (actionModeConfig.getStartTime() - this.playStartTime), content, new Function0<Unit>() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.2
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
                        EventListener eventListener2 = eventListener;
                        EzyDrawBoard.ActionModeConfig action = actionModeConfig;
                        Intrinsics.checkNotNullExpressionValue(action, "action");
                        eventListener2.onActionModeEvent(action);
                    }
                }, content.hasGraphSnapshot(), new Function0<Unit>() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.3
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                }));
                break;
            case 3:
                final EzyDrawBoard.ActionGraphConfig actionGraphConfig = (EzyDrawBoard.ActionGraphConfig) content.getAction().unpack(EzyDrawBoard.ActionGraphConfig.class);
                task.getGraphTask().add(new GraphTask(this.playStartTime == 0 ? this.countTime : this.countTime + (actionGraphConfig.getStartTime() - this.playStartTime), content, new Function0<Unit>() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.4
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
                        EventListener eventListener2 = eventListener;
                        EzyDrawBoard.ActionGraphConfig action = actionGraphConfig;
                        Intrinsics.checkNotNullExpressionValue(action, "action");
                        eventListener2.onGraphConfigEvent(action);
                    }
                }, content.hasGraphSnapshot(), new Function0<Unit>() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.5
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                }));
                break;
            case 4:
                final EzyDrawBoard.ActionWebViewConfig actionWebViewConfig = (EzyDrawBoard.ActionWebViewConfig) content.getAction().unpack(EzyDrawBoard.ActionWebViewConfig.class);
                List<GraphTask> graphTask2 = task.getGraphTask();
                long j12 = this.playStartTime;
                long startTime = this.countTime;
                if (j12 != 0) {
                    startTime += actionWebViewConfig.getStartTime() - this.playStartTime;
                }
                graphTask2.add(new GraphTask(startTime, content, new Function0<Unit>() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.6
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
                        EventListener eventListener2 = eventListener;
                        EzyDrawBoard.ActionWebViewConfig action = actionWebViewConfig;
                        Intrinsics.checkNotNullExpressionValue(action, "action");
                        eventListener2.onAddPPTEvent(action, viewBack);
                    }
                }, content.hasGraphSnapshot(), new Function0<Unit>() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.7
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
                        EventListener eventListener2 = eventListener;
                        GraphSnapshot.GraphData graphSnapshot = content.getGraphSnapshot();
                        Intrinsics.checkNotNullExpressionValue(graphSnapshot, "content.graphSnapshot");
                        eventListener2.graphSnapShot(graphSnapshot);
                    }
                }));
                break;
            case 5:
                GraphTask graphTask3 = new GraphTask(this.playStartTime == 0 ? this.countTime : (((EzyDrawBoard.ActionImageConfig) content.getAction().unpack(EzyDrawBoard.ActionImageConfig.class)).getStartTime() - this.playStartTime) + this.countTime, content, new Function0<Unit>() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        EventListener eventListener2 = eventListener;
                        GraphSnapshot.GraphData graphSnapshot = content.getGraphSnapshot();
                        Intrinsics.checkNotNullExpressionValue(graphSnapshot, "content.graphSnapshot");
                        eventListener2.graphSnapShot(graphSnapshot);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                }, content.hasGraphSnapshot(), new Function0<Unit>() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.9
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        EventListener eventListener2 = eventListener;
                        GraphSnapshot.GraphData graphSnapshot = content.getGraphSnapshot();
                        Intrinsics.checkNotNullExpressionValue(graphSnapshot, "content.graphSnapshot");
                        eventListener2.graphSnapShot(graphSnapshot);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                });
                task.getGraphTask().add(graphTask3);
                task.setLastSnapshot(graphTask3);
                break;
            case 6:
                GraphTask graphTask4 = new GraphTask(this.playStartTime == 0 ? this.countTime : (((EzyDrawBoard.ActionPrevAction) content.getAction().unpack(EzyDrawBoard.ActionPrevAction.class)).getStartTime() - this.playStartTime) + this.countTime, content, new Function0<Unit>() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.11
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        EventListener eventListener2 = eventListener;
                        GraphSnapshot.GraphData graphSnapshot = content.getGraphSnapshot();
                        Intrinsics.checkNotNullExpressionValue(graphSnapshot, "content.graphSnapshot");
                        eventListener2.graphSnapShot(graphSnapshot);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                }, content.hasGraphSnapshot(), new Function0<Unit>() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.12
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        EventListener eventListener2 = eventListener;
                        GraphSnapshot.GraphData graphSnapshot = content.getGraphSnapshot();
                        Intrinsics.checkNotNullExpressionValue(graphSnapshot, "content.graphSnapshot");
                        eventListener2.graphSnapShot(graphSnapshot);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                });
                task.getGraphTask().add(graphTask4);
                task.setLastSnapshot(graphTask4);
                break;
            case 7:
                GraphTask graphTask5 = new GraphTask(this.playStartTime == 0 ? this.countTime : (((EzyDrawBoard.ActionNextAction) content.getAction().unpack(EzyDrawBoard.ActionNextAction.class)).getStartTime() - this.playStartTime) + this.countTime, content, new Function0<Unit>() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.14
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        EventListener eventListener2 = eventListener;
                        GraphSnapshot.GraphData graphSnapshot = content.getGraphSnapshot();
                        Intrinsics.checkNotNullExpressionValue(graphSnapshot, "content.graphSnapshot");
                        eventListener2.graphSnapShot(graphSnapshot);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                }, content.hasGraphSnapshot(), new Function0<Unit>() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.15
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        EventListener eventListener2 = eventListener;
                        GraphSnapshot.GraphData graphSnapshot = content.getGraphSnapshot();
                        Intrinsics.checkNotNullExpressionValue(graphSnapshot, "content.graphSnapshot");
                        eventListener2.graphSnapShot(graphSnapshot);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                });
                task.getGraphTask().add(graphTask5);
                task.setLastSnapshot(graphTask5);
                break;
            case 8:
                GraphTask graphTask6 = new GraphTask(this.playStartTime == 0 ? this.countTime : (((EzyDrawBoard.ActionClearBoard) content.getAction().unpack(EzyDrawBoard.ActionClearBoard.class)).getStartTime() - this.playStartTime) + this.countTime, content, new Function0<Unit>() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.17
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        EventListener eventListener2 = eventListener;
                        GraphSnapshot.GraphData graphSnapshot = content.getGraphSnapshot();
                        Intrinsics.checkNotNullExpressionValue(graphSnapshot, "content.graphSnapshot");
                        eventListener2.graphSnapShot(graphSnapshot);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                }, content.hasGraphSnapshot(), new Function0<Unit>() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.18
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        EventListener eventListener2 = eventListener;
                        GraphSnapshot.GraphData graphSnapshot = content.getGraphSnapshot();
                        Intrinsics.checkNotNullExpressionValue(graphSnapshot, "content.graphSnapshot");
                        eventListener2.graphSnapShot(graphSnapshot);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                });
                task.getGraphTask().add(graphTask6);
                task.setLastSnapshot(graphTask6);
                break;
            case 9:
                final EzyDrawBoard.AudioStartAction audioStartAction = (EzyDrawBoard.AudioStartAction) content.getAction().unpack(EzyDrawBoard.AudioStartAction.class);
                this.playStartTime = audioStartAction.getStartTime();
                this.playEndTime = audioStartAction.getStartTime();
                task.getGraphTask().add(new GraphTask(this.playStartTime == 0 ? this.countTime : this.countTime + (audioStartAction.getStartTime() - this.playStartTime), content, new Function0<Unit>() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.20
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
                        EventListener eventListener2 = eventListener;
                        EzyDrawBoard.AudioStartAction action = audioStartAction;
                        Intrinsics.checkNotNullExpressionValue(action, "action");
                        eventListener2.onAudioStartRecord(action);
                    }
                }, content.hasGraphSnapshot(), new Function0<Unit>() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.21
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                }));
                List<AudioTask> audioTaskList = task.getAudioTaskList();
                long j13 = this.countTime;
                String fileName = audioStartAction.getFileName();
                Intrinsics.checkNotNullExpressionValue(fileName, "action.fileName");
                audioTaskList.add(new AudioTask(j13, fileName, null, 0, 12, null));
                break;
            case 10:
                final EzyDrawBoard.AudioStopAction audioStopAction = (EzyDrawBoard.AudioStopAction) content.getAction().unpack(EzyDrawBoard.AudioStopAction.class);
                task.getGraphTask().add(new GraphTask(this.playStartTime == 0 ? this.countTime : this.countTime + (audioStopAction.getStartTime() - this.playStartTime), content, new Function0<Unit>() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.22
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
                        EventListener eventListener2 = eventListener;
                        EzyDrawBoard.AudioStopAction action = audioStopAction;
                        Intrinsics.checkNotNullExpressionValue(action, "action");
                        eventListener2.onAudioStopRecord(action);
                    }
                }, content.hasGraphSnapshot(), new Function0<Unit>() { // from class: com.zykj.sketch.core.version.GraphTaskParseVersion1.parseEventAsTask.23
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                }));
                this.countTime += audioStopAction.getStartTime() - this.playStartTime;
                this.playStartTime = 0L;
                this.playEndTime = 0L;
                break;
        }
    }

    @Override // com.zykj.sketch.core.version.ITaskParse
    public RenderTask parse(List<EzyDrawBoard.ActionContent> content, EventListener eventListener, Function1<? super ViewControl, Unit> viewBack) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Intrinsics.checkNotNullParameter(viewBack, "viewBack");
        RenderTask renderTask = new RenderTask(new ArrayList(), new ArrayList(), null, 0L, 8, null);
        Iterator<T> it = content.iterator();
        while (it.hasNext()) {
            parseEventAsTask((EzyDrawBoard.ActionContent) it.next(), eventListener, renderTask, viewBack);
        }
        renderTask.setProgress(this.countTime);
        return renderTask;
    }
}
