package com.xuexiang.xui.widget.banner.recycler.layout;

import android.os.Parcel;
import android.os.Parcelable;
import com.xuexiang.xui.widget.banner.recycler.layout.BannerLayoutManager;

/* renamed from: com.xuexiang.xui.widget.banner.recycler.layout.a */
/* loaded from: classes3.dex */
public final class C4160a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        BannerLayoutManager.SavedState savedState = new BannerLayoutManager.SavedState();
        savedState.f4004a = parcel.readInt();
        savedState.f4005b = parcel.readFloat();
        savedState.f4006c = parcel.readInt() == 1;
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new BannerLayoutManager.SavedState[i];
    }
}
