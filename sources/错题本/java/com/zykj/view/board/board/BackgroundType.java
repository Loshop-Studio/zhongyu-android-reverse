package com.zykj.view.board.board;

import android.graphics.Color;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0014\u0015\u0016\u0017\u0018\u0019B9\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0006\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, m5110d2 = {"Lcom/zykj/view/board/board/BackgroundType;", "", "ordinal", "", "backgroundColor", "lineType", "Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;", "lineColor", "lineSpace", "", "<init>", "(IILcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;IF)V", "getOrdinal", "()I", "getBackgroundColor", "getLineType", "()Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;", "getLineColor", "getLineSpace", "()F", "ColorWhite", "ColorBlack", "ColorBlue", "ColorGreen", "LineInterweave", "LineHorizontal", "Lcom/zykj/view/board/board/BackgroundType$ColorBlack;", "Lcom/zykj/view/board/board/BackgroundType$ColorBlue;", "Lcom/zykj/view/board/board/BackgroundType$ColorGreen;", "Lcom/zykj/view/board/board/BackgroundType$ColorWhite;", "Lcom/zykj/view/board/board/BackgroundType$LineHorizontal;", "Lcom/zykj/view/board/board/BackgroundType$LineInterweave;", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public abstract class BackgroundType {
    private final int backgroundColor;
    private final int lineColor;
    private final float lineSpace;

    @NotNull
    private final BackgroundLineConfig.BackgroundLineType lineType;
    private final int ordinal;

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/BackgroundType$ColorBlack;", "Lcom/zykj/view/board/board/BackgroundType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nDataState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataState.kt\ncom/zykj/view/board/board/BackgroundType$ColorBlack\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,478:1\n404#2:479\n*S KotlinDebug\n*F\n+ 1 DataState.kt\ncom/zykj/view/board/board/BackgroundType$ColorBlack\n*L\n445#1:479\n*E\n"})
    public static final /* data */ class ColorBlack extends BackgroundType {

        @NotNull
        public static final ColorBlack INSTANCE = new ColorBlack();

        private ColorBlack() {
            super(1, Color.parseColor("#1A1A1A"), null, 0, 0.0f, 28, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof ColorBlack);
        }

        public int hashCode() {
            return -269335924;
        }

        @NotNull
        public String toString() {
            return "ColorBlack";
        }
    }

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/BackgroundType$ColorBlue;", "Lcom/zykj/view/board/board/BackgroundType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nDataState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataState.kt\ncom/zykj/view/board/board/BackgroundType$ColorBlue\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,478:1\n404#2:479\n*S KotlinDebug\n*F\n+ 1 DataState.kt\ncom/zykj/view/board/board/BackgroundType$ColorBlue\n*L\n449#1:479\n*E\n"})
    public static final /* data */ class ColorBlue extends BackgroundType {

        @NotNull
        public static final ColorBlue INSTANCE = new ColorBlue();

        private ColorBlue() {
            super(2, Color.parseColor("#435772"), null, 0, 0.0f, 28, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof ColorBlue);
        }

        public int hashCode() {
            return -2086897619;
        }

        @NotNull
        public String toString() {
            return "ColorBlue";
        }
    }

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/BackgroundType$ColorGreen;", "Lcom/zykj/view/board/board/BackgroundType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nDataState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataState.kt\ncom/zykj/view/board/board/BackgroundType$ColorGreen\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,478:1\n404#2:479\n*S KotlinDebug\n*F\n+ 1 DataState.kt\ncom/zykj/view/board/board/BackgroundType$ColorGreen\n*L\n453#1:479\n*E\n"})
    public static final /* data */ class ColorGreen extends BackgroundType {

        @NotNull
        public static final ColorGreen INSTANCE = new ColorGreen();

        private ColorGreen() {
            super(3, Color.parseColor("#4C7068"), null, 0, 0.0f, 28, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof ColorGreen);
        }

        public int hashCode() {
            return -264535664;
        }

        @NotNull
        public String toString() {
            return "ColorGreen";
        }
    }

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/BackgroundType$ColorWhite;", "Lcom/zykj/view/board/board/BackgroundType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nDataState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataState.kt\ncom/zykj/view/board/board/BackgroundType$ColorWhite\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,478:1\n404#2:479\n*S KotlinDebug\n*F\n+ 1 DataState.kt\ncom/zykj/view/board/board/BackgroundType$ColorWhite\n*L\n441#1:479\n*E\n"})
    public static final /* data */ class ColorWhite extends BackgroundType {

        @NotNull
        public static final ColorWhite INSTANCE = new ColorWhite();

        private ColorWhite() {
            super(0, Color.parseColor("#FFFFFF"), null, 0, 0.0f, 28, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof ColorWhite);
        }

        public int hashCode() {
            return -250052938;
        }

        @NotNull
        public String toString() {
            return "ColorWhite";
        }
    }

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/BackgroundType$LineHorizontal;", "Lcom/zykj/view/board/board/BackgroundType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nDataState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataState.kt\ncom/zykj/view/board/board/BackgroundType$LineHorizontal\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,478:1\n404#2:479\n404#2:480\n*S KotlinDebug\n*F\n+ 1 DataState.kt\ncom/zykj/view/board/board/BackgroundType$LineHorizontal\n*L\n465#1:479\n466#1:480\n*E\n"})
    public static final /* data */ class LineHorizontal extends BackgroundType {

        @NotNull
        public static final LineHorizontal INSTANCE = new LineHorizontal();

        /* JADX WARN: Illegal instructions before constructor call */
        private LineHorizontal() {
            int i = 5;
            super(i, Color.parseColor("#F6F0E8"), BackgroundLineConfig.BackgroundLineType.Horizontal, Color.parseColor("#B0AEAE"), 108.0f, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof LineHorizontal);
        }

        public int hashCode() {
            return 587451240;
        }

        @NotNull
        public String toString() {
            return "LineHorizontal";
        }
    }

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/BackgroundType$LineInterweave;", "Lcom/zykj/view/board/board/BackgroundType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nDataState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataState.kt\ncom/zykj/view/board/board/BackgroundType$LineInterweave\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,478:1\n404#2:479\n404#2:480\n*S KotlinDebug\n*F\n+ 1 DataState.kt\ncom/zykj/view/board/board/BackgroundType$LineInterweave\n*L\n457#1:479\n458#1:480\n*E\n"})
    public static final /* data */ class LineInterweave extends BackgroundType {

        @NotNull
        public static final LineInterweave INSTANCE = new LineInterweave();

        /* JADX WARN: Illegal instructions before constructor call */
        private LineInterweave() {
            int i = 4;
            super(i, Color.parseColor("#F6F0E9"), BackgroundLineConfig.BackgroundLineType.Interweave, Color.parseColor("#B0AEAE"), 64.0f, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof LineInterweave);
        }

        public int hashCode() {
            return 1912067370;
        }

        @NotNull
        public String toString() {
            return "LineInterweave";
        }
    }

    public /* synthetic */ BackgroundType(int i, int i8, BackgroundLineConfig.BackgroundLineType backgroundLineType, int i9, float f, AbstractC5824e abstractC5824e) {
        this(i, i8, backgroundLineType, i9, f);
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getLineColor() {
        return this.lineColor;
    }

    public final float getLineSpace() {
        return this.lineSpace;
    }

    @NotNull
    public final BackgroundLineConfig.BackgroundLineType getLineType() {
        return this.lineType;
    }

    public final int getOrdinal() {
        return this.ordinal;
    }

    private BackgroundType(int i, int i8, BackgroundLineConfig.BackgroundLineType backgroundLineType, int i9, float f) {
        this.ordinal = i;
        this.backgroundColor = i8;
        this.lineType = backgroundLineType;
        this.lineColor = i9;
        this.lineSpace = f;
    }

    public /* synthetic */ BackgroundType(int i, int i8, BackgroundLineConfig.BackgroundLineType backgroundLineType, int i9, float f, int i10, AbstractC5824e abstractC5824e) {
        this(i, (i10 & 2) != 0 ? -1 : i8, (i10 & 4) != 0 ? BackgroundLineConfig.BackgroundLineType.Horizontal : backgroundLineType, (i10 & 8) != 0 ? 0 : i9, (i10 & 16) != 0 ? 64.0f : f, null);
    }
}
