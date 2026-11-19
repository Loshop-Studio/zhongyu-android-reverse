package com.zykj.sketch.core;

// RE note 将 Sketch 原生画板事件封装为动作消息并持久化。

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.google.protobuf.Any;
import com.google.protobuf.FloatValue;
import com.google.protobuf.Message;
import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.core.data.BoardDataFactory;
import com.zykj.sketch.core.listener.ActionChangeListener;
import com.zykj.sketch.core.listener.IControl;
import com.zykj.sketch.core.listener.NextPrevListener;
import com.zykj.sketch.utils.ProtoFileUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\bJ\u0014\u0010\u0019\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u0015J\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0011J\u0010\u0010\u001d\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0013J\u0016\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u0018\u0010#\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020$H\u0002J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*J\u0016\u0010+\u001a\u00020,2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*J\u000e\u0010-\u001a\u00020.2\u0006\u0010'\u001a\u00020(J'\u0010/\u001a\u0002002\u0006\u0010'\u001a\u00020(2\b\u00101\u001a\u0004\u0018\u00010\f2\b\u00102\u001a\u0004\u0018\u000103¢\u0006\u0002\u00104J\u0016\u00105\u001a\u0002062\u0006\u0010'\u001a\u00020(2\u0006\u00102\u001a\u000207J\b\u00108\u001a\u000209H\u0002J>\u0010:\u001a\u00020;2\u0006\u0010'\u001a\u00020(2\u0006\u0010<\u001a\u00020*2\u0006\u0010=\u001a\u00020\f2\u0006\u0010>\u001a\u00020\f2\u0006\u0010?\u001a\u00020\f2\u0006\u0010@\u001a\u00020\f2\u0006\u0010A\u001a\u00020\fJ\u0016\u0010B\u001a\u00020C2\u0006\u0010'\u001a\u00020(2\u0006\u0010D\u001a\u00020EJ\u000e\u0010F\u001a\u00020G2\u0006\u0010'\u001a\u00020(J\u000e\u0010H\u001a\u00020I2\u0006\u0010'\u001a\u00020(J\u000e\u0010J\u001a\u00020K2\u0006\u0010'\u001a\u00020(J\u001c\u0010L\u001a\u00020M2\u0006\u0010'\u001a\u00020(2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020N0\u0015J/\u0010O\u001a\u00020P2\u0006\u0010'\u001a\u00020(2\b\u0010Q\u001a\u0004\u0018\u00010R2\b\u0010S\u001a\u0004\u0018\u00010R2\u0006\u0010T\u001a\u00020\u000e¢\u0006\u0002\u0010UJ6\u0010V\u001a\u00020W2\u0006\u0010'\u001a\u00020(2\u0006\u0010<\u001a\u00020*2\u0006\u0010=\u001a\u00020\f2\u0006\u0010>\u001a\u00020\f2\u0006\u0010?\u001a\u00020\f2\u0006\u0010@\u001a\u00020\fJ6\u0010X\u001a\u00020Y2\u0006\u0010'\u001a\u00020(2\u0006\u0010Z\u001a\u00020R2\u0006\u0010[\u001a\u00020R2\u0006\u0010\\\u001a\u00020R2\u0006\u0010]\u001a\u00020R2\u0006\u0010T\u001a\u00020\u000eJ\u0006\u0010^\u001a\u00020\u0017J\b\u0010_\u001a\u0004\u0018\u00010\u0011J\b\u0010`\u001a\u00020\u0017H\u0002J\u0006\u0010a\u001a\u00020\u0017J\b\u0010b\u001a\u0004\u0018\u00010\u0011J\u0006\u0010c\u001a\u00020\u0017J\u001e\u0010d\u001a\u00020\u00172\u0006\u0010<\u001a\u00020*2\u0006\u0010=\u001a\u00020\f2\u0006\u0010>\u001a\u00020\fJ\u000e\u0010e\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020fR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006g"}, m13558d2 = {"Lcom/zykj/sketch/core/ActionRecord;", "", "actionControl", "Lcom/zykj/sketch/core/listener/IControl;", "actionFactory", "Lcom/zykj/sketch/core/ActionStrategyFactory;", "(Lcom/zykj/sketch/core/listener/IControl;Lcom/zykj/sketch/core/ActionStrategyFactory;)V", "actionChangeListener", "Lcom/zykj/sketch/core/listener/ActionChangeListener;", "header", "Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;", "index", "", "isRecord", "", "listIterator", "", "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;", "nextPrevListener", "Lcom/zykj/sketch/core/listener/NextPrevListener;", "rendData", "", "addActionChangeListener", "", "listener", "addHistoryRecord", "actionContent", "addHistoryRenderGraphSnapshot", "graphSnapshot", "addNextPrevListener", "addRecord", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;", "message", "Lcom/google/protobuf/Message;", "buildActionContent", "Lcom/google/protobuf/Any;", "buildAudioStartEvent", "Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;", "startTime", "", "fileName", "", "buildAudioStopEvent", "Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;", "buildClearBoardData", "Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard;", "buildDrawConfig", "Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig;", TypedValues.Custom.S_COLOR, "config", "Lcom/zykj/sketch/EzyDrawBoard$DrawArea;", "(JLjava/lang/Integer;Lcom/zykj/sketch/EzyDrawBoard$DrawArea;)Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig;", "buildGraphConfig", "Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;", "Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;", "buildHistoryRendData", "Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;", "buildImageData", "Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;", "path", "width", "height", "viewWidth", "viewHeight", "positionFlag", "buildModeConfig", "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig;", "mode", "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;", "buildNextActionData", "Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction;", "buildPrevActionData", "Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction;", "buildResetMatrix", "Lcom/zykj/sketch/EzyDrawBoard$ActionResetMatrix;", "buildTouch", "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent;", "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;", "buildTranslation", "Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;", "translateX", "", "translateY", "keep", "(JLjava/lang/Float;Ljava/lang/Float;Z)Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;", "buildWebViewData", "Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;", "buildZoomActionData", "Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;", "scaleX", "scaleY", "centerX", "centerY", "clear", "next", "notifyListener", "onDestroy", "prev", "reset", "saveRecord", "setHeader", "Lcom/zykj/sketch/EzyDrawBoard$BoardHead;", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes5.dex */
public final class ActionRecord {
    private ActionChangeListener actionChangeListener;
    private final IControl actionControl;
    private final ActionStrategyFactory actionFactory;
    private EzyDrawBoard.BoardHead.Builder header;
    private int index;
    private boolean isRecord;
    private final ListIterator<EzyDrawBoard.ActionContent> listIterator;
    private NextPrevListener nextPrevListener;
    private final List<EzyDrawBoard.ActionContent> rendData;

