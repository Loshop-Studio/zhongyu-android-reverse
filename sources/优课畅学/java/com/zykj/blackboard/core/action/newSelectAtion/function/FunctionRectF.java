package com.zykj.blackboard.core.action.newSelectAtion.function;

import android.graphics.RectF;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class FunctionRectF {
    private final ArrayList<RectF> colorList;
    private final RectF delete;
    private final RectF geometryStroke;
    private final RectF imageCrop;
    private final RectF textEdit;
    private final RectF textSizeAdd;
    private final RectF textSizeReduce;
    private final RectF writeEdit;
    private final ArrayList<RectF> writeStrokeWidthList;

    public FunctionRectF() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public static /* synthetic */ FunctionRectF copy$default(FunctionRectF functionRectF, RectF rectF, ArrayList arrayList, RectF rectF2, ArrayList arrayList2, RectF rectF3, RectF rectF4, RectF rectF5, RectF rectF6, RectF rectF7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            rectF = functionRectF.delete;
        }
        if ((i10 & 2) != 0) {
            arrayList = functionRectF.colorList;
        }
        if ((i10 & 4) != 0) {
            rectF2 = functionRectF.writeEdit;
        }
        if ((i10 & 8) != 0) {
            arrayList2 = functionRectF.writeStrokeWidthList;
        }
        if ((i10 & 16) != 0) {
            rectF3 = functionRectF.textEdit;
        }
        if ((i10 & 32) != 0) {
            rectF4 = functionRectF.textSizeReduce;
        }
        if ((i10 & 64) != 0) {
            rectF5 = functionRectF.textSizeAdd;
        }
        if ((i10 & 128) != 0) {
            rectF6 = functionRectF.geometryStroke;
        }
        if ((i10 & 256) != 0) {
            rectF7 = functionRectF.imageCrop;
        }
        RectF rectF8 = rectF6;
        RectF rectF9 = rectF7;
        RectF rectF10 = rectF4;
        RectF rectF11 = rectF5;
        RectF rectF12 = rectF3;
        RectF rectF13 = rectF2;
        return functionRectF.copy(rectF, arrayList, rectF13, arrayList2, rectF12, rectF10, rectF11, rectF8, rectF9);
    }

    public final RectF component1() {
        return this.delete;
    }

    public final ArrayList<RectF> component2() {
        return this.colorList;
    }

    public final RectF component3() {
        return this.writeEdit;
    }

    public final ArrayList<RectF> component4() {
        return this.writeStrokeWidthList;
    }

    public final RectF component5() {
        return this.textEdit;
    }

    public final RectF component6() {
        return this.textSizeReduce;
    }

    public final RectF component7() {
        return this.textSizeAdd;
    }

    public final RectF component8() {
        return this.geometryStroke;
    }

    public final RectF component9() {
        return this.imageCrop;
    }

    public final FunctionRectF copy(RectF delete, ArrayList<RectF> colorList, RectF writeEdit, ArrayList<RectF> writeStrokeWidthList, RectF textEdit, RectF textSizeReduce, RectF textSizeAdd, RectF geometryStroke, RectF imageCrop) {
        AbstractC9133u.m16133g(delete, "delete");
        AbstractC9133u.m16133g(colorList, "colorList");
        AbstractC9133u.m16133g(writeEdit, "writeEdit");
        AbstractC9133u.m16133g(writeStrokeWidthList, "writeStrokeWidthList");
        AbstractC9133u.m16133g(textEdit, "textEdit");
        AbstractC9133u.m16133g(textSizeReduce, "textSizeReduce");
        AbstractC9133u.m16133g(textSizeAdd, "textSizeAdd");
        AbstractC9133u.m16133g(geometryStroke, "geometryStroke");
        AbstractC9133u.m16133g(imageCrop, "imageCrop");
        return new FunctionRectF(delete, colorList, writeEdit, writeStrokeWidthList, textEdit, textSizeReduce, textSizeAdd, geometryStroke, imageCrop);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FunctionRectF)) {
            return false;
        }
        FunctionRectF functionRectF = (FunctionRectF) obj;
        return AbstractC9133u.m16128b(this.delete, functionRectF.delete) && AbstractC9133u.m16128b(this.colorList, functionRectF.colorList) && AbstractC9133u.m16128b(this.writeEdit, functionRectF.writeEdit) && AbstractC9133u.m16128b(this.writeStrokeWidthList, functionRectF.writeStrokeWidthList) && AbstractC9133u.m16128b(this.textEdit, functionRectF.textEdit) && AbstractC9133u.m16128b(this.textSizeReduce, functionRectF.textSizeReduce) && AbstractC9133u.m16128b(this.textSizeAdd, functionRectF.textSizeAdd) && AbstractC9133u.m16128b(this.geometryStroke, functionRectF.geometryStroke) && AbstractC9133u.m16128b(this.imageCrop, functionRectF.imageCrop);
    }

    public final ArrayList<RectF> getColorList() {
        return this.colorList;
    }

    public final RectF getDelete() {
        return this.delete;
    }

    public final RectF getGeometryStroke() {
        return this.geometryStroke;
    }

    public final RectF getImageCrop() {
        return this.imageCrop;
    }

    public final RectF getTextEdit() {
        return this.textEdit;
    }

    public final RectF getTextSizeAdd() {
        return this.textSizeAdd;
    }

    public final RectF getTextSizeReduce() {
        return this.textSizeReduce;
    }

    public final RectF getWriteEdit() {
        return this.writeEdit;
    }

    public final ArrayList<RectF> getWriteStrokeWidthList() {
        return this.writeStrokeWidthList;
    }

    public int hashCode() {
        return (((((((((((((((this.delete.hashCode() * 31) + this.colorList.hashCode()) * 31) + this.writeEdit.hashCode()) * 31) + this.writeStrokeWidthList.hashCode()) * 31) + this.textEdit.hashCode()) * 31) + this.textSizeReduce.hashCode()) * 31) + this.textSizeAdd.hashCode()) * 31) + this.geometryStroke.hashCode()) * 31) + this.imageCrop.hashCode();
    }

    public String toString() {
        return "FunctionRectF(delete=" + this.delete + ", colorList=" + this.colorList + ", writeEdit=" + this.writeEdit + ", writeStrokeWidthList=" + this.writeStrokeWidthList + ", textEdit=" + this.textEdit + ", textSizeReduce=" + this.textSizeReduce + ", textSizeAdd=" + this.textSizeAdd + ", geometryStroke=" + this.geometryStroke + ", imageCrop=" + this.imageCrop + ')';
    }

    public FunctionRectF(RectF delete, ArrayList<RectF> colorList, RectF writeEdit, ArrayList<RectF> writeStrokeWidthList, RectF textEdit, RectF textSizeReduce, RectF textSizeAdd, RectF geometryStroke, RectF imageCrop) {
        AbstractC9133u.m16133g(delete, "delete");
        AbstractC9133u.m16133g(colorList, "colorList");
        AbstractC9133u.m16133g(writeEdit, "writeEdit");
        AbstractC9133u.m16133g(writeStrokeWidthList, "writeStrokeWidthList");
        AbstractC9133u.m16133g(textEdit, "textEdit");
        AbstractC9133u.m16133g(textSizeReduce, "textSizeReduce");
        AbstractC9133u.m16133g(textSizeAdd, "textSizeAdd");
        AbstractC9133u.m16133g(geometryStroke, "geometryStroke");
        AbstractC9133u.m16133g(imageCrop, "imageCrop");
        this.delete = delete;
        this.colorList = colorList;
        this.writeEdit = writeEdit;
        this.writeStrokeWidthList = writeStrokeWidthList;
        this.textEdit = textEdit;
        this.textSizeReduce = textSizeReduce;
        this.textSizeAdd = textSizeAdd;
        this.geometryStroke = geometryStroke;
        this.imageCrop = imageCrop;
    }

    public /* synthetic */ FunctionRectF(RectF rectF, ArrayList arrayList, RectF rectF2, ArrayList arrayList2, RectF rectF3, RectF rectF4, RectF rectF5, RectF rectF6, RectF rectF7, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? new RectF() : rectF, (i10 & 2) != 0 ? new ArrayList() : arrayList, (i10 & 4) != 0 ? new RectF() : rectF2, (i10 & 8) != 0 ? new ArrayList() : arrayList2, (i10 & 16) != 0 ? new RectF() : rectF3, (i10 & 32) != 0 ? new RectF() : rectF4, (i10 & 64) != 0 ? new RectF() : rectF5, (i10 & 128) != 0 ? new RectF() : rectF6, (i10 & 256) != 0 ? new RectF() : rectF7);
    }
}
