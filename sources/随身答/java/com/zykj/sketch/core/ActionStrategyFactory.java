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
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13412d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002J\u000e\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u000eJ\u0006\u0010\u001a\u001a\u00020\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m13413d2 = {"Lcom/zykj/sketch/core/ActionStrategyFactory;", "", "control", "Lcom/zykj/sketch/core/listener/IControl;", "(Lcom/zykj/sketch/core/listener/IControl;)V", "action", "Lcom/zykj/sketch/core/action/BaseAction;", "getAction", "()Lcom/zykj/sketch/core/action/BaseAction;", "setAction", "(Lcom/zykj/sketch/core/action/BaseAction;)V", "tempGraph", "Lcom/zykj/sketch/core/graph/WritingGroupGraph;", "buildActionMode", "Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$ActionFactory;", "clearAction", "", "create", "Lcom/zykj/sketch/core/listener/IAction;", "mode", "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;", "getActionGraphName", "", "getGraphName", "parseActionMode", "actionFactory", "reset", "sketch_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final class ActionStrategyFactory {
    private BaseAction action;
    private final IControl control;
    private WritingGroupGraph tempGraph;

    @Metadata(m13414k = 3, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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

    public ActionStrategyFactory(IControl control) {
        Intrinsics.checkNotNullParameter(control, "control");
        this.control = control;
    }

    private final String getActionGraphName() {
        BaseAction baseAction = this.action;
        if (baseAction instanceof WritingAction) {
            Intrinsics.checkNotNull(baseAction, "null cannot be cast to non-null type com.zykj.sketch.core.action.WritingAction");
            return ((WritingAction) baseAction).getParentGraphName();
        }
        if (baseAction instanceof WritingAndMoveAction) {
            Intrinsics.checkNotNull(baseAction, "null cannot be cast to non-null type com.zykj.sketch.core.action.WritingAndMoveAction");
            return ((WritingAndMoveAction) baseAction).getParentGraphName();
        }
        if (!(baseAction instanceof WritingAndMoveVerticalAction)) {
            return null;
        }
        Intrinsics.checkNotNull(baseAction, "null cannot be cast to non-null type com.zykj.sketch.core.action.WritingAndMoveVerticalAction");
        return ((WritingAndMoveVerticalAction) baseAction).getParentGraphName();
    }

    private final String getGraphName() {
        WritingGroupGraph writingGroupGraph = this.tempGraph;
        if (writingGroupGraph != null) {
            return writingGroupGraph.getName();
        }
        return null;
    }

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
        Intrinsics.checkNotNullExpressionValue(actionFactoryBuild, "newBuilder.build()");
        return actionFactoryBuild;
    }

    public final void clearAction() {
        this.action = null;
    }

    public final IAction create(EzyDrawBoard.ActionModeConfig.Mode mode) { // Rectangle and ellipse mode values fall through to the default branch in this APK.
        Intrinsics.checkNotNullParameter(mode, "mode");
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

    public final BaseAction getAction() {
        return this.action;
    }

    public final void parseActionMode(EzyDrawBoard.GraphResetData.ActionFactory actionFactory) {
        Graph graphFindGraphByName;
        Graph graphFindGraphByName2;
        Intrinsics.checkNotNullParameter(actionFactory, "actionFactory");
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
        int i9 = baseAction == null ? -1 : WhenMappings.$EnumSwitchMapping$0[baseAction.ordinal()];
        if (i9 == 2) {
            this.action = new WritingAction(this.control, (WritingGroupGraph) graphFindGraphByName);
        } else if (i9 == 3) {
            this.action = new WritingAndMoveAction(this.control, (WritingGroupGraph) graphFindGraphByName);
        } else {
            if (i9 != 4) {
                return;
            }
            this.action = new WritingAndMoveVerticalAction(this.control, (WritingGroupGraph) graphFindGraphByName);
        }
    }

    public final void reset() {
        this.action = null;
        this.tempGraph = null;
    }

    public final void setAction(BaseAction baseAction) {
        this.action = baseAction;
    }
}