    @Metadata(m13559k = 3, m13560mv = {1, 7, 1}, m13562xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EzyDrawBoard.ActionEnum.values().length];
            iArr[EzyDrawBoard.ActionEnum.ACTION_TOUCH.ordinal()] = 1;
            iArr[EzyDrawBoard.ActionEnum.ACTION_IMAGE.ordinal()] = 2;
            iArr[EzyDrawBoard.ActionEnum.ACTION_WEB.ordinal()] = 3;
            iArr[EzyDrawBoard.ActionEnum.ACTION_CLEAR_BOARD.ordinal()] = 4;
            iArr[EzyDrawBoard.ActionEnum.ACTION_ZOOM.ordinal()] = 5;
            iArr[EzyDrawBoard.ActionEnum.ACTION_AUDIO_START.ordinal()] = 6;
            iArr[EzyDrawBoard.ActionEnum.ACTION_AUDIO_STOP.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ActionRecord(IControl actionControl, ActionStrategyFactory actionFactory) {
        Intrinsics.checkNotNullParameter(actionControl, "actionControl");
        Intrinsics.checkNotNullParameter(actionFactory, "actionFactory");
        this.actionControl = actionControl;
        this.actionFactory = actionFactory;
        this.listIterator = CollectionsKt.toMutableList((Collection) new ArrayList()).listIterator();
        this.rendData = new ArrayList();
        this.index = -1;
        this.header = BoardDataFactory.INSTANCE.buildHead();
    }

    private final EzyDrawBoard.ActionContent buildActionContent(EzyDrawBoard.ActionEnum type, Any message) {
        EzyDrawBoard.ActionContent.Builder builderNewBuilder = EzyDrawBoard.ActionContent.newBuilder();
        builderNewBuilder.setType(type);
        builderNewBuilder.setAction(message);
        EzyDrawBoard.ActionEnum type2 = builderNewBuilder.getType();
        int i10 = type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
        if (i10 == 1) {
            builderNewBuilder.setResetData(buildHistoryRendData());
        } else if (i10 == 6) {
            builderNewBuilder.setResetData(buildHistoryRendData());
            this.isRecord = true;
        } else if (i10 == 7) {
            builderNewBuilder.setResetData(buildHistoryRendData());
            this.isRecord = false;
        }
        if (this.isRecord) {
            if (builderNewBuilder.getType() == EzyDrawBoard.ActionEnum.ACTION_AUDIO_START) {
                builderNewBuilder.setGraphSnapshot(this.actionControl.getRootGraph().getSnapshot());
            }
        } else if (builderNewBuilder.getType() == EzyDrawBoard.ActionEnum.ACTION_AUDIO_STOP) {
            builderNewBuilder.setGraphSnapshot(this.actionControl.getRootGraph().getSnapshot());
        } else if (builderNewBuilder.getType() != EzyDrawBoard.ActionEnum.ACTION_GRAPH && builderNewBuilder.getType() != EzyDrawBoard.ActionEnum.ACTION_DRAW_CONFIG && builderNewBuilder.getType() != EzyDrawBoard.ActionEnum.ACTION_MODE) {
            builderNewBuilder.setGraphSnapshot(this.actionControl.getRootGraph().getSnapshot());
            builderNewBuilder.setResetData(buildHistoryRendData());
            while (this.listIterator.hasNext()) {
                this.listIterator.next();
            }
            if (this.listIterator.hasPrevious()) {
                if (this.listIterator.previous().getType() != EzyDrawBoard.ActionEnum.ACTION_AUDIO_STOP) {
                    this.listIterator.remove();
                    while (this.listIterator.hasPrevious() && this.listIterator.previous().getType() != EzyDrawBoard.ActionEnum.ACTION_AUDIO_STOP) {
                        this.listIterator.remove();
                    }
                }
                while (this.listIterator.hasNext()) {
                    this.listIterator.next();
                }
            }
        }
        EzyDrawBoard.ActionContent actionContentBuild = builderNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(actionContentBuild, "builder.build()");
        return actionContentBuild;
    }

    private final EzyDrawBoard.GraphResetData buildHistoryRendData() {
        EzyDrawBoard.GraphResetData.Builder builderNewBuilder = EzyDrawBoard.GraphResetData.newBuilder();
        builderNewBuilder.setAction(this.actionFactory.buildActionMode());
        builderNewBuilder.setGraphConfig(this.actionControl.getGraphConfig());
        builderNewBuilder.setModeConfig(this.actionControl.getMode());
        builderNewBuilder.setBackgroundColor(this.actionControl.getBackgroundColor());
        EzyDrawBoard.DrawArea drawArea = this.actionControl.getDrawArea();
        if (drawArea != null) {
            builderNewBuilder.setDrawArea(drawArea);
        }
        EzyDrawBoard.GraphResetData graphResetDataBuild = builderNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(graphResetDataBuild, "newBuilder.build()");
        return graphResetDataBuild;
    }

    private final void notifyListener() {
        if (this.rendData.isEmpty()) {
            NextPrevListener nextPrevListener = this.nextPrevListener;
            if (nextPrevListener != null) {
                nextPrevListener.listener(false, false);
                return;
            }
            return;
        }
        int i10 = this.index;
        if (i10 == -1) {
            NextPrevListener nextPrevListener2 = this.nextPrevListener;
            if (nextPrevListener2 != null) {
                nextPrevListener2.listener(false, true);
                return;
            }
            return;
        }
        if (i10 == this.rendData.size() - 1) {
            NextPrevListener nextPrevListener3 = this.nextPrevListener;
            if (nextPrevListener3 != null) {
                nextPrevListener3.listener(true, false);
                return;
            }
            return;
        }
        NextPrevListener nextPrevListener4 = this.nextPrevListener;
        if (nextPrevListener4 != null) {
            nextPrevListener4.listener(true, true);
        }
    }

    public final void addActionChangeListener(ActionChangeListener listener) {
        this.actionChangeListener = listener;
    }

    public final void addHistoryRecord(List<EzyDrawBoard.ActionContent> actionContent) {
        Intrinsics.checkNotNullParameter(actionContent, "actionContent");
        Iterator<T> it = actionContent.iterator();
        while (it.hasNext()) {
            this.listIterator.add((EzyDrawBoard.ActionContent) it.next());
        }
    }

    public final void addHistoryRenderGraphSnapshot(EzyDrawBoard.ActionContent graphSnapshot) {
        Intrinsics.checkNotNullParameter(graphSnapshot, "graphSnapshot");
        ListIterator<EzyDrawBoard.ActionContent> listIterator = this.rendData.listIterator();
        while (listIterator.hasNext()) {
            listIterator.next();
            if (listIterator.nextIndex() > this.index + 1) {
                listIterator.remove();
            }
        }
        this.rendData.add(graphSnapshot);
        if (this.rendData.size() > 10) {
            List<EzyDrawBoard.ActionContent> list = this.rendData;
            List<EzyDrawBoard.ActionContent> listSubList = list.subList(list.size() - 10, this.rendData.size());
            this.rendData.clear();
            this.rendData.addAll(listSubList);
        }
        this.index = this.rendData.size() - 1;
        notifyListener();
    }

    public final void addNextPrevListener(NextPrevListener listener) {
        this.nextPrevListener = listener;
    }

    public final synchronized void addRecord(EzyDrawBoard.ActionEnum type, Message message) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(message, "message");
        Any anyPack = Any.pack(message);
        Intrinsics.checkNotNullExpressionValue(anyPack, "pack(message)");
        this.listIterator.add(buildActionContent(type, anyPack));
        ActionChangeListener actionChangeListener = this.actionChangeListener;
        if (actionChangeListener != null) {
            actionChangeListener.change();
        }
    }

