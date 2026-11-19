package com.zykj.sketch.core;

// RE note 将 Sketch 原生画板事件封装为动作消息并持久化。

import android.view.serialization.ClassDiscriminatorModeKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010+\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010$\u001a\u00020#2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b$\u0010%J)\u0010*\u001a\u00020)2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010\"\u001a\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+J=\u00103\u001a\u0002022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020&2\u0006\u0010/\u001a\u00020&2\u0006\u00100\u001a\u00020&2\u0006\u00101\u001a\u00020&¢\u0006\u0004\b3\u00104JE\u00107\u001a\u0002062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020&2\u0006\u0010/\u001a\u00020&2\u0006\u00100\u001a\u00020&2\u0006\u00101\u001a\u00020&2\u0006\u00105\u001a\u00020&¢\u0006\u0004\b7\u00108J\u0015\u0010:\u001a\u0002092\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b:\u0010;J\u0015\u0010=\u001a\u00020<2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b=\u0010>J\u0015\u0010@\u001a\u00020?2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b@\u0010AJ=\u0010J\u001a\u00020I2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020B2\u0006\u0010E\u001a\u00020B2\u0006\u0010F\u001a\u00020B2\u0006\u0010H\u001a\u00020G¢\u0006\u0004\bJ\u0010KJ1\u0010O\u001a\u00020N2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010L\u001a\u0004\u0018\u00010B2\b\u0010M\u001a\u0004\u0018\u00010B2\u0006\u0010H\u001a\u00020G¢\u0006\u0004\bO\u0010PJ\u0015\u0010R\u001a\u00020Q2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\bR\u0010SJ\u001d\u0010V\u001a\u00020U2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010T\u001a\u00020,¢\u0006\u0004\bV\u0010WJ\u001d\u0010Y\u001a\u00020X2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010T\u001a\u00020,¢\u0006\u0004\bY\u0010ZJ\u001d\u0010\\\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020[¢\u0006\u0004\b\\\u0010]J\u001b\u0010_\u001a\u00020\u00122\f\u0010^\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0017¢\u0006\u0004\b_\u0010`J\u0015\u0010b\u001a\u00020\u00122\u0006\u0010a\u001a\u00020\u000f¢\u0006\u0004\bb\u0010cJ%\u0010d\u001a\u00020\u00122\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020&2\u0006\u0010/\u001a\u00020&¢\u0006\u0004\bd\u0010eJ\u000f\u0010f\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\bh\u0010gJ\r\u0010i\u001a\u00020\u0012¢\u0006\u0004\bi\u0010\u0014J\r\u0010j\u001a\u00020\u0012¢\u0006\u0004\bj\u0010\u0014J\r\u0010k\u001a\u00020\u0012¢\u0006\u0004\bk\u0010\u0014J\u0015\u0010n\u001a\u00020\u00122\u0006\u0010m\u001a\u00020l¢\u0006\u0004\bn\u0010oJ\u0017\u0010r\u001a\u00020\u00122\b\u0010q\u001a\u0004\u0018\u00010p¢\u0006\u0004\br\u0010sJ\u0017\u0010u\u001a\u00020\u00122\b\u0010q\u001a\u0004\u0018\u00010t¢\u0006\u0004\bu\u0010vR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010wR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010xR\u001a\u0010z\u001a\b\u0012\u0004\u0012\u00020\u000f0y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u001a\u0010|\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0016\u0010~\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0018\u0010m\u001a\u00030\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bm\u0010\u0081\u0001R\u001b\u0010\u0082\u0001\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001b\u0010\u0084\u0001\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0019\u0010\u0086\u0001\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001¨\u0006\u0088\u0001"}, m5110d2 = {"Lcom/zykj/sketch/core/ActionRecord;", "", "Lcom/zykj/sketch/core/listener/IControl;", "actionControl", "Lcom/zykj/sketch/core/ActionStrategyFactory;", "actionFactory", "<init>", "(Lcom/zykj/sketch/core/listener/IControl;Lcom/zykj/sketch/core/ActionStrategyFactory;)V", "Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;", "buildHistoryRendData", "()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;", "Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lcom/google/protobuf/Any;", "message", "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;", "buildActionContent", "(Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;Lcom/google/protobuf/Any;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent;", "Ld6/s;", "notifyListener", "()V", "", "startTime", "", "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;", "mode", "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent;", "buildTouch", "(JLjava/util/List;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent;", "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;", "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig;", "buildModeConfig", "(JLcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;)Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig;", "Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;", "config", "Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;", "buildGraphConfig", "(JLcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;)Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;", "", TypedValues.Custom.S_COLOR, "Lcom/zykj/sketch/EzyDrawBoard$DrawArea;", "Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig;", "buildDrawConfig", "(JLjava/lang/Integer;Lcom/zykj/sketch/EzyDrawBoard$DrawArea;)Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig;", "", "path", "width", "height", "viewWidth", "viewHeight", "Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;", "buildWebViewData", "(JLjava/lang/String;IIII)Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;", "positionFlag", "Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;", "buildImageData", "(JLjava/lang/String;IIIII)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;", "Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard;", "buildClearBoardData", "(J)Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard;", "Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction;", "buildNextActionData", "(J)Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction;", "Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction;", "buildPrevActionData", "(J)Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction;", "", "scaleX", "scaleY", "centerX", "centerY", "", "keep", "Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;", "buildZoomActionData", "(JFFFFZ)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;", "translateX", "translateY", "Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;", "buildTranslation", "(JLjava/lang/Float;Ljava/lang/Float;Z)Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;", "Lcom/zykj/sketch/EzyDrawBoard$ActionResetMatrix;", "buildResetMatrix", "(J)Lcom/zykj/sketch/EzyDrawBoard$ActionResetMatrix;", "fileName", "Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;", "buildAudioStartEvent", "(JLjava/lang/String;)Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;", "Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;", "buildAudioStopEvent", "(JLjava/lang/String;)Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;", "Lcom/google/protobuf/Message;", "addRecord", "(Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;Lcom/google/protobuf/Message;)V", "actionContent", "addHistoryRecord", "(Ljava/util/List;)V", "graphSnapshot", "addHistoryRenderGraphSnapshot", "(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)V", "saveRecord", "(Ljava/lang/String;II)V", "prev", "()Lcom/zykj/sketch/EzyDrawBoard$ActionContent;", "next", "onDestroy", "reset", "clear", "Lcom/zykj/sketch/EzyDrawBoard$BoardHead;", "header", "setHeader", "(Lcom/zykj/sketch/EzyDrawBoard$BoardHead;)V", "Lcom/zykj/sketch/core/listener/NextPrevListener;", "listener", "addNextPrevListener", "(Lcom/zykj/sketch/core/listener/NextPrevListener;)V", "Lcom/zykj/sketch/core/listener/ActionChangeListener;", "addActionChangeListener", "(Lcom/zykj/sketch/core/listener/ActionChangeListener;)V", "Lcom/zykj/sketch/core/listener/IControl;", "Lcom/zykj/sketch/core/ActionStrategyFactory;", "", "listIterator", "Ljava/util/ListIterator;", "rendData", "Ljava/util/List;", "index", "I", "Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;", "Lcom/zykj/sketch/EzyDrawBoard$BoardHead$Builder;", "nextPrevListener", "Lcom/zykj/sketch/core/listener/NextPrevListener;", "actionChangeListener", "Lcom/zykj/sketch/core/listener/ActionChangeListener;", "isRecord", "Z", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class ActionRecord {

    @Nullable
    private ActionChangeListener actionChangeListener;

    @NotNull
    private final IControl actionControl;

    @NotNull
    private final ActionStrategyFactory actionFactory;

    @NotNull
    private EzyDrawBoard.BoardHead.Builder header;
    private int index;
    private boolean isRecord;

    @NotNull
    private final ListIterator<EzyDrawBoard.ActionContent> listIterator;

    @Nullable
    private NextPrevListener nextPrevListener;

    @NotNull
    private final List<EzyDrawBoard.ActionContent> rendData;

    @Metadata(m5111k = 3, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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

    public ActionRecord(@NotNull IControl actionControl, @NotNull ActionStrategyFactory actionFactory) {
        AbstractC5830k.m5330g(actionControl, "actionControl");
        AbstractC5830k.m5330g(actionFactory, "actionFactory");
        this.actionControl = actionControl;
        this.actionFactory = actionFactory;
        this.listIterator = AbstractC5805t.m5218E0(new ArrayList()).listIterator();
        this.rendData = new ArrayList();
        this.index = -1;
        this.header = BoardDataFactory.INSTANCE.buildHead();
    }

    private final EzyDrawBoard.ActionContent buildActionContent(EzyDrawBoard.ActionEnum type, Any message) {
        EzyDrawBoard.ActionContent.Builder builderNewBuilder = EzyDrawBoard.ActionContent.newBuilder();
        builderNewBuilder.setType(type);
        builderNewBuilder.setAction(message);
        EzyDrawBoard.ActionEnum type2 = builderNewBuilder.getType();
        int i = type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
        if (i == 1) {
            builderNewBuilder.setResetData(buildHistoryRendData());
        } else if (i == 6) {
            builderNewBuilder.setResetData(buildHistoryRendData());
            this.isRecord = true;
        } else if (i == 7) {
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
        AbstractC5830k.m5329f(actionContentBuild, "builder.build()");
        return actionContentBuild;
    }

    private final EzyDrawBoard.GraphResetData buildHistoryRendData() {
        EzyDrawBoard.GraphResetData.Builder builderNewBuilder = EzyDrawBoard.GraphResetData.newBuilder();
        builderNewBuilder.setAction(this.actionFactory.buildActionMode());
        builderNewBuilder.setGraphConfig(this.actionControl.getConfig());
        builderNewBuilder.setModeConfig(this.actionControl.getCurrentMode());
        builderNewBuilder.setBackgroundColor(this.actionControl.getBackgroundColor());
        EzyDrawBoard.DrawArea drawArea = this.actionControl.getDrawArea();
        if (drawArea != null) {
            builderNewBuilder.setDrawArea(drawArea);
        }
        EzyDrawBoard.GraphResetData graphResetDataBuild = builderNewBuilder.build();
        AbstractC5830k.m5329f(graphResetDataBuild, "newBuilder.build()");
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
        int i = this.index;
        if (i == -1) {
            NextPrevListener nextPrevListener2 = this.nextPrevListener;
            if (nextPrevListener2 != null) {
                nextPrevListener2.listener(false, true);
                return;
            }
            return;
        }
        if (i == this.rendData.size() - 1) {
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

    public final void addActionChangeListener(@Nullable ActionChangeListener listener) {
        this.actionChangeListener = listener;
    }

    public final void addHistoryRecord(@NotNull List<EzyDrawBoard.ActionContent> actionContent) {
        AbstractC5830k.m5330g(actionContent, "actionContent");
        Iterator<T> it = actionContent.iterator();
        while (it.hasNext()) {
            this.listIterator.add((EzyDrawBoard.ActionContent) it.next());
        }
    }

    public final void addHistoryRenderGraphSnapshot(@NotNull EzyDrawBoard.ActionContent graphSnapshot) {
        AbstractC5830k.m5330g(graphSnapshot, "graphSnapshot");
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

    public final void addNextPrevListener(@Nullable NextPrevListener listener) {
        this.nextPrevListener = listener;
    }

    public final synchronized void addRecord(@NotNull EzyDrawBoard.ActionEnum type, @NotNull Message message) {
        AbstractC5830k.m5330g(type, "type");
        AbstractC5830k.m5330g(message, "message");
        Any anyPack = Any.pack(message);
        AbstractC5830k.m5329f(anyPack, "pack(message)");
        this.listIterator.add(buildActionContent(type, anyPack));
        ActionChangeListener actionChangeListener = this.actionChangeListener;
        if (actionChangeListener != null) {
            actionChangeListener.change();
        }
    }

    @NotNull
    public final EzyDrawBoard.AudioStartAction buildAudioStartEvent(long startTime, @NotNull String fileName) {
        AbstractC5830k.m5330g(fileName, "fileName");
        EzyDrawBoard.AudioStartAction.Builder builderNewBuilder = EzyDrawBoard.AudioStartAction.newBuilder();
        builderNewBuilder.setStartTime(startTime);
        builderNewBuilder.setFileName(fileName);
        EzyDrawBoard.AudioStartAction audioStartActionBuild = builderNewBuilder.build();
        AbstractC5830k.m5329f(audioStartActionBuild, "newBuilder.build()");
        return audioStartActionBuild;
    }

    @NotNull
    public final EzyDrawBoard.AudioStopAction buildAudioStopEvent(long startTime, @NotNull String fileName) {
        AbstractC5830k.m5330g(fileName, "fileName");
        EzyDrawBoard.AudioStopAction.Builder builderNewBuilder = EzyDrawBoard.AudioStopAction.newBuilder();
        builderNewBuilder.setStartTime(startTime);
        builderNewBuilder.setFileName(fileName);
        EzyDrawBoard.AudioStopAction audioStopActionBuild = builderNewBuilder.build();
        AbstractC5830k.m5329f(audioStopActionBuild, "newBuilder.build()");
        return audioStopActionBuild;
    }

    @NotNull
    public final EzyDrawBoard.ActionClearBoard buildClearBoardData(long startTime) {
        EzyDrawBoard.ActionClearBoard.Builder builderNewBuilder = EzyDrawBoard.ActionClearBoard.newBuilder();
        builderNewBuilder.setStartTime(startTime);
        EzyDrawBoard.ActionClearBoard actionClearBoardBuild = builderNewBuilder.build();
        AbstractC5830k.m5329f(actionClearBoardBuild, "newBuilder.build()");
        return actionClearBoardBuild;
    }

    @NotNull
    public final EzyDrawBoard.ActionDrawConfig buildDrawConfig(long startTime, @Nullable Integer color, @Nullable EzyDrawBoard.DrawArea config) {
        EzyDrawBoard.ActionDrawConfig.Builder builderNewBuilder = EzyDrawBoard.ActionDrawConfig.newBuilder();
        builderNewBuilder.setStartTime(startTime);
        if (color != null) {
            builderNewBuilder.setBackgroundColor(color.intValue());
        }
        if (config != null) {
            builderNewBuilder.setDrawArea(config);
        }
        EzyDrawBoard.ActionDrawConfig actionDrawConfigBuild = builderNewBuilder.build();
        AbstractC5830k.m5329f(actionDrawConfigBuild, "newBuilder.build()");
        return actionDrawConfigBuild;
    }

    @NotNull
    public final EzyDrawBoard.ActionGraphConfig buildGraphConfig(long startTime, @NotNull EzyDrawBoard.ActionGraphConfig.GraphConfig config) {
        AbstractC5830k.m5330g(config, "config");
        EzyDrawBoard.ActionGraphConfig.Builder builderNewBuilder = EzyDrawBoard.ActionGraphConfig.newBuilder();
        builderNewBuilder.setStartTime(startTime);
        builderNewBuilder.setConfig(config);
        EzyDrawBoard.ActionGraphConfig actionGraphConfigBuild = builderNewBuilder.build();
        AbstractC5830k.m5329f(actionGraphConfigBuild, "newBuilder.build()");
        return actionGraphConfigBuild;
    }

    @NotNull
    public final EzyDrawBoard.ActionImageConfig buildImageData(long startTime, @NotNull String path, int width, int height, int viewWidth, int viewHeight, int positionFlag) {
        AbstractC5830k.m5330g(path, "path");
        EzyDrawBoard.ActionImageConfig.Builder builderNewBuilder = EzyDrawBoard.ActionImageConfig.newBuilder();
        builderNewBuilder.setStartTime(startTime);
        builderNewBuilder.setPath(path);
        builderNewBuilder.setWidth(width);
        builderNewBuilder.setHeight(height);
        builderNewBuilder.setViewWidth(viewWidth);
        builderNewBuilder.setViewHeight(viewHeight);
        builderNewBuilder.setPositionFlag(positionFlag);
        EzyDrawBoard.ActionImageConfig actionImageConfigBuild = builderNewBuilder.build();
        AbstractC5830k.m5329f(actionImageConfigBuild, "newBuilder.build()");
        return actionImageConfigBuild;
    }

    @NotNull
    public final EzyDrawBoard.ActionModeConfig buildModeConfig(long startTime, @NotNull EzyDrawBoard.ActionModeConfig.Mode mode) {
        AbstractC5830k.m5330g(mode, "mode");
        EzyDrawBoard.ActionModeConfig.Builder builderNewBuilder = EzyDrawBoard.ActionModeConfig.newBuilder();
        builderNewBuilder.setStartTime(startTime);
        builderNewBuilder.setMode(mode);
        EzyDrawBoard.ActionModeConfig actionModeConfigBuild = builderNewBuilder.build();
        AbstractC5830k.m5329f(actionModeConfigBuild, "newBuilder.build()");
        return actionModeConfigBuild;
    }

    @NotNull
    public final EzyDrawBoard.ActionNextAction buildNextActionData(long startTime) {
        EzyDrawBoard.ActionNextAction.Builder builderNewBuilder = EzyDrawBoard.ActionNextAction.newBuilder();
        builderNewBuilder.setStartTime(startTime);
        EzyDrawBoard.ActionNextAction actionNextActionBuild = builderNewBuilder.build();
        AbstractC5830k.m5329f(actionNextActionBuild, "newBuilder.build()");
        return actionNextActionBuild;
    }

    @NotNull
    public final EzyDrawBoard.ActionPrevAction buildPrevActionData(long startTime) {
        EzyDrawBoard.ActionPrevAction.Builder builderNewBuilder = EzyDrawBoard.ActionPrevAction.newBuilder();
        builderNewBuilder.setStartTime(startTime);
        EzyDrawBoard.ActionPrevAction actionPrevActionBuild = builderNewBuilder.build();
        AbstractC5830k.m5329f(actionPrevActionBuild, "newBuilder.build()");
        return actionPrevActionBuild;
    }

    @NotNull
    public final EzyDrawBoard.ActionResetMatrix buildResetMatrix(long startTime) {
        EzyDrawBoard.ActionResetMatrix.Builder builderNewBuilder = EzyDrawBoard.ActionResetMatrix.newBuilder();
        builderNewBuilder.setStartTime(startTime);
        EzyDrawBoard.ActionResetMatrix actionResetMatrixBuild = builderNewBuilder.build();
        AbstractC5830k.m5329f(actionResetMatrixBuild, "newBuilder.build()");
        return actionResetMatrixBuild;
    }

    @NotNull
    public final EzyDrawBoard.ActionTouchEvent buildTouch(long startTime, @NotNull List<EzyDrawBoard.ActionTouchEvent.TouchEvent> mode) {
        AbstractC5830k.m5330g(mode, "mode");
        EzyDrawBoard.ActionTouchEvent.Builder builderNewBuilder = EzyDrawBoard.ActionTouchEvent.newBuilder();
        builderNewBuilder.setStartTime(startTime);
        builderNewBuilder.addAllTouchEvent(mode);
        EzyDrawBoard.ActionTouchEvent actionTouchEventBuild = builderNewBuilder.build();
        AbstractC5830k.m5329f(actionTouchEventBuild, "newBuilder.build()");
        return actionTouchEventBuild;
    }

    @NotNull
    public final EzyDrawBoard.ActionTranslation buildTranslation(long startTime, @Nullable Float translateX, @Nullable Float translateY, boolean keep) {
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
        AbstractC5830k.m5329f(actionTranslationBuild, "newBuilder.build()");
        return actionTranslationBuild;
    }

    @NotNull
    public final EzyDrawBoard.ActionWebViewConfig buildWebViewData(long startTime, @NotNull String path, int width, int height, int viewWidth, int viewHeight) {
        AbstractC5830k.m5330g(path, "path");
        EzyDrawBoard.ActionWebViewConfig.Builder builderNewBuilder = EzyDrawBoard.ActionWebViewConfig.newBuilder();
        builderNewBuilder.setStartTime(startTime);
        builderNewBuilder.setPath(path);
        builderNewBuilder.setWidth(width);
        builderNewBuilder.setHeight(height);
        builderNewBuilder.setViewWidth(viewWidth);
        builderNewBuilder.setViewHeight(viewHeight);
        EzyDrawBoard.ActionWebViewConfig actionWebViewConfigBuild = builderNewBuilder.build();
        AbstractC5830k.m5329f(actionWebViewConfigBuild, "newBuilder.build()");
        return actionWebViewConfigBuild;
    }

    @NotNull
    public final EzyDrawBoard.ActionZoom buildZoomActionData(long startTime, float scaleX, float scaleY, float centerX, float centerY, boolean keep) {
        EzyDrawBoard.ActionZoom.Builder builderNewBuilder = EzyDrawBoard.ActionZoom.newBuilder();
        builderNewBuilder.setStartTime(startTime);
        builderNewBuilder.setScaleX(scaleX);
        builderNewBuilder.setScaleY(scaleY);
        builderNewBuilder.setCenterX(centerX);
        builderNewBuilder.setCenterY(centerY);
        builderNewBuilder.setKeep(keep);
        EzyDrawBoard.ActionZoom actionZoomBuild = builderNewBuilder.build();
        AbstractC5830k.m5329f(actionZoomBuild, "newBuilder.build()");
        return actionZoomBuild;
    }

    public final void clear() {
        this.rendData.clear();
        notifyListener();
    }

    @Nullable
    public final EzyDrawBoard.ActionContent next() {
        if (this.rendData.isEmpty()) {
            notifyListener();
            return null;
        }
        int i = this.index + 1;
        this.index = i;
        if (i <= this.rendData.size() - 1) {
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

    @Nullable
    public final EzyDrawBoard.ActionContent prev() {
        if (this.rendData.isEmpty()) {
            notifyListener();
            return null;
        }
        int i = this.index - 1;
        this.index = i;
        if (i > -1) {
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

    public final synchronized void saveRecord(@NotNull String path, int width, int height) {
        try {
            AbstractC5830k.m5330g(path, "path");
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
            AbstractC5830k.m5329f(boardHeadBuild, "header.build()");
            companion.saveProtoFile(path, companion2.buildCommon(arrayList, boardHeadBuild));
            EzyDrawBoard.BoardHead boardHeadBuild2 = this.header.build();
            AbstractC5830k.m5329f(boardHeadBuild2, "header.build()");
            companion.saveProtoFile(path, companion2.buildCommon(boardHeadBuild2));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void setHeader(@NotNull EzyDrawBoard.BoardHead header) {
        AbstractC5830k.m5330g(header, "header");
        this.header.setWidth(header.getWidth());
        this.header.setHeight(header.getHeight());
        this.header.setVersion(header.getVersion());
        this.header.setType(header.getType());
        this.header.setAuthor(header.getAuthor());
        this.header.setCreateDate(header.getCreateDate());
        this.header.setUpdateDate(header.getUpdateDate());
    }
}
