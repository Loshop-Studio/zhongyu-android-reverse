package com.zykj.sketch.core;

// RE note 将 Sketch 原生画板事件封装为动作消息并持久化。

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
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8778f0;

/* loaded from: classes3.dex */
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
        AbstractC9133u.m16133g(actionControl, "actionControl");
        AbstractC9133u.m16133g(actionFactory, "actionFactory");
        this.actionControl = actionControl;
        this.actionFactory = actionFactory;
        this.listIterator = AbstractC8778f0.m14547X0(new ArrayList()).listIterator();
        this.rendData = new ArrayList();
        this.index = -1;
        this.header = BoardDataFactory.Companion.buildHead();
    }

    private final EzyDrawBoard.ActionContent buildActionContent(EzyDrawBoard.ActionEnum actionEnum, Any any) {
        EzyDrawBoard.ActionContent.Builder builderNewBuilder = EzyDrawBoard.ActionContent.newBuilder();
        builderNewBuilder.setType(actionEnum);
        builderNewBuilder.setAction(any);
        EzyDrawBoard.ActionEnum type = builderNewBuilder.getType();
        int i10 = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
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
        AbstractC9133u.m16132f(actionContentBuild, "builder.build()");
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
        AbstractC9133u.m16132f(graphResetDataBuild, "newBuilder.build()");
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

    public final void addActionChangeListener(ActionChangeListener actionChangeListener) {
        this.actionChangeListener = actionChangeListener;
    }

    public final void addHistoryRecord(List<EzyDrawBoard.ActionContent> actionContent) {
        AbstractC9133u.m16133g(actionContent, "actionContent");
        Iterator<T> it = actionContent.iterator();
        while (it.hasNext()) {
            this.listIterator.add((EzyDrawBoard.ActionContent) it.next());
        }
    }

    public final void addHistoryRenderGraphSnapshot(EzyDrawBoard.ActionContent graphSnapshot) {
        AbstractC9133u.m16133g(graphSnapshot, "graphSnapshot");
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

    public final void addNextPrevListener(NextPrevListener nextPrevListener) {
        this.nextPrevListener = nextPrevListener;
    }

    public final synchronized void addRecord(EzyDrawBoard.ActionEnum type, Message message) {
        AbstractC9133u.m16133g(type, "type");
        AbstractC9133u.m16133g(message, "message");
        Any anyPack = Any.pack(message);
        AbstractC9133u.m16132f(anyPack, "pack(message)");
        this.listIterator.add(buildActionContent(type, anyPack));
        ActionChangeListener actionChangeListener = this.actionChangeListener;
        if (actionChangeListener != null) {
            actionChangeListener.change();
        }
    }

    public final EzyDrawBoard.AudioStartAction buildAudioStartEvent(long j10, String fileName) {
        AbstractC9133u.m16133g(fileName, "fileName");
        EzyDrawBoard.AudioStartAction.Builder builderNewBuilder = EzyDrawBoard.AudioStartAction.newBuilder();
        builderNewBuilder.setStartTime(j10);
        builderNewBuilder.setFileName(fileName);
        EzyDrawBoard.AudioStartAction audioStartActionBuild = builderNewBuilder.build();
        AbstractC9133u.m16132f(audioStartActionBuild, "newBuilder.build()");
        return audioStartActionBuild;
    }

    public final EzyDrawBoard.AudioStopAction buildAudioStopEvent(long j10, String fileName) {
        AbstractC9133u.m16133g(fileName, "fileName");
        EzyDrawBoard.AudioStopAction.Builder builderNewBuilder = EzyDrawBoard.AudioStopAction.newBuilder();
        builderNewBuilder.setStartTime(j10);
        builderNewBuilder.setFileName(fileName);
        EzyDrawBoard.AudioStopAction audioStopActionBuild = builderNewBuilder.build();
        AbstractC9133u.m16132f(audioStopActionBuild, "newBuilder.build()");
        return audioStopActionBuild;
    }

    public final EzyDrawBoard.ActionClearBoard buildClearBoardData(long j10) {
        EzyDrawBoard.ActionClearBoard.Builder builderNewBuilder = EzyDrawBoard.ActionClearBoard.newBuilder();
        builderNewBuilder.setStartTime(j10);
        EzyDrawBoard.ActionClearBoard actionClearBoardBuild = builderNewBuilder.build();
        AbstractC9133u.m16132f(actionClearBoardBuild, "newBuilder.build()");
        return actionClearBoardBuild;
    }

    public final EzyDrawBoard.ActionDrawConfig buildDrawConfig(long j10, Integer num, EzyDrawBoard.DrawArea drawArea) {
        EzyDrawBoard.ActionDrawConfig.Builder builderNewBuilder = EzyDrawBoard.ActionDrawConfig.newBuilder();
        builderNewBuilder.setStartTime(j10);
        if (num != null) {
            builderNewBuilder.setBackgroundColor(num.intValue());
        }
        if (drawArea != null) {
            builderNewBuilder.setDrawArea(drawArea);
        }
        EzyDrawBoard.ActionDrawConfig actionDrawConfigBuild = builderNewBuilder.build();
        AbstractC9133u.m16132f(actionDrawConfigBuild, "newBuilder.build()");
        return actionDrawConfigBuild;
    }

    public final EzyDrawBoard.ActionGraphConfig buildGraphConfig(long j10, EzyDrawBoard.ActionGraphConfig.GraphConfig config) {
        AbstractC9133u.m16133g(config, "config");
        EzyDrawBoard.ActionGraphConfig.Builder builderNewBuilder = EzyDrawBoard.ActionGraphConfig.newBuilder();
        builderNewBuilder.setStartTime(j10);
        builderNewBuilder.setConfig(config);
        EzyDrawBoard.ActionGraphConfig actionGraphConfigBuild = builderNewBuilder.build();
        AbstractC9133u.m16132f(actionGraphConfigBuild, "newBuilder.build()");
        return actionGraphConfigBuild;
    }

    public final EzyDrawBoard.ActionImageConfig buildImageData(long j10, String path, int i10, int i11, int i12, int i13, int i14) {
        AbstractC9133u.m16133g(path, "path");
        EzyDrawBoard.ActionImageConfig.Builder builderNewBuilder = EzyDrawBoard.ActionImageConfig.newBuilder();
        builderNewBuilder.setStartTime(j10);
        builderNewBuilder.setPath(path);
        builderNewBuilder.setWidth(i10);
        builderNewBuilder.setHeight(i11);
        builderNewBuilder.setViewWidth(i12);
        builderNewBuilder.setViewHeight(i13);
        builderNewBuilder.setPositionFlag(i14);
        EzyDrawBoard.ActionImageConfig actionImageConfigBuild = builderNewBuilder.build();
        AbstractC9133u.m16132f(actionImageConfigBuild, "newBuilder.build()");
        return actionImageConfigBuild;
    }

    public final EzyDrawBoard.ActionModeConfig buildModeConfig(long j10, EzyDrawBoard.ActionModeConfig.Mode mode) {
        AbstractC9133u.m16133g(mode, "mode");
        EzyDrawBoard.ActionModeConfig.Builder builderNewBuilder = EzyDrawBoard.ActionModeConfig.newBuilder();
        builderNewBuilder.setStartTime(j10);
        builderNewBuilder.setMode(mode);
        EzyDrawBoard.ActionModeConfig actionModeConfigBuild = builderNewBuilder.build();
        AbstractC9133u.m16132f(actionModeConfigBuild, "newBuilder.build()");
        return actionModeConfigBuild;
    }

    public final EzyDrawBoard.ActionNextAction buildNextActionData(long j10) {
        EzyDrawBoard.ActionNextAction.Builder builderNewBuilder = EzyDrawBoard.ActionNextAction.newBuilder();
        builderNewBuilder.setStartTime(j10);
        EzyDrawBoard.ActionNextAction actionNextActionBuild = builderNewBuilder.build();
        AbstractC9133u.m16132f(actionNextActionBuild, "newBuilder.build()");
        return actionNextActionBuild;
    }

    public final EzyDrawBoard.ActionPrevAction buildPrevActionData(long j10) {
        EzyDrawBoard.ActionPrevAction.Builder builderNewBuilder = EzyDrawBoard.ActionPrevAction.newBuilder();
        builderNewBuilder.setStartTime(j10);
        EzyDrawBoard.ActionPrevAction actionPrevActionBuild = builderNewBuilder.build();
        AbstractC9133u.m16132f(actionPrevActionBuild, "newBuilder.build()");
        return actionPrevActionBuild;
    }

    public final EzyDrawBoard.ActionResetMatrix buildResetMatrix(long j10) {
        EzyDrawBoard.ActionResetMatrix.Builder builderNewBuilder = EzyDrawBoard.ActionResetMatrix.newBuilder();
        builderNewBuilder.setStartTime(j10);
        EzyDrawBoard.ActionResetMatrix actionResetMatrixBuild = builderNewBuilder.build();
        AbstractC9133u.m16132f(actionResetMatrixBuild, "newBuilder.build()");
        return actionResetMatrixBuild;
    }

    public final EzyDrawBoard.ActionTouchEvent buildTouch(long j10, List<EzyDrawBoard.ActionTouchEvent.TouchEvent> mode) {
        AbstractC9133u.m16133g(mode, "mode");
        EzyDrawBoard.ActionTouchEvent.Builder builderNewBuilder = EzyDrawBoard.ActionTouchEvent.newBuilder();
        builderNewBuilder.setStartTime(j10);
        builderNewBuilder.addAllTouchEvent(mode);
        EzyDrawBoard.ActionTouchEvent actionTouchEventBuild = builderNewBuilder.build();
        AbstractC9133u.m16132f(actionTouchEventBuild, "newBuilder.build()");
        return actionTouchEventBuild;
    }

    public final EzyDrawBoard.ActionTranslation buildTranslation(long j10, Float f10, Float f11, boolean z10) {
        EzyDrawBoard.ActionTranslation.Builder builderNewBuilder = EzyDrawBoard.ActionTranslation.newBuilder();
        builderNewBuilder.setStartTime(j10);
        if (f10 != null) {
            builderNewBuilder.setTransX(FloatValue.newBuilder().setValue(f10.floatValue()).build());
        }
        if (f11 != null) {
            builderNewBuilder.setTransY(FloatValue.newBuilder().setValue(f11.floatValue()).build());
        }
        builderNewBuilder.setKeep(z10);
        EzyDrawBoard.ActionTranslation actionTranslationBuild = builderNewBuilder.build();
        AbstractC9133u.m16132f(actionTranslationBuild, "newBuilder.build()");
        return actionTranslationBuild;
    }

    public final EzyDrawBoard.ActionWebViewConfig buildWebViewData(long j10, String path, int i10, int i11, int i12, int i13) {
        AbstractC9133u.m16133g(path, "path");
        EzyDrawBoard.ActionWebViewConfig.Builder builderNewBuilder = EzyDrawBoard.ActionWebViewConfig.newBuilder();
        builderNewBuilder.setStartTime(j10);
        builderNewBuilder.setPath(path);
        builderNewBuilder.setWidth(i10);
        builderNewBuilder.setHeight(i11);
        builderNewBuilder.setViewWidth(i12);
        builderNewBuilder.setViewHeight(i13);
        EzyDrawBoard.ActionWebViewConfig actionWebViewConfigBuild = builderNewBuilder.build();
        AbstractC9133u.m16132f(actionWebViewConfigBuild, "newBuilder.build()");
        return actionWebViewConfigBuild;
    }

    public final EzyDrawBoard.ActionZoom buildZoomActionData(long j10, float f10, float f11, float f12, float f13, boolean z10) {
        EzyDrawBoard.ActionZoom.Builder builderNewBuilder = EzyDrawBoard.ActionZoom.newBuilder();
        builderNewBuilder.setStartTime(j10);
        builderNewBuilder.setScaleX(f10);
        builderNewBuilder.setScaleY(f11);
        builderNewBuilder.setCenterX(f12);
        builderNewBuilder.setCenterY(f13);
        builderNewBuilder.setKeep(z10);
        EzyDrawBoard.ActionZoom actionZoomBuild = builderNewBuilder.build();
        AbstractC9133u.m16132f(actionZoomBuild, "newBuilder.build()");
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

    public final synchronized void saveRecord(String path, int i10, int i11) {
        try {
            AbstractC9133u.m16133g(path, "path");
            EzyDrawBoard.BoardHead.Builder builder = this.header;
            if (builder.getWidth() != 0) {
                i10 = this.header.getWidth();
            }
            builder.setWidth(i10);
            EzyDrawBoard.BoardHead.Builder builder2 = this.header;
            if (builder2.getHeight() != 0) {
                i11 = this.header.getHeight();
            }
            builder2.setHeight(i11);
            this.header.setUpdateDate(new Date().getTime());
            this.header.setVersion(5);
            ArrayList arrayList = new ArrayList();
            while (this.listIterator.hasPrevious()) {
                this.listIterator.previous();
            }
            while (this.listIterator.hasNext()) {
                arrayList.add(this.listIterator.next());
            }
            ProtoFileUtils.Companion companion = ProtoFileUtils.Companion;
            BoardDataFactory.Companion companion2 = BoardDataFactory.Companion;
            EzyDrawBoard.BoardHead boardHeadBuild = this.header.build();
            AbstractC9133u.m16132f(boardHeadBuild, "header.build()");
            companion.saveProtoFile(path, companion2.buildCommon(arrayList, boardHeadBuild));
            EzyDrawBoard.BoardHead boardHeadBuild2 = this.header.build();
            AbstractC9133u.m16132f(boardHeadBuild2, "header.build()");
            companion.saveProtoFile(path, companion2.buildCommon(boardHeadBuild2));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void setHeader(EzyDrawBoard.BoardHead header) {
        AbstractC9133u.m16133g(header, "header");
        this.header.setWidth(header.getWidth());
        this.header.setHeight(header.getHeight());
        this.header.setVersion(header.getVersion());
        this.header.setType(header.getType());
        this.header.setAuthor(header.getAuthor());
        this.header.setCreateDate(header.getCreateDate());
        this.header.setUpdateDate(header.getUpdateDate());
    }
}