    public final EzyDrawBoard.AudioStartAction buildAudioStartEvent(long startTime, String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        EzyDrawBoard.AudioStartAction.Builder builderNewBuilder = EzyDrawBoard.AudioStartAction.newBuilder();
        builderNewBuilder.setStartTime(startTime);
        builderNewBuilder.setFileName(fileName);
        EzyDrawBoard.AudioStartAction audioStartActionBuild = builderNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(audioStartActionBuild, "newBuilder.build()");
        return audioStartActionBuild;
    }

    public final EzyDrawBoard.AudioStopAction buildAudioStopEvent(long startTime, String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        EzyDrawBoard.AudioStopAction.Builder builderNewBuilder = EzyDrawBoard.AudioStopAction.newBuilder();
        builderNewBuilder.setStartTime(startTime);
        builderNewBuilder.setFileName(fileName);
        EzyDrawBoard.AudioStopAction audioStopActionBuild = builderNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(audioStopActionBuild, "newBuilder.build()");
        return audioStopActionBuild;
    }

    public final EzyDrawBoard.ActionClearBoard buildClearBoardData(long startTime) {
        EzyDrawBoard.ActionClearBoard.Builder builderNewBuilder = EzyDrawBoard.ActionClearBoard.newBuilder();
        builderNewBuilder.setStartTime(startTime);
        EzyDrawBoard.ActionClearBoard actionClearBoardBuild = builderNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(actionClearBoardBuild, "newBuilder.build()");
        return actionClearBoardBuild;
    }

