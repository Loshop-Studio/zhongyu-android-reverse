package com.zykj.blackboard.core.action.newSelectAtion;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000b\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u000b\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;", "", "()V", "Color", "Content", "Frame", "Function", "FunctionRectF", "GeometryPoint", "Nothing", "Rotate", "Scale", "TextSize", "WriteSize", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Color;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Content;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Frame;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Function;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$FunctionRectF;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$GeometryPoint;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Nothing;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Rotate;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Scale;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$TextSize;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$WriteSize;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public abstract class NewSelectFunctionMode {

    @Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Color;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;", "index", "", "(I)V", "getIndex", "()I", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Color extends NewSelectFunctionMode {
        private final int index;

        public Color(int i) {
            super(null);
            this.index = i;
        }

        public final int getIndex() {
            return this.index;
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Content;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;", "()V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Content extends NewSelectFunctionMode {

        @NotNull
        public static final Content INSTANCE = new Content();

        private Content() {
            super(null);
        }
    }

    @Metadata(m5109d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Frame;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;", "()V", "Bottom", "Left", "Right", "Top", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Frame$Bottom;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Frame$Left;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Frame$Right;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Frame$Top;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static abstract class Frame extends NewSelectFunctionMode {

        @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Frame$Bottom;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Frame;", "()V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final class Bottom extends Frame {

            @NotNull
            public static final Bottom INSTANCE = new Bottom();

            private Bottom() {
                super(null);
            }
        }

        @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Frame$Left;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Frame;", "()V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final class Left extends Frame {

            @NotNull
            public static final Left INSTANCE = new Left();

            private Left() {
                super(null);
            }
        }

        @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Frame$Right;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Frame;", "()V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final class Right extends Frame {

            @NotNull
            public static final Right INSTANCE = new Right();

            private Right() {
                super(null);
            }
        }

        @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Frame$Top;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Frame;", "()V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final class Top extends Frame {

            @NotNull
            public static final Top INSTANCE = new Top();

            private Top() {
                super(null);
            }
        }

        public /* synthetic */ Frame(AbstractC5824e abstractC5824e) {
            this();
        }

        private Frame() {
            super(null);
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Function;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;", "index", "", "(I)V", "getIndex", "()I", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Function extends NewSelectFunctionMode {
        private final int index;

        public Function(int i) {
            super(null);
            this.index = i;
        }

        public final int getIndex() {
            return this.index;
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$FunctionRectF;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;", "()V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class FunctionRectF extends NewSelectFunctionMode {

        @NotNull
        public static final FunctionRectF INSTANCE = new FunctionRectF();

        private FunctionRectF() {
            super(null);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$GeometryPoint;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;", "()V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class GeometryPoint extends NewSelectFunctionMode {

        @NotNull
        public static final GeometryPoint INSTANCE = new GeometryPoint();

        private GeometryPoint() {
            super(null);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Nothing;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;", "()V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Nothing extends NewSelectFunctionMode {

        @NotNull
        public static final Nothing INSTANCE = new Nothing();

        private Nothing() {
            super(null);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Rotate;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;", "()V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Rotate extends NewSelectFunctionMode {

        @NotNull
        public static final Rotate INSTANCE = new Rotate();

        private Rotate() {
            super(null);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$Scale;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;", "()V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Scale extends NewSelectFunctionMode {

        @NotNull
        public static final Scale INSTANCE = new Scale();

        private Scale() {
            super(null);
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$TextSize;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;", "()V", "Add", "Reduce", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$TextSize$Add;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$TextSize$Reduce;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static abstract class TextSize extends NewSelectFunctionMode {

        @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$TextSize$Add;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$TextSize;", "()V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final class Add extends TextSize {

            @NotNull
            public static final Add INSTANCE = new Add();

            private Add() {
                super(null);
            }
        }

        @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$TextSize$Reduce;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$TextSize;", "()V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final class Reduce extends TextSize {

            @NotNull
            public static final Reduce INSTANCE = new Reduce();

            private Reduce() {
                super(null);
            }
        }

        public /* synthetic */ TextSize(AbstractC5824e abstractC5824e) {
            this();
        }

        private TextSize() {
            super(null);
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode$WriteSize;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionMode;", "index", "", "(I)V", "getIndex", "()I", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class WriteSize extends NewSelectFunctionMode {
        private final int index;

        public WriteSize(int i) {
            super(null);
            this.index = i;
        }

        public final int getIndex() {
            return this.index;
        }
    }

    public /* synthetic */ NewSelectFunctionMode(AbstractC5824e abstractC5824e) {
        this();
    }

    private NewSelectFunctionMode() {
    }
}
