package com.zykj.view.board.simple;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, m5110d2 = {"Lcom/zykj/view/board/simple/SimplePenSize;", "", "ordinal", "", "size", "", "<init>", "(IF)V", "getOrdinal", "()I", "getSize", "()F", "Little", "Middle", "Large", "Lcom/zykj/view/board/simple/SimplePenSize$Large;", "Lcom/zykj/view/board/simple/SimplePenSize$Little;", "Lcom/zykj/view/board/simple/SimplePenSize$Middle;", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public abstract class SimplePenSize {
    private final int ordinal;
    private final float size;

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m5110d2 = {"Lcom/zykj/view/board/simple/SimplePenSize$Large;", "Lcom/zykj/view/board/simple/SimplePenSize;", "<init>", "()V", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Large extends SimplePenSize {

        @NotNull
        public static final Large INSTANCE = new Large();

        private Large() {
            super(2, 15.0f, null);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m5110d2 = {"Lcom/zykj/view/board/simple/SimplePenSize$Little;", "Lcom/zykj/view/board/simple/SimplePenSize;", "<init>", "()V", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Little extends SimplePenSize {

        @NotNull
        public static final Little INSTANCE = new Little();

        private Little() {
            super(0, 3.0f, null);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m5110d2 = {"Lcom/zykj/view/board/simple/SimplePenSize$Middle;", "Lcom/zykj/view/board/simple/SimplePenSize;", "<init>", "()V", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Middle extends SimplePenSize {

        @NotNull
        public static final Middle INSTANCE = new Middle();

        private Middle() {
            super(1, 8.0f, null);
        }
    }

    public /* synthetic */ SimplePenSize(int i, float f, AbstractC5824e abstractC5824e) {
        this(i, f);
    }

    public final int getOrdinal() {
        return this.ordinal;
    }

    public final float getSize() {
        return this.size;
    }

    private SimplePenSize(int i, float f) {
        this.ordinal = i;
        this.size = f;
    }
}
