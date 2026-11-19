package com.friday.common.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class FileBean {
    public static final int $stable = 8;
    private final List<NoteBean> noteList;
    private final String schoolCode;
    private final int totalCount;
    private final String userId;

    public FileBean(String userId, String schoolCode, int i10, List<NoteBean> noteList) {
        AbstractC9979u.m20294g(userId, "userId");
        AbstractC9979u.m20294g(schoolCode, "schoolCode");
        AbstractC9979u.m20294g(noteList, "noteList");
        this.userId = userId;
        this.schoolCode = schoolCode;
        this.totalCount = i10;
        this.noteList = noteList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FileBean copy$default(FileBean fileBean, String str, String str2, int i10, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fileBean.userId;
        }
        if ((i11 & 2) != 0) {
            str2 = fileBean.schoolCode;
        }
        if ((i11 & 4) != 0) {
            i10 = fileBean.totalCount;
        }
        if ((i11 & 8) != 0) {
            list = fileBean.noteList;
        }
        return fileBean.copy(str, str2, i10, list);
    }

    public final String component1() {
        return this.userId;
    }

    public final String component2() {
        return this.schoolCode;
    }

    public final int component3() {
        return this.totalCount;
    }

    public final List<NoteBean> component4() {
        return this.noteList;
    }

    public final FileBean copy(String userId, String schoolCode, int i10, List<NoteBean> noteList) {
        AbstractC9979u.m20294g(userId, "userId");
        AbstractC9979u.m20294g(schoolCode, "schoolCode");
        AbstractC9979u.m20294g(noteList, "noteList");
        return new FileBean(userId, schoolCode, i10, noteList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileBean)) {
            return false;
        }
        FileBean fileBean = (FileBean) obj;
        return AbstractC9979u.m20289b(this.userId, fileBean.userId) && AbstractC9979u.m20289b(this.schoolCode, fileBean.schoolCode) && this.totalCount == fileBean.totalCount && AbstractC9979u.m20289b(this.noteList, fileBean.noteList);
    }

    public final List<NoteBean> getNoteList() {
        return this.noteList;
    }

    public final String getSchoolCode() {
        return this.schoolCode;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((this.userId.hashCode() * 31) + this.schoolCode.hashCode()) * 31) + Integer.hashCode(this.totalCount)) * 31) + this.noteList.hashCode();
    }

    public String toString() {
        return "FileBean(userId=" + this.userId + ", schoolCode=" + this.schoolCode + ", totalCount=" + this.totalCount + ", noteList=" + this.noteList + ")";
    }
}
