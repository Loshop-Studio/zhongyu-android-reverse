package com.zykj.student.dialogue.bean.req;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Metadata(m13412d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/req/MessageStateReq;", "", "sessionId", "", "messageId", "", "state", "", "<init>", "(ILjava/lang/String;Z)V", "getSessionId", "()I", "getMessageId", "()Ljava/lang/String;", "getState", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final /* data */ class MessageStateReq {
    public static final int $stable = 0;
    private final String messageId;
    private final int sessionId;
    private final boolean state;

    public MessageStateReq(int i9, String messageId, boolean z9) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.sessionId = i9;
        this.messageId = messageId;
        this.state = z9;
    }

    public static /* synthetic */ MessageStateReq copy$default(MessageStateReq messageStateReq, int i9, String str, boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i9 = messageStateReq.sessionId;
        }
        if ((i10 & 2) != 0) {
            str = messageStateReq.messageId;
        }
        if ((i10 & 4) != 0) {
            z9 = messageStateReq.state;
        }
        return messageStateReq.copy(i9, str, z9);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getState() {
        return this.state;
    }

    public final MessageStateReq copy(int sessionId, String messageId, boolean state) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        return new MessageStateReq(sessionId, messageId, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageStateReq)) {
            return false;
        }
        MessageStateReq messageStateReq = (MessageStateReq) other;
        return this.sessionId == messageStateReq.sessionId && Intrinsics.areEqual(this.messageId, messageStateReq.messageId) && this.state == messageStateReq.state;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final int getSessionId() {
        return this.sessionId;
    }

    public final boolean getState() {
        return this.state;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.sessionId) * 31) + this.messageId.hashCode()) * 31) + Boolean.hashCode(this.state);
    }

    public String toString() {
        return "MessageStateReq(sessionId=" + this.sessionId + ", messageId=" + this.messageId + ", state=" + this.state + ")";
    }
}
