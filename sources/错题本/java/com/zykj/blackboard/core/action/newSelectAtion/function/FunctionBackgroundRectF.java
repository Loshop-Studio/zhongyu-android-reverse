package com.zykj.blackboard.core.action.newSelectAtion.function;

import android.graphics.RectF;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001c"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;", "", "editRectF", "Landroid/graphics/RectF;", "writeStrokeRectF", "textSizeRectF", "colorRectF", "customColorRectF", "(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;)V", "getColorRectF", "()Landroid/graphics/RectF;", "getCustomColorRectF", "getEditRectF", "getTextSizeRectF", "getWriteStrokeRectF", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class FunctionBackgroundRectF {

    @NotNull
    private final RectF colorRectF;

    @NotNull
    private final RectF customColorRectF;

    @NotNull
    private final RectF editRectF;

    @NotNull
    private final RectF textSizeRectF;

    @NotNull
    private final RectF writeStrokeRectF;

    public FunctionBackgroundRectF() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ FunctionBackgroundRectF copy$default(FunctionBackgroundRectF functionBackgroundRectF, RectF rectF, RectF rectF2, RectF rectF3, RectF rectF4, RectF rectF5, int i, Object obj) {
        if ((i & 1) != 0) {
            rectF = functionBackgroundRectF.editRectF;
        }
        if ((i & 2) != 0) {
            rectF2 = functionBackgroundRectF.writeStrokeRectF;
        }
        if ((i & 4) != 0) {
            rectF3 = functionBackgroundRectF.textSizeRectF;
        }
        if ((i & 8) != 0) {
            rectF4 = functionBackgroundRectF.colorRectF;
        }
        if ((i & 16) != 0) {
            rectF5 = functionBackgroundRectF.customColorRectF;
        }
        RectF rectF6 = rectF5;
        RectF rectF7 = rectF3;
        return functionBackgroundRectF.copy(rectF, rectF2, rectF7, rectF4, rectF6);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final RectF getEditRectF() {
        return this.editRectF;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final RectF getWriteStrokeRectF() {
        return this.writeStrokeRectF;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final RectF getTextSizeRectF() {
        return this.textSizeRectF;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final RectF getColorRectF() {
        return this.colorRectF;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final RectF getCustomColorRectF() {
        return this.customColorRectF;
    }

    @NotNull
    public final FunctionBackgroundRectF copy(@NotNull RectF editRectF, @NotNull RectF writeStrokeRectF, @NotNull RectF textSizeRectF, @NotNull RectF colorRectF, @NotNull RectF customColorRectF) {
        AbstractC5830k.m5330g(editRectF, "editRectF");
        AbstractC5830k.m5330g(writeStrokeRectF, "writeStrokeRectF");
        AbstractC5830k.m5330g(textSizeRectF, "textSizeRectF");
        AbstractC5830k.m5330g(colorRectF, "colorRectF");
        AbstractC5830k.m5330g(customColorRectF, "customColorRectF");
        return new FunctionBackgroundRectF(editRectF, writeStrokeRectF, textSizeRectF, colorRectF, customColorRectF);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FunctionBackgroundRectF)) {
            return false;
        }
        FunctionBackgroundRectF functionBackgroundRectF = (FunctionBackgroundRectF) other;
        return AbstractC5830k.m5325b(this.editRectF, functionBackgroundRectF.editRectF) && AbstractC5830k.m5325b(this.writeStrokeRectF, functionBackgroundRectF.writeStrokeRectF) && AbstractC5830k.m5325b(this.textSizeRectF, functionBackgroundRectF.textSizeRectF) && AbstractC5830k.m5325b(this.colorRectF, functionBackgroundRectF.colorRectF) && AbstractC5830k.m5325b(this.customColorRectF, functionBackgroundRectF.customColorRectF);
    }

    @NotNull
    public final RectF getColorRectF() {
        return this.colorRectF;
    }

    @NotNull
    public final RectF getCustomColorRectF() {
        return this.customColorRectF;
    }

    @NotNull
    public final RectF getEditRectF() {
        return this.editRectF;
    }

    @NotNull
    public final RectF getTextSizeRectF() {
        return this.textSizeRectF;
    }

    @NotNull
    public final RectF getWriteStrokeRectF() {
        return this.writeStrokeRectF;
    }

    public int hashCode() {
        return this.customColorRectF.hashCode() + ((this.colorRectF.hashCode() + ((this.textSizeRectF.hashCode() + ((this.writeStrokeRectF.hashCode() + (this.editRectF.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "FunctionBackgroundRectF(editRectF=" + this.editRectF + ", writeStrokeRectF=" + this.writeStrokeRectF + ", textSizeRectF=" + this.textSizeRectF + ", colorRectF=" + this.colorRectF + ", customColorRectF=" + this.customColorRectF + ')';
    }

    public FunctionBackgroundRectF(@NotNull RectF editRectF, @NotNull RectF writeStrokeRectF, @NotNull RectF textSizeRectF, @NotNull RectF colorRectF, @NotNull RectF customColorRectF) {
        AbstractC5830k.m5330g(editRectF, "editRectF");
        AbstractC5830k.m5330g(writeStrokeRectF, "writeStrokeRectF");
        AbstractC5830k.m5330g(textSizeRectF, "textSizeRectF");
        AbstractC5830k.m5330g(colorRectF, "colorRectF");
        AbstractC5830k.m5330g(customColorRectF, "customColorRectF");
        this.editRectF = editRectF;
        this.writeStrokeRectF = writeStrokeRectF;
        this.textSizeRectF = textSizeRectF;
        this.colorRectF = colorRectF;
        this.customColorRectF = customColorRectF;
    }

    public /* synthetic */ FunctionBackgroundRectF(RectF rectF, RectF rectF2, RectF rectF3, RectF rectF4, RectF rectF5, int i, AbstractC5824e abstractC5824e) {
        this((i & 1) != 0 ? new RectF() : rectF, (i & 2) != 0 ? new RectF() : rectF2, (i & 4) != 0 ? new RectF() : rectF3, (i & 8) != 0 ? new RectF() : rectF4, (i & 16) != 0 ? new RectF() : rectF5);
    }
}
