package com.xuexiang.xui.widget.progress.ratingbar;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes4.dex */
class SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<SavedState> CREATOR = new C6595a();

    /* renamed from: a */
    public float f6730a;

    /* renamed from: com.xuexiang.xui.widget.progress.ratingbar.SavedState$a */
    public static class C6595a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SavedState createFromParcel(Parcel parcel) {
            return new SavedState(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public SavedState[] newArray(int i10) {
            return new SavedState[i10];
        }
    }

    public /* synthetic */ SavedState(Parcel parcel, C6595a c6595a) {
        this(parcel);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeFloat(this.f6730a);
    }

    public SavedState(Parcel parcel) {
        super(parcel);
        this.f6730a = parcel.readFloat();
    }
}
