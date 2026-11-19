package com.zykj.huiwei.launcher.bean.resp;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r¨\u0006\""}, m7880d2 = {"Lcom/zykj/huiwei/launcher/bean/resp/SchoolSettingResp;", "", "schoolName", "", "schoolShortName", HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS, "wechat", "mobile", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSchoolName", "()Ljava/lang/String;", "setSchoolName", "(Ljava/lang/String;)V", "getSchoolShortName", "setSchoolShortName", "getEmailAddress", "setEmailAddress", "getWechat", "setWechat", "getMobile", "setMobile", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SchoolSettingResp {
    public static final int $stable = 8;
    private String emailAddress;
    private String mobile;
    private String schoolName;
    private String schoolShortName;
    private String wechat;

    public SchoolSettingResp() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ SchoolSettingResp copy$default(SchoolSettingResp schoolSettingResp, String str, String str2, String str3, String str4, String str5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = schoolSettingResp.schoolName;
        }
        if ((i6 & 2) != 0) {
            str2 = schoolSettingResp.schoolShortName;
        }
        if ((i6 & 4) != 0) {
            str3 = schoolSettingResp.emailAddress;
        }
        if ((i6 & 8) != 0) {
            str4 = schoolSettingResp.wechat;
        }
        if ((i6 & 16) != 0) {
            str5 = schoolSettingResp.mobile;
        }
        String str6 = str5;
        String str7 = str3;
        return schoolSettingResp.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSchoolName() {
        return this.schoolName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSchoolShortName() {
        return this.schoolShortName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEmailAddress() {
        return this.emailAddress;
    }

    /* renamed from: component4, reason: from getter */
    public final String getWechat() {
        return this.wechat;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMobile() {
        return this.mobile;
    }

    public final SchoolSettingResp copy(String schoolName, String schoolShortName, String emailAddress, String wechat, String mobile) {
        return new SchoolSettingResp(schoolName, schoolShortName, emailAddress, wechat, mobile);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SchoolSettingResp)) {
            return false;
        }
        SchoolSettingResp schoolSettingResp = (SchoolSettingResp) other;
        return Intrinsics.areEqual(this.schoolName, schoolSettingResp.schoolName) && Intrinsics.areEqual(this.schoolShortName, schoolSettingResp.schoolShortName) && Intrinsics.areEqual(this.emailAddress, schoolSettingResp.emailAddress) && Intrinsics.areEqual(this.wechat, schoolSettingResp.wechat) && Intrinsics.areEqual(this.mobile, schoolSettingResp.mobile);
    }

    public final String getEmailAddress() {
        return this.emailAddress;
    }

    public final String getMobile() {
        return this.mobile;
    }

    public final String getSchoolName() {
        return this.schoolName;
    }

    public final String getSchoolShortName() {
        return this.schoolShortName;
    }

    public final String getWechat() {
        return this.wechat;
    }

    public int hashCode() {
        String str = this.schoolName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.schoolShortName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.emailAddress;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.wechat;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.mobile;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setEmailAddress(String str) {
        this.emailAddress = str;
    }

    public final void setMobile(String str) {
        this.mobile = str;
    }

    public final void setSchoolName(String str) {
        this.schoolName = str;
    }

    public final void setSchoolShortName(String str) {
        this.schoolShortName = str;
    }

    public final void setWechat(String str) {
        this.wechat = str;
    }

    public String toString() {
        return "SchoolSettingResp(schoolName=" + this.schoolName + ", schoolShortName=" + this.schoolShortName + ", emailAddress=" + this.emailAddress + ", wechat=" + this.wechat + ", mobile=" + this.mobile + ")";
    }

    public SchoolSettingResp(String str, String str2, String str3, String str4, String str5) {
        this.schoolName = str;
        this.schoolShortName = str2;
        this.emailAddress = str3;
        this.wechat = str4;
        this.mobile = str5;
    }

    public /* synthetic */ SchoolSettingResp(String str, String str2, String str3, String str4, String str5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? "" : str2, (i6 & 4) != 0 ? "" : str3, (i6 & 8) != 0 ? "" : str4, (i6 & 16) != 0 ? "" : str5);
    }
}
