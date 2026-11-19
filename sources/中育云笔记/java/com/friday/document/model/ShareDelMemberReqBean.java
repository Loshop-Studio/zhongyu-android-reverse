package com.friday.document.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class ShareDelMemberReqBean {
    public static final int $stable = 0;
    private final int ezyCourseId;
    private final String fileId;

    public ShareDelMemberReqBean(String fileId, int i10) {
        AbstractC9979u.m20294g(fileId, "fileId");
        this.fileId = fileId;
        this.ezyCourseId = i10;
    }

    public static /* synthetic */ ShareDelMemberReqBean copy$default(ShareDelMemberReqBean shareDelMemberReqBean, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = shareDelMemberReqBean.fileId;
        }
        if ((i11 & 2) != 0) {
            i10 = shareDelMemberReqBean.ezyCourseId;
        }
        return shareDelMemberReqBean.copy(str, i10);
    }

    public final String component1() {
        return this.fileId;
    }

    public final int component2() {
        return this.ezyCourseId;
    }

    public final ShareDelMemberReqBean copy(String fileId, int i10) {
        AbstractC9979u.m20294g(fileId, "fileId");
        return new ShareDelMemberReqBean(fileId, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareDelMemberReqBean)) {
            return false;
        }
        ShareDelMemberReqBean shareDelMemberReqBean = (ShareDelMemberReqBean) obj;
        return AbstractC9979u.m20289b(this.fileId, shareDelMemberReqBean.fileId) && this.ezyCourseId == shareDelMemberReqBean.ezyCourseId;
    }

    public final int getEzyCourseId() {
        return this.ezyCourseId;
    }

    public final String getFileId() {
        return this.fileId;
    }

    public int hashCode() {
        return (this.fileId.hashCode() * 31) + Integer.hashCode(this.ezyCourseId);
    }

    public String toString() {
        return "ShareDelMemberReqBean(fileId=" + this.fileId + ", ezyCourseId=" + this.ezyCourseId + ")";
    }
}
