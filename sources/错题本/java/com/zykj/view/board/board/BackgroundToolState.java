package com.zykj.view.board.board;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.view.board.board.BackgroundType;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m5110d2 = {"Lcom/zykj/view/board/board/BackgroundToolState;", "", "backgroundLineVisible", "", "backgroundType", "Lcom/zykj/view/board/board/BackgroundType;", "<init>", "(ZLcom/zykj/view/board/board/BackgroundType;)V", "getBackgroundLineVisible", "()Z", "getBackgroundType", "()Lcom/zykj/view/board/board/BackgroundType;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class BackgroundToolState {
    private final boolean backgroundLineVisible;

    @NotNull
    private final BackgroundType backgroundType;

    /* JADX WARN: Multi-variable type inference failed */
    public BackgroundToolState() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BackgroundToolState copy$default(BackgroundToolState backgroundToolState, boolean z8, BackgroundType backgroundType, int i, Object obj) {
        if ((i & 1) != 0) {
            z8 = backgroundToolState.backgroundLineVisible;
        }
        if ((i & 2) != 0) {
            backgroundType = backgroundToolState.backgroundType;
        }
        return backgroundToolState.copy(z8, backgroundType);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getBackgroundLineVisible() {
        return this.backgroundLineVisible;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BackgroundType getBackgroundType() {
        return this.backgroundType;
    }

    @NotNull
    public final BackgroundToolState copy(boolean backgroundLineVisible, @NotNull BackgroundType backgroundType) {
        AbstractC5830k.m5330g(backgroundType, "backgroundType");
        return new BackgroundToolState(backgroundLineVisible, backgroundType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BackgroundToolState)) {
            return false;
        }
        BackgroundToolState backgroundToolState = (BackgroundToolState) other;
        return this.backgroundLineVisible == backgroundToolState.backgroundLineVisible && AbstractC5830k.m5325b(this.backgroundType, backgroundToolState.backgroundType);
    }

    public final boolean getBackgroundLineVisible() {
        return this.backgroundLineVisible;
    }

    @NotNull
    public final BackgroundType getBackgroundType() {
        return this.backgroundType;
    }

    public int hashCode() {
        return this.backgroundType.hashCode() + (Boolean.hashCode(this.backgroundLineVisible) * 31);
    }

    @NotNull
    public String toString() {
        return "BackgroundToolState(backgroundLineVisible=" + this.backgroundLineVisible + ", backgroundType=" + this.backgroundType + ")";
    }

    public BackgroundToolState(boolean z8, @NotNull BackgroundType backgroundType) {
        AbstractC5830k.m5330g(backgroundType, "backgroundType");
        this.backgroundLineVisible = z8;
        this.backgroundType = backgroundType;
    }

    public /* synthetic */ BackgroundToolState(boolean z8, BackgroundType backgroundType, int i, AbstractC5824e abstractC5824e) {
        this((i & 1) != 0 ? false : z8, (i & 2) != 0 ? BackgroundType.ColorWhite.INSTANCE : backgroundType);
    }
}
