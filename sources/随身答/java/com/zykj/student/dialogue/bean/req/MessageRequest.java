package com.zykj.student.dialogue.bean.req;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Metadata(m13412d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010¨\u0006\u001a"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/req/MessageRequest;", "", "sessionId", "", "skip", "", "take", "isCollectList", "", "<init>", "(Ljava/lang/String;IIZ)V", "getSessionId", "()Ljava/lang/String;", "getSkip", "()I", "getTake", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final /* data */ class MessageRequest {
    public static final int $stable = 0;

    @SerializedName("IsCollectList")
    private final boolean isCollectList;

    @SerializedName("SessionId")
    private final String sessionId;

    @SerializedName("Skip")
    private final int skip;

    @SerializedName("Take")
    private final int take;

    public MessageRequest(String sessionId, int i9, int i10, boolean z9) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.sessionId = sessionId;
        this.skip = i9;
        this.take = i10;
        this.isCollectList = z9;
    }

    public static /* synthetic */ MessageRequest copy$default(MessageRequest messageRequest, String str, int i9, int i10, boolean z9, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = messageRequest.sessionId;
        }
        if ((i11 & 2) != 0) {
            i9 = messageRequest.skip;
        }
        if ((i11 & 4) != 0) {
            i10 = messageRequest.take;
        }
        if ((i11 & 8) != 0) {
            z9 = messageRequest.isCollectList;
        }
        return messageRequest.copy(str, i9, i10, z9);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSkip() {
        return this.skip;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTake() {
        return this.take;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsCollectList() {
        return this.isCollectList;
    }

    public final MessageRequest copy(String sessionId, int skip, int take, boolean isCollectList) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        return new MessageRequest(sessionId, skip, take, isCollectList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageRequest)) {
            return false;
        }
        MessageRequest messageRequest = (MessageRequest) other;
        return Intrinsics.areEqual(this.sessionId, messageRequest.sessionId) && this.skip == messageRequest.skip && this.take == messageRequest.take && this.isCollectList == messageRequest.isCollectList;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final int getSkip() {
        return this.skip;
    }

    public final int getTake() {
        return this.take;
    }

    public int hashCode() {
        return (((((this.sessionId.hashCode() * 31) + Integer.hashCode(this.skip)) * 31) + Integer.hashCode(this.take)) * 31) + Boolean.hashCode(this.isCollectList);
    }

    public final boolean isCollectList() {
        return this.isCollectList;
    }

    public String toString() {
        return "MessageRequest(sessionId=" + this.sessionId + ", skip=" + this.skip + ", take=" + this.take + ", isCollectList=" + this.isCollectList + ")";
    }

    public /* synthetic */ MessageRequest(String str, int i9, int i10, boolean z9, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? 0 : i9, (i11 & 4) != 0 ? 1000 : i10, (i11 & 8) != 0 ? false : z9);
    }
}
