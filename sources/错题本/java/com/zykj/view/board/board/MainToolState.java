package com.zykj.view.board.board;

import androidx.collection.AbstractC0584a;
import androidx.compose.material3.AbstractC1923c;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.view.board.board.MainToolType;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, m5110d2 = {"Lcom/zykj/view/board/board/MainToolState;", "", "revokeVisible", "", "zoomVisible", "isWithdrawEnable", "isRecoverEnable", "isTouchable", "mainToolType", "Lcom/zykj/view/board/board/MainToolType;", "<init>", "(ZZZZZLcom/zykj/view/board/board/MainToolType;)V", "getRevokeVisible", "()Z", "getZoomVisible", "getMainToolType", "()Lcom/zykj/view/board/board/MainToolType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class MainToolState {
    private final boolean isRecoverEnable;
    private final boolean isTouchable;
    private final boolean isWithdrawEnable;

    @NotNull
    private final MainToolType mainToolType;
    private final boolean revokeVisible;
    private final boolean zoomVisible;

    public MainToolState() {
        this(false, false, false, false, false, null, 63, null);
    }

    public static /* synthetic */ MainToolState copy$default(MainToolState mainToolState, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, MainToolType mainToolType, int i, Object obj) {
        if ((i & 1) != 0) {
            z8 = mainToolState.revokeVisible;
        }
        if ((i & 2) != 0) {
            z9 = mainToolState.zoomVisible;
        }
        if ((i & 4) != 0) {
            z10 = mainToolState.isWithdrawEnable;
        }
        if ((i & 8) != 0) {
            z11 = mainToolState.isRecoverEnable;
        }
        if ((i & 16) != 0) {
            z12 = mainToolState.isTouchable;
        }
        if ((i & 32) != 0) {
            mainToolType = mainToolState.mainToolType;
        }
        boolean z13 = z12;
        MainToolType mainToolType2 = mainToolType;
        return mainToolState.copy(z8, z9, z10, z11, z13, mainToolType2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getRevokeVisible() {
        return this.revokeVisible;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getZoomVisible() {
        return this.zoomVisible;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsWithdrawEnable() {
        return this.isWithdrawEnable;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsRecoverEnable() {
        return this.isRecoverEnable;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsTouchable() {
        return this.isTouchable;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final MainToolType getMainToolType() {
        return this.mainToolType;
    }

    @NotNull
    public final MainToolState copy(boolean revokeVisible, boolean zoomVisible, boolean isWithdrawEnable, boolean isRecoverEnable, boolean isTouchable, @NotNull MainToolType mainToolType) {
        AbstractC5830k.m5330g(mainToolType, "mainToolType");
        return new MainToolState(revokeVisible, zoomVisible, isWithdrawEnable, isRecoverEnable, isTouchable, mainToolType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MainToolState)) {
            return false;
        }
        MainToolState mainToolState = (MainToolState) other;
        return this.revokeVisible == mainToolState.revokeVisible && this.zoomVisible == mainToolState.zoomVisible && this.isWithdrawEnable == mainToolState.isWithdrawEnable && this.isRecoverEnable == mainToolState.isRecoverEnable && this.isTouchable == mainToolState.isTouchable && AbstractC5830k.m5325b(this.mainToolType, mainToolState.mainToolType);
    }

    @NotNull
    public final MainToolType getMainToolType() {
        return this.mainToolType;
    }

    public final boolean getRevokeVisible() {
        return this.revokeVisible;
    }

    public final boolean getZoomVisible() {
        return this.zoomVisible;
    }

    public int hashCode() {
        return this.mainToolType.hashCode() + AbstractC0584a.m908i(this.isTouchable, AbstractC0584a.m908i(this.isRecoverEnable, AbstractC0584a.m908i(this.isWithdrawEnable, AbstractC0584a.m908i(this.zoomVisible, Boolean.hashCode(this.revokeVisible) * 31, 31), 31), 31), 31);
    }

    public final boolean isRecoverEnable() {
        return this.isRecoverEnable;
    }

    public final boolean isTouchable() {
        return this.isTouchable;
    }

    public final boolean isWithdrawEnable() {
        return this.isWithdrawEnable;
    }

    @NotNull
    public String toString() {
        boolean z8 = this.revokeVisible;
        boolean z9 = this.zoomVisible;
        boolean z10 = this.isWithdrawEnable;
        boolean z11 = this.isRecoverEnable;
        boolean z12 = this.isTouchable;
        MainToolType mainToolType = this.mainToolType;
        StringBuilder sb = new StringBuilder("MainToolState(revokeVisible=");
        sb.append(z8);
        sb.append(", zoomVisible=");
        sb.append(z9);
        sb.append(", isWithdrawEnable=");
        AbstractC1923c.m1058v(", isRecoverEnable=", ", isTouchable=", sb, z10, z11);
        sb.append(z12);
        sb.append(", mainToolType=");
        sb.append(mainToolType);
        sb.append(")");
        return sb.toString();
    }

    public MainToolState(boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, @NotNull MainToolType mainToolType) {
        AbstractC5830k.m5330g(mainToolType, "mainToolType");
        this.revokeVisible = z8;
        this.zoomVisible = z9;
        this.isWithdrawEnable = z10;
        this.isRecoverEnable = z11;
        this.isTouchable = z12;
        this.mainToolType = mainToolType;
    }

    public /* synthetic */ MainToolState(boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, MainToolType mainToolType, int i, AbstractC5824e abstractC5824e) {
        this((i & 1) != 0 ? false : z8, (i & 2) != 0 ? false : z9, (i & 4) != 0 ? false : z10, (i & 8) != 0 ? false : z11, (i & 16) != 0 ? false : z12, (i & 32) != 0 ? MainToolType.Select.INSTANCE : mainToolType);
    }
}
