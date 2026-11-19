package com.zykj.student.dialogue.bean.resp;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Keep
@Metadata(m13412d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b8\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00105\u001a\u00020\bHÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J¿\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u0003HÆ\u0001J\u0013\u0010<\u001a\u00020\u00032\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020\bHÖ\u0001J\t\u0010?\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0019R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0011\u0010\u0010\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0016\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0019¨\u0006@"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/MessageResponse;", "", "checked", "", "id", "", "sessionId", "userId", "", "userName", "msgFlag", "snapshot", "content", "sendTime", "isPrimary", "userPhoto", "applauds", "read", "readTime", "applaud", "applaudTime", "isDelete", "<init>", "(ZLjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;IZLjava/lang/String;ZLjava/lang/String;Z)V", "getChecked", "()Z", "getId", "()Ljava/lang/String;", "getSessionId", "getUserId", "()I", "getUserName", "getMsgFlag", "getSnapshot", "getContent", "getSendTime", "getUserPhoto", "getApplauds", "getRead", "getReadTime", "getApplaud", "getApplaudTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "equals", "other", "hashCode", "toString", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final /* data */ class MessageResponse {
    public static final int $stable = 0;
    private final boolean applaud;
    private final String applaudTime;
    private final int applauds;
    private final boolean checked;
    private final String content;
    private final String id;

    @SerializedName("disabled")
    private final boolean isDelete;
    private final boolean isPrimary;
    private final int msgFlag;
    private final boolean read;
    private final String readTime;
    private final String sendTime;
    private final String sessionId;
    private final String snapshot;
    private final int userId;
    private final String userName;
    private final String userPhoto;

    public MessageResponse(boolean z9, String id, String str, int i9, String userName, int i10, String str2, String content, String str3, boolean z10, String str4, int i11, boolean z11, String str5, boolean z12, String str6, boolean z13) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(content, "content");
        this.checked = z9;
        this.id = id;
        this.sessionId = str;
        this.userId = i9;
        this.userName = userName;
        this.msgFlag = i10;
        this.snapshot = str2;
        this.content = content;
        this.sendTime = str3;
        this.isPrimary = z10;
        this.userPhoto = str4;
        this.applauds = i11;
        this.read = z11;
        this.readTime = str5;
        this.applaud = z12;
        this.applaudTime = str6;
        this.isDelete = z13;
    }

    public static /* synthetic */ MessageResponse copy$default(MessageResponse messageResponse, boolean z9, String str, String str2, int i9, String str3, int i10, String str4, String str5, String str6, boolean z10, String str7, int i11, boolean z11, String str8, boolean z12, String str9, boolean z13, int i12, Object obj) {
        boolean z14;
        String str10;
        boolean z15;
        MessageResponse messageResponse2;
        boolean z16;
        String str11;
        String str12;
        int i13;
        String str13;
        int i14;
        String str14;
        String str15;
        String str16;
        boolean z17;
        String str17;
        int i15;
        boolean z18;
        String str18;
        boolean z19 = (i12 & 1) != 0 ? messageResponse.checked : z9;
        String str19 = (i12 & 2) != 0 ? messageResponse.id : str;
        String str20 = (i12 & 4) != 0 ? messageResponse.sessionId : str2;
        int i16 = (i12 & 8) != 0 ? messageResponse.userId : i9;
        String str21 = (i12 & 16) != 0 ? messageResponse.userName : str3;
        int i17 = (i12 & 32) != 0 ? messageResponse.msgFlag : i10;
        String str22 = (i12 & 64) != 0 ? messageResponse.snapshot : str4;
        String str23 = (i12 & 128) != 0 ? messageResponse.content : str5;
        String str24 = (i12 & 256) != 0 ? messageResponse.sendTime : str6;
        boolean z20 = (i12 & 512) != 0 ? messageResponse.isPrimary : z10;
        String str25 = (i12 & 1024) != 0 ? messageResponse.userPhoto : str7;
        int i18 = (i12 & 2048) != 0 ? messageResponse.applauds : i11;
        boolean z21 = (i12 & 4096) != 0 ? messageResponse.read : z11;
        String str26 = (i12 & 8192) != 0 ? messageResponse.readTime : str8;
        boolean z22 = z19;
        boolean z23 = (i12 & 16384) != 0 ? messageResponse.applaud : z12;
        String str27 = (i12 & 32768) != 0 ? messageResponse.applaudTime : str9;
        if ((i12 & 65536) != 0) {
            str10 = str27;
            z14 = messageResponse.isDelete;
            z16 = z23;
            str11 = str19;
            str12 = str20;
            i13 = i16;
            str13 = str21;
            i14 = i17;
            str14 = str22;
            str15 = str23;
            str16 = str24;
            z17 = z20;
            str17 = str25;
            i15 = i18;
            z18 = z21;
            str18 = str26;
            z15 = z22;
            messageResponse2 = messageResponse;
        } else {
            z14 = z13;
            str10 = str27;
            z15 = z22;
            messageResponse2 = messageResponse;
            z16 = z23;
            str11 = str19;
            str12 = str20;
            i13 = i16;
            str13 = str21;
            i14 = i17;
            str14 = str22;
            str15 = str23;
            str16 = str24;
            z17 = z20;
            str17 = str25;
            i15 = i18;
            z18 = z21;
            str18 = str26;
        }
        return messageResponse2.copy(z15, str11, str12, i13, str13, i14, str14, str15, str16, z17, str17, i15, z18, str18, z16, str10, z14);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getChecked() {
        return this.checked;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsPrimary() {
        return this.isPrimary;
    }

    /* renamed from: component11, reason: from getter */
    public final String getUserPhoto() {
        return this.userPhoto;
    }

    /* renamed from: component12, reason: from getter */
    public final int getApplauds() {
        return this.applauds;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    /* renamed from: component14, reason: from getter */
    public final String getReadTime() {
        return this.readTime;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getApplaud() {
        return this.applaud;
    }

    /* renamed from: component16, reason: from getter */
    public final String getApplaudTime() {
        return this.applaudTime;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getIsDelete() {
        return this.isDelete;
    }

    /* renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component4, reason: from getter */
    public final int getUserId() {
        return this.userId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    /* renamed from: component6, reason: from getter */
    public final int getMsgFlag() {
        return this.msgFlag;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSnapshot() {
        return this.snapshot;
    }

    /* renamed from: component8, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component9, reason: from getter */
    public final String getSendTime() {
        return this.sendTime;
    }

    public final MessageResponse copy(boolean checked, String id, String sessionId, int userId, String userName, int msgFlag, String snapshot, String content, String sendTime, boolean isPrimary, String userPhoto, int applauds, boolean read, String readTime, boolean applaud, String applaudTime, boolean isDelete) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(content, "content");
        return new MessageResponse(checked, id, sessionId, userId, userName, msgFlag, snapshot, content, sendTime, isPrimary, userPhoto, applauds, read, readTime, applaud, applaudTime, isDelete);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageResponse)) {
            return false;
        }
        MessageResponse messageResponse = (MessageResponse) other;
        return this.checked == messageResponse.checked && Intrinsics.areEqual(this.id, messageResponse.id) && Intrinsics.areEqual(this.sessionId, messageResponse.sessionId) && this.userId == messageResponse.userId && Intrinsics.areEqual(this.userName, messageResponse.userName) && this.msgFlag == messageResponse.msgFlag && Intrinsics.areEqual(this.snapshot, messageResponse.snapshot) && Intrinsics.areEqual(this.content, messageResponse.content) && Intrinsics.areEqual(this.sendTime, messageResponse.sendTime) && this.isPrimary == messageResponse.isPrimary && Intrinsics.areEqual(this.userPhoto, messageResponse.userPhoto) && this.applauds == messageResponse.applauds && this.read == messageResponse.read && Intrinsics.areEqual(this.readTime, messageResponse.readTime) && this.applaud == messageResponse.applaud && Intrinsics.areEqual(this.applaudTime, messageResponse.applaudTime) && this.isDelete == messageResponse.isDelete;
    }

    public final boolean getApplaud() {
        return this.applaud;
    }

    public final String getApplaudTime() {
        return this.applaudTime;
    }

    public final int getApplauds() {
        return this.applauds;
    }

    public final boolean getChecked() {
        return this.checked;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getId() {
        return this.id;
    }

    public final int getMsgFlag() {
        return this.msgFlag;
    }

    public final boolean getRead() {
        return this.read;
    }

    public final String getReadTime() {
        return this.readTime;
    }

    public final String getSendTime() {
        return this.sendTime;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getSnapshot() {
        return this.snapshot;
    }

    public final int getUserId() {
        return this.userId;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final String getUserPhoto() {
        return this.userPhoto;
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.checked) * 31) + this.id.hashCode()) * 31;
        String str = this.sessionId;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.userId)) * 31) + this.userName.hashCode()) * 31) + Integer.hashCode(this.msgFlag)) * 31;
        String str2 = this.snapshot;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.content.hashCode()) * 31;
        String str3 = this.sendTime;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.isPrimary)) * 31;
        String str4 = this.userPhoto;
        int iHashCode5 = (((((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + Integer.hashCode(this.applauds)) * 31) + Boolean.hashCode(this.read)) * 31;
        String str5 = this.readTime;
        int iHashCode6 = (((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + Boolean.hashCode(this.applaud)) * 31;
        String str6 = this.applaudTime;
        return ((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + Boolean.hashCode(this.isDelete);
    }

    public final boolean isDelete() {
        return this.isDelete;
    }

    public final boolean isPrimary() {
        return this.isPrimary;
    }

    public String toString() {
        return "MessageResponse(checked=" + this.checked + ", id=" + this.id + ", sessionId=" + this.sessionId + ", userId=" + this.userId + ", userName=" + this.userName + ", msgFlag=" + this.msgFlag + ", snapshot=" + this.snapshot + ", content=" + this.content + ", sendTime=" + this.sendTime + ", isPrimary=" + this.isPrimary + ", userPhoto=" + this.userPhoto + ", applauds=" + this.applauds + ", read=" + this.read + ", readTime=" + this.readTime + ", applaud=" + this.applaud + ", applaudTime=" + this.applaudTime + ", isDelete=" + this.isDelete + ")";
    }
}
