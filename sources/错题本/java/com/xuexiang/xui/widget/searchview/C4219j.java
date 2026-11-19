package com.xuexiang.xui.widget.searchview;

import android.os.Parcel;
import android.os.Parcelable;
import com.xuexiang.xui.widget.searchview.MaterialSearchView;

/* renamed from: com.xuexiang.xui.widget.searchview.j */
/* loaded from: classes3.dex */
public final class C4219j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        MaterialSearchView.SavedState savedState = new MaterialSearchView.SavedState(parcel);
        savedState.f4851a = parcel.readString();
        savedState.f4852b = parcel.readInt() == 1;
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new MaterialSearchView.SavedState[i];
    }
}
