package com.zykj.blackboard.core.action.newSelectAtion.function;

import android.graphics.RectF;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u0019\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u008d\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u00062\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001R!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R!\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006."}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;", "", RequestParameters.SUBRESOURCE_DELETE, "Landroid/graphics/RectF;", "colorList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "customColor", "writeEdit", "writeStrokeWidthList", "textEdit", "textSizeReduce", "textSizeAdd", "geometryStroke", "imageCrop", "(Landroid/graphics/RectF;Ljava/util/ArrayList;Landroid/graphics/RectF;Landroid/graphics/RectF;Ljava/util/ArrayList;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/RectF;)V", "getColorList", "()Ljava/util/ArrayList;", "getCustomColor", "()Landroid/graphics/RectF;", "getDelete", "getGeometryStroke", "getImageCrop", "getTextEdit", "getTextSizeAdd", "getTextSizeReduce", "getWriteEdit", "getWriteStrokeWidthList", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class FunctionRectF {

    @NotNull
    private final ArrayList<RectF> colorList;

    @NotNull
    private final RectF customColor;

    @NotNull
    private final RectF delete;

    @NotNull
    private final RectF geometryStroke;

    @NotNull
    private final RectF imageCrop;

    @NotNull
    private final RectF textEdit;

    @NotNull
    private final RectF textSizeAdd;

    @NotNull
    private final RectF textSizeReduce;

    @NotNull
    private final RectF writeEdit;

    @NotNull
    private final ArrayList<RectF> writeStrokeWidthList;

    public FunctionRectF() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public static /* synthetic */ FunctionRectF copy$default(FunctionRectF functionRectF, RectF rectF, ArrayList arrayList, RectF rectF2, RectF rectF3, ArrayList arrayList2, RectF rectF4, RectF rectF5, RectF rectF6, RectF rectF7, RectF rectF8, int i, Object obj) {
        if ((i & 1) != 0) {
            rectF = functionRectF.delete;
        }
        if ((i & 2) != 0) {
            arrayList = functionRectF.colorList;
        }
        if ((i & 4) != 0) {
            rectF2 = functionRectF.customColor;
        }
        if ((i & 8) != 0) {
            rectF3 = functionRectF.writeEdit;
        }
        if ((i & 16) != 0) {
            arrayList2 = functionRectF.writeStrokeWidthList;
        }
        if ((i & 32) != 0) {
            rectF4 = functionRectF.textEdit;
        }
        if ((i & 64) != 0) {
            rectF5 = functionRectF.textSizeReduce;
        }
        if ((i & 128) != 0) {
            rectF6 = functionRectF.textSizeAdd;
        }
        if ((i & 256) != 0) {
            rectF7 = functionRectF.geometryStroke;
        }
        if ((i & 512) != 0) {
            rectF8 = functionRectF.imageCrop;
        }
        RectF rectF9 = rectF7;
        RectF rectF10 = rectF8;
        RectF rectF11 = rectF5;
        RectF rectF12 = rectF6;
        ArrayList arrayList3 = arrayList2;
        RectF rectF13 = rectF4;
        return functionRectF.copy(rectF, arrayList, rectF2, rectF3, arrayList3, rectF13, rectF11, rectF12, rectF9, rectF10);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final RectF getDelete() {
        return this.delete;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final RectF getImageCrop() {
        return this.imageCrop;
    }

    @NotNull
    public final ArrayList<RectF> component2() {
        return this.colorList;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final RectF getCustomColor() {
        return this.customColor;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final RectF getWriteEdit() {
        return this.writeEdit;
    }

    @NotNull
    public final ArrayList<RectF> component5() {
        return this.writeStrokeWidthList;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final RectF getTextEdit() {
        return this.textEdit;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final RectF getTextSizeReduce() {
        return this.textSizeReduce;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final RectF getTextSizeAdd() {
        return this.textSizeAdd;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final RectF getGeometryStroke() {
        return this.geometryStroke;
    }

    @NotNull
    public final FunctionRectF copy(@NotNull RectF delete, @NotNull ArrayList<RectF> colorList, @NotNull RectF customColor, @NotNull RectF writeEdit, @NotNull ArrayList<RectF> writeStrokeWidthList, @NotNull RectF textEdit, @NotNull RectF textSizeReduce, @NotNull RectF textSizeAdd, @NotNull RectF geometryStroke, @NotNull RectF imageCrop) {
        AbstractC5830k.m5330g(delete, "delete");
        AbstractC5830k.m5330g(colorList, "colorList");
        AbstractC5830k.m5330g(customColor, "customColor");
        AbstractC5830k.m5330g(writeEdit, "writeEdit");
        AbstractC5830k.m5330g(writeStrokeWidthList, "writeStrokeWidthList");
        AbstractC5830k.m5330g(textEdit, "textEdit");
        AbstractC5830k.m5330g(textSizeReduce, "textSizeReduce");
        AbstractC5830k.m5330g(textSizeAdd, "textSizeAdd");
        AbstractC5830k.m5330g(geometryStroke, "geometryStroke");
        AbstractC5830k.m5330g(imageCrop, "imageCrop");
        return new FunctionRectF(delete, colorList, customColor, writeEdit, writeStrokeWidthList, textEdit, textSizeReduce, textSizeAdd, geometryStroke, imageCrop);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FunctionRectF)) {
            return false;
        }
        FunctionRectF functionRectF = (FunctionRectF) other;
        return AbstractC5830k.m5325b(this.delete, functionRectF.delete) && AbstractC5830k.m5325b(this.colorList, functionRectF.colorList) && AbstractC5830k.m5325b(this.customColor, functionRectF.customColor) && AbstractC5830k.m5325b(this.writeEdit, functionRectF.writeEdit) && AbstractC5830k.m5325b(this.writeStrokeWidthList, functionRectF.writeStrokeWidthList) && AbstractC5830k.m5325b(this.textEdit, functionRectF.textEdit) && AbstractC5830k.m5325b(this.textSizeReduce, functionRectF.textSizeReduce) && AbstractC5830k.m5325b(this.textSizeAdd, functionRectF.textSizeAdd) && AbstractC5830k.m5325b(this.geometryStroke, functionRectF.geometryStroke) && AbstractC5830k.m5325b(this.imageCrop, functionRectF.imageCrop);
    }

    @NotNull
    public final ArrayList<RectF> getColorList() {
        return this.colorList;
    }

    @NotNull
    public final RectF getCustomColor() {
        return this.customColor;
    }

    @NotNull
    public final RectF getDelete() {
        return this.delete;
    }

    @NotNull
    public final RectF getGeometryStroke() {
        return this.geometryStroke;
    }

    @NotNull
    public final RectF getImageCrop() {
        return this.imageCrop;
    }

    @NotNull
    public final RectF getTextEdit() {
        return this.textEdit;
    }

    @NotNull
    public final RectF getTextSizeAdd() {
        return this.textSizeAdd;
    }

    @NotNull
    public final RectF getTextSizeReduce() {
        return this.textSizeReduce;
    }

    @NotNull
    public final RectF getWriteEdit() {
        return this.writeEdit;
    }

    @NotNull
    public final ArrayList<RectF> getWriteStrokeWidthList() {
        return this.writeStrokeWidthList;
    }

    public int hashCode() {
        return this.imageCrop.hashCode() + ((this.geometryStroke.hashCode() + ((this.textSizeAdd.hashCode() + ((this.textSizeReduce.hashCode() + ((this.textEdit.hashCode() + ((this.writeStrokeWidthList.hashCode() + ((this.writeEdit.hashCode() + ((this.customColor.hashCode() + ((this.colorList.hashCode() + (this.delete.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "FunctionRectF(delete=" + this.delete + ", colorList=" + this.colorList + ", customColor=" + this.customColor + ", writeEdit=" + this.writeEdit + ", writeStrokeWidthList=" + this.writeStrokeWidthList + ", textEdit=" + this.textEdit + ", textSizeReduce=" + this.textSizeReduce + ", textSizeAdd=" + this.textSizeAdd + ", geometryStroke=" + this.geometryStroke + ", imageCrop=" + this.imageCrop + ')';
    }

    public FunctionRectF(@NotNull RectF delete, @NotNull ArrayList<RectF> colorList, @NotNull RectF customColor, @NotNull RectF writeEdit, @NotNull ArrayList<RectF> writeStrokeWidthList, @NotNull RectF textEdit, @NotNull RectF textSizeReduce, @NotNull RectF textSizeAdd, @NotNull RectF geometryStroke, @NotNull RectF imageCrop) {
        AbstractC5830k.m5330g(delete, "delete");
        AbstractC5830k.m5330g(colorList, "colorList");
        AbstractC5830k.m5330g(customColor, "customColor");
        AbstractC5830k.m5330g(writeEdit, "writeEdit");
        AbstractC5830k.m5330g(writeStrokeWidthList, "writeStrokeWidthList");
        AbstractC5830k.m5330g(textEdit, "textEdit");
        AbstractC5830k.m5330g(textSizeReduce, "textSizeReduce");
        AbstractC5830k.m5330g(textSizeAdd, "textSizeAdd");
        AbstractC5830k.m5330g(geometryStroke, "geometryStroke");
        AbstractC5830k.m5330g(imageCrop, "imageCrop");
        this.delete = delete;
        this.colorList = colorList;
        this.customColor = customColor;
        this.writeEdit = writeEdit;
        this.writeStrokeWidthList = writeStrokeWidthList;
        this.textEdit = textEdit;
        this.textSizeReduce = textSizeReduce;
        this.textSizeAdd = textSizeAdd;
        this.geometryStroke = geometryStroke;
        this.imageCrop = imageCrop;
    }

    public /* synthetic */ FunctionRectF(RectF rectF, ArrayList arrayList, RectF rectF2, RectF rectF3, ArrayList arrayList2, RectF rectF4, RectF rectF5, RectF rectF6, RectF rectF7, RectF rectF8, int i, AbstractC5824e abstractC5824e) {
        this((i & 1) != 0 ? new RectF() : rectF, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? new RectF() : rectF2, (i & 8) != 0 ? new RectF() : rectF3, (i & 16) != 0 ? new ArrayList() : arrayList2, (i & 32) != 0 ? new RectF() : rectF4, (i & 64) != 0 ? new RectF() : rectF5, (i & 128) != 0 ? new RectF() : rectF6, (i & 256) != 0 ? new RectF() : rectF7, (i & 512) != 0 ? new RectF() : rectF8);
    }
}
