package p079e7;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.zykj.evaluation.bean.PaperBlank;
import com.zykj.evaluation.bean.PaperSelect;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJF\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\"¨\u0006#"}, m13558d2 = {"Le7/c;", "", "", "uuid", "answer", "Lcom/zykj/evaluation/bean/PaperSelect;", "select", "", "order", "Lcom/zykj/evaluation/bean/PaperBlank;", "blank", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/bean/PaperSelect;ILcom/zykj/evaluation/bean/PaperBlank;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/bean/PaperSelect;ILcom/zykj/evaluation/bean/PaperBlank;)Le7/c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "g", "b", "c", "Lcom/zykj/evaluation/bean/PaperSelect;", "f", "()Lcom/zykj/evaluation/bean/PaperSelect;", "d", "I", "e", "Lcom/zykj/evaluation/bean/PaperBlank;", "()Lcom/zykj/evaluation/bean/PaperBlank;", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* renamed from: e7.c, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class AnswerData {

    /* renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("uuid")
    private final String uuid;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("answer")
    private final String answer;

    /* renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("select")
    private final PaperSelect select;

    /* renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("order")
    private final int order;

    /* renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("blank")
    private final PaperBlank blank;

    public AnswerData() {
        this(null, null, null, 0, null, 31, null);
    }

    /* renamed from: b */
    public static /* synthetic */ AnswerData m11820b(AnswerData answerData, String str, String str2, PaperSelect paperSelect, int i10, PaperBlank paperBlank, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = answerData.uuid;
        }
        if ((i11 & 2) != 0) {
            str2 = answerData.answer;
        }
        if ((i11 & 4) != 0) {
            paperSelect = answerData.select;
        }
        if ((i11 & 8) != 0) {
            i10 = answerData.order;
        }
        if ((i11 & 16) != 0) {
            paperBlank = answerData.blank;
        }
        PaperBlank paperBlank2 = paperBlank;
        PaperSelect paperSelect2 = paperSelect;
        return answerData.m11821a(str, str2, paperSelect2, i10, paperBlank2);
    }

    /* renamed from: a */
    public final AnswerData m11821a(String uuid, String answer, PaperSelect select, int order, PaperBlank blank) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(answer, "answer");
        return new AnswerData(uuid, answer, select, order, blank);
    }

    /* renamed from: c, reason: from getter */
    public final String getAnswer() {
        return this.answer;
    }

    /* renamed from: d, reason: from getter */
    public final PaperBlank getBlank() {
        return this.blank;
    }

    /* renamed from: e, reason: from getter */
    public final int getOrder() {
        return this.order;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnswerData)) {
            return false;
        }
        AnswerData answerData = (AnswerData) other;
        return Intrinsics.areEqual(this.uuid, answerData.uuid) && Intrinsics.areEqual(this.answer, answerData.answer) && Intrinsics.areEqual(this.select, answerData.select) && this.order == answerData.order && Intrinsics.areEqual(this.blank, answerData.blank);
    }

    /* renamed from: f, reason: from getter */
    public final PaperSelect getSelect() {
        return this.select;
    }

    /* renamed from: g, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        int iHashCode = ((this.uuid.hashCode() * 31) + this.answer.hashCode()) * 31;
        PaperSelect paperSelect = this.select;
        int iHashCode2 = (((iHashCode + (paperSelect == null ? 0 : paperSelect.hashCode())) * 31) + Integer.hashCode(this.order)) * 31;
        PaperBlank paperBlank = this.blank;
        return iHashCode2 + (paperBlank != null ? paperBlank.hashCode() : 0);
    }

    public String toString() {
        return "AnswerData(uuid=" + this.uuid + ", answer=" + this.answer + ", select=" + this.select + ", order=" + this.order + ", blank=" + this.blank + ")";
    }

    public AnswerData(String uuid, String answer, PaperSelect paperSelect, int i10, PaperBlank paperBlank) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(answer, "answer");
        this.uuid = uuid;
        this.answer = answer;
        this.select = paperSelect;
        this.order = i10;
        this.blank = paperBlank;
    }

    public /* synthetic */ AnswerData(String str, String str2, PaperSelect paperSelect, int i10, PaperBlank paperBlank, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? null : paperSelect, (i11 & 8) != 0 ? 0 : i10, (i11 & 16) != 0 ? null : paperBlank);
    }
}