    public final EzyDrawBoard.ActionDrawConfig buildDrawConfig(long startTime, Integer color, EzyDrawBoard.DrawArea config) {
        EzyDrawBoard.ActionDrawConfig.Builder builderNewBuilder = EzyDrawBoard.ActionDrawConfig.newBuilder();
        builderNewBuilder.setStartTime(startTime);
        if (color != null) {
            builderNewBuilder.setBackgroundColor(color.intValue());
        }
        if (config != null) {
            builderNewBuilder.setDrawArea(config);
        }
        EzyDrawBoard.ActionDrawConfig actionDrawConfigBuild = builderNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(actionDrawConfigBuild, "newBuilder.build()");
        return actionDrawConfigBuild;
    }

    public final EzyDrawBoard.ActionGraphConfig buildGraphConfig(long startTime, EzyDrawBoard.ActionGraphConfig.GraphConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        EzyDrawBoard.ActionGraphConfig.Builder builderNewBuilder = EzyDrawBoard.ActionGraphConfig.newBuilder();
        builderNewBuilder.setStartTime(startTime);
        builderNewBuilder.setConfig(config);
        EzyDrawBoard.ActionGraphConfig actionGraphConfigBuild = builderNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(actionGraphConfigBuild, "newBuilder.build()");
        return actionGraphConfigBuild;
    }

