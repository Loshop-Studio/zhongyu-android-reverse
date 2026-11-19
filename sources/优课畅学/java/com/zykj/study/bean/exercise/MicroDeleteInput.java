package com.zykj.study.bean.exercise;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class MicroDeleteInput {
    public static final int $stable = 0;

    /* renamed from: id */
    private final int f11010id;
    private final int questionGroupId;
    private final String questionId;

    public MicroDeleteInput(int i10, String questionId, int i11) {
        AbstractC9133u.m16133g(questionId, "questionId");
        this.questionGroupId = i10;
        this.questionId = questionId;
        this.f11010id = i11;
    }

    public static /* synthetic */ MicroDeleteInput copy$default(MicroDeleteInput microDeleteInput, int i10, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = microDeleteInput.questionGroupId;
        }
        if ((i12 & 2) != 0) {
            str = microDeleteInput.questionId;
        }
        if ((i12 & 4) != 0) {
            i11 = microDeleteInput.f11010id;
        }
        return microDeleteInput.copy(i10, str, i11);
    }

    public final int component1() {
        return this.questionGroupId;
    }

    public final String component2() {
        return this.questionId;
    }

    public final int component3() {
        return this.f11010id;
    }

    public final MicroDeleteInput copy(int i10, String questionId, int i11) {
        AbstractC9133u.m16133g(questionId, "questionId");
        return new MicroDeleteInput(i10, questionId, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MicroDeleteInput)) {
            return false;
        }
        MicroDeleteInput microDeleteInput = (MicroDeleteInput) obj;
        return this.questionGroupId == microDeleteInput.questionGroupId && AbstractC9133u.m16128b(this.questionId, microDeleteInput.questionId) && this.f11010id == microDeleteInput.f11010id;
    }

    public final int getId() {
        return this.f11010id;
    }

    public final int getQuestionGroupId() {
        return this.questionGroupId;
    }

    public final String getQuestionId() {
        return this.questionId;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.questionGroupId) * 31) + this.questionId.hashCode()) * 31) + Integer.hashCode(this.f11010id);
    }

    public String toString() {
        return "MicroDeleteInput(questionGroupId=" + this.questionGroupId + ", questionId=" + this.questionId + ", id=" + this.f11010id + ")";
    }
}
