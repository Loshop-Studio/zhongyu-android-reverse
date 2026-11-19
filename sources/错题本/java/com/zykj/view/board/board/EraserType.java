package com.zykj.view.board.board;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, m5110d2 = {"Lcom/zykj/view/board/board/EraserType;", "", "ordinal", "", "size", "", "<init>", "(IF)V", "getOrdinal", "()I", "getSize", "()F", "Little", "Middle", "Large", "Lcom/zykj/view/board/board/EraserType$Large;", "Lcom/zykj/view/board/board/EraserType$Little;", "Lcom/zykj/view/board/board/EraserType$Middle;", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public abstract class EraserType {
    private final int ordinal;
    private final float size;

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/EraserType$Large;", "Lcom/zykj/view/board/board/EraserType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Large extends EraserType {

        @NotNull
        public static final Large INSTANCE = new Large();

        private Large() {
            super(2, 60.0f, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Large);
        }

        public int hashCode() {
            return 1913150441;
        }

        @NotNull
        public String toString() {
            return "Large";
        }
    }

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/EraserType$Little;", "Lcom/zykj/view/board/board/EraserType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Little extends EraserType {

        @NotNull
        public static final Little INSTANCE = new Little();

        private Little() {
            super(0, 20.0f, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Little);
        }

        public int hashCode() {
            return -814417912;
        }

        @NotNull
        public String toString() {
            return "Little";
        }
    }

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/EraserType$Middle;", "Lcom/zykj/view/board/board/EraserType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Middle extends EraserType {

        @NotNull
        public static final Middle INSTANCE = new Middle();

        private Middle() {
            super(1, 40.0f, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Middle);
        }

        public int hashCode() {
            return -786280793;
        }

        @NotNull
        public String toString() {
            return "Middle";
        }
    }

    public /* synthetic */ EraserType(int i, float f, AbstractC5824e abstractC5824e) {
        this(i, f);
    }

    public final int getOrdinal() {
        return this.ordinal;
    }

    public final float getSize() {
        return this.size;
    }

    private EraserType(int i, float f) {
        this.ordinal = i;
        this.size = f;
    }
}
