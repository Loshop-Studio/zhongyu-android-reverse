package com.zykj.sketch.core;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.core.action.BaseAction;
import com.zykj.sketch.core.action.EraseViewAction;
import com.zykj.sketch.core.action.EraseWritingAction;
import com.zykj.sketch.core.action.SelectAction;
import com.zykj.sketch.core.action.WritingAction;
import com.zykj.sketch.core.action.WritingAndMoveAction;
import com.zykj.sketch.core.action.WritingAndMoveVerticalAction;
import com.zykj.sketch.core.graph.Graph;
import com.zykj.sketch.core.graph.WritingGroupGraph;
import com.zykj.sketch.core.listener.IAction;
import com.zykj.sketch.core.listener.IControl;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, m5110d2 = {"Lcom/zykj/sketch/core/ActionStrategyFactory;", "", "Lcom/zykj/sketch/core/listener/IControl;", "control", "<init>", "(Lcom/zykj/sketch/core/listener/IControl;)V", "", "getGraphName", "()Ljava/lang/String;", "getActionGraphName", "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;", "mode", "Lcom/zykj/sketch/core/listener/IAction;", "create", "(Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;)Lcom/zykj/sketch/core/listener/IAction;", "Ld6/s;", "clearAction", "()V", "reset", "Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;", "buildActionMode", "()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;", "actionFactory", "parseActionMode", "(Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;)V", "Lcom/zykj/sketch/core/listener/IControl;", "Lcom/zykj/sketch/core/action/BaseAction;", "action", "Lcom/zykj/sketch/core/action/BaseAction;", "getAction", "()Lcom/zykj/sketch/core/action/BaseAction;", "setAction", "(Lcom/zykj/sketch/core/action/BaseAction;)V", "Lcom/zykj/sketch/core/graph/WritingGroupGraph;", "tempGraph", "Lcom/zykj/sketch/core/graph/WritingGroupGraph;", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class ActionStrategyFactory {

    @Nullable
    private BaseAction action;

    @NotNull
    private final IControl control;

    @Nullable
    private WritingGroupGraph tempGraph;

    @Metadata(m5111k = 3, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EzyDrawBoard.ActionModeConfig.Mode.values().length];
            iArr[EzyDrawBoard.ActionModeConfig.Mode.ACTION_SELECT.ordinal()] = 1;
            iArr[EzyDrawBoard.ActionModeConfig.Mode.ACTION_WRITING.ordinal()] = 2;
            iArr[EzyDrawBoard.ActionModeConfig.Mode.ACTION_WRITING_MOVE.ordinal()] = 3;
            iArr[EzyDrawBoard.ActionModeConfig.Mode.ACTION_WRITING_MOVE_VERTICAL.ordinal()] = 4;
            iArr[EzyDrawBoard.ActionModeConfig.Mode.ACTION_ERASER_VIEW.ordinal()] = 5;
            iArr[EzyDrawBoard.ActionModeConfig.Mode.ACTION_ERASER_WRITING.ordinal()] = 6;
            iArr[EzyDrawBoard.ActionModeConfig.Mode.ACTION_DELETE.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ActionStrategyFactory(@NotNull IControl control) {
        AbstractC5830k.m5330g(control, "control");
        this.control = control;
    }

    private final String getActionGraphName() {
        BaseAction baseAction = this.action;
        if (baseAction instanceof WritingAction) {
            AbstractC5830k.m5328e(baseAction, "null cannot be cast to non-null type com.zykj.sketch.core.action.WritingAction");
            return ((WritingAction) baseAction).getParentGraphName();
        }
        if (baseAction instanceof WritingAndMoveAction) {
            AbstractC5830k.m5328e(baseAction, "null cannot be cast to non-null type com.zykj.sketch.core.action.WritingAndMoveAction");
            return ((WritingAndMoveAction) baseAction).getParentGraphName();
        }
        if (!(baseAction instanceof WritingAndMoveVerticalAction)) {
            return null;
        }
        AbstractC5830k.m5328e(baseAction, "null cannot be cast to non-null type com.zykj.sketch.core.action.WritingAndMoveVerticalAction");
        return ((WritingAndMoveVerticalAction) baseAction).getParentGraphName();
    }

    private final String getGraphName() {
        WritingGroupGraph writingGroupGraph = this.tempGraph;
        if (writingGroupGraph != null) {
            return writingGroupGraph.getName();
        }
        return null;
    }

    @NotNull
    public final EzyDrawBoard.GraphResetData.ActionFactory buildActionMode() {
        EzyDrawBoard.GraphResetData.ActionFactory.Builder builderNewBuilder = EzyDrawBoard.GraphResetData.ActionFactory.newBuilder();
        BaseAction baseAction = this.action;
        if (baseAction != null) {
            builderNewBuilder.setBaseAction(baseAction.enumType());
        }
        String actionGraphName = getActionGraphName();
        if (actionGraphName != null) {
            builderNewBuilder.setFactoryActionGraphName(actionGraphName);
        }
        String graphName = getGraphName();
        if (graphName != null) {
            builderNewBuilder.setFactoryGraphName(graphName);
        }
        EzyDrawBoard.GraphResetData.ActionFactory actionFactoryBuild = builderNewBuilder.build();
        AbstractC5830k.m5329f(actionFactoryBuild, "newBuilder.build()");
        return actionFactoryBuild;
    }

    public final void clearAction() {
        this.action = null;
    }

    @Nullable
    public final IAction create(@NotNull EzyDrawBoard.ActionModeConfig.Mode mode) { // Rectangle and ellipse mode values fall through to the default branch in this APK.
        AbstractC5830k.m5330g(mode, "mode");
        switch (WhenMappings.$EnumSwitchMapping$0[mode.ordinal()]) {
            case 1:
                this.action = new SelectAction(this.control);
                this.tempGraph = null;
                break;
            case 2:
                if (!(this.action instanceof WritingAction)) {
                    if (this.tempGraph == null) {
                        this.tempGraph = new WritingGroupGraph(this.control);
                    }
                    WritingGroupGraph writingGroupGraph = this.tempGraph;
                    if (writingGroupGraph != null) {
                        this.action = new WritingAction(this.control, writingGroupGraph);
                        break;
                    }
                }
                break;
            case 3:
                if (!(this.action instanceof WritingAndMoveAction)) {
                    if (this.tempGraph == null) {
                        this.tempGraph = new WritingGroupGraph(this.control);
                    }
                    WritingGroupGraph writingGroupGraph2 = this.tempGraph;
                    if (writingGroupGraph2 != null) {
                        this.action = new WritingAndMoveAction(this.control, writingGroupGraph2);
                        break;
                    }
                }
                break;
            case 4:
                if (!(this.action instanceof WritingAndMoveVerticalAction)) {
                    if (this.tempGraph == null) {
                        this.tempGraph = new WritingGroupGraph(this.control);
                    }
                    WritingGroupGraph writingGroupGraph3 = this.tempGraph;
                    if (writingGroupGraph3 != null) {
                        this.action = new WritingAndMoveVerticalAction(this.control, writingGroupGraph3);
                        break;
                    }
                }
                break;
            case 5:
                this.action = new EraseViewAction(this.control);
                this.tempGraph = null;
                break;
            case 6:
                this.action = new EraseWritingAction(this.control);
                break;
            case 7:
                this.action = null;
                this.tempGraph = null;
                break;
            default:
                this.action = null;
                this.tempGraph = null;
                break;
        }
        return this.action;
    }

    @Nullable
    public final BaseAction getAction() {
        return this.action;
    }

    public final void parseActionMode(@NotNull EzyDrawBoard.GraphResetData.ActionFactory actionFactory) {
        Graph graphFindGraphByName;
        Graph graphFindGraphByName2;
        AbstractC5830k.m5330g(actionFactory, "actionFactory");
        this.action = null;
        this.tempGraph = null;
        String factoryGraphName = actionFactory.getFactoryGraphName();
        if (factoryGraphName != null && (graphFindGraphByName2 = this.control.getRootGraph().findGraphByName(factoryGraphName)) != null && (graphFindGraphByName2 instanceof WritingGroupGraph)) {
            this.tempGraph = (WritingGroupGraph) graphFindGraphByName2;
        }
        String factoryActionGraphName = actionFactory.getFactoryActionGraphName();
        if (factoryActionGraphName == null || (graphFindGraphByName = this.control.getRootGraph().findGraphByName(factoryActionGraphName)) == null || !(graphFindGraphByName instanceof WritingGroupGraph)) {
            return;
        }
        EzyDrawBoard.ActionModeConfig.Mode baseAction = actionFactory.getBaseAction();
        int i = baseAction == null ? -1 : WhenMappings.$EnumSwitchMapping$0[baseAction.ordinal()];
        if (i == 2) {
            this.action = new WritingAction(this.control, (WritingGroupGraph) graphFindGraphByName);
        } else if (i == 3) {
            this.action = new WritingAndMoveAction(this.control, (WritingGroupGraph) graphFindGraphByName);
        } else {
            if (i != 4) {
                return;
            }
            this.action = new WritingAndMoveVerticalAction(this.control, (WritingGroupGraph) graphFindGraphByName);
        }
    }

    public final void reset() {
        this.action = null;
        this.tempGraph = null;
    }

    public final void setAction(@Nullable BaseAction baseAction) {
        this.action = baseAction;
    }
}
