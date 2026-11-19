package com.zykj.blackboard.core.action.newSelectAtion;

import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes4.dex */
public abstract class NewSelectFunctionMode {

    public static final class Color extends NewSelectFunctionMode {
        private final int index;

        public Color(int i10) {
            super(null);
            this.index = i10;
        }

        public final int getIndex() {
            return this.index;
        }
    }

    public static final class Content extends NewSelectFunctionMode {
        public static final Content INSTANCE = new Content();

        private Content() {
            super(null);
        }
    }

    public static abstract class Frame extends NewSelectFunctionMode {

        public static final class Bottom extends Frame {
            public static final Bottom INSTANCE = new Bottom();

            private Bottom() {
                super(null);
            }
        }

        public static final class Left extends Frame {
            public static final Left INSTANCE = new Left();

            private Left() {
                super(null);
            }
        }

        public static final class Right extends Frame {
            public static final Right INSTANCE = new Right();

            private Right() {
                super(null);
            }
        }

        public static final class Top extends Frame {
            public static final Top INSTANCE = new Top();

            private Top() {
                super(null);
            }
        }

        public /* synthetic */ Frame(AbstractC9126n abstractC9126n) {
            this();
        }

        private Frame() {
            super(null);
        }
    }

    public static final class Function extends NewSelectFunctionMode {
        private final int index;

        public Function(int i10) {
            super(null);
            this.index = i10;
        }

        public final int getIndex() {
            return this.index;
        }
    }

    public static final class GeometryPoint extends NewSelectFunctionMode {
        public static final GeometryPoint INSTANCE = new GeometryPoint();

        private GeometryPoint() {
            super(null);
        }
    }

    public static final class Nothing extends NewSelectFunctionMode {
        public static final Nothing INSTANCE = new Nothing();

        private Nothing() {
            super(null);
        }
    }

    public static final class Rotate extends NewSelectFunctionMode {
        public static final Rotate INSTANCE = new Rotate();

        private Rotate() {
            super(null);
        }
    }

    public static final class Scale extends NewSelectFunctionMode {
        public static final Scale INSTANCE = new Scale();

        private Scale() {
            super(null);
        }
    }

    public static abstract class TextSize extends NewSelectFunctionMode {

        public static final class Add extends TextSize {
            public static final Add INSTANCE = new Add();

            private Add() {
                super(null);
            }
        }

        public static final class Reduce extends TextSize {
            public static final Reduce INSTANCE = new Reduce();

            private Reduce() {
                super(null);
            }
        }

        public /* synthetic */ TextSize(AbstractC9126n abstractC9126n) {
            this();
        }

        private TextSize() {
            super(null);
        }
    }

    public static final class WriteSize extends NewSelectFunctionMode {
        private final int index;

        public WriteSize(int i10) {
            super(null);
            this.index = i10;
        }

        public final int getIndex() {
            return this.index;
        }
    }

    public /* synthetic */ NewSelectFunctionMode(AbstractC9126n abstractC9126n) {
        this();
    }

    private NewSelectFunctionMode() {
    }
}
