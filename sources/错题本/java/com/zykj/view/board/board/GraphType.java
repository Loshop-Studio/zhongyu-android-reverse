package com.zykj.view.board.board;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.core.action.GeometryActionEnum;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\r\u000e\u000f\u0010B1\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0004\u0011\u0012\u0013\u0014¨\u0006\u0015"}, m5110d2 = {"Lcom/zykj/view/board/board/GraphType;", "", "isRectangleChecked", "", "isOvalChecked", "isTriangleChecked", "geometryActionEnum", "Lcom/zykj/blackboard/core/action/GeometryActionEnum;", "<init>", "(ZZZLcom/zykj/blackboard/core/action/GeometryActionEnum;)V", "()Z", "getGeometryActionEnum", "()Lcom/zykj/blackboard/core/action/GeometryActionEnum;", "Rectangle", "Oval", "Triangle", "Null", "Lcom/zykj/view/board/board/GraphType$Null;", "Lcom/zykj/view/board/board/GraphType$Oval;", "Lcom/zykj/view/board/board/GraphType$Rectangle;", "Lcom/zykj/view/board/board/GraphType$Triangle;", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public abstract class GraphType {

    @NotNull
    private final GeometryActionEnum geometryActionEnum;
    private final boolean isOvalChecked;
    private final boolean isRectangleChecked;
    private final boolean isTriangleChecked;

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/GraphType$Null;", "Lcom/zykj/view/board/board/GraphType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Null extends GraphType {

        @NotNull
        public static final Null INSTANCE = new Null();

        private Null() {
            super(false, false, false, null, 15, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Null);
        }

        public int hashCode() {
            return 15832195;
        }

        @NotNull
        public String toString() {
            return "Null";
        }
    }

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/GraphType$Oval;", "Lcom/zykj/view/board/board/GraphType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Oval extends GraphType {

        @NotNull
        public static final Oval INSTANCE = new Oval();

        private Oval() {
            super(false, true, false, GeometryActionEnum.OVAL, 5, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Oval);
        }

        public int hashCode() {
            return 15862606;
        }

        @NotNull
        public String toString() {
            return "Oval";
        }
    }

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/GraphType$Rectangle;", "Lcom/zykj/view/board/board/GraphType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Rectangle extends GraphType {

        @NotNull
        public static final Rectangle INSTANCE = new Rectangle();

        private Rectangle() {
            super(true, false, false, GeometryActionEnum.RECTANGLE, 6, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Rectangle);
        }

        public int hashCode() {
            return 1687018483;
        }

        @NotNull
        public String toString() {
            return "Rectangle";
        }
    }

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m5110d2 = {"Lcom/zykj/view/board/board/GraphType$Triangle;", "Lcom/zykj/view/board/board/GraphType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Triangle extends GraphType {

        @NotNull
        public static final Triangle INSTANCE = new Triangle();

        private Triangle() {
            super(false, false, true, GeometryActionEnum.TRIANGLE, 3, null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Triangle);
        }

        public int hashCode() {
            return 407632644;
        }

        @NotNull
        public String toString() {
            return "Triangle";
        }
    }

    public /* synthetic */ GraphType(boolean z8, boolean z9, boolean z10, GeometryActionEnum geometryActionEnum, AbstractC5824e abstractC5824e) {
        this(z8, z9, z10, geometryActionEnum);
    }

    @NotNull
    public final GeometryActionEnum getGeometryActionEnum() {
        return this.geometryActionEnum;
    }

    /* renamed from: isOvalChecked, reason: from getter */
    public final boolean getIsOvalChecked() {
        return this.isOvalChecked;
    }

    /* renamed from: isRectangleChecked, reason: from getter */
    public final boolean getIsRectangleChecked() {
        return this.isRectangleChecked;
    }

    /* renamed from: isTriangleChecked, reason: from getter */
    public final boolean getIsTriangleChecked() {
        return this.isTriangleChecked;
    }

    private GraphType(boolean z8, boolean z9, boolean z10, GeometryActionEnum geometryActionEnum) {
        this.isRectangleChecked = z8;
        this.isOvalChecked = z9;
        this.isTriangleChecked = z10;
        this.geometryActionEnum = geometryActionEnum;
    }

    public /* synthetic */ GraphType(boolean z8, boolean z9, boolean z10, GeometryActionEnum geometryActionEnum, int i, AbstractC5824e abstractC5824e) {
        this((i & 1) != 0 ? false : z8, (i & 2) != 0 ? false : z9, (i & 4) != 0 ? false : z10, (i & 8) != 0 ? GeometryActionEnum.RECTANGLE : geometryActionEnum, null);
    }
}
