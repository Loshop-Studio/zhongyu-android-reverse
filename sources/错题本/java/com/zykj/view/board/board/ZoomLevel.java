package com.zykj.view.board.board;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u000b\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, m5110d2 = {"Lcom/zykj/view/board/board/ZoomLevel;", "", "ordinal", "", "zoomValue", "", "<init>", "(IF)V", "getOrdinal", "()I", "getZoomValue", "()F", "LevelN2", "LevelN1", "Level0", "Level1", "Level2", "Level3", "Level4", "Level5", "Level6", "Level7", "Level8", "Lcom/zykj/view/board/board/ZoomLevel$Level0;", "Lcom/zykj/view/board/board/ZoomLevel$Level1;", "Lcom/zykj/view/board/board/ZoomLevel$Level2;", "Lcom/zykj/view/board/board/ZoomLevel$Level3;", "Lcom/zykj/view/board/board/ZoomLevel$Level4;", "Lcom/zykj/view/board/board/ZoomLevel$Level5;", "Lcom/zykj/view/board/board/ZoomLevel$Level6;", "Lcom/zykj/view/board/board/ZoomLevel$Level7;", "Lcom/zykj/view/board/board/ZoomLevel$Level8;", "Lcom/zykj/view/board/board/ZoomLevel$LevelN1;", "Lcom/zykj/view/board/board/ZoomLevel$LevelN2;", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public abstract class ZoomLevel {
    private final int ordinal;
    private final float zoomValue;

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/ZoomLevel$Level0;", "Lcom/zykj/view/board/board/ZoomLevel;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Level0 extends ZoomLevel {

        @NotNull
        public static final Level0 INSTANCE = new Level0();

        private Level0() {
            super(0, 0.576f, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Level0);
        }

        public int hashCode() {
            return 1821240127;
        }

        @NotNull
        public String toString() {
            return "Level0";
        }
    }

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/ZoomLevel$Level1;", "Lcom/zykj/view/board/board/ZoomLevel;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Level1 extends ZoomLevel {

        @NotNull
        public static final Level1 INSTANCE = new Level1();

        private Level1() {
            super(1, 0.64f, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Level1);
        }

        public int hashCode() {
            return 1821240128;
        }

        @NotNull
        public String toString() {
            return "Level1";
        }
    }

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/ZoomLevel$Level2;", "Lcom/zykj/view/board/board/ZoomLevel;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Level2 extends ZoomLevel {

        @NotNull
        public static final Level2 INSTANCE = new Level2();

        private Level2() {
            super(2, 0.8f, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Level2);
        }

        public int hashCode() {
            return 1821240129;
        }

        @NotNull
        public String toString() {
            return "Level2";
        }
    }

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/ZoomLevel$Level3;", "Lcom/zykj/view/board/board/ZoomLevel;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Level3 extends ZoomLevel {

        @NotNull
        public static final Level3 INSTANCE = new Level3();

        private Level3() {
            super(3, 1.0f, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Level3);
        }

        public int hashCode() {
            return 1821240130;
        }

        @NotNull
        public String toString() {
            return "Level3";
        }
    }

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/ZoomLevel$Level4;", "Lcom/zykj/view/board/board/ZoomLevel;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Level4 extends ZoomLevel {

        @NotNull
        public static final Level4 INSTANCE = new Level4();

        private Level4() {
            super(4, 1.2f, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Level4);
        }

        public int hashCode() {
            return 1821240131;
        }

        @NotNull
        public String toString() {
            return "Level4";
        }
    }

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/ZoomLevel$Level5;", "Lcom/zykj/view/board/board/ZoomLevel;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Level5 extends ZoomLevel {

        @NotNull
        public static final Level5 INSTANCE = new Level5();

        private Level5() {
            super(5, 1.44f, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Level5);
        }

        public int hashCode() {
            return 1821240132;
        }

        @NotNull
        public String toString() {
            return "Level5";
        }
    }

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/ZoomLevel$Level6;", "Lcom/zykj/view/board/board/ZoomLevel;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Level6 extends ZoomLevel {

        @NotNull
        public static final Level6 INSTANCE = new Level6();

        private Level6() {
            super(6, 1.584f, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Level6);
        }

        public int hashCode() {
            return 1821240133;
        }

        @NotNull
        public String toString() {
            return "Level6";
        }
    }

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/ZoomLevel$Level7;", "Lcom/zykj/view/board/board/ZoomLevel;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Level7 extends ZoomLevel {

        @NotNull
        public static final Level7 INSTANCE = new Level7();

        private Level7() {
            super(7, 1.742f, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Level7);
        }

        public int hashCode() {
            return 1821240134;
        }

        @NotNull
        public String toString() {
            return "Level7";
        }
    }

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/ZoomLevel$Level8;", "Lcom/zykj/view/board/board/ZoomLevel;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Level8 extends ZoomLevel {

        @NotNull
        public static final Level8 INSTANCE = new Level8();

        private Level8() {
            super(8, 1.917f, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Level8);
        }

        public int hashCode() {
            return 1821240135;
        }

        @NotNull
        public String toString() {
            return "Level8";
        }
    }

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/ZoomLevel$LevelN1;", "Lcom/zykj/view/board/board/ZoomLevel;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class LevelN1 extends ZoomLevel {

        @NotNull
        public static final LevelN1 INSTANCE = new LevelN1();

        private LevelN1() {
            super(-1, 0.518f, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof LevelN1);
        }

        public int hashCode() {
            return 623870068;
        }

        @NotNull
        public String toString() {
            return "LevelN1";
        }
    }

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/ZoomLevel$LevelN2;", "Lcom/zykj/view/board/board/ZoomLevel;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class LevelN2 extends ZoomLevel {

        @NotNull
        public static final LevelN2 INSTANCE = new LevelN2();

        private LevelN2() {
            super(-2, 0.466f, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof LevelN2);
        }

        public int hashCode() {
            return 623870069;
        }

        @NotNull
        public String toString() {
            return "LevelN2";
        }
    }

    public /* synthetic */ ZoomLevel(int i, float f, AbstractC5824e abstractC5824e) {
        this(i, f);
    }

    public final int getOrdinal() {
        return this.ordinal;
    }

    public final float getZoomValue() {
        return this.zoomValue;
    }

    private ZoomLevel(int i, float f) {
        this.ordinal = i;
        this.zoomValue = f;
    }
}
