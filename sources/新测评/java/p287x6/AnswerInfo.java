package p287x6;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p267v6.AbstractC9696m0;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ>\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u001d\u0010\u0010R\u0011\u0010\"\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, m13558d2 = {"Lx6/a;", "", "", "uuid", "", "localAnswer", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "index", "<init>", "(Ljava/lang/String;Ljava/util/List;II)V", "a", "(Ljava/lang/String;Ljava/util/List;II)Lx6/a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "h", "(Ljava/util/List;)V", "c", "I", "e", "g", "()Z", "isBlank", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* renamed from: x6.a, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class AnswerInfo {

    /* renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("uuid")
    private final String uuid;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("localAnswer")
    private List<String> localAnswer;

    /* renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY)
    private final int type;

    /* renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("index")
    private final int index;

    public AnswerInfo() {
        this(null, null, 0, 0, 15, null);
    }

    /* renamed from: b */
    public static /* synthetic */ AnswerInfo m16514b(AnswerInfo answerInfo, String str, List list, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = answerInfo.uuid;
        }
        if ((i12 & 2) != 0) {
            list = answerInfo.localAnswer;
        }
        if ((i12 & 4) != 0) {
            i10 = answerInfo.type;
        }
        if ((i12 & 8) != 0) {
            i11 = answerInfo.index;
        }
        return answerInfo.m16515a(str, list, i10, i11);
    }

    /* renamed from: a */
    public final AnswerInfo m16515a(String uuid, List localAnswer, int type, int index) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(localAnswer, "localAnswer");
        return new AnswerInfo(uuid, localAnswer, type, index);
    }

    /* renamed from: c, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* renamed from: d, reason: from getter */
    public final List getLocalAnswer() {
        return this.localAnswer;
    }

    /* renamed from: e, reason: from getter */
    public final int getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnswerInfo)) {
            return false;
        }
        AnswerInfo answerInfo = (AnswerInfo) other;
        return Intrinsics.areEqual(this.uuid, answerInfo.uuid) && Intrinsics.areEqual(this.localAnswer, answerInfo.localAnswer) && this.type == answerInfo.type && this.index == answerInfo.index;
    }

    /* renamed from: f, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* renamed from: g */
    public final boolean m16520g() {
        return this.type == AbstractC9696m0.a.f17010b.m16209a() || this.type == AbstractC9696m0.b.f17011b.m16209a();
    }

    /* renamed from: h */
    public final void m16521h(List list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.localAnswer = list;
    }

    public int hashCode() {
        return (((((this.uuid.hashCode() * 31) + this.localAnswer.hashCode()) * 31) + Integer.hashCode(this.type)) * 31) + Integer.hashCode(this.index);
    }

    public String toString() {
        return "AnswerInfo(uuid=" + this.uuid + ", localAnswer=" + this.localAnswer + ", type=" + this.type + ", index=" + this.index + ")";
    }

    public AnswerInfo(String uuid, List localAnswer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(localAnswer, "localAnswer");
        this.uuid = uuid;
        this.localAnswer = localAnswer;
        this.type = i10;
        this.index = i11;
    }

    public /* synthetic */ AnswerInfo(String str, List list, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? CollectionsKt.emptyList() : list, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }
}