    public final EzyDrawBoard.ActionImageConfig buildImageData(long startTime, String path, int width, int height, int viewWidth, int viewHeight, int positionFlag) {
        Intrinsics.checkNotNullParameter(path, "path");
        EzyDrawBoard.ActionImageConfig.Builder builderNewBuilder = EzyDrawBoard.ActionImageConfig.newBuilder();
        builderNewBuilder.setStartTime(startTime);
        builderNewBuilder.setPath(path);
        builderNewBuilder.setWidth(width);
        builderNewBuilder.setHeight(height);
        builderNewBuilder.setViewWidth(viewWidth);
        builderNewBuilder.setViewHeight(viewHeight);
        builderNewBuilder.setPositionFlag(positionFlag);
        EzyDrawBoard.ActionImageConfig actionImageConfigBuild = builderNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(actionImageConfigBuild, "newBuilder.build()");
        return actionImageConfigBuild;
    }

    public final EzyDrawBoard.ActionModeConfig buildModeConfig(long startTime, EzyDrawBoard.ActionModeConfig.Mode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        EzyDrawBoard.ActionModeConfig.Builder builderNewBuilder = EzyDrawBoard.ActionModeConfig.newBuilder();
        builderNewBuilder.setStartTime(startTime);
        builderNewBuilder.setMode(mode);
        EzyDrawBoard.ActionModeConfig actionModeConfigBuild = builderNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(actionModeConfigBuild, "newBuilder.build()");
        return actionModeConfigBuild;
    }

    public final EzyDrawBoard.ActionNextAction buildNextActionData(long startTime) {
        EzyDrawBoard.ActionNextAction.Builder builderNewBuilder = EzyDrawBoard.ActionNextAction.newBuilder();
        builderNewBuilder.setStartTime(startTime);
        EzyDrawBoard.ActionNextAction actionNextActionBuild = builderNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(actionNextActionBuild, "newBuilder.build()");
        return actionNextActionBuild;
    }

    public final EzyDrawBoard.ActionPrevAction buildPrevActionData(long startTime) {
        EzyDrawBoard.ActionPrevAction.Builder builderNewBuilder = EzyDrawBoard.ActionPrevAction.newBuilder();
        builderNewBuilder.setStartTime(startTime);
        EzyDrawBoard.ActionPrevAction actionPrevActionBuild = builderNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(actionPrevActionBuild, "newBuilder.build()");
        return actionPrevActionBuild;
    }

    public final EzyDrawBoard.ActionResetMatrix buildResetMatrix(long startTime) {
        EzyDrawBoard.ActionResetMatrix.Builder builderNewBuilder = EzyDrawBoard.ActionResetMatrix.newBuilder();
        builderNewBuilder.setStartTime(startTime);
        EzyDrawBoard.ActionResetMatrix actionResetMatrixBuild = builderNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(actionResetMatrixBuild, "newBuilder.build()");
        return actionResetMatrixBuild;
    }

    public final EzyDrawBoard.ActionTouchEvent buildTouch(long startTime, List<EzyDrawBoard.ActionTouchEvent.TouchEvent> mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        EzyDrawBoard.ActionTouchEvent.Builder builderNewBuilder = EzyDrawBoard.ActionTouchEvent.newBuilder();
        builderNewBuilder.setStartTime(startTime);
        builderNewBuilder.addAllTouchEvent(mode);
        EzyDrawBoard.ActionTouchEvent actionTouchEventBuild = builderNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(actionTouchEventBuild, "newBuilder.build()");
        return actionTouchEventBuild;
    }

    public final EzyDrawBoard.ActionTranslation buildTranslation(long startTime, Float translateX, Float translateY, boolean keep) {
        EzyDrawBoard.ActionTranslation.Builder builderNewBuilder = EzyDrawBoard.ActionTranslation.newBuilder();
        builderNewBuilder.setStartTime(startTime);
        if (translateX != null) {
            builderNewBuilder.setTransX(FloatValue.newBuilder().setValue(translateX.floatValue()).build());
        }
        if (translateY != null) {
            builderNewBuilder.setTransY(FloatValue.newBuilder().setValue(translateY.floatValue()).build());
        }
        builderNewBuilder.setKeep(keep);
        EzyDrawBoard.ActionTranslation actionTranslationBuild = builderNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(actionTranslationBuild, "newBuilder.build()");
        return actionTranslationBuild;
    }

    public final EzyDrawBoard.ActionWebViewConfig buildWebViewData(long startTime, String path, int width, int height, int viewWidth, int viewHeight) {
        Intrinsics.checkNotNullParameter(path, "path");
        EzyDrawBoard.ActionWebViewConfig.Builder builderNewBuilder = EzyDrawBoard.ActionWebViewConfig.newBuilder();
        builderNewBuilder.setStartTime(startTime);
        builderNewBuilder.setPath(path);
        builderNewBuilder.setWidth(width);
        builderNewBuilder.setHeight(height);
        builderNewBuilder.setViewWidth(viewWidth);
        builderNewBuilder.setViewHeight(viewHeight);
        EzyDrawBoard.ActionWebViewConfig actionWebViewConfigBuild = builderNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(actionWebViewConfigBuild, "newBuilder.build()");
        return actionWebViewConfigBuild;
    }

