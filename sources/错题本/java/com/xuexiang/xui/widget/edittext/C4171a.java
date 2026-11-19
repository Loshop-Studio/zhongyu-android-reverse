package com.xuexiang.xui.widget.edittext;

import android.os.Parcel;
import android.os.Parcelable;
import com.xuexiang.xui.widget.edittext.PasswordEditText;

/* renamed from: com.xuexiang.xui.widget.edittext.a */
/* loaded from: classes3.dex */
public final class C4171a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new PasswordEditText.SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new PasswordEditText.SavedState[i];
    }
}
