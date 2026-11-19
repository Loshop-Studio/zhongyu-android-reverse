package com.friday.common.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class PPTInfo {
    public static final int $stable = 0;
    private final PPTAnim anim;
    private final String info;
    private final PPTPage page;
    private final String url;

    public PPTInfo(PPTAnim anim, String info, PPTPage page, String url) {
        AbstractC9979u.m20294g(anim, "anim");
        AbstractC9979u.m20294g(info, "info");
        AbstractC9979u.m20294g(page, "page");
        AbstractC9979u.m20294g(url, "url");
        this.anim = anim;
        this.info = info;
        this.page = page;
        this.url = url;
    }

    public static /* synthetic */ PPTInfo copy$default(PPTInfo pPTInfo, PPTAnim pPTAnim, String str, PPTPage pPTPage, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            pPTAnim = pPTInfo.anim;
        }
        if ((i10 & 2) != 0) {
            str = pPTInfo.info;
        }
        if ((i10 & 4) != 0) {
            pPTPage = pPTInfo.page;
        }
        if ((i10 & 8) != 0) {
            str2 = pPTInfo.url;
        }
        return pPTInfo.copy(pPTAnim, str, pPTPage, str2);
    }

    public final PPTAnim component1() {
        return this.anim;
    }

    public final String component2() {
        return this.info;
    }

    public final PPTPage component3() {
        return this.page;
    }

    public final String component4() {
        return this.url;
    }

    public final PPTInfo copy(PPTAnim anim, String info, PPTPage page, String url) {
        AbstractC9979u.m20294g(anim, "anim");
        AbstractC9979u.m20294g(info, "info");
        AbstractC9979u.m20294g(page, "page");
        AbstractC9979u.m20294g(url, "url");
        return new PPTInfo(anim, info, page, url);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PPTInfo)) {
            return false;
        }
        PPTInfo pPTInfo = (PPTInfo) obj;
        return AbstractC9979u.m20289b(this.anim, pPTInfo.anim) && AbstractC9979u.m20289b(this.info, pPTInfo.info) && AbstractC9979u.m20289b(this.page, pPTInfo.page) && AbstractC9979u.m20289b(this.url, pPTInfo.url);
    }

    public final PPTAnim getAnim() {
        return this.anim;
    }

    public final String getInfo() {
        return this.info;
    }

    public final PPTPage getPage() {
        return this.page;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((((this.anim.hashCode() * 31) + this.info.hashCode()) * 31) + this.page.hashCode()) * 31) + this.url.hashCode();
    }

    public String toString() {
        return "PPTInfo(anim=" + this.anim + ", info=" + this.info + ", page=" + this.page + ", url=" + this.url + ")";
    }
}
