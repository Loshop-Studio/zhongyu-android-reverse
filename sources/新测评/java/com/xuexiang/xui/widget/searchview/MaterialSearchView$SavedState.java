package com.xuexiang.xui.widget.searchview;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes4.dex */
class MaterialSearchView$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<MaterialSearchView$SavedState> CREATOR = new C6596a();

    /* renamed from: a */
    public String f6731a;

    /* renamed from: b */
    public boolean f6732b;

    /* renamed from: com.xuexiang.xui.widget.searchview.MaterialSearchView$SavedState$a */
    public static class C6596a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MaterialSearchView$SavedState createFromParcel(Parcel parcel) {
            return new MaterialSearchView$SavedState(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MaterialSearchView$SavedState[] newArray(int i10) {
            return new MaterialSearchView$SavedState[i10];
        }
    }

    public /* synthetic */ MaterialSearchView$SavedState(Parcel parcel, AbstractC6597a abstractC6597a) {
        this(parcel);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f6731a);
        parcel.writeInt(this.f6732b ? 1 : 0);
    }

    public MaterialSearchView$SavedState(Parcel parcel) {
        super(parcel);
        this.f6731a = parcel.readString();
        this.f6732b = parcel.readInt() == 1;
    }
}
