package com.zykj.student.dialogue.bean.resp;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;

@Parcelize
@Keep
@Metadata(m13412d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b:\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B»\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0006\u00107\u001a\u00020\bJ\u0006\u00108\u001a\u00020\bJ\u0006\u00109\u001a\u00020\u001aJ\u0006\u0010:\u001a\u00020\bJ\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\t\u0010>\u001a\u00020\bHÆ\u0003J\t\u0010?\u001a\u00020\bHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010A\u001a\u00020\bHÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003J\t\u0010D\u001a\u00020\bHÆ\u0003J\t\u0010E\u001a\u00020\bHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010G\u001a\u00020\bHÆ\u0003J\t\u0010H\u001a\u00020\u0005HÆ\u0003J\t\u0010I\u001a\u00020\u0005HÆ\u0003J\t\u0010J\u001a\u00020\u0005HÆ\u0003J\t\u0010K\u001a\u00020\u0005HÆ\u0003J\t\u0010L\u001a\u00020\bHÆ\u0003J\t\u0010M\u001a\u00020\u0005HÆ\u0003J\t\u0010N\u001a\u00020\u0005HÆ\u0003J\t\u0010O\u001a\u00020\u001aHÆ\u0003J\t\u0010P\u001a\u00020\u001aHÆ\u0003Jé\u0001\u0010Q\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001aHÆ\u0001J\u0006\u0010R\u001a\u00020\u0005J\u0013\u0010S\u001a\u00020\u001a2\b\u0010T\u001a\u0004\u0018\u00010UHÖ\u0003J\t\u0010V\u001a\u00020\u0005HÖ\u0001J\t\u0010W\u001a\u00020\bHÖ\u0001J\u0016\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0013\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010!R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010$R\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010$R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010$R\u0016\u0010\u0011\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010$R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010!R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010!R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010!R\u0011\u0010\u0016\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b2\u0010$R\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010!R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u0010!R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u00105R\u0011\u0010\u001b\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b6\u00105¨\u0006]"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/QuestionResp;", "Landroid/os/Parcelable;", "id", "", "courseId", "", "askUserId", "askUserName", "", "createTime", "summary", "snapshot", "unRead", "primaryUnRead", "updateTime", "joinTime", "askUserPhoto", "className", "messages", "sentMessages", "members", "openCount", "topicName", "joinType", "state", "isCollect", "", "closed", "<init>", "(JIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/String;IIZZ)V", "getId", "()J", "getCourseId", "()I", "getAskUserId", "getAskUserName", "()Ljava/lang/String;", "getCreateTime", "getSummary", "getSnapshot", "getUnRead", "getPrimaryUnRead", "getUpdateTime", "getJoinTime", "getAskUserPhoto", "getClassName", "getMessages", "getSentMessages", "getMembers", "getOpenCount", "getTopicName", "getJoinType", "getState", "()Z", "getClosed", "fetchUpdatedTime", "fetchJoinedTime", "isUnderstood", "getFormatSummary", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Stable
/* loaded from: classes5.dex */
public final /* data */ class QuestionResp implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<QuestionResp> CREATOR = new Creator();
    private final int askUserId;
    private final String askUserName;
    private final String askUserPhoto;

    @SerializedName("class")
    private final String className;
    private final boolean closed;
    private final int courseId;
    private final String createTime;
    private final long id;
    private final boolean isCollect;
    private final String joinTime;
    private final int joinType;
    private final int members;
    private final int messages;
    private final int openCount;
    private final int primaryUnRead;
    private final int sentMessages;
    private final String snapshot;
    private final int state;
    private final String summary;
    private final String topicName;
    private final int unRead;
    private final String updateTime;

    @Metadata(m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Creator implements Parcelable.Creator<QuestionResp> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuestionResp createFromParcel(Parcel parcel) {
            boolean z9;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            long j9 = parcel.readLong();
            int i9 = parcel.readInt();
            int i10 = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i11 = parcel.readInt();
            int i12 = parcel.readInt();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            int i15 = parcel.readInt();
            int i16 = parcel.readInt();
            String string9 = parcel.readString();
            int i17 = parcel.readInt();
            int i18 = parcel.readInt();
            boolean z10 = false;
            if (parcel.readInt() != 0) {
                z9 = false;
                z10 = true;
            } else {
                z9 = false;
            }
            return new QuestionResp(j9, i9, i10, string, string2, string3, string4, i11, i12, string5, string6, string7, string8, i13, i14, i15, i16, string9, i17, i18, z10, parcel.readInt() == 0 ? z9 : true);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuestionResp[] newArray(int i9) {
            return new QuestionResp[i9];
        }
    }

    public QuestionResp(long j9, int i9, int i10, String askUserName, String createTime, String str, String snapshot, int i11, int i12, String updateTime, String joinTime, String str2, String className, int i13, int i14, int i15, int i16, String topicName, int i17, int i18, boolean z9, boolean z10) {
        Intrinsics.checkNotNullParameter(askUserName, "askUserName");
        Intrinsics.checkNotNullParameter(createTime, "createTime");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Intrinsics.checkNotNullParameter(updateTime, "updateTime");
        Intrinsics.checkNotNullParameter(joinTime, "joinTime");
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(topicName, "topicName");
        this.id = j9;
        this.courseId = i9;
        this.askUserId = i10;
        this.askUserName = askUserName;
        this.createTime = createTime;
        this.summary = str;
        this.snapshot = snapshot;
        this.unRead = i11;
        this.primaryUnRead = i12;
        this.updateTime = updateTime;
        this.joinTime = joinTime;
        this.askUserPhoto = str2;
        this.className = className;
        this.messages = i13;
        this.sentMessages = i14;
        this.members = i15;
        this.openCount = i16;
        this.topicName = topicName;
        this.joinType = i17;
        this.state = i18;
        this.isCollect = z9;
        this.closed = z10;
    }

    public static /* synthetic */ QuestionResp copy$default(QuestionResp questionResp, long j9, int i9, int i10, String str, String str2, String str3, String str4, int i11, int i12, String str5, String str6, String str7, String str8, int i13, int i14, int i15, int i16, String str9, int i17, int i18, boolean z9, boolean z10, int i19, Object obj) {
        boolean z11;
        boolean z12;
        long j10 = (i19 & 1) != 0 ? questionResp.id : j9;
        int i20 = (i19 & 2) != 0 ? questionResp.courseId : i9;
        int i21 = (i19 & 4) != 0 ? questionResp.askUserId : i10;
        String str10 = (i19 & 8) != 0 ? questionResp.askUserName : str;
        String str11 = (i19 & 16) != 0 ? questionResp.createTime : str2;
        String str12 = (i19 & 32) != 0 ? questionResp.summary : str3;
        String str13 = (i19 & 64) != 0 ? questionResp.snapshot : str4;
        int i22 = (i19 & 128) != 0 ? questionResp.unRead : i11;
        int i23 = (i19 & 256) != 0 ? questionResp.primaryUnRead : i12;
        String str14 = (i19 & 512) != 0 ? questionResp.updateTime : str5;
        String str15 = (i19 & 1024) != 0 ? questionResp.joinTime : str6;
        String str16 = (i19 & 2048) != 0 ? questionResp.askUserPhoto : str7;
        String str17 = (i19 & 4096) != 0 ? questionResp.className : str8;
        long j11 = j10;
        int i24 = (i19 & 8192) != 0 ? questionResp.messages : i13;
        int i25 = (i19 & 16384) != 0 ? questionResp.sentMessages : i14;
        int i26 = (i19 & 32768) != 0 ? questionResp.members : i15;
        int i27 = (i19 & 65536) != 0 ? questionResp.openCount : i16;
        String str18 = (i19 & 131072) != 0 ? questionResp.topicName : str9;
        int i28 = (i19 & 262144) != 0 ? questionResp.joinType : i17;
        int i29 = (i19 & 524288) != 0 ? questionResp.state : i18;
        boolean z13 = (i19 & 1048576) != 0 ? questionResp.isCollect : z9;
        if ((i19 & 2097152) != 0) {
            z12 = z13;
            z11 = questionResp.closed;
        } else {
            z11 = z10;
            z12 = z13;
        }
        return questionResp.copy(j11, i20, i21, str10, str11, str12, str13, i22, i23, str14, str15, str16, str17, i24, i25, i26, i27, str18, i28, i29, z12, z11);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getUpdateTime() {
        return this.updateTime;
    }

    /* renamed from: component11, reason: from getter */
    public final String getJoinTime() {
        return this.joinTime;
    }

    /* renamed from: component12, reason: from getter */
    public final String getAskUserPhoto() {
        return this.askUserPhoto;
    }

    /* renamed from: component13, reason: from getter */
    public final String getClassName() {
        return this.className;
    }

    /* renamed from: component14, reason: from getter */
    public final int getMessages() {
        return this.messages;
    }

    /* renamed from: component15, reason: from getter */
    public final int getSentMessages() {
        return this.sentMessages;
    }

    /* renamed from: component16, reason: from getter */
    public final int getMembers() {
        return this.members;
    }

    /* renamed from: component17, reason: from getter */
    public final int getOpenCount() {
        return this.openCount;
    }

    /* renamed from: component18, reason: from getter */
    public final String getTopicName() {
        return this.topicName;
    }

    /* renamed from: component19, reason: from getter */
    public final int getJoinType() {
        return this.joinType;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCourseId() {
        return this.courseId;
    }

    /* renamed from: component20, reason: from getter */
    public final int getState() {
        return this.state;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getIsCollect() {
        return this.isCollect;
    }

    /* renamed from: component22, reason: from getter */
    public final boolean getClosed() {
        return this.closed;
    }

    /* renamed from: component3, reason: from getter */
    public final int getAskUserId() {
        return this.askUserId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAskUserName() {
        return this.askUserName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCreateTime() {
        return this.createTime;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSnapshot() {
        return this.snapshot;
    }

    /* renamed from: component8, reason: from getter */
    public final int getUnRead() {
        return this.unRead;
    }

    /* renamed from: component9, reason: from getter */
    public final int getPrimaryUnRead() {
        return this.primaryUnRead;
    }

    public final QuestionResp copy(long id, int courseId, int askUserId, String askUserName, String createTime, String summary, String snapshot, int unRead, int primaryUnRead, String updateTime, String joinTime, String askUserPhoto, String className, int messages, int sentMessages, int members, int openCount, String topicName, int joinType, int state, boolean isCollect, boolean closed) {
        Intrinsics.checkNotNullParameter(askUserName, "askUserName");
        Intrinsics.checkNotNullParameter(createTime, "createTime");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Intrinsics.checkNotNullParameter(updateTime, "updateTime");
        Intrinsics.checkNotNullParameter(joinTime, "joinTime");
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(topicName, "topicName");
        return new QuestionResp(id, courseId, askUserId, askUserName, createTime, summary, snapshot, unRead, primaryUnRead, updateTime, joinTime, askUserPhoto, className, messages, sentMessages, members, openCount, topicName, joinType, state, isCollect, closed);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuestionResp)) {
            return false;
        }
        QuestionResp questionResp = (QuestionResp) other;
        return this.id == questionResp.id && this.courseId == questionResp.courseId && this.askUserId == questionResp.askUserId && Intrinsics.areEqual(this.askUserName, questionResp.askUserName) && Intrinsics.areEqual(this.createTime, questionResp.createTime) && Intrinsics.areEqual(this.summary, questionResp.summary) && Intrinsics.areEqual(this.snapshot, questionResp.snapshot) && this.unRead == questionResp.unRead && this.primaryUnRead == questionResp.primaryUnRead && Intrinsics.areEqual(this.updateTime, questionResp.updateTime) && Intrinsics.areEqual(this.joinTime, questionResp.joinTime) && Intrinsics.areEqual(this.askUserPhoto, questionResp.askUserPhoto) && Intrinsics.areEqual(this.className, questionResp.className) && this.messages == questionResp.messages && this.sentMessages == questionResp.sentMessages && this.members == questionResp.members && this.openCount == questionResp.openCount && Intrinsics.areEqual(this.topicName, questionResp.topicName) && this.joinType == questionResp.joinType && this.state == questionResp.state && this.isCollect == questionResp.isCollect && this.closed == questionResp.closed;
    }

    public final String fetchJoinedTime() {
        if (this.joinTime.length() != 19) {
            return this.joinTime;
        }
        String strSubstring = this.joinTime.substring(0, r0.length() - 3);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String fetchUpdatedTime() {
        if (this.updateTime.length() != 19) {
            return this.updateTime;
        }
        String strSubstring = this.updateTime.substring(0, r0.length() - 3);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final int getAskUserId() {
        return this.askUserId;
    }

    public final String getAskUserName() {
        return this.askUserName;
    }

    public final String getAskUserPhoto() {
        return this.askUserPhoto;
    }

    public final String getClassName() {
        return this.className;
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final int getCourseId() {
        return this.courseId;
    }

    public final String getCreateTime() {
        return this.createTime;
    }

    public final String getFormatSummary() {
        String str = this.summary;
        if (str == null) {
            return "";
        }
        if (str.length() <= 15) {
            return this.summary;
        }
        return this.summary.subSequence(0, 15) + "...";
    }

    public final long getId() {
        return this.id;
    }

    public final String getJoinTime() {
        return this.joinTime;
    }

    public final int getJoinType() {
        return this.joinType;
    }

    public final int getMembers() {
        return this.members;
    }

    public final int getMessages() {
        return this.messages;
    }

    public final int getOpenCount() {
        return this.openCount;
    }

    public final int getPrimaryUnRead() {
        return this.primaryUnRead;
    }

    public final int getSentMessages() {
        return this.sentMessages;
    }

    public final String getSnapshot() {
        return this.snapshot;
    }

    public final int getState() {
        return this.state;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTopicName() {
        return this.topicName;
    }

    public final int getUnRead() {
        return this.unRead;
    }

    public final String getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        int iHashCode = ((((((((Long.hashCode(this.id) * 31) + Integer.hashCode(this.courseId)) * 31) + Integer.hashCode(this.askUserId)) * 31) + this.askUserName.hashCode()) * 31) + this.createTime.hashCode()) * 31;
        String str = this.summary;
        int iHashCode2 = (((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.snapshot.hashCode()) * 31) + Integer.hashCode(this.unRead)) * 31) + Integer.hashCode(this.primaryUnRead)) * 31) + this.updateTime.hashCode()) * 31) + this.joinTime.hashCode()) * 31;
        String str2 = this.askUserPhoto;
        return ((((((((((((((((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.className.hashCode()) * 31) + Integer.hashCode(this.messages)) * 31) + Integer.hashCode(this.sentMessages)) * 31) + Integer.hashCode(this.members)) * 31) + Integer.hashCode(this.openCount)) * 31) + this.topicName.hashCode()) * 31) + Integer.hashCode(this.joinType)) * 31) + Integer.hashCode(this.state)) * 31) + Boolean.hashCode(this.isCollect)) * 31) + Boolean.hashCode(this.closed);
    }

    public final boolean isCollect() {
        return this.isCollect;
    }

    public final boolean isUnderstood() {
        return this.state == 2;
    }

    public String toString() {
        return "QuestionResp(id=" + this.id + ", courseId=" + this.courseId + ", askUserId=" + this.askUserId + ", askUserName=" + this.askUserName + ", createTime=" + this.createTime + ", summary=" + this.summary + ", snapshot=" + this.snapshot + ", unRead=" + this.unRead + ", primaryUnRead=" + this.primaryUnRead + ", updateTime=" + this.updateTime + ", joinTime=" + this.joinTime + ", askUserPhoto=" + this.askUserPhoto + ", className=" + this.className + ", messages=" + this.messages + ", sentMessages=" + this.sentMessages + ", members=" + this.members + ", openCount=" + this.openCount + ", topicName=" + this.topicName + ", joinType=" + this.joinType + ", state=" + this.state + ", isCollect=" + this.isCollect + ", closed=" + this.closed + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.id);
        dest.writeInt(this.courseId);
        dest.writeInt(this.askUserId);
        dest.writeString(this.askUserName);
        dest.writeString(this.createTime);
        dest.writeString(this.summary);
        dest.writeString(this.snapshot);
        dest.writeInt(this.unRead);
        dest.writeInt(this.primaryUnRead);
        dest.writeString(this.updateTime);
        dest.writeString(this.joinTime);
        dest.writeString(this.askUserPhoto);
        dest.writeString(this.className);
        dest.writeInt(this.messages);
        dest.writeInt(this.sentMessages);
        dest.writeInt(this.members);
        dest.writeInt(this.openCount);
        dest.writeString(this.topicName);
        dest.writeInt(this.joinType);
        dest.writeInt(this.state);
        dest.writeInt(this.isCollect ? 1 : 0);
        dest.writeInt(this.closed ? 1 : 0);
    }
}
