package com.zykj.view.simpleBoard;

import android.graphics.Matrix;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.zykj.view.simpleBoard.action.BaseAction;
import com.zykj.view.simpleBoard.action.EraserAction;
import com.zykj.view.simpleBoard.action.LineAction;
import com.zykj.view.simpleBoard.action.SeeAction;
import com.zykj.view.simpleBoard.action.WriteAction;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001$B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, m5110d2 = {"Lcom/zykj/view/simpleBoard/ActionManager;", "", "Lcom/zykj/view/simpleBoard/SimpleBoardConfig;", "boardConfig", "Landroid/graphics/Matrix;", "cameraMatrix", "Lcom/zykj/view/simpleBoard/DrawControl;", "drawControl", "<init>", "(Lcom/zykj/view/simpleBoard/SimpleBoardConfig;Landroid/graphics/Matrix;Lcom/zykj/view/simpleBoard/DrawControl;)V", "", "mode", "Ld6/s;", "setActonMode", "(I)V", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "handTouchEvent", "(Landroid/view/MotionEvent;)V", "mActionMode", "I", "Lcom/zykj/view/simpleBoard/action/WriteAction;", "mWriteAction", "Lcom/zykj/view/simpleBoard/action/WriteAction;", "Lcom/zykj/view/simpleBoard/action/LineAction;", "mLineAction", "Lcom/zykj/view/simpleBoard/action/LineAction;", "Lcom/zykj/view/simpleBoard/action/EraserAction;", "mEraserAction", "Lcom/zykj/view/simpleBoard/action/EraserAction;", "Lcom/zykj/view/simpleBoard/action/SeeAction;", "mSeeAction", "Lcom/zykj/view/simpleBoard/action/SeeAction;", "Lcom/zykj/view/simpleBoard/action/BaseAction;", "mCurrentAction", "Lcom/zykj/view/simpleBoard/action/BaseAction;", "Action", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class ActionManager {
    private int mActionMode;

    @Nullable
    private BaseAction mCurrentAction;

    @NotNull
    private final EraserAction mEraserAction;

    @NotNull
    private final LineAction mLineAction;

    @NotNull
    private final SeeAction mSeeAction;

    @NotNull
    private final WriteAction mWriteAction;

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m5110d2 = {"Lcom/zykj/view/simpleBoard/ActionManager$Action;", "", "<init>", "()V", "Companion", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Action {
        public static final int ERASER = 2;
        public static final int LINE = 1;
        public static final int SEE = 3;
        public static final int WRITE = 0;
    }

    public ActionManager(@NotNull SimpleBoardConfig boardConfig, @NotNull Matrix cameraMatrix, @NotNull DrawControl drawControl) {
        AbstractC5830k.m5330g(boardConfig, "boardConfig");
        AbstractC5830k.m5330g(cameraMatrix, "cameraMatrix");
        AbstractC5830k.m5330g(drawControl, "drawControl");
        this.mWriteAction = new WriteAction(boardConfig, cameraMatrix, drawControl);
        this.mLineAction = new LineAction(boardConfig, cameraMatrix, drawControl);
        this.mEraserAction = new EraserAction(boardConfig, cameraMatrix, drawControl);
        this.mSeeAction = new SeeAction(boardConfig, cameraMatrix, drawControl);
    }

    public final void handTouchEvent(@NotNull MotionEvent event) {
        BaseAction baseAction;
        AbstractC5830k.m5330g(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            int i = this.mActionMode;
            BaseAction baseAction2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? this.mSeeAction : this.mSeeAction : this.mEraserAction : this.mLineAction : this.mWriteAction;
            this.mCurrentAction = baseAction2;
            if (baseAction2 != null) {
                baseAction2.onTouchDown(event);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            BaseAction baseAction3 = this.mCurrentAction;
            if (baseAction3 != null) {
                baseAction3.onTouchUp(event);
            }
            this.mCurrentAction = null;
            return;
        }
        if (actionMasked == 2) {
            BaseAction baseAction4 = this.mCurrentAction;
            if (baseAction4 != null) {
                baseAction4.onTouchMove(event);
                return;
            }
            return;
        }
        if (actionMasked != 5) {
            if (actionMasked == 6 && (baseAction = this.mCurrentAction) != null) {
                baseAction.onTouchPointerUp(event);
                return;
            }
            return;
        }
        BaseAction baseAction5 = this.mCurrentAction;
        if (baseAction5 != null) {
            baseAction5.onTouchPointerDown(event);
        }
    }

    public final void setActonMode(int mode) {
        this.mActionMode = mode;
    }
}
