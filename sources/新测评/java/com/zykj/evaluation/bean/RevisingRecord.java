package com.zykj.evaluation.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\bHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m13558d2 = {"Lcom/zykj/evaluation/bean/RevisingRecord;", "", "uuid", "", "revisingAnswers", "", "revisingComments", "result", "", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;I)V", "getUuid", "()Ljava/lang/String;", "getRevisingAnswers", "()Ljava/util/List;", "getRevisingComments", "getResult", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RevisingRecord {
    public static final int $stable = 8;
    private final int result;
    private final List<String> revisingAnswers;
    private final List<String> revisingComments;
    private final String uuid;

    public RevisingRecord(String uuid, List<String> revisingAnswers, List<String> revisingComments, int i10) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(revisingAnswers, "revisingAnswers");
        Intrinsics.checkNotNullParameter(revisingComments, "revisingComments");
        this.uuid = uuid;
        this.revisingAnswers = revisingAnswers;
        this.revisingComments = revisingComments;
        this.result = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RevisingRecord copy$default(RevisingRecord revisingRecord, String str, List list, List list2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = revisingRecord.uuid;
        }
        if ((i11 & 2) != 0) {
            list = revisingRecord.revisingAnswers;
        }
        if ((i11 & 4) != 0) {
            list2 = revisingRecord.revisingComments;
        }
        if ((i11 & 8) != 0) {
            i10 = revisingRecord.result;
        }
        return revisingRecord.copy(str, list, list2, i10);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    public final List<String> component2() {
        return this.revisingAnswers;
    }

    public final List<String> component3() {
        return this.revisingComments;
    }

    /* renamed from: component4, reason: from getter */
    public final int getResult() {
        return this.result;
    }

    public final RevisingRecord copy(String uuid, List<String> revisingAnswers, List<String> revisingComments, int result) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(revisingAnswers, "revisingAnswers");
        Intrinsics.checkNotNullParameter(revisingComments, "revisingComments");
        return new RevisingRecord(uuid, revisingAnswers, revisingComments, result);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RevisingRecord)) {
            return false;
        }
        RevisingRecord revisingRecord = (RevisingRecord) other;
        return Intrinsics.areEqual(this.uuid, revisingRecord.uuid) && Intrinsics.areEqual(this.revisingAnswers, revisingRecord.revisingAnswers) && Intrinsics.areEqual(this.revisingComments, revisingRecord.revisingComments) && this.result == revisingRecord.result;
    }

    public final int getResult() {
        return this.result;
    }

    public final List<String> getRevisingAnswers() {
        return this.revisingAnswers;
    }

    public final List<String> getRevisingComments() {
        return this.revisingComments;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return (((((this.uuid.hashCode() * 31) + this.revisingAnswers.hashCode()) * 31) + this.revisingComments.hashCode()) * 31) + Integer.hashCode(this.result);
    }

    public String toString() {
        return "RevisingRecord(uuid=" + this.uuid + ", revisingAnswers=" + this.revisingAnswers + ", revisingComments=" + this.revisingComments + ", result=" + this.result + ")";
    }
}
