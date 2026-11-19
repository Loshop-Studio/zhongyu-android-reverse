package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new C0063a();

    /* renamed from: a */
    private final IntentSender f112a;

    /* renamed from: b */
    private final Intent f113b;

    /* renamed from: c */
    private final int f114c;

    /* renamed from: d */
    private final int f115d;

    /* renamed from: androidx.activity.result.IntentSenderRequest$a */
    class C0063a implements Parcelable.Creator<IntentSenderRequest> {
        C0063a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public IntentSenderRequest createFromParcel(Parcel parcel) {
            return new IntentSenderRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public IntentSenderRequest[] newArray(int i4) {
            return new IntentSenderRequest[i4];
        }
    }

    /* renamed from: androidx.activity.result.IntentSenderRequest$b */
    public static final class C0064b {

        /* renamed from: a */
        private IntentSender f116a;

        /* renamed from: b */
        private Intent f117b;

        /* renamed from: c */
        private int f118c;

        /* renamed from: d */
        private int f119d;

        public C0064b(IntentSender intentSender) {
            this.f116a = intentSender;
        }

        /* renamed from: a */
        public IntentSenderRequest m102a() {
            return new IntentSenderRequest(this.f116a, this.f117b, this.f118c, this.f119d);
        }

        /* renamed from: b */
        public C0064b m103b(Intent intent) {
            this.f117b = intent;
            return this;
        }

        /* renamed from: c */
        public C0064b m104c(int i4, int i5) {
            this.f119d = i4;
            this.f118c = i5;
            return this;
        }
    }

    IntentSenderRequest(IntentSender intentSender, Intent intent, int i4, int i5) {
        this.f112a = intentSender;
        this.f113b = intent;
        this.f114c = i4;
        this.f115d = i5;
    }

    /* renamed from: a */
    public Intent m96a() {
        return this.f113b;
    }

    /* renamed from: b */
    public int m97b() {
        return this.f114c;
    }

    /* renamed from: c */
    public int m98c() {
        return this.f115d;
    }

    /* renamed from: d */
    public IntentSender m99d() {
        return this.f112a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.f112a, i4);
        parcel.writeParcelable(this.f113b, i4);
        parcel.writeInt(this.f114c);
        parcel.writeInt(this.f115d);
    }

    IntentSenderRequest(Parcel parcel) {
        this.f112a = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f113b = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f114c = parcel.readInt();
        this.f115d = parcel.readInt();
    }
}
