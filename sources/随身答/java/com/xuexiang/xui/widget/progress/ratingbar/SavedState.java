package com.xuexiang.xui.widget.progress.ratingbar;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes4.dex */
class SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<SavedState> CREATOR = new C6915a();

    /* renamed from: a */
    public float f7988a;

    /* renamed from: com.xuexiang.xui.widget.progress.ratingbar.SavedState$a */
    public static class C6915a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SavedState createFromParcel(Parcel parcel) {
            return new SavedState(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public SavedState[] newArray(int i9) {
            return new SavedState[i9];
        }
    }

    public /* synthetic */ SavedState(Parcel parcel, C6915a c6915a) {
        this(parcel);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        super.writeToParcel(parcel, i9);
        parcel.writeFloat(this.f7988a);
    }

    public SavedState(Parcel parcel) {
        super(parcel);
        this.f7988a = parcel.readFloat();
    }
}
