package com.zykj.blackboard.core.action;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectAction;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.blackboard.listener.EventListener;
import com.zykj.board.EzyModeEnum$ModeEnum;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, m5110d2 = {"Lcom/zykj/blackboard/core/action/TouchActionModeFactory;", "Lcom/zykj/blackboard/listener/EventListener;", "<init>", "()V", "Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;", "entity", "Ld6/s;", "onEvent", "(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V", "Lcom/zykj/blackboard/core/action/IActionListener;", "listener", "setListener", "(Lcom/zykj/blackboard/core/action/IActionListener;)V", "Lcom/zykj/blackboard/core/action/ITouchAction;", "create", "(Lcom/zykj/blackboard/core/action/IActionListener;)Lcom/zykj/blackboard/core/action/ITouchAction;", "getCurrentAction", "Lcom/zykj/blackboard/core/action/WritingAction;", "writingAction", "Lcom/zykj/blackboard/core/action/WritingAction;", "getWritingAction$blackboard_release", "()Lcom/zykj/blackboard/core/action/WritingAction;", "Lcom/zykj/blackboard/core/action/WriteBeelineAction;", "writeBeelineAction", "Lcom/zykj/blackboard/core/action/WriteBeelineAction;", "Lcom/zykj/blackboard/core/action/SelectAction;", "selectAction", "Lcom/zykj/blackboard/core/action/SelectAction;", "Lcom/zykj/blackboard/core/action/EraseWritingAction;", "eraseWritingAction", "Lcom/zykj/blackboard/core/action/EraseWritingAction;", "Lcom/zykj/blackboard/core/action/SeeAction;", "seeAction", "Lcom/zykj/blackboard/core/action/SeeAction;", "Lcom/zykj/blackboard/core/action/TextAction;", "textAction", "Lcom/zykj/blackboard/core/action/TextAction;", "Lcom/zykj/blackboard/core/action/CursorAction;", "cursorAction", "Lcom/zykj/blackboard/core/action/CursorAction;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;", "newSelectAction", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;", "Lcom/zykj/blackboard/core/action/GeometryAction;", "geometryAction", "Lcom/zykj/blackboard/core/action/GeometryAction;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class TouchActionModeFactory implements EventListener {

    @NotNull
    private final WritingAction writingAction = new WritingAction();

    @NotNull
    private final WriteBeelineAction writeBeelineAction = new WriteBeelineAction();

    @NotNull
    private final SelectAction selectAction = new SelectAction();

    @NotNull
    private final EraseWritingAction eraseWritingAction = new EraseWritingAction();

    @NotNull
    private final SeeAction seeAction = new SeeAction();

    @NotNull
    private final TextAction textAction = new TextAction();

    @NotNull
    private final CursorAction cursorAction = new CursorAction();

    @NotNull
    private final NewSelectAction newSelectAction = new NewSelectAction();

    @NotNull
    private final GeometryAction geometryAction = new GeometryAction();

    @Metadata(m5111k = 3, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EzyModeEnum$ModeEnum.values().length];
            iArr[EzyModeEnum$ModeEnum.ACTION_SELECT.ordinal()] = 1;
            iArr[EzyModeEnum$ModeEnum.ACTION_WRITING.ordinal()] = 2;
            iArr[EzyModeEnum$ModeEnum.ACTION_WRITING_BEELINE.ordinal()] = 3;
            iArr[EzyModeEnum$ModeEnum.ACTION_ERASER_WRITING.ordinal()] = 4;
            iArr[EzyModeEnum$ModeEnum.ACTION_SEE.ordinal()] = 5;
            iArr[EzyModeEnum$ModeEnum.ACTION_TEXT.ordinal()] = 6;
            iArr[EzyModeEnum$ModeEnum.ACTION_CURSOR.ordinal()] = 7;
            iArr[EzyModeEnum$ModeEnum.ACTION_NEW_SELECT.ordinal()] = 8;
            iArr[EzyModeEnum$ModeEnum.ACTION_GEOMETRY.ordinal()] = 9;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Nullable
    public final ITouchAction create(@NotNull IActionListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
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

    @Nullable
    public final ITouchAction getCurrentAction(@NotNull IActionListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
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

    @NotNull
    /* renamed from: getWritingAction$blackboard_release, reason: from getter */
    public final WritingAction getWritingAction() {
        return this.writingAction;
    }

    @Override // com.zykj.blackboard.listener.EventListener
    public void onEvent(@NotNull CommandInfoEntity entity) {
        AbstractC5830k.m5330g(entity, "entity");
    }

    public final void setListener(@NotNull IActionListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
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
