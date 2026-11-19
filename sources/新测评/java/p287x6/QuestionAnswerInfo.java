package p287x6;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\u0004\b\b\u0010\tJ4\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R*\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m13558d2 = {"Lx6/k;", "", "", "questionId", "Ljava/util/ArrayList;", "Lx6/a;", "Lkotlin/collections/ArrayList;", "answerList", "<init>", "(JLjava/util/ArrayList;)V", "a", "(JLjava/util/ArrayList;)Lx6/k;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "d", "()J", "b", "Ljava/util/ArrayList;", "c", "()Ljava/util/ArrayList;", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* renamed from: x6.k, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class QuestionAnswerInfo {

    /* renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("questionId")
    private final long questionId;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("answerList")
    private final ArrayList<AnswerInfo> answerList;

    public QuestionAnswerInfo() {
        this(0L, null, 3, null);
    }

    /* renamed from: b */
    public static /* synthetic */ QuestionAnswerInfo m16546b(QuestionAnswerInfo questionAnswerInfo, long j10, ArrayList arrayList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = questionAnswerInfo.questionId;
        }
        if ((i10 & 2) != 0) {
            arrayList = questionAnswerInfo.answerList;
        }
        return questionAnswerInfo.m16547a(j10, arrayList);
    }

    /* renamed from: a */
    public final QuestionAnswerInfo m16547a(long questionId, ArrayList answerList) {
        Intrinsics.checkNotNullParameter(answerList, "answerList");
        return new QuestionAnswerInfo(questionId, answerList);
    }

    /* renamed from: c, reason: from getter */
    public final ArrayList getAnswerList() {
        return this.answerList;
    }

    /* renamed from: d, reason: from getter */
    public final long getQuestionId() {
        return this.questionId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuestionAnswerInfo)) {
            return false;
        }
        QuestionAnswerInfo questionAnswerInfo = (QuestionAnswerInfo) other;
        return this.questionId == questionAnswerInfo.questionId && Intrinsics.areEqual(this.answerList, questionAnswerInfo.answerList);
    }

    public int hashCode() {
        return (Long.hashCode(this.questionId) * 31) + this.answerList.hashCode();
    }

    public String toString() {
        return "QuestionAnswerInfo(questionId=" + this.questionId + ", answerList=" + this.answerList + ")";
    }

    public QuestionAnswerInfo(long j10, ArrayList answerList) {
        Intrinsics.checkNotNullParameter(answerList, "answerList");
        this.questionId = j10;
        this.answerList = answerList;
    }

    public /* synthetic */ QuestionAnswerInfo(long j10, ArrayList arrayList, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? new ArrayList() : arrayList);
    }
}
