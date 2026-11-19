package com.xuexiang.xui.widget.progress.ratingbar;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes5.dex */
class SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<SavedState> CREATOR = new C8236a();

    /* renamed from: c */
    public float f16893c;

    /* renamed from: com.xuexiang.xui.widget.progress.ratingbar.SavedState$a */
    public static class C8236a implements Parcelable.Creator {
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

    public /* synthetic */ SavedState(Parcel parcel, C8236a c8236a) {
        this(parcel);
    }

    /* renamed from: a */
    public float m13174a() {
        return this.f16893c;
    }

    /* renamed from: b */
    public void m13175b(float f10) {
        this.f16893c = f10;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeFloat(this.f16893c);
    }

    public SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public SavedState(Parcel parcel) {
        super(parcel);
        this.f16893c = parcel.readFloat();
    }
}
