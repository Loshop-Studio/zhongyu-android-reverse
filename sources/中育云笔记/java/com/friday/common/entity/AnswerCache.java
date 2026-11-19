package com.friday.common.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class AnswerCache {
    public static final int $stable = 8;
    private final ArrayList<OptionListEntity> dataList;
    private boolean fromServer;
    private final String guid;
    private Boolean hasStopped;
    private boolean hasSubmit;
    private int homeworkPage;
    private boolean isSingle;
    private final boolean isSubjective;
    private int options;
    private int qstCount;

    public AnswerCache(int i10, int i11, boolean z10, int i12, boolean z11, boolean z12, Boolean bool, ArrayList<OptionListEntity> dataList, boolean z13, String str) {
        AbstractC9979u.m20294g(dataList, "dataList");
        this.options = i10;
        this.qstCount = i11;
        this.isSingle = z10;
        this.homeworkPage = i12;
        this.fromServer = z11;
        this.hasSubmit = z12;
        this.hasStopped = bool;
        this.dataList = dataList;
        this.isSubjective = z13;
        this.guid = str;
    }

    public static /* synthetic */ AnswerCache copy$default(AnswerCache answerCache, int i10, int i11, boolean z10, int i12, boolean z11, boolean z12, Boolean bool, ArrayList arrayList, boolean z13, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = answerCache.options;
        }
        if ((i13 & 2) != 0) {
            i11 = answerCache.qstCount;
        }
        if ((i13 & 4) != 0) {
            z10 = answerCache.isSingle;
        }
        if ((i13 & 8) != 0) {
            i12 = answerCache.homeworkPage;
        }
        if ((i13 & 16) != 0) {
            z11 = answerCache.fromServer;
        }
        if ((i13 & 32) != 0) {
            z12 = answerCache.hasSubmit;
        }
        if ((i13 & 64) != 0) {
            bool = answerCache.hasStopped;
        }
        if ((i13 & 128) != 0) {
            arrayList = answerCache.dataList;
        }
        if ((i13 & 256) != 0) {
            z13 = answerCache.isSubjective;
        }
        if ((i13 & 512) != 0) {
            str = answerCache.guid;
        }
        boolean z14 = z13;
        String str2 = str;
        Boolean bool2 = bool;
        ArrayList arrayList2 = arrayList;
        boolean z15 = z11;
        boolean z16 = z12;
        return answerCache.copy(i10, i11, z10, i12, z15, z16, bool2, arrayList2, z14, str2);
    }

    public final int component1() {
        return this.options;
    }

    public final String component10() {
        return this.guid;
    }

    public final int component2() {
        return this.qstCount;
    }

    public final boolean component3() {
        return this.isSingle;
    }

    public final int component4() {
        return this.homeworkPage;
    }

    public final boolean component5() {
        return this.fromServer;
    }

    public final boolean component6() {
        return this.hasSubmit;
    }

    public final Boolean component7() {
        return this.hasStopped;
    }

    public final ArrayList<OptionListEntity> component8() {
        return this.dataList;
    }

    public final boolean component9() {
        return this.isSubjective;
    }

    public final AnswerCache copy(int i10, int i11, boolean z10, int i12, boolean z11, boolean z12, Boolean bool, ArrayList<OptionListEntity> dataList, boolean z13, String str) {
        AbstractC9979u.m20294g(dataList, "dataList");
        return new AnswerCache(i10, i11, z10, i12, z11, z12, bool, dataList, z13, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnswerCache)) {
            return false;
        }
        AnswerCache answerCache = (AnswerCache) obj;
        return this.options == answerCache.options && this.qstCount == answerCache.qstCount && this.isSingle == answerCache.isSingle && this.homeworkPage == answerCache.homeworkPage && this.fromServer == answerCache.fromServer && this.hasSubmit == answerCache.hasSubmit && AbstractC9979u.m20289b(this.hasStopped, answerCache.hasStopped) && AbstractC9979u.m20289b(this.dataList, answerCache.dataList) && this.isSubjective == answerCache.isSubjective && AbstractC9979u.m20289b(this.guid, answerCache.guid);
    }

    public final ArrayList<OptionListEntity> getDataList() {
        return this.dataList;
    }

    public final boolean getFromServer() {
        return this.fromServer;
    }

    public final String getGuid() {
        return this.guid;
    }

    public final Boolean getHasStopped() {
        return this.hasStopped;
    }

    public final boolean getHasSubmit() {
        return this.hasSubmit;
    }

    public final int getHomeworkPage() {
        return this.homeworkPage;
    }

    public final int getOptions() {
        return this.options;
    }

    public final int getQstCount() {
        return this.qstCount;
    }

    public int hashCode() {
        int iHashCode = ((((((((((Integer.hashCode(this.options) * 31) + Integer.hashCode(this.qstCount)) * 31) + Boolean.hashCode(this.isSingle)) * 31) + Integer.hashCode(this.homeworkPage)) * 31) + Boolean.hashCode(this.fromServer)) * 31) + Boolean.hashCode(this.hasSubmit)) * 31;
        Boolean bool = this.hasStopped;
        int iHashCode2 = (((((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.dataList.hashCode()) * 31) + Boolean.hashCode(this.isSubjective)) * 31;
        String str = this.guid;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final boolean isSingle() {
        return this.isSingle;
    }

    public final boolean isSubjective() {
        return this.isSubjective;
    }

    public final void setFromServer(boolean z10) {
        this.fromServer = z10;
    }

    public final void setHasStopped(Boolean bool) {
        this.hasStopped = bool;
    }

    public final void setHasSubmit(boolean z10) {
        this.hasSubmit = z10;
    }

    public final void setHomeworkPage(int i10) {
        this.homeworkPage = i10;
    }

    public final void setOptions(int i10) {
        this.options = i10;
    }

    public final void setQstCount(int i10) {
        this.qstCount = i10;
    }

    public final void setSingle(boolean z10) {
        this.isSingle = z10;
    }

    public String toString() {
        return "AnswerCache(options=" + this.options + ", qstCount=" + this.qstCount + ", isSingle=" + this.isSingle + ", homeworkPage=" + this.homeworkPage + ", fromServer=" + this.fromServer + ", hasSubmit=" + this.hasSubmit + ", hasStopped=" + this.hasStopped + ", dataList=" + this.dataList + ", isSubjective=" + this.isSubjective + ", guid=" + this.guid + ")";
    }

    public /* synthetic */ AnswerCache(int i10, int i11, boolean z10, int i12, boolean z11, boolean z12, Boolean bool, ArrayList arrayList, boolean z13, String str, int i13, AbstractC9972n abstractC9972n) {
        this((i13 & 1) != 0 ? 0 : i10, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? true : z10, (i13 & 8) != 0 ? 0 : i12, (i13 & 16) != 0 ? false : z11, (i13 & 32) != 0 ? false : z12, bool, (i13 & 128) != 0 ? new ArrayList() : arrayList, z13, str);
    }
}
