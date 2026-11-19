package com.zykj.study.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class SmsReq implements Parcelable {
    private final String mobile;

    /* renamed from: sn */
    private final String f10994sn;
    private final long userId;
    public static final Parcelable.Creator<SmsReq> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Creator implements Parcelable.Creator<SmsReq> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmsReq createFromParcel(Parcel parcel) {
            AbstractC9133u.m16133g(parcel, "parcel");
            return new SmsReq(parcel.readLong(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmsReq[] newArray(int i10) {
            return new SmsReq[i10];
        }
    }

    public SmsReq(long j10, String str, String str2) {
        this.userId = j10;
        this.mobile = str;
        this.f10994sn = str2;
    }

    public static /* synthetic */ SmsReq copy$default(SmsReq smsReq, long j10, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = smsReq.userId;
        }
        if ((i10 & 2) != 0) {
            str = smsReq.mobile;
        }
        if ((i10 & 4) != 0) {
            str2 = smsReq.f10994sn;
        }
        return smsReq.copy(j10, str, str2);
    }

    public final long component1() {
        return this.userId;
    }

    public final String component2() {
        return this.mobile;
    }

    public final String component3() {
        return this.f10994sn;
    }

    public final SmsReq copy(long j10, String str, String str2) {
        return new SmsReq(j10, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmsReq)) {
            return false;
        }
        SmsReq smsReq = (SmsReq) obj;
        return this.userId == smsReq.userId && AbstractC9133u.m16128b(this.mobile, smsReq.mobile) && AbstractC9133u.m16128b(this.f10994sn, smsReq.f10994sn);
    }

    public final String getMobile() {
        return this.mobile;
    }

    public final String getSn() {
        return this.f10994sn;
    }

    public final long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.userId) * 31;
        String str = this.mobile;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f10994sn;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "SmsReq(userId=" + this.userId + ", mobile=" + this.mobile + ", sn=" + this.f10994sn + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC9133u.m16133g(dest, "dest");
        dest.writeLong(this.userId);
        dest.writeString(this.mobile);
        dest.writeString(this.f10994sn);
    }

    public /* synthetic */ SmsReq(long j10, String str, String str2, int i10, AbstractC9126n abstractC9126n) {
        this(j10, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2);
    }
}
