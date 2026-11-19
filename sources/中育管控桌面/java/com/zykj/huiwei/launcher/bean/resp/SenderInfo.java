package com.zykj.huiwei.launcher.bean.resp;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Metadata(m7879d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/bean/resp/SenderInfo;", "", "fullName", "", HintConstants.AUTOFILL_HINT_GENDER, "", "picture", "roleType", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "getFullName", "()Ljava/lang/String;", "getGender", "()I", "getPicture", "getRoleType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SenderInfo {
    public static final int $stable = 0;
    private final String fullName;
    private final int gender;
    private final String picture;
    private final int roleType;

    public SenderInfo() {
        this(null, 0, null, 0, 15, null);
    }

    public static /* synthetic */ SenderInfo copy$default(SenderInfo senderInfo, String str, int i6, String str2, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = senderInfo.fullName;
        }
        if ((i8 & 2) != 0) {
            i6 = senderInfo.gender;
        }
        if ((i8 & 4) != 0) {
            str2 = senderInfo.picture;
        }
        if ((i8 & 8) != 0) {
            i7 = senderInfo.roleType;
        }
        return senderInfo.copy(str, i6, str2, i7);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* renamed from: component2, reason: from getter */
    public final int getGender() {
        return this.gender;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPicture() {
        return this.picture;
    }

    /* renamed from: component4, reason: from getter */
    public final int getRoleType() {
        return this.roleType;
    }

    public final SenderInfo copy(String fullName, int gender, String picture, int roleType) {
        return new SenderInfo(fullName, gender, picture, roleType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SenderInfo)) {
            return false;
        }
        SenderInfo senderInfo = (SenderInfo) other;
        return Intrinsics.areEqual(this.fullName, senderInfo.fullName) && this.gender == senderInfo.gender && Intrinsics.areEqual(this.picture, senderInfo.picture) && this.roleType == senderInfo.roleType;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final int getGender() {
        return this.gender;
    }

    public final String getPicture() {
        return this.picture;
    }

    public final int getRoleType() {
        return this.roleType;
    }

    public int hashCode() {
        String str = this.fullName;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.gender)) * 31;
        String str2 = this.picture;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.roleType);
    }

    public String toString() {
        return "SenderInfo(fullName=" + this.fullName + ", gender=" + this.gender + ", picture=" + this.picture + ", roleType=" + this.roleType + ")";
    }

    public SenderInfo(String str, int i6, String str2, int i7) {
        this.fullName = str;
        this.gender = i6;
        this.picture = str2;
        this.roleType = i7;
    }

    public /* synthetic */ SenderInfo(String str, int i6, String str2, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? 0 : i6, (i8 & 4) != 0 ? "" : str2, (i8 & 8) != 0 ? 0 : i7);
    }
}
