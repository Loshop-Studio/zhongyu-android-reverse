package com.zykj.study.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class DeleteSubSingReq implements Parcelable {
    private final long courseId;
    private final String userId;
    public static final Parcelable.Creator<DeleteSubSingReq> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Creator implements Parcelable.Creator<DeleteSubSingReq> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeleteSubSingReq createFromParcel(Parcel parcel) {
            AbstractC9133u.m16133g(parcel, "parcel");
            return new DeleteSubSingReq(parcel.readLong(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeleteSubSingReq[] newArray(int i10) {
            return new DeleteSubSingReq[i10];
        }
    }

    public DeleteSubSingReq(long j10, String userId) {
        AbstractC9133u.m16133g(userId, "userId");
        this.courseId = j10;
        this.userId = userId;
    }

    public static /* synthetic */ DeleteSubSingReq copy$default(DeleteSubSingReq deleteSubSingReq, long j10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = deleteSubSingReq.courseId;
        }
        if ((i10 & 2) != 0) {
            str = deleteSubSingReq.userId;
        }
        return deleteSubSingReq.copy(j10, str);
    }

    public final long component1() {
        return this.courseId;
    }

    public final String component2() {
        return this.userId;
    }

    public final DeleteSubSingReq copy(long j10, String userId) {
        AbstractC9133u.m16133g(userId, "userId");
        return new DeleteSubSingReq(j10, userId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteSubSingReq)) {
            return false;
        }
        DeleteSubSingReq deleteSubSingReq = (DeleteSubSingReq) obj;
        return this.courseId == deleteSubSingReq.courseId && AbstractC9133u.m16128b(this.userId, deleteSubSingReq.userId);
    }

    public final long getCourseId() {
        return this.courseId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (Long.hashCode(this.courseId) * 31) + this.userId.hashCode();
    }

    public String toString() {
        return "DeleteSubSingReq(courseId=" + this.courseId + ", userId=" + this.userId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC9133u.m16133g(dest, "dest");
        dest.writeLong(this.courseId);
        dest.writeString(this.userId);
    }
}