    public final EzyDrawBoard.ActionZoom buildZoomActionData(long startTime, float scaleX, float scaleY, float centerX, float centerY, boolean keep) {
        EzyDrawBoard.ActionZoom.Builder builderNewBuilder = EzyDrawBoard.ActionZoom.newBuilder();
        builderNewBuilder.setStartTime(startTime);
        builderNewBuilder.setScaleX(scaleX);
        builderNewBuilder.setScaleY(scaleY);
        builderNewBuilder.setCenterX(centerX);
        builderNewBuilder.setCenterY(centerY);
        builderNewBuilder.setKeep(keep);
        EzyDrawBoard.ActionZoom actionZoomBuild = builderNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(actionZoomBuild, "newBuilder.build()");
        return actionZoomBuild;
    }

    public final void clear() {
        this.rendData.clear();
        notifyListener();
    }

    public final EzyDrawBoard.ActionContent next() {
        if (this.rendData.isEmpty()) {
            notifyListener();
            return null;
        }
        int i10 = this.index + 1;
        this.index = i10;
        if (i10 <= this.rendData.size() - 1) {
            notifyListener();
            return this.rendData.get(this.index);
        }
        this.index = this.rendData.size() - 1;
        notifyListener();
        return this.rendData.get(this.index);
    }

    public final void onDestroy() {
        while (this.listIterator.hasPrevious()) {
            this.listIterator.previous();
            this.listIterator.remove();
        }
    }

    public final EzyDrawBoard.ActionContent prev() {
        if (this.rendData.isEmpty()) {
            notifyListener();
            return null;
        }
        int i10 = this.index - 1;
        this.index = i10;
        if (i10 > -1) {
            notifyListener();
            return this.rendData.get(this.index);
        }
        this.index = -1;
        notifyListener();
        return null;
    }

    public final void reset() {
        this.rendData.clear();
        while (this.listIterator.hasPrevious()) {
            this.listIterator.previous();
            this.listIterator.remove();
        }
        this.index = -1;
        notifyListener();
    }

    public final synchronized void saveRecord(String path, int width, int height) {
        try {
            Intrinsics.checkNotNullParameter(path, "path");
            EzyDrawBoard.BoardHead.Builder builder = this.header;
            if (builder.getWidth() != 0) {
                width = this.header.getWidth();
            }
            builder.setWidth(width);
            EzyDrawBoard.BoardHead.Builder builder2 = this.header;
            if (builder2.getHeight() != 0) {
                height = this.header.getHeight();
            }
            builder2.setHeight(height);
            this.header.setUpdateDate(new Date().getTime());
            this.header.setVersion(5);
            ArrayList arrayList = new ArrayList();
            while (this.listIterator.hasPrevious()) {
                this.listIterator.previous();
            }
            while (this.listIterator.hasNext()) {
                arrayList.add(this.listIterator.next());
            }
            ProtoFileUtils.Companion companion = ProtoFileUtils.INSTANCE;
            BoardDataFactory.Companion companion2 = BoardDataFactory.INSTANCE;
            EzyDrawBoard.BoardHead boardHeadBuild = this.header.build();
            Intrinsics.checkNotNullExpressionValue(boardHeadBuild, "header.build()");
            companion.saveProtoFile(path, companion2.buildCommon(arrayList, boardHeadBuild));
            EzyDrawBoard.BoardHead boardHeadBuild2 = this.header.build();
            Intrinsics.checkNotNullExpressionValue(boardHeadBuild2, "header.build()");
            companion.saveProtoFile(path, companion2.buildCommon(boardHeadBuild2));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void setHeader(EzyDrawBoard.BoardHead header) {
        Intrinsics.checkNotNullParameter(header, "header");
        this.header.setWidth(header.getWidth());
        this.header.setHeight(header.getHeight());
        this.header.setVersion(header.getVersion());
        this.header.setType(header.getType());
        this.header.setAuthor(header.getAuthor());
        this.header.setCreateDate(header.getCreateDate());
        this.header.setUpdateDate(header.getUpdateDate());
    }
}
