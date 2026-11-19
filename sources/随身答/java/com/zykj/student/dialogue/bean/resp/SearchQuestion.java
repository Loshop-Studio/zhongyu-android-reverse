package com.zykj.student.dialogue.bean.resp;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Keep
@Metadata(m13412d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b^\b\u0087\b\u0018\u00002\u00020\u0001B÷\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\b\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\b\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\b\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\b\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b#\u0010$J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\bHÆ\u0003J\t\u0010J\u001a\u00020\nHÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\nHÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\nHÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\bHÆ\u0003J\t\u0010R\u001a\u00020\bHÆ\u0003J\t\u0010S\u001a\u00020\bHÆ\u0003J\t\u0010T\u001a\u00020\bHÆ\u0003J\t\u0010U\u001a\u00020\bHÆ\u0003J\t\u0010V\u001a\u00020\bHÆ\u0003J\t\u0010W\u001a\u00020\bHÆ\u0003J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\bHÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\bHÆ\u0003J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\t\u0010_\u001a\u00020\bHÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\t\u0010a\u001a\u00020\u0003HÆ\u0003J\t\u0010b\u001a\u00020\bHÆ\u0003Jµ\u0002\u0010c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\bHÆ\u0001J\u0013\u0010d\u001a\u00020\n2\b\u0010e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010f\u001a\u00020\bHÖ\u0001J\t\u0010g\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010&R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010&R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010&R\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b0\u0010-R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010&R\u0011\u0010\u000f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010-R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010&R\u0011\u0010\u0011\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b3\u0010+R\u0011\u0010\u0012\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b4\u0010+R\u0011\u0010\u0013\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b5\u0010+R\u0011\u0010\u0014\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b6\u0010+R\u0011\u0010\u0015\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b7\u0010+R\u0011\u0010\u0016\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b8\u0010+R\u0011\u0010\u0017\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b9\u0010+R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010&R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010&R\u0011\u0010\u001a\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b<\u0010+R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010&R\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010&R\u0011\u0010\u001d\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b?\u0010+R\u0011\u0010\u001e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010&R\u0011\u0010\u001f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bA\u0010+R\u0011\u0010 \u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010&R\u0011\u0010!\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010&R\u0011\u0010\"\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bD\u0010+¨\u0006h"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/SearchQuestion;", "", "askUserId", "", "askUserName", "askUserPhoto", "className", "cleared", "", "closed", "", "courseId", "createTime", "disabled", "id", "isCollect", "joinTime", "joinType", "members", "messages", "openCount", "primaryUnRead", "sentMessages", "sessionRole", "snapshot", "tags", "state", "summary", "topicName", "unRead", "updateTime", "updateUserId", "updateUserName", "updateUserPhoto", "userId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;IIIIIIILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V", "getAskUserId", "()Ljava/lang/String;", "getAskUserName", "getAskUserPhoto", "getClassName", "getCleared", "()I", "getClosed", "()Z", "getCourseId", "getCreateTime", "getDisabled", "getId", "getJoinTime", "getJoinType", "getMembers", "getMessages", "getOpenCount", "getPrimaryUnRead", "getSentMessages", "getSessionRole", "getSnapshot", "getTags", "getState", "getSummary", "getTopicName", "getUnRead", "getUpdateTime", "getUpdateUserId", "getUpdateUserName", "getUpdateUserPhoto", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "copy", "equals", "other", "hashCode", "toString", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final /* data */ class SearchQuestion {
    public static final int $stable = 0;
    private final String askUserId;
    private final String askUserName;
    private final String askUserPhoto;

    @SerializedName("class")
    private final String className;
    private final int cleared;
    private final boolean closed;
    private final String courseId;
    private final String createTime;
    private final boolean disabled;
    private final String id;
    private final boolean isCollect;
    private final String joinTime;
    private final int joinType;
    private final int members;
    private final int messages;
    private final int openCount;
    private final int primaryUnRead;
    private final int sentMessages;
    private final int sessionRole;
    private final String snapshot;
    private final int state;
    private final String summary;
    private final String tags;
    private final String topicName;
    private final int unRead;
    private final String updateTime;
    private final int updateUserId;
    private final String updateUserName;
    private final String updateUserPhoto;
    private final int userId;

    public SearchQuestion(String askUserId, String askUserName, String askUserPhoto, String className, int i9, boolean z9, String courseId, String createTime, boolean z10, String id, boolean z11, String joinTime, int i10, int i11, int i12, int i13, int i14, int i15, int i16, String snapshot, String tags, int i17, String summary, String topicName, int i18, String updateTime, int i19, String updateUserName, String updateUserPhoto, int i20) {
        Intrinsics.checkNotNullParameter(askUserId, "askUserId");
        Intrinsics.checkNotNullParameter(askUserName, "askUserName");
        Intrinsics.checkNotNullParameter(askUserPhoto, "askUserPhoto");
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(courseId, "courseId");
        Intrinsics.checkNotNullParameter(createTime, "createTime");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(joinTime, "joinTime");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(topicName, "topicName");
        Intrinsics.checkNotNullParameter(updateTime, "updateTime");
        Intrinsics.checkNotNullParameter(updateUserName, "updateUserName");
        Intrinsics.checkNotNullParameter(updateUserPhoto, "updateUserPhoto");
        this.askUserId = askUserId;
        this.askUserName = askUserName;
        this.askUserPhoto = askUserPhoto;
        this.className = className;
        this.cleared = i9;
        this.closed = z9;
        this.courseId = courseId;
        this.createTime = createTime;
        this.disabled = z10;
        this.id = id;
        this.isCollect = z11;
        this.joinTime = joinTime;
        this.joinType = i10;
        this.members = i11;
        this.messages = i12;
        this.openCount = i13;
        this.primaryUnRead = i14;
        this.sentMessages = i15;
        this.sessionRole = i16;
        this.snapshot = snapshot;
        this.tags = tags;
        this.state = i17;
        this.summary = summary;
        this.topicName = topicName;
        this.unRead = i18;
        this.updateTime = updateTime;
        this.updateUserId = i19;
        this.updateUserName = updateUserName;
        this.updateUserPhoto = updateUserPhoto;
        this.userId = i20;
    }

    public static /* synthetic */ SearchQuestion copy$default(SearchQuestion searchQuestion, String str, String str2, String str3, String str4, int i9, boolean z9, String str5, String str6, boolean z10, String str7, boolean z11, String str8, int i10, int i11, int i12, int i13, int i14, int i15, int i16, String str9, String str10, int i17, String str11, String str12, int i18, String str13, int i19, String str14, String str15, int i20, int i21, Object obj) {
        int i22;
        String str16;
        String str17 = (i21 & 1) != 0 ? searchQuestion.askUserId : str;
        String str18 = (i21 & 2) != 0 ? searchQuestion.askUserName : str2;
        String str19 = (i21 & 4) != 0 ? searchQuestion.askUserPhoto : str3;
        String str20 = (i21 & 8) != 0 ? searchQuestion.className : str4;
        int i23 = (i21 & 16) != 0 ? searchQuestion.cleared : i9;
        boolean z12 = (i21 & 32) != 0 ? searchQuestion.closed : z9;
        String str21 = (i21 & 64) != 0 ? searchQuestion.courseId : str5;
        String str22 = (i21 & 128) != 0 ? searchQuestion.createTime : str6;
        boolean z13 = (i21 & 256) != 0 ? searchQuestion.disabled : z10;
        String str23 = (i21 & 512) != 0 ? searchQuestion.id : str7;
        boolean z14 = (i21 & 1024) != 0 ? searchQuestion.isCollect : z11;
        String str24 = (i21 & 2048) != 0 ? searchQuestion.joinTime : str8;
        int i24 = (i21 & 4096) != 0 ? searchQuestion.joinType : i10;
        int i25 = (i21 & 8192) != 0 ? searchQuestion.members : i11;
        String str25 = str17;
        int i26 = (i21 & 16384) != 0 ? searchQuestion.messages : i12;
        int i27 = (i21 & 32768) != 0 ? searchQuestion.openCount : i13;
        int i28 = (i21 & 65536) != 0 ? searchQuestion.primaryUnRead : i14;
        int i29 = (i21 & 131072) != 0 ? searchQuestion.sentMessages : i15;
        int i30 = (i21 & 262144) != 0 ? searchQuestion.sessionRole : i16;
        String str26 = (i21 & 524288) != 0 ? searchQuestion.snapshot : str9;
        String str27 = (i21 & 1048576) != 0 ? searchQuestion.tags : str10;
        int i31 = (i21 & 2097152) != 0 ? searchQuestion.state : i17;
        String str28 = (i21 & 4194304) != 0 ? searchQuestion.summary : str11;
        String str29 = (i21 & 8388608) != 0 ? searchQuestion.topicName : str12;
        int i32 = (i21 & 16777216) != 0 ? searchQuestion.unRead : i18;
        String str30 = (i21 & 33554432) != 0 ? searchQuestion.updateTime : str13;
        int i33 = (i21 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? searchQuestion.updateUserId : i19;
        String str31 = (i21 & 134217728) != 0 ? searchQuestion.updateUserName : str14;
        String str32 = (i21 & 268435456) != 0 ? searchQuestion.updateUserPhoto : str15;
        if ((i21 & 536870912) != 0) {
            str16 = str32;
            i22 = searchQuestion.userId;
        } else {
            i22 = i20;
            str16 = str32;
        }
        return searchQuestion.copy(str25, str18, str19, str20, i23, z12, str21, str22, z13, str23, z14, str24, i24, i25, i26, i27, i28, i29, i30, str26, str27, i31, str28, str29, i32, str30, i33, str31, str16, i22);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAskUserId() {
        return this.askUserId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsCollect() {
        return this.isCollect;
    }

    /* renamed from: component12, reason: from getter */
    public final String getJoinTime() {
        return this.joinTime;
    }

    /* renamed from: component13, reason: from getter */
    public final int getJoinType() {
        return this.joinType;
    }

    /* renamed from: component14, reason: from getter */
    public final int getMembers() {
        return this.members;
    }

    /* renamed from: component15, reason: from getter */
    public final int getMessages() {
        return this.messages;
    }

    /* renamed from: component16, reason: from getter */
    public final int getOpenCount() {
        return this.openCount;
    }

    /* renamed from: component17, reason: from getter */
    public final int getPrimaryUnRead() {
        return this.primaryUnRead;
    }

    /* renamed from: component18, reason: from getter */
    public final int getSentMessages() {
        return this.sentMessages;
    }

    /* renamed from: component19, reason: from getter */
    public final int getSessionRole() {
        return this.sessionRole;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAskUserName() {
        return this.askUserName;
    }

    /* renamed from: component20, reason: from getter */
    public final String getSnapshot() {
        return this.snapshot;
    }

    /* renamed from: component21, reason: from getter */
    public final String getTags() {
        return this.tags;
    }

    /* renamed from: component22, reason: from getter */
    public final int getState() {
        return this.state;
    }

    /* renamed from: component23, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    /* renamed from: component24, reason: from getter */
    public final String getTopicName() {
        return this.topicName;
    }

    /* renamed from: component25, reason: from getter */
    public final int getUnRead() {
        return this.unRead;
    }

    /* renamed from: component26, reason: from getter */
    public final String getUpdateTime() {
        return this.updateTime;
    }

    /* renamed from: component27, reason: from getter */
    public final int getUpdateUserId() {
        return this.updateUserId;
    }

    /* renamed from: component28, reason: from getter */
    public final String getUpdateUserName() {
        return this.updateUserName;
    }

    /* renamed from: component29, reason: from getter */
    public final String getUpdateUserPhoto() {
        return this.updateUserPhoto;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAskUserPhoto() {
        return this.askUserPhoto;
    }

    /* renamed from: component30, reason: from getter */
    public final int getUserId() {
        return this.userId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getClassName() {
        return this.className;
    }

    /* renamed from: component5, reason: from getter */
    public final int getCleared() {
        return this.cleared;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getClosed() {
        return this.closed;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCourseId() {
        return this.courseId;
    }

    /* renamed from: component8, reason: from getter */
    public final String getCreateTime() {
        return this.createTime;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getDisabled() {
        return this.disabled;
    }

    public final SearchQuestion copy(String askUserId, String askUserName, String askUserPhoto, String className, int cleared, boolean closed, String courseId, String createTime, boolean disabled, String id, boolean isCollect, String joinTime, int joinType, int members, int messages, int openCount, int primaryUnRead, int sentMessages, int sessionRole, String snapshot, String tags, int state, String summary, String topicName, int unRead, String updateTime, int updateUserId, String updateUserName, String updateUserPhoto, int userId) {
        Intrinsics.checkNotNullParameter(askUserId, "askUserId");
        Intrinsics.checkNotNullParameter(askUserName, "askUserName");
        Intrinsics.checkNotNullParameter(askUserPhoto, "askUserPhoto");
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(courseId, "courseId");
        Intrinsics.checkNotNullParameter(createTime, "createTime");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(joinTime, "joinTime");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(topicName, "topicName");
        Intrinsics.checkNotNullParameter(updateTime, "updateTime");
        Intrinsics.checkNotNullParameter(updateUserName, "updateUserName");
        Intrinsics.checkNotNullParameter(updateUserPhoto, "updateUserPhoto");
        return new SearchQuestion(askUserId, askUserName, askUserPhoto, className, cleared, closed, courseId, createTime, disabled, id, isCollect, joinTime, joinType, members, messages, openCount, primaryUnRead, sentMessages, sessionRole, snapshot, tags, state, summary, topicName, unRead, updateTime, updateUserId, updateUserName, updateUserPhoto, userId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchQuestion)) {
            return false;
        }
        SearchQuestion searchQuestion = (SearchQuestion) other;
        return Intrinsics.areEqual(this.askUserId, searchQuestion.askUserId) && Intrinsics.areEqual(this.askUserName, searchQuestion.askUserName) && Intrinsics.areEqual(this.askUserPhoto, searchQuestion.askUserPhoto) && Intrinsics.areEqual(this.className, searchQuestion.className) && this.cleared == searchQuestion.cleared && this.closed == searchQuestion.closed && Intrinsics.areEqual(this.courseId, searchQuestion.courseId) && Intrinsics.areEqual(this.createTime, searchQuestion.createTime) && this.disabled == searchQuestion.disabled && Intrinsics.areEqual(this.id, searchQuestion.id) && this.isCollect == searchQuestion.isCollect && Intrinsics.areEqual(this.joinTime, searchQuestion.joinTime) && this.joinType == searchQuestion.joinType && this.members == searchQuestion.members && this.messages == searchQuestion.messages && this.openCount == searchQuestion.openCount && this.primaryUnRead == searchQuestion.primaryUnRead && this.sentMessages == searchQuestion.sentMessages && this.sessionRole == searchQuestion.sessionRole && Intrinsics.areEqual(this.snapshot, searchQuestion.snapshot) && Intrinsics.areEqual(this.tags, searchQuestion.tags) && this.state == searchQuestion.state && Intrinsics.areEqual(this.summary, searchQuestion.summary) && Intrinsics.areEqual(this.topicName, searchQuestion.topicName) && this.unRead == searchQuestion.unRead && Intrinsics.areEqual(this.updateTime, searchQuestion.updateTime) && this.updateUserId == searchQuestion.updateUserId && Intrinsics.areEqual(this.updateUserName, searchQuestion.updateUserName) && Intrinsics.areEqual(this.updateUserPhoto, searchQuestion.updateUserPhoto) && this.userId == searchQuestion.userId;
    }

    public final String getAskUserId() {
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

    public final int getCleared() {
        return this.cleared;
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final String getCourseId() {
        return this.courseId;
    }

    public final String getCreateTime() {
        return this.createTime;
    }

    public final boolean getDisabled() {
        return this.disabled;
    }

    public final String getId() {
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

    public final int getSessionRole() {
        return this.sessionRole;
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

    public final String getTags() {
        return this.tags;
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

    public final int getUpdateUserId() {
        return this.updateUserId;
    }

    public final String getUpdateUserName() {
        return this.updateUserName;
    }

    public final String getUpdateUserPhoto() {
        return this.updateUserPhoto;
    }

    public final int getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.askUserId.hashCode() * 31) + this.askUserName.hashCode()) * 31) + this.askUserPhoto.hashCode()) * 31) + this.className.hashCode()) * 31) + Integer.hashCode(this.cleared)) * 31) + Boolean.hashCode(this.closed)) * 31) + this.courseId.hashCode()) * 31) + this.createTime.hashCode()) * 31) + Boolean.hashCode(this.disabled)) * 31) + this.id.hashCode()) * 31) + Boolean.hashCode(this.isCollect)) * 31) + this.joinTime.hashCode()) * 31) + Integer.hashCode(this.joinType)) * 31) + Integer.hashCode(this.members)) * 31) + Integer.hashCode(this.messages)) * 31) + Integer.hashCode(this.openCount)) * 31) + Integer.hashCode(this.primaryUnRead)) * 31) + Integer.hashCode(this.sentMessages)) * 31) + Integer.hashCode(this.sessionRole)) * 31) + this.snapshot.hashCode()) * 31) + this.tags.hashCode()) * 31) + Integer.hashCode(this.state)) * 31) + this.summary.hashCode()) * 31) + this.topicName.hashCode()) * 31) + Integer.hashCode(this.unRead)) * 31) + this.updateTime.hashCode()) * 31) + Integer.hashCode(this.updateUserId)) * 31) + this.updateUserName.hashCode()) * 31) + this.updateUserPhoto.hashCode()) * 31) + Integer.hashCode(this.userId);
    }

    public final boolean isCollect() {
        return this.isCollect;
    }

    public String toString() {
        return "SearchQuestion(askUserId=" + this.askUserId + ", askUserName=" + this.askUserName + ", askUserPhoto=" + this.askUserPhoto + ", className=" + this.className + ", cleared=" + this.cleared + ", closed=" + this.closed + ", courseId=" + this.courseId + ", createTime=" + this.createTime + ", disabled=" + this.disabled + ", id=" + this.id + ", isCollect=" + this.isCollect + ", joinTime=" + this.joinTime + ", joinType=" + this.joinType + ", members=" + this.members + ", messages=" + this.messages + ", openCount=" + this.openCount + ", primaryUnRead=" + this.primaryUnRead + ", sentMessages=" + this.sentMessages + ", sessionRole=" + this.sessionRole + ", snapshot=" + this.snapshot + ", tags=" + this.tags + ", state=" + this.state + ", summary=" + this.summary + ", topicName=" + this.topicName + ", unRead=" + this.unRead + ", updateTime=" + this.updateTime + ", updateUserId=" + this.updateUserId + ", updateUserName=" + this.updateUserName + ", updateUserPhoto=" + this.updateUserPhoto + ", userId=" + this.userId + ")";
    }
}
