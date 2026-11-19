package com.xuexiang.xui.widget.searchview;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes4.dex */
class MaterialSearchView$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<MaterialSearchView$SavedState> CREATOR = new C6916a();

    /* renamed from: a */
    public String f7989a;

    /* renamed from: b */
    public boolean f7990b;

    /* renamed from: com.xuexiang.xui.widget.searchview.MaterialSearchView$SavedState$a */
    public static class C6916a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MaterialSearchView$SavedState createFromParcel(Parcel parcel) {
            return new MaterialSearchView$SavedState(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MaterialSearchView$SavedState[] newArray(int i9) {
            return new MaterialSearchView$SavedState[i9];
        }
    }

    public /* synthetic */ MaterialSearchView$SavedState(Parcel parcel, AbstractC6917a abstractC6917a) {
        this(parcel);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        super.writeToParcel(parcel, i9);
        parcel.writeString(this.f7989a);
        parcel.writeInt(this.f7990b ? 1 : 0);
    }

    public MaterialSearchView$SavedState(Parcel parcel) {
        super(parcel);
        this.f7989a = parcel.readString();
        this.f7990b = parcel.readInt() == 1;
    }
}
