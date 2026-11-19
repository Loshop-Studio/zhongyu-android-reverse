package com.zykj.view.board.board;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0010\u0011\u0012\u0013\u0014\u0015B;\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b\u0082\u0001\u0006\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, m5110d2 = {"Lcom/zykj/view/board/board/MinorToolType;", "", "selectVisible", "", "penVisible", "eraserVisible", "graphVisible", "backgroundVisible", "<init>", "(ZZZZZ)V", "getSelectVisible", "()Z", "getPenVisible", "getEraserVisible", "getGraphVisible", "getBackgroundVisible", "Select", "Pen", "Eraser", "Graph", "Background", "Null", "Lcom/zykj/view/board/board/MinorToolType$Background;", "Lcom/zykj/view/board/board/MinorToolType$Eraser;", "Lcom/zykj/view/board/board/MinorToolType$Graph;", "Lcom/zykj/view/board/board/MinorToolType$Null;", "Lcom/zykj/view/board/board/MinorToolType$Pen;", "Lcom/zykj/view/board/board/MinorToolType$Select;", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public abstract class MinorToolType {
    private final boolean backgroundVisible;
    private final boolean eraserVisible;
    private final boolean graphVisible;
    private final boolean penVisible;
    private final boolean selectVisible;

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/MinorToolType$Background;", "Lcom/zykj/view/board/board/MinorToolType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Background extends MinorToolType {

        @NotNull
        public static final Background INSTANCE = new Background();

        private Background() {
            super(false, false, false, false, true, 15, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Background);
        }

        public int hashCode() {
            return 2112759979;
        }

        @NotNull
        public String toString() {
            return "Background";
        }
    }

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/MinorToolType$Eraser;", "Lcom/zykj/view/board/board/MinorToolType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Eraser extends MinorToolType {

        @NotNull
        public static final Eraser INSTANCE = new Eraser();

        private Eraser() {
            super(false, false, true, false, false, 27, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Eraser);
        }

        public int hashCode() {
            return 678091913;
        }

        @NotNull
        public String toString() {
            return "Eraser";
        }
    }

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/MinorToolType$Graph;", "Lcom/zykj/view/board/board/MinorToolType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Graph extends MinorToolType {

        @NotNull
        public static final Graph INSTANCE = new Graph();

        private Graph() {
            super(false, false, false, true, false, 23, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Graph);
        }

        public int hashCode() {
            return 23720881;
        }

        @NotNull
        public String toString() {
            return "Graph";
        }
    }

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/MinorToolType$Null;", "Lcom/zykj/view/board/board/MinorToolType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Null extends MinorToolType {

        @NotNull
        public static final Null INSTANCE = new Null();

        private Null() {
            super(false, false, false, false, false, 31, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Null);
        }

        public int hashCode() {
            return 693713604;
        }

        @NotNull
        public String toString() {
            return "Null";
        }
    }

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/MinorToolType$Pen;", "Lcom/zykj/view/board/board/MinorToolType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Pen extends MinorToolType {

        @NotNull
        public static final Pen INSTANCE = new Pen();

        private Pen() {
            super(false, true, false, false, false, 29, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Pen);
        }

        public int hashCode() {
            return 1407852604;
        }

        @NotNull
        public String toString() {
            return "Pen";
        }
    }

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/MinorToolType$Select;", "Lcom/zykj/view/board/board/MinorToolType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Select extends MinorToolType {

        @NotNull
        public static final Select INSTANCE = new Select();

        private Select() {
            super(true, false, false, false, false, 30, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Select);
        }

        public int hashCode() {
            return 1067208441;
        }

        @NotNull
        public String toString() {
            return "Select";
        }
    }

    public /* synthetic */ MinorToolType(boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, AbstractC5824e abstractC5824e) {
        this(z8, z9, z10, z11, z12);
    }

    public final boolean getBackgroundVisible() {
        return this.backgroundVisible;
    }

    public final boolean getEraserVisible() {
        return this.eraserVisible;
    }

    public final boolean getGraphVisible() {
        return this.graphVisible;
    }

    public final boolean getPenVisible() {
        return this.penVisible;
    }

    public final boolean getSelectVisible() {
        return this.selectVisible;
    }

    private MinorToolType(boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.selectVisible = z8;
        this.penVisible = z9;
        this.eraserVisible = z10;
        this.graphVisible = z11;
        this.backgroundVisible = z12;
    }

    public /* synthetic */ MinorToolType(boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, int i, AbstractC5824e abstractC5824e) {
        this((i & 1) != 0 ? false : z8, (i & 2) != 0 ? false : z9, (i & 4) != 0 ? false : z10, (i & 8) != 0 ? false : z11, (i & 16) != 0 ? false : z12, null);
    }
}
