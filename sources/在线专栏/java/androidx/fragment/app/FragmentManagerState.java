package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new C0447a();

    /* renamed from: a */
    ArrayList<FragmentState> f3083a;

    /* renamed from: b */
    ArrayList<String> f3084b;

    /* renamed from: c */
    BackStackState[] f3085c;

    /* renamed from: d */
    int f3086d;

    /* renamed from: e */
    String f3087e;

    /* renamed from: f */
    ArrayList<String> f3088f;

    /* renamed from: g */
    ArrayList<Bundle> f3089g;

    /* renamed from: h */
    ArrayList<FragmentManager.LaunchedFragmentInfo> f3090h;

    /* renamed from: androidx.fragment.app.FragmentManagerState$a */
    class C0447a implements Parcelable.Creator<FragmentManagerState> {
        C0447a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState[] newArray(int i4) {
            return new FragmentManagerState[i4];
        }
    }

    public FragmentManagerState() {
        this.f3087e = null;
        this.f3088f = new ArrayList<>();
        this.f3089g = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeTypedList(this.f3083a);
        parcel.writeStringList(this.f3084b);
        parcel.writeTypedArray(this.f3085c, i4);
        parcel.writeInt(this.f3086d);
        parcel.writeString(this.f3087e);
        parcel.writeStringList(this.f3088f);
        parcel.writeTypedList(this.f3089g);
        parcel.writeTypedList(this.f3090h);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f3087e = null;
        this.f3088f = new ArrayList<>();
        this.f3089g = new ArrayList<>();
        this.f3083a = parcel.createTypedArrayList(FragmentState.CREATOR);
        this.f3084b = parcel.createStringArrayList();
        this.f3085c = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.f3086d = parcel.readInt();
        this.f3087e = parcel.readString();
        this.f3088f = parcel.createStringArrayList();
        this.f3089g = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f3090h = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}
