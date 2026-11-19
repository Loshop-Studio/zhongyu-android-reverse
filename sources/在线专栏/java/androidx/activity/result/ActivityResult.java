package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class ActivityResult implements Parcelable {
    public static final Parcelable.Creator<ActivityResult> CREATOR = new C0057a();

    /* renamed from: a */
    private final int f86a;

    /* renamed from: b */
    private final Intent f87b;

    /* renamed from: androidx.activity.result.ActivityResult$a */
    class C0057a implements Parcelable.Creator<ActivityResult> {
        C0057a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ActivityResult createFromParcel(Parcel parcel) {
            return new ActivityResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ActivityResult[] newArray(int i4) {
            return new ActivityResult[i4];
        }
    }

    public ActivityResult(int i4, Intent intent) {
        this.f86a = i4;
        this.f87b = intent;
    }

    /* renamed from: c */
    public static String m76c(int i4) {
        return i4 != -1 ? i4 != 0 ? String.valueOf(i4) : "RESULT_CANCELED" : "RESULT_OK";
    }

    /* renamed from: a */
    public Intent m77a() {
        return this.f87b;
    }

    /* renamed from: b */
    public int m78b() {
        return this.f86a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + m76c(this.f86a) + ", data=" + this.f87b + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f86a);
        parcel.writeInt(this.f87b == null ? 0 : 1);
        Intent intent = this.f87b;
        if (intent != null) {
            intent.writeToParcel(parcel, i4);
        }
    }

    ActivityResult(Parcel parcel) {
        this.f86a = parcel.readInt();
        this.f87b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
