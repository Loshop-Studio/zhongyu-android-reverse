package com.xuexiang.xui.widget.progress.ratingbar;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes2.dex */
class SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<SavedState> CREATOR = new C3634a();

    /* renamed from: a */
    public float f3918a;

    /* renamed from: com.xuexiang.xui.widget.progress.ratingbar.SavedState$a */
    public static class C3634a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SavedState createFromParcel(Parcel parcel) {
            return new SavedState(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public SavedState[] newArray(int i4) {
            return new SavedState[i4];
        }
    }

    public /* synthetic */ SavedState(Parcel parcel, C3634a c3634a) {
        this(parcel);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeFloat(this.f3918a);
    }

    public SavedState(Parcel parcel) {
        super(parcel);
        this.f3918a = parcel.readFloat();
    }
}
