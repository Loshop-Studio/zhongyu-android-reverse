package com.zykj.sketch.core;

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
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes6.dex */
public final class ActionStrategyFactory {
    private BaseAction action;
    private final IControl control;
    private WritingGroupGraph tempGraph;

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
        AbstractC9979u.m20294g(control, "control");
        this.control = control;
    }

    private final String getActionGraphName() {
        BaseAction baseAction = this.action;
        if (baseAction instanceof WritingAction) {
            AbstractC9979u.m20292e(baseAction, "null cannot be cast to non-null type com.zykj.sketch.core.action.WritingAction");
            return ((WritingAction) baseAction).getParentGraphName();
        }
        if (baseAction instanceof WritingAndMoveAction) {
            AbstractC9979u.m20292e(baseAction, "null cannot be cast to non-null type com.zykj.sketch.core.action.WritingAndMoveAction");
            return ((WritingAndMoveAction) baseAction).getParentGraphName();
        }
        if (!(baseAction instanceof WritingAndMoveVerticalAction)) {
            return null;
        }
        AbstractC9979u.m20292e(baseAction, "null cannot be cast to non-null type com.zykj.sketch.core.action.WritingAndMoveVerticalAction");
        return ((WritingAndMoveVerticalAction) baseAction).getParentGraphName();
    }

    private final String getGraphName() {
        WritingGroupGraph writingGroupGraph = this.tempGraph;
        if (writingGroupGraph != null) {
            return writingGroupGraph.getGraphName();
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
        AbstractC9979u.m20293f(actionFactoryBuild, "newBuilder.build()");
        return actionFactoryBuild;
    }

    public final void clearAction() {
        this.action = null;
    }

    public final IAction create(EzyDrawBoard.ActionModeConfig.Mode mode) { // Rectangle and ellipse mode values fall through to the default branch in this APK.
        AbstractC9979u.m20294g(mode, "mode");
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
        AbstractC9979u.m20294g(actionFactory, "actionFactory");
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
        int i10 = baseAction == null ? -1 : WhenMappings.$EnumSwitchMapping$0[baseAction.ordinal()];
        if (i10 == 2) {
            this.action = new WritingAction(this.control, (WritingGroupGraph) graphFindGraphByName);
        } else if (i10 == 3) {
            this.action = new WritingAndMoveAction(this.control, (WritingGroupGraph) graphFindGraphByName);
        } else {
            if (i10 != 4) {
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
