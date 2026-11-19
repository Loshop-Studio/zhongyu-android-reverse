package com.zykj.evaluation.bean.bundle;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m13558d2 = {"Lcom/zykj/evaluation/bean/bundle/AnswerData;", "", "uuid", "", "answerPath", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getUuid", "()Ljava/lang/String;", "getAnswerPath", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AnswerData {
    public static final int $stable = 0;
    private final String answerPath;
    private final String uuid;

    public AnswerData(String uuid, String answerPath) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(answerPath, "answerPath");
        this.uuid = uuid;
        this.answerPath = answerPath;
    }

    public static /* synthetic */ AnswerData copy$default(AnswerData answerData, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = answerData.uuid;
        }
        if ((i10 & 2) != 0) {
            str2 = answerData.answerPath;
        }
        return answerData.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAnswerPath() {
        return this.answerPath;
    }

    public final AnswerData copy(String uuid, String answerPath) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(answerPath, "answerPath");
        return new AnswerData(uuid, answerPath);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnswerData)) {
            return false;
        }
        AnswerData answerData = (AnswerData) other;
        return Intrinsics.areEqual(this.uuid, answerData.uuid) && Intrinsics.areEqual(this.answerPath, answerData.answerPath);
    }

    public final String getAnswerPath() {
        return this.answerPath;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return (this.uuid.hashCode() * 31) + this.answerPath.hashCode();
    }

    public String toString() {
        return "AnswerData(uuid=" + this.uuid + ", answerPath=" + this.answerPath + ")";
    }
}
