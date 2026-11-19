package com.zykj.view.board.board;

import android.graphics.Color;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m5110d2 = {"Lcom/zykj/view/board/board/PenColor;", "", "ordinal", "", TypedValues.Custom.S_COLOR, "<init>", "(II)V", "getOrdinal", "()I", "getColor", "ColorCustom", "ColorBlack", "ColorWhite", "ColorRed", "Lcom/zykj/view/board/board/PenColor$ColorBlack;", "Lcom/zykj/view/board/board/PenColor$ColorCustom;", "Lcom/zykj/view/board/board/PenColor$ColorRed;", "Lcom/zykj/view/board/board/PenColor$ColorWhite;", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public abstract class PenColor {
    private final int color;
    private final int ordinal;

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/PenColor$ColorBlack;", "Lcom/zykj/view/board/board/PenColor;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nDataState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataState.kt\ncom/zykj/view/board/board/PenColor$ColorBlack\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,478:1\n404#2:479\n*S KotlinDebug\n*F\n+ 1 DataState.kt\ncom/zykj/view/board/board/PenColor$ColorBlack\n*L\n336#1:479\n*E\n"})
    public static final /* data */ class ColorBlack extends PenColor {

        @NotNull
        public static final ColorBlack INSTANCE = new ColorBlack();

        private ColorBlack() {
            super(1, Color.parseColor("#000000"), null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof ColorBlack);
        }

        public int hashCode() {
            return -1683564406;
        }

        @NotNull
        public String toString() {
            return "ColorBlack";
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m5110d2 = {"Lcom/zykj/view/board/board/PenColor$ColorCustom;", "Lcom/zykj/view/board/board/PenColor;", TypedValues.Custom.S_COLOR, "", "<init>", "(I)V", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class ColorCustom extends PenColor {
        public ColorCustom() {
            this(0, 1, null);
        }

        public ColorCustom(int i) {
            super(0, i, null);
        }

        public /* synthetic */ ColorCustom(int i, int i8, AbstractC5824e abstractC5824e) {
            this((i8 & 1) != 0 ? 0 : i);
        }
    }

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/PenColor$ColorRed;", "Lcom/zykj/view/board/board/PenColor;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nDataState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataState.kt\ncom/zykj/view/board/board/PenColor$ColorRed\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,478:1\n404#2:479\n*S KotlinDebug\n*F\n+ 1 DataState.kt\ncom/zykj/view/board/board/PenColor$ColorRed\n*L\n346#1:479\n*E\n"})
    public static final /* data */ class ColorRed extends PenColor {

        @NotNull
        public static final ColorRed INSTANCE = new ColorRed();

        private ColorRed() {
            super(3, Color.parseColor("#FF4931"), null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof ColorRed);
        }

        public int hashCode() {
            return -774920228;
        }

        @NotNull
        public String toString() {
            return "ColorRed";
        }
    }

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/PenColor$ColorWhite;", "Lcom/zykj/view/board/board/PenColor;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nDataState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataState.kt\ncom/zykj/view/board/board/PenColor$ColorWhite\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,478:1\n404#2:479\n*S KotlinDebug\n*F\n+ 1 DataState.kt\ncom/zykj/view/board/board/PenColor$ColorWhite\n*L\n341#1:479\n*E\n"})
    public static final /* data */ class ColorWhite extends PenColor {

        @NotNull
        public static final ColorWhite INSTANCE = new ColorWhite();

        private ColorWhite() {
            super(2, Color.parseColor("#EEEEEE"), null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof ColorWhite);
        }

        public int hashCode() {
            return -1664281420;
        }

        @NotNull
        public String toString() {
            return "ColorWhite";
        }
    }

    public /* synthetic */ PenColor(int i, int i8, AbstractC5824e abstractC5824e) {
        this(i, i8);
    }

    public final int getColor() {
        return this.color;
    }

    public final int getOrdinal() {
        return this.ordinal;
    }

    private PenColor(int i, int i8) {
        this.ordinal = i;
        this.color = i8;
    }
}
