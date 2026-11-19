package com.zykj.student.dialogue.bean.resp;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Metadata(m13412d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/SubjectResp;", "", "topicId", "", "topicName", "", "<init>", "(ILjava/lang/String;)V", "getTopicId", "()I", "getTopicName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final /* data */ class SubjectResp {
    public static final int $stable = 0;
    private final int topicId;
    private final String topicName;

    public SubjectResp(int i9, String topicName) {
        Intrinsics.checkNotNullParameter(topicName, "topicName");
        this.topicId = i9;
        this.topicName = topicName;
    }

    public static /* synthetic */ SubjectResp copy$default(SubjectResp subjectResp, int i9, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i9 = subjectResp.topicId;
        }
        if ((i10 & 2) != 0) {
            str = subjectResp.topicName;
        }
        return subjectResp.copy(i9, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTopicId() {
        return this.topicId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTopicName() {
        return this.topicName;
    }

    public final SubjectResp copy(int topicId, String topicName) {
        Intrinsics.checkNotNullParameter(topicName, "topicName");
        return new SubjectResp(topicId, topicName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubjectResp)) {
            return false;
        }
        SubjectResp subjectResp = (SubjectResp) other;
        return this.topicId == subjectResp.topicId && Intrinsics.areEqual(this.topicName, subjectResp.topicName);
    }

    public final int getTopicId() {
        return this.topicId;
    }

    public final String getTopicName() {
        return this.topicName;
    }

    public int hashCode() {
        return (Integer.hashCode(this.topicId) * 31) + this.topicName.hashCode();
    }

    public String toString() {
        return "SubjectResp(topicId=" + this.topicId + ", topicName=" + this.topicName + ")";
    }
}
