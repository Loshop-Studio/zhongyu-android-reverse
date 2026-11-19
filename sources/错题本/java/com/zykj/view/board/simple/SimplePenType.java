package com.zykj.view.board.simple;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\r\u000e\u000fB#\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, m5110d2 = {"Lcom/zykj/view/board/simple/SimplePenType;", "", "ordinal", "", "mode", "isPenDashed", "", "<init>", "(IIZ)V", "getOrdinal", "()I", "getMode", "()Z", TypedValues.Custom.NAME, "Line", "DottedLine", "Lcom/zykj/view/board/simple/SimplePenType$Custom;", "Lcom/zykj/view/board/simple/SimplePenType$DottedLine;", "Lcom/zykj/view/board/simple/SimplePenType$Line;", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public abstract class SimplePenType {
    private final boolean isPenDashed;
    private final int mode;
    private final int ordinal;

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m5110d2 = {"Lcom/zykj/view/board/simple/SimplePenType$Custom;", "Lcom/zykj/view/board/simple/SimplePenType;", "<init>", "()V", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Custom extends SimplePenType {

        @NotNull
        public static final Custom INSTANCE = new Custom();

        private Custom() {
            super(0, 0, false, 4, null);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m5110d2 = {"Lcom/zykj/view/board/simple/SimplePenType$DottedLine;", "Lcom/zykj/view/board/simple/SimplePenType;", "<init>", "()V", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DottedLine extends SimplePenType {

        @NotNull
        public static final DottedLine INSTANCE = new DottedLine();

        private DottedLine() {
            super(2, 1, 1 == true ? 1 : 0, null);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m5110d2 = {"Lcom/zykj/view/board/simple/SimplePenType$Line;", "Lcom/zykj/view/board/simple/SimplePenType;", "<init>", "()V", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Line extends SimplePenType {

        @NotNull
        public static final Line INSTANCE = new Line();

        private Line() {
            super(1, 1, false, 4, null);
        }
    }

    public /* synthetic */ SimplePenType(int i, int i8, boolean z8, AbstractC5824e abstractC5824e) {
        this(i, i8, z8);
    }

    public final int getMode() {
        return this.mode;
    }

    public final int getOrdinal() {
        return this.ordinal;
    }

    /* renamed from: isPenDashed, reason: from getter */
    public final boolean getIsPenDashed() {
        return this.isPenDashed;
    }

    private SimplePenType(int i, int i8, boolean z8) {
        this.ordinal = i;
        this.mode = i8;
        this.isPenDashed = z8;
    }

    public /* synthetic */ SimplePenType(int i, int i8, boolean z8, int i9, AbstractC5824e abstractC5824e) {
        this(i, i8, (i9 & 4) != 0 ? false : z8, null);
    }
}
