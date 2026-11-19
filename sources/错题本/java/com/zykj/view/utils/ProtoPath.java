package com.zykj.view.utils;

import android.graphics.Paint;
import android.graphics.PointF;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(m5109d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m5110d2 = {"Lcom/zykj/view/utils/ProtoPath;", "", "paint", "Landroid/graphics/Paint;", "pointList", "", "Landroid/graphics/PointF;", "<init>", "(Landroid/graphics/Paint;Ljava/util/List;)V", "getPaint", "()Landroid/graphics/Paint;", "getPointList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class ProtoPath {

    @NotNull
    private final Paint paint;

    @NotNull
    private final List<PointF> pointList;

    /* JADX WARN: Multi-variable type inference failed */
    public ProtoPath(@NotNull Paint paint, @NotNull List<? extends PointF> pointList) {
        AbstractC5830k.m5330g(paint, "paint");
        AbstractC5830k.m5330g(pointList, "pointList");
        this.paint = paint;
        this.pointList = pointList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProtoPath copy$default(ProtoPath protoPath, Paint paint, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            paint = protoPath.paint;
        }
        if ((i & 2) != 0) {
            list = protoPath.pointList;
        }
        return protoPath.copy(paint, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Paint getPaint() {
        return this.paint;
    }

    @NotNull
    public final List<PointF> component2() {
        return this.pointList;
    }

    @NotNull
    public final ProtoPath copy(@NotNull Paint paint, @NotNull List<? extends PointF> pointList) {
        AbstractC5830k.m5330g(paint, "paint");
        AbstractC5830k.m5330g(pointList, "pointList");
        return new ProtoPath(paint, pointList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProtoPath)) {
            return false;
        }
        ProtoPath protoPath = (ProtoPath) other;
        return AbstractC5830k.m5325b(this.paint, protoPath.paint) && AbstractC5830k.m5325b(this.pointList, protoPath.pointList);
    }

    @NotNull
    public final Paint getPaint() {
        return this.paint;
    }

    @NotNull
    public final List<PointF> getPointList() {
        return this.pointList;
    }

    public int hashCode() {
        return this.pointList.hashCode() + (this.paint.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ProtoPath(paint=" + this.paint + ", pointList=" + this.pointList + ")";
    }
}
