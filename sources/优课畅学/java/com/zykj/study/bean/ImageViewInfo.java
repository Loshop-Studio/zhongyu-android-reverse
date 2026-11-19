package com.zykj.study.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class ImageViewInfo {
    public static final int $stable = 0;
    private final String url;

    public ImageViewInfo(String url) {
        AbstractC9133u.m16133g(url, "url");
        this.url = url;
    }

    public static /* synthetic */ ImageViewInfo copy$default(ImageViewInfo imageViewInfo, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = imageViewInfo.url;
        }
        return imageViewInfo.copy(str);
    }

    public final String component1() {
        return this.url;
    }

    public final ImageViewInfo copy(String url) {
        AbstractC9133u.m16133g(url, "url");
        return new ImageViewInfo(url);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ImageViewInfo) && AbstractC9133u.m16128b(this.url, ((ImageViewInfo) obj).url);
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public String toString() {
        return "ImageViewInfo(url=" + this.url + ")";
    }
}
