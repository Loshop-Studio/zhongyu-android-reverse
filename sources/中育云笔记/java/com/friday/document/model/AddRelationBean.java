package com.friday.document.model;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class AddRelationBean {
    public static final int $stable = 0;
    private final long shareId;
    private final long shareUserId;

    public AddRelationBean(long j10, long j11) {
        this.shareId = j10;
        this.shareUserId = j11;
    }

    public static /* synthetic */ AddRelationBean copy$default(AddRelationBean addRelationBean, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = addRelationBean.shareId;
        }
        if ((i10 & 2) != 0) {
            j11 = addRelationBean.shareUserId;
        }
        return addRelationBean.copy(j10, j11);
    }

    public final long component1() {
        return this.shareId;
    }

    public final long component2() {
        return this.shareUserId;
    }

    public final AddRelationBean copy(long j10, long j11) {
        return new AddRelationBean(j10, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddRelationBean)) {
            return false;
        }
        AddRelationBean addRelationBean = (AddRelationBean) obj;
        return this.shareId == addRelationBean.shareId && this.shareUserId == addRelationBean.shareUserId;
    }

    public final long getShareId() {
        return this.shareId;
    }

    public final long getShareUserId() {
        return this.shareUserId;
    }

    public int hashCode() {
        return (Long.hashCode(this.shareId) * 31) + Long.hashCode(this.shareUserId);
    }

    public String toString() {
        return "AddRelationBean(shareId=" + this.shareId + ", shareUserId=" + this.shareUserId + ")";
    }
}
