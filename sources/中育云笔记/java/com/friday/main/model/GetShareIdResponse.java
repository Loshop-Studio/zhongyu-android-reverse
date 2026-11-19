package com.friday.main.model;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class GetShareIdResponse {
    public static final int $stable = 0;
    private final long shareId;

    public GetShareIdResponse(long j10) {
        this.shareId = j10;
    }

    public static /* synthetic */ GetShareIdResponse copy$default(GetShareIdResponse getShareIdResponse, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = getShareIdResponse.shareId;
        }
        return getShareIdResponse.copy(j10);
    }

    public final long component1() {
        return this.shareId;
    }

    public final GetShareIdResponse copy(long j10) {
        return new GetShareIdResponse(j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetShareIdResponse) && this.shareId == ((GetShareIdResponse) obj).shareId;
    }

    public final long getShareId() {
        return this.shareId;
    }

    public int hashCode() {
        return Long.hashCode(this.shareId);
    }

    public String toString() {
        return "GetShareIdResponse(shareId=" + this.shareId + ")";
    }
}
