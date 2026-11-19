package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new C0448a();

    /* renamed from: a */
    final String f3091a;

    /* renamed from: b */
    final String f3092b;

    /* renamed from: c */
    final boolean f3093c;

    /* renamed from: d */
    final int f3094d;

    /* renamed from: e */
    final int f3095e;

    /* renamed from: f */
    final String f3096f;

    /* renamed from: g */
    final boolean f3097g;

    /* renamed from: h */
    final boolean f3098h;

    /* renamed from: i */
    final boolean f3099i;

    /* renamed from: j */
    final Bundle f3100j;

    /* renamed from: k */
    final boolean f3101k;

    /* renamed from: l */
    final int f3102l;

    /* renamed from: m */
    Bundle f3103m;

    /* renamed from: androidx.fragment.app.FragmentState$a */
    class C0448a implements Parcelable.Creator<FragmentState> {
        C0448a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public FragmentState[] newArray(int i4) {
            return new FragmentState[i4];
        }
    }

    FragmentState(Fragment fragment) {
        this.f3091a = fragment.getClass().getName();
        this.f3092b = fragment.mWho;
        this.f3093c = fragment.mFromLayout;
        this.f3094d = fragment.mFragmentId;
        this.f3095e = fragment.mContainerId;
        this.f3096f = fragment.mTag;
        this.f3097g = fragment.mRetainInstance;
        this.f3098h = fragment.mRemoving;
        this.f3099i = fragment.mDetached;
        this.f3100j = fragment.mArguments;
        this.f3101k = fragment.mHidden;
        this.f3102l = fragment.mMaxState.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f3091a);
        sb.append(" (");
        sb.append(this.f3092b);
        sb.append(")}:");
        if (this.f3093c) {
            sb.append(" fromLayout");
        }
        if (this.f3095e != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f3095e));
        }
        String str = this.f3096f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f3096f);
        }
        if (this.f3097g) {
            sb.append(" retainInstance");
        }
        if (this.f3098h) {
            sb.append(" removing");
        }
        if (this.f3099i) {
            sb.append(" detached");
        }
        if (this.f3101k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f3091a);
        parcel.writeString(this.f3092b);
        parcel.writeInt(this.f3093c ? 1 : 0);
        parcel.writeInt(this.f3094d);
        parcel.writeInt(this.f3095e);
        parcel.writeString(this.f3096f);
        parcel.writeInt(this.f3097g ? 1 : 0);
        parcel.writeInt(this.f3098h ? 1 : 0);
        parcel.writeInt(this.f3099i ? 1 : 0);
        parcel.writeBundle(this.f3100j);
        parcel.writeInt(this.f3101k ? 1 : 0);
        parcel.writeBundle(this.f3103m);
        parcel.writeInt(this.f3102l);
    }

    FragmentState(Parcel parcel) {
        this.f3091a = parcel.readString();
        this.f3092b = parcel.readString();
        this.f3093c = parcel.readInt() != 0;
        this.f3094d = parcel.readInt();
        this.f3095e = parcel.readInt();
        this.f3096f = parcel.readString();
        this.f3097g = parcel.readInt() != 0;
        this.f3098h = parcel.readInt() != 0;
        this.f3099i = parcel.readInt() != 0;
        this.f3100j = parcel.readBundle();
        this.f3101k = parcel.readInt() != 0;
        this.f3103m = parcel.readBundle();
        this.f3102l = parcel.readInt();
    }
}
