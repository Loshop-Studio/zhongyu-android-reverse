package com.xuexiang.xui.widget.button.switchbutton;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.xuexiang.xui.widget.button.switchbutton.SwitchButton;

/* renamed from: com.xuexiang.xui.widget.button.switchbutton.a */
/* loaded from: classes3.dex */
public final class C4170a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        SwitchButton.SavedState savedState = new SwitchButton.SavedState(parcel);
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        savedState.f4248a = (CharSequence) creator.createFromParcel(parcel);
        savedState.f4249b = (CharSequence) creator.createFromParcel(parcel);
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new SwitchButton.SavedState[i];
    }
}
