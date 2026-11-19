package com.zykj.study.bean.exercise;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class AnswerMicroResultInput {
    public static final int $stable = 0;
    private final String answerEx;
    private final boolean correct;

    @SerializedName("quizId")
    private final long exerciseId;
    private final int groupId;
    private final String questionId;

    public AnswerMicroResultInput(long j10, int i10, String questionId, boolean z10, String answerEx) {
        AbstractC9133u.m16133g(questionId, "questionId");
        AbstractC9133u.m16133g(answerEx, "answerEx");
        this.exerciseId = j10;
        this.groupId = i10;
        this.questionId = questionId;
        this.correct = z10;
        this.answerEx = answerEx;
    }

    public static /* synthetic */ AnswerMicroResultInput copy$default(AnswerMicroResultInput answerMicroResultInput, long j10, int i10, String str, boolean z10, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j10 = answerMicroResultInput.exerciseId;
        }
        long j11 = j10;
        if ((i11 & 2) != 0) {
            i10 = answerMicroResultInput.groupId;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            str = answerMicroResultInput.questionId;
        }
        String str3 = str;
        if ((i11 & 8) != 0) {
            z10 = answerMicroResultInput.correct;
        }
        boolean z11 = z10;
        if ((i11 & 16) != 0) {
            str2 = answerMicroResultInput.answerEx;
        }
        return answerMicroResultInput.copy(j11, i12, str3, z11, str2);
    }

    public final long component1() {
        return this.exerciseId;
    }

    public final int component2() {
        return this.groupId;
    }

    public final String component3() {
        return this.questionId;
    }

    public final boolean component4() {
        return this.correct;
    }

    public final String component5() {
        return this.answerEx;
    }

    public final AnswerMicroResultInput copy(long j10, int i10, String questionId, boolean z10, String answerEx) {
        AbstractC9133u.m16133g(questionId, "questionId");
        AbstractC9133u.m16133g(answerEx, "answerEx");
        return new AnswerMicroResultInput(j10, i10, questionId, z10, answerEx);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnswerMicroResultInput)) {
            return false;
        }
        AnswerMicroResultInput answerMicroResultInput = (AnswerMicroResultInput) obj;
        return this.exerciseId == answerMicroResultInput.exerciseId && this.groupId == answerMicroResultInput.groupId && AbstractC9133u.m16128b(this.questionId, answerMicroResultInput.questionId) && this.correct == answerMicroResultInput.correct && AbstractC9133u.m16128b(this.answerEx, answerMicroResultInput.answerEx);
    }

    public final String getAnswerEx() {
        return this.answerEx;
    }

    public final boolean getCorrect() {
        return this.correct;
    }

    public final long getExerciseId() {
        return this.exerciseId;
    }

    public final int getGroupId() {
        return this.groupId;
    }

    public final String getQuestionId() {
        return this.questionId;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.exerciseId) * 31) + Integer.hashCode(this.groupId)) * 31) + this.questionId.hashCode()) * 31) + Boolean.hashCode(this.correct)) * 31) + this.answerEx.hashCode();
    }

    public String toString() {
        return "AnswerMicroResultInput(exerciseId=" + this.exerciseId + ", groupId=" + this.groupId + ", questionId=" + this.questionId + ", correct=" + this.correct + ", answerEx=" + this.answerEx + ")";
    }
}
