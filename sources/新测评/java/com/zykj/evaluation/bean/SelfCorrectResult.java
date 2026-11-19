package com.zykj.evaluation.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m13558d2 = {"Lcom/zykj/evaluation/bean/SelfCorrectResult;", "", "uuid", "", "result", "", "revisingAnswer", "", "<init>", "(Ljava/lang/String;ILjava/util/List;)V", "getUuid", "()Ljava/lang/String;", "getResult", "()I", "getRevisingAnswer", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SelfCorrectResult {
    public static final int $stable = 8;
    private final int result;
    private final List<String> revisingAnswer;
    private final String uuid;

    public SelfCorrectResult(String uuid, int i10, List<String> revisingAnswer) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(revisingAnswer, "revisingAnswer");
        this.uuid = uuid;
        this.result = i10;
        this.revisingAnswer = revisingAnswer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SelfCorrectResult copy$default(SelfCorrectResult selfCorrectResult, String str, int i10, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = selfCorrectResult.uuid;
        }
        if ((i11 & 2) != 0) {
            i10 = selfCorrectResult.result;
        }
        if ((i11 & 4) != 0) {
            list = selfCorrectResult.revisingAnswer;
        }
        return selfCorrectResult.copy(str, i10, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* renamed from: component2, reason: from getter */
    public final int getResult() {
        return this.result;
    }

    public final List<String> component3() {
        return this.revisingAnswer;
    }

    public final SelfCorrectResult copy(String uuid, int result, List<String> revisingAnswer) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(revisingAnswer, "revisingAnswer");
        return new SelfCorrectResult(uuid, result, revisingAnswer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelfCorrectResult)) {
            return false;
        }
        SelfCorrectResult selfCorrectResult = (SelfCorrectResult) other;
        return Intrinsics.areEqual(this.uuid, selfCorrectResult.uuid) && this.result == selfCorrectResult.result && Intrinsics.areEqual(this.revisingAnswer, selfCorrectResult.revisingAnswer);
    }

    public final int getResult() {
        return this.result;
    }

    public final List<String> getRevisingAnswer() {
        return this.revisingAnswer;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return (((this.uuid.hashCode() * 31) + Integer.hashCode(this.result)) * 31) + this.revisingAnswer.hashCode();
    }

    public String toString() {
        return "SelfCorrectResult(uuid=" + this.uuid + ", result=" + this.result + ", revisingAnswer=" + this.revisingAnswer + ")";
    }
}
