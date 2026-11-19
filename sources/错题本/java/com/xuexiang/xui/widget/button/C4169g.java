package com.xuexiang.xui.widget.button;

import android.os.Parcel;
import android.os.Parcelable;
import com.xuexiang.xui.widget.button.SwitchIconView;

/* renamed from: com.xuexiang.xui.widget.button.g */
/* loaded from: classes3.dex */
public final class C4169g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        SwitchIconView.SwitchIconSavedState switchIconSavedState = new SwitchIconView.SwitchIconSavedState(parcel);
        switchIconSavedState.f4132a = parcel.readInt() == 1;
        return switchIconSavedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new SwitchIconView.SwitchIconSavedState[i];
    }
}
