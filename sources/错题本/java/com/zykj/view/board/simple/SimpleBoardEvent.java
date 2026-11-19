package com.zykj.view.board.simple;

import android.support.v4.media.AbstractC0037f;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m5110d2 = {"Lcom/zykj/view/board/simple/SimpleBoardEvent;", "", "<init>", "()V", "SetFingerTouchable", "SetPenMode", "SetPenSize", "SetPenColor", "SetEraserSize", "Clean", "ExpandAnimate", "Lcom/zykj/view/board/simple/SimpleBoardEvent$Clean;", "Lcom/zykj/view/board/simple/SimpleBoardEvent$ExpandAnimate;", "Lcom/zykj/view/board/simple/SimpleBoardEvent$SetEraserSize;", "Lcom/zykj/view/board/simple/SimpleBoardEvent$SetFingerTouchable;", "Lcom/zykj/view/board/simple/SimpleBoardEvent$SetPenColor;", "Lcom/zykj/view/board/simple/SimpleBoardEvent$SetPenMode;", "Lcom/zykj/view/board/simple/SimpleBoardEvent$SetPenSize;", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public abstract class SimpleBoardEvent {

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m5110d2 = {"Lcom/zykj/view/board/simple/SimpleBoardEvent$Clean;", "Lcom/zykj/view/board/simple/SimpleBoardEvent;", "<init>", "()V", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Clean extends SimpleBoardEvent {

        @NotNull
        public static final Clean INSTANCE = new Clean();

        private Clean() {
            super(null);
        }
    }

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, m5110d2 = {"Lcom/zykj/view/board/simple/SimpleBoardEvent$ExpandAnimate;", "Lcom/zykj/view/board/simple/SimpleBoardEvent;", "isOpen", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class ExpandAnimate extends SimpleBoardEvent {
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

    @Metadata(m5109d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m5110d2 = {"Lcom/zykj/view/board/simple/SimpleBoardEvent$SetEraserSize;", "Lcom/zykj/view/board/simple/SimpleBoardEvent;", "eraserSize", "", "<init>", "(F)V", "getEraserSize", "()F", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class SetEraserSize extends SimpleBoardEvent {
        private final float eraserSize;

        public SetEraserSize(float f) {
            super(null);
            this.eraserSize = f;
        }

        public static /* synthetic */ SetEraserSize copy$default(SetEraserSize setEraserSize, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = setEraserSize.eraserSize;
            }
            return setEraserSize.copy(f);
        }

        /* renamed from: component1, reason: from getter */
        public final float getEraserSize() {
            return this.eraserSize;
        }

        @NotNull
        public final SetEraserSize copy(float eraserSize) {
            return new SetEraserSize(eraserSize);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SetEraserSize) && Float.compare(this.eraserSize, ((SetEraserSize) other).eraserSize) == 0;
        }

        public final float getEraserSize() {
            return this.eraserSize;
        }

        public int hashCode() {
            return Float.hashCode(this.eraserSize);
        }

        @NotNull
        public String toString() {
            return "SetEraserSize(eraserSize=" + this.eraserSize + ")";
        }
    }

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m5110d2 = {"Lcom/zykj/view/board/simple/SimpleBoardEvent$SetFingerTouchable;", "Lcom/zykj/view/board/simple/SimpleBoardEvent;", "enable", "", "<init>", "(Z)V", "getEnable", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class SetFingerTouchable extends SimpleBoardEvent {
        private final boolean enable;

        public SetFingerTouchable(boolean z8) {
            super(null);
            this.enable = z8;
        }

        public static /* synthetic */ SetFingerTouchable copy$default(SetFingerTouchable setFingerTouchable, boolean z8, int i, Object obj) {
            if ((i & 1) != 0) {
                z8 = setFingerTouchable.enable;
            }
            return setFingerTouchable.copy(z8);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getEnable() {
            return this.enable;
        }

        @NotNull
        public final SetFingerTouchable copy(boolean enable) {
            return new SetFingerTouchable(enable);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SetFingerTouchable) && this.enable == ((SetFingerTouchable) other).enable;
        }

        public final boolean getEnable() {
            return this.enable;
        }

        public int hashCode() {
            return Boolean.hashCode(this.enable);
        }

        @NotNull
        public String toString() {
            return "SetFingerTouchable(enable=" + this.enable + ")";
        }
    }

    @Metadata(m5109d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m5110d2 = {"Lcom/zykj/view/board/simple/SimpleBoardEvent$SetPenColor;", "Lcom/zykj/view/board/simple/SimpleBoardEvent;", "penColor", "", "<init>", "(I)V", "getPenColor", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class SetPenColor extends SimpleBoardEvent {
        private final int penColor;

        public SetPenColor(int i) {
            super(null);
            this.penColor = i;
        }

        public static /* synthetic */ SetPenColor copy$default(SetPenColor setPenColor, int i, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                i = setPenColor.penColor;
            }
            return setPenColor.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getPenColor() {
            return this.penColor;
        }

        @NotNull
        public final SetPenColor copy(int penColor) {
            return new SetPenColor(penColor);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SetPenColor) && this.penColor == ((SetPenColor) other).penColor;
        }

        public final int getPenColor() {
            return this.penColor;
        }

        public int hashCode() {
            return Integer.hashCode(this.penColor);
        }

        @NotNull
        public String toString() {
            return AbstractC0037f.m82g(this.penColor, "SetPenColor(penColor=", ")");
        }
    }

    @Metadata(m5109d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, m5110d2 = {"Lcom/zykj/view/board/simple/SimpleBoardEvent$SetPenMode;", "Lcom/zykj/view/board/simple/SimpleBoardEvent;", "actionMode", "", "isPenDashed", "", "<init>", "(IZ)V", "getActionMode", "()I", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class SetPenMode extends SimpleBoardEvent {
        private final int actionMode;
        private final boolean isPenDashed;

        public SetPenMode(int i, boolean z8) {
            super(null);
            this.actionMode = i;
            this.isPenDashed = z8;
        }

        public static /* synthetic */ SetPenMode copy$default(SetPenMode setPenMode, int i, boolean z8, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                i = setPenMode.actionMode;
            }
            if ((i8 & 2) != 0) {
                z8 = setPenMode.isPenDashed;
            }
            return setPenMode.copy(i, z8);
        }

        /* renamed from: component1, reason: from getter */
        public final int getActionMode() {
            return this.actionMode;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsPenDashed() {
            return this.isPenDashed;
        }

        @NotNull
        public final SetPenMode copy(int actionMode, boolean isPenDashed) {
            return new SetPenMode(actionMode, isPenDashed);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SetPenMode)) {
                return false;
            }
            SetPenMode setPenMode = (SetPenMode) other;
            return this.actionMode == setPenMode.actionMode && this.isPenDashed == setPenMode.isPenDashed;
        }

        public final int getActionMode() {
            return this.actionMode;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isPenDashed) + (Integer.hashCode(this.actionMode) * 31);
        }

        public final boolean isPenDashed() {
            return this.isPenDashed;
        }

        @NotNull
        public String toString() {
            return "SetPenMode(actionMode=" + this.actionMode + ", isPenDashed=" + this.isPenDashed + ")";
        }
    }

    @Metadata(m5109d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m5110d2 = {"Lcom/zykj/view/board/simple/SimpleBoardEvent$SetPenSize;", "Lcom/zykj/view/board/simple/SimpleBoardEvent;", "penSize", "", "<init>", "(F)V", "getPenSize", "()F", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class SetPenSize extends SimpleBoardEvent {
        private final float penSize;

        public SetPenSize(float f) {
            super(null);
            this.penSize = f;
        }

        public static /* synthetic */ SetPenSize copy$default(SetPenSize setPenSize, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = setPenSize.penSize;
            }
            return setPenSize.copy(f);
        }

        /* renamed from: component1, reason: from getter */
        public final float getPenSize() {
            return this.penSize;
        }

        @NotNull
        public final SetPenSize copy(float penSize) {
            return new SetPenSize(penSize);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SetPenSize) && Float.compare(this.penSize, ((SetPenSize) other).penSize) == 0;
        }

        public final float getPenSize() {
            return this.penSize;
        }

        public int hashCode() {
            return Float.hashCode(this.penSize);
        }

        @NotNull
        public String toString() {
            return "SetPenSize(penSize=" + this.penSize + ")";
        }
    }

    public /* synthetic */ SimpleBoardEvent(AbstractC5824e abstractC5824e) {
        this();
    }

    private SimpleBoardEvent() {
    }
}
