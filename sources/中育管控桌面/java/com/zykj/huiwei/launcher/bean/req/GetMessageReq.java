package com.zykj.huiwei.launcher.bean.req;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003JK\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0007HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017¨\u0006("}, m7880d2 = {"Lcom/zykj/huiwei/launcher/bean/req/GetMessageReq;", "", "title", "", "publishTimeFrom", "publishTimeTo", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "skipCount", "maxResultCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "getPublishTimeFrom", "setPublishTimeFrom", "getPublishTimeTo", "setPublishTimeTo", "getType", "()I", "setType", "(I)V", "getSkipCount", "setSkipCount", "getMaxResultCount", "setMaxResultCount", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GetMessageReq {
    public static final int $stable = 8;
    private int maxResultCount;
    private String publishTimeFrom;
    private String publishTimeTo;
    private int skipCount;
    private String title;
    private int type;

    public GetMessageReq() {
        this(null, null, null, 0, 0, 0, 63, null);
    }

    public static /* synthetic */ GetMessageReq copy$default(GetMessageReq getMessageReq, String str, String str2, String str3, int i6, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = getMessageReq.title;
        }
        if ((i9 & 2) != 0) {
            str2 = getMessageReq.publishTimeFrom;
        }
        if ((i9 & 4) != 0) {
            str3 = getMessageReq.publishTimeTo;
        }
        if ((i9 & 8) != 0) {
            i6 = getMessageReq.type;
        }
        if ((i9 & 16) != 0) {
            i7 = getMessageReq.skipCount;
        }
        if ((i9 & 32) != 0) {
            i8 = getMessageReq.maxResultCount;
        }
        int i10 = i7;
        int i11 = i8;
        return getMessageReq.copy(str, str2, str3, i6, i10, i11);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPublishTimeFrom() {
        return this.publishTimeFrom;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPublishTimeTo() {
        return this.publishTimeTo;
    }

    /* renamed from: component4, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component5, reason: from getter */
    public final int getSkipCount() {
        return this.skipCount;
    }

    /* renamed from: component6, reason: from getter */
    public final int getMaxResultCount() {
        return this.maxResultCount;
    }

    public final GetMessageReq copy(String title, String publishTimeFrom, String publishTimeTo, int type, int skipCount, int maxResultCount) {
        return new GetMessageReq(title, publishTimeFrom, publishTimeTo, type, skipCount, maxResultCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetMessageReq)) {
            return false;
        }
        GetMessageReq getMessageReq = (GetMessageReq) other;
        return Intrinsics.areEqual(this.title, getMessageReq.title) && Intrinsics.areEqual(this.publishTimeFrom, getMessageReq.publishTimeFrom) && Intrinsics.areEqual(this.publishTimeTo, getMessageReq.publishTimeTo) && this.type == getMessageReq.type && this.skipCount == getMessageReq.skipCount && this.maxResultCount == getMessageReq.maxResultCount;
    }

    public final int getMaxResultCount() {
        return this.maxResultCount;
    }

    public final String getPublishTimeFrom() {
        return this.publishTimeFrom;
    }

    public final String getPublishTimeTo() {
        return this.publishTimeTo;
    }

    public final int getSkipCount() {
        return this.skipCount;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.publishTimeFrom;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.publishTimeTo;
        return ((((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.hashCode(this.type)) * 31) + Integer.hashCode(this.skipCount)) * 31) + Integer.hashCode(this.maxResultCount);
    }

    public final void setMaxResultCount(int i6) {
        this.maxResultCount = i6;
    }

    public final void setPublishTimeFrom(String str) {
        this.publishTimeFrom = str;
    }

    public final void setPublishTimeTo(String str) {
        this.publishTimeTo = str;
    }

    public final void setSkipCount(int i6) {
        this.skipCount = i6;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setType(int i6) {
        this.type = i6;
    }

    public String toString() {
        return "GetMessageReq(title=" + this.title + ", publishTimeFrom=" + this.publishTimeFrom + ", publishTimeTo=" + this.publishTimeTo + ", type=" + this.type + ", skipCount=" + this.skipCount + ", maxResultCount=" + this.maxResultCount + ")";
    }

    public GetMessageReq(String str, String str2, String str3, int i6, int i7, int i8) {
        this.title = str;
        this.publishTimeFrom = str2;
        this.publishTimeTo = str3;
        this.type = i6;
        this.skipCount = i7;
        this.maxResultCount = i8;
    }

    public /* synthetic */ GetMessageReq(String str, String str2, String str3, int i6, int i7, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? null : str, (i9 & 2) != 0 ? null : str2, (i9 & 4) != 0 ? null : str3, (i9 & 8) != 0 ? 3 : i6, (i9 & 16) != 0 ? 0 : i7, (i9 & 32) != 0 ? 5 : i8);
    }
}
