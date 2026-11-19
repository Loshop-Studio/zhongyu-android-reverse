package com.xuexiang.xui.widget.searchview;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes3.dex */
class MaterialSearchView$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<MaterialSearchView$SavedState> CREATOR = new C5974a();

    /* renamed from: a */
    public String f5440a;

    /* renamed from: b */
    public boolean f5441b;

    /* renamed from: com.xuexiang.xui.widget.searchview.MaterialSearchView$SavedState$a */
    public static class C5974a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MaterialSearchView$SavedState createFromParcel(Parcel parcel) {
            return new MaterialSearchView$SavedState(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MaterialSearchView$SavedState[] newArray(int i6) {
            return new MaterialSearchView$SavedState[i6];
        }
    }

    public /* synthetic */ MaterialSearchView$SavedState(Parcel parcel, AbstractC5975a abstractC5975a) {
        this(parcel);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        super.writeToParcel(parcel, i6);
        parcel.writeString(this.f5440a);
        parcel.writeInt(this.f5441b ? 1 : 0);
    }

    public MaterialSearchView$SavedState(Parcel parcel) {
        super(parcel);
        this.f5440a = parcel.readString();
        this.f5441b = parcel.readInt() == 1;
    }
}
