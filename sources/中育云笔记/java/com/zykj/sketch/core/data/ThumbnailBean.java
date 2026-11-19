package com.zykj.sketch.core.data;

import android.graphics.Bitmap;
import android.graphics.RectF;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes6.dex */
public final class ThumbnailBean {
    private final Bitmap bitmap;
    private final RectF limitRenderRectF;
    private final RectF maxRenderRectF;

    public ThumbnailBean(Bitmap bitmap, RectF maxRenderRectF, RectF limitRenderRectF) {
        AbstractC9979u.m20294g(bitmap, "bitmap");
        AbstractC9979u.m20294g(maxRenderRectF, "maxRenderRectF");
        AbstractC9979u.m20294g(limitRenderRectF, "limitRenderRectF");
        this.bitmap = bitmap;
        this.maxRenderRectF = maxRenderRectF;
        this.limitRenderRectF = limitRenderRectF;
    }

    public static /* synthetic */ ThumbnailBean copy$default(ThumbnailBean thumbnailBean, Bitmap bitmap, RectF rectF, RectF rectF2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bitmap = thumbnailBean.bitmap;
        }
        if ((i10 & 2) != 0) {
            rectF = thumbnailBean.maxRenderRectF;
        }
        if ((i10 & 4) != 0) {
            rectF2 = thumbnailBean.limitRenderRectF;
        }
        return thumbnailBean.copy(bitmap, rectF, rectF2);
    }

    public final Bitmap component1() {
        return this.bitmap;
    }

    public final RectF component2() {
        return this.maxRenderRectF;
    }

    public final RectF component3() {
        return this.limitRenderRectF;
    }

    public final ThumbnailBean copy(Bitmap bitmap, RectF maxRenderRectF, RectF limitRenderRectF) {
        AbstractC9979u.m20294g(bitmap, "bitmap");
        AbstractC9979u.m20294g(maxRenderRectF, "maxRenderRectF");
        AbstractC9979u.m20294g(limitRenderRectF, "limitRenderRectF");
        return new ThumbnailBean(bitmap, maxRenderRectF, limitRenderRectF);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThumbnailBean)) {
            return false;
        }
        ThumbnailBean thumbnailBean = (ThumbnailBean) obj;
        return AbstractC9979u.m20289b(this.bitmap, thumbnailBean.bitmap) && AbstractC9979u.m20289b(this.maxRenderRectF, thumbnailBean.maxRenderRectF) && AbstractC9979u.m20289b(this.limitRenderRectF, thumbnailBean.limitRenderRectF);
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
