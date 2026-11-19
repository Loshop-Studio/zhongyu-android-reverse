package com.zykj.blackboard.core.action;

import com.zykj.blackboard.core.action.newSelectAtion.NewSelectAction;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.blackboard.listener.EventListener;
import com.zykj.board.EzyModeEnum;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class TouchActionModeFactory implements EventListener {
    private final WritingAction writingAction = new WritingAction();
    private final WriteBeelineAction writeBeelineAction = new WriteBeelineAction();
    private final SelectAction selectAction = new SelectAction();
    private final EraseWritingAction eraseWritingAction = new EraseWritingAction();
    private final SeeAction seeAction = new SeeAction();
    private final TextAction textAction = new TextAction();
    private final CursorAction cursorAction = new CursorAction();
    private final NewSelectAction newSelectAction = new NewSelectAction();
    private final GeometryAction geometryAction = new GeometryAction();

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EzyModeEnum.ModeEnum.values().length];
            iArr[EzyModeEnum.ModeEnum.ACTION_SELECT.ordinal()] = 1;
            iArr[EzyModeEnum.ModeEnum.ACTION_WRITING.ordinal()] = 2;
            iArr[EzyModeEnum.ModeEnum.ACTION_WRITING_BEELINE.ordinal()] = 3;
            iArr[EzyModeEnum.ModeEnum.ACTION_ERASER_WRITING.ordinal()] = 4;
            iArr[EzyModeEnum.ModeEnum.ACTION_SEE.ordinal()] = 5;
            iArr[EzyModeEnum.ModeEnum.ACTION_TEXT.ordinal()] = 6;
            iArr[EzyModeEnum.ModeEnum.ACTION_CURSOR.ordinal()] = 7;
            iArr[EzyModeEnum.ModeEnum.ACTION_NEW_SELECT.ordinal()] = 8;
            iArr[EzyModeEnum.ModeEnum.ACTION_GEOMETRY.ordinal()] = 9;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final ITouchAction create(IActionListener listener) {
        AbstractC9133u.m16133g(listener, "listener");
        switch (WhenMappings.$EnumSwitchMapping$0[listener.getBoardConfig().getMode().ordinal()]) {
            case 1:
                this.selectAction.reset();
                return this.selectAction;
            case 2:
                this.writingAction.reset();
                return this.writingAction;
            case 3:
                this.writeBeelineAction.reset();
                return this.writeBeelineAction;
            case 4:
                this.eraseWritingAction.reset();
                return this.eraseWritingAction;
            case 5:
                this.seeAction.reset();
                return this.seeAction;
            case 6:
                this.textAction.reset();
                return this.textAction;
            case 7:
                this.cursorAction.reset();
                return this.cursorAction;
            case 8:
                this.newSelectAction.reset();
                return this.newSelectAction;
            case 9:
                this.geometryAction.reset();
                return this.geometryAction;
            default:
                return null;
        }
    }

    public final ITouchAction getCurrentAction(IActionListener listener) {
        AbstractC9133u.m16133g(listener, "listener");
        switch (WhenMappings.$EnumSwitchMapping$0[listener.getBoardConfig().getMode().ordinal()]) {
            case 1:
                return this.selectAction;
            case 2:
                return this.writingAction;
            case 3:
                return this.writeBeelineAction;
            case 4:
                return this.eraseWritingAction;
            case 5:
                return this.seeAction;
            case 6:
                return this.textAction;
            case 7:
                return this.cursorAction;
            case 8:
                return this.newSelectAction;
            case 9:
                return this.geometryAction;
            default:
                return null;
        }
    }

    public final WritingAction getWritingAction$blackboard_release() {
        return this.writingAction;
    }

    @Override // com.zykj.blackboard.listener.EventListener
    public void onEvent(CommandInfoEntity entity) {
        AbstractC9133u.m16133g(entity, "entity");
    }

    public final void setListener(IActionListener listener) {
        AbstractC9133u.m16133g(listener, "listener");
        this.writingAction.setActionListener(listener);
        this.writeBeelineAction.setActionListener(listener);
        this.selectAction.setActionListener(listener);
        this.eraseWritingAction.setActionListener(listener);
        this.seeAction.setActionListener(listener);
        this.textAction.setActionListener(listener);
        this.cursorAction.setActionListener(listener);
        this.newSelectAction.setActionListener(listener);
        this.geometryAction.setActionListener(listener);
    }
}
