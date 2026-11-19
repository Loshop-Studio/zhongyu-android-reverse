package com.zykj.blackboard.core.action.newSelectAtion;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\f\r\u000e\u000f\u0010\u0011\u0012B\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0007\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;", "", "text", "", "isSelected", "", "(Ljava/lang/String;Z)V", "()Z", "setSelected", "(Z)V", "getText", "()Ljava/lang/String;", "Delete", "GeometryStroke", "ImageCrop", "Rotate", "Scale", "TextEdit", "WriteEdit", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Delete;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$GeometryStroke;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$ImageCrop;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Rotate;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Scale;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$TextEdit;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public abstract class NewSelectFunctionType {
    private boolean isSelected;

    @NotNull
    private final String text;

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Delete;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;", "()V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Delete extends NewSelectFunctionType {

        @NotNull
        public static final Delete INSTANCE = new Delete();

        private Delete() {
            super("删除", false, 2, null);
        }
    }

    @Metadata(m5109d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$GeometryStroke;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;", "isSingle", "", "colorList", "", "Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;", "(ZLjava/util/List;)V", "getColorList", "()Ljava/util/List;", "setColorList", "(Ljava/util/List;)V", "()Z", "setSingle", "(Z)V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class GeometryStroke extends NewSelectFunctionType {

        @NotNull
        private List<? extends SelectColor> colorList;
        private boolean isSingle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GeometryStroke(boolean z8, @NotNull List<? extends SelectColor> colorList) {
            super("边框", false, 2, null);
            AbstractC5830k.m5330g(colorList, "colorList");
            this.isSingle = z8;
            this.colorList = colorList;
        }

        @NotNull
        public final List<SelectColor> getColorList() {
            return this.colorList;
        }

        /* renamed from: isSingle, reason: from getter */
        public final boolean getIsSingle() {
            return this.isSingle;
        }

        public final void setColorList(@NotNull List<? extends SelectColor> list) {
            AbstractC5830k.m5330g(list, "<set-?>");
            this.colorList = list;
        }

        public final void setSingle(boolean z8) {
            this.isSingle = z8;
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$ImageCrop;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;", "()V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class ImageCrop extends NewSelectFunctionType {
        public ImageCrop() {
            super("裁剪", false, 2, null);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Rotate;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;", "()V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Rotate extends NewSelectFunctionType {

        @NotNull
        public static final Rotate INSTANCE = new Rotate();

        private Rotate() {
            super("", false, 2, null);
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$Scale;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;", "()V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Scale extends NewSelectFunctionType {

        @NotNull
        public static final Scale INSTANCE = new Scale();

        private Scale() {
            super("", false, 2, null);
        }
    }

    @Metadata(m5109d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$TextEdit;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;", "isSingle", "", "colorList", "", "Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;", "(ZLjava/util/List;)V", "getColorList", "()Ljava/util/List;", "setColorList", "(Ljava/util/List;)V", "()Z", "setSingle", "(Z)V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class TextEdit extends NewSelectFunctionType {

        @NotNull
        private List<? extends SelectColor> colorList;
        private boolean isSingle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TextEdit(boolean z8, @NotNull List<? extends SelectColor> colorList) {
            super("编辑", false, 2, null);
            AbstractC5830k.m5330g(colorList, "colorList");
            this.isSingle = z8;
            this.colorList = colorList;
        }

        @NotNull
        public final List<SelectColor> getColorList() {
            return this.colorList;
        }

        /* renamed from: isSingle, reason: from getter */
        public final boolean getIsSingle() {
            return this.isSingle;
        }

        public final void setColorList(@NotNull List<? extends SelectColor> list) {
            AbstractC5830k.m5330g(list, "<set-?>");
            this.colorList = list;
        }

        public final void setSingle(boolean z8) {
            this.isSingle = z8;
        }
    }

    @Metadata(m5109d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType$WriteEdit;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;", "isHighlighter", "", "width", "", "colorList", "", "Lcom/zykj/blackboard/core/action/newSelectAtion/SelectColor;", "(ZFLjava/util/List;)V", "getColorList", "()Ljava/util/List;", "setColorList", "(Ljava/util/List;)V", "()Z", "setHighlighter", "(Z)V", "getWidth", "()F", "setWidth", "(F)V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class WriteEdit extends NewSelectFunctionType {

        @NotNull
        private List<? extends SelectColor> colorList;
        private boolean isHighlighter;
        private float width;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WriteEdit(boolean z8, float f, @NotNull List<? extends SelectColor> colorList) {
            super("编辑", false, 2, null);
            AbstractC5830k.m5330g(colorList, "colorList");
            this.isHighlighter = z8;
            this.width = f;
            this.colorList = colorList;
        }

        @NotNull
        public final List<SelectColor> getColorList() {
            return this.colorList;
        }

        public final float getWidth() {
            return this.width;
        }

        /* renamed from: isHighlighter, reason: from getter */
        public final boolean getIsHighlighter() {
            return this.isHighlighter;
        }

        public final void setColorList(@NotNull List<? extends SelectColor> list) {
            AbstractC5830k.m5330g(list, "<set-?>");
            this.colorList = list;
        }

        public final void setHighlighter(boolean z8) {
            this.isHighlighter = z8;
        }

        public final void setWidth(float f) {
            this.width = f;
        }
    }

    public /* synthetic */ NewSelectFunctionType(String str, boolean z8, AbstractC5824e abstractC5824e) {
        this(str, z8);
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    /* renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z8) {
        this.isSelected = z8;
    }

    private NewSelectFunctionType(String str, boolean z8) {
        this.text = str;
        this.isSelected = z8;
    }

    public /* synthetic */ NewSelectFunctionType(String str, boolean z8, int i, AbstractC5824e abstractC5824e) {
        this(str, (i & 2) != 0 ? false : z8, null);
    }
}
