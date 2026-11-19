package com.zykj.huiwei.launcher.bean.resp;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\tHÆ\u0003J\t\u0010/\u001a\u00020\u000bHÆ\u0003J\t\u00100\u001a\u00020\u000bHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\u0095\u0001\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0005HÆ\u0001J\u0013\u00108\u001a\u00020\u000b2\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020\u0005HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001fR\u001a\u0010\f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u001f\"\u0004\b \u0010!R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u0011\u0010\u0014\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001a¨\u0006<"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;", "", "creationTime", "", "creatorUserId", "", "deleterUserId", "deletionTime", "id", "", "isDeleted", "", "isRead", "lastModificationTime", "lastModifierUserId", "parameter", "Lcom/zykj/huiwei/launcher/bean/resp/Parameter;", "senderInfo", "Lcom/zykj/huiwei/launcher/bean/resp/SenderInfo;", "title", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "<init>", "(Ljava/lang/String;IILjava/lang/String;JZZLjava/lang/String;ILcom/zykj/huiwei/launcher/bean/resp/Parameter;Lcom/zykj/huiwei/launcher/bean/resp/SenderInfo;Ljava/lang/String;I)V", "getCreationTime", "()Ljava/lang/String;", "getCreatorUserId", "()I", "getDeleterUserId", "getDeletionTime", "getId", "()J", "()Z", "setRead", "(Z)V", "getLastModificationTime", "getLastModifierUserId", "getParameter", "()Lcom/zykj/huiwei/launcher/bean/resp/Parameter;", "getSenderInfo", "()Lcom/zykj/huiwei/launcher/bean/resp/SenderInfo;", "getTitle", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "hashCode", "toString", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MessageInfo {
    public static final int $stable = 8;
    private final String creationTime;
    private final int creatorUserId;
    private final int deleterUserId;
    private final String deletionTime;
    private final long id;
    private final boolean isDeleted;
    private boolean isRead;
    private final String lastModificationTime;
    private final int lastModifierUserId;
    private final Parameter parameter;
    private final SenderInfo senderInfo;
    private final String title;
    private final int type;

    public MessageInfo() {
        this(null, 0, 0, null, 0L, false, false, null, 0, null, null, null, 0, 8191, null);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCreationTime() {
        return this.creationTime;
    }

    /* renamed from: component10, reason: from getter */
    public final Parameter getParameter() {
        return this.parameter;
    }

    /* renamed from: component11, reason: from getter */
    public final SenderInfo getSenderInfo() {
        return this.senderInfo;
    }

    /* renamed from: component12, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component13, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCreatorUserId() {
        return this.creatorUserId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getDeleterUserId() {
        return this.deleterUserId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDeletionTime() {
        return this.deletionTime;
    }

    /* renamed from: component5, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsDeleted() {
        return this.isDeleted;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsRead() {
        return this.isRead;
    }

    /* renamed from: component8, reason: from getter */
    public final String getLastModificationTime() {
        return this.lastModificationTime;
    }

    /* renamed from: component9, reason: from getter */
    public final int getLastModifierUserId() {
        return this.lastModifierUserId;
    }

    public final MessageInfo copy(String creationTime, int creatorUserId, int deleterUserId, String deletionTime, long id, boolean isDeleted, boolean isRead, String lastModificationTime, int lastModifierUserId, Parameter parameter, SenderInfo senderInfo, String title, int type) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new MessageInfo(creationTime, creatorUserId, deleterUserId, deletionTime, id, isDeleted, isRead, lastModificationTime, lastModifierUserId, parameter, senderInfo, title, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageInfo)) {
            return false;
        }
        MessageInfo messageInfo = (MessageInfo) other;
        return Intrinsics.areEqual(this.creationTime, messageInfo.creationTime) && this.creatorUserId == messageInfo.creatorUserId && this.deleterUserId == messageInfo.deleterUserId && Intrinsics.areEqual(this.deletionTime, messageInfo.deletionTime) && this.id == messageInfo.id && this.isDeleted == messageInfo.isDeleted && this.isRead == messageInfo.isRead && Intrinsics.areEqual(this.lastModificationTime, messageInfo.lastModificationTime) && this.lastModifierUserId == messageInfo.lastModifierUserId && Intrinsics.areEqual(this.parameter, messageInfo.parameter) && Intrinsics.areEqual(this.senderInfo, messageInfo.senderInfo) && Intrinsics.areEqual(this.title, messageInfo.title) && this.type == messageInfo.type;
    }

    public final String getCreationTime() {
        return this.creationTime;
    }

    public final int getCreatorUserId() {
        return this.creatorUserId;
    }

    public final int getDeleterUserId() {
        return this.deleterUserId;
    }

    public final String getDeletionTime() {
        return this.deletionTime;
    }

    public final long getId() {
        return this.id;
    }

    public final String getLastModificationTime() {
        return this.lastModificationTime;
    }

    public final int getLastModifierUserId() {
        return this.lastModifierUserId;
    }

    public final Parameter getParameter() {
        return this.parameter;
    }

    public final SenderInfo getSenderInfo() {
        return this.senderInfo;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.creationTime;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.creatorUserId)) * 31) + Integer.hashCode(this.deleterUserId)) * 31;
        String str2 = this.deletionTime;
        int iHashCode2 = (((((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Long.hashCode(this.id)) * 31) + Boolean.hashCode(this.isDeleted)) * 31) + Boolean.hashCode(this.isRead)) * 31;
        String str3 = this.lastModificationTime;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + Integer.hashCode(this.lastModifierUserId)) * 31;
        Parameter parameter = this.parameter;
        int iHashCode4 = (iHashCode3 + (parameter == null ? 0 : parameter.hashCode())) * 31;
        SenderInfo senderInfo = this.senderInfo;
        return ((((iHashCode4 + (senderInfo != null ? senderInfo.hashCode() : 0)) * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.type);
    }

    public final boolean isDeleted() {
        return this.isDeleted;
    }

    public final boolean isRead() {
        return this.isRead;
    }

    public final void setRead(boolean z6) {
        this.isRead = z6;
    }

    public String toString() {
        return "MessageInfo(creationTime=" + this.creationTime + ", creatorUserId=" + this.creatorUserId + ", deleterUserId=" + this.deleterUserId + ", deletionTime=" + this.deletionTime + ", id=" + this.id + ", isDeleted=" + this.isDeleted + ", isRead=" + this.isRead + ", lastModificationTime=" + this.lastModificationTime + ", lastModifierUserId=" + this.lastModifierUserId + ", parameter=" + this.parameter + ", senderInfo=" + this.senderInfo + ", title=" + this.title + ", type=" + this.type + ")";
    }

    public MessageInfo(String str, int i6, int i7, String str2, long j6, boolean z6, boolean z7, String str3, int i8, Parameter parameter, SenderInfo senderInfo, String title, int i9) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.creationTime = str;
        this.creatorUserId = i6;
        this.deleterUserId = i7;
        this.deletionTime = str2;
        this.id = j6;
        this.isDeleted = z6;
        this.isRead = z7;
        this.lastModificationTime = str3;
        this.lastModifierUserId = i8;
        this.parameter = parameter;
        this.senderInfo = senderInfo;
        this.title = title;
        this.type = i9;
    }

    public /* synthetic */ MessageInfo(String str, int i6, int i7, String str2, long j6, boolean z6, boolean z7, String str3, int i8, Parameter parameter, SenderInfo senderInfo, String str4, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? 0 : i6, (i10 & 4) != 0 ? 0 : i7, (i10 & 8) != 0 ? "" : str2, (i10 & 16) != 0 ? 0L : j6, (i10 & 32) != 0 ? false : z6, (i10 & 64) != 0 ? false : z7, (i10 & 128) != 0 ? "" : str3, (i10 & 256) != 0 ? 0 : i8, (i10 & 512) != 0 ? null : parameter, (i10 & 1024) == 0 ? senderInfo : null, (i10 & 2048) == 0 ? str4 : "", (i10 & 4096) != 0 ? 0 : i9);
    }
}
