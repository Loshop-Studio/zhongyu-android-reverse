package com.zykj.view.simpleBoard.action;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J7\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m5110d2 = {"Lcom/zykj/view/simpleBoard/action/WritePath;", "", "path", "Landroid/graphics/Path;", "paint", "Landroid/graphics/Paint;", "rectF", "Landroid/graphics/RectF;", "pointList", "", "Landroid/graphics/PointF;", "<init>", "(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/RectF;Ljava/util/List;)V", "getPath", "()Landroid/graphics/Path;", "getPaint", "()Landroid/graphics/Paint;", "getRectF", "()Landroid/graphics/RectF;", "getPointList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final /* data */ class WritePath {

    @NotNull
    private final Paint paint;

    @NotNull
    private final Path path;

    @NotNull
    private final List<PointF> pointList;

    @NotNull
    private final RectF rectF;

    /* JADX WARN: Multi-variable type inference failed */
    public WritePath(@NotNull Path path, @NotNull Paint paint, @NotNull RectF rectF, @NotNull List<? extends PointF> pointList) {
        AbstractC5830k.m5330g(path, "path");
        AbstractC5830k.m5330g(paint, "paint");
        AbstractC5830k.m5330g(rectF, "rectF");
        AbstractC5830k.m5330g(pointList, "pointList");
        this.path = path;
        this.paint = paint;
        this.rectF = rectF;
        this.pointList = pointList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WritePath copy$default(WritePath writePath, Path path, Paint paint, RectF rectF, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            path = writePath.path;
        }
        if ((i & 2) != 0) {
            paint = writePath.paint;
        }
        if ((i & 4) != 0) {
            rectF = writePath.rectF;
        }
        if ((i & 8) != 0) {
            list = writePath.pointList;
        }
        return writePath.copy(path, paint, rectF, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Path getPath() {
        return this.path;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Paint getPaint() {
        return this.paint;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final RectF getRectF() {
        return this.rectF;
    }

    @NotNull
    public final List<PointF> component4() {
        return this.pointList;
    }

    @NotNull
    public final WritePath copy(@NotNull Path path, @NotNull Paint paint, @NotNull RectF rectF, @NotNull List<? extends PointF> pointList) {
        AbstractC5830k.m5330g(path, "path");
        AbstractC5830k.m5330g(paint, "paint");
        AbstractC5830k.m5330g(rectF, "rectF");
        AbstractC5830k.m5330g(pointList, "pointList");
        return new WritePath(path, paint, rectF, pointList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WritePath)) {
            return false;
        }
        WritePath writePath = (WritePath) other;
        return AbstractC5830k.m5325b(this.path, writePath.path) && AbstractC5830k.m5325b(this.paint, writePath.paint) && AbstractC5830k.m5325b(this.rectF, writePath.rectF) && AbstractC5830k.m5325b(this.pointList, writePath.pointList);
    }

    @NotNull
    public final Paint getPaint() {
        return this.paint;
    }

    @NotNull
    public final Path getPath() {
        return this.path;
    }

    @NotNull
    public final List<PointF> getPointList() {
        return this.pointList;
    }

    @NotNull
    public final RectF getRectF() {
        return this.rectF;
    }

    public int hashCode() {
        return this.pointList.hashCode() + ((this.rectF.hashCode() + ((this.paint.hashCode() + (this.path.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "WritePath(path=" + this.path + ", paint=" + this.paint + ", rectF=" + this.rectF + ", pointList=" + this.pointList + ")";
    }
}
