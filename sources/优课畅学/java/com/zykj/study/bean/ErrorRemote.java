package com.zykj.study.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class ErrorRemote implements Parcelable {

    @SerializedName("code")
    private final int code;

    @SerializedName("details")
    private final String details;

    @SerializedName("message")
    private final String message;

    @SerializedName("validationErrors")
    private final String validationErrors;
    public static final Parcelable.Creator<ErrorRemote> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Creator implements Parcelable.Creator<ErrorRemote> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ErrorRemote createFromParcel(Parcel parcel) {
            AbstractC9133u.m16133g(parcel, "parcel");
            return new ErrorRemote(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ErrorRemote[] newArray(int i10) {
            return new ErrorRemote[i10];
        }
    }

    public ErrorRemote(int i10, String str, String message, String str2) {
        AbstractC9133u.m16133g(message, "message");
        this.code = i10;
        this.details = str;
        this.message = message;
        this.validationErrors = str2;
    }

    public static /* synthetic */ ErrorRemote copy$default(ErrorRemote errorRemote, int i10, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = errorRemote.code;
        }
        if ((i11 & 2) != 0) {
            str = errorRemote.details;
        }
        if ((i11 & 4) != 0) {
            str2 = errorRemote.message;
        }
        if ((i11 & 8) != 0) {
            str3 = errorRemote.validationErrors;
        }
        return errorRemote.copy(i10, str, str2, str3);
    }

    public final int component1() {
        return this.code;
    }

    public final String component2() {
        return this.details;
    }

    public final String component3() {
        return this.message;
    }

    public final String component4() {
        return this.validationErrors;
    }

    public final ErrorRemote copy(int i10, String str, String message, String str2) {
        AbstractC9133u.m16133g(message, "message");
        return new ErrorRemote(i10, str, message, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorRemote)) {
            return false;
        }
        ErrorRemote errorRemote = (ErrorRemote) obj;
        return this.code == errorRemote.code && AbstractC9133u.m16128b(this.details, errorRemote.details) && AbstractC9133u.m16128b(this.message, errorRemote.message) && AbstractC9133u.m16128b(this.validationErrors, errorRemote.validationErrors);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getDetails() {
        return this.details;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getValidationErrors() {
        return this.validationErrors;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.code) * 31;
        String str = this.details;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.message.hashCode()) * 31;
        String str2 = this.validationErrors;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ErrorRemote(code=" + this.code + ", details=" + this.details + ", message=" + this.message + ", validationErrors=" + this.validationErrors + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC9133u.m16133g(dest, "dest");
        dest.writeInt(this.code);
        dest.writeString(this.details);
        dest.writeString(this.message);
        dest.writeString(this.validationErrors);
    }
}
