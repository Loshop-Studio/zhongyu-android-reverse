package com.xuexiang.xui.widget.progress.ratingbar;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.xuexiang.xui.widget.progress.ratingbar.c */
/* loaded from: classes3.dex */
public final class C4209c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        SavedState savedState = new SavedState(parcel);
        savedState.f4824a = parcel.readFloat();
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new SavedState[i];
    }
}
