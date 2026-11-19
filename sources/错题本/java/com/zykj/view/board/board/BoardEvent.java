package com.zykj.view.board.board;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m5110d2 = {"Lcom/zykj/view/board/board/BoardEvent;", "", "<init>", "()V", "ExpandAnimate", "Lcom/zykj/view/board/board/BoardEvent$ExpandAnimate;", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public abstract class BoardEvent {

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, m5110d2 = {"Lcom/zykj/view/board/board/BoardEvent$ExpandAnimate;", "Lcom/zykj/view/board/board/BoardEvent;", "isOpen", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class ExpandAnimate extends BoardEvent {
        private final boolean isOpen;

        public ExpandAnimate(boolean z8) {
            super(null);
            this.isOpen = z8;
        }

        public static /* synthetic */ ExpandAnimate copy$default(ExpandAnimate expandAnimate, boolean z8, int i, Object obj) {
            if ((i & 1) != 0) {
                z8 = expandAnimate.isOpen;
            }
            return expandAnimate.copy(z8);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsOpen() {
            return this.isOpen;
        }

        @NotNull
        public final ExpandAnimate copy(boolean isOpen) {
            return new ExpandAnimate(isOpen);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ExpandAnimate) && this.isOpen == ((ExpandAnimate) other).isOpen;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isOpen);
        }

        public final boolean isOpen() {
            return this.isOpen;
        }

        @NotNull
        public String toString() {
            return "ExpandAnimate(isOpen=" + this.isOpen + ")";
        }
    }

    public /* synthetic */ BoardEvent(AbstractC5824e abstractC5824e) {
        this();
    }

    private BoardEvent() {
    }
}
