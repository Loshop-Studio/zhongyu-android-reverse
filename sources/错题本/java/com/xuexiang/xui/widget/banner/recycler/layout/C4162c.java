package com.xuexiang.xui.widget.banner.recycler.layout;

import android.os.Parcel;
import android.os.Parcelable;
import com.xuexiang.xui.widget.banner.recycler.layout.OverFlyingLayoutManager;

/* renamed from: com.xuexiang.xui.widget.banner.recycler.layout.c */
/* loaded from: classes3.dex */
public final class C4162c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        OverFlyingLayoutManager.SavedState savedState = new OverFlyingLayoutManager.SavedState();
        savedState.f4019a = parcel.readInt();
        savedState.f4020b = parcel.readFloat();
        savedState.f4021c = parcel.readInt() == 1;
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new OverFlyingLayoutManager.SavedState[i];
    }
}
