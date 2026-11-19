package com.friday.document.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class ShareAddMemberReqBean {
    public static final int $stable = 8;
    private final List<Integer> ezyCourses;
    private final String fileId;

    public ShareAddMemberReqBean(String fileId, List<Integer> ezyCourses) {
        AbstractC9979u.m20294g(fileId, "fileId");
        AbstractC9979u.m20294g(ezyCourses, "ezyCourses");
        this.fileId = fileId;
        this.ezyCourses = ezyCourses;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShareAddMemberReqBean copy$default(ShareAddMemberReqBean shareAddMemberReqBean, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = shareAddMemberReqBean.fileId;
        }
        if ((i10 & 2) != 0) {
            list = shareAddMemberReqBean.ezyCourses;
        }
        return shareAddMemberReqBean.copy(str, list);
    }

    public final String component1() {
        return this.fileId;
    }

    public final List<Integer> component2() {
        return this.ezyCourses;
    }

    public final ShareAddMemberReqBean copy(String fileId, List<Integer> ezyCourses) {
        AbstractC9979u.m20294g(fileId, "fileId");
        AbstractC9979u.m20294g(ezyCourses, "ezyCourses");
        return new ShareAddMemberReqBean(fileId, ezyCourses);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareAddMemberReqBean)) {
            return false;
        }
        ShareAddMemberReqBean shareAddMemberReqBean = (ShareAddMemberReqBean) obj;
        return AbstractC9979u.m20289b(this.fileId, shareAddMemberReqBean.fileId) && AbstractC9979u.m20289b(this.ezyCourses, shareAddMemberReqBean.ezyCourses);
    }

    public final List<Integer> getEzyCourses() {
        return this.ezyCourses;
    }

    public final String getFileId() {
        return this.fileId;
    }

    public int hashCode() {
        return (this.fileId.hashCode() * 31) + this.ezyCourses.hashCode();
    }

    public String toString() {
        return "ShareAddMemberReqBean(fileId=" + this.fileId + ", ezyCourses=" + this.ezyCourses + ")";
    }
}
