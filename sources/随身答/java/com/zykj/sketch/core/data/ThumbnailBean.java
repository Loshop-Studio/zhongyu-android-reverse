package com.zykj.sketch.core.data;

import android.graphics.Bitmap;
import android.graphics.RectF;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13412d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, m13413d2 = {"Lcom/zykj/sketch/core/data/ThumbnailBean;", "", "bitmap", "Landroid/graphics/Bitmap;", "maxRenderRectF", "Landroid/graphics/RectF;", "limitRenderRectF", "(Landroid/graphics/Bitmap;Landroid/graphics/RectF;Landroid/graphics/RectF;)V", "getBitmap", "()Landroid/graphics/Bitmap;", "getLimitRenderRectF", "()Landroid/graphics/RectF;", "getMaxRenderRectF", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sketch_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final /* data */ class ThumbnailBean {
    private final Bitmap bitmap;
    private final RectF limitRenderRectF;
    private final RectF maxRenderRectF;

    public ThumbnailBean(Bitmap bitmap, RectF maxRenderRectF, RectF limitRenderRectF) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(maxRenderRectF, "maxRenderRectF");
        Intrinsics.checkNotNullParameter(limitRenderRectF, "limitRenderRectF");
        this.bitmap = bitmap;
        this.maxRenderRectF = maxRenderRectF;
        this.limitRenderRectF = limitRenderRectF;
    }

    public static /* synthetic */ ThumbnailBean copy$default(ThumbnailBean thumbnailBean, Bitmap bitmap, RectF rectF, RectF rectF2, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            bitmap = thumbnailBean.bitmap;
        }
        if ((i9 & 2) != 0) {
            rectF = thumbnailBean.maxRenderRectF;
        }
        if ((i9 & 4) != 0) {
            rectF2 = thumbnailBean.limitRenderRectF;
        }
        return thumbnailBean.copy(bitmap, rectF, rectF2);
    }

    /* renamed from: component1, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    /* renamed from: component2, reason: from getter */
    public final RectF getMaxRenderRectF() {
        return this.maxRenderRectF;
    }

    /* renamed from: component3, reason: from getter */
    public final RectF getLimitRenderRectF() {
        return this.limitRenderRectF;
    }

    public final ThumbnailBean copy(Bitmap bitmap, RectF maxRenderRectF, RectF limitRenderRectF) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(maxRenderRectF, "maxRenderRectF");
        Intrinsics.checkNotNullParameter(limitRenderRectF, "limitRenderRectF");
        return new ThumbnailBean(bitmap, maxRenderRectF, limitRenderRectF);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThumbnailBean)) {
            return false;
        }
        ThumbnailBean thumbnailBean = (ThumbnailBean) other;
        return Intrinsics.areEqual(this.bitmap, thumbnailBean.bitmap) && Intrinsics.areEqual(this.maxRenderRectF, thumbnailBean.maxRenderRectF) && Intrinsics.areEqual(this.limitRenderRectF, thumbnailBean.limitRenderRectF);
    }

    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public final RectF getLimitRenderRectF() {
        return this.limitRenderRectF;
    }

    public final RectF getMaxRenderRectF() {
        return this.maxRenderRectF;
    }

    public int hashCode() {
        return (((this.bitmap.hashCode() * 31) + this.maxRenderRectF.hashCode()) * 31) + this.limitRenderRectF.hashCode();
    }

    public String toString() {
        return "ThumbnailBean(bitmap=" + this.bitmap + ", maxRenderRectF=" + this.maxRenderRectF + ", limitRenderRectF=" + this.limitRenderRectF + ')';
    }
}
