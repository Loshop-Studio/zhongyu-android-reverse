package p079e7;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.gson.annotations.SerializedName;
import com.zykj.evaluation.bean.PaperPosition;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJR\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010\u0013R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0015R\u001a\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010'\u001a\u0004\b&\u0010\u0015¨\u0006)"}, m13558d2 = {"Le7/b;", "", "", "questionId", "", "Le7/c;", "answerData", "Lcom/zykj/evaluation/bean/PaperPosition;", RequestParameters.POSITION, "", "groupKey", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "numericalOrder", "<init>", "(JLjava/util/List;Lcom/zykj/evaluation/bean/PaperPosition;Ljava/lang/String;II)V", "a", "(JLjava/util/List;Lcom/zykj/evaluation/bean/PaperPosition;Ljava/lang/String;II)Le7/b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "g", "()J", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lcom/zykj/evaluation/bean/PaperPosition;", "f", "()Lcom/zykj/evaluation/bean/PaperPosition;", "d", "Ljava/lang/String;", "e", "I", "h", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* renamed from: e7.b, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class AnswerCorrectData {

    /* renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("questionId")
    private final long questionId;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("answerData")
    private final List<AnswerData> answerData;

    /* renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName(RequestParameters.POSITION)
    private final PaperPosition position;

    /* renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("groupKey")
    private final String groupKey;

    /* renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY)
    private final int type;

    /* renamed from: f, reason: from kotlin metadata and from toString */
    @SerializedName("numericalOrder")
    private final int numericalOrder;

    public AnswerCorrectData(long j10, List answerData, PaperPosition position, String groupKey, int i10, int i11) {
        Intrinsics.checkNotNullParameter(answerData, "answerData");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(groupKey, "groupKey");
        this.questionId = j10;
        this.answerData = answerData;
        this.position = position;
        this.groupKey = groupKey;
        this.type = i10;
        this.numericalOrder = i11;
    }

    /* renamed from: b */
    public static /* synthetic */ AnswerCorrectData m11801b(AnswerCorrectData answerCorrectData, long j10, List list, PaperPosition paperPosition, String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j10 = answerCorrectData.questionId;
        }
        long j11 = j10;
        if ((i12 & 2) != 0) {
            list = answerCorrectData.answerData;
        }
        List list2 = list;
        if ((i12 & 4) != 0) {
            paperPosition = answerCorrectData.position;
        }
        PaperPosition paperPosition2 = paperPosition;
        if ((i12 & 8) != 0) {
            str = answerCorrectData.groupKey;
        }
        String str2 = str;
        if ((i12 & 16) != 0) {
            i10 = answerCorrectData.type;
        }
        int i13 = i10;
        if ((i12 & 32) != 0) {
            i11 = answerCorrectData.numericalOrder;
        }
        return answerCorrectData.m11802a(j11, list2, paperPosition2, str2, i13, i11);
    }

    /* renamed from: a */
    public final AnswerCorrectData m11802a(long questionId, List answerData, PaperPosition position, String groupKey, int type, int numericalOrder) {
        Intrinsics.checkNotNullParameter(answerData, "answerData");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(groupKey, "groupKey");
        return new AnswerCorrectData(questionId, answerData, position, groupKey, type, numericalOrder);
    }

    /* renamed from: c, reason: from getter */
    public final List getAnswerData() {
        return this.answerData;
    }

    /* renamed from: d, reason: from getter */
    public final String getGroupKey() {
        return this.groupKey;
    }

    /* renamed from: e, reason: from getter */
    public final int getNumericalOrder() {
        return this.numericalOrder;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnswerCorrectData)) {
            return false;
        }
        AnswerCorrectData answerCorrectData = (AnswerCorrectData) other;
        return this.questionId == answerCorrectData.questionId && Intrinsics.areEqual(this.answerData, answerCorrectData.answerData) && Intrinsics.areEqual(this.position, answerCorrectData.position) && Intrinsics.areEqual(this.groupKey, answerCorrectData.groupKey) && this.type == answerCorrectData.type && this.numericalOrder == answerCorrectData.numericalOrder;
    }

    /* renamed from: f, reason: from getter */
    public final PaperPosition getPosition() {
        return this.position;
    }

    /* renamed from: g, reason: from getter */
    public final long getQuestionId() {
        return this.questionId;
    }

    /* renamed from: h, reason: from getter */
    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((Long.hashCode(this.questionId) * 31) + this.answerData.hashCode()) * 31) + this.position.hashCode()) * 31) + this.groupKey.hashCode()) * 31) + Integer.hashCode(this.type)) * 31) + Integer.hashCode(this.numericalOrder);
    }

    public String toString() {
        return "AnswerCorrectData(questionId=" + this.questionId + ", answerData=" + this.answerData + ", position=" + this.position + ", groupKey=" + this.groupKey + ", type=" + this.type + ", numericalOrder=" + this.numericalOrder + ")";
    }
}
