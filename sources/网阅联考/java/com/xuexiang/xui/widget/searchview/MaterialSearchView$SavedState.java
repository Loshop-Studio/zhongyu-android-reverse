package com.xuexiang.xui.widget.searchview;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes2.dex */
class MaterialSearchView$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<MaterialSearchView$SavedState> CREATOR = new C3635a();

    /* renamed from: a */
    public String f3919a;

    /* renamed from: b */
    public boolean f3920b;

    /* renamed from: com.xuexiang.xui.widget.searchview.MaterialSearchView$SavedState$a */
    public static class C3635a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MaterialSearchView$SavedState createFromParcel(Parcel parcel) {
            return new MaterialSearchView$SavedState(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MaterialSearchView$SavedState[] newArray(int i4) {
            return new MaterialSearchView$SavedState[i4];
        }
    }

    public /* synthetic */ MaterialSearchView$SavedState(Parcel parcel, AbstractC3636a abstractC3636a) {
        this(parcel);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeString(this.f3919a);
        parcel.writeInt(this.f3920b ? 1 : 0);
    }

    public MaterialSearchView$SavedState(Parcel parcel) {
        super(parcel);
        this.f3919a = parcel.readString();
        this.f3920b = parcel.readInt() == 1;
    }
}
