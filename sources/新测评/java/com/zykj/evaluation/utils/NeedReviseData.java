package com.zykj.evaluation.utils;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Keep
@Metadata(m13557d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m13558d2 = {"Lcom/zykj/evaluation/utils/NeedReviseData;", "", "questionId", "", "uuid", "", "needRevise", "", "<init>", "(JLjava/lang/String;Z)V", "getQuestionId", "()J", "getUuid", "()Ljava/lang/String;", "getNeedRevise", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class NeedReviseData {
    public static final int $stable = 0;
    private final boolean needRevise;
    private final long questionId;
    private final String uuid;

    public NeedReviseData(long j10, String uuid, boolean z9) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.questionId = j10;
        this.uuid = uuid;
        this.needRevise = z9;
    }

    public static /* synthetic */ NeedReviseData copy$default(NeedReviseData needReviseData, long j10, String str, boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = needReviseData.questionId;
        }
        if ((i10 & 2) != 0) {
            str = needReviseData.uuid;
        }
        if ((i10 & 4) != 0) {
            z9 = needReviseData.needRevise;
        }
        return needReviseData.copy(j10, str, z9);
    }

    /* renamed from: component1, reason: from getter */
    public final long getQuestionId() {
        return this.questionId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getNeedRevise() {
        return this.needRevise;
    }

    public final NeedReviseData copy(long questionId, String uuid, boolean needRevise) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        return new NeedReviseData(questionId, uuid, needRevise);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NeedReviseData)) {
            return false;
        }
        NeedReviseData needReviseData = (NeedReviseData) other;
        return this.questionId == needReviseData.questionId && Intrinsics.areEqual(this.uuid, needReviseData.uuid) && this.needRevise == needReviseData.needRevise;
    }

    public final boolean getNeedRevise() {
        return this.needRevise;
    }

    public final long getQuestionId() {
        return this.questionId;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return (((Long.hashCode(this.questionId) * 31) + this.uuid.hashCode()) * 31) + Boolean.hashCode(this.needRevise);
    }

    public String toString() {
        return "NeedReviseData(questionId=" + this.questionId + ", uuid=" + this.uuid + ", needRevise=" + this.needRevise + ")";
    }
}
