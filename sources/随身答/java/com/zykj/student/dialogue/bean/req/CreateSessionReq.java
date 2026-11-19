package com.zykj.student.dialogue.bean.req;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Keep
@Metadata(m13412d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0004HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/req/CreateSessionReq;", "", "answerUserIds", "", "", "courseId", "snapshot", "content", "summary", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAnswerUserIds", "()Ljava/util/List;", "getCourseId", "()Ljava/lang/String;", "getSnapshot", "getContent", "getSummary", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final /* data */ class CreateSessionReq {
    public static final int $stable = 8;
    private final List<String> answerUserIds;
    private final String content;
    private final String courseId;
    private final String snapshot;
    private final String summary;

    public CreateSessionReq(List<String> list, String courseId, String snapshot, String content, String str) {
        Intrinsics.checkNotNullParameter(courseId, "courseId");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Intrinsics.checkNotNullParameter(content, "content");
        this.answerUserIds = list;
        this.courseId = courseId;
        this.snapshot = snapshot;
        this.content = content;
        this.summary = str;
    }

    public static /* synthetic */ CreateSessionReq copy$default(CreateSessionReq createSessionReq, List list, String str, String str2, String str3, String str4, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            list = createSessionReq.answerUserIds;
        }
        if ((i9 & 2) != 0) {
            str = createSessionReq.courseId;
        }
        if ((i9 & 4) != 0) {
            str2 = createSessionReq.snapshot;
        }
        if ((i9 & 8) != 0) {
            str3 = createSessionReq.content;
        }
        if ((i9 & 16) != 0) {
            str4 = createSessionReq.summary;
        }
        String str5 = str4;
        String str6 = str2;
        return createSessionReq.copy(list, str, str6, str3, str5);
    }

    public final List<String> component1() {
        return this.answerUserIds;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCourseId() {
        return this.courseId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSnapshot() {
        return this.snapshot;
    }

    /* renamed from: component4, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    public final CreateSessionReq copy(List<String> answerUserIds, String courseId, String snapshot, String content, String summary) {
        Intrinsics.checkNotNullParameter(courseId, "courseId");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Intrinsics.checkNotNullParameter(content, "content");
        return new CreateSessionReq(answerUserIds, courseId, snapshot, content, summary);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateSessionReq)) {
            return false;
        }
        CreateSessionReq createSessionReq = (CreateSessionReq) other;
        return Intrinsics.areEqual(this.answerUserIds, createSessionReq.answerUserIds) && Intrinsics.areEqual(this.courseId, createSessionReq.courseId) && Intrinsics.areEqual(this.snapshot, createSessionReq.snapshot) && Intrinsics.areEqual(this.content, createSessionReq.content) && Intrinsics.areEqual(this.summary, createSessionReq.summary);
    }

    public final List<String> getAnswerUserIds() {
        return this.answerUserIds;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getCourseId() {
        return this.courseId;
    }

    public final String getSnapshot() {
        return this.snapshot;
    }

    public final String getSummary() {
        return this.summary;
    }

    public int hashCode() {
        List<String> list = this.answerUserIds;
        int iHashCode = (((((((list == null ? 0 : list.hashCode()) * 31) + this.courseId.hashCode()) * 31) + this.snapshot.hashCode()) * 31) + this.content.hashCode()) * 31;
        String str = this.summary;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "CreateSessionReq(answerUserIds=" + this.answerUserIds + ", courseId=" + this.courseId + ", snapshot=" + this.snapshot + ", content=" + this.content + ", summary=" + this.summary + ")";
    }
}
