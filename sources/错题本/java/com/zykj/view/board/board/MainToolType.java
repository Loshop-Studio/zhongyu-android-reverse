package com.zykj.view.board.board;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB1\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m5110d2 = {"Lcom/zykj/view/board/board/MainToolType;", "", "isSelectChecked", "", "isPenChecked", "isEraserChecked", "isGraphChecked", "<init>", "(ZZZZ)V", "()Z", "Select", "Pen", "Eraser", "Graph", "Lcom/zykj/view/board/board/MainToolType$Eraser;", "Lcom/zykj/view/board/board/MainToolType$Graph;", "Lcom/zykj/view/board/board/MainToolType$Pen;", "Lcom/zykj/view/board/board/MainToolType$Select;", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public abstract class MainToolType {
    private final boolean isEraserChecked;
    private final boolean isGraphChecked;
    private final boolean isPenChecked;
    private final boolean isSelectChecked;

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/MainToolType$Eraser;", "Lcom/zykj/view/board/board/MainToolType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Eraser extends MainToolType {

        @NotNull
        public static final Eraser INSTANCE = new Eraser();

        private Eraser() {
            super(false, false, true, false, 11, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Eraser);
        }

        public int hashCode() {
            return 331843481;
        }

        @NotNull
        public String toString() {
            return "Eraser";
        }
    }

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/MainToolType$Graph;", "Lcom/zykj/view/board/board/MainToolType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Graph extends MainToolType {

        @NotNull
        public static final Graph INSTANCE = new Graph();

        private Graph() {
            super(false, false, false, true, 7, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Graph);
        }

        public int hashCode() {
            return 289646241;
        }

        @NotNull
        public String toString() {
            return "Graph";
        }
    }

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/MainToolType$Pen;", "Lcom/zykj/view/board/board/MainToolType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Pen extends MainToolType {

        @NotNull
        public static final Pen INSTANCE = new Pen();

        private Pen() {
            super(false, true, false, false, 13, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Pen);
        }

        public int hashCode() {
            return 527683372;
        }

        @NotNull
        public String toString() {
            return "Pen";
        }
    }

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/MainToolType$Select;", "Lcom/zykj/view/board/board/MainToolType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Select extends MainToolType {

        @NotNull
        public static final Select INSTANCE = new Select();

        private Select() {
            super(true, false, false, false, 14, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Select);
        }

        public int hashCode() {
            return 720960009;
        }

        @NotNull
        public String toString() {
            return "Select";
        }
    }

    public /* synthetic */ MainToolType(boolean z8, boolean z9, boolean z10, boolean z11, AbstractC5824e abstractC5824e) {
        this(z8, z9, z10, z11);
    }

    /* renamed from: isEraserChecked, reason: from getter */
    public final boolean getIsEraserChecked() {
        return this.isEraserChecked;
    }

    /* renamed from: isGraphChecked, reason: from getter */
    public final boolean getIsGraphChecked() {
        return this.isGraphChecked;
    }

    /* renamed from: isPenChecked, reason: from getter */
    public final boolean getIsPenChecked() {
        return this.isPenChecked;
    }

    /* renamed from: isSelectChecked, reason: from getter */
    public final boolean getIsSelectChecked() {
        return this.isSelectChecked;
    }

    private MainToolType(boolean z8, boolean z9, boolean z10, boolean z11) {
        this.isSelectChecked = z8;
        this.isPenChecked = z9;
        this.isEraserChecked = z10;
        this.isGraphChecked = z11;
    }

    public /* synthetic */ MainToolType(boolean z8, boolean z9, boolean z10, boolean z11, int i, AbstractC5824e abstractC5824e) {
        this((i & 1) != 0 ? false : z8, (i & 2) != 0 ? false : z9, (i & 4) != 0 ? false : z10, (i & 8) != 0 ? false : z11, null);
    }
}
