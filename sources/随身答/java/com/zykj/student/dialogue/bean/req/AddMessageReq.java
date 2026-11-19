package com.zykj.student.dialogue.bean.req;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Keep
@Metadata(m13412d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/req/AddMessageReq;", "", "sessionId", "", "snapshot", "content", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSessionId", "()Ljava/lang/String;", "setSessionId", "(Ljava/lang/String;)V", "getSnapshot", "setSnapshot", "getContent", "setContent", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final /* data */ class AddMessageReq {
    public static final int $stable = 8;
    private String content;
    private String sessionId;
    private String snapshot;

    public AddMessageReq(String sessionId, String snapshot, String content) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Intrinsics.checkNotNullParameter(content, "content");
        this.sessionId = sessionId;
        this.snapshot = snapshot;
        this.content = content;
    }

    public static /* synthetic */ AddMessageReq copy$default(AddMessageReq addMessageReq, String str, String str2, String str3, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = addMessageReq.sessionId;
        }
        if ((i9 & 2) != 0) {
            str2 = addMessageReq.snapshot;
        }
        if ((i9 & 4) != 0) {
            str3 = addMessageReq.content;
        }
        return addMessageReq.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSnapshot() {
        return this.snapshot;
    }

    /* renamed from: component3, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    public final AddMessageReq copy(String sessionId, String snapshot, String content) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Intrinsics.checkNotNullParameter(content, "content");
        return new AddMessageReq(sessionId, snapshot, content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddMessageReq)) {
            return false;
        }
        AddMessageReq addMessageReq = (AddMessageReq) other;
        return Intrinsics.areEqual(this.sessionId, addMessageReq.sessionId) && Intrinsics.areEqual(this.snapshot, addMessageReq.snapshot) && Intrinsics.areEqual(this.content, addMessageReq.content);
    }

    public final String getContent() {
        return this.content;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getSnapshot() {
        return this.snapshot;
    }

    public int hashCode() {
        return (((this.sessionId.hashCode() * 31) + this.snapshot.hashCode()) * 31) + this.content.hashCode();
    }

    public final void setContent(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.content = str;
    }

    public final void setSessionId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sessionId = str;
    }

    public final void setSnapshot(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.snapshot = str;
    }

    public String toString() {
        return "AddMessageReq(sessionId=" + this.sessionId + ", snapshot=" + this.snapshot + ", content=" + this.content + ")";
    }
}
