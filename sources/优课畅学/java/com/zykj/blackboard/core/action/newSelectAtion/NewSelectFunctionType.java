package com.zykj.blackboard.core.action.newSelectAtion;

import kotlin.jvm.internal.AbstractC9126n;

/* loaded from: classes4.dex */
public abstract class NewSelectFunctionType {
    private boolean isSelected;
    private final String text;

    public static final class Delete extends NewSelectFunctionType {
        public static final Delete INSTANCE = new Delete();

        private Delete() {
            super("删除", false, 2, null);
        }
    }

    public static final class GeometryStroke extends NewSelectFunctionType {
        private int color;
        private boolean isSingle;

        public GeometryStroke(boolean z10, int i10) {
            super("边框", false, 2, null);
            this.isSingle = z10;
            this.color = i10;
        }

        public final int getColor() {
            return this.color;
        }

        public final boolean isSingle() {
            return this.isSingle;
        }

        public final void setColor(int i10) {
            this.color = i10;
        }

        public final void setSingle(boolean z10) {
            this.isSingle = z10;
        }
    }

    public static final class ImageCrop extends NewSelectFunctionType {
        public ImageCrop() {
            super("裁剪", false, 2, null);
        }
    }

    public static final class Rotate extends NewSelectFunctionType {
        public static final Rotate INSTANCE = new Rotate();

        private Rotate() {
            super("", false, 2, null);
        }
    }

    public static final class Scale extends NewSelectFunctionType {
        public static final Scale INSTANCE = new Scale();

        private Scale() {
            super("", false, 2, null);
        }
    }

    public static final class TextEdit extends NewSelectFunctionType {
        private int color;
        private boolean isSingle;

        public TextEdit(boolean z10, int i10) {
            super("编辑", false, 2, null);
            this.isSingle = z10;
            this.color = i10;
        }

        public final int getColor() {
            return this.color;
        }

        public final boolean isSingle() {
            return this.isSingle;
        }

        public final void setColor(int i10) {
            this.color = i10;
        }

        public final void setSingle(boolean z10) {
            this.isSingle = z10;
        }
    }

    public static final class WriteEdit extends NewSelectFunctionType {
        private int color;
        private boolean isHighlighter;
        private float width;

        public WriteEdit(boolean z10, float f10, int i10) {
            super("编辑", false, 2, null);
            this.isHighlighter = z10;
            this.width = f10;
            this.color = i10;
        }

        public final int getColor() {
            return this.color;
        }

        public final float getWidth() {
            return this.width;
        }

        public final boolean isHighlighter() {
            return this.isHighlighter;
        }

        public final void setColor(int i10) {
            this.color = i10;
        }

        public final void setHighlighter(boolean z10) {
            this.isHighlighter = z10;
        }

        public final void setWidth(float f10) {
            this.width = f10;
        }
    }

    public /* synthetic */ NewSelectFunctionType(String str, boolean z10, AbstractC9126n abstractC9126n) {
        this(str, z10);
    }

    public final String getText() {
        return this.text;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z10) {
        this.isSelected = z10;
    }

    private NewSelectFunctionType(String str, boolean z10) {
        this.text = str;
        this.isSelected = z10;
    }

    public /* synthetic */ NewSelectFunctionType(String str, boolean z10, int i10, AbstractC9126n abstractC9126n) {
        this(str, (i10 & 2) != 0 ? false : z10, null);
    }
}
