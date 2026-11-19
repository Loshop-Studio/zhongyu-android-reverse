package com.zykj.view.board.board;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.board.EzyModeEnum$ModeEnum;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5824e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0017\u0018\u0019\u001a\u001bB=\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u0082\u0001\u0005\u001c\u001d\u001e\u001f ¨\u0006!"}, m5110d2 = {"Lcom/zykj/view/board/board/PenType;", "", "ordinal", "", "mode", "Lcom/zykj/board/EzyModeEnum$ModeEnum;", "isDotted", "", "paintWidthList", "", "", "paintColorAlpha", "<init>", "(ILcom/zykj/board/EzyModeEnum$ModeEnum;ZLjava/util/List;F)V", "getOrdinal", "()I", "getMode", "()Lcom/zykj/board/EzyModeEnum$ModeEnum;", "()Z", "getPaintWidthList", "()Ljava/util/List;", "getPaintColorAlpha", "()F", TypedValues.Custom.NAME, "Line", "DottedLine", "Highlighter", "Cursor", "Lcom/zykj/view/board/board/PenType$Cursor;", "Lcom/zykj/view/board/board/PenType$Custom;", "Lcom/zykj/view/board/board/PenType$DottedLine;", "Lcom/zykj/view/board/board/PenType$Highlighter;", "Lcom/zykj/view/board/board/PenType$Line;", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public abstract class PenType {
    private final boolean isDotted;

    @NotNull
    private final EzyModeEnum$ModeEnum mode;
    private final int ordinal;
    private final float paintColorAlpha;

    @NotNull
    private final List<Float> paintWidthList;

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/PenType$Cursor;", "Lcom/zykj/view/board/board/PenType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Cursor extends PenType {

        @NotNull
        public static final Cursor INSTANCE = new Cursor();

        private Cursor() {
            super(4, EzyModeEnum$ModeEnum.ACTION_CURSOR, false, null, 0.0f, 28, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Cursor);
        }

        public int hashCode() {
            return 1769350183;
        }

        @NotNull
        public String toString() {
            return "Cursor";
        }
    }

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/PenType$Custom;", "Lcom/zykj/view/board/board/PenType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Custom extends PenType {

        @NotNull
        public static final Custom INSTANCE = new Custom();

        private Custom() {
            super(0, EzyModeEnum$ModeEnum.ACTION_WRITING, false, null, 0.0f, 28, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Custom);
        }

        public int hashCode() {
            return 1769380930;
        }

        @NotNull
        public String toString() {
            return TypedValues.Custom.NAME;
        }
    }

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/PenType$DottedLine;", "Lcom/zykj/view/board/board/PenType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class DottedLine extends PenType {

        @NotNull
        public static final DottedLine INSTANCE = new DottedLine();

        private DottedLine() {
            super(2, EzyModeEnum$ModeEnum.ACTION_WRITING_BEELINE, true, null, 0.0f, 24, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof DottedLine);
        }

        public int hashCode() {
            return 697272719;
        }

        @NotNull
        public String toString() {
            return "DottedLine";
        }
    }

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/PenType$Highlighter;", "Lcom/zykj/view/board/board/PenType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Highlighter extends PenType {

        @NotNull
        public static final Highlighter INSTANCE = new Highlighter();

        private Highlighter() {
            super(3, EzyModeEnum$ModeEnum.ACTION_WRITING, false, AbstractC5806u.m5287z(Float.valueOf(28.0f), Float.valueOf(36.0f), Float.valueOf(56.0f)), 0.5f, 4, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Highlighter);
        }

        public int hashCode() {
            return -1199307216;
        }

        @NotNull
        public String toString() {
            return "Highlighter";
        }
    }

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/PenType$Line;", "Lcom/zykj/view/board/board/PenType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Line extends PenType {

        @NotNull
        public static final Line INSTANCE = new Line();

        private Line() {
            super(1, EzyModeEnum$ModeEnum.ACTION_WRITING_BEELINE, false, null, 0.0f, 28, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Line);
        }

        public int hashCode() {
            return -1580023547;
        }

        @NotNull
        public String toString() {
            return "Line";
        }
    }

    public /* synthetic */ PenType(int i, EzyModeEnum$ModeEnum ezyModeEnum$ModeEnum, boolean z8, List list, float f, AbstractC5824e abstractC5824e) {
        this(i, ezyModeEnum$ModeEnum, z8, list, f);
    }

    @NotNull
    public final EzyModeEnum$ModeEnum getMode() {
        return this.mode;
    }

    public final int getOrdinal() {
        return this.ordinal;
    }

    public final float getPaintColorAlpha() {
        return this.paintColorAlpha;
    }

    @NotNull
    public final List<Float> getPaintWidthList() {
        return this.paintWidthList;
    }

    /* renamed from: isDotted, reason: from getter */
    public final boolean getIsDotted() {
        return this.isDotted;
    }

    private PenType(int i, EzyModeEnum$ModeEnum ezyModeEnum$ModeEnum, boolean z8, List<Float> list, float f) {
        this.ordinal = i;
        this.mode = ezyModeEnum$ModeEnum;
        this.isDotted = z8;
        this.paintWidthList = list;
        this.paintColorAlpha = f;
    }

    public /* synthetic */ PenType(int i, EzyModeEnum$ModeEnum ezyModeEnum$ModeEnum, boolean z8, List list, float f, int i8, AbstractC5824e abstractC5824e) {
        this(i, ezyModeEnum$ModeEnum, (i8 & 4) != 0 ? false : z8, (i8 & 8) != 0 ? AbstractC5806u.m5287z(Float.valueOf(3.0f), Float.valueOf(8.0f), Float.valueOf(15.0f)) : list, (i8 & 16) != 0 ? 1.0f : f, null);
    }
}
