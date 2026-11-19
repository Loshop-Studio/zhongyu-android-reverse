package com.zykj.study.bean.exercise;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class AnswerResultInput {
    public static final int $stable = 0;
    private final String answer;
    private final boolean correct;

    @SerializedName("quizId")
    private final long exerciseId;
    private final int groupId;
    private final String questionId;

    public AnswerResultInput(long j10, int i10, String questionId, boolean z10, String answer) {
        AbstractC9133u.m16133g(questionId, "questionId");
        AbstractC9133u.m16133g(answer, "answer");
        this.exerciseId = j10;
        this.groupId = i10;
        this.questionId = questionId;
        this.correct = z10;
        this.answer = answer;
    }

    public static /* synthetic */ AnswerResultInput copy$default(AnswerResultInput answerResultInput, long j10, int i10, String str, boolean z10, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j10 = answerResultInput.exerciseId;
        }
        long j11 = j10;
        if ((i11 & 2) != 0) {
            i10 = answerResultInput.groupId;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            str = answerResultInput.questionId;
        }
        String str3 = str;
        if ((i11 & 8) != 0) {
            z10 = answerResultInput.correct;
        }
        boolean z11 = z10;
        if ((i11 & 16) != 0) {
            str2 = answerResultInput.answer;
        }
        return answerResultInput.copy(j11, i12, str3, z11, str2);
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
        return this.answer;
    }

    public final AnswerResultInput copy(long j10, int i10, String questionId, boolean z10, String answer) {
        AbstractC9133u.m16133g(questionId, "questionId");
        AbstractC9133u.m16133g(answer, "answer");
        return new AnswerResultInput(j10, i10, questionId, z10, answer);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnswerResultInput)) {
            return false;
        }
        AnswerResultInput answerResultInput = (AnswerResultInput) obj;
        return this.exerciseId == answerResultInput.exerciseId && this.groupId == answerResultInput.groupId && AbstractC9133u.m16128b(this.questionId, answerResultInput.questionId) && this.correct == answerResultInput.correct && AbstractC9133u.m16128b(this.answer, answerResultInput.answer);
    }

    public final String getAnswer() {
        return this.answer;
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
        return (((((((Long.hashCode(this.exerciseId) * 31) + Integer.hashCode(this.groupId)) * 31) + this.questionId.hashCode()) * 31) + Boolean.hashCode(this.correct)) * 31) + this.answer.hashCode();
    }

    public String toString() {
        return "AnswerResultInput(exerciseId=" + this.exerciseId + ", groupId=" + this.groupId + ", questionId=" + this.questionId + ", correct=" + this.correct + ", answer=" + this.answer + ")";
    }
}
